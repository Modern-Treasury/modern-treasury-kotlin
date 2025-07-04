// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.AccountCollectionFlowServiceAsync
import java.util.Objects

/** @see [AccountCollectionFlowServiceAsync.list] */
class AccountCollectionFlowListPageAsync
private constructor(
    private val service: AccountCollectionFlowServiceAsync,
    private val params: AccountCollectionFlowListParams,
    private val headers: Headers,
    private val items: List<AccountCollectionFlow>,
) : PageAsync<AccountCollectionFlow> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): AccountCollectionFlowListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): AccountCollectionFlowListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountCollectionFlow> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountCollectionFlowListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AccountCollectionFlow> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountCollectionFlowListPageAsync].
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

    /** A builder for [AccountCollectionFlowListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountCollectionFlowServiceAsync? = null
        private var params: AccountCollectionFlowListParams? = null
        private var headers: Headers? = null
        private var items: List<AccountCollectionFlow>? = null

        internal fun from(accountCollectionFlowListPageAsync: AccountCollectionFlowListPageAsync) =
            apply {
                service = accountCollectionFlowListPageAsync.service
                params = accountCollectionFlowListPageAsync.params
                headers = accountCollectionFlowListPageAsync.headers
                items = accountCollectionFlowListPageAsync.items
            }

        fun service(service: AccountCollectionFlowServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountCollectionFlowListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<AccountCollectionFlow>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AccountCollectionFlowListPageAsync].
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
        fun build(): AccountCollectionFlowListPageAsync =
            AccountCollectionFlowListPageAsync(
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

        return /* spotless:off */ other is AccountCollectionFlowListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
