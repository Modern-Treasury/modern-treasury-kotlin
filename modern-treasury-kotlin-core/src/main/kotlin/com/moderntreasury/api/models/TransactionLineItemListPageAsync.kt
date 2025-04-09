// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.transactions.LineItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [LineItemServiceAsync.list] */
class TransactionLineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val params: TransactionLineItemListParams,
    private val headers: Headers,
    private val items: List<TransactionLineItem>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): TransactionLineItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): TransactionLineItemListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionLineItemListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<TransactionLineItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionLineItemListPageAsync].
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

    /** A builder for [TransactionLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var params: TransactionLineItemListParams? = null
        private var headers: Headers? = null
        private var items: List<TransactionLineItem>? = null

        internal fun from(transactionLineItemListPageAsync: TransactionLineItemListPageAsync) =
            apply {
                service = transactionLineItemListPageAsync.service
                params = transactionLineItemListPageAsync.params
                headers = transactionLineItemListPageAsync.headers
                items = transactionLineItemListPageAsync.items
            }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionLineItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<TransactionLineItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TransactionLineItemListPageAsync].
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
        fun build(): TransactionLineItemListPageAsync =
            TransactionLineItemListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: TransactionLineItemListPageAsync) :
        Flow<TransactionLineItem> {

        override suspend fun collect(collector: FlowCollector<TransactionLineItem>) {
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

        return /* spotless:off */ other is TransactionLineItemListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "TransactionLineItemListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
