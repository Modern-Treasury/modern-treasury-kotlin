// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledger transactions. */
class LedgerTransactionListPageAsync
private constructor(
    private val ledgerTransactionsService: LedgerTransactionServiceAsync,
    private val params: LedgerTransactionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransaction>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerTransaction> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionListPageAsync && ledgerTransactionsService == other.ledgerTransactionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerTransactionsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionListPageAsync{ledgerTransactionsService=$ledgerTransactionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerTransactionListPageAsync? {
        return getNextPageParams()?.let { ledgerTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerTransactionsService: LedgerTransactionServiceAsync,
            params: LedgerTransactionListParams,
            headers: Headers,
            items: List<LedgerTransaction>,
        ) = LedgerTransactionListPageAsync(ledgerTransactionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerTransactionListPageAsync) :
        Flow<LedgerTransaction> {

        override suspend fun collect(collector: FlowCollector<LedgerTransaction>) {
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
