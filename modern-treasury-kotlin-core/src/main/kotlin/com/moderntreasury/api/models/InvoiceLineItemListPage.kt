// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.invoices.LineItemService
import java.util.Objects

/** @see LineItemService.list */
class InvoiceLineItemListPage
private constructor(
    private val service: LineItemService,
    private val params: InvoiceLineItemListParams,
    private val headers: Headers,
    private val items: List<InvoiceLineItem>,
) : Page<InvoiceLineItem> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): InvoiceLineItemListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): InvoiceLineItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InvoiceLineItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceLineItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<InvoiceLineItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceLineItemListPage].
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

    /** A builder for [InvoiceLineItemListPage]. */
    class Builder internal constructor() {

        private var service: LineItemService? = null
        private var params: InvoiceLineItemListParams? = null
        private var headers: Headers? = null
        private var items: List<InvoiceLineItem>? = null

        internal fun from(invoiceLineItemListPage: InvoiceLineItemListPage) = apply {
            service = invoiceLineItemListPage.service
            params = invoiceLineItemListPage.params
            headers = invoiceLineItemListPage.headers
            items = invoiceLineItemListPage.items
        }

        fun service(service: LineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceLineItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<InvoiceLineItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [InvoiceLineItemListPage].
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
        fun build(): InvoiceLineItemListPage =
            InvoiceLineItemListPage(
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

        return other is InvoiceLineItemListPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "InvoiceLineItemListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
