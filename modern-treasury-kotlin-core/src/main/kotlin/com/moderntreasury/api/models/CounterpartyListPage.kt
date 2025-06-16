// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.CounterpartyService
import java.util.Objects

/** @see [CounterpartyService.list] */
class CounterpartyListPage
private constructor(
    private val service: CounterpartyService,
    private val params: CounterpartyListParams,
    private val headers: Headers,
    private val items: List<Counterparty>,
) : Page<Counterparty> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): CounterpartyListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CounterpartyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Counterparty> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterpartyListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Counterparty> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterpartyListPage].
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

    /** A builder for [CounterpartyListPage]. */
    class Builder internal constructor() {

        private var service: CounterpartyService? = null
        private var params: CounterpartyListParams? = null
        private var headers: Headers? = null
        private var items: List<Counterparty>? = null

        internal fun from(counterpartyListPage: CounterpartyListPage) = apply {
            service = counterpartyListPage.service
            params = counterpartyListPage.params
            headers = counterpartyListPage.headers
            items = counterpartyListPage.items
        }

        fun service(service: CounterpartyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterpartyListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Counterparty>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CounterpartyListPage].
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
        fun build(): CounterpartyListPage =
            CounterpartyListPage(
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

        return /* spotless:off */ other is CounterpartyListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "CounterpartyListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
