// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.CounterpartyServiceAsync
import java.util.Objects

/** @see [CounterpartyServiceAsync.list] */
class CounterpartyListPageAsync
private constructor(
    private val service: CounterpartyServiceAsync,
    private val params: CounterpartyListParams,
    private val headers: Headers,
    private val items: List<Counterparty>,
) : PageAsync<Counterparty> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CounterpartyListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): CounterpartyListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Counterparty> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterpartyListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Counterparty> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterpartyListPageAsync].
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

    /** A builder for [CounterpartyListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterpartyServiceAsync? = null
        private var params: CounterpartyListParams? = null
        private var headers: Headers? = null
        private var items: List<Counterparty>? = null

        internal fun from(counterpartyListPageAsync: CounterpartyListPageAsync) = apply {
            service = counterpartyListPageAsync.service
            params = counterpartyListPageAsync.params
            headers = counterpartyListPageAsync.headers
            items = counterpartyListPageAsync.items
        }

        fun service(service: CounterpartyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterpartyListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Counterparty>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CounterpartyListPageAsync].
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
        fun build(): CounterpartyListPageAsync =
            CounterpartyListPageAsync(
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

        return /* spotless:off */ other is CounterpartyListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "CounterpartyListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
