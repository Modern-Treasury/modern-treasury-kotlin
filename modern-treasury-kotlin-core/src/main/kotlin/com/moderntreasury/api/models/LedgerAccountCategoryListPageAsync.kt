// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountCategoryServiceAsync
import java.util.Objects

/** @see LedgerAccountCategoryServiceAsync.list */
class LedgerAccountCategoryListPageAsync
private constructor(
    private val service: LedgerAccountCategoryServiceAsync,
    private val params: LedgerAccountCategoryListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountCategory>,
) : PageAsync<LedgerAccountCategory> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerAccountCategoryListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): LedgerAccountCategoryListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerAccountCategory> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountCategoryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccountCategory> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryListPageAsync].
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

    /** A builder for [LedgerAccountCategoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerAccountCategoryServiceAsync? = null
        private var params: LedgerAccountCategoryListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountCategory>? = null

        internal fun from(ledgerAccountCategoryListPageAsync: LedgerAccountCategoryListPageAsync) =
            apply {
                service = ledgerAccountCategoryListPageAsync.service
                params = ledgerAccountCategoryListPageAsync.params
                headers = ledgerAccountCategoryListPageAsync.headers
                items = ledgerAccountCategoryListPageAsync.items
            }

        fun service(service: LedgerAccountCategoryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountCategoryListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountCategory>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountCategoryListPageAsync].
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
        fun build(): LedgerAccountCategoryListPageAsync =
            LedgerAccountCategoryListPageAsync(
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

        return other is LedgerAccountCategoryListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "LedgerAccountCategoryListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
