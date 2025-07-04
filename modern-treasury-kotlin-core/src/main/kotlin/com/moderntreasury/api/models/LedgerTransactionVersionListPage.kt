// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService
import java.util.Objects

/** @see [VersionService.list] */
class LedgerTransactionVersionListPage
private constructor(
    private val service: VersionService,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) : Page<LedgerTransactionVersion> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerTransactionVersionListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LedgerTransactionVersionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LedgerTransactionVersion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerTransactionVersionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerTransactionVersion> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerTransactionVersionListPage].
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

    /** A builder for [LedgerTransactionVersionListPage]. */
    class Builder internal constructor() {

        private var service: VersionService? = null
        private var params: LedgerTransactionVersionListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerTransactionVersion>? = null

        internal fun from(ledgerTransactionVersionListPage: LedgerTransactionVersionListPage) =
            apply {
                service = ledgerTransactionVersionListPage.service
                params = ledgerTransactionVersionListPage.params
                headers = ledgerTransactionVersionListPage.headers
                items = ledgerTransactionVersionListPage.items
            }

        fun service(service: VersionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerTransactionVersionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerTransactionVersion>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerTransactionVersionListPage].
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
        fun build(): LedgerTransactionVersionListPage =
            LedgerTransactionVersionListPage(
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

        return /* spotless:off */ other is LedgerTransactionVersionListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionVersionListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
