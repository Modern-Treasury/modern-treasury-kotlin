// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ExpectedPaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list expected_payments */
class ExpectedPaymentListPageAsync
private constructor(
    private val expectedPaymentsService: ExpectedPaymentServiceAsync,
    private val params: ExpectedPaymentListParams,
    private val headers: Headers,
    private val items: List<ExpectedPayment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ExpectedPayment> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentListPageAsync && expectedPaymentsService == other.expectedPaymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(expectedPaymentsService, params, items) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentListPageAsync{expectedPaymentsService=$expectedPaymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ExpectedPaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): ExpectedPaymentListPageAsync? {
        return getNextPageParams()?.let { expectedPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            expectedPaymentsService: ExpectedPaymentServiceAsync,
            params: ExpectedPaymentListParams,
            headers: Headers,
            items: List<ExpectedPayment>,
        ) = ExpectedPaymentListPageAsync(expectedPaymentsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ExpectedPaymentListPageAsync) : Flow<ExpectedPayment> {

        override suspend fun collect(collector: FlowCollector<ExpectedPayment>) {
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
