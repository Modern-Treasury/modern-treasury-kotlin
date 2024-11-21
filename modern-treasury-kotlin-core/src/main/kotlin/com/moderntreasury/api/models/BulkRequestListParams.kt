// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class BulkRequestListParams
constructor(
    private val actionType: ActionType?,
    private val afterCursor: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val resourceType: ResourceType?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun actionType(): ActionType? = actionType

    fun afterCursor(): String? = afterCursor

    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    fun resourceType(): ResourceType? = resourceType

    fun status(): Status? = status

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.actionType?.let { queryParams.put("action_type", listOf(it.toString())) }
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.resourceType?.let { queryParams.put("resource_type", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var actionType: ActionType? = null
        private var afterCursor: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var resourceType: ResourceType? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(bulkRequestListParams: BulkRequestListParams) = apply {
            actionType = bulkRequestListParams.actionType
            afterCursor = bulkRequestListParams.afterCursor
            metadata = bulkRequestListParams.metadata
            perPage = bulkRequestListParams.perPage
            resourceType = bulkRequestListParams.resourceType
            status = bulkRequestListParams.status
            additionalHeaders = bulkRequestListParams.additionalHeaders.toBuilder()
            additionalQueryParams = bulkRequestListParams.additionalQueryParams.toBuilder()
        }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = apply { this.actionType = actionType }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = apply { this.resourceType = resourceType }

        /** One of pending, processing, or completed. */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): BulkRequestListParams =
            BulkRequestListParams(
                actionType,
                afterCursor,
                metadata,
                perPage,
                resourceType,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            val CREATE = ActionType(JsonField.of("create"))

            val UPDATE = ActionType(JsonField.of("update"))

            val DELETE = ActionType(JsonField.of("delete"))

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

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
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

            val PAYMENT_ORDER = ResourceType(JsonField.of("payment_order"))

            val LEDGER_TRANSACTION = ResourceType(JsonField.of("ledger_transaction"))

            val TRANSACTION = ResourceType(JsonField.of("transaction"))

            val EXPECTED_PAYMENT = ResourceType(JsonField.of("expected_payment"))

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

            val PENDING = Status(JsonField.of("pending"))

            val PROCESSING = Status(JsonField.of("processing"))

            val COMPLETED = Status(JsonField.of("completed"))

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

        return /* spotless:off */ other is BulkRequestListParams && actionType == other.actionType && afterCursor == other.afterCursor && metadata == other.metadata && perPage == other.perPage && resourceType == other.resourceType && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(actionType, afterCursor, metadata, perPage, resourceType, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BulkRequestListParams{actionType=$actionType, afterCursor=$afterCursor, metadata=$metadata, perPage=$perPage, resourceType=$resourceType, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
