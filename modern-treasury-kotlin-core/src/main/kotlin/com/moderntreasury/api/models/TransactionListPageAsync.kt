// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.TransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all transactions. */
class TransactionListPageAsync
private constructor(
    private val transactionsService: TransactionServiceAsync,
    private val params: TransactionListParams,
    private val headers: Headers,
    private val items: List<Transaction>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Transaction> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListPageAsync && transactionsService == other.transactionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, items) /* spotless:on */

    override fun toString() =
        "TransactionListPageAsync{transactionsService=$transactionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): TransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): TransactionListPageAsync? {
        return getNextPageParams()?.let { transactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            transactionsService: TransactionServiceAsync,
            params: TransactionListParams,
            headers: Headers,
            items: List<Transaction>,
        ) = TransactionListPageAsync(transactionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: TransactionListPageAsync) : Flow<Transaction> {

        override suspend fun collect(collector: FlowCollector<Transaction>) {
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
