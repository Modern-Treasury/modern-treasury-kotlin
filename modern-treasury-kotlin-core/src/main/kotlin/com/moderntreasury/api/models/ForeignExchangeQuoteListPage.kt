// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ForeignExchangeQuoteService
import java.util.Objects

/** list foreign_exchange_quotes */
class ForeignExchangeQuoteListPage
private constructor(
    private val foreignExchangeQuotesService: ForeignExchangeQuoteService,
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

        return /* spotless:off */ other is ForeignExchangeQuoteListPage && foreignExchangeQuotesService == other.foreignExchangeQuotesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(foreignExchangeQuotesService, params, items) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListPage{foreignExchangeQuotesService=$foreignExchangeQuotesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ForeignExchangeQuoteListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): ForeignExchangeQuoteListPage? {
        return getNextPageParams()?.let { foreignExchangeQuotesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            foreignExchangeQuotesService: ForeignExchangeQuoteService,
            params: ForeignExchangeQuoteListParams,
            headers: Headers,
            items: List<ForeignExchangeQuote>,
        ) = ForeignExchangeQuoteListPage(foreignExchangeQuotesService, params, headers, items)
    }

    class AutoPager(private val firstPage: ForeignExchangeQuoteListPage) :
        Sequence<ForeignExchangeQuote> {

        override fun iterator(): Iterator<ForeignExchangeQuote> = iterator {
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
