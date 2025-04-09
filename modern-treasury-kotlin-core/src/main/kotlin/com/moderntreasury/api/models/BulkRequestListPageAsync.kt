// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkRequestServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list bulk_requests */
class BulkRequestListPageAsync
private constructor(
    private val bulkRequestsService: BulkRequestServiceAsync,
    private val params: BulkRequestListParams,
    private val headers: Headers,
    private val items: List<BulkRequest>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BulkRequest> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestListPageAsync && bulkRequestsService == other.bulkRequestsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bulkRequestsService, params, items) /* spotless:on */

    override fun toString() =
        "BulkRequestListPageAsync{bulkRequestsService=$bulkRequestsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): BulkRequestListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): BulkRequestListPageAsync? {
        return getNextPageParams()?.let { bulkRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            bulkRequestsService: BulkRequestServiceAsync,
            params: BulkRequestListParams,
            headers: Headers,
            items: List<BulkRequest>,
        ) = BulkRequestListPageAsync(bulkRequestsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BulkRequestListPageAsync) : Flow<BulkRequest> {

        override suspend fun collect(collector: FlowCollector<BulkRequest>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
