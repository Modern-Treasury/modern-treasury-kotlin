// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LineItemServiceAsync
import java.util.Objects

/** @see [LineItemServiceAsync.list] */
class LineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val params: LineItemListParams,
    private val headers: Headers,
    private val items: List<LineItem>,
) : PageAsync<LineItem> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LineItemListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): LineItemListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LineItem> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LineItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LineItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LineItemListPageAsync].
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

    /** A builder for [LineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var params: LineItemListParams? = null
        private var headers: Headers? = null
        private var items: List<LineItem>? = null

        internal fun from(lineItemListPageAsync: LineItemListPageAsync) = apply {
            service = lineItemListPageAsync.service
            params = lineItemListPageAsync.params
            headers = lineItemListPageAsync.headers
            items = lineItemListPageAsync.items
        }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LineItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LineItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LineItemListPageAsync].
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
        fun build(): LineItemListPageAsync =
            LineItemListPageAsync(
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

        return /* spotless:off */ other is LineItemListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LineItemListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
