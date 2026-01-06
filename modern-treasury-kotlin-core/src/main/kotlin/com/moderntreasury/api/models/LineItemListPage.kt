// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LineItemService
import java.util.Objects

/** @see LineItemService.list */
class LineItemListPage
private constructor(
    private val service: LineItemService,
    private val params: LineItemListParams,
    private val headers: Headers,
    private val items: List<LineItemListResponse>,
) : Page<LineItemListResponse> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): LineItemListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LineItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LineItemListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LineItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LineItemListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LineItemListPage].
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

    /** A builder for [LineItemListPage]. */
    class Builder internal constructor() {

        private var service: LineItemService? = null
        private var params: LineItemListParams? = null
        private var headers: Headers? = null
        private var items: List<LineItemListResponse>? = null

        internal fun from(lineItemListPage: LineItemListPage) = apply {
            service = lineItemListPage.service
            params = lineItemListPage.params
            headers = lineItemListPage.headers
            items = lineItemListPage.items
        }

        fun service(service: LineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LineItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LineItemListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LineItemListPage].
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
        fun build(): LineItemListPage =
            LineItemListPage(
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

        return other is LineItemListPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "LineItemListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
