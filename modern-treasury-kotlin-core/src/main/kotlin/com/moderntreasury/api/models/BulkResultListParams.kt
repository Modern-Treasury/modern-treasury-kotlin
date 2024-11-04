// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class BulkResultListParams
constructor(
    private val afterCursor: String?,
    private val entityId: String?,
    private val entityType: EntityType?,
    private val perPage: Long?,
    private val requestId: String?,
    private val requestType: RequestType?,
    private val status: Status?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun entityId(): String? = entityId

    fun entityType(): EntityType? = entityType

    fun perPage(): Long? = perPage

    fun requestId(): String? = requestId

    fun requestType(): RequestType? = requestType

    fun status(): Status? = status

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.entityId?.let { params.put("entity_id", listOf(it.toString())) }
        this.entityType?.let { params.put("entity_type", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.requestId?.let { params.put("request_id", listOf(it.toString())) }
        this.requestType?.let { params.put("request_type", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkResultListParams && this.afterCursor == other.afterCursor && this.entityId == other.entityId && this.entityType == other.entityType && this.perPage == other.perPage && this.requestId == other.requestId && this.requestType == other.requestType && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, entityId, entityType, perPage, requestId, requestType, status, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "BulkResultListParams{afterCursor=$afterCursor, entityId=$entityId, entityType=$entityType, perPage=$perPage, requestId=$requestId, requestType=$requestType, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var entityId: String? = null
        private var entityType: EntityType? = null
        private var perPage: Long? = null
        private var requestId: String? = null
        private var requestType: RequestType? = null
        private var status: Status? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(bulkResultListParams: BulkResultListParams) = apply {
            this.afterCursor = bulkResultListParams.afterCursor
            this.entityId = bulkResultListParams.entityId
            this.entityType = bulkResultListParams.entityType
            this.perPage = bulkResultListParams.perPage
            this.requestId = bulkResultListParams.requestId
            this.requestType = bulkResultListParams.requestType
            this.status = bulkResultListParams.status
            additionalHeaders(bulkResultListParams.additionalHeaders)
            additionalQueryParams(bulkResultListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Unique identifier for the result entity object. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The type of the request that created this result. bulk_request is the only supported
         * `request_type`
         */
        fun entityType(entityType: EntityType) = apply { this.entityType = entityType }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Unique identifier for the request that created this bulk result. This is the ID of the
         * bulk request when `request_type` is bulk_request
         */
        fun requestId(requestId: String) = apply { this.requestId = requestId }

        /**
         * The type of the request that created this result. bulk_request is the only supported
         * `request_type`
         */
        fun requestType(requestType: RequestType) = apply { this.requestType = requestType }

        /** One of successful or failed. */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): BulkResultListParams =
            BulkResultListParams(
                afterCursor,
                entityId,
                entityType,
                perPage,
                requestId,
                requestType,
                status,
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

    class EntityType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntityType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PAYMENT_ORDER = EntityType(JsonField.of("payment_order"))

            val LEDGER_TRANSACTION = EntityType(JsonField.of("ledger_transaction"))

            val TRANSACTION = EntityType(JsonField.of("transaction"))

            val EXPECTED_PAYMENT = EntityType(JsonField.of("expected_payment"))

            val BULK_ERROR = EntityType(JsonField.of("bulk_error"))

            fun of(value: String) = EntityType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            BULK_ERROR,
        }

        enum class Value {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            BULK_ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Value.LEDGER_TRANSACTION
                TRANSACTION -> Value.TRANSACTION
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                BULK_ERROR -> Value.BULK_ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Known.LEDGER_TRANSACTION
                TRANSACTION -> Known.TRANSACTION
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                BULK_ERROR -> Known.BULK_ERROR
                else -> throw ModernTreasuryInvalidDataException("Unknown EntityType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class RequestType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequestType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BULK_REQUEST = RequestType(JsonField.of("bulk_request"))

            fun of(value: String) = RequestType(JsonField.of(value))
        }

        enum class Known {
            BULK_REQUEST,
        }

        enum class Value {
            BULK_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BULK_REQUEST -> Value.BULK_REQUEST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BULK_REQUEST -> Known.BULK_REQUEST
                else -> throw ModernTreasuryInvalidDataException("Unknown RequestType: $value")
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

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val SUCCESSFUL = Status(JsonField.of("successful"))

            val FAILED = Status(JsonField.of("failed"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            SUCCESSFUL,
            FAILED,
        }

        enum class Value {
            PENDING,
            SUCCESSFUL,
            FAILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                SUCCESSFUL -> Value.SUCCESSFUL
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                SUCCESSFUL -> Known.SUCCESSFUL
                FAILED -> Known.FAILED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
