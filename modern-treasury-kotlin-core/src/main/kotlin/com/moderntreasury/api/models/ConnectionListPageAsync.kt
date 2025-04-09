// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ConnectionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all connections. */
class ConnectionListPageAsync
private constructor(
    private val connectionsService: ConnectionServiceAsync,
    private val params: ConnectionListParams,
    private val headers: Headers,
    private val items: List<Connection>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Connection> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionListPageAsync && connectionsService == other.connectionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionsService, params, items) /* spotless:on */

    override fun toString() =
        "ConnectionListPageAsync{connectionsService=$connectionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ConnectionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): ConnectionListPageAsync? {
        return getNextPageParams()?.let { connectionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            connectionsService: ConnectionServiceAsync,
            params: ConnectionListParams,
            headers: Headers,
            items: List<Connection>,
        ) = ConnectionListPageAsync(connectionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ConnectionListPageAsync) : Flow<Connection> {

        override suspend fun collect(collector: FlowCollector<Connection>) {
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
