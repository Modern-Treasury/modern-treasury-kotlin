package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class LedgerTransactionCreateReversalParams
constructor(
    private val ledgerTransactionId: String,
    private val description: String?,
    private val status: Status?,
    private val metadata: Metadata?,
    private val effectiveAt: LocalDate?,
    private val externalId: String?,
    private val ledgerableType: LedgerableType?,
    private val ledgerableId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun ledgerTransactionId(): String = ledgerTransactionId

    fun description(): String? = description

    fun status(): Status? = status

    fun metadata(): Metadata? = metadata

    fun effectiveAt(): LocalDate? = effectiveAt

    fun externalId(): String? = externalId

    fun ledgerableType(): LedgerableType? = ledgerableType

    fun ledgerableId(): String? = ledgerableId

    internal fun getBody(): LedgerTransactionCreateReversalBody {
        return LedgerTransactionCreateReversalBody(
            description,
            status,
            metadata,
            effectiveAt,
            externalId,
            ledgerableType,
            ledgerableId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> ledgerTransactionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = LedgerTransactionCreateReversalBody.Builder::class)
    @NoAutoDetect
    class LedgerTransactionCreateReversalBody
    internal constructor(
        private val description: String?,
        private val status: Status?,
        private val metadata: Metadata?,
        private val effectiveAt: LocalDate?,
        private val externalId: String?,
        private val ledgerableType: LedgerableType?,
        private val ledgerableId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * An optional free-form description for the reversal ledger transaction. Maximum of 1000
         * characters allowed.
         */
        @JsonProperty("description") fun description(): String? = description

        /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * Additional data to be added to the reversal ledger transaction as key-value pairs. Both
         * the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        @JsonProperty("effective_at") fun effectiveAt(): LocalDate? = effectiveAt

        /** Must be unique within the ledger. */
        @JsonProperty("external_id") fun externalId(): String? = externalId

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerTransactionCreateReversalBody &&
                this.description == other.description &&
                this.status == other.status &&
                this.metadata == other.metadata &&
                this.effectiveAt == other.effectiveAt &&
                this.externalId == other.externalId &&
                this.ledgerableType == other.ledgerableType &&
                this.ledgerableId == other.ledgerableId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        externalId,
                        ledgerableType,
                        ledgerableId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerTransactionCreateReversalBody{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var status: Status? = null
            private var metadata: Metadata? = null
            private var effectiveAt: LocalDate? = null
            private var externalId: String? = null
            private var ledgerableType: LedgerableType? = null
            private var ledgerableId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerTransactionCreateReversalBody: LedgerTransactionCreateReversalBody
            ) = apply {
                this.description = ledgerTransactionCreateReversalBody.description
                this.status = ledgerTransactionCreateReversalBody.status
                this.metadata = ledgerTransactionCreateReversalBody.metadata
                this.effectiveAt = ledgerTransactionCreateReversalBody.effectiveAt
                this.externalId = ledgerTransactionCreateReversalBody.externalId
                this.ledgerableType = ledgerTransactionCreateReversalBody.ledgerableType
                this.ledgerableId = ledgerTransactionCreateReversalBody.ledgerableId
                additionalProperties(ledgerTransactionCreateReversalBody.additionalProperties)
            }

            /**
             * An optional free-form description for the reversal ledger transaction. Maximum of
             * 1000 characters allowed.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Status of the reversal ledger transaction. It defaults to `posted` if not provided.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * Additional data to be added to the reversal ledger transaction as key-value pairs.
             * Both the key and value must be strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
             * reporting purposes. It defaults to the `effective_at` of the original ledger
             * transaction if not provided.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(effectiveAt: LocalDate) = apply { this.effectiveAt = effectiveAt }

            /** Must be unique within the ledger. */
            @JsonProperty("external_id")
            fun externalId(externalId: String) = apply { this.externalId = externalId }

            /**
             * Specify this if you'd like to link the reversal ledger transaction to a Payment
             * object like Return or Reversal.
             */
            @JsonProperty("ledgerable_type")
            fun ledgerableType(ledgerableType: LedgerableType) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * Specify this if you'd like to link the reversal ledger transaction to a Payment
             * object like Return or Reversal.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

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

            fun build(): LedgerTransactionCreateReversalBody =
                LedgerTransactionCreateReversalBody(
                    description,
                    status,
                    metadata,
                    effectiveAt,
                    externalId,
                    ledgerableType,
                    ledgerableId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerTransactionCreateReversalParams &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.description == other.description &&
            this.status == other.status &&
            this.metadata == other.metadata &&
            this.effectiveAt == other.effectiveAt &&
            this.externalId == other.externalId &&
            this.ledgerableType == other.ledgerableType &&
            this.ledgerableId == other.ledgerableId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            ledgerTransactionId,
            description,
            status,
            metadata,
            effectiveAt,
            externalId,
            ledgerableType,
            ledgerableId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LedgerTransactionCreateReversalParams{ledgerTransactionId=$ledgerTransactionId, description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var ledgerTransactionId: String? = null
        private var description: String? = null
        private var status: Status? = null
        private var metadata: Metadata? = null
        private var effectiveAt: LocalDate? = null
        private var externalId: String? = null
        private var ledgerableType: LedgerableType? = null
        private var ledgerableId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            ledgerTransactionCreateReversalParams: LedgerTransactionCreateReversalParams
        ) = apply {
            this.ledgerTransactionId = ledgerTransactionCreateReversalParams.ledgerTransactionId
            this.description = ledgerTransactionCreateReversalParams.description
            this.status = ledgerTransactionCreateReversalParams.status
            this.metadata = ledgerTransactionCreateReversalParams.metadata
            this.effectiveAt = ledgerTransactionCreateReversalParams.effectiveAt
            this.externalId = ledgerTransactionCreateReversalParams.externalId
            this.ledgerableType = ledgerTransactionCreateReversalParams.ledgerableType
            this.ledgerableId = ledgerTransactionCreateReversalParams.ledgerableId
            additionalQueryParams(ledgerTransactionCreateReversalParams.additionalQueryParams)
            additionalHeaders(ledgerTransactionCreateReversalParams.additionalHeaders)
            additionalBodyProperties(ledgerTransactionCreateReversalParams.additionalBodyProperties)
        }

        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * An optional free-form description for the reversal ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(description: String) = apply { this.description = description }

        /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
        fun status(status: Status) = apply { this.status = status }

        /**
         * Additional data to be added to the reversal ledger transaction as key-value pairs. Both
         * the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        fun effectiveAt(effectiveAt: LocalDate) = apply { this.effectiveAt = effectiveAt }

        /** Must be unique within the ledger. */
        fun externalId(externalId: String) = apply { this.externalId = externalId }

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableType(ledgerableType: LedgerableType) = apply {
            this.ledgerableType = ledgerableType
        }

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): LedgerTransactionCreateReversalParams =
            LedgerTransactionCreateReversalParams(
                checkNotNull(ledgerTransactionId) {
                    "`ledgerTransactionId` is required but was not set"
                },
                description,
                status,
                metadata,
                effectiveAt,
                externalId,
                ledgerableType,
                ledgerableId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ARCHIVED = Status(JsonField.of("archived"))

            val PENDING = Status(JsonField.of("pending"))

            val POSTED = Status(JsonField.of("posted"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            PENDING,
            POSTED,
        }

        enum class Value {
            ARCHIVED,
            PENDING,
            POSTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Additional data to be added to the reversal ledger transaction as key-value pairs. Both the
     * key and value must be strings.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }

    class LedgerableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

            val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

            val INCOMING_PAYMENT_DETAIL = LedgerableType(JsonField.of("incoming_payment_detail"))

            val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

            val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

            val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

            val PAYMENT_ORDER_ATTEMPT = LedgerableType(JsonField.of("payment_order_attempt"))

            val RETURN = LedgerableType(JsonField.of("return"))

            val REVERSAL = LedgerableType(JsonField.of("reversal"))

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        enum class Known {
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            LINE_ITEM,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            LINE_ITEM,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COUNTERPARTY -> Value.COUNTERPARTY
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                LINE_ITEM -> Value.LINE_ITEM
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COUNTERPARTY -> Known.COUNTERPARTY
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                LINE_ITEM -> Known.LINE_ITEM
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
