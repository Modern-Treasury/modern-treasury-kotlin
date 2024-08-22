// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class IncomingPaymentDetailListParams
constructor(
    private val afterCursor: String?,
    private val asOfDateEnd: LocalDate?,
    private val asOfDateStart: LocalDate?,
    private val direction: TransactionDirection?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val status: Status?,
    private val type: Type?,
    private val virtualAccountId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun asOfDateEnd(): LocalDate? = asOfDateEnd

    fun asOfDateStart(): LocalDate? = asOfDateStart

    fun direction(): TransactionDirection? = direction

    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    fun status(): Status? = status

    fun type(): Type? = type

    fun virtualAccountId(): String? = virtualAccountId

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.asOfDateEnd?.let { params.put("as_of_date_end", listOf(it.toString())) }
        this.asOfDateStart?.let { params.put("as_of_date_start", listOf(it.toString())) }
        this.direction?.let { params.put("direction", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.type?.let { params.put("type", listOf(it.toString())) }
        this.virtualAccountId?.let { params.put("virtual_account_id", listOf(it.toString())) }
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

        return other is IncomingPaymentDetailListParams &&
            this.afterCursor == other.afterCursor &&
            this.asOfDateEnd == other.asOfDateEnd &&
            this.asOfDateStart == other.asOfDateStart &&
            this.direction == other.direction &&
            this.metadata == other.metadata &&
            this.perPage == other.perPage &&
            this.status == other.status &&
            this.type == other.type &&
            this.virtualAccountId == other.virtualAccountId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            asOfDateEnd,
            asOfDateStart,
            direction,
            metadata,
            perPage,
            status,
            type,
            virtualAccountId,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "IncomingPaymentDetailListParams{afterCursor=$afterCursor, asOfDateEnd=$asOfDateEnd, asOfDateStart=$asOfDateStart, direction=$direction, metadata=$metadata, perPage=$perPage, status=$status, type=$type, virtualAccountId=$virtualAccountId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var asOfDateEnd: LocalDate? = null
        private var asOfDateStart: LocalDate? = null
        private var direction: TransactionDirection? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var virtualAccountId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(incomingPaymentDetailListParams: IncomingPaymentDetailListParams) =
            apply {
                this.afterCursor = incomingPaymentDetailListParams.afterCursor
                this.asOfDateEnd = incomingPaymentDetailListParams.asOfDateEnd
                this.asOfDateStart = incomingPaymentDetailListParams.asOfDateStart
                this.direction = incomingPaymentDetailListParams.direction
                this.metadata = incomingPaymentDetailListParams.metadata
                this.perPage = incomingPaymentDetailListParams.perPage
                this.status = incomingPaymentDetailListParams.status
                this.type = incomingPaymentDetailListParams.type
                this.virtualAccountId = incomingPaymentDetailListParams.virtualAccountId
                additionalQueryParams(incomingPaymentDetailListParams.additionalQueryParams)
                additionalHeaders(incomingPaymentDetailListParams.additionalHeaders)
            }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * Filters incoming payment details with an as_of_date starting on or before the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateEnd(asOfDateEnd: LocalDate) = apply { this.asOfDateEnd = asOfDateEnd }

        /**
         * Filters incoming payment details with an as_of_date starting on or after the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateStart(asOfDateStart: LocalDate) = apply { this.asOfDateStart = asOfDateStart }

        /** One of `credit` or `debit`. */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: Status) = apply { this.status = status }

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Type) = apply { this.type = type }

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: String) = apply {
            this.virtualAccountId = virtualAccountId
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

        fun build(): IncomingPaymentDetailListParams =
            IncomingPaymentDetailListParams(
                afterCursor,
                asOfDateEnd,
                asOfDateStart,
                direction,
                metadata,
                perPage,
                status,
                type,
                virtualAccountId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
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
    ) : Enum {

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

            val COMPLETED = Status(JsonField.of("completed"))

            val PENDING = Status(JsonField.of("pending"))

            val RETURNED = Status(JsonField.of("returned"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
        }

        enum class Value {
            COMPLETED,
            PENDING,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val BOOK = Type(JsonField.of("book"))

            val CHECK = Type(JsonField.of("check"))

            val EFT = Type(JsonField.of("eft"))

            val INTERAC = Type(JsonField.of("interac"))

            val RTP = Type(JsonField.of("rtp"))

            val SEPA = Type(JsonField.of("sepa"))

            val SIGNET = Type(JsonField.of("signet"))

            val WIRE = Type(JsonField.of("wire"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
        }

        enum class Value {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
