// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LegalEntityServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all legal entities. */
class LegalEntityListPageAsync
private constructor(
    private val legalEntitiesService: LegalEntityServiceAsync,
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

        return /* spotless:off */ other is LegalEntityListPageAsync && legalEntitiesService == other.legalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(legalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "LegalEntityListPageAsync{legalEntitiesService=$legalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): LegalEntityListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): LegalEntityListPageAsync? {
        return getNextPageParams()?.let { legalEntitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            legalEntitiesService: LegalEntityServiceAsync,
            params: LegalEntityListParams,
            headers: Headers,
            items: List<LegalEntity>,
        ) = LegalEntityListPageAsync(legalEntitiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LegalEntityListPageAsync) : Flow<LegalEntity> {

        override suspend fun collect(collector: FlowCollector<LegalEntity>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
