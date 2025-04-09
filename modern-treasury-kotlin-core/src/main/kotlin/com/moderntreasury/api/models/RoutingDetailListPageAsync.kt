// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.RoutingDetailServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of routing details for a single internal or external account. */
class RoutingDetailListPageAsync
private constructor(
    private val routingDetailsService: RoutingDetailServiceAsync,
    private val params: RoutingDetailListParams,
    private val headers: Headers,
    private val items: List<RoutingDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<RoutingDetail> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingDetailListPageAsync && routingDetailsService == other.routingDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routingDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "RoutingDetailListPageAsync{routingDetailsService=$routingDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): RoutingDetailListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): RoutingDetailListPageAsync? {
        return getNextPageParams()?.let { routingDetailsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            routingDetailsService: RoutingDetailServiceAsync,
            params: RoutingDetailListParams,
            headers: Headers,
            items: List<RoutingDetail>,
        ) = RoutingDetailListPageAsync(routingDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: RoutingDetailListPageAsync) : Flow<RoutingDetail> {

        override suspend fun collect(collector: FlowCollector<RoutingDetail>) {
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
