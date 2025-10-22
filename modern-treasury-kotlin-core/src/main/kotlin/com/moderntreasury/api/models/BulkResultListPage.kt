// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.BulkResultService
import java.util.Objects

/** @see BulkResultService.list */
class BulkResultListPage
private constructor(
    private val service: BulkResultService,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) : Page<BulkResult> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): BulkResultListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): BulkResultListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BulkResult> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BulkResultListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BulkResult> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkResultListPage].
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

    /** A builder for [BulkResultListPage]. */
    class Builder internal constructor() {

        private var service: BulkResultService? = null
        private var params: BulkResultListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkResult>? = null

        internal fun from(bulkResultListPage: BulkResultListPage) = apply {
            service = bulkResultListPage.service
            params = bulkResultListPage.params
            headers = bulkResultListPage.headers
            items = bulkResultListPage.items
        }

        fun service(service: BulkResultService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BulkResultListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkResult>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkResultListPage].
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
        fun build(): BulkResultListPage =
            BulkResultListPage(
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

        return other is BulkResultListPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "BulkResultListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
