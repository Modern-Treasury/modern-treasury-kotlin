// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaymentOrderService
import java.util.Objects

/** @see PaymentOrderService.list */
class PaymentOrderListPage
private constructor(
    private val service: PaymentOrderService,
    private val params: PaymentOrderListParams,
    private val headers: Headers,
    private val items: List<PaymentOrder>,
) : Page<PaymentOrder> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): PaymentOrderListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): PaymentOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PaymentOrder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentOrderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentOrder> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentOrderListPage].
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

    /** A builder for [PaymentOrderListPage]. */
    class Builder internal constructor() {

        private var service: PaymentOrderService? = null
        private var params: PaymentOrderListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentOrder>? = null

        internal fun from(paymentOrderListPage: PaymentOrderListPage) = apply {
            service = paymentOrderListPage.service
            params = paymentOrderListPage.params
            headers = paymentOrderListPage.headers
            items = paymentOrderListPage.items
        }

        fun service(service: PaymentOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentOrderListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentOrder>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentOrderListPage].
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
        fun build(): PaymentOrderListPage =
            PaymentOrderListPage(
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

        return /* spotless:off */ other is PaymentOrderListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
