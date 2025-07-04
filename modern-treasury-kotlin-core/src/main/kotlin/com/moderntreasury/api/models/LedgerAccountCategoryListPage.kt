// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryService
import java.util.Objects

/** @see [LedgerAccountCategoryService.list] */
class LedgerAccountCategoryListPage
private constructor(
    private val service: LedgerAccountCategoryService,
    private val params: LedgerAccountCategoryListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountCategory>,
) : Page<LedgerAccountCategory> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor() != null

    fun nextPageParams(): LedgerAccountCategoryListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): LedgerAccountCategoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LedgerAccountCategory> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountCategoryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccountCategory> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryListPage].
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

    /** A builder for [LedgerAccountCategoryListPage]. */
    class Builder internal constructor() {

        private var service: LedgerAccountCategoryService? = null
        private var params: LedgerAccountCategoryListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountCategory>? = null

        internal fun from(ledgerAccountCategoryListPage: LedgerAccountCategoryListPage) = apply {
            service = ledgerAccountCategoryListPage.service
            params = ledgerAccountCategoryListPage.params
            headers = ledgerAccountCategoryListPage.headers
            items = ledgerAccountCategoryListPage.items
        }

        fun service(service: LedgerAccountCategoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountCategoryListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountCategory>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountCategoryListPage].
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
        fun build(): LedgerAccountCategoryListPage =
            LedgerAccountCategoryListPage(
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

        return /* spotless:off */ other is LedgerAccountCategoryListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
