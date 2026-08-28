// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.util.Objects

/** Retrieve a list of journal sources */
class JournalSourceListParams
private constructor(
    private val journalEntryId: String?,
    private val journalReportId: String?,
    private val page: Long?,
    private val perPage: Long?,
    private val sourceId: String?,
    private val sourceType: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The ID of the journal entry */
    fun journalEntryId(): String? = journalEntryId

    /** The ID of the journal report */
    fun journalReportId(): String? = journalReportId

    /** Page number for pagination */
    fun page(): Long? = page

    /** Number of items per page */
    fun perPage(): Long? = perPage

    /** The ID of the source object */
    fun sourceId(): String? = sourceId

    /** The type of the source object */
    fun sourceType(): String? = sourceType

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): JournalSourceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [JournalSourceListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [JournalSourceListParams]. */
    class Builder internal constructor() {

        private var journalEntryId: String? = null
        private var journalReportId: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var sourceId: String? = null
        private var sourceType: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(journalSourceListParams: JournalSourceListParams) = apply {
            journalEntryId = journalSourceListParams.journalEntryId
            journalReportId = journalSourceListParams.journalReportId
            page = journalSourceListParams.page
            perPage = journalSourceListParams.perPage
            sourceId = journalSourceListParams.sourceId
            sourceType = journalSourceListParams.sourceType
            additionalHeaders = journalSourceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = journalSourceListParams.additionalQueryParams.toBuilder()
        }

        /** The ID of the journal entry */
        fun journalEntryId(journalEntryId: String?) = apply { this.journalEntryId = journalEntryId }

        /** The ID of the journal report */
        fun journalReportId(journalReportId: String?) = apply {
            this.journalReportId = journalReportId
        }

        /** Page number for pagination */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Number of items per page */
        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** The ID of the source object */
        fun sourceId(sourceId: String?) = apply { this.sourceId = sourceId }

        /** The type of the source object */
        fun sourceType(sourceType: String?) = apply { this.sourceType = sourceType }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [JournalSourceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JournalSourceListParams =
            JournalSourceListParams(
                journalEntryId,
                journalReportId,
                page,
                perPage,
                sourceId,
                sourceType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                journalEntryId?.let { put("journal_entry_id", it) }
                journalReportId?.let { put("journal_report_id", it) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("per_page", it.toString()) }
                sourceId?.let { put("source_id", it) }
                sourceType?.let { put("source_type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JournalSourceListParams &&
            journalEntryId == other.journalEntryId &&
            journalReportId == other.journalReportId &&
            page == other.page &&
            perPage == other.perPage &&
            sourceId == other.sourceId &&
            sourceType == other.sourceType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            journalEntryId,
            journalReportId,
            page,
            perPage,
            sourceId,
            sourceType,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "JournalSourceListParams{journalEntryId=$journalEntryId, journalReportId=$journalReportId, page=$page, perPage=$perPage, sourceId=$sourceId, sourceType=$sourceType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
