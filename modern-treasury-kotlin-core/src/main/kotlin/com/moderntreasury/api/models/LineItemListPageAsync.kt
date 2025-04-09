// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LineItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of line items */
class LineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
    private val params: LineItemListParams,
    private val headers: Headers,
    private val items: List<LineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LineItem> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "LineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LineItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LineItemListPageAsync? {
        return getNextPageParams()?.let { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            lineItemsService: LineItemServiceAsync,
            params: LineItemListParams,
            headers: Headers,
            items: List<LineItem>,
        ) = LineItemListPageAsync(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LineItemListPageAsync) : Flow<LineItem> {

        override suspend fun collect(collector: FlowCollector<LineItem>) {
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
