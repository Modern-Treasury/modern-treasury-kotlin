// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ExternalAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** list external accounts */
class ExternalAccountListPageAsync
private constructor(
    private val externalAccountsService: ExternalAccountServiceAsync,
    private val params: ExternalAccountListParams,
    private val headers: Headers,
    private val items: List<ExternalAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ExternalAccount> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountListPageAsync && externalAccountsService == other.externalAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPageAsync{externalAccountsService=$externalAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ExternalAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): ExternalAccountListPageAsync? {
        return getNextPageParams()?.let { externalAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            externalAccountsService: ExternalAccountServiceAsync,
            params: ExternalAccountListParams,
            headers: Headers,
            items: List<ExternalAccount>,
        ) = ExternalAccountListPageAsync(externalAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ExternalAccountListPageAsync) : Flow<ExternalAccount> {

        override suspend fun collect(collector: FlowCollector<ExternalAccount>) {
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
