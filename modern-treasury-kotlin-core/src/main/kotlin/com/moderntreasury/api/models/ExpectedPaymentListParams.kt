package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class ExpectedPaymentListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val status: Status?,
    private val internalAccountId: String?,
    private val direction: Direction?,
    private val type: Type?,
    private val counterpartyId: String?,
    private val metadata: Metadata?,
    private val createdAtLowerBound: OffsetDateTime?,
    private val createdAtUpperBound: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun status(): Status? = status

    fun internalAccountId(): String? = internalAccountId

    fun direction(): Direction? = direction

    fun type(): Type? = type

    fun counterpartyId(): String? = counterpartyId

    fun metadata(): Metadata? = metadata

    fun createdAtLowerBound(): OffsetDateTime? = createdAtLowerBound

    fun createdAtUpperBound(): OffsetDateTime? = createdAtUpperBound

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.internalAccountId?.let { params.put("internal_account_id", listOf(it.toString())) }
        this.direction?.let { params.put("direction", listOf(it.toString())) }
        this.type?.let { params.put("type", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.createdAtLowerBound?.let {
            params.put("created_at_lower_bound", listOf(it.toString()))
        }
        this.createdAtUpperBound?.let {
            params.put("created_at_upper_bound", listOf(it.toString()))
        }
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

        return other is ExpectedPaymentListParams &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.status == other.status &&
            this.internalAccountId == other.internalAccountId &&
            this.direction == other.direction &&
            this.type == other.type &&
            this.counterpartyId == other.counterpartyId &&
            this.metadata == other.metadata &&
            this.createdAtLowerBound == other.createdAtLowerBound &&
            this.createdAtUpperBound == other.createdAtUpperBound &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            perPage,
            status,
            internalAccountId,
            direction,
            type,
            counterpartyId,
            metadata,
            createdAtLowerBound,
            createdAtUpperBound,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ExpectedPaymentListParams{afterCursor=$afterCursor, perPage=$perPage, status=$status, internalAccountId=$internalAccountId, direction=$direction, type=$type, counterpartyId=$counterpartyId, metadata=$metadata, createdAtLowerBound=$createdAtLowerBound, createdAtUpperBound=$createdAtUpperBound, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var internalAccountId: String? = null
        private var direction: Direction? = null
        private var type: Type? = null
        private var counterpartyId: String? = null
        private var metadata: Metadata? = null
        private var createdAtLowerBound: OffsetDateTime? = null
        private var createdAtUpperBound: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(expectedPaymentListParams: ExpectedPaymentListParams) = apply {
            this.afterCursor = expectedPaymentListParams.afterCursor
            this.perPage = expectedPaymentListParams.perPage
            this.status = expectedPaymentListParams.status
            this.internalAccountId = expectedPaymentListParams.internalAccountId
            this.direction = expectedPaymentListParams.direction
            this.type = expectedPaymentListParams.type
            this.counterpartyId = expectedPaymentListParams.counterpartyId
            this.metadata = expectedPaymentListParams.metadata
            this.createdAtLowerBound = expectedPaymentListParams.createdAtLowerBound
            this.createdAtUpperBound = expectedPaymentListParams.createdAtUpperBound
            additionalQueryParams(expectedPaymentListParams.additionalQueryParams)
            additionalHeaders(expectedPaymentListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** One of unreconciled, reconciled, or archived. */
        fun status(status: Status) = apply { this.status = status }

        /** Specify internal_account_id to see expected_payments for a specific account. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** One of credit, debit */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp,sen, sepa,
         * signet, wire
         */
        fun type(type: Type) = apply { this.type = type }

        /** Specify counterparty_id to see expected_payments for a specific account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Used to return expected payments created after some datetime */
        fun createdAtLowerBound(createdAtLowerBound: OffsetDateTime) = apply {
            this.createdAtLowerBound = createdAtLowerBound
        }

        /** Used to return expected payments created before some datetime */
        fun createdAtUpperBound(createdAtUpperBound: OffsetDateTime) = apply {
            this.createdAtUpperBound = createdAtUpperBound
        }

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

        fun build(): ExpectedPaymentListParams =
            ExpectedPaymentListParams(
                afterCursor,
                perPage,
                status,
                internalAccountId,
                direction,
                type,
                counterpartyId,
                metadata,
                createdAtLowerBound,
                createdAtUpperBound,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
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

        private var hashCode: Int = 0

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
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

            val PARTIALLY_RECONCILED = Status(JsonField.of("partially_reconciled"))

            val RECONCILED = Status(JsonField.of("reconciled"))

            val UNRECONCILED = Status(JsonField.of("unreconciled"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            PARTIALLY_RECONCILED,
            RECONCILED,
            UNRECONCILED,
        }

        enum class Value {
            ARCHIVED,
            PARTIALLY_RECONCILED,
            RECONCILED,
            UNRECONCILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                PARTIALLY_RECONCILED -> Value.PARTIALLY_RECONCILED
                RECONCILED -> Value.RECONCILED
                UNRECONCILED -> Value.UNRECONCILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                PARTIALLY_RECONCILED -> Known.PARTIALLY_RECONCILED
                RECONCILED -> Known.RECONCILED
                UNRECONCILED -> Known.UNRECONCILED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = Type(JsonField.of("ach"))

            val AU_BECS = Type(JsonField.of("au_becs"))

            val BACS = Type(JsonField.of("bacs"))

            val BOOK = Type(JsonField.of("book"))

            val CARD = Type(JsonField.of("card"))

            val CHECK = Type(JsonField.of("check"))

            val CROSS_BORDER = Type(JsonField.of("cross_border"))

            val EFT = Type(JsonField.of("eft"))

            val INTERAC = Type(JsonField.of("interac"))

            val MASAV = Type(JsonField.of("masav"))

            val NEFT = Type(JsonField.of("neft"))

            val NICS = Type(JsonField.of("nics"))

            val PROVXCHANGE = Type(JsonField.of("provxchange"))

            val RTP = Type(JsonField.of("rtp"))

            val SE_BANKGIROT = Type(JsonField.of("se_bankgirot"))

            val SEN = Type(JsonField.of("sen"))

            val SEPA = Type(JsonField.of("sepa"))

            val SIC = Type(JsonField.of("sic"))

            val SIGNET = Type(JsonField.of("signet"))

            val WIRE = Type(JsonField.of("wire"))

            val ZENGIN = Type(JsonField.of("zengin"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHECK,
            CROSS_BORDER,
            EFT,
            INTERAC,
            MASAV,
            NEFT,
            NICS,
            PROVXCHANGE,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SIC,
            SIGNET,
            WIRE,
            ZENGIN,
        }

        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHECK,
            CROSS_BORDER,
            EFT,
            INTERAC,
            MASAV,
            NEFT,
            NICS,
            PROVXCHANGE,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SIC,
            SIGNET,
            WIRE,
            ZENGIN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                PROVXCHANGE -> Value.PROVXCHANGE
                RTP -> Value.RTP
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                PROVXCHANGE -> Known.PROVXCHANGE
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
