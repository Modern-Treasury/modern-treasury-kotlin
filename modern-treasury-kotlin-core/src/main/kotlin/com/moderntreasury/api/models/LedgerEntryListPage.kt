// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerEntryService
import java.util.Objects

/** Get a list of all ledger entries. */
class LedgerEntryListPage
private constructor(
    private val ledgerEntriesService: LedgerEntryService,
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

        return /* spotless:off */ other is LedgerEntryListPage && ledgerEntriesService == other.ledgerEntriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEntriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEntryListPage{ledgerEntriesService=$ledgerEntriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerEntryListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerEntryListPage? {
        return getNextPageParams()?.let { ledgerEntriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerEntriesService: LedgerEntryService,
            params: LedgerEntryListParams,
            headers: Headers,
            items: List<LedgerEntry>,
        ) = LedgerEntryListPage(ledgerEntriesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEntryListPage) : Sequence<LedgerEntry> {

        override fun iterator(): Iterator<LedgerEntry> = iterator {
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
