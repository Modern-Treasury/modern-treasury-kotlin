// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class ExpectedPaymentListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val createdAtLowerBound: OffsetDateTime?,
    private val createdAtUpperBound: OffsetDateTime?,
    private val direction: TransactionDirection?,
    private val internalAccountId: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val status: Status?,
    private val type: Type?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun counterpartyId(): String? = counterpartyId

    fun createdAtLowerBound(): OffsetDateTime? = createdAtLowerBound

    fun createdAtUpperBound(): OffsetDateTime? = createdAtUpperBound

    fun direction(): TransactionDirection? = direction

    fun internalAccountId(): String? = internalAccountId

    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    fun status(): Status? = status

    fun type(): Type? = type

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.createdAtLowerBound?.let {
            params.put(
                "created_at_lower_bound",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtUpperBound?.let {
            params.put(
                "created_at_upper_bound",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.direction?.let { params.put("direction", listOf(it.toString())) }
        this.internalAccountId?.let { params.put("internal_account_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.type?.let { params.put("type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentListParams && this.afterCursor == other.afterCursor && this.counterpartyId == other.counterpartyId && this.createdAtLowerBound == other.createdAtLowerBound && this.createdAtUpperBound == other.createdAtUpperBound && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.metadata == other.metadata && this.perPage == other.perPage && this.status == other.status && this.type == other.type && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, counterpartyId, createdAtLowerBound, createdAtUpperBound, direction, internalAccountId, metadata, perPage, status, type, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ExpectedPaymentListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, createdAtLowerBound=$createdAtLowerBound, createdAtUpperBound=$createdAtUpperBound, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, perPage=$perPage, status=$status, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var counterpartyId: String? = null
        private var createdAtLowerBound: OffsetDateTime? = null
        private var createdAtUpperBound: OffsetDateTime? = null
        private var direction: TransactionDirection? = null
        private var internalAccountId: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(expectedPaymentListParams: ExpectedPaymentListParams) = apply {
            this.afterCursor = expectedPaymentListParams.afterCursor
            this.counterpartyId = expectedPaymentListParams.counterpartyId
            this.createdAtLowerBound = expectedPaymentListParams.createdAtLowerBound
            this.createdAtUpperBound = expectedPaymentListParams.createdAtUpperBound
            this.direction = expectedPaymentListParams.direction
            this.internalAccountId = expectedPaymentListParams.internalAccountId
            this.metadata = expectedPaymentListParams.metadata
            this.perPage = expectedPaymentListParams.perPage
            this.status = expectedPaymentListParams.status
            this.type = expectedPaymentListParams.type
            additionalHeaders(expectedPaymentListParams.additionalHeaders)
            additionalQueryParams(expectedPaymentListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Specify counterparty_id to see expected_payments for a specific account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Used to return expected payments created after some datetime */
        fun createdAtLowerBound(createdAtLowerBound: OffsetDateTime) = apply {
            this.createdAtLowerBound = createdAtLowerBound
        }

        /** Used to return expected payments created before some datetime */
        fun createdAtUpperBound(createdAtUpperBound: OffsetDateTime) = apply {
            this.createdAtUpperBound = createdAtUpperBound
        }

        /** One of credit, debit */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /** Specify internal_account_id to see expected_payments for a specific account. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** One of unreconciled, reconciled, or archived. */
        fun status(status: Status) = apply { this.status = status }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp,sen, sepa,
         * signet, wire
         */
        fun type(type: Type) = apply { this.type = type }

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

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

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

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): ExpectedPaymentListParams =
            ExpectedPaymentListParams(
                afterCursor,
                counterpartyId,
                createdAtLowerBound,
                createdAtUpperBound,
                direction,
                internalAccountId,
                metadata,
                perPage,
                status,
                type,
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

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
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
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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
}
