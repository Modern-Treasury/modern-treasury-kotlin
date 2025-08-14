// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountSettlementService
import java.util.Objects

/** @see LedgerAccountSettlementService.list */
class LedgerAccountSettlementListPage
private constructor(
    private val service: LedgerAccountSettlementService,
    private val params: LedgerAccountSettlementListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountSettlement>,
) : Page<LedgerAccountSettlement> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerAccountSettlementListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LedgerAccountSettlementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LedgerAccountSettlement> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountSettlementListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccountSettlement> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountSettlementListPage].
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

    /** A builder for [LedgerAccountSettlementListPage]. */
    class Builder internal constructor() {

        private var service: LedgerAccountSettlementService? = null
        private var params: LedgerAccountSettlementListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountSettlement>? = null

        internal fun from(ledgerAccountSettlementListPage: LedgerAccountSettlementListPage) =
            apply {
                service = ledgerAccountSettlementListPage.service
                params = ledgerAccountSettlementListPage.params
                headers = ledgerAccountSettlementListPage.headers
                items = ledgerAccountSettlementListPage.items
            }

        fun service(service: LedgerAccountSettlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountSettlementListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountSettlement>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountSettlementListPage].
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
        fun build(): LedgerAccountSettlementListPage =
            LedgerAccountSettlementListPage(
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

        return other is LedgerAccountSettlementListPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "LedgerAccountSettlementListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
