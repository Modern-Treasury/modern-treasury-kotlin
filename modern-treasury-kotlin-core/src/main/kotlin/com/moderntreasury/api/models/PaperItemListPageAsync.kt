// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaperItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [PaperItemServiceAsync.list] */
class PaperItemListPageAsync
private constructor(
    private val service: PaperItemServiceAsync,
    private val params: PaperItemListParams,
    private val headers: Headers,
    private val items: List<PaperItem>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): PaperItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): PaperItemListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PaperItemListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<PaperItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaperItemListPageAsync].
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

    /** A builder for [PaperItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaperItemServiceAsync? = null
        private var params: PaperItemListParams? = null
        private var headers: Headers? = null
        private var items: List<PaperItem>? = null

        internal fun from(paperItemListPageAsync: PaperItemListPageAsync) = apply {
            service = paperItemListPageAsync.service
            params = paperItemListPageAsync.params
            headers = paperItemListPageAsync.headers
            items = paperItemListPageAsync.items
        }

        fun service(service: PaperItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaperItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaperItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaperItemListPageAsync].
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
        fun build(): PaperItemListPageAsync =
            PaperItemListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: PaperItemListPageAsync) : Flow<PaperItem> {

        override suspend fun collect(collector: FlowCollector<PaperItem>) {
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

        return /* spotless:off */ other is PaperItemListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaperItemListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
