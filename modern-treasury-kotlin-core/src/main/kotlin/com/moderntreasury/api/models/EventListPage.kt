// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.EventService
import java.util.Objects

/** list events */
class EventListPage
private constructor(
    private val eventsService: EventService,
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

        return /* spotless:off */ other is EventListPage && eventsService == other.eventsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, items) /* spotless:on */

    override fun toString() =
        "EventListPage{eventsService=$eventsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): EventListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): EventListPage? {
        return getNextPageParams()?.let { eventsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            eventsService: EventService,
            params: EventListParams,
            headers: Headers,
            items: List<Event>,
        ) = EventListPage(eventsService, params, headers, items)
    }

    class AutoPager(private val firstPage: EventListPage) : Sequence<Event> {

        override fun iterator(): Iterator<Event> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
