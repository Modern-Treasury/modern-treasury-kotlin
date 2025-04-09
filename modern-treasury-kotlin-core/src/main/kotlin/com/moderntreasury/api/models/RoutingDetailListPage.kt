// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.RoutingDetailService
import java.util.Objects

/** Get a list of routing details for a single internal or external account. */
class RoutingDetailListPage
private constructor(
    private val routingDetailsService: RoutingDetailService,
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

        return /* spotless:off */ other is RoutingDetailListPage && routingDetailsService == other.routingDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routingDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "RoutingDetailListPage{routingDetailsService=$routingDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): RoutingDetailListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): RoutingDetailListPage? {
        return getNextPageParams()?.let { routingDetailsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            routingDetailsService: RoutingDetailService,
            params: RoutingDetailListParams,
            headers: Headers,
            items: List<RoutingDetail>,
        ) = RoutingDetailListPage(routingDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: RoutingDetailListPage) : Sequence<RoutingDetail> {

        override fun iterator(): Iterator<RoutingDetail> = iterator {
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
