// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LegalEntityService
import java.util.Objects

/** @see [LegalEntityService.list] */
class LegalEntityListPage
private constructor(
    private val service: LegalEntityService,
    private val params: LegalEntityListParams,
    private val headers: Headers,
    private val items: List<LegalEntity>,
) : Page<LegalEntity> {

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LegalEntityListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): LegalEntityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LegalEntity> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LegalEntityListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LegalEntity> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LegalEntityListPage].
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

    /** A builder for [LegalEntityListPage]. */
    class Builder internal constructor() {

        private var service: LegalEntityService? = null
        private var params: LegalEntityListParams? = null
        private var headers: Headers? = null
        private var items: List<LegalEntity>? = null

        internal fun from(legalEntityListPage: LegalEntityListPage) = apply {
            service = legalEntityListPage.service
            params = legalEntityListPage.params
            headers = legalEntityListPage.headers
            items = legalEntityListPage.items
        }

        fun service(service: LegalEntityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LegalEntityListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LegalEntity>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LegalEntityListPage].
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
        fun build(): LegalEntityListPage =
            LegalEntityListPage(
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

        return /* spotless:off */ other is LegalEntityListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LegalEntityListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
