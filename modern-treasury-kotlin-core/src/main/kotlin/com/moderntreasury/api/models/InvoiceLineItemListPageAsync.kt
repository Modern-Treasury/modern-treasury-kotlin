// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsync
import java.util.Objects

/** @see LineItemServiceAsync.list */
class InvoiceLineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val params: InvoiceLineItemListParams,
    private val headers: Headers,
    private val items: List<InvoiceLineItem>,
) : PageAsync<InvoiceLineItem> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): InvoiceLineItemListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): InvoiceLineItemListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InvoiceLineItem> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceLineItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<InvoiceLineItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceLineItemListPageAsync].
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

    /** A builder for [InvoiceLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var params: InvoiceLineItemListParams? = null
        private var headers: Headers? = null
        private var items: List<InvoiceLineItem>? = null

        internal fun from(invoiceLineItemListPageAsync: InvoiceLineItemListPageAsync) = apply {
            service = invoiceLineItemListPageAsync.service
            params = invoiceLineItemListPageAsync.params
            headers = invoiceLineItemListPageAsync.headers
            items = invoiceLineItemListPageAsync.items
        }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceLineItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<InvoiceLineItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [InvoiceLineItemListPageAsync].
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
        fun build(): InvoiceLineItemListPageAsync =
            InvoiceLineItemListPageAsync(
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

        return /* spotless:off */ other is InvoiceLineItemListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
