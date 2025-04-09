// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerEventHandlerService
import java.util.Objects

/** @see [LedgerEventHandlerService.list] */
class LedgerEventHandlerListPage
private constructor(
    private val service: LedgerEventHandlerService,
    private val params: LedgerEventHandlerListParams,
    private val headers: Headers,
    private val items: List<LedgerEventHandler>,
) {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LedgerEventHandlerListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LedgerEventHandlerListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerEventHandlerListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LedgerEventHandler> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerEventHandlerListPage].
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

    /** A builder for [LedgerEventHandlerListPage]. */
    class Builder internal constructor() {

        private var service: LedgerEventHandlerService? = null
        private var params: LedgerEventHandlerListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerEventHandler>? = null

        internal fun from(ledgerEventHandlerListPage: LedgerEventHandlerListPage) = apply {
            service = ledgerEventHandlerListPage.service
            params = ledgerEventHandlerListPage.params
            headers = ledgerEventHandlerListPage.headers
            items = ledgerEventHandlerListPage.items
        }

        fun service(service: LedgerEventHandlerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerEventHandlerListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerEventHandler>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerEventHandlerListPage].
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
        fun build(): LedgerEventHandlerListPage =
            LedgerEventHandlerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LedgerEventHandlerListPage) :
        Sequence<LedgerEventHandler> {

        override fun iterator(): Iterator<LedgerEventHandler> = iterator {
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

        return /* spotless:off */ other is LedgerEventHandlerListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
