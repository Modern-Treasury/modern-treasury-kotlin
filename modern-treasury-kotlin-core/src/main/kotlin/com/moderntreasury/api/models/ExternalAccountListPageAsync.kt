// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ExternalAccountServiceAsync
import java.util.Objects

/** @see [ExternalAccountServiceAsync.list] */
class ExternalAccountListPageAsync
private constructor(
    private val service: ExternalAccountServiceAsync,
    private val params: ExternalAccountListParams,
    private val headers: Headers,
    private val items: List<ExternalAccount>,
) : PageAsync<ExternalAccount> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExternalAccountListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): ExternalAccountListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalAccount> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalAccountListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ExternalAccount> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountListPageAsync].
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

    /** A builder for [ExternalAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalAccountServiceAsync? = null
        private var params: ExternalAccountListParams? = null
        private var headers: Headers? = null
        private var items: List<ExternalAccount>? = null

        internal fun from(externalAccountListPageAsync: ExternalAccountListPageAsync) = apply {
            service = externalAccountListPageAsync.service
            params = externalAccountListPageAsync.params
            headers = externalAccountListPageAsync.headers
            items = externalAccountListPageAsync.items
        }

        fun service(service: ExternalAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalAccountListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ExternalAccount>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ExternalAccountListPageAsync].
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
        fun build(): ExternalAccountListPageAsync =
            ExternalAccountListPageAsync(
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

        return /* spotless:off */ other is ExternalAccountListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
