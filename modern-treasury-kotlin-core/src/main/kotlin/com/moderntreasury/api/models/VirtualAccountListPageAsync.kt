// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.VirtualAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [VirtualAccountServiceAsync.list] */
class VirtualAccountListPageAsync
private constructor(
    private val service: VirtualAccountServiceAsync,
    private val params: VirtualAccountListParams,
    private val headers: Headers,
    private val items: List<VirtualAccount>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): VirtualAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): VirtualAccountListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): VirtualAccountListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<VirtualAccount> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VirtualAccountListPageAsync].
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

    /** A builder for [VirtualAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: VirtualAccountServiceAsync? = null
        private var params: VirtualAccountListParams? = null
        private var headers: Headers? = null
        private var items: List<VirtualAccount>? = null

        internal fun from(virtualAccountListPageAsync: VirtualAccountListPageAsync) = apply {
            service = virtualAccountListPageAsync.service
            params = virtualAccountListPageAsync.params
            headers = virtualAccountListPageAsync.headers
            items = virtualAccountListPageAsync.items
        }

        fun service(service: VirtualAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualAccountListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<VirtualAccount>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VirtualAccountListPageAsync].
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
        fun build(): VirtualAccountListPageAsync =
            VirtualAccountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: VirtualAccountListPageAsync) : Flow<VirtualAccount> {

        override suspend fun collect(collector: FlowCollector<VirtualAccount>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
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

        return /* spotless:off */ other is VirtualAccountListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "VirtualAccountListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
