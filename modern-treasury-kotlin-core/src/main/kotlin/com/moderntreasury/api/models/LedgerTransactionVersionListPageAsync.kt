// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledger transaction versions. */
class LedgerTransactionVersionListPageAsync
private constructor(
    private val versionsService: VersionServiceAsync,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerTransactionVersion> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionVersionListPageAsync && versionsService == other.versionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(versionsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionVersionListPageAsync{versionsService=$versionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerTransactionVersionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerTransactionVersionListPageAsync? {
        return getNextPageParams()?.let { versionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            versionsService: VersionServiceAsync,
            params: LedgerTransactionVersionListParams,
            headers: Headers,
            items: List<LedgerTransactionVersion>,
        ) = LedgerTransactionVersionListPageAsync(versionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerTransactionVersionListPageAsync) :
        Flow<LedgerTransactionVersion> {

        override suspend fun collect(collector: FlowCollector<LedgerTransactionVersion>) {
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
