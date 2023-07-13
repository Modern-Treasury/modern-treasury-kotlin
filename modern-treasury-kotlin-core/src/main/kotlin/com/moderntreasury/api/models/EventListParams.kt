package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class EventListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val eventTimeStart: OffsetDateTime?,
    private val eventTimeEnd: OffsetDateTime?,
    private val resource: String?,
    private val entityId: String?,
    private val eventName: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun eventTimeStart(): OffsetDateTime? = eventTimeStart

    fun eventTimeEnd(): OffsetDateTime? = eventTimeEnd

    fun resource(): String? = resource

    fun entityId(): String? = entityId

    fun eventName(): String? = eventName

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.eventTimeStart?.let { params.put("event_time_start", listOf(it.toString())) }
        this.eventTimeEnd?.let { params.put("event_time_end", listOf(it.toString())) }
        this.resource?.let { params.put("resource", listOf(it.toString())) }
        this.entityId?.let { params.put("entity_id", listOf(it.toString())) }
        this.eventName?.let { params.put("event_name", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListParams &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.eventTimeStart == other.eventTimeStart &&
            this.eventTimeEnd == other.eventTimeEnd &&
            this.resource == other.resource &&
            this.entityId == other.entityId &&
            this.eventName == other.eventName &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            perPage,
            eventTimeStart,
            eventTimeEnd,
            resource,
            entityId,
            eventName,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "EventListParams{afterCursor=$afterCursor, perPage=$perPage, eventTimeStart=$eventTimeStart, eventTimeEnd=$eventTimeEnd, resource=$resource, entityId=$entityId, eventName=$eventName, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var eventTimeStart: OffsetDateTime? = null
        private var eventTimeEnd: OffsetDateTime? = null
        private var resource: String? = null
        private var entityId: String? = null
        private var eventName: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(eventListParams: EventListParams) = apply {
            this.afterCursor = eventListParams.afterCursor
            this.perPage = eventListParams.perPage
            this.eventTimeStart = eventListParams.eventTimeStart
            this.eventTimeEnd = eventListParams.eventTimeEnd
            this.resource = eventListParams.resource
            this.entityId = eventListParams.entityId
            this.eventName = eventListParams.eventName
            additionalQueryParams(eventListParams.additionalQueryParams)
            additionalHeaders(eventListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** An inclusive lower bound for when the event occurred */
        fun eventTimeStart(eventTimeStart: OffsetDateTime) = apply {
            this.eventTimeStart = eventTimeStart
        }

        /** An inclusive upper bound for when the event occurred */
        fun eventTimeEnd(eventTimeEnd: OffsetDateTime) = apply { this.eventTimeEnd = eventTimeEnd }

        fun resource(resource: String) = apply { this.resource = resource }

        fun entityId(entityId: String) = apply { this.entityId = entityId }

        fun eventName(eventName: String) = apply { this.eventName = eventName }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): EventListParams =
            EventListParams(
                afterCursor,
                perPage,
                eventTimeStart,
                eventTimeEnd,
                resource,
                entityId,
                eventName,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
