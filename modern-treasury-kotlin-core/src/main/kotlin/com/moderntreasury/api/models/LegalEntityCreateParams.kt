// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class LegalEntityCreateParams
constructor(
    private val legalEntityType: LegalEntityType,
    private val addresses: List<LegalEntityAddressCreateRequest>?,
    private val businessName: String?,
    private val dateOfBirth: LocalDate?,
    private val doingBusinessAsNames: List<String>?,
    private val email: String?,
    private val firstName: String?,
    private val identifications: List<IdentificationCreateRequest>?,
    private val lastName: String?,
    private val legalStructure: LegalStructure?,
    private val metadata: Metadata?,
    private val phoneNumbers: List<PhoneNumber>?,
    private val website: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun legalEntityType(): LegalEntityType = legalEntityType

    fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

    fun businessName(): String? = businessName

    fun dateOfBirth(): LocalDate? = dateOfBirth

    fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

    fun email(): String? = email

    fun firstName(): String? = firstName

    fun identifications(): List<IdentificationCreateRequest>? = identifications

    fun lastName(): String? = lastName

    fun legalStructure(): LegalStructure? = legalStructure

    fun metadata(): Metadata? = metadata

    fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

    fun website(): String? = website

    internal fun getBody(): LegalEntityCreateBody {
        return LegalEntityCreateBody(
            legalEntityType,
            addresses,
            businessName,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
            identifications,
            lastName,
            legalStructure,
            metadata,
            phoneNumbers,
            website,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LegalEntityCreateBody.Builder::class)
    @NoAutoDetect
    class LegalEntityCreateBody
    internal constructor(
        private val legalEntityType: LegalEntityType?,
        private val addresses: List<LegalEntityAddressCreateRequest>?,
        private val businessName: String?,
        private val dateOfBirth: LocalDate?,
        private val doingBusinessAsNames: List<String>?,
        private val email: String?,
        private val firstName: String?,
        private val identifications: List<IdentificationCreateRequest>?,
        private val lastName: String?,
        private val legalStructure: LegalStructure?,
        private val metadata: Metadata?,
        private val phoneNumbers: List<PhoneNumber>?,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type") fun legalEntityType(): LegalEntityType? = legalEntityType

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

        /** The business's legal business name. */
        @JsonProperty("business_name") fun businessName(): String? = businessName

        /** An individual's data of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

        @JsonProperty("doing_business_as_names")
        fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

        /** The entity's primary email. */
        @JsonProperty("email") fun email(): String? = email

        /** An individual's first name. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        fun identifications(): List<IdentificationCreateRequest>? = identifications

        /** An individual's last name. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** The business's legal structure. */
        @JsonProperty("legal_structure") fun legalStructure(): LegalStructure? = legalStructure

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): String? = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityCreateBody &&
                this.legalEntityType == other.legalEntityType &&
                this.addresses == other.addresses &&
                this.businessName == other.businessName &&
                this.dateOfBirth == other.dateOfBirth &&
                this.doingBusinessAsNames == other.doingBusinessAsNames &&
                this.email == other.email &&
                this.firstName == other.firstName &&
                this.identifications == other.identifications &&
                this.lastName == other.lastName &&
                this.legalStructure == other.legalStructure &&
                this.metadata == other.metadata &&
                this.phoneNumbers == other.phoneNumbers &&
                this.website == other.website &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        legalEntityType,
                        addresses,
                        businessName,
                        dateOfBirth,
                        doingBusinessAsNames,
                        email,
                        firstName,
                        identifications,
                        lastName,
                        legalStructure,
                        metadata,
                        phoneNumbers,
                        website,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LegalEntityCreateBody{legalEntityType=$legalEntityType, addresses=$addresses, businessName=$businessName, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, phoneNumbers=$phoneNumbers, website=$website, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var legalEntityType: LegalEntityType? = null
            private var addresses: List<LegalEntityAddressCreateRequest>? = null
            private var businessName: String? = null
            private var dateOfBirth: LocalDate? = null
            private var doingBusinessAsNames: List<String>? = null
            private var email: String? = null
            private var firstName: String? = null
            private var identifications: List<IdentificationCreateRequest>? = null
            private var lastName: String? = null
            private var legalStructure: LegalStructure? = null
            private var metadata: Metadata? = null
            private var phoneNumbers: List<PhoneNumber>? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityCreateBody: LegalEntityCreateBody) = apply {
                this.legalEntityType = legalEntityCreateBody.legalEntityType
                this.addresses = legalEntityCreateBody.addresses
                this.businessName = legalEntityCreateBody.businessName
                this.dateOfBirth = legalEntityCreateBody.dateOfBirth
                this.doingBusinessAsNames = legalEntityCreateBody.doingBusinessAsNames
                this.email = legalEntityCreateBody.email
                this.firstName = legalEntityCreateBody.firstName
                this.identifications = legalEntityCreateBody.identifications
                this.lastName = legalEntityCreateBody.lastName
                this.legalStructure = legalEntityCreateBody.legalStructure
                this.metadata = legalEntityCreateBody.metadata
                this.phoneNumbers = legalEntityCreateBody.phoneNumbers
                this.website = legalEntityCreateBody.website
                additionalProperties(legalEntityCreateBody.additionalProperties)
            }

            /** The type of legal entity. */
            @JsonProperty("legal_entity_type")
            fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                this.legalEntityType = legalEntityType
            }

            /** A list of addresses for the entity. */
            @JsonProperty("addresses")
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                this.addresses = addresses
            }

            /** The business's legal business name. */
            @JsonProperty("business_name")
            fun businessName(businessName: String) = apply { this.businessName = businessName }

            /** An individual's data of birth (YYYY-MM-DD). */
            @JsonProperty("date_of_birth")
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            @JsonProperty("doing_business_as_names")
            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames
            }

            /** The entity's primary email. */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** An individual's first name. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            @JsonProperty("identifications")
            fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                this.identifications = identifications
            }

            /** An individual's last name. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The business's legal structure. */
            @JsonProperty("legal_structure")
            fun legalStructure(legalStructure: LegalStructure) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            @JsonProperty("phone_numbers")
            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The entity's primary website URL. */
            @JsonProperty("website") fun website(website: String) = apply { this.website = website }

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

            fun build(): LegalEntityCreateBody =
                LegalEntityCreateBody(
                    checkNotNull(legalEntityType) {
                        "`legalEntityType` is required but was not set"
                    },
                    addresses?.toUnmodifiable(),
                    businessName,
                    dateOfBirth,
                    doingBusinessAsNames?.toUnmodifiable(),
                    email,
                    firstName,
                    identifications?.toUnmodifiable(),
                    lastName,
                    legalStructure,
                    metadata,
                    phoneNumbers?.toUnmodifiable(),
                    website,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityCreateParams &&
            this.legalEntityType == other.legalEntityType &&
            this.addresses == other.addresses &&
            this.businessName == other.businessName &&
            this.dateOfBirth == other.dateOfBirth &&
            this.doingBusinessAsNames == other.doingBusinessAsNames &&
            this.email == other.email &&
            this.firstName == other.firstName &&
            this.identifications == other.identifications &&
            this.lastName == other.lastName &&
            this.legalStructure == other.legalStructure &&
            this.metadata == other.metadata &&
            this.phoneNumbers == other.phoneNumbers &&
            this.website == other.website &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            legalEntityType,
            addresses,
            businessName,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
            identifications,
            lastName,
            legalStructure,
            metadata,
            phoneNumbers,
            website,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LegalEntityCreateParams{legalEntityType=$legalEntityType, addresses=$addresses, businessName=$businessName, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, phoneNumbers=$phoneNumbers, website=$website, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var legalEntityType: LegalEntityType? = null
        private var addresses: MutableList<LegalEntityAddressCreateRequest> = mutableListOf()
        private var businessName: String? = null
        private var dateOfBirth: LocalDate? = null
        private var doingBusinessAsNames: MutableList<String> = mutableListOf()
        private var email: String? = null
        private var firstName: String? = null
        private var identifications: MutableList<IdentificationCreateRequest> = mutableListOf()
        private var lastName: String? = null
        private var legalStructure: LegalStructure? = null
        private var metadata: Metadata? = null
        private var phoneNumbers: MutableList<PhoneNumber> = mutableListOf()
        private var website: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityCreateParams: LegalEntityCreateParams) = apply {
            this.legalEntityType = legalEntityCreateParams.legalEntityType
            this.addresses(legalEntityCreateParams.addresses ?: listOf())
            this.businessName = legalEntityCreateParams.businessName
            this.dateOfBirth = legalEntityCreateParams.dateOfBirth
            this.doingBusinessAsNames(legalEntityCreateParams.doingBusinessAsNames ?: listOf())
            this.email = legalEntityCreateParams.email
            this.firstName = legalEntityCreateParams.firstName
            this.identifications(legalEntityCreateParams.identifications ?: listOf())
            this.lastName = legalEntityCreateParams.lastName
            this.legalStructure = legalEntityCreateParams.legalStructure
            this.metadata = legalEntityCreateParams.metadata
            this.phoneNumbers(legalEntityCreateParams.phoneNumbers ?: listOf())
            this.website = legalEntityCreateParams.website
            additionalQueryParams(legalEntityCreateParams.additionalQueryParams)
            additionalHeaders(legalEntityCreateParams.additionalHeaders)
            additionalBodyProperties(legalEntityCreateParams.additionalBodyProperties)
        }

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: LegalEntityType) = apply {
            this.legalEntityType = legalEntityType
        }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
            this.addresses.clear()
            this.addresses.addAll(addresses)
        }

        /** A list of addresses for the entity. */
        fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
            this.addresses.add(address)
        }

        /** The business's legal business name. */
        fun businessName(businessName: String) = apply { this.businessName = businessName }

        /** An individual's data of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
            this.doingBusinessAsNames.clear()
            this.doingBusinessAsNames.addAll(doingBusinessAsNames)
        }

        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            this.doingBusinessAsNames.add(doingBusinessAsName)
        }

        /** The entity's primary email. */
        fun email(email: String) = apply { this.email = email }

        /** An individual's first name. */
        fun firstName(firstName: String) = apply { this.firstName = firstName }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
            this.identifications.clear()
            this.identifications.addAll(identifications)
        }

        /** A list of identifications for the legal entity. */
        fun addIdentification(identification: IdentificationCreateRequest) = apply {
            this.identifications.add(identification)
        }

        /** An individual's last name. */
        fun lastName(lastName: String) = apply { this.lastName = lastName }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure) = apply {
            this.legalStructure = legalStructure
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
            this.phoneNumbers.clear()
            this.phoneNumbers.addAll(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { this.phoneNumbers.add(phoneNumber) }

        /** The entity's primary website URL. */
        fun website(website: String) = apply { this.website = website }

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

        fun build(): LegalEntityCreateParams =
            LegalEntityCreateParams(
                checkNotNull(legalEntityType) { "`legalEntityType` is required but was not set" },
                if (addresses.size == 0) null else addresses.toUnmodifiable(),
                businessName,
                dateOfBirth,
                if (doingBusinessAsNames.size == 0) null else doingBusinessAsNames.toUnmodifiable(),
                email,
                firstName,
                if (identifications.size == 0) null else identifications.toUnmodifiable(),
                lastName,
                legalStructure,
                metadata,
                if (phoneNumbers.size == 0) null else phoneNumbers.toUnmodifiable(),
                website,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class LegalEntityType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BUSINESS = LegalEntityType(JsonField.of("business"))

            val INDIVIDUAL = LegalEntityType(JsonField.of("individual"))

            fun of(value: String) = LegalEntityType(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = LegalEntityAddressCreateRequest.Builder::class)
    @NoAutoDetect
    class LegalEntityAddressCreateRequest
    private constructor(
        private val addressTypes: List<AddressType>?,
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The types of this address. */
        @JsonProperty("address_types") fun addressTypes(): List<AddressType>? = addressTypes

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String? = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String? = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityAddressCreateRequest &&
                this.addressTypes == other.addressTypes &&
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
                        addressTypes,
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
            "LegalEntityAddressCreateRequest{addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var addressTypes: List<AddressType>? = null
            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest) =
                apply {
                    this.addressTypes = legalEntityAddressCreateRequest.addressTypes
                    this.line1 = legalEntityAddressCreateRequest.line1
                    this.line2 = legalEntityAddressCreateRequest.line2
                    this.locality = legalEntityAddressCreateRequest.locality
                    this.region = legalEntityAddressCreateRequest.region
                    this.postalCode = legalEntityAddressCreateRequest.postalCode
                    this.country = legalEntityAddressCreateRequest.country
                    additionalProperties(legalEntityAddressCreateRequest.additionalProperties)
                }

            /** The types of this address. */
            @JsonProperty("address_types")
            fun addressTypes(addressTypes: List<AddressType>) = apply {
                this.addressTypes = addressTypes
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            @JsonProperty("region") fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): LegalEntityAddressCreateRequest =
                LegalEntityAddressCreateRequest(
                    addressTypes?.toUnmodifiable(),
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AddressType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AddressType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BUSINESS = AddressType(JsonField.of("business"))

                val MAILING = AddressType(JsonField.of("mailing"))

                val OTHER = AddressType(JsonField.of("other"))

                val PO_BOX = AddressType(JsonField.of("po_box"))

                val RESIDENTIAL = AddressType(JsonField.of("residential"))

                fun of(value: String) = AddressType(JsonField.of(value))
            }

            enum class Known {
                BUSINESS,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
            }

            enum class Value {
                BUSINESS,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    MAILING -> Value.MAILING
                    OTHER -> Value.OTHER
                    PO_BOX -> Value.PO_BOX
                    RESIDENTIAL -> Value.RESIDENTIAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    MAILING -> Known.MAILING
                    OTHER -> Known.OTHER
                    PO_BOX -> Known.PO_BOX
                    RESIDENTIAL -> Known.RESIDENTIAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = IdentificationCreateRequest.Builder::class)
    @NoAutoDetect
    class IdentificationCreateRequest
    private constructor(
        private val idNumber: String?,
        private val idType: IdType?,
        private val issuingCountry: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The ID number of identification document. */
        @JsonProperty("id_number") fun idNumber(): String? = idNumber

        /** The type of ID number. */
        @JsonProperty("id_type") fun idType(): IdType? = idType

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        @JsonProperty("issuing_country") fun issuingCountry(): String? = issuingCountry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdentificationCreateRequest &&
                this.idNumber == other.idNumber &&
                this.idType == other.idType &&
                this.issuingCountry == other.issuingCountry &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        idNumber,
                        idType,
                        issuingCountry,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var idNumber: String? = null
            private var idType: IdType? = null
            private var issuingCountry: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identificationCreateRequest: IdentificationCreateRequest) = apply {
                this.idNumber = identificationCreateRequest.idNumber
                this.idType = identificationCreateRequest.idType
                this.issuingCountry = identificationCreateRequest.issuingCountry
                additionalProperties(identificationCreateRequest.additionalProperties)
            }

            /** The ID number of identification document. */
            @JsonProperty("id_number")
            fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

            /** The type of ID number. */
            @JsonProperty("id_type") fun idType(idType: IdType) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country")
            fun issuingCountry(issuingCountry: String) = apply {
                this.issuingCountry = issuingCountry
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

            fun build(): IdentificationCreateRequest =
                IdentificationCreateRequest(
                    checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                    checkNotNull(idType) { "`idType` is required but was not set" },
                    issuingCountry,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class IdType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is IdType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val AR_CUIL = IdType(JsonField.of("ar_cuil"))

                val AR_CUIT = IdType(JsonField.of("ar_cuit"))

                val BR_CNPJ = IdType(JsonField.of("br_cnpj"))

                val BR_CPF = IdType(JsonField.of("br_cpf"))

                val CL_NUT = IdType(JsonField.of("cl_nut"))

                val CO_CEDULAS = IdType(JsonField.of("co_cedulas"))

                val CO_NIT = IdType(JsonField.of("co_nit"))

                val HN_ID = IdType(JsonField.of("hn_id"))

                val HN_RTN = IdType(JsonField.of("hn_rtn"))

                val PASSPORT = IdType(JsonField.of("passport"))

                val US_EIN = IdType(JsonField.of("us_ein"))

                val US_ITIN = IdType(JsonField.of("us_itin"))

                val US_SSN = IdType(JsonField.of("us_ssn"))

                fun of(value: String) = IdType(JsonField.of(value))
            }

            enum class Known {
                AR_CUIL,
                AR_CUIT,
                BR_CNPJ,
                BR_CPF,
                CL_NUT,
                CO_CEDULAS,
                CO_NIT,
                HN_ID,
                HN_RTN,
                PASSPORT,
                US_EIN,
                US_ITIN,
                US_SSN,
            }

            enum class Value {
                AR_CUIL,
                AR_CUIT,
                BR_CNPJ,
                BR_CPF,
                CL_NUT,
                CO_CEDULAS,
                CO_NIT,
                HN_ID,
                HN_RTN,
                PASSPORT,
                US_EIN,
                US_ITIN,
                US_SSN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AR_CUIL -> Value.AR_CUIL
                    AR_CUIT -> Value.AR_CUIT
                    BR_CNPJ -> Value.BR_CNPJ
                    BR_CPF -> Value.BR_CPF
                    CL_NUT -> Value.CL_NUT
                    CO_CEDULAS -> Value.CO_CEDULAS
                    CO_NIT -> Value.CO_NIT
                    HN_ID -> Value.HN_ID
                    HN_RTN -> Value.HN_RTN
                    PASSPORT -> Value.PASSPORT
                    US_EIN -> Value.US_EIN
                    US_ITIN -> Value.US_ITIN
                    US_SSN -> Value.US_SSN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AR_CUIL -> Known.AR_CUIL
                    AR_CUIT -> Known.AR_CUIT
                    BR_CNPJ -> Known.BR_CNPJ
                    BR_CPF -> Known.BR_CPF
                    CL_NUT -> Known.CL_NUT
                    CO_CEDULAS -> Known.CO_CEDULAS
                    CO_NIT -> Known.CO_NIT
                    HN_ID -> Known.HN_ID
                    HN_RTN -> Known.HN_RTN
                    PASSPORT -> Known.PASSPORT
                    US_EIN -> Known.US_EIN
                    US_ITIN -> Known.US_ITIN
                    US_SSN -> Known.US_SSN
                    else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class LegalStructure
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalStructure && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CORPORATION = LegalStructure(JsonField.of("corporation"))

            val LLC = LegalStructure(JsonField.of("llc"))

            val NON_PROFIT = LegalStructure(JsonField.of("non_profit"))

            val PARTNERSHIP = LegalStructure(JsonField.of("partnership"))

            val SOLE_PROPRIETORSHIP = LegalStructure(JsonField.of("sole_proprietorship"))

            val TRUST = LegalStructure(JsonField.of("trust"))

            fun of(value: String) = LegalStructure(JsonField.of(value))
        }

        enum class Known {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
        }

        enum class Value {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CORPORATION -> Value.CORPORATION
                LLC -> Value.LLC
                NON_PROFIT -> Value.NON_PROFIT
                PARTNERSHIP -> Value.PARTNERSHIP
                SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                TRUST -> Value.TRUST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CORPORATION -> Known.CORPORATION
                LLC -> Known.LLC
                NON_PROFIT -> Known.NON_PROFIT
                PARTNERSHIP -> Known.PARTNERSHIP
                SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                TRUST -> Known.TRUST
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }

    /** A list of phone numbers in E.164 format. */
    @JsonDeserialize(builder = PhoneNumber.Builder::class)
    @NoAutoDetect
    class PhoneNumber
    private constructor(
        private val phoneNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumber &&
                this.phoneNumber == other.phoneNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(phoneNumber, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var phoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties(phoneNumber.additionalProperties)
            }

            @JsonProperty("phone_number")
            fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

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

            fun build(): PhoneNumber =
                PhoneNumber(phoneNumber, additionalProperties.toUnmodifiable())
        }
    }
}
