// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ExpectedPaymentService
import java.util.Objects

/** @see [ExpectedPaymentService.list] */
class ExpectedPaymentListPage
private constructor(
    private val service: ExpectedPaymentService,
    private val params: ExpectedPaymentListParams,
    private val headers: Headers,
    private val items: List<ExpectedPayment>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ExpectedPaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): ExpectedPaymentListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExpectedPaymentListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<ExpectedPayment> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExpectedPaymentListPage].
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

    /** A builder for [ExpectedPaymentListPage]. */
    class Builder internal constructor() {

        private var service: ExpectedPaymentService? = null
        private var params: ExpectedPaymentListParams? = null
        private var headers: Headers? = null
        private var items: List<ExpectedPayment>? = null

        internal fun from(expectedPaymentListPage: ExpectedPaymentListPage) = apply {
            service = expectedPaymentListPage.service
            params = expectedPaymentListPage.params
            headers = expectedPaymentListPage.headers
            items = expectedPaymentListPage.items
        }

        fun service(service: ExpectedPaymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExpectedPaymentListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ExpectedPayment>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ExpectedPaymentListPage].
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
        fun build(): ExpectedPaymentListPage =
            ExpectedPaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: ExpectedPaymentListPage) : Sequence<ExpectedPayment> {

        override fun iterator(): Iterator<ExpectedPayment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
