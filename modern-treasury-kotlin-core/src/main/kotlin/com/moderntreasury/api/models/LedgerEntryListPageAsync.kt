// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerEntryServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all ledger entries. */
class LedgerEntryListPageAsync
private constructor(
    private val ledgerEntriesService: LedgerEntryServiceAsync,
    private val params: LedgerEntryListParams,
    private val headers: Headers,
    private val items: List<LedgerEntry>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerEntry> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEntryListPageAsync && ledgerEntriesService == other.ledgerEntriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEntriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEntryListPageAsync{ledgerEntriesService=$ledgerEntriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerEntryListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerEntryListPageAsync? {
        return getNextPageParams()?.let { ledgerEntriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerEntriesService: LedgerEntryServiceAsync,
            params: LedgerEntryListParams,
            headers: Headers,
            items: List<LedgerEntry>,
        ) = LedgerEntryListPageAsync(ledgerEntriesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEntryListPageAsync) : Flow<LedgerEntry> {

        override suspend fun collect(collector: FlowCollector<LedgerEntry>) {
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
