// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LegalEntityService
import java.util.Objects

/** Get a list of all legal entities. */
class LegalEntityListPage
private constructor(
    private val legalEntitiesService: LegalEntityService,
    private val params: LegalEntityListParams,
    private val headers: Headers,
    private val items: List<LegalEntity>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LegalEntity> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LegalEntityListPage && legalEntitiesService == other.legalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(legalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "LegalEntityListPage{legalEntitiesService=$legalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LegalEntityListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): LegalEntityListPage? {
        return getNextPageParams()?.let { legalEntitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            legalEntitiesService: LegalEntityService,
            params: LegalEntityListParams,
            headers: Headers,
            items: List<LegalEntity>,
        ) = LegalEntityListPage(legalEntitiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LegalEntityListPage) : Sequence<LegalEntity> {

        override fun iterator(): Iterator<LegalEntity> = iterator {
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
}
