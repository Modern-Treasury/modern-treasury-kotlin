// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerServiceAsync
import java.util.Objects

/** @see LedgerServiceAsync.list */
class LedgerListPageAsync
private constructor(
    private val service: LedgerServiceAsync,
    private val params: LedgerListParams,
    private val headers: Headers,
    private val items: List<Ledger>,
) : PageAsync<Ledger> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): LedgerListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Ledger> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Ledger> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerListPageAsync].
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

    /** A builder for [LedgerListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerServiceAsync? = null
        private var params: LedgerListParams? = null
        private var headers: Headers? = null
        private var items: List<Ledger>? = null

        internal fun from(ledgerListPageAsync: LedgerListPageAsync) = apply {
            service = ledgerListPageAsync.service
            params = ledgerListPageAsync.params
            headers = ledgerListPageAsync.headers
            items = ledgerListPageAsync.items
        }

        fun service(service: LedgerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Ledger>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerListPageAsync].
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
        fun build(): LedgerListPageAsync =
            LedgerListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "LedgerListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
