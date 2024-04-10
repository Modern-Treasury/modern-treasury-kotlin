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
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = RoutingNumberLookupRequest.Builder::class)
@NoAutoDetect
class RoutingNumberLookupRequest
private constructor(
    private val routingNumber: JsonField<String>,
    private val routingNumberType: JsonField<RoutingNumberType>,
    private val supportedPaymentTypes: JsonField<List<SupportedPaymentType>>,
    private val bankName: JsonField<String>,
    private val bankAddress: JsonField<AddressRequest>,
    private val sanctions: JsonField<Sanctions>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
     */
    fun supportedPaymentTypes(): List<SupportedPaymentType>? =
        supportedPaymentTypes.getNullable("supported_payment_types")

    /** The name of the bank. */
    fun bankName(): String? = bankName.getNullable("bank_name")

    /** The address of the bank. */
    fun bankAddress(): AddressRequest? = bankAddress.getNullable("bank_address")

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    fun sanctions(): Sanctions? = sanctions.getNullable("sanctions")

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
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
     */
    @JsonProperty("supported_payment_types")
    @ExcludeMissing
    fun _supportedPaymentTypes() = supportedPaymentTypes

    /** The name of the bank. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName() = bankName

    /** The address of the bank. */
    @JsonProperty("bank_address") @ExcludeMissing fun _bankAddress() = bankAddress

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    @JsonProperty("sanctions") @ExcludeMissing fun _sanctions() = sanctions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RoutingNumberLookupRequest = apply {
        if (!validated) {
            routingNumber()
            routingNumberType()
            supportedPaymentTypes()
            bankName()
            bankAddress()?.validate()
            sanctions()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutingNumberLookupRequest &&
            this.routingNumber == other.routingNumber &&
            this.routingNumberType == other.routingNumberType &&
            this.supportedPaymentTypes == other.supportedPaymentTypes &&
            this.bankName == other.bankName &&
            this.bankAddress == other.bankAddress &&
            this.sanctions == other.sanctions &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    routingNumber,
                    routingNumberType,
                    supportedPaymentTypes,
                    bankName,
                    bankAddress,
                    sanctions,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RoutingNumberLookupRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, supportedPaymentTypes=$supportedPaymentTypes, bankName=$bankName, bankAddress=$bankAddress, sanctions=$sanctions, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of()
        private var supportedPaymentTypes: JsonField<List<SupportedPaymentType>> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var bankAddress: JsonField<AddressRequest> = JsonMissing.of()
        private var sanctions: JsonField<Sanctions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routingNumberLookupRequest: RoutingNumberLookupRequest) = apply {
            this.routingNumber = routingNumberLookupRequest.routingNumber
            this.routingNumberType = routingNumberLookupRequest.routingNumberType
            this.supportedPaymentTypes = routingNumberLookupRequest.supportedPaymentTypes
            this.bankName = routingNumberLookupRequest.bankName
            this.bankAddress = routingNumberLookupRequest.bankAddress
            this.sanctions = routingNumberLookupRequest.sanctions
            additionalProperties(routingNumberLookupRequest.additionalProperties)
        }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number of the bank. */
        @JsonProperty("routing_number")
        @ExcludeMissing
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
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
            this.routingNumberType = routingNumberType
        }

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
        @JsonProperty("supported_payment_types")
        @ExcludeMissing
        fun supportedPaymentTypes(supportedPaymentTypes: JsonField<List<SupportedPaymentType>>) =
            apply {
                this.supportedPaymentTypes = supportedPaymentTypes
            }

        /** The name of the bank. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the bank. */
        @JsonProperty("bank_name")
        @ExcludeMissing
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** The address of the bank. */
        fun bankAddress(bankAddress: AddressRequest) = bankAddress(JsonField.of(bankAddress))

        /** The address of the bank. */
        @JsonProperty("bank_address")
        @ExcludeMissing
        fun bankAddress(bankAddress: JsonField<AddressRequest>) = apply {
            this.bankAddress = bankAddress
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
        @JsonProperty("sanctions")
        @ExcludeMissing
        fun sanctions(sanctions: JsonField<Sanctions>) = apply { this.sanctions = sanctions }

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

        fun build(): RoutingNumberLookupRequest =
            RoutingNumberLookupRequest(
                routingNumber,
                routingNumberType,
                supportedPaymentTypes.map { it.toUnmodifiable() },
                bankName,
                bankAddress,
                sanctions,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The address of the bank. */
    @JsonDeserialize(builder = AddressRequest.Builder::class)
    @NoAutoDetect
    class AddressRequest
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val region: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AddressRequest = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AddressRequest &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addressRequest: AddressRequest) = apply {
                this.line1 = addressRequest.line1
                this.line2 = addressRequest.line2
                this.locality = addressRequest.locality
                this.region = addressRequest.region
                this.postalCode = addressRequest.postalCode
                this.country = addressRequest.country
                additionalProperties(addressRequest.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            @JsonProperty("locality")
            @ExcludeMissing
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            @JsonProperty("region")
            @ExcludeMissing
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            fun build(): AddressRequest =
                AddressRequest(
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class RoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoutingNumberType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ABA = RoutingNumberType(JsonField.of("aba"))

            val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

            val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

            val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

            val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

            val NZ_NATIONAL_CLEARING_CODE =
                RoutingNumberType(JsonField.of("nz_national_clearing_code"))

            val SE_BANKGIRO_CLEARING_CODE =
                RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

            val SWIFT = RoutingNumberType(JsonField.of("swift"))

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
    }

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    @JsonDeserialize(builder = Sanctions.Builder::class)
    @NoAutoDetect
    class Sanctions
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Sanctions = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sanctions && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Sanctions{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sanctions: Sanctions) = apply {
                additionalProperties(sanctions.additionalProperties)
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

            fun build(): Sanctions = Sanctions(additionalProperties.toUnmodifiable())
        }
    }

    class SupportedPaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupportedPaymentType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = SupportedPaymentType(JsonField.of("ach"))

            val AU_BECS = SupportedPaymentType(JsonField.of("au_becs"))

            val BACS = SupportedPaymentType(JsonField.of("bacs"))

            val BOOK = SupportedPaymentType(JsonField.of("book"))

            val CARD = SupportedPaymentType(JsonField.of("card"))

            val CHATS = SupportedPaymentType(JsonField.of("chats"))

            val CHECK = SupportedPaymentType(JsonField.of("check"))

            val CROSS_BORDER = SupportedPaymentType(JsonField.of("cross_border"))

            val DK_NETS = SupportedPaymentType(JsonField.of("dk_nets"))

            val EFT = SupportedPaymentType(JsonField.of("eft"))

            val HU_ICS = SupportedPaymentType(JsonField.of("hu_ics"))

            val INTERAC = SupportedPaymentType(JsonField.of("interac"))

            val MASAV = SupportedPaymentType(JsonField.of("masav"))

            val MX_CCEN = SupportedPaymentType(JsonField.of("mx_ccen"))

            val NEFT = SupportedPaymentType(JsonField.of("neft"))

            val NICS = SupportedPaymentType(JsonField.of("nics"))

            val NZ_BECS = SupportedPaymentType(JsonField.of("nz_becs"))

            val PL_ELIXIR = SupportedPaymentType(JsonField.of("pl_elixir"))

            val PROVXCHANGE = SupportedPaymentType(JsonField.of("provxchange"))

            val RO_SENT = SupportedPaymentType(JsonField.of("ro_sent"))

            val RTP = SupportedPaymentType(JsonField.of("rtp"))

            val SE_BANKGIROT = SupportedPaymentType(JsonField.of("se_bankgirot"))

            val SEN = SupportedPaymentType(JsonField.of("sen"))

            val SEPA = SupportedPaymentType(JsonField.of("sepa"))

            val SG_GIRO = SupportedPaymentType(JsonField.of("sg_giro"))

            val SIC = SupportedPaymentType(JsonField.of("sic"))

            val SIGNET = SupportedPaymentType(JsonField.of("signet"))

            val SKNBI = SupportedPaymentType(JsonField.of("sknbi"))

            val WIRE = SupportedPaymentType(JsonField.of("wire"))

            val ZENGIN = SupportedPaymentType(JsonField.of("zengin"))

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
    }
}
