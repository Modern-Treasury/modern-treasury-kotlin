// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.VirtualAccountService
import java.util.Objects

/** Get a list of virtual accounts. */
class VirtualAccountListPage
private constructor(
    private val virtualAccountsService: VirtualAccountService,
    private val params: VirtualAccountListParams,
    private val headers: Headers,
    private val items: List<VirtualAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<VirtualAccount> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccountListPage && virtualAccountsService == other.virtualAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(virtualAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "VirtualAccountListPage{virtualAccountsService=$virtualAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): VirtualAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): VirtualAccountListPage? {
        return getNextPageParams()?.let { virtualAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            virtualAccountsService: VirtualAccountService,
            params: VirtualAccountListParams,
            headers: Headers,
            items: List<VirtualAccount>,
        ) = VirtualAccountListPage(virtualAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: VirtualAccountListPage) : Sequence<VirtualAccount> {

        override fun iterator(): Iterator<VirtualAccount> = iterator {
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
