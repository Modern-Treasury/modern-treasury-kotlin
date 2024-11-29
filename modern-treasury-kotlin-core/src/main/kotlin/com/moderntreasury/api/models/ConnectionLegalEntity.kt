// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ConnectionLegalEntity.Builder::class)
@NoAutoDetect
class ConnectionLegalEntity
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val connectionId: JsonField<String>,
    private val legalEntityId: JsonField<String>,
    private val status: JsonField<Status>,
    private val vendorId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The ID of the connection. */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    /** The ID of the legal entity. */
    fun legalEntityId(): String = legalEntityId.getRequired("legal_entity_id")

    /** The status of the connection legal entity. */
    fun status(): Status = status.getRequired("status")

    /** The ID of the legal entity at the vendor. */
    fun vendorId(): String = vendorId.getRequired("vendor_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** The ID of the connection. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /** The ID of the legal entity. */
    @JsonProperty("legal_entity_id") @ExcludeMissing fun _legalEntityId() = legalEntityId

    /** The status of the connection legal entity. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The ID of the legal entity at the vendor. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId() = vendorId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ConnectionLegalEntity = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            connectionId()
            legalEntityId()
            status()
            vendorId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var legalEntityId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(connectionLegalEntity: ConnectionLegalEntity) = apply {
            this.id = connectionLegalEntity.id
            this.object_ = connectionLegalEntity.object_
            this.liveMode = connectionLegalEntity.liveMode
            this.createdAt = connectionLegalEntity.createdAt
            this.updatedAt = connectionLegalEntity.updatedAt
            this.discardedAt = connectionLegalEntity.discardedAt
            this.connectionId = connectionLegalEntity.connectionId
            this.legalEntityId = connectionLegalEntity.legalEntityId
            this.status = connectionLegalEntity.status
            this.vendorId = connectionLegalEntity.vendorId
            additionalProperties(connectionLegalEntity.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The ID of the connection. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The ID of the connection. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** The ID of the legal entity. */
        fun legalEntityId(legalEntityId: String) = legalEntityId(JsonField.of(legalEntityId))

        /** The ID of the legal entity. */
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            this.legalEntityId = legalEntityId
        }

        /** The status of the connection legal entity. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the connection legal entity. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the legal entity at the vendor. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** The ID of the legal entity at the vendor. */
        @JsonProperty("vendor_id")
        @ExcludeMissing
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ConnectionLegalEntity =
            ConnectionLegalEntity(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                connectionId,
                legalEntityId,
                status,
                vendorId,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val COMPLETED = Status(JsonField.of("completed"))

            val DENIED = Status(JsonField.of("denied"))

            val FAILED = Status(JsonField.of("failed"))

            val PROCESSING = Status(JsonField.of("processing"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            DENIED,
            FAILED,
            PROCESSING,
        }

        enum class Value {
            COMPLETED,
            DENIED,
            FAILED,
            PROCESSING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                DENIED -> Value.DENIED
                FAILED -> Value.FAILED
                PROCESSING -> Value.PROCESSING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                DENIED -> Known.DENIED
                FAILED -> Known.FAILED
                PROCESSING -> Known.PROCESSING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionLegalEntity && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && connectionId == other.connectionId && legalEntityId == other.legalEntityId && status == other.status && vendorId == other.vendorId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, connectionId, legalEntityId, status, vendorId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionLegalEntity{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, connectionId=$connectionId, legalEntityId=$legalEntityId, status=$status, vendorId=$vendorId, additionalProperties=$additionalProperties}"
}
