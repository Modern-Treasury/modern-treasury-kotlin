// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.InternalAccountService
import java.util.Objects

/** list internal accounts */
class InternalAccountListPage
private constructor(
    private val internalAccountsService: InternalAccountService,
    private val params: InternalAccountListParams,
    private val headers: Headers,
    private val items: List<InternalAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<InternalAccount> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InternalAccountListPage && internalAccountsService == other.internalAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(internalAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "InternalAccountListPage{internalAccountsService=$internalAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): InternalAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): InternalAccountListPage? {
        return getNextPageParams()?.let { internalAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            internalAccountsService: InternalAccountService,
            params: InternalAccountListParams,
            headers: Headers,
            items: List<InternalAccount>,
        ) = InternalAccountListPage(internalAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: InternalAccountListPage) : Sequence<InternalAccount> {

        override fun iterator(): Iterator<InternalAccount> = iterator {
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
