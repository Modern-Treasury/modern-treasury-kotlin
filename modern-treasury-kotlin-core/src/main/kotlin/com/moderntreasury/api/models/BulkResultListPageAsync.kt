// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkResultServiceAsync
import java.util.Objects

/** @see [BulkResultServiceAsync.list] */
class BulkResultListPageAsync
private constructor(
    private val service: BulkResultServiceAsync,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) : PageAsync<BulkResult> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): BulkResultListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): BulkResultListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BulkResult> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BulkResultListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BulkResult> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkResultListPageAsync].
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

    /** A builder for [BulkResultListPageAsync]. */
    class Builder internal constructor() {

        private var service: BulkResultServiceAsync? = null
        private var params: BulkResultListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkResult>? = null

        internal fun from(bulkResultListPageAsync: BulkResultListPageAsync) = apply {
            service = bulkResultListPageAsync.service
            params = bulkResultListPageAsync.params
            headers = bulkResultListPageAsync.headers
            items = bulkResultListPageAsync.items
        }

        fun service(service: BulkResultServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BulkResultListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkResult>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkResultListPageAsync].
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
        fun build(): BulkResultListPageAsync =
            BulkResultListPageAsync(
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

        return /* spotless:off */ other is BulkResultListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "BulkResultListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
