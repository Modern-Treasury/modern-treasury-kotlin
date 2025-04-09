// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaperItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all paper items. */
class PaperItemListPageAsync
private constructor(
    private val paperItemsService: PaperItemServiceAsync,
    private val params: PaperItemListParams,
    private val headers: Headers,
    private val items: List<PaperItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaperItem> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItemListPageAsync && paperItemsService == other.paperItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paperItemsService, params, items) /* spotless:on */

    override fun toString() =
        "PaperItemListPageAsync{paperItemsService=$paperItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): PaperItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): PaperItemListPageAsync? {
        return getNextPageParams()?.let { paperItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paperItemsService: PaperItemServiceAsync,
            params: PaperItemListParams,
            headers: Headers,
            items: List<PaperItem>,
        ) = PaperItemListPageAsync(paperItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaperItemListPageAsync) : Flow<PaperItem> {

        override suspend fun collect(collector: FlowCollector<PaperItem>) {
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
