// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerEntryServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [LedgerEntryServiceAsync.list] */
class LedgerEntryListPageAsync
private constructor(
    private val service: LedgerEntryServiceAsync,
    private val params: LedgerEntryListParams,
    private val headers: Headers,
    private val items: List<LedgerEntry>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerEntryListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LedgerEntryListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerEntryListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LedgerEntry> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerEntryListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerEntryListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerEntryServiceAsync? = null
        private var params: LedgerEntryListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerEntry>? = null

        internal fun from(ledgerEntryListPageAsync: LedgerEntryListPageAsync) = apply {
            service = ledgerEntryListPageAsync.service
            params = ledgerEntryListPageAsync.params
            headers = ledgerEntryListPageAsync.headers
            items = ledgerEntryListPageAsync.items
        }

        fun service(service: LedgerEntryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerEntryListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerEntry>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerEntryListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerEntryListPageAsync =
            LedgerEntryListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LedgerEntryListPageAsync) : Flow<LedgerEntry> {

        override suspend fun collect(collector: FlowCollector<LedgerEntry>) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEntryListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerEntryListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
