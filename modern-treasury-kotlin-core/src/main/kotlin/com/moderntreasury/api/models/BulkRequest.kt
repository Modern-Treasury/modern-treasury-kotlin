// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class BulkRequest
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("action_type")
    @ExcludeMissing
    private val actionType: JsonField<ActionType> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("failed_result_count")
    @ExcludeMissing
    private val failedResultCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resource_type")
    @ExcludeMissing
    private val resourceType: JsonField<ResourceType> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("success_result_count")
    @ExcludeMissing
    private val successResultCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("total_resource_count")
    @ExcludeMissing
    private val totalResourceCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** One of create, or update. */
    fun actionType(): ActionType = actionType.getRequired("action_type")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Total number of failed bulk results so far for this request */
    fun failedResultCount(): Long = failedResultCount.getRequired("failed_result_count")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /** One of payment_order, expected_payment, or ledger_transaction. */
    fun resourceType(): ResourceType = resourceType.getRequired("resource_type")

    /** One of pending, processing, or completed. */
    fun status(): Status = status.getRequired("status")

    /** Total number of successful bulk results so far for this request */
    fun successResultCount(): Long = successResultCount.getRequired("success_result_count")

    /**
     * Total number of items in the `resources` array. Once a bulk request is completed,
     * `success_result_count` + `failed_result_count` will be equal to `total_result_count`.
     */
    fun totalResourceCount(): Long = totalResourceCount.getRequired("total_resource_count")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** One of create, or update. */
    @JsonProperty("action_type")
    @ExcludeMissing
    fun _actionType(): JsonField<ActionType> = actionType

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Total number of failed bulk results so far for this request */
    @JsonProperty("failed_result_count")
    @ExcludeMissing
    fun _failedResultCount(): JsonField<Long> = failedResultCount

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** One of payment_order, expected_payment, or ledger_transaction. */
    @JsonProperty("resource_type")
    @ExcludeMissing
    fun _resourceType(): JsonField<ResourceType> = resourceType

    /** One of pending, processing, or completed. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** Total number of successful bulk results so far for this request */
    @JsonProperty("success_result_count")
    @ExcludeMissing
    fun _successResultCount(): JsonField<Long> = successResultCount

    /**
     * Total number of items in the `resources` array. Once a bulk request is completed,
     * `success_result_count` + `failed_result_count` will be equal to `total_result_count`.
     */
    @JsonProperty("total_resource_count")
    @ExcludeMissing
    fun _totalResourceCount(): JsonField<Long> = totalResourceCount

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BulkRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        actionType()
        createdAt()
        failedResultCount()
        liveMode()
        metadata().validate()
        object_()
        resourceType()
        status()
        successResultCount()
        totalResourceCount()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var actionType: JsonField<ActionType>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var failedResultCount: JsonField<Long>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var resourceType: JsonField<ResourceType>? = null
        private var status: JsonField<Status>? = null
        private var successResultCount: JsonField<Long>? = null
        private var totalResourceCount: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkRequest: BulkRequest) = apply {
            id = bulkRequest.id
            actionType = bulkRequest.actionType
            createdAt = bulkRequest.createdAt
            failedResultCount = bulkRequest.failedResultCount
            liveMode = bulkRequest.liveMode
            metadata = bulkRequest.metadata
            object_ = bulkRequest.object_
            resourceType = bulkRequest.resourceType
            status = bulkRequest.status
            successResultCount = bulkRequest.successResultCount
            totalResourceCount = bulkRequest.totalResourceCount
            updatedAt = bulkRequest.updatedAt
            additionalProperties = bulkRequest.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

        /** One of create, or update. */
        fun actionType(actionType: JsonField<ActionType>) = apply { this.actionType = actionType }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Total number of failed bulk results so far for this request */
        fun failedResultCount(failedResultCount: Long) =
            failedResultCount(JsonField.of(failedResultCount))

        /** Total number of failed bulk results so far for this request */
        fun failedResultCount(failedResultCount: JsonField<Long>) = apply {
            this.failedResultCount = failedResultCount
        }

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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = resourceType(JsonField.of(resourceType))

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: JsonField<ResourceType>) = apply {
            this.resourceType = resourceType
        }

        /** One of pending, processing, or completed. */
        fun status(status: Status) = status(JsonField.of(status))

        /** One of pending, processing, or completed. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Total number of successful bulk results so far for this request */
        fun successResultCount(successResultCount: Long) =
            successResultCount(JsonField.of(successResultCount))

        /** Total number of successful bulk results so far for this request */
        fun successResultCount(successResultCount: JsonField<Long>) = apply {
            this.successResultCount = successResultCount
        }

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
        fun totalResourceCount(totalResourceCount: JsonField<Long>) = apply {
            this.totalResourceCount = totalResourceCount
        }

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

        fun build(): BulkRequest =
            BulkRequest(
                checkRequired("id", id),
                checkRequired("actionType", actionType),
                checkRequired("createdAt", createdAt),
                checkRequired("failedResultCount", failedResultCount),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("resourceType", resourceType),
                checkRequired("status", status),
                checkRequired("successResultCount", successResultCount),
                checkRequired("totalResourceCount", totalResourceCount),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    class ActionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequest && id == other.id && actionType == other.actionType && createdAt == other.createdAt && failedResultCount == other.failedResultCount && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && resourceType == other.resourceType && status == other.status && successResultCount == other.successResultCount && totalResourceCount == other.totalResourceCount && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, actionType, createdAt, failedResultCount, liveMode, metadata, object_, resourceType, status, successResultCount, totalResourceCount, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkRequest{id=$id, actionType=$actionType, createdAt=$createdAt, failedResultCount=$failedResultCount, liveMode=$liveMode, metadata=$metadata, object_=$object_, resourceType=$resourceType, status=$status, successResultCount=$successResultCount, totalResourceCount=$totalResourceCount, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
