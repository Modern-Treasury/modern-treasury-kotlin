// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.InvoiceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list invoices */
class InvoiceListPageAsync
private constructor(
    private val invoicesService: InvoiceServiceAsync,
    private val params: InvoiceListParams,
    private val headers: Headers,
    private val items: List<Invoice>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Invoice> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceListPageAsync && invoicesService == other.invoicesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, items) /* spotless:on */

    override fun toString() =
        "InvoiceListPageAsync{invoicesService=$invoicesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): InvoiceListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): InvoiceListPageAsync? {
        return getNextPageParams()?.let { invoicesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            invoicesService: InvoiceServiceAsync,
            params: InvoiceListParams,
            headers: Headers,
            items: List<Invoice>,
        ) = InvoiceListPageAsync(invoicesService, params, headers, items)
    }

    class AutoPager(private val firstPage: InvoiceListPageAsync) : Flow<Invoice> {

        override suspend fun collect(collector: FlowCollector<Invoice>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
