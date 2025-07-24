// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.InternalAccountServiceAsync
import java.util.Objects

/** @see InternalAccountServiceAsync.list */
class InternalAccountListPageAsync
private constructor(
    private val service: InternalAccountServiceAsync,
    private val params: InternalAccountListParams,
    private val headers: Headers,
    private val items: List<InternalAccount>,
) : PageAsync<InternalAccount> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): InternalAccountListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): InternalAccountListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InternalAccount> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InternalAccountListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<InternalAccount> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InternalAccountListPageAsync].
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

    /** A builder for [InternalAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: InternalAccountServiceAsync? = null
        private var params: InternalAccountListParams? = null
        private var headers: Headers? = null
        private var items: List<InternalAccount>? = null

        internal fun from(internalAccountListPageAsync: InternalAccountListPageAsync) = apply {
            service = internalAccountListPageAsync.service
            params = internalAccountListPageAsync.params
            headers = internalAccountListPageAsync.headers
            items = internalAccountListPageAsync.items
        }

        fun service(service: InternalAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InternalAccountListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<InternalAccount>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [InternalAccountListPageAsync].
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
        fun build(): InternalAccountListPageAsync =
            InternalAccountListPageAsync(
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

        return /* spotless:off */ other is InternalAccountListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "InternalAccountListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
