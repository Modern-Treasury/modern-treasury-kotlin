// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.AccountDetailService
import java.util.Objects

/** Get a list of account details for a single internal or external account. */
class AccountDetailListPage
private constructor(
    private val accountDetailsService: AccountDetailService,
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

        return /* spotless:off */ other is AccountDetailListPage && accountDetailsService == other.accountDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountDetailListPage{accountDetailsService=$accountDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): AccountDetailListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): AccountDetailListPage? {
        return getNextPageParams()?.let { accountDetailsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountDetailsService: AccountDetailService,
            params: AccountDetailListParams,
            headers: Headers,
            items: List<AccountDetail>,
        ) = AccountDetailListPage(accountDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: AccountDetailListPage) : Sequence<AccountDetail> {

        override fun iterator(): Iterator<AccountDetail> = iterator {
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
