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
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class ExternalAccountVerifyParams
constructor(
    private val id: String,
    private val originatingAccountId: String,
    private val paymentType: PaymentType,
    private val currency: Currency?,
    private val fallbackType: FallbackType?,
    private val priority: Priority?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun originatingAccountId(): String = originatingAccountId

    fun paymentType(): PaymentType = paymentType

    fun currency(): Currency? = currency

    fun fallbackType(): FallbackType? = fallbackType

    fun priority(): Priority? = priority

    internal fun getBody(): ExternalAccountVerifyBody {
        return ExternalAccountVerifyBody(
            originatingAccountId,
            paymentType,
            currency,
            fallbackType,
            priority,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalAccountVerifyBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountVerifyBody
    internal constructor(
        private val originatingAccountId: String?,
        private val paymentType: PaymentType?,
        private val currency: Currency?,
        private val fallbackType: FallbackType?,
        private val priority: Priority?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The ID of the internal account where the micro-deposits originate from. Both credit and
         * debit capabilities must be enabled.
         */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /** Can be `ach`, `eft`, or `rtp`. */
        @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (payment_type=rtp and
         * fallback_type=ach)
         */
        @JsonProperty("fallback_type") fun fallbackType(): FallbackType? = fallbackType

        /**
         * Either `normal` or `high`. For ACH payments, `high` represents a same-day ACH transfer.
         * This will apply to both `payment_type` and `fallback_type`.
         */
        @JsonProperty("priority") fun priority(): Priority? = priority

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var originatingAccountId: String? = null
            private var paymentType: PaymentType? = null
            private var currency: Currency? = null
            private var fallbackType: FallbackType? = null
            private var priority: Priority? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalAccountVerifyBody: ExternalAccountVerifyBody) = apply {
                this.originatingAccountId = externalAccountVerifyBody.originatingAccountId
                this.paymentType = externalAccountVerifyBody.paymentType
                this.currency = externalAccountVerifyBody.currency
                this.fallbackType = externalAccountVerifyBody.fallbackType
                this.priority = externalAccountVerifyBody.priority
                additionalProperties(externalAccountVerifyBody.additionalProperties)
            }

            /**
             * The ID of the internal account where the micro-deposits originate from. Both credit
             * and debit capabilities must be enabled.
             */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /** Can be `ach`, `eft`, or `rtp`. */
            @JsonProperty("payment_type")
            fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (payment_type=rtp
             * and fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            fun fallbackType(fallbackType: FallbackType) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * Either `normal` or `high`. For ACH payments, `high` represents a same-day ACH
             * transfer. This will apply to both `payment_type` and `fallback_type`.
             */
            @JsonProperty("priority")
            fun priority(priority: Priority) = apply { this.priority = priority }

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

            fun build(): ExternalAccountVerifyBody =
                ExternalAccountVerifyBody(
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    checkNotNull(paymentType) { "`paymentType` is required but was not set" },
                    currency,
                    fallbackType,
                    priority,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountVerifyBody && this.originatingAccountId == other.originatingAccountId && this.paymentType == other.paymentType && this.currency == other.currency && this.fallbackType == other.fallbackType && this.priority == other.priority && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(originatingAccountId, paymentType, currency, fallbackType, priority, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalAccountVerifyBody{originatingAccountId=$originatingAccountId, paymentType=$paymentType, currency=$currency, fallbackType=$fallbackType, priority=$priority, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountVerifyParams && this.id == other.id && this.originatingAccountId == other.originatingAccountId && this.paymentType == other.paymentType && this.currency == other.currency && this.fallbackType == other.fallbackType && this.priority == other.priority && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, originatingAccountId, paymentType, currency, fallbackType, priority, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalAccountVerifyParams{id=$id, originatingAccountId=$originatingAccountId, paymentType=$paymentType, currency=$currency, fallbackType=$fallbackType, priority=$priority, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var originatingAccountId: String? = null
        private var paymentType: PaymentType? = null
        private var currency: Currency? = null
        private var fallbackType: FallbackType? = null
        private var priority: Priority? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountVerifyParams: ExternalAccountVerifyParams) = apply {
            this.id = externalAccountVerifyParams.id
            this.originatingAccountId = externalAccountVerifyParams.originatingAccountId
            this.paymentType = externalAccountVerifyParams.paymentType
            this.currency = externalAccountVerifyParams.currency
            this.fallbackType = externalAccountVerifyParams.fallbackType
            this.priority = externalAccountVerifyParams.priority
            additionalQueryParams(externalAccountVerifyParams.additionalQueryParams)
            additionalHeaders(externalAccountVerifyParams.additionalHeaders)
            additionalBodyProperties(externalAccountVerifyParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * The ID of the internal account where the micro-deposits originate from. Both credit and
         * debit capabilities must be enabled.
         */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** Can be `ach`, `eft`, or `rtp`. */
        fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (payment_type=rtp and
         * fallback_type=ach)
         */
        fun fallbackType(fallbackType: FallbackType) = apply { this.fallbackType = fallbackType }

        /**
         * Either `normal` or `high`. For ACH payments, `high` represents a same-day ACH transfer.
         * This will apply to both `payment_type` and `fallback_type`.
         */
        fun priority(priority: Priority) = apply { this.priority = priority }

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

        fun build(): ExternalAccountVerifyParams =
            ExternalAccountVerifyParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                checkNotNull(paymentType) { "`paymentType` is required but was not set" },
                currency,
                fallbackType,
                priority,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && this.value == other.value /* spotless:on */
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

            val DK_NETS = PaymentType(JsonField.of("dk_nets"))

            val EFT = PaymentType(JsonField.of("eft"))

            val HU_ICS = PaymentType(JsonField.of("hu_ics"))

            val INTERAC = PaymentType(JsonField.of("interac"))

            val MASAV = PaymentType(JsonField.of("masav"))

            val MX_CCEN = PaymentType(JsonField.of("mx_ccen"))

            val NEFT = PaymentType(JsonField.of("neft"))

            val NICS = PaymentType(JsonField.of("nics"))

            val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

            val PL_ELIXIR = PaymentType(JsonField.of("pl_elixir"))

            val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

            val RO_SENT = PaymentType(JsonField.of("ro_sent"))

            val RTP = PaymentType(JsonField.of("rtp"))

            val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

            val SEN = PaymentType(JsonField.of("sen"))

            val SEPA = PaymentType(JsonField.of("sepa"))

            val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

            val SIC = PaymentType(JsonField.of("sic"))

            val SIGNET = PaymentType(JsonField.of("signet"))

            val SKNBI = PaymentType(JsonField.of("sknbi"))

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
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class FallbackType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FallbackType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = FallbackType(JsonField.of("ach"))

            fun of(value: String) = FallbackType(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            return /* spotless:off */ other is Priority && this.value == other.value /* spotless:on */
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
}
