// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkResultServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list bulk_results */
class BulkResultListPageAsync
private constructor(
    private val bulkResultsService: BulkResultServiceAsync,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BulkResult> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkResultListPageAsync && bulkResultsService == other.bulkResultsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bulkResultsService, params, items) /* spotless:on */

    override fun toString() =
        "BulkResultListPageAsync{bulkResultsService=$bulkResultsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): BulkResultListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): BulkResultListPageAsync? {
        return getNextPageParams()?.let { bulkResultsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            bulkResultsService: BulkResultServiceAsync,
            params: BulkResultListParams,
            headers: Headers,
            items: List<BulkResult>,
        ) = BulkResultListPageAsync(bulkResultsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BulkResultListPageAsync) : Flow<BulkResult> {

        override suspend fun collect(collector: FlowCollector<BulkResult>) {
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
