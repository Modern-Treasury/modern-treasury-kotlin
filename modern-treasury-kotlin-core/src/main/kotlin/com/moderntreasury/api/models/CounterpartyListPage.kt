// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.CounterpartyService
import java.util.Objects

/** Get a paginated list of all counterparties. */
class CounterpartyListPage
private constructor(
    private val counterpartiesService: CounterpartyService,
    private val params: CounterpartyListParams,
    private val headers: Headers,
    private val items: List<Counterparty>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Counterparty> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyListPage && counterpartiesService == other.counterpartiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterpartiesService, params, items) /* spotless:on */

    override fun toString() =
        "CounterpartyListPage{counterpartiesService=$counterpartiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): CounterpartyListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): CounterpartyListPage? {
        return getNextPageParams()?.let { counterpartiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            counterpartiesService: CounterpartyService,
            params: CounterpartyListParams,
            headers: Headers,
            items: List<Counterparty>,
        ) = CounterpartyListPage(counterpartiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: CounterpartyListPage) : Sequence<Counterparty> {

        override fun iterator(): Iterator<Counterparty> = iterator {
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
