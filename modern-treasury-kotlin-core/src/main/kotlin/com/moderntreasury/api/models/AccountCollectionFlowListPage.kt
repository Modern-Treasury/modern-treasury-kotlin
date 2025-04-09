// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.AccountCollectionFlowService
import java.util.Objects

/** list account_collection_flows */
class AccountCollectionFlowListPage
private constructor(
    private val accountCollectionFlowsService: AccountCollectionFlowService,
    private val params: AccountCollectionFlowListParams,
    private val headers: Headers,
    private val items: List<AccountCollectionFlow>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<AccountCollectionFlow> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlowListPage && accountCollectionFlowsService == other.accountCollectionFlowsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountCollectionFlowsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowListPage{accountCollectionFlowsService=$accountCollectionFlowsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): AccountCollectionFlowListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): AccountCollectionFlowListPage? {
        return getNextPageParams()?.let { accountCollectionFlowsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountCollectionFlowsService: AccountCollectionFlowService,
            params: AccountCollectionFlowListParams,
            headers: Headers,
            items: List<AccountCollectionFlow>,
        ) = AccountCollectionFlowListPage(accountCollectionFlowsService, params, headers, items)
    }

    class AutoPager(private val firstPage: AccountCollectionFlowListPage) :
        Sequence<AccountCollectionFlow> {

        override fun iterator(): Iterator<AccountCollectionFlow> = iterator {
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
