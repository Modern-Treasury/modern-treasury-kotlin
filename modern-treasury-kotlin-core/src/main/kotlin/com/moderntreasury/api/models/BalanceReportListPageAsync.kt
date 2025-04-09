// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get all balance reports for a given internal account. */
class BalanceReportListPageAsync
private constructor(
    private val balanceReportsService: BalanceReportServiceAsync,
    private val params: BalanceReportListParams,
    private val headers: Headers,
    private val items: List<BalanceReport>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BalanceReport> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReportListPageAsync && balanceReportsService == other.balanceReportsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceReportsService, params, items) /* spotless:on */

    override fun toString() =
        "BalanceReportListPageAsync{balanceReportsService=$balanceReportsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): BalanceReportListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): BalanceReportListPageAsync? {
        return getNextPageParams()?.let { balanceReportsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balanceReportsService: BalanceReportServiceAsync,
            params: BalanceReportListParams,
            headers: Headers,
            items: List<BalanceReport>,
        ) = BalanceReportListPageAsync(balanceReportsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BalanceReportListPageAsync) : Flow<BalanceReport> {

        override suspend fun collect(collector: FlowCollector<BalanceReport>) {
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
