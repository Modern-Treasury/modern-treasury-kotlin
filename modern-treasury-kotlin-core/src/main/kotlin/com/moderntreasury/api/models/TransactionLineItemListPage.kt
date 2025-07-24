// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.transactions.LineItemService
import java.util.Objects

/** @see LineItemService.list */
class TransactionLineItemListPage
private constructor(
    private val service: LineItemService,
    private val params: TransactionLineItemListParams,
    private val headers: Headers,
    private val items: List<TransactionLineItem>,
) : Page<TransactionLineItem> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): TransactionLineItemListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): TransactionLineItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TransactionLineItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionLineItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TransactionLineItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionLineItemListPage].
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

    /** A builder for [TransactionLineItemListPage]. */
    class Builder internal constructor() {

        private var service: LineItemService? = null
        private var params: TransactionLineItemListParams? = null
        private var headers: Headers? = null
        private var items: List<TransactionLineItem>? = null

        internal fun from(transactionLineItemListPage: TransactionLineItemListPage) = apply {
            service = transactionLineItemListPage.service
            params = transactionLineItemListPage.params
            headers = transactionLineItemListPage.headers
            items = transactionLineItemListPage.items
        }

        fun service(service: LineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionLineItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<TransactionLineItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TransactionLineItemListPage].
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
        fun build(): TransactionLineItemListPage =
            TransactionLineItemListPage(
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

        return /* spotless:off */ other is TransactionLineItemListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "TransactionLineItemListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
