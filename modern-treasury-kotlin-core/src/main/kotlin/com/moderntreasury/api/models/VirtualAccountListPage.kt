// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.VirtualAccountService
import java.util.Objects

/** @see VirtualAccountService.list */
class VirtualAccountListPage
private constructor(
    private val service: VirtualAccountService,
    private val params: VirtualAccountListParams,
    private val headers: Headers,
    private val items: List<VirtualAccount>,
) : Page<VirtualAccount> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): VirtualAccountListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): VirtualAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VirtualAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VirtualAccountListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VirtualAccount> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VirtualAccountListPage].
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

    /** A builder for [VirtualAccountListPage]. */
    class Builder internal constructor() {

        private var service: VirtualAccountService? = null
        private var params: VirtualAccountListParams? = null
        private var headers: Headers? = null
        private var items: List<VirtualAccount>? = null

        internal fun from(virtualAccountListPage: VirtualAccountListPage) = apply {
            service = virtualAccountListPage.service
            params = virtualAccountListPage.params
            headers = virtualAccountListPage.headers
            items = virtualAccountListPage.items
        }

        fun service(service: VirtualAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualAccountListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<VirtualAccount>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VirtualAccountListPage].
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
        fun build(): VirtualAccountListPage =
            VirtualAccountListPage(
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

        return /* spotless:off */ other is VirtualAccountListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "VirtualAccountListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
