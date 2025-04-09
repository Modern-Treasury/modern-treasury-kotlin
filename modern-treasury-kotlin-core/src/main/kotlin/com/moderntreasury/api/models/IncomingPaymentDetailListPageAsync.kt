// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.IncomingPaymentDetailServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of Incoming Payment Details. */
class IncomingPaymentDetailListPageAsync
private constructor(
    private val incomingPaymentDetailsService: IncomingPaymentDetailServiceAsync,
    private val params: IncomingPaymentDetailListParams,
    private val headers: Headers,
    private val items: List<IncomingPaymentDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IncomingPaymentDetail> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailListPageAsync && incomingPaymentDetailsService == other.incomingPaymentDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(incomingPaymentDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListPageAsync{incomingPaymentDetailsService=$incomingPaymentDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): IncomingPaymentDetailListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): IncomingPaymentDetailListPageAsync? {
        return getNextPageParams()?.let { incomingPaymentDetailsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            incomingPaymentDetailsService: IncomingPaymentDetailServiceAsync,
            params: IncomingPaymentDetailListParams,
            headers: Headers,
            items: List<IncomingPaymentDetail>,
        ) =
            IncomingPaymentDetailListPageAsync(
                incomingPaymentDetailsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: IncomingPaymentDetailListPageAsync) :
        Flow<IncomingPaymentDetail> {

        override suspend fun collect(collector: FlowCollector<IncomingPaymentDetail>) {
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
