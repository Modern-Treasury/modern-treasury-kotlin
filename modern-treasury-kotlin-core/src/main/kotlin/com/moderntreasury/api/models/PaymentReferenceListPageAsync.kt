// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentReferenceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list payment_references */
class PaymentReferenceListPageAsync
private constructor(
    private val paymentReferencesService: PaymentReferenceServiceAsync,
    private val params: PaymentReferenceListParams,
    private val headers: Headers,
    private val items: List<PaymentReference>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentReference> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentReferenceListPageAsync && paymentReferencesService == other.paymentReferencesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentReferencesService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentReferenceListPageAsync{paymentReferencesService=$paymentReferencesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): PaymentReferenceListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): PaymentReferenceListPageAsync? {
        return getNextPageParams()?.let { paymentReferencesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentReferencesService: PaymentReferenceServiceAsync,
            params: PaymentReferenceListParams,
            headers: Headers,
            items: List<PaymentReference>,
        ) = PaymentReferenceListPageAsync(paymentReferencesService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentReferenceListPageAsync) : Flow<PaymentReference> {

        override suspend fun collect(collector: FlowCollector<PaymentReference>) {
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
