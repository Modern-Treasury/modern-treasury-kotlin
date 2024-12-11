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

@JsonDeserialize(builder = BulkRequest.Builder::class)
@NoAutoDetect
class BulkRequest
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val actionType: JsonField<ActionType>,
    private val resourceType: JsonField<ResourceType>,
    private val status: JsonField<Status>,
    private val totalResourceCount: JsonField<Long>,
    private val successResultCount: JsonField<Long>,
    private val failedResultCount: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
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

    /** One of create, or update. */
    fun actionType(): ActionType = actionType.getRequired("action_type")

    /** One of payment_order, expected_payment, or ledger_transaction. */
    fun resourceType(): ResourceType = resourceType.getRequired("resource_type")

    /** One of pending, processing, or completed. */
    fun status(): Status = status.getRequired("status")

    /**
     * Total number of items in the `resources` array. Once a bulk request is completed,
     * `success_result_count` + `failed_result_count` will be equal to `total_result_count`.
     */
    fun totalResourceCount(): Long = totalResourceCount.getRequired("total_resource_count")

    /** Total number of successful bulk results so far for this request */
    fun successResultCount(): Long = successResultCount.getRequired("success_result_count")

    /** Total number of failed bulk results so far for this request */
    fun failedResultCount(): Long = failedResultCount.getRequired("failed_result_count")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** One of create, or update. */
    @JsonProperty("action_type") @ExcludeMissing fun _actionType() = actionType

    /** One of payment_order, expected_payment, or ledger_transaction. */
    @JsonProperty("resource_type") @ExcludeMissing fun _resourceType() = resourceType

    /** One of pending, processing, or completed. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * Total number of items in the `resources` array. Once a bulk request is completed,
     * `success_result_count` + `failed_result_count` will be equal to `total_result_count`.
     */
    @JsonProperty("total_resource_count")
    @ExcludeMissing
    fun _totalResourceCount() = totalResourceCount

    /** Total number of successful bulk results so far for this request */
    @JsonProperty("success_result_count")
    @ExcludeMissing
    fun _successResultCount() = successResultCount

    /** Total number of failed bulk results so far for this request */
    @JsonProperty("failed_result_count")
    @ExcludeMissing
    fun _failedResultCount() = failedResultCount

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BulkRequest = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            actionType()
            resourceType()
            status()
            totalResourceCount()
            successResultCount()
            failedResultCount()
            metadata().validate()
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
        private var actionType: JsonField<ActionType> = JsonMissing.of()
        private var resourceType: JsonField<ResourceType> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var totalResourceCount: JsonField<Long> = JsonMissing.of()
        private var successResultCount: JsonField<Long> = JsonMissing.of()
        private var failedResultCount: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkRequest: BulkRequest) = apply {
            this.id = bulkRequest.id
            this.object_ = bulkRequest.object_
            this.liveMode = bulkRequest.liveMode
            this.createdAt = bulkRequest.createdAt
            this.updatedAt = bulkRequest.updatedAt
            this.actionType = bulkRequest.actionType
            this.resourceType = bulkRequest.resourceType
            this.status = bulkRequest.status
            this.totalResourceCount = bulkRequest.totalResourceCount
            this.successResultCount = bulkRequest.successResultCount
            this.failedResultCount = bulkRequest.failedResultCount
            this.metadata = bulkRequest.metadata
            additionalProperties(bulkRequest.additionalProperties)
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

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

        /** One of create, or update. */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun actionType(actionType: JsonField<ActionType>) = apply { this.actionType = actionType }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = resourceType(JsonField.of(resourceType))

        /** One of payment_order, expected_payment, or ledger_transaction. */
        @JsonProperty("resource_type")
        @ExcludeMissing
        fun resourceType(resourceType: JsonField<ResourceType>) = apply {
            this.resourceType = resourceType
        }

        /** One of pending, processing, or completed. */
        fun status(status: Status) = status(JsonField.of(status))

        /** One of pending, processing, or completed. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Total number of items in the `resources` array. Once a bulk request is completed,
         * `success_result_count` + `failed_result_count` will be equal to `total_result_count`.
         */
        fun totalResourceCount(totalResourceCount: Long) =
            totalResourceCount(JsonField.of(totalResourceCount))

        /**
         * Total number of items in the `resources` array. Once a bulk request is completed,
         * `success_result_count` + `failed_result_count` will be equal to `total_result_count`.
         */
        @JsonProperty("total_resource_count")
        @ExcludeMissing
        fun totalResourceCount(totalResourceCount: JsonField<Long>) = apply {
            this.totalResourceCount = totalResourceCount
        }

        /** Total number of successful bulk results so far for this request */
        fun successResultCount(successResultCount: Long) =
            successResultCount(JsonField.of(successResultCount))

        /** Total number of successful bulk results so far for this request */
        @JsonProperty("success_result_count")
        @ExcludeMissing
        fun successResultCount(successResultCount: JsonField<Long>) = apply {
            this.successResultCount = successResultCount
        }

        /** Total number of failed bulk results so far for this request */
        fun failedResultCount(failedResultCount: Long) =
            failedResultCount(JsonField.of(failedResultCount))

        /** Total number of failed bulk results so far for this request */
        @JsonProperty("failed_result_count")
        @ExcludeMissing
        fun failedResultCount(failedResultCount: JsonField<Long>) = apply {
            this.failedResultCount = failedResultCount
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun build(): BulkRequest =
            BulkRequest(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                actionType,
                resourceType,
                status,
                totalResourceCount,
                successResultCount,
                failedResultCount,
                metadata,
                additionalProperties.toImmutable(),
            )
    }

    class ActionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREATE = of("create")

            val UPDATE = of("update")

            val DELETE = of("delete")

            fun of(value: String) = ActionType(JsonField.of(value))
        }

        enum class Known {
            CREATE,
            UPDATE,
            DELETE,
        }

        enum class Value {
            CREATE,
            UPDATE,
            DELETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                else -> throw ModernTreasuryInvalidDataException("Unknown ActionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
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

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ResourceType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PAYMENT_ORDER = of("payment_order")

            val LEDGER_TRANSACTION = of("ledger_transaction")

            val TRANSACTION = of("transaction")

            val EXPECTED_PAYMENT = of("expected_payment")

            fun of(value: String) = ResourceType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
        }

        enum class Value {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Value.LEDGER_TRANSACTION
                TRANSACTION -> Value.TRANSACTION
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Known.LEDGER_TRANSACTION
                TRANSACTION -> Known.TRANSACTION
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                else -> throw ModernTreasuryInvalidDataException("Unknown ResourceType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            val PENDING = of("pending")

            val PROCESSING = of("processing")

            val COMPLETED = of("completed")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            PROCESSING,
            COMPLETED,
        }

        enum class Value {
            PENDING,
            PROCESSING,
            COMPLETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                COMPLETED -> Value.COMPLETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                COMPLETED -> Known.COMPLETED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequest && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && actionType == other.actionType && resourceType == other.resourceType && status == other.status && totalResourceCount == other.totalResourceCount && successResultCount == other.successResultCount && failedResultCount == other.failedResultCount && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, actionType, resourceType, status, totalResourceCount, successResultCount, failedResultCount, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkRequest{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, actionType=$actionType, resourceType=$resourceType, status=$status, totalResourceCount=$totalResourceCount, successResultCount=$successResultCount, failedResultCount=$failedResultCount, metadata=$metadata, additionalProperties=$additionalProperties}"
}
