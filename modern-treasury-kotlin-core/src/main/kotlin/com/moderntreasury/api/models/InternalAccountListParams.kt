// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class InternalAccountListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val currency: Currency?,
    private val metadata: Metadata?,
    private val paymentDirection: TransactionDirection?,
    private val paymentType: PaymentType?,
    private val perPage: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun counterpartyId(): String? = counterpartyId

    fun currency(): Currency? = currency

    fun metadata(): Metadata? = metadata

    fun paymentDirection(): TransactionDirection? = paymentDirection

    fun paymentType(): PaymentType? = paymentType

    fun perPage(): Long? = perPage

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.currency?.let { params.put("currency", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.paymentDirection?.let { params.put("payment_direction", listOf(it.toString())) }
        this.paymentType?.let { params.put("payment_type", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
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

        return other is InternalAccountListParams &&
            this.afterCursor == other.afterCursor &&
            this.counterpartyId == other.counterpartyId &&
            this.currency == other.currency &&
            this.metadata == other.metadata &&
            this.paymentDirection == other.paymentDirection &&
            this.paymentType == other.paymentType &&
            this.perPage == other.perPage &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            counterpartyId,
            currency,
            metadata,
            paymentDirection,
            paymentType,
            perPage,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "InternalAccountListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, currency=$currency, metadata=$metadata, paymentDirection=$paymentDirection, paymentType=$paymentType, perPage=$perPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var counterpartyId: String? = null
        private var currency: Currency? = null
        private var metadata: Metadata? = null
        private var paymentDirection: TransactionDirection? = null
        private var paymentType: PaymentType? = null
        private var perPage: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(internalAccountListParams: InternalAccountListParams) = apply {
            this.afterCursor = internalAccountListParams.afterCursor
            this.counterpartyId = internalAccountListParams.counterpartyId
            this.currency = internalAccountListParams.currency
            this.metadata = internalAccountListParams.metadata
            this.paymentDirection = internalAccountListParams.paymentDirection
            this.paymentType = internalAccountListParams.paymentType
            this.perPage = internalAccountListParams.perPage
            additionalQueryParams(internalAccountListParams.additionalQueryParams)
            additionalHeaders(internalAccountListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** The counterparty associated with the internal account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** The currency associated with the internal account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The direction of payments that can be made by internal account. */
        fun paymentDirection(paymentDirection: TransactionDirection) = apply {
            this.paymentDirection = paymentDirection
        }

        /** The type of payment that can be made by the internal account. */
        fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

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

        fun build(): InternalAccountListParams =
            InternalAccountListParams(
                afterCursor,
                counterpartyId,
                currency,
                metadata,
                paymentDirection,
                paymentType,
                perPage,
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

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = PaymentType(JsonField.of("ach"))

            val AU_BECS = PaymentType(JsonField.of("au_becs"))

            val BACS = PaymentType(JsonField.of("bacs"))

            val BOOK = PaymentType(JsonField.of("book"))

            val CARD = PaymentType(JsonField.of("card"))

            val CHATS = PaymentType(JsonField.of("chats"))

            val CHECK = PaymentType(JsonField.of("check"))

            val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

            val EFT = PaymentType(JsonField.of("eft"))

            val INTERAC = PaymentType(JsonField.of("interac"))

            val MASAV = PaymentType(JsonField.of("masav"))

            val NEFT = PaymentType(JsonField.of("neft"))

            val NICS = PaymentType(JsonField.of("nics"))

            val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

            val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

            val RTP = PaymentType(JsonField.of("rtp"))

            val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

            val SEN = PaymentType(JsonField.of("sen"))

            val SEPA = PaymentType(JsonField.of("sepa"))

            val SIC = PaymentType(JsonField.of("sic"))

            val SIGNET = PaymentType(JsonField.of("signet"))

            val WIRE = PaymentType(JsonField.of("wire"))

            val ZENGIN = PaymentType(JsonField.of("zengin"))

            fun of(value: String) = PaymentType(JsonField.of(value))
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
            EFT,
            INTERAC,
            MASAV,
            NEFT,
            NICS,
            NZ_BECS,
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
            CHATS,
            CHECK,
            CROSS_BORDER,
            EFT,
            INTERAC,
            MASAV,
            NEFT,
            NICS,
            NZ_BECS,
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
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
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
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PROVXCHANGE -> Known.PROVXCHANGE
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
