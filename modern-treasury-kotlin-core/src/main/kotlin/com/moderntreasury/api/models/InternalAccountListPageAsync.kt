// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.InternalAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list internal accounts */
class InternalAccountListPageAsync
private constructor(
    private val internalAccountsService: InternalAccountServiceAsync,
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

        return /* spotless:off */ other is InternalAccountListPageAsync && internalAccountsService == other.internalAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(internalAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "InternalAccountListPageAsync{internalAccountsService=$internalAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): InternalAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): InternalAccountListPageAsync? {
        return getNextPageParams()?.let { internalAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            internalAccountsService: InternalAccountServiceAsync,
            params: InternalAccountListParams,
            headers: Headers,
            items: List<InternalAccount>,
        ) = InternalAccountListPageAsync(internalAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: InternalAccountListPageAsync) : Flow<InternalAccount> {

        override suspend fun collect(collector: FlowCollector<InternalAccount>) {
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
