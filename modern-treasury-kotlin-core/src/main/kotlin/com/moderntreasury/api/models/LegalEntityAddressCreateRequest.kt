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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class LegalEntityAddressCreateRequest
private constructor(
    private val country: JsonField<String>,
    private val line1: JsonField<String>,
    private val locality: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val region: JsonField<String>,
    private val addressTypes: JsonField<List<AddressType>>,
    private val line2: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address_types")
        @ExcludeMissing
        addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
    ) : this(country, line1, locality, postalCode, region, addressTypes, line2, mutableMapOf())

    /**
     * Country code conforms to [ISO 3166-1 alpha-2]
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun country(): String? = country.getNullable("country")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun line1(): String? = line1.getNullable("line1")

    /**
     * Locality or City.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun locality(): String? = locality.getNullable("locality")

    /**
     * The postal code of the address.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun postalCode(): String? = postalCode.getNullable("postal_code")

    /**
     * Region or State.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun region(): String? = region.getNullable("region")

    /**
     * The types of this address.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addressTypes(): List<AddressType>? = addressTypes.getNullable("address_types")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun line2(): String? = line2.getNullable("line2")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [line1].
     *
     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [addressTypes].
     *
     * Unlike [addressTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address_types")
    @ExcludeMissing
    fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

    /**
     * Returns the raw JSON value of [line2].
     *
     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
         * Returns a mutable builder for constructing an instance of
         * [LegalEntityAddressCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * .line1()
         * .locality()
         * .postalCode()
         * .region()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityAddressCreateRequest]. */
    class Builder internal constructor() {

        private var country: JsonField<String>? = null
        private var line1: JsonField<String>? = null
        private var locality: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var region: JsonField<String>? = null
        private var addressTypes: JsonField<MutableList<AddressType>>? = null
        private var line2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest) =
            apply {
                country = legalEntityAddressCreateRequest.country
                line1 = legalEntityAddressCreateRequest.line1
                locality = legalEntityAddressCreateRequest.locality
                postalCode = legalEntityAddressCreateRequest.postalCode
                region = legalEntityAddressCreateRequest.region
                addressTypes =
                    legalEntityAddressCreateRequest.addressTypes.map { it.toMutableList() }
                line2 = legalEntityAddressCreateRequest.line2
                additionalProperties =
                    legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
            }

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(country: String?) = country(JsonField.ofNullable(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

        /**
         * Sets [Builder.line1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /** Locality or City. */
        fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        /** The postal code of the address. */
        fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** Region or State. */
        fun region(region: String?) = region(JsonField.ofNullable(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** The types of this address. */
        fun addressTypes(addressTypes: List<AddressType>) = addressTypes(JsonField.of(addressTypes))

        /**
         * Sets [Builder.addressTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressTypes] with a well-typed `List<AddressType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
            this.addressTypes = addressTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [AddressType] to [addressTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddressType(addressType: AddressType) = apply {
            addressTypes =
                (addressTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addressTypes", it).add(addressType)
                }
        }

        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

        /**
         * Sets [Builder.line2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

        /**
         * Returns an immutable instance of [LegalEntityAddressCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * .line1()
         * .locality()
         * .postalCode()
         * .region()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityAddressCreateRequest =
            LegalEntityAddressCreateRequest(
                checkRequired("country", country),
                checkRequired("line1", line1),
                checkRequired("locality", locality),
                checkRequired("postalCode", postalCode),
                checkRequired("region", region),
                (addressTypes ?: JsonMissing.of()).map { it.toImmutable() },
                line2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalEntityAddressCreateRequest = apply {
        if (validated) {
            return@apply
        }

        country()
        line1()
        locality()
        postalCode()
        region()
        addressTypes()?.forEach { it.validate() }
        line2()
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
        (if (country.asKnown() == null) 0 else 1) +
            (if (line1.asKnown() == null) 0 else 1) +
            (if (locality.asKnown() == null) 0 else 1) +
            (if (postalCode.asKnown() == null) 0 else 1) +
            (if (region.asKnown() == null) 0 else 1) +
            (addressTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (line2.asKnown() == null) 0 else 1)

    class AddressType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val BUSINESS = of("business")

            val MAILING = of("mailing")

            val OTHER = of("other")

            val PO_BOX = of("po_box")

            val RESIDENTIAL = of("residential")

            fun of(value: String) = AddressType(JsonField.of(value))
        }

        /** An enum containing [AddressType]'s known values. */
        enum class Known {
            BUSINESS,
            MAILING,
            OTHER,
            PO_BOX,
            RESIDENTIAL,
        }

        /**
         * An enum containing [AddressType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AddressType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            MAILING,
            OTHER,
            PO_BOX,
            RESIDENTIAL,
            /**
             * An enum member indicating that [AddressType] was instantiated with an unknown value.
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
                BUSINESS -> Value.BUSINESS
                MAILING -> Value.MAILING
                OTHER -> Value.OTHER
                PO_BOX -> Value.PO_BOX
                RESIDENTIAL -> Value.RESIDENTIAL
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
                BUSINESS -> Known.BUSINESS
                MAILING -> Known.MAILING
                OTHER -> Known.OTHER
                PO_BOX -> Known.PO_BOX
                RESIDENTIAL -> Known.RESIDENTIAL
                else -> throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
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

        fun validate(): AddressType = apply {
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

            return other is AddressType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityAddressCreateRequest &&
            country == other.country &&
            line1 == other.line1 &&
            locality == other.locality &&
            postalCode == other.postalCode &&
            region == other.region &&
            addressTypes == other.addressTypes &&
            line2 == other.line2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            country,
            line1,
            locality,
            postalCode,
            region,
            addressTypes,
            line2,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
}
