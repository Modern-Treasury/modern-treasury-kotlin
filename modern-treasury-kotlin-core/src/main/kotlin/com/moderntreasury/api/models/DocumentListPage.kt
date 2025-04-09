// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.DocumentService
import java.util.Objects

/** Get a list of documents. */
class DocumentListPage
private constructor(
    private val documentsService: DocumentService,
    private val params: DocumentListParams,
    private val headers: Headers,
    private val items: List<Document>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Document> = items

    fun perPage(): String? = headers.values("per_page").firstOrNull()

    fun afterCursor(): String? = headers.values("after_cursor").firstOrNull()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListPage && documentsService == other.documentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(documentsService, params, items) /* spotless:on */

    override fun toString() =
        "DocumentListPage{documentsService=$documentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor() != null

    fun getNextPageParams(): DocumentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { afterCursor()?.let { afterCursor(it) } }.build()
    }

    fun getNextPage(): DocumentListPage? {
        return getNextPageParams()?.let { documentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            documentsService: DocumentService,
            params: DocumentListParams,
            headers: Headers,
            items: List<Document>,
        ) = DocumentListPage(documentsService, params, headers, items)
    }

    class AutoPager(private val firstPage: DocumentListPage) : Sequence<Document> {

        override fun iterator(): Iterator<Document> = iterator {
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
