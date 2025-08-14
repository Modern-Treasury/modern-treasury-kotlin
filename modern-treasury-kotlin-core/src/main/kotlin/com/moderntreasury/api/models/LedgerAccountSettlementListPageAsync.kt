// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountSettlementServiceAsync
import java.util.Objects

/** @see LedgerAccountSettlementServiceAsync.list */
class LedgerAccountSettlementListPageAsync
private constructor(
    private val service: LedgerAccountSettlementServiceAsync,
    private val params: LedgerAccountSettlementListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountSettlement>,
) : PageAsync<LedgerAccountSettlement> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerAccountSettlementListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): LedgerAccountSettlementListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerAccountSettlement> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountSettlementListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccountSettlement> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountSettlementListPageAsync].
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

    /** A builder for [LedgerAccountSettlementListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerAccountSettlementServiceAsync? = null
        private var params: LedgerAccountSettlementListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountSettlement>? = null

        internal fun from(
            ledgerAccountSettlementListPageAsync: LedgerAccountSettlementListPageAsync
        ) = apply {
            service = ledgerAccountSettlementListPageAsync.service
            params = ledgerAccountSettlementListPageAsync.params
            headers = ledgerAccountSettlementListPageAsync.headers
            items = ledgerAccountSettlementListPageAsync.items
        }

        fun service(service: LedgerAccountSettlementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountSettlementListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountSettlement>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountSettlementListPageAsync].
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
        fun build(): LedgerAccountSettlementListPageAsync =
            LedgerAccountSettlementListPageAsync(
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

        return other is LedgerAccountSettlementListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "LedgerAccountSettlementListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
