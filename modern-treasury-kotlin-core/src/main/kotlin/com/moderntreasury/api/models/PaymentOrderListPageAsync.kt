// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentOrderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all payment orders */
class PaymentOrderListPageAsync
private constructor(
    private val paymentOrdersService: PaymentOrderServiceAsync,
    private val params: PaymentOrderListParams,
    private val headers: Headers,
    private val items: List<PaymentOrder>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentOrder> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderListPageAsync && paymentOrdersService == other.paymentOrdersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrdersService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderListPageAsync{paymentOrdersService=$paymentOrdersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): PaymentOrderListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): PaymentOrderListPageAsync? {
        return getNextPageParams()?.let { paymentOrdersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentOrdersService: PaymentOrderServiceAsync,
            params: PaymentOrderListParams,
            headers: Headers,
            items: List<PaymentOrder>,
        ) = PaymentOrderListPageAsync(paymentOrdersService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentOrderListPageAsync) : Flow<PaymentOrder> {

        override suspend fun collect(collector: FlowCollector<PaymentOrder>) {
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
