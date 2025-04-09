// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.paymentOrders.ReversalService
import java.util.Objects

/** Get a list of all reversals of a payment order. */
class PaymentOrderReversalListPage
private constructor(
    private val reversalsService: ReversalService,
    private val params: PaymentOrderReversalListParams,
    private val headers: Headers,
    private val items: List<Reversal>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Reversal> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderReversalListPage && reversalsService == other.reversalsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(reversalsService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderReversalListPage{reversalsService=$reversalsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): PaymentOrderReversalListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): PaymentOrderReversalListPage? {
        return getNextPageParams()?.let { reversalsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            reversalsService: ReversalService,
            params: PaymentOrderReversalListParams,
            headers: Headers,
            items: List<Reversal>,
        ) = PaymentOrderReversalListPage(reversalsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentOrderReversalListPage) : Sequence<Reversal> {

        override fun iterator(): Iterator<Reversal> = iterator {
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
