// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledger accounts. */
class LedgerAccountListPageAsync
private constructor(
    private val ledgerAccountsService: LedgerAccountServiceAsync,
    private val params: LedgerAccountListParams,
    private val headers: Headers,
    private val items: List<LedgerAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccount> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountListPageAsync && ledgerAccountsService == other.ledgerAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountListPageAsync{ledgerAccountsService=$ledgerAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerAccountListPageAsync? {
        return getNextPageParams()?.let { ledgerAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerAccountsService: LedgerAccountServiceAsync,
            params: LedgerAccountListParams,
            headers: Headers,
            items: List<LedgerAccount>,
        ) = LedgerAccountListPageAsync(ledgerAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountListPageAsync) : Flow<LedgerAccount> {

        override suspend fun collect(collector: FlowCollector<LedgerAccount>) {
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
