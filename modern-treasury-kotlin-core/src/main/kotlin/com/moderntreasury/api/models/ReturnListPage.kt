// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ReturnService
import java.util.Objects

/** @see ReturnService.list */
class ReturnListPage
private constructor(
    private val service: ReturnService,
    private val params: ReturnListParams,
    private val headers: Headers,
    private val items: List<ReturnObject>,
) : Page<ReturnObject> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): ReturnListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): ReturnListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ReturnObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReturnListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ReturnObject> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReturnListPage].
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

    /** A builder for [ReturnListPage]. */
    class Builder internal constructor() {

        private var service: ReturnService? = null
        private var params: ReturnListParams? = null
        private var headers: Headers? = null
        private var items: List<ReturnObject>? = null

        internal fun from(returnListPage: ReturnListPage) = apply {
            service = returnListPage.service
            params = returnListPage.params
            headers = returnListPage.headers
            items = returnListPage.items
        }

        fun service(service: ReturnService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReturnListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ReturnObject>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ReturnListPage].
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
        fun build(): ReturnListPage =
            ReturnListPage(
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

        return other is ReturnListPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "ReturnListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
