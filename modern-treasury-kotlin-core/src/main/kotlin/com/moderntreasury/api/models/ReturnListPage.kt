// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ReturnService
import java.util.Objects

/** @see [ReturnService.list] */
class ReturnListPage
private constructor(
    private val service: ReturnService,
    private val params: ReturnListParams,
    private val headers: Headers,
    private val items: List<ReturnObject>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ReturnListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): ReturnListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ReturnListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<ReturnObject> = items

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

    class AutoPager(private val firstPage: ReturnListPage) : Sequence<ReturnObject> {

        override fun iterator(): Iterator<ReturnObject> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ReturnListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
