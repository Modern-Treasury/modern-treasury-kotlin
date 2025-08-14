// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentOrderServiceAsync
import java.util.Objects

/** @see PaymentOrderServiceAsync.list */
class PaymentOrderListPageAsync
private constructor(
    private val service: PaymentOrderServiceAsync,
    private val params: PaymentOrderListParams,
    private val headers: Headers,
    private val items: List<PaymentOrder>,
) : PageAsync<PaymentOrder> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): PaymentOrderListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): PaymentOrderListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentOrder> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentOrderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentOrder> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentOrderListPageAsync].
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

    /** A builder for [PaymentOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentOrderServiceAsync? = null
        private var params: PaymentOrderListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentOrder>? = null

        internal fun from(paymentOrderListPageAsync: PaymentOrderListPageAsync) = apply {
            service = paymentOrderListPageAsync.service
            params = paymentOrderListPageAsync.params
            headers = paymentOrderListPageAsync.headers
            items = paymentOrderListPageAsync.items
        }

        fun service(service: PaymentOrderServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentOrderListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentOrder>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentOrderListPageAsync].
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
        fun build(): PaymentOrderListPageAsync =
            PaymentOrderListPageAsync(
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

        return other is PaymentOrderListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "PaymentOrderListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
