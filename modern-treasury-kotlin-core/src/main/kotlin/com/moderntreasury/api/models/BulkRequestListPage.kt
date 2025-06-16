// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.BulkRequestService
import java.util.Objects

/** @see [BulkRequestService.list] */
class BulkRequestListPage
private constructor(
    private val service: BulkRequestService,
    private val params: BulkRequestListParams,
    private val headers: Headers,
    private val items: List<BulkRequest>,
) : Page<BulkRequest> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): BulkRequestListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): BulkRequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BulkRequest> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BulkRequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BulkRequest> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkRequestListPage].
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

    /** A builder for [BulkRequestListPage]. */
    class Builder internal constructor() {

        private var service: BulkRequestService? = null
        private var params: BulkRequestListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkRequest>? = null

        internal fun from(bulkRequestListPage: BulkRequestListPage) = apply {
            service = bulkRequestListPage.service
            params = bulkRequestListPage.params
            headers = bulkRequestListPage.headers
            items = bulkRequestListPage.items
        }

        fun service(service: BulkRequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BulkRequestListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkRequest>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkRequestListPage].
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
        fun build(): BulkRequestListPage =
            BulkRequestListPage(
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

        return /* spotless:off */ other is BulkRequestListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "BulkRequestListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
