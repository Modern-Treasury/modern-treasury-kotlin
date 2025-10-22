// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync
import java.util.Objects

/** @see VersionServiceAsync.list */
class LedgerTransactionVersionListPageAsync
private constructor(
    private val service: VersionServiceAsync,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) : PageAsync<LedgerTransactionVersion> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): LedgerTransactionVersionListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): LedgerTransactionVersionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerTransactionVersion> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerTransactionVersionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerTransactionVersion> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerTransactionVersionListPageAsync].
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

    /** A builder for [LedgerTransactionVersionListPageAsync]. */
    class Builder internal constructor() {

        private var service: VersionServiceAsync? = null
        private var params: LedgerTransactionVersionListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerTransactionVersion>? = null

        internal fun from(
            ledgerTransactionVersionListPageAsync: LedgerTransactionVersionListPageAsync
        ) = apply {
            service = ledgerTransactionVersionListPageAsync.service
            params = ledgerTransactionVersionListPageAsync.params
            headers = ledgerTransactionVersionListPageAsync.headers
            items = ledgerTransactionVersionListPageAsync.items
        }

        fun service(service: VersionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerTransactionVersionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerTransactionVersion>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerTransactionVersionListPageAsync].
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
        fun build(): LedgerTransactionVersionListPageAsync =
            LedgerTransactionVersionListPageAsync(
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

        return other is LedgerTransactionVersionListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "LedgerTransactionVersionListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
