// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountBalanceMonitorServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledger account balance monitors. */
class LedgerAccountBalanceMonitorListPageAsync
private constructor(
    private val ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorServiceAsync,
    private val params: LedgerAccountBalanceMonitorListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountBalanceMonitor>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccountBalanceMonitor> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountBalanceMonitorListPageAsync && ledgerAccountBalanceMonitorsService == other.ledgerAccountBalanceMonitorsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountBalanceMonitorsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountBalanceMonitorListPageAsync{ledgerAccountBalanceMonitorsService=$ledgerAccountBalanceMonitorsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerAccountBalanceMonitorListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerAccountBalanceMonitorListPageAsync? {
        return getNextPageParams()?.let { ledgerAccountBalanceMonitorsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorServiceAsync,
            params: LedgerAccountBalanceMonitorListParams,
            headers: Headers,
            items: List<LedgerAccountBalanceMonitor>,
        ) =
            LedgerAccountBalanceMonitorListPageAsync(
                ledgerAccountBalanceMonitorsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: LedgerAccountBalanceMonitorListPageAsync) :
        Flow<LedgerAccountBalanceMonitor> {

        override suspend fun collect(collector: FlowCollector<LedgerAccountBalanceMonitor>) {
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
