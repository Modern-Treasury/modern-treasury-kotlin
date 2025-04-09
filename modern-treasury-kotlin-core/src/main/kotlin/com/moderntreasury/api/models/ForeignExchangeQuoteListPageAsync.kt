// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ForeignExchangeQuoteServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list foreign_exchange_quotes */
class ForeignExchangeQuoteListPageAsync
private constructor(
    private val foreignExchangeQuotesService: ForeignExchangeQuoteServiceAsync,
    private val params: ForeignExchangeQuoteListParams,
    private val headers: Headers,
    private val items: List<ForeignExchangeQuote>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ForeignExchangeQuote> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteListPageAsync && foreignExchangeQuotesService == other.foreignExchangeQuotesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(foreignExchangeQuotesService, params, items) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListPageAsync{foreignExchangeQuotesService=$foreignExchangeQuotesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ForeignExchangeQuoteListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): ForeignExchangeQuoteListPageAsync? {
        return getNextPageParams()?.let { foreignExchangeQuotesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            foreignExchangeQuotesService: ForeignExchangeQuoteServiceAsync,
            params: ForeignExchangeQuoteListParams,
            headers: Headers,
            items: List<ForeignExchangeQuote>,
        ) = ForeignExchangeQuoteListPageAsync(foreignExchangeQuotesService, params, headers, items)
    }

    class AutoPager(private val firstPage: ForeignExchangeQuoteListPageAsync) :
        Flow<ForeignExchangeQuote> {

        override suspend fun collect(collector: FlowCollector<ForeignExchangeQuote>) {
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
