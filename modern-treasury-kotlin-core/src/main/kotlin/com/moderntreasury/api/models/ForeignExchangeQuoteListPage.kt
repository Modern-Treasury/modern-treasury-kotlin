// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ForeignExchangeQuoteService
import java.util.Objects

/** @see [ForeignExchangeQuoteService.list] */
class ForeignExchangeQuoteListPage
private constructor(
    private val service: ForeignExchangeQuoteService,
    private val params: ForeignExchangeQuoteListParams,
    private val headers: Headers,
    private val items: List<ForeignExchangeQuote>,
) : Page<ForeignExchangeQuote> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): ForeignExchangeQuoteListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): ForeignExchangeQuoteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ForeignExchangeQuote> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ForeignExchangeQuoteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ForeignExchangeQuote> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ForeignExchangeQuoteListPage].
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

    /** A builder for [ForeignExchangeQuoteListPage]. */
    class Builder internal constructor() {

        private var service: ForeignExchangeQuoteService? = null
        private var params: ForeignExchangeQuoteListParams? = null
        private var headers: Headers? = null
        private var items: List<ForeignExchangeQuote>? = null

        internal fun from(foreignExchangeQuoteListPage: ForeignExchangeQuoteListPage) = apply {
            service = foreignExchangeQuoteListPage.service
            params = foreignExchangeQuoteListPage.params
            headers = foreignExchangeQuoteListPage.headers
            items = foreignExchangeQuoteListPage.items
        }

        fun service(service: ForeignExchangeQuoteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ForeignExchangeQuoteListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ForeignExchangeQuote>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ForeignExchangeQuoteListPage].
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
        fun build(): ForeignExchangeQuoteListPage =
            ForeignExchangeQuoteListPage(
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

        return /* spotless:off */ other is ForeignExchangeQuoteListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
