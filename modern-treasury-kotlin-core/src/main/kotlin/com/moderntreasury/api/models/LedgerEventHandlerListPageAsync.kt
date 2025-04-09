// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerEventHandlerServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of ledger event handlers. */
class LedgerEventHandlerListPageAsync
private constructor(
    private val ledgerEventHandlersService: LedgerEventHandlerServiceAsync,
    private val params: LedgerEventHandlerListParams,
    private val headers: Headers,
    private val items: List<LedgerEventHandler>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerEventHandler> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandlerListPageAsync && ledgerEventHandlersService == other.ledgerEventHandlersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEventHandlersService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerListPageAsync{ledgerEventHandlersService=$ledgerEventHandlersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerEventHandlerListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerEventHandlerListPageAsync? {
        return getNextPageParams()?.let { ledgerEventHandlersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerEventHandlersService: LedgerEventHandlerServiceAsync,
            params: LedgerEventHandlerListParams,
            headers: Headers,
            items: List<LedgerEventHandler>,
        ) = LedgerEventHandlerListPageAsync(ledgerEventHandlersService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEventHandlerListPageAsync) :
        Flow<LedgerEventHandler> {

        override suspend fun collect(collector: FlowCollector<LedgerEventHandler>) {
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
