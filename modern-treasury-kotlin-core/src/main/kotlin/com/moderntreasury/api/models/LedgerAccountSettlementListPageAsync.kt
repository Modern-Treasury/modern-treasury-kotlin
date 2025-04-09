// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountSettlementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledger account settlements. */
class LedgerAccountSettlementListPageAsync
private constructor(
    private val ledgerAccountSettlementsService: LedgerAccountSettlementServiceAsync,
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

        return /* spotless:off */ other is LedgerAccountSettlementListPageAsync && ledgerAccountSettlementsService == other.ledgerAccountSettlementsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountSettlementsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementListPageAsync{ledgerAccountSettlementsService=$ledgerAccountSettlementsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerAccountSettlementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerAccountSettlementListPageAsync? {
        return getNextPageParams()?.let { ledgerAccountSettlementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerAccountSettlementsService: LedgerAccountSettlementServiceAsync,
            params: LedgerAccountSettlementListParams,
            headers: Headers,
            items: List<LedgerAccountSettlement>,
        ) =
            LedgerAccountSettlementListPageAsync(
                ledgerAccountSettlementsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: LedgerAccountSettlementListPageAsync) :
        Flow<LedgerAccountSettlement> {

        override suspend fun collect(collector: FlowCollector<LedgerAccountSettlement>) {
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
