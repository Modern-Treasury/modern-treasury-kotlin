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

class RoutingDetailCreateParams
constructor(
    private val accountsType: AccountsType,
    private val accountId: String,
    private val routingNumber: String,
    private val routingNumberType: RoutingNumberType,
    private val paymentType: PaymentType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountsType(): AccountsType = accountsType

    fun accountId(): String = accountId

    fun routingNumber(): String = routingNumber

    fun routingNumberType(): RoutingNumberType = routingNumberType

    fun paymentType(): PaymentType? = paymentType

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): RoutingDetailCreateBody {
        return RoutingDetailCreateBody(
            routingNumber,
            routingNumberType,
            paymentType,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountsType.toString()
            1 -> accountId
            else -> ""
        }
    }

    @JsonDeserialize(builder = RoutingDetailCreateBody.Builder::class)
    @NoAutoDetect
    class RoutingDetailCreateBody
    internal constructor(
        private val routingNumber: String?,
        private val routingNumberType: RoutingNumberType?,
        private val paymentType: PaymentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The routing number of the bank. */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        @JsonProperty("routing_number_type")
        fun routingNumberType(): RoutingNumberType? = routingNumberType

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var routingNumber: String? = null
            private var routingNumberType: RoutingNumberType? = null
            private var paymentType: PaymentType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(routingDetailCreateBody: RoutingDetailCreateBody) = apply {
                this.routingNumber = routingDetailCreateBody.routingNumber
                this.routingNumberType = routingDetailCreateBody.routingNumberType
                this.paymentType = routingDetailCreateBody.paymentType
                additionalProperties(routingDetailCreateBody.additionalProperties)
            }

            /** The routing number of the bank. */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /**
             * The type of routing number. See
             * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
             * details.
             */
            @JsonProperty("routing_number_type")
            fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                this.routingNumberType = routingNumberType
            }

            /**
             * If the routing detail is to be used for a specific payment type this field will be
             * populated, otherwise null.
             */
            @JsonProperty("payment_type")
            fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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

            fun build(): RoutingDetailCreateBody =
                RoutingDetailCreateBody(
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(routingNumberType) {
                        "`routingNumberType` is required but was not set"
                    },
                    paymentType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingDetailCreateBody && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoutingDetailCreateBody{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountsType: AccountsType? = null
        private var accountId: String? = null
        private var routingNumber: String? = null
        private var routingNumberType: RoutingNumberType? = null
        private var paymentType: PaymentType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routingDetailCreateParams: RoutingDetailCreateParams) = apply {
            accountsType = routingDetailCreateParams.accountsType
            accountId = routingDetailCreateParams.accountId
            routingNumber = routingDetailCreateParams.routingNumber
            routingNumberType = routingDetailCreateParams.routingNumberType
            paymentType = routingDetailCreateParams.paymentType
            additionalHeaders = routingDetailCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = routingDetailCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                routingDetailCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun accountsType(accountsType: AccountsType) = apply { this.accountsType = accountsType }

        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
            this.routingNumberType = routingNumberType
        }

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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

        fun build(): RoutingDetailCreateParams =
            RoutingDetailCreateParams(
                checkNotNull(accountsType) { "`accountsType` is required but was not set" },
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                checkNotNull(routingNumberType) {
                    "`routingNumberType` is required but was not set"
                },
                paymentType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class RoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ABA = of("aba")

            val AU_BSB = of("au_bsb")

            val BR_CODIGO = of("br_codigo")

            val CA_CPA = of("ca_cpa")

            val CHIPS = of("chips")

            val CNAPS = of("cnaps")

            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

            val GB_SORT_CODE = of("gb_sort_code")

            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

            val ID_SKNBI_CODE = of("id_sknbi_code")

            val IN_IFSC = of("in_ifsc")

            val JP_ZENGIN_CODE = of("jp_zengin_code")

            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

            val MY_BRANCH_CODE = of("my_branch_code")

            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            val SWIFT = of("swift")

            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

            fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        enum class Known {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
        }

        enum class Value {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                BR_CODIGO -> Value.BR_CODIGO
                CA_CPA -> Value.CA_CPA
                CHIPS -> Value.CHIPS
                CNAPS -> Value.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Value.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                IN_IFSC -> Value.IN_IFSC
                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Value.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                BR_CODIGO -> Known.BR_CODIGO
                CA_CPA -> Known.CA_CPA
                CHIPS -> Known.CHIPS
                CNAPS -> Known.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Known.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                IN_IFSC -> Known.IN_IFSC
                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown RoutingNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    class AccountsType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EXTERNAL_ACCOUNTS = of("external_accounts")

            fun of(value: String) = AccountsType(JsonField.of(value))
        }

        enum class Known {
            EXTERNAL_ACCOUNTS,
        }

        enum class Value {
            EXTERNAL_ACCOUNTS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                else -> throw ModernTreasuryInvalidDataException("Unknown AccountsType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountsType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingDetailCreateParams && accountsType == other.accountsType && accountId == other.accountId && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountsType, accountId, routingNumber, routingNumberType, paymentType, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RoutingDetailCreateParams{accountsType=$accountsType, accountId=$accountId, routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
