// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryService
import java.util.Objects

/** Get a list of ledger account categories. */
class LedgerAccountCategoryListPage
private constructor(
    private val ledgerAccountCategoriesService: LedgerAccountCategoryService,
    private val params: LedgerAccountCategoryListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountCategory>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccountCategory> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryListPage && ledgerAccountCategoriesService == other.ledgerAccountCategoriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountCategoriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListPage{ledgerAccountCategoriesService=$ledgerAccountCategoriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerAccountCategoryListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerAccountCategoryListPage? {
        return getNextPageParams()?.let { ledgerAccountCategoriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerAccountCategoriesService: LedgerAccountCategoryService,
            params: LedgerAccountCategoryListParams,
            headers: Headers,
            items: List<LedgerAccountCategory>,
        ) = LedgerAccountCategoryListPage(ledgerAccountCategoriesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountCategoryListPage) :
        Sequence<LedgerAccountCategory> {

        override fun iterator(): Iterator<LedgerAccountCategory> = iterator {
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
