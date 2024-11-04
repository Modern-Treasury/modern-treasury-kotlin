// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun entityId(): String? = entityId

    fun eventName(): String? = eventName

    fun eventTimeEnd(): OffsetDateTime? = eventTimeEnd

    fun eventTimeStart(): OffsetDateTime? = eventTimeStart

    fun perPage(): Long? = perPage

    fun resource(): String? = resource

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.entityId?.let { params.put("entity_id", listOf(it.toString())) }
        this.eventName?.let { params.put("event_name", listOf(it.toString())) }
        this.eventTimeEnd?.let {
            params.put("event_time_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.eventTimeStart?.let {
            params.put(
                "event_time_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.resource?.let { params.put("resource", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListParams && this.afterCursor == other.afterCursor && this.entityId == other.entityId && this.eventName == other.eventName && this.eventTimeEnd == other.eventTimeEnd && this.eventTimeStart == other.eventTimeStart && this.perPage == other.perPage && this.resource == other.resource && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, entityId, eventName, eventTimeEnd, eventTimeStart, perPage, resource, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "EventListParams{afterCursor=$afterCursor, entityId=$entityId, eventName=$eventName, eventTimeEnd=$eventTimeEnd, eventTimeStart=$eventTimeStart, perPage=$perPage, resource=$resource, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(eventListParams: EventListParams) = apply {
            this.afterCursor = eventListParams.afterCursor
            this.entityId = eventListParams.entityId
            this.eventName = eventListParams.eventName
            this.eventTimeEnd = eventListParams.eventTimeEnd
            this.eventTimeStart = eventListParams.eventTimeStart
            this.perPage = eventListParams.perPage
            this.resource = eventListParams.resource
            additionalHeaders(eventListParams.additionalHeaders)
            additionalQueryParams(eventListParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): EventListParams =
            EventListParams(
                afterCursor,
                entityId,
                eventName,
                eventTimeEnd,
                eventTimeStart,
                perPage,
                resource,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
