// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.AccountDetailServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of account details for a single internal or external account. */
class AccountDetailListPageAsync
private constructor(
    private val accountDetailsService: AccountDetailServiceAsync,
    private val params: AccountDetailListParams,
    private val headers: Headers,
    private val items: List<AccountDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<AccountDetail> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountDetailListPageAsync && accountDetailsService == other.accountDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountDetailListPageAsync{accountDetailsService=$accountDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): AccountDetailListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): AccountDetailListPageAsync? {
        return getNextPageParams()?.let { accountDetailsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountDetailsService: AccountDetailServiceAsync,
            params: AccountDetailListParams,
            headers: Headers,
            items: List<AccountDetail>,
        ) = AccountDetailListPageAsync(accountDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: AccountDetailListPageAsync) : Flow<AccountDetail> {

        override suspend fun collect(collector: FlowCollector<AccountDetail>) {
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
