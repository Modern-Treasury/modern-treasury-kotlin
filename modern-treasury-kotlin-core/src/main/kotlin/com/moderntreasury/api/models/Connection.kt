// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Connection.Builder::class)
@NoAutoDetect
class Connection
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val vendorId: JsonField<String>,
    private val vendorCustomerId: JsonField<String>,
    private val vendorName: JsonField<String>,
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
            this.id = connection.id
            this.object_ = connection.object_
            this.liveMode = connection.liveMode
            this.createdAt = connection.createdAt
            this.updatedAt = connection.updatedAt
            this.discardedAt = connection.discardedAt
            this.vendorId = connection.vendorId
            this.vendorCustomerId = connection.vendorCustomerId
            this.vendorName = connection.vendorName
            additionalProperties(connection.additionalProperties)
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

        /** Unique identifier for the bank or vendor. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** Unique identifier for the bank or vendor. */
        @JsonProperty("vendor_id")
        @ExcludeMissing
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /** An identifier given to this connection by the bank. */
        fun vendorCustomerId(vendorCustomerId: String) =
            vendorCustomerId(JsonField.of(vendorCustomerId))

        /** An identifier given to this connection by the bank. */
        @JsonProperty("vendor_customer_id")
        @ExcludeMissing
        fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
            this.vendorCustomerId = vendorCustomerId
        }

        /** A human-friendly name for the bank or vendor. */
        fun vendorName(vendorName: String) = vendorName(JsonField.of(vendorName))

        /** A human-friendly name for the bank or vendor. */
        @JsonProperty("vendor_name")
        @ExcludeMissing
        fun vendorName(vendorName: JsonField<String>) = apply { this.vendorName = vendorName }

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
