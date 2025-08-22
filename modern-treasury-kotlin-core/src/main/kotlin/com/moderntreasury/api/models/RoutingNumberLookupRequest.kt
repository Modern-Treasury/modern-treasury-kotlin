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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class RoutingNumberLookupRequest
private constructor(
    private val bankAddress: JsonField<AddressRequest>,
    private val bankName: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val routingNumberType: JsonField<RoutingNumberType>,
    private val sanctions: JsonField<Sanctions>,
    private val supportedPaymentTypes: JsonField<List<SupportedPaymentType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bank_address")
        @ExcludeMissing
        bankAddress: JsonField<AddressRequest> = JsonMissing.of(),
        @JsonProperty("bank_name") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
        @JsonProperty("sanctions")
        @ExcludeMissing
        sanctions: JsonField<Sanctions> = JsonMissing.of(),
        @JsonProperty("supported_payment_types")
        @ExcludeMissing
        supportedPaymentTypes: JsonField<List<SupportedPaymentType>> = JsonMissing.of(),
    ) : this(
        bankAddress,
        bankName,
        routingNumber,
        routingNumberType,
        sanctions,
        supportedPaymentTypes,
        mutableMapOf(),
    )

    /**
     * The address of the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankAddress(): AddressRequest? = bankAddress.getNullable("bank_address")

    /**
     * The name of the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankName(): String? = bankName.getNullable("bank_name")

    /**
     * The routing number of the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routingNumber(): String? = routingNumber.getNullable("routing_number")

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details. In
     * sandbox mode we currently only support `aba` and `swift` with routing numbers '123456789' and
     * 'GRINUST0XXX' respectively.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routingNumberType(): RoutingNumberType? =
        routingNumberType.getNullable("routing_number_type")

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sanctions(): Sanctions? = sanctions.getNullable("sanctions")

    /**
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs`, and 'fednow' currently.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportedPaymentTypes(): List<SupportedPaymentType>? =
        supportedPaymentTypes.getNullable("supported_payment_types")

    /**
     * Returns the raw JSON value of [bankAddress].
     *
     * Unlike [bankAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank_address")
    @ExcludeMissing
    fun _bankAddress(): JsonField<AddressRequest> = bankAddress

    /**
     * Returns the raw JSON value of [bankName].
     *
     * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [routingNumberType].
     *
     * Unlike [routingNumberType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

    /**
     * Returns the raw JSON value of [sanctions].
     *
     * Unlike [sanctions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sanctions") @ExcludeMissing fun _sanctions(): JsonField<Sanctions> = sanctions

    /**
     * Returns the raw JSON value of [supportedPaymentTypes].
     *
     * Unlike [supportedPaymentTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supported_payment_types")
    @ExcludeMissing
    fun _supportedPaymentTypes(): JsonField<List<SupportedPaymentType>> = supportedPaymentTypes

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingNumberLookupRequest].
         */
        fun builder() = Builder()
    }

    /** A builder for [RoutingNumberLookupRequest]. */
    class Builder internal constructor() {

        private var bankAddress: JsonField<AddressRequest> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of()
        private var sanctions: JsonField<Sanctions> = JsonMissing.of()
        private var supportedPaymentTypes: JsonField<MutableList<SupportedPaymentType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routingNumberLookupRequest: RoutingNumberLookupRequest) = apply {
            bankAddress = routingNumberLookupRequest.bankAddress
            bankName = routingNumberLookupRequest.bankName
            routingNumber = routingNumberLookupRequest.routingNumber
            routingNumberType = routingNumberLookupRequest.routingNumberType
            sanctions = routingNumberLookupRequest.sanctions
            supportedPaymentTypes =
                routingNumberLookupRequest.supportedPaymentTypes.map { it.toMutableList() }
            additionalProperties = routingNumberLookupRequest.additionalProperties.toMutableMap()
        }

        /** The address of the bank. */
        fun bankAddress(bankAddress: AddressRequest) = bankAddress(JsonField.of(bankAddress))

        /**
         * Sets [Builder.bankAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankAddress] with a well-typed [AddressRequest] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bankAddress(bankAddress: JsonField<AddressRequest>) = apply {
            this.bankAddress = bankAddress
        }

        /** The name of the bank. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /**
         * Sets [Builder.bankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
         * Sets [Builder.routingNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumberType] with a well-typed [RoutingNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Sets [Builder.sanctions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sanctions] with a well-typed [Sanctions] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sanctions(sanctions: JsonField<Sanctions>) = apply { this.sanctions = sanctions }

        /**
         * An array of payment types that are supported for this routing number. This can include
         * `ach`, `wire`, `rtp`, `sepa`, `bacs`, `au_becs`, and 'fednow' currently.
         */
        fun supportedPaymentTypes(supportedPaymentTypes: List<SupportedPaymentType>) =
            supportedPaymentTypes(JsonField.of(supportedPaymentTypes))

        /**
         * Sets [Builder.supportedPaymentTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedPaymentTypes] with a well-typed
         * `List<SupportedPaymentType>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supportedPaymentTypes(supportedPaymentTypes: JsonField<List<SupportedPaymentType>>) =
            apply {
                this.supportedPaymentTypes = supportedPaymentTypes.map { it.toMutableList() }
            }

        /**
         * Adds a single [SupportedPaymentType] to [supportedPaymentTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedPaymentType(supportedPaymentType: SupportedPaymentType) = apply {
            supportedPaymentTypes =
                (supportedPaymentTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedPaymentTypes", it).add(supportedPaymentType)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [RoutingNumberLookupRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoutingNumberLookupRequest =
            RoutingNumberLookupRequest(
                bankAddress,
                bankName,
                routingNumber,
                routingNumberType,
                sanctions,
                (supportedPaymentTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoutingNumberLookupRequest = apply {
        if (validated) {
            return@apply
        }

        bankAddress()?.validate()
        bankName()
        routingNumber()
        routingNumberType()?.validate()
        sanctions()?.validate()
        supportedPaymentTypes()?.forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ModernTreasuryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (bankAddress.asKnown()?.validity() ?: 0) +
            (if (bankName.asKnown() == null) 0 else 1) +
            (if (routingNumber.asKnown() == null) 0 else 1) +
            (routingNumberType.asKnown()?.validity() ?: 0) +
            (sanctions.asKnown()?.validity() ?: 0) +
            (supportedPaymentTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details. In
     * sandbox mode we currently only support `aba` and `swift` with routing numbers '123456789' and
     * 'GRINUST0XXX' respectively.
     */
    class RoutingNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
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

            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

            fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        /** An enum containing [RoutingNumberType]'s known values. */
        enum class Known {
            ABA,
            AU_BSB,
            CA_CPA,
            GB_SORT_CODE,
            IN_IFSC,
            NZ_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
        }

        /**
         * An enum containing [RoutingNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RoutingNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABA,
            AU_BSB,
            CA_CPA,
            GB_SORT_CODE,
            IN_IFSC,
            NZ_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
            /**
             * An enum member indicating that [RoutingNumberType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
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
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown RoutingNumberType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): RoutingNumberType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoutingNumberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    class Sanctions
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Sanctions]. */
            fun builder() = Builder()
        }

        /** A builder for [Sanctions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sanctions: Sanctions) = apply {
                additionalProperties = sanctions.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Sanctions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sanctions = Sanctions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Sanctions = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sanctions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Sanctions{additionalProperties=$additionalProperties}"
    }

    class SupportedPaymentType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            val AU_BECS = of("au_becs")

            val BACS = of("bacs")

            val BASE = of("base")

            val BOOK = of("book")

            val CARD = of("card")

            val CHATS = of("chats")

            val CHECK = of("check")

            val CROSS_BORDER = of("cross_border")

            val DK_NETS = of("dk_nets")

            val EFT = of("eft")

            val ETHEREUM = of("ethereum")

            val HU_ICS = of("hu_ics")

            val INTERAC = of("interac")

            val MASAV = of("masav")

            val MX_CCEN = of("mx_ccen")

            val NEFT = of("neft")

            val NICS = of("nics")

            val NZ_BECS = of("nz_becs")

            val PL_ELIXIR = of("pl_elixir")

            val POLYGON = of("polygon")

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

            val SOLANA = of("solana")

            val WIRE = of("wire")

            val ZENGIN = of("zengin")

            fun of(value: String) = SupportedPaymentType(JsonField.of(value))
        }

        /** An enum containing [SupportedPaymentType]'s known values. */
        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BASE,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            ETHEREUM,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            POLYGON,
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
            SOLANA,
            WIRE,
            ZENGIN,
        }

        /**
         * An enum containing [SupportedPaymentType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SupportedPaymentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BASE,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            ETHEREUM,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            POLYGON,
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
            SOLANA,
            WIRE,
            ZENGIN,
            /**
             * An enum member indicating that [SupportedPaymentType] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BASE -> Value.BASE
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                ETHEREUM -> Value.ETHEREUM
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                MX_CCEN -> Value.MX_CCEN
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PL_ELIXIR -> Value.PL_ELIXIR
                POLYGON -> Value.POLYGON
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
                SOLANA -> Value.SOLANA
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BASE -> Known.BASE
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                ETHEREUM -> Known.ETHEREUM
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                MX_CCEN -> Known.MX_CCEN
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PL_ELIXIR -> Known.PL_ELIXIR
                POLYGON -> Known.POLYGON
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
                SOLANA -> Known.SOLANA
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown SupportedPaymentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): SupportedPaymentType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupportedPaymentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutingNumberLookupRequest &&
            bankAddress == other.bankAddress &&
            bankName == other.bankName &&
            routingNumber == other.routingNumber &&
            routingNumberType == other.routingNumberType &&
            sanctions == other.sanctions &&
            supportedPaymentTypes == other.supportedPaymentTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bankAddress,
            bankName,
            routingNumber,
            routingNumberType,
            sanctions,
            supportedPaymentTypes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingNumberLookupRequest{bankAddress=$bankAddress, bankName=$bankName, routingNumber=$routingNumber, routingNumberType=$routingNumberType, sanctions=$sanctions, supportedPaymentTypes=$supportedPaymentTypes, additionalProperties=$additionalProperties}"
}
