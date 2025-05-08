// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentReferenceServiceAsync
import java.util.Objects

/** @see [PaymentReferenceServiceAsync.list] */
class PaymentReferenceListPageAsync
private constructor(
    private val service: PaymentReferenceServiceAsync,
    private val params: PaymentReferenceListParams,
    private val headers: Headers,
    private val items: List<PaymentReference>,
) : PageAsync<PaymentReference> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PaymentReferenceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): PaymentReferenceListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentReference> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentReferenceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentReference> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PaymentReferenceListPageAsync].
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

    /** A builder for [PaymentReferenceListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentReferenceServiceAsync? = null
        private var params: PaymentReferenceListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentReference>? = null

        internal fun from(paymentReferenceListPageAsync: PaymentReferenceListPageAsync) = apply {
            service = paymentReferenceListPageAsync.service
            params = paymentReferenceListPageAsync.params
            headers = paymentReferenceListPageAsync.headers
            items = paymentReferenceListPageAsync.items
        }

        fun service(service: PaymentReferenceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentReferenceListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentReference>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentReferenceListPageAsync].
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
        fun build(): PaymentReferenceListPageAsync =
            PaymentReferenceListPageAsync(
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

        return /* spotless:off */ other is PaymentReferenceListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentReferenceListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
