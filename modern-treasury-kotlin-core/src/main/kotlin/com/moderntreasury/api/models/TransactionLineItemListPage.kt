// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.transactions.LineItemService
import java.util.Objects

/** list transaction_line_items */
class TransactionLineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
    private val params: TransactionLineItemListParams,
    private val headers: Headers,
    private val items: List<TransactionLineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<TransactionLineItem> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItemListPage && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "TransactionLineItemListPage{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): TransactionLineItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): TransactionLineItemListPage? {
        return getNextPageParams()?.let { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            lineItemsService: LineItemService,
            params: TransactionLineItemListParams,
            headers: Headers,
            items: List<TransactionLineItem>,
        ) = TransactionLineItemListPage(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: TransactionLineItemListPage) :
        Sequence<TransactionLineItem> {

        override fun iterator(): Iterator<TransactionLineItem> = iterator {
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
