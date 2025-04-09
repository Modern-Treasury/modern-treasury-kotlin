// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService
import java.util.Objects

/** Get a list of ledger transaction versions. */
class LedgerTransactionVersionListPage
private constructor(
    private val versionsService: VersionService,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerTransactionVersion> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionVersionListPage && versionsService == other.versionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(versionsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionVersionListPage{versionsService=$versionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerTransactionVersionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerTransactionVersionListPage? {
        return getNextPageParams()?.let { versionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            versionsService: VersionService,
            params: LedgerTransactionVersionListParams,
            headers: Headers,
            items: List<LedgerTransactionVersion>,
        ) = LedgerTransactionVersionListPage(versionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerTransactionVersionListPage) :
        Sequence<LedgerTransactionVersion> {

        override fun iterator(): Iterator<LedgerTransactionVersion> = iterator {
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
