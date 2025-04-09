// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ConnectionLegalEntityServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of all connection legal entities. */
class ConnectionLegalEntityListPageAsync
private constructor(
    private val connectionLegalEntitiesService: ConnectionLegalEntityServiceAsync,
    private val params: ConnectionLegalEntityListParams,
    private val headers: Headers,
    private val items: List<ConnectionLegalEntity>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ConnectionLegalEntity> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionLegalEntityListPageAsync && connectionLegalEntitiesService == other.connectionLegalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionLegalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "ConnectionLegalEntityListPageAsync{connectionLegalEntitiesService=$connectionLegalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): ConnectionLegalEntityListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    suspend fun getNextPage(): ConnectionLegalEntityListPageAsync? {
        return getNextPageParams()?.let { connectionLegalEntitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            connectionLegalEntitiesService: ConnectionLegalEntityServiceAsync,
            params: ConnectionLegalEntityListParams,
            headers: Headers,
            items: List<ConnectionLegalEntity>,
        ) =
            ConnectionLegalEntityListPageAsync(
                connectionLegalEntitiesService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: ConnectionLegalEntityListPageAsync) :
        Flow<ConnectionLegalEntity> {

        override suspend fun collect(collector: FlowCollector<ConnectionLegalEntity>) {
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
