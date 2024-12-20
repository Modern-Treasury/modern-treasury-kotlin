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
class Connection
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("vendor_id")
    @ExcludeMissing
    private val vendorId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("vendor_customer_id")
    @ExcludeMissing
    private val vendorCustomerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("vendor_name")
    @ExcludeMissing
    private val vendorName: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    /** Unique identifier for the bank or vendor. */
    fun vendorId(): String = vendorId.getRequired("vendor_id")

    /** An identifier given to this connection by the bank. */
    fun vendorCustomerId(): String? = vendorCustomerId.getNullable("vendor_customer_id")

    /** A human-friendly name for the bank or vendor. */
    fun vendorName(): String = vendorName.getRequired("vendor_name")

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

    /** Unique identifier for the bank or vendor. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId() = vendorId

    /** An identifier given to this connection by the bank. */
    @JsonProperty("vendor_customer_id") @ExcludeMissing fun _vendorCustomerId() = vendorCustomerId

    /** A human-friendly name for the bank or vendor. */
    @JsonProperty("vendor_name") @ExcludeMissing fun _vendorName() = vendorName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Connection = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            vendorId()
            vendorCustomerId()
            vendorName()
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
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var vendorCustomerId: JsonField<String> = JsonMissing.of()
        private var vendorName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(connection: Connection) = apply {
            id = connection.id
            object_ = connection.object_
            liveMode = connection.liveMode
            createdAt = connection.createdAt
            updatedAt = connection.updatedAt
            discardedAt = connection.discardedAt
            vendorId = connection.vendorId
            vendorCustomerId = connection.vendorCustomerId
            vendorName = connection.vendorName
            additionalProperties = connection.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

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
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** Unique identifier for the bank or vendor. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** Unique identifier for the bank or vendor. */
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /** An identifier given to this connection by the bank. */
        fun vendorCustomerId(vendorCustomerId: String) =
            vendorCustomerId(JsonField.of(vendorCustomerId))

        /** An identifier given to this connection by the bank. */
        fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
            this.vendorCustomerId = vendorCustomerId
        }

        /** A human-friendly name for the bank or vendor. */
        fun vendorName(vendorName: String) = vendorName(JsonField.of(vendorName))

        /** A human-friendly name for the bank or vendor. */
        fun vendorName(vendorName: JsonField<String>) = apply { this.vendorName = vendorName }

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

        fun build(): Connection =
            Connection(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                vendorId,
                vendorCustomerId,
                vendorName,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Connection && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && vendorId == other.vendorId && vendorCustomerId == other.vendorCustomerId && vendorName == other.vendorName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, vendorId, vendorCustomerId, vendorName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Connection{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, vendorId=$vendorId, vendorCustomerId=$vendorCustomerId, vendorName=$vendorName, additionalProperties=$additionalProperties}"
}
