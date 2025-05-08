// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService
import java.util.Objects

/** @see [BalanceReportService.list] */
class BalanceReportListPage
private constructor(
    private val service: BalanceReportService,
    private val params: BalanceReportListParams,
    private val headers: Headers,
    private val items: List<BalanceReport>,
) : Page<BalanceReport> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceReportListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): BalanceReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BalanceReport> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceReportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BalanceReport> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceReportListPage].
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

    /** A builder for [BalanceReportListPage]. */
    class Builder internal constructor() {

        private var service: BalanceReportService? = null
        private var params: BalanceReportListParams? = null
        private var headers: Headers? = null
        private var items: List<BalanceReport>? = null

        internal fun from(balanceReportListPage: BalanceReportListPage) = apply {
            service = balanceReportListPage.service
            params = balanceReportListPage.params
            headers = balanceReportListPage.headers
            items = balanceReportListPage.items
        }

        fun service(service: BalanceReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceReportListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BalanceReport>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BalanceReportListPage].
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
        fun build(): BalanceReportListPage =
            BalanceReportListPage(
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

        return /* spotless:off */ other is BalanceReportListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "BalanceReportListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
