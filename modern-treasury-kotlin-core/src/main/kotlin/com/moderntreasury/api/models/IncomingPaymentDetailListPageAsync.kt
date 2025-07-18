// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.IncomingPaymentDetailServiceAsync
import java.util.Objects

/** @see [IncomingPaymentDetailServiceAsync.list] */
class IncomingPaymentDetailListPageAsync
private constructor(
    private val service: IncomingPaymentDetailServiceAsync,
    private val params: IncomingPaymentDetailListParams,
    private val headers: Headers,
    private val items: List<IncomingPaymentDetail>,
) : PageAsync<IncomingPaymentDetail> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): IncomingPaymentDetailListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): IncomingPaymentDetailListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IncomingPaymentDetail> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IncomingPaymentDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IncomingPaymentDetail> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IncomingPaymentDetailListPageAsync].
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

    /** A builder for [IncomingPaymentDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: IncomingPaymentDetailServiceAsync? = null
        private var params: IncomingPaymentDetailListParams? = null
        private var headers: Headers? = null
        private var items: List<IncomingPaymentDetail>? = null

        internal fun from(incomingPaymentDetailListPageAsync: IncomingPaymentDetailListPageAsync) =
            apply {
                service = incomingPaymentDetailListPageAsync.service
                params = incomingPaymentDetailListPageAsync.params
                headers = incomingPaymentDetailListPageAsync.headers
                items = incomingPaymentDetailListPageAsync.items
            }

        fun service(service: IncomingPaymentDetailServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IncomingPaymentDetailListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<IncomingPaymentDetail>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IncomingPaymentDetailListPageAsync].
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
        fun build(): IncomingPaymentDetailListPageAsync =
            IncomingPaymentDetailListPageAsync(
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

        return /* spotless:off */ other is IncomingPaymentDetailListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
