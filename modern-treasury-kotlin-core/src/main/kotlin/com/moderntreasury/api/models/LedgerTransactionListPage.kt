// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerTransactionService
import java.util.Objects

/** Get a list of ledger transactions. */
class LedgerTransactionListPage
private constructor(
    private val ledgerTransactionsService: LedgerTransactionService,
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

        return /* spotless:off */ other is LedgerTransactionListPage && ledgerTransactionsService == other.ledgerTransactionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerTransactionsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionListPage{ledgerTransactionsService=$ledgerTransactionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerTransactionListPage? {
        return getNextPageParams()?.let { ledgerTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerTransactionsService: LedgerTransactionService,
            params: LedgerTransactionListParams,
            headers: Headers,
            items: List<LedgerTransaction>,
        ) = LedgerTransactionListPage(ledgerTransactionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerTransactionListPage) :
        Sequence<LedgerTransaction> {

        override fun iterator(): Iterator<LedgerTransaction> = iterator {
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
