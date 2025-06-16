// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ConnectionLegalEntityService
import java.util.Objects

/** @see [ConnectionLegalEntityService.list] */
class ConnectionLegalEntityListPage
private constructor(
    private val service: ConnectionLegalEntityService,
    private val params: ConnectionLegalEntityListParams,
    private val headers: Headers,
    private val items: List<ConnectionLegalEntity>,
) : Page<ConnectionLegalEntity> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): ConnectionLegalEntityListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): ConnectionLegalEntityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ConnectionLegalEntity> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConnectionLegalEntityListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ConnectionLegalEntity> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConnectionLegalEntityListPage].
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

    /** A builder for [ConnectionLegalEntityListPage]. */
    class Builder internal constructor() {

        private var service: ConnectionLegalEntityService? = null
        private var params: ConnectionLegalEntityListParams? = null
        private var headers: Headers? = null
        private var items: List<ConnectionLegalEntity>? = null

        internal fun from(connectionLegalEntityListPage: ConnectionLegalEntityListPage) = apply {
            service = connectionLegalEntityListPage.service
            params = connectionLegalEntityListPage.params
            headers = connectionLegalEntityListPage.headers
            items = connectionLegalEntityListPage.items
        }

        fun service(service: ConnectionLegalEntityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConnectionLegalEntityListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ConnectionLegalEntity>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ConnectionLegalEntityListPage].
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
        fun build(): ConnectionLegalEntityListPage =
            ConnectionLegalEntityListPage(
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

        return /* spotless:off */ other is ConnectionLegalEntityListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ConnectionLegalEntityListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
