// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.EventServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list events */
class EventListPageAsync
private constructor(
    private val eventsService: EventServiceAsync,
    private val params: EventListParams,
    private val headers: Headers,
    private val items: List<Event>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Event> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListPageAsync && eventsService == other.eventsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, items) /* spotless:on */

    override fun toString() =
        "EventListPageAsync{eventsService=$eventsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): EventListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): EventListPageAsync? {
        return getNextPageParams()?.let { eventsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            eventsService: EventServiceAsync,
            params: EventListParams,
            headers: Headers,
            items: List<Event>,
        ) = EventListPageAsync(eventsService, params, headers, items)
    }

    class AutoPager(private val firstPage: EventListPageAsync) : Flow<Event> {

        override suspend fun collect(collector: FlowCollector<Event>) {
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
