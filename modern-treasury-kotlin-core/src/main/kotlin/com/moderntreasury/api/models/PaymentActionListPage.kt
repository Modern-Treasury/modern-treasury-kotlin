// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaymentActionService
import java.util.Objects

/** @see [PaymentActionService.list] */
class PaymentActionListPage
private constructor(
    private val service: PaymentActionService,
    private val params: PaymentActionListParams,
    private val headers: Headers,
    private val items: List<PaymentActionListResponse>,
) : Page<PaymentActionListResponse> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PaymentActionListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): PaymentActionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PaymentActionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentActionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentActionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentActionListPage].
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

    /** A builder for [PaymentActionListPage]. */
    class Builder internal constructor() {

        private var service: PaymentActionService? = null
        private var params: PaymentActionListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentActionListResponse>? = null

        internal fun from(paymentActionListPage: PaymentActionListPage) = apply {
            service = paymentActionListPage.service
            params = paymentActionListPage.params
            headers = paymentActionListPage.headers
            items = paymentActionListPage.items
        }

        fun service(service: PaymentActionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentActionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentActionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentActionListPage].
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
        fun build(): PaymentActionListPage =
            PaymentActionListPage(
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

        return /* spotless:off */ other is PaymentActionListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentActionListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
