// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService
import java.util.Objects

/** Get all balance reports for a given internal account. */
class BalanceReportListPage
private constructor(
    private val balanceReportsService: BalanceReportService,
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

        return /* spotless:off */ other is BalanceReportListPage && balanceReportsService == other.balanceReportsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceReportsService, params, items) /* spotless:on */

    override fun toString() =
        "BalanceReportListPage{balanceReportsService=$balanceReportsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): BalanceReportListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): BalanceReportListPage? {
        return getNextPageParams()?.let { balanceReportsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balanceReportsService: BalanceReportService,
            params: BalanceReportListParams,
            headers: Headers,
            items: List<BalanceReport>,
        ) = BalanceReportListPage(balanceReportsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BalanceReportListPage) : Sequence<BalanceReport> {

        override fun iterator(): Iterator<BalanceReport> = iterator {
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
