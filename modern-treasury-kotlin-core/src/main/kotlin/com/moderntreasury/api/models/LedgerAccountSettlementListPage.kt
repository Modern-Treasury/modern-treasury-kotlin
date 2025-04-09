// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountSettlementService
import java.util.Objects

/** Get a list of ledger account settlements. */
class LedgerAccountSettlementListPage
private constructor(
    private val ledgerAccountSettlementsService: LedgerAccountSettlementService,
    private val params: LedgerAccountSettlementListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountSettlement>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccountSettlement> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementListPage && ledgerAccountSettlementsService == other.ledgerAccountSettlementsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountSettlementsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementListPage{ledgerAccountSettlementsService=$ledgerAccountSettlementsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerAccountSettlementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerAccountSettlementListPage? {
        return getNextPageParams()?.let { ledgerAccountSettlementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerAccountSettlementsService: LedgerAccountSettlementService,
            params: LedgerAccountSettlementListParams,
            headers: Headers,
            items: List<LedgerAccountSettlement>,
        ) = LedgerAccountSettlementListPage(ledgerAccountSettlementsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountSettlementListPage) :
        Sequence<LedgerAccountSettlement> {

        override fun iterator(): Iterator<LedgerAccountSettlement> = iterator {
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
