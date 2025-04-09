// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.VirtualAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of virtual accounts. */
class VirtualAccountListPageAsync
private constructor(
    private val virtualAccountsService: VirtualAccountServiceAsync,
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

        return /* spotless:off */ other is VirtualAccountListPageAsync && virtualAccountsService == other.virtualAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(virtualAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "VirtualAccountListPageAsync{virtualAccountsService=$virtualAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): VirtualAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): VirtualAccountListPageAsync? {
        return getNextPageParams()?.let { virtualAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            virtualAccountsService: VirtualAccountServiceAsync,
            params: VirtualAccountListParams,
            headers: Headers,
            items: List<VirtualAccount>,
        ) = VirtualAccountListPageAsync(virtualAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: VirtualAccountListPageAsync) : Flow<VirtualAccount> {

        override suspend fun collect(collector: FlowCollector<VirtualAccount>) {
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
