// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.InvoiceService
import java.util.Objects

/** list invoices */
class InvoiceListPage
private constructor(
    private val invoicesService: InvoiceService,
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

        return /* spotless:off */ other is InvoiceListPage && invoicesService == other.invoicesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, items) /* spotless:on */

    override fun toString() =
        "InvoiceListPage{invoicesService=$invoicesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): InvoiceListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): InvoiceListPage? {
        return getNextPageParams()?.let { invoicesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            invoicesService: InvoiceService,
            params: InvoiceListParams,
            headers: Headers,
            items: List<Invoice>,
        ) = InvoiceListPage(invoicesService, params, headers, items)
    }

    class AutoPager(private val firstPage: InvoiceListPage) : Sequence<Invoice> {

        override fun iterator(): Iterator<Invoice> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
