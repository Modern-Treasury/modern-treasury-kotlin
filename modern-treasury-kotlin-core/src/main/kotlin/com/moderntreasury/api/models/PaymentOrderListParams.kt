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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class PaymentOrderListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val createdAtEnd: LocalDate?,
    private val createdAtStart: LocalDate?,
    private val direction: TransactionDirection?,
    private val effectiveDateEnd: LocalDate?,
    private val effectiveDateStart: LocalDate?,
    private val metadata: Metadata?,
    private val originatingAccountId: String?,
    private val perPage: Long?,
    private val priority: Priority?,
    private val processAfterEnd: OffsetDateTime?,
    private val processAfterStart: OffsetDateTime?,
    private val referenceNumber: String?,
    private val status: Status?,
    private val transactionId: String?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): String? = afterCursor

    fun counterpartyId(): String? = counterpartyId

    fun createdAtEnd(): LocalDate? = createdAtEnd

    fun createdAtStart(): LocalDate? = createdAtStart

    fun direction(): TransactionDirection? = direction

    fun effectiveDateEnd(): LocalDate? = effectiveDateEnd

    fun effectiveDateStart(): LocalDate? = effectiveDateStart

    fun metadata(): Metadata? = metadata

    fun originatingAccountId(): String? = originatingAccountId

    fun perPage(): Long? = perPage

    fun priority(): Priority? = priority

    fun processAfterEnd(): OffsetDateTime? = processAfterEnd

    fun processAfterStart(): OffsetDateTime? = processAfterStart

    fun referenceNumber(): String? = referenceNumber

    fun status(): Status? = status

    fun transactionId(): String? = transactionId

    fun type(): Type? = type

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { queryParams.put("counterparty_id", listOf(it.toString())) }
        this.createdAtEnd?.let { queryParams.put("created_at_end", listOf(it.toString())) }
        this.createdAtStart?.let { queryParams.put("created_at_start", listOf(it.toString())) }
        this.direction?.let { queryParams.put("direction", listOf(it.toString())) }
        this.effectiveDateEnd?.let { queryParams.put("effective_date_end", listOf(it.toString())) }
        this.effectiveDateStart?.let {
            queryParams.put("effective_date_start", listOf(it.toString()))
        }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.originatingAccountId?.let {
            queryParams.put("originating_account_id", listOf(it.toString()))
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.priority?.let { queryParams.put("priority", listOf(it.toString())) }
        this.processAfterEnd?.let {
            queryParams.put(
                "process_after_end",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.processAfterStart?.let {
            queryParams.put(
                "process_after_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.referenceNumber?.let { queryParams.put("reference_number", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.transactionId?.let { queryParams.put("transaction_id", listOf(it.toString())) }
        this.type?.let { queryParams.put("type", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var counterpartyId: String? = null
        private var createdAtEnd: LocalDate? = null
        private var createdAtStart: LocalDate? = null
        private var direction: TransactionDirection? = null
        private var effectiveDateEnd: LocalDate? = null
        private var effectiveDateStart: LocalDate? = null
        private var metadata: Metadata? = null
        private var originatingAccountId: String? = null
        private var perPage: Long? = null
        private var priority: Priority? = null
        private var processAfterEnd: OffsetDateTime? = null
        private var processAfterStart: OffsetDateTime? = null
        private var referenceNumber: String? = null
        private var status: Status? = null
        private var transactionId: String? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentOrderListParams: PaymentOrderListParams) = apply {
            afterCursor = paymentOrderListParams.afterCursor
            counterpartyId = paymentOrderListParams.counterpartyId
            createdAtEnd = paymentOrderListParams.createdAtEnd
            createdAtStart = paymentOrderListParams.createdAtStart
            direction = paymentOrderListParams.direction
            effectiveDateEnd = paymentOrderListParams.effectiveDateEnd
            effectiveDateStart = paymentOrderListParams.effectiveDateStart
            metadata = paymentOrderListParams.metadata
            originatingAccountId = paymentOrderListParams.originatingAccountId
            perPage = paymentOrderListParams.perPage
            priority = paymentOrderListParams.priority
            processAfterEnd = paymentOrderListParams.processAfterEnd
            processAfterStart = paymentOrderListParams.processAfterStart
            referenceNumber = paymentOrderListParams.referenceNumber
            status = paymentOrderListParams.status
            transactionId = paymentOrderListParams.transactionId
            type = paymentOrderListParams.type
            additionalHeaders = paymentOrderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentOrderListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** An inclusive upper bound for searching created_at */
        fun createdAtEnd(createdAtEnd: LocalDate) = apply { this.createdAtEnd = createdAtEnd }

        /** An inclusive lower bound for searching created_at */
        fun createdAtStart(createdAtStart: LocalDate) = apply {
            this.createdAtStart = createdAtStart
        }

        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /** An inclusive upper bound for searching effective_date */
        fun effectiveDateEnd(effectiveDateEnd: LocalDate) = apply {
            this.effectiveDateEnd = effectiveDateEnd
        }

        /** An inclusive lower bound for searching effective_date */
        fun effectiveDateStart(effectiveDateStart: LocalDate) = apply {
            this.effectiveDateStart = effectiveDateStart
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = apply { this.priority = priority }

        /** An inclusive upper bound for searching process_after */
        fun processAfterEnd(processAfterEnd: OffsetDateTime) = apply {
            this.processAfterEnd = processAfterEnd
        }

        /** An inclusive lower bound for searching process_after */
        fun processAfterStart(processAfterStart: OffsetDateTime) = apply {
            this.processAfterStart = processAfterStart
        }

        /** Query for records with the provided reference number */
        fun referenceNumber(referenceNumber: String) = apply {
            this.referenceNumber = referenceNumber
        }

        fun status(status: Status) = apply { this.status = status }

        /** The ID of a transaction that the payment order has been reconciled to. */
        fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

        fun type(type: Type) = apply { this.type = type }

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

        fun build(): PaymentOrderListParams =
            PaymentOrderListParams(
                afterCursor,
                counterpartyId,
                createdAtEnd,
                createdAtStart,
                direction,
                effectiveDateEnd,
                effectiveDateStart,
                metadata,
                originatingAccountId,
                perPage,
                priority,
                processAfterEnd,
                processAfterStart,
                referenceNumber,
                status,
                transactionId,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    class Priority
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val HIGH = Priority(JsonField.of("high"))

            val NORMAL = Priority(JsonField.of("normal"))

            fun of(value: String) = Priority(JsonField.of(value))
        }

        enum class Known {
            HIGH,
            NORMAL,
        }

        enum class Value {
            HIGH,
            NORMAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
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

            val APPROVED = Status(JsonField.of("approved"))

            val CANCELLED = Status(JsonField.of("cancelled"))

            val COMPLETED = Status(JsonField.of("completed"))

            val DENIED = Status(JsonField.of("denied"))

            val FAILED = Status(JsonField.of("failed"))

            val NEEDS_APPROVAL = Status(JsonField.of("needs_approval"))

            val PENDING = Status(JsonField.of("pending"))

            val PROCESSING = Status(JsonField.of("processing"))

            val RETURNED = Status(JsonField.of("returned"))

            val REVERSED = Status(JsonField.of("reversed"))

            val SENT = Status(JsonField.of("sent"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
        }

        enum class Value {
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                DENIED -> Value.DENIED
                FAILED -> Value.FAILED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                RETURNED -> Value.RETURNED
                REVERSED -> Value.REVERSED
                SENT -> Value.SENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                DENIED -> Known.DENIED
                FAILED -> Known.FAILED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                RETURNED -> Known.RETURNED
                REVERSED -> Known.REVERSED
                SENT -> Known.SENT
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = Type(JsonField.of("ach"))

            val AU_BECS = Type(JsonField.of("au_becs"))

            val BACS = Type(JsonField.of("bacs"))

            val BOOK = Type(JsonField.of("book"))

            val CARD = Type(JsonField.of("card"))

            val CHATS = Type(JsonField.of("chats"))

            val CHECK = Type(JsonField.of("check"))

            val CROSS_BORDER = Type(JsonField.of("cross_border"))

            val DK_NETS = Type(JsonField.of("dk_nets"))

            val EFT = Type(JsonField.of("eft"))

            val HU_ICS = Type(JsonField.of("hu_ics"))

            val INTERAC = Type(JsonField.of("interac"))

            val MASAV = Type(JsonField.of("masav"))

            val MX_CCEN = Type(JsonField.of("mx_ccen"))

            val NEFT = Type(JsonField.of("neft"))

            val NICS = Type(JsonField.of("nics"))

            val NZ_BECS = Type(JsonField.of("nz_becs"))

            val PL_ELIXIR = Type(JsonField.of("pl_elixir"))

            val PROVXCHANGE = Type(JsonField.of("provxchange"))

            val RO_SENT = Type(JsonField.of("ro_sent"))

            val RTP = Type(JsonField.of("rtp"))

            val SE_BANKGIROT = Type(JsonField.of("se_bankgirot"))

            val SEN = Type(JsonField.of("sen"))

            val SEPA = Type(JsonField.of("sepa"))

            val SG_GIRO = Type(JsonField.of("sg_giro"))

            val SIC = Type(JsonField.of("sic"))

            val SIGNET = Type(JsonField.of("signet"))

            val SKNBI = Type(JsonField.of("sknbi"))

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
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
        }

        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
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
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                MX_CCEN -> Value.MX_CCEN
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PL_ELIXIR -> Value.PL_ELIXIR
                PROVXCHANGE -> Value.PROVXCHANGE
                RO_SENT -> Value.RO_SENT
                RTP -> Value.RTP
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SG_GIRO -> Value.SG_GIRO
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                SKNBI -> Value.SKNBI
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
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                MX_CCEN -> Known.MX_CCEN
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PL_ELIXIR -> Known.PL_ELIXIR
                PROVXCHANGE -> Known.PROVXCHANGE
                RO_SENT -> Known.RO_SENT
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SG_GIRO -> Known.SG_GIRO
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                SKNBI -> Known.SKNBI
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderListParams && afterCursor == other.afterCursor && counterpartyId == other.counterpartyId && createdAtEnd == other.createdAtEnd && createdAtStart == other.createdAtStart && direction == other.direction && effectiveDateEnd == other.effectiveDateEnd && effectiveDateStart == other.effectiveDateStart && metadata == other.metadata && originatingAccountId == other.originatingAccountId && perPage == other.perPage && priority == other.priority && processAfterEnd == other.processAfterEnd && processAfterStart == other.processAfterStart && referenceNumber == other.referenceNumber && status == other.status && transactionId == other.transactionId && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, counterpartyId, createdAtEnd, createdAtStart, direction, effectiveDateEnd, effectiveDateStart, metadata, originatingAccountId, perPage, priority, processAfterEnd, processAfterStart, referenceNumber, status, transactionId, type, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentOrderListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, createdAtEnd=$createdAtEnd, createdAtStart=$createdAtStart, direction=$direction, effectiveDateEnd=$effectiveDateEnd, effectiveDateStart=$effectiveDateStart, metadata=$metadata, originatingAccountId=$originatingAccountId, perPage=$perPage, priority=$priority, processAfterEnd=$processAfterEnd, processAfterStart=$processAfterStart, referenceNumber=$referenceNumber, status=$status, transactionId=$transactionId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
