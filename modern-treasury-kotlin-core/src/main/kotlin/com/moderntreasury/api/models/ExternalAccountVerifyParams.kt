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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun originatingAccountId(): String = originatingAccountId

    fun paymentType(): PaymentType = paymentType

    fun currency(): Currency? = currency

    fun fallbackType(): FallbackType? = fallbackType

    fun priority(): Priority? = priority

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountVerifyBody && originatingAccountId == other.originatingAccountId && paymentType == other.paymentType && currency == other.currency && fallbackType == other.fallbackType && priority == other.priority && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(originatingAccountId, paymentType, currency, fallbackType, priority, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountVerifyBody{originatingAccountId=$originatingAccountId, paymentType=$paymentType, currency=$currency, fallbackType=$fallbackType, priority=$priority, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountVerifyParams: ExternalAccountVerifyParams) = apply {
            id = externalAccountVerifyParams.id
            originatingAccountId = externalAccountVerifyParams.originatingAccountId
            paymentType = externalAccountVerifyParams.paymentType
            currency = externalAccountVerifyParams.currency
            fallbackType = externalAccountVerifyParams.fallbackType
            priority = externalAccountVerifyParams.priority
            additionalHeaders = externalAccountVerifyParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountVerifyParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                externalAccountVerifyParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            val AU_BECS = of("au_becs")

            val BACS = of("bacs")

            val BOOK = of("book")

            val CARD = of("card")

            val CHATS = of("chats")

            val CHECK = of("check")

            val CROSS_BORDER = of("cross_border")

            val DK_NETS = of("dk_nets")

            val EFT = of("eft")

            val HU_ICS = of("hu_ics")

            val INTERAC = of("interac")

            val MASAV = of("masav")

            val MX_CCEN = of("mx_ccen")

            val NEFT = of("neft")

            val NICS = of("nics")

            val NZ_BECS = of("nz_becs")

            val PL_ELIXIR = of("pl_elixir")

            val PROVXCHANGE = of("provxchange")

            val RO_SENT = of("ro_sent")

            val RTP = of("rtp")

            val SE_BANKGIROT = of("se_bankgirot")

            val SEN = of("sen")

            val SEPA = of("sepa")

            val SG_GIRO = of("sg_giro")

            val SIC = of("sic")

            val SIGNET = of("signet")

            val SKNBI = of("sknbi")

            val WIRE = of("wire")

            val ZENGIN = of("zengin")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class FallbackType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Priority
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val HIGH = of("high")

            val NORMAL = of("normal")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountVerifyParams && id == other.id && originatingAccountId == other.originatingAccountId && paymentType == other.paymentType && currency == other.currency && fallbackType == other.fallbackType && priority == other.priority && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, originatingAccountId, paymentType, currency, fallbackType, priority, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ExternalAccountVerifyParams{id=$id, originatingAccountId=$originatingAccountId, paymentType=$paymentType, currency=$currency, fallbackType=$fallbackType, priority=$priority, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
