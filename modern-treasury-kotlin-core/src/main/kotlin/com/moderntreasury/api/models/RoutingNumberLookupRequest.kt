// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

@NoAutoDetect
class RoutingNumberLookupRequest
@JsonCreator
private constructor(
    @JsonProperty("bank_address")
    @ExcludeMissing
    private val bankAddress: JsonField<AddressRequest> = JsonMissing.of(),
    @JsonProperty("bank_name")
    @ExcludeMissing
    private val bankName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    private val routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
    @JsonProperty("sanctions")
    @ExcludeMissing
    private val sanctions: JsonField<Sanctions> = JsonMissing.of(),
    @JsonProperty("supported_payment_types")
    @ExcludeMissing
    private val supportedPaymentTypes: JsonField<List<SupportedPaymentType>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The address of the bank. */
    fun bankAddress(): AddressRequest? = bankAddress.getNullable("bank_address")

    /** The name of the bank. */
    fun bankName(): String? = bankName.getNullable("bank_name")

    /** The routing number of the bank. */
    fun routingNumber(): String? = routingNumber.getNullable("routing_number")

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details. In
     * sandbox mode we currently only support `aba` and `swift` with routing numbers '123456789' and
     * 'GRINUST0XXX' respectively.
     */
    fun routingNumberType(): RoutingNumberType? =
        routingNumberType.getNullable("routing_number_type")

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    fun sanctions(): Sanctions? = sanctions.getNullable("sanctions")

    /**
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
     */
    fun supportedPaymentTypes(): List<SupportedPaymentType>? =
        supportedPaymentTypes.getNullable("supported_payment_types")

    /** The address of the bank. */
    @JsonProperty("bank_address") @ExcludeMissing fun _bankAddress() = bankAddress

    /** The name of the bank. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName() = bankName

    /** The routing number of the bank. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details. In
     * sandbox mode we currently only support `aba` and `swift` with routing numbers '123456789' and
     * 'GRINUST0XXX' respectively.
     */
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    fun _routingNumberType() = routingNumberType

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    @JsonProperty("sanctions") @ExcludeMissing fun _sanctions() = sanctions

    /**
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
     */
    @JsonProperty("supported_payment_types")
    @ExcludeMissing
    fun _supportedPaymentTypes() = supportedPaymentTypes

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RoutingNumberLookupRequest = apply {
        if (!validated) {
            bankAddress()?.validate()
            bankName()
            routingNumber()
            routingNumberType()
            sanctions()?.validate()
            supportedPaymentTypes()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var bankAddress: JsonField<AddressRequest> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of()
        private var sanctions: JsonField<Sanctions> = JsonMissing.of()
        private var supportedPaymentTypes: JsonField<List<SupportedPaymentType>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routingNumberLookupRequest: RoutingNumberLookupRequest) = apply {
            bankAddress = routingNumberLookupRequest.bankAddress
            bankName = routingNumberLookupRequest.bankName
            routingNumber = routingNumberLookupRequest.routingNumber
            routingNumberType = routingNumberLookupRequest.routingNumberType
            sanctions = routingNumberLookupRequest.sanctions
            supportedPaymentTypes = routingNumberLookupRequest.supportedPaymentTypes
            additionalProperties = routingNumberLookupRequest.additionalProperties.toMutableMap()
        }

        /** The address of the bank. */
        fun bankAddress(bankAddress: AddressRequest) = bankAddress(JsonField.of(bankAddress))

        /** The address of the bank. */
        fun bankAddress(bankAddress: JsonField<AddressRequest>) = apply {
            this.bankAddress = bankAddress
        }

        /** The name of the bank. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the bank. */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details. In sandbox mode we currently only support `aba` and `swift` with routing numbers
         * '123456789' and 'GRINUST0XXX' respectively.
         */
        fun routingNumberType(routingNumberType: RoutingNumberType) =
            routingNumberType(JsonField.of(routingNumberType))

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details. In sandbox mode we currently only support `aba` and `swift` with routing numbers
         * '123456789' and 'GRINUST0XXX' respectively.
         */
        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
            this.routingNumberType = routingNumberType
        }

        /**
         * An object containing key-value pairs, each with a sanctions list as the key and a boolean
         * value representing whether the bank is on that particular sanctions list. Currently, this
         * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
         */
        fun sanctions(sanctions: Sanctions) = sanctions(JsonField.of(sanctions))

        /**
         * An object containing key-value pairs, each with a sanctions list as the key and a boolean
         * value representing whether the bank is on that particular sanctions list. Currently, this
         * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
         */
        fun sanctions(sanctions: JsonField<Sanctions>) = apply { this.sanctions = sanctions }

        /**
         * An array of payment types that are supported for this routing number. This can include
         * `ach`, `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
         */
        fun supportedPaymentTypes(supportedPaymentTypes: List<SupportedPaymentType>) =
            supportedPaymentTypes(JsonField.of(supportedPaymentTypes))

        /**
         * An array of payment types that are supported for this routing number. This can include
         * `ach`, `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
         */
        fun supportedPaymentTypes(supportedPaymentTypes: JsonField<List<SupportedPaymentType>>) =
            apply {
                this.supportedPaymentTypes = supportedPaymentTypes
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): RoutingNumberLookupRequest =
            RoutingNumberLookupRequest(
                bankAddress,
                bankName,
                routingNumber,
                routingNumberType,
                sanctions,
                supportedPaymentTypes.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** The address of the bank. */
    @NoAutoDetect
    class AddressRequest
    @JsonCreator
    private constructor(
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddressRequest = apply {
            if (!validated) {
                country()
                line1()
                line2()
                locality()
                postalCode()
                region()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addressRequest: AddressRequest) = apply {
                country = addressRequest.country
                line1 = addressRequest.line1
                line2 = addressRequest.line2
                locality = addressRequest.locality
                postalCode = addressRequest.postalCode
                region = addressRequest.region
                additionalProperties = addressRequest.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): AddressRequest =
                AddressRequest(
                    country,
                    line1,
                    line2,
                    locality,
                    postalCode,
                    region,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
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

            val CA_CPA = of("ca_cpa")

            val GB_SORT_CODE = of("gb_sort_code")

            val IN_IFSC = of("in_ifsc")

            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            val SWIFT = of("swift")

            fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        enum class Known {
            ABA,
            AU_BSB,
            CA_CPA,
            GB_SORT_CODE,
            IN_IFSC,
            NZ_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
        }

        enum class Value {
            ABA,
            AU_BSB,
            CA_CPA,
            GB_SORT_CODE,
            IN_IFSC,
            NZ_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                CA_CPA -> Value.CA_CPA
                GB_SORT_CODE -> Value.GB_SORT_CODE
                IN_IFSC -> Value.IN_IFSC
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Value.SWIFT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                CA_CPA -> Known.CA_CPA
                GB_SORT_CODE -> Known.GB_SORT_CODE
                IN_IFSC -> Known.IN_IFSC
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
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

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    @NoAutoDetect
    class Sanctions
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Sanctions = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sanctions: Sanctions) = apply {
                additionalProperties = sanctions.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Sanctions = Sanctions(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sanctions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Sanctions{additionalProperties=$additionalProperties}"
    }

    class SupportedPaymentType
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

            fun of(value: String) = SupportedPaymentType(JsonField.of(value))
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
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown SupportedPaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupportedPaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberLookupRequest && bankAddress == other.bankAddress && bankName == other.bankName && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && sanctions == other.sanctions && supportedPaymentTypes == other.supportedPaymentTypes && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bankAddress, bankName, routingNumber, routingNumberType, sanctions, supportedPaymentTypes, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingNumberLookupRequest{bankAddress=$bankAddress, bankName=$bankName, routingNumber=$routingNumber, routingNumberType=$routingNumberType, sanctions=$sanctions, supportedPaymentTypes=$supportedPaymentTypes, additionalProperties=$additionalProperties}"
}
