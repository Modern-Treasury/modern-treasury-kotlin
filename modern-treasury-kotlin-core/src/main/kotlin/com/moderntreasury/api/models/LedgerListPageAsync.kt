// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledgers. */
class LedgerListPageAsync
private constructor(
    private val ledgersService: LedgerServiceAsync,
    private val params: LedgerListParams,
    private val headers: Headers,
    private val items: List<Ledger>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Ledger> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerListPageAsync && ledgersService == other.ledgersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgersService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerListPageAsync{ledgersService=$ledgersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerListPageAsync? {
        return getNextPageParams()?.let { ledgersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgersService: LedgerServiceAsync,
            params: LedgerListParams,
            headers: Headers,
            items: List<Ledger>,
        ) = LedgerListPageAsync(ledgersService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerListPageAsync) : Flow<Ledger> {

        override suspend fun collect(collector: FlowCollector<Ledger>) {
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
