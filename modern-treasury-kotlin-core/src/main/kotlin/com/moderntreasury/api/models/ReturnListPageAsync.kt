// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ReturnServiceAsync
import java.util.Objects

/** @see ReturnServiceAsync.list */
class ReturnListPageAsync
private constructor(
    private val service: ReturnServiceAsync,
    private val params: ReturnListParams,
    private val headers: Headers,
    private val items: List<ReturnObject>,
) : PageAsync<ReturnObject> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): ReturnListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): ReturnListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ReturnObject> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReturnListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ReturnObject> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReturnListPageAsync].
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

    /** A builder for [ReturnListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReturnServiceAsync? = null
        private var params: ReturnListParams? = null
        private var headers: Headers? = null
        private var items: List<ReturnObject>? = null

        internal fun from(returnListPageAsync: ReturnListPageAsync) = apply {
            service = returnListPageAsync.service
            params = returnListPageAsync.params
            headers = returnListPageAsync.headers
            items = returnListPageAsync.items
        }

        fun service(service: ReturnServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReturnListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ReturnObject>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ReturnListPageAsync].
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
        fun build(): ReturnListPageAsync =
            ReturnListPageAsync(
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

        return other is ReturnListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "ReturnListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
