// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.invoices.LineItemService
import java.util.Objects

/** list invoice_line_items */
class InvoiceLineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
    private val params: InvoiceLineItemListParams,
    private val headers: Headers,
    private val items: List<InvoiceLineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<InvoiceLineItem> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemListPage && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemListPage{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): InvoiceLineItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): InvoiceLineItemListPage? {
        return getNextPageParams()?.let { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            lineItemsService: LineItemService,
            params: InvoiceLineItemListParams,
            headers: Headers,
            items: List<InvoiceLineItem>,
        ) = InvoiceLineItemListPage(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: InvoiceLineItemListPage) : Sequence<InvoiceLineItem> {

        override fun iterator(): Iterator<InvoiceLineItem> = iterator {
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
