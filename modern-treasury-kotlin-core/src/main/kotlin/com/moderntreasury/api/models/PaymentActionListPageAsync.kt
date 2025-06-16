// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentActionServiceAsync
import java.util.Objects

/** @see [PaymentActionServiceAsync.list] */
class PaymentActionListPageAsync
private constructor(
    private val service: PaymentActionServiceAsync,
    private val params: PaymentActionListParams,
    private val headers: Headers,
    private val items: List<PaymentActionListResponse>,
) : PageAsync<PaymentActionListResponse> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): PaymentActionListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): PaymentActionListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentActionListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentActionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentActionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentActionListPageAsync].
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

    /** A builder for [PaymentActionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentActionServiceAsync? = null
        private var params: PaymentActionListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentActionListResponse>? = null

        internal fun from(paymentActionListPageAsync: PaymentActionListPageAsync) = apply {
            service = paymentActionListPageAsync.service
            params = paymentActionListPageAsync.params
            headers = paymentActionListPageAsync.headers
            items = paymentActionListPageAsync.items
        }

        fun service(service: PaymentActionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentActionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentActionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentActionListPageAsync].
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
        fun build(): PaymentActionListPageAsync =
            PaymentActionListPageAsync(
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

        return /* spotless:off */ other is PaymentActionListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentActionListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
