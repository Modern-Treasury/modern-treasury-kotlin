// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.AccountCollectionFlowServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list account_collection_flows */
class AccountCollectionFlowListPageAsync
private constructor(
    private val accountCollectionFlowsService: AccountCollectionFlowServiceAsync,
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

        return /* spotless:off */ other is AccountCollectionFlowListPageAsync && accountCollectionFlowsService == other.accountCollectionFlowsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountCollectionFlowsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowListPageAsync{accountCollectionFlowsService=$accountCollectionFlowsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): AccountCollectionFlowListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): AccountCollectionFlowListPageAsync? {
        return getNextPageParams()?.let { accountCollectionFlowsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountCollectionFlowsService: AccountCollectionFlowServiceAsync,
            params: AccountCollectionFlowListParams,
            headers: Headers,
            items: List<AccountCollectionFlow>,
        ) =
            AccountCollectionFlowListPageAsync(
                accountCollectionFlowsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: AccountCollectionFlowListPageAsync) :
        Flow<AccountCollectionFlow> {

        override suspend fun collect(collector: FlowCollector<AccountCollectionFlow>) {
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
