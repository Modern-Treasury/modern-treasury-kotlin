// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaymentReferenceService
import java.util.Objects

/** @see [PaymentReferenceService.list] */
class PaymentReferenceListPage
private constructor(
    private val service: PaymentReferenceService,
    private val params: PaymentReferenceListParams,
    private val headers: Headers,
    private val items: List<PaymentReference>,
) : Page<PaymentReference> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): PaymentReferenceListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): PaymentReferenceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PaymentReference> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentReferenceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentReference> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentReferenceListPage].
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

    /** A builder for [PaymentReferenceListPage]. */
    class Builder internal constructor() {

        private var service: PaymentReferenceService? = null
        private var params: PaymentReferenceListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentReference>? = null

        internal fun from(paymentReferenceListPage: PaymentReferenceListPage) = apply {
            service = paymentReferenceListPage.service
            params = paymentReferenceListPage.params
            headers = paymentReferenceListPage.headers
            items = paymentReferenceListPage.items
        }

        fun service(service: PaymentReferenceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentReferenceListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentReference>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentReferenceListPage].
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
        fun build(): PaymentReferenceListPage =
            PaymentReferenceListPage(
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

        return /* spotless:off */ other is PaymentReferenceListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentReferenceListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
