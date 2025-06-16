// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountBalanceMonitorService
import java.util.Objects

/** @see [LedgerAccountBalanceMonitorService.list] */
class LedgerAccountBalanceMonitorListPage
private constructor(
    private val service: LedgerAccountBalanceMonitorService,
    private val params: LedgerAccountBalanceMonitorListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountBalanceMonitor>,
) : Page<LedgerAccountBalanceMonitor> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerAccountBalanceMonitorListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LedgerAccountBalanceMonitorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LedgerAccountBalanceMonitor> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountBalanceMonitorListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccountBalanceMonitor> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountBalanceMonitorListPage].
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

    /** A builder for [LedgerAccountBalanceMonitorListPage]. */
    class Builder internal constructor() {

        private var service: LedgerAccountBalanceMonitorService? = null
        private var params: LedgerAccountBalanceMonitorListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountBalanceMonitor>? = null

        internal fun from(
            ledgerAccountBalanceMonitorListPage: LedgerAccountBalanceMonitorListPage
        ) = apply {
            service = ledgerAccountBalanceMonitorListPage.service
            params = ledgerAccountBalanceMonitorListPage.params
            headers = ledgerAccountBalanceMonitorListPage.headers
            items = ledgerAccountBalanceMonitorListPage.items
        }

        fun service(service: LedgerAccountBalanceMonitorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountBalanceMonitorListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountBalanceMonitor>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountBalanceMonitorListPage].
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
        fun build(): LedgerAccountBalanceMonitorListPage =
            LedgerAccountBalanceMonitorListPage(
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

        return /* spotless:off */ other is LedgerAccountBalanceMonitorListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountBalanceMonitorListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
