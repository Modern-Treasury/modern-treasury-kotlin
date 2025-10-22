// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentFlowServiceAsync
import java.util.Objects

/** @see PaymentFlowServiceAsync.list */
class PaymentFlowListPageAsync
private constructor(
    private val service: PaymentFlowServiceAsync,
    private val params: PaymentFlowListParams,
    private val headers: Headers,
    private val items: List<PaymentFlow>,
) : PageAsync<PaymentFlow> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): PaymentFlowListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): PaymentFlowListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentFlow> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentFlowListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentFlow> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentFlowListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentFlowListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentFlowServiceAsync? = null
        private var params: PaymentFlowListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentFlow>? = null

        internal fun from(paymentFlowListPageAsync: PaymentFlowListPageAsync) = apply {
            service = paymentFlowListPageAsync.service
            params = paymentFlowListPageAsync.params
            headers = paymentFlowListPageAsync.headers
            items = paymentFlowListPageAsync.items
        }

        fun service(service: PaymentFlowServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentFlowListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentFlow>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentFlowListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentFlowListPageAsync =
            PaymentFlowListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentFlowListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "PaymentFlowListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
