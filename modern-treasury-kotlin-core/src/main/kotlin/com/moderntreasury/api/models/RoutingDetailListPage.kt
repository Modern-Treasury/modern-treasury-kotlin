// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.RoutingDetailService
import java.util.Objects

/** @see [RoutingDetailService.list] */
class RoutingDetailListPage
private constructor(
    private val service: RoutingDetailService,
    private val params: RoutingDetailListParams,
    private val headers: Headers,
    private val items: List<RoutingDetail>,
) : Page<RoutingDetail> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): RoutingDetailListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): RoutingDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RoutingDetail> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RoutingDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RoutingDetail> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingDetailListPage].
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

    /** A builder for [RoutingDetailListPage]. */
    class Builder internal constructor() {

        private var service: RoutingDetailService? = null
        private var params: RoutingDetailListParams? = null
        private var headers: Headers? = null
        private var items: List<RoutingDetail>? = null

        internal fun from(routingDetailListPage: RoutingDetailListPage) = apply {
            service = routingDetailListPage.service
            params = routingDetailListPage.params
            headers = routingDetailListPage.headers
            items = routingDetailListPage.items
        }

        fun service(service: RoutingDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoutingDetailListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<RoutingDetail>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RoutingDetailListPage].
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
        fun build(): RoutingDetailListPage =
            RoutingDetailListPage(
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

        return /* spotless:off */ other is RoutingDetailListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "RoutingDetailListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
