// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class EventListParams
constructor(
    private val afterCursor: String?,
    private val entityId: String?,
    private val eventName: String?,
    private val eventTimeEnd: OffsetDateTime?,
    private val eventTimeStart: OffsetDateTime?,
    private val perPage: Long?,
    private val resource: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): String? = afterCursor

    fun entityId(): String? = entityId

    fun eventName(): String? = eventName

    fun eventTimeEnd(): OffsetDateTime? = eventTimeEnd

    fun eventTimeStart(): OffsetDateTime? = eventTimeStart

    fun perPage(): Long? = perPage

    fun resource(): String? = resource

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.entityId?.let { queryParams.put("entity_id", listOf(it.toString())) }
        this.eventName?.let { queryParams.put("event_name", listOf(it.toString())) }
        this.eventTimeEnd?.let {
            queryParams.put(
                "event_time_end",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.eventTimeStart?.let {
            queryParams.put(
                "event_time_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.resource?.let { queryParams.put("resource", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var entityId: String? = null
        private var eventName: String? = null
        private var eventTimeEnd: OffsetDateTime? = null
        private var eventTimeStart: OffsetDateTime? = null
        private var perPage: Long? = null
        private var resource: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventListParams: EventListParams) = apply {
            afterCursor = eventListParams.afterCursor
            entityId = eventListParams.entityId
            eventName = eventListParams.eventName
            eventTimeEnd = eventListParams.eventTimeEnd
            eventTimeStart = eventListParams.eventTimeStart
            perPage = eventListParams.perPage
            resource = eventListParams.resource
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun entityId(entityId: String) = apply { this.entityId = entityId }

        fun eventName(eventName: String) = apply { this.eventName = eventName }

        /** An inclusive upper bound for when the event occurred */
        fun eventTimeEnd(eventTimeEnd: OffsetDateTime) = apply { this.eventTimeEnd = eventTimeEnd }

        /** An inclusive lower bound for when the event occurred */
        fun eventTimeStart(eventTimeStart: OffsetDateTime) = apply {
            this.eventTimeStart = eventTimeStart
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun resource(resource: String) = apply { this.resource = resource }

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

        fun build(): EventListParams =
            EventListParams(
                afterCursor,
                entityId,
                eventName,
                eventTimeEnd,
                eventTimeStart,
                perPage,
                resource,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListParams && afterCursor == other.afterCursor && entityId == other.entityId && eventName == other.eventName && eventTimeEnd == other.eventTimeEnd && eventTimeStart == other.eventTimeStart && perPage == other.perPage && resource == other.resource && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, entityId, eventName, eventTimeEnd, eventTimeStart, perPage, resource, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventListParams{afterCursor=$afterCursor, entityId=$entityId, eventName=$eventName, eventTimeEnd=$eventTimeEnd, eventTimeStart=$eventTimeStart, perPage=$perPage, resource=$resource, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
