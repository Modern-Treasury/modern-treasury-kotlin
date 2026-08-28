// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.CaseService
import java.util.Objects

/** @see CaseService.list */
class CaseListPage
private constructor(
    private val service: CaseService,
    private val params: CaseListParams,
    private val headers: Headers,
    private val items: List<Case>,
) : Page<Case> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): CaseListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CaseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Case> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CaseListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Case> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CaseListPage].
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

    /** A builder for [CaseListPage]. */
    class Builder internal constructor() {

        private var service: CaseService? = null
        private var params: CaseListParams? = null
        private var headers: Headers? = null
        private var items: List<Case>? = null

        internal fun from(caseListPage: CaseListPage) = apply {
            service = caseListPage.service
            params = caseListPage.params
            headers = caseListPage.headers
            items = caseListPage.items
        }

        fun service(service: CaseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CaseListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Case>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CaseListPage].
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
        fun build(): CaseListPage =
            CaseListPage(
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

        return other is CaseListPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "CaseListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
