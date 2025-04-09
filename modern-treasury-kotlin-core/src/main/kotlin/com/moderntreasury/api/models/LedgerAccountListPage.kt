// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountService
import java.util.Objects

/** Get a list of ledger accounts. */
class LedgerAccountListPage
private constructor(
    private val ledgerAccountsService: LedgerAccountService,
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

        return /* spotless:off */ other is LedgerAccountListPage && ledgerAccountsService == other.ledgerAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountListPage{ledgerAccountsService=$ledgerAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerAccountListPage? {
        return getNextPageParams()?.let { ledgerAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerAccountsService: LedgerAccountService,
            params: LedgerAccountListParams,
            headers: Headers,
            items: List<LedgerAccount>,
        ) = LedgerAccountListPage(ledgerAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountListPage) : Sequence<LedgerAccount> {

        override fun iterator(): Iterator<LedgerAccount> = iterator {
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
