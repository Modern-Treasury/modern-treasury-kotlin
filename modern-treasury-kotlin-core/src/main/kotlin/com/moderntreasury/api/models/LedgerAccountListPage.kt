// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountService
import java.util.Objects

/** @see LedgerAccountService.list */
class LedgerAccountListPage
private constructor(
    private val service: LedgerAccountService,
    private val params: LedgerAccountListParams,
    private val headers: Headers,
    private val items: List<LedgerAccount>,
) : Page<LedgerAccount> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerAccountListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LedgerAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LedgerAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccount> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerAccountListPage].
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

    /** A builder for [LedgerAccountListPage]. */
    class Builder internal constructor() {

        private var service: LedgerAccountService? = null
        private var params: LedgerAccountListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccount>? = null

        internal fun from(ledgerAccountListPage: LedgerAccountListPage) = apply {
            service = ledgerAccountListPage.service
            params = ledgerAccountListPage.params
            headers = ledgerAccountListPage.headers
            items = ledgerAccountListPage.items
        }

        fun service(service: LedgerAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccount>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountListPage].
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
        fun build(): LedgerAccountListPage =
            LedgerAccountListPage(
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

        return /* spotless:off */ other is LedgerAccountListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
