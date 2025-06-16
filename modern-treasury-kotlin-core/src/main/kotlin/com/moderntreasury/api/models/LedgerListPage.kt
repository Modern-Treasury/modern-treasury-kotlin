// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerService
import java.util.Objects

/** @see [LedgerService.list] */
class LedgerListPage
private constructor(
    private val service: LedgerService,
    private val params: LedgerListParams,
    private val headers: Headers,
    private val items: List<Ledger>,
) : Page<Ledger> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LedgerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Ledger> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Ledger> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerListPage].
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

    /** A builder for [LedgerListPage]. */
    class Builder internal constructor() {

        private var service: LedgerService? = null
        private var params: LedgerListParams? = null
        private var headers: Headers? = null
        private var items: List<Ledger>? = null

        internal fun from(ledgerListPage: LedgerListPage) = apply {
            service = ledgerListPage.service
            params = ledgerListPage.params
            headers = ledgerListPage.headers
            items = ledgerListPage.items
        }

        fun service(service: LedgerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Ledger>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerListPage].
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
        fun build(): LedgerListPage =
            LedgerListPage(
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

        return /* spotless:off */ other is LedgerListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
