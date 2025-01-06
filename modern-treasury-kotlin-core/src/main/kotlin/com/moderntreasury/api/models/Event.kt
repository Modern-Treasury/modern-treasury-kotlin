// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Event
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("event_name")
    @ExcludeMissing
    private val eventName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("event_time")
    @ExcludeMissing
    private val eventTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resource")
    @ExcludeMissing
    private val resource: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The body of the event. */
    fun data(): Data = data.getRequired("data")

    /** The ID of the entity for the event. */
    fun entityId(): String = entityId.getRequired("entity_id")

    /** The name of the event. */
    fun eventName(): String = eventName.getRequired("event_name")

    /** The time of the event. */
    fun eventTime(): OffsetDateTime = eventTime.getRequired("event_time")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /** The type of resource for the event. */
    fun resource(): String = resource.getRequired("resource")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The body of the event. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    /** The ID of the entity for the event. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** The name of the event. */
    @JsonProperty("event_name") @ExcludeMissing fun _eventName() = eventName

    /** The time of the event. */
    @JsonProperty("event_time") @ExcludeMissing fun _eventTime() = eventTime

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The type of resource for the event. */
    @JsonProperty("resource") @ExcludeMissing fun _resource() = resource

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Event = apply {
        if (!validated) {
            id()
            createdAt()
            data().validate()
            entityId()
            eventName()
            eventTime()
            liveMode()
            object_()
            resource()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var eventName: JsonField<String> = JsonMissing.of()
        private var eventTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var resource: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(event: Event) = apply {
            id = event.id
            createdAt = event.createdAt
            data = event.data
            entityId = event.entityId
            eventName = event.eventName
            eventTime = event.eventTime
            liveMode = event.liveMode
            object_ = event.object_
            resource = event.resource
            updatedAt = event.updatedAt
            additionalProperties = event.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The body of the event. */
        fun data(data: Data) = data(JsonField.of(data))

        /** The body of the event. */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** The ID of the entity for the event. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The ID of the entity for the event. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The name of the event. */
        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /** The name of the event. */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        /** The time of the event. */
        fun eventTime(eventTime: OffsetDateTime) = eventTime(JsonField.of(eventTime))

        /** The time of the event. */
        fun eventTime(eventTime: JsonField<OffsetDateTime>) = apply { this.eventTime = eventTime }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The type of resource for the event. */
        fun resource(resource: String) = resource(JsonField.of(resource))

        /** The type of resource for the event. */
        fun resource(resource: JsonField<String>) = apply { this.resource = resource }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): Event =
            Event(
                id,
                createdAt,
                data,
                entityId,
                eventName,
                eventTime,
                liveMode,
                object_,
                resource,
                updatedAt,
                additionalProperties.toImmutable(),
            )
    }

    /** The body of the event. */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Event && id == other.id && createdAt == other.createdAt && data == other.data && entityId == other.entityId && eventName == other.eventName && eventTime == other.eventTime && liveMode == other.liveMode && object_ == other.object_ && resource == other.resource && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, data, entityId, eventName, eventTime, liveMode, object_, resource, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Event{id=$id, createdAt=$createdAt, data=$data, entityId=$entityId, eventName=$eventName, eventTime=$eventTime, liveMode=$liveMode, object_=$object_, resource=$resource, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
