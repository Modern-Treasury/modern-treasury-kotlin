// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ReturnService
import java.util.Objects

/** Get a list of returns. */
class ReturnListPage
private constructor(
    private val returnsService: ReturnService,
    private val params: ReturnListParams,
    private val headers: Headers,
    private val items: List<ReturnObject>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ReturnObject> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnListPage && returnsService == other.returnsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(returnsService, params, items) /* spotless:on */

    override fun toString() =
        "ReturnListPage{returnsService=$returnsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ReturnListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): ReturnListPage? {
        return getNextPageParams()?.let { returnsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            returnsService: ReturnService,
            params: ReturnListParams,
            headers: Headers,
            items: List<ReturnObject>,
        ) = ReturnListPage(returnsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ReturnListPage) : Sequence<ReturnObject> {

        override fun iterator(): Iterator<ReturnObject> = iterator {
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
