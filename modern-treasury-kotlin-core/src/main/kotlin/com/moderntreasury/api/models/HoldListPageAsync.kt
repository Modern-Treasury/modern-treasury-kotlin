// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.HoldServiceAsync
import java.util.Objects

/** @see HoldServiceAsync.list */
class HoldListPageAsync
private constructor(
    private val service: HoldServiceAsync,
    private val params: HoldListParams,
    private val headers: Headers,
    private val items: List<HoldListResponse>,
) : PageAsync<HoldListResponse> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): HoldListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): HoldListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<HoldListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HoldListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<HoldListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HoldListPageAsync].
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

    /** A builder for [HoldListPageAsync]. */
    class Builder internal constructor() {

        private var service: HoldServiceAsync? = null
        private var params: HoldListParams? = null
        private var headers: Headers? = null
        private var items: List<HoldListResponse>? = null

        internal fun from(holdListPageAsync: HoldListPageAsync) = apply {
            service = holdListPageAsync.service
            params = holdListPageAsync.params
            headers = holdListPageAsync.headers
            items = holdListPageAsync.items
        }

        fun service(service: HoldServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HoldListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<HoldListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HoldListPageAsync].
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
        fun build(): HoldListPageAsync =
            HoldListPageAsync(
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

        return other is HoldListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "HoldListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
