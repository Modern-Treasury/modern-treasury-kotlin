// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

class LegalEntityUpdateParams
constructor(
    private val id: String,
    private val body: LegalEntityUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = id

    /** A list of addresses for the entity. */
    fun addresses(): List<LegalEntityAddressCreateRequest>? = body.addresses()

    fun bankSettings(): BankSettings? = body.bankSettings()

    /** The business's legal business name. */
    fun businessName(): String? = body.businessName()

    /** The country of citizenship for an individual. */
    fun citizenshipCountry(): String? = body.citizenshipCountry()

    /** A business's formation date (YYYY-MM-DD). */
    fun dateFormed(): LocalDate? = body.dateFormed()

    /** An individual's date of birth (YYYY-MM-DD). */
    fun dateOfBirth(): LocalDate? = body.dateOfBirth()

    fun doingBusinessAsNames(): List<String>? = body.doingBusinessAsNames()

    /** The entity's primary email. */
    fun email(): String? = body.email()

    /** An individual's first name. */
    fun firstName(): String? = body.firstName()

    /** A list of identifications for the legal entity. */
    fun identifications(): List<IdentificationCreateRequest>? = body.identifications()

    /** An individual's last name. */
    fun lastName(): String? = body.lastName()

    /** The business's legal structure. */
    fun legalStructure(): LegalStructure? = body.legalStructure()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /** An individual's middle name. */
    fun middleName(): String? = body.middleName()

    fun phoneNumbers(): List<PhoneNumber>? = body.phoneNumbers()

    /** Whether the individual is a politically exposed person. */
    fun politicallyExposedPerson(): Boolean? = body.politicallyExposedPerson()

    /** An individual's preferred name. */
    fun preferredName(): String? = body.preferredName()

    /** An individual's prefix. */
    fun prefix(): String? = body.prefix()

    /** The risk rating of the legal entity. One of low, medium, high. */
    fun riskRating(): RiskRating? = body.riskRating()

    /** An individual's suffix. */
    fun suffix(): String? = body.suffix()

    fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
        body.wealthAndEmploymentDetails()

    /** The entity's primary website URL. */
    fun website(): String? = body.website()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): LegalEntityUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class LegalEntityUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("addresses") private val addresses: List<LegalEntityAddressCreateRequest>?,
        @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
        @JsonProperty("business_name") private val businessName: String?,
        @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
        @JsonProperty("date_formed") private val dateFormed: LocalDate?,
        @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
        @JsonProperty("doing_business_as_names") private val doingBusinessAsNames: List<String>?,
        @JsonProperty("email") private val email: String?,
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("identifications")
        private val identifications: List<IdentificationCreateRequest>?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
        @JsonProperty("politically_exposed_person") private val politicallyExposedPerson: Boolean?,
        @JsonProperty("preferred_name") private val preferredName: String?,
        @JsonProperty("prefix") private val prefix: String?,
        @JsonProperty("risk_rating") private val riskRating: RiskRating?,
        @JsonProperty("suffix") private val suffix: String?,
        @JsonProperty("wealth_and_employment_details")
        private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
        @JsonProperty("website") private val website: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

        @JsonProperty("bank_settings") fun bankSettings(): BankSettings? = bankSettings

        /** The business's legal business name. */
        @JsonProperty("business_name") fun businessName(): String? = businessName

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country") fun citizenshipCountry(): String? = citizenshipCountry

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

        /** An individual's date of birth (YYYY-MM-DD). */
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

        /** An individual's middle name. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        fun politicallyExposedPerson(): Boolean? = politicallyExposedPerson

        /** An individual's preferred name. */
        @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

        /** An individual's prefix. */
        @JsonProperty("prefix") fun prefix(): String? = prefix

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating") fun riskRating(): RiskRating? = riskRating

        /** An individual's suffix. */
        @JsonProperty("suffix") fun suffix(): String? = suffix

        @JsonProperty("wealth_and_employment_details")
        fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? = wealthAndEmploymentDetails

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): String? = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
            private var bankSettings: BankSettings? = null
            private var businessName: String? = null
            private var citizenshipCountry: String? = null
            private var dateFormed: LocalDate? = null
            private var dateOfBirth: LocalDate? = null
            private var doingBusinessAsNames: MutableList<String>? = null
            private var email: String? = null
            private var firstName: String? = null
            private var identifications: MutableList<IdentificationCreateRequest>? = null
            private var lastName: String? = null
            private var legalStructure: LegalStructure? = null
            private var metadata: Metadata? = null
            private var middleName: String? = null
            private var phoneNumbers: MutableList<PhoneNumber>? = null
            private var politicallyExposedPerson: Boolean? = null
            private var preferredName: String? = null
            private var prefix: String? = null
            private var riskRating: RiskRating? = null
            private var suffix: String? = null
            private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityUpdateBody: LegalEntityUpdateBody) = apply {
                addresses = legalEntityUpdateBody.addresses?.toMutableList()
                bankSettings = legalEntityUpdateBody.bankSettings
                businessName = legalEntityUpdateBody.businessName
                citizenshipCountry = legalEntityUpdateBody.citizenshipCountry
                dateFormed = legalEntityUpdateBody.dateFormed
                dateOfBirth = legalEntityUpdateBody.dateOfBirth
                doingBusinessAsNames = legalEntityUpdateBody.doingBusinessAsNames?.toMutableList()
                email = legalEntityUpdateBody.email
                firstName = legalEntityUpdateBody.firstName
                identifications = legalEntityUpdateBody.identifications?.toMutableList()
                lastName = legalEntityUpdateBody.lastName
                legalStructure = legalEntityUpdateBody.legalStructure
                metadata = legalEntityUpdateBody.metadata
                middleName = legalEntityUpdateBody.middleName
                phoneNumbers = legalEntityUpdateBody.phoneNumbers?.toMutableList()
                politicallyExposedPerson = legalEntityUpdateBody.politicallyExposedPerson
                preferredName = legalEntityUpdateBody.preferredName
                prefix = legalEntityUpdateBody.prefix
                riskRating = legalEntityUpdateBody.riskRating
                suffix = legalEntityUpdateBody.suffix
                wealthAndEmploymentDetails = legalEntityUpdateBody.wealthAndEmploymentDetails
                website = legalEntityUpdateBody.website
                additionalProperties = legalEntityUpdateBody.additionalProperties.toMutableMap()
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                this.addresses = addresses.toMutableList()
            }

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses = (addresses ?: mutableListOf()).apply { add(address) }
            }

            fun bankSettings(bankSettings: BankSettings) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            fun businessName(businessName: String) = apply { this.businessName = businessName }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.toMutableList()
            }

            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: mutableListOf()).apply { add(doingBusinessAsName) }
            }

            /** The entity's primary email. */
            fun email(email: String) = apply { this.email = email }

            /** An individual's first name. */
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                this.identifications = identifications.toMutableList()
            }

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications = (identifications ?: mutableListOf()).apply { add(identification) }
            }

            /** An individual's last name. */
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                this.phoneNumbers = phoneNumbers.toMutableList()
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            /** An individual's prefix. */
            fun prefix(prefix: String) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

            /** An individual's suffix. */
            fun suffix(suffix: String) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails) =
                apply {
                    this.wealthAndEmploymentDetails = wealthAndEmploymentDetails
                }

            /** The entity's primary website URL. */
            fun website(website: String) = apply { this.website = website }

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

            fun build(): LegalEntityUpdateBody =
                LegalEntityUpdateBody(
                    addresses?.toImmutable(),
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    dateFormed,
                    dateOfBirth,
                    doingBusinessAsNames?.toImmutable(),
                    email,
                    firstName,
                    identifications?.toImmutable(),
                    lastName,
                    legalStructure,
                    metadata,
                    middleName,
                    phoneNumbers?.toImmutable(),
                    politicallyExposedPerson,
                    preferredName,
                    prefix,
                    riskRating,
                    suffix,
                    wealthAndEmploymentDetails,
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityUpdateBody && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityUpdateBody{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var body: LegalEntityUpdateBody.Builder = LegalEntityUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(legalEntityUpdateParams: LegalEntityUpdateParams) = apply {
            id = legalEntityUpdateParams.id
            body = legalEntityUpdateParams.body.toBuilder()
            additionalHeaders = legalEntityUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = legalEntityUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
            body.addresses(addresses)
        }

        /** A list of addresses for the entity. */
        fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
            body.addAddress(address)
        }

        fun bankSettings(bankSettings: BankSettings) = apply { body.bankSettings(bankSettings) }

        /** The business's legal business name. */
        fun businessName(businessName: String) = apply { body.businessName(businessName) }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String) = apply {
            body.citizenshipCountry(citizenshipCountry)
        }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate) = apply { body.dateFormed(dateFormed) }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate) = apply { body.dateOfBirth(dateOfBirth) }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
            body.doingBusinessAsNames(doingBusinessAsNames)
        }

        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            body.addDoingBusinessAsName(doingBusinessAsName)
        }

        /** The entity's primary email. */
        fun email(email: String) = apply { body.email(email) }

        /** An individual's first name. */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
            body.identifications(identifications)
        }

        /** A list of identifications for the legal entity. */
        fun addIdentification(identification: IdentificationCreateRequest) = apply {
            body.addIdentification(identification)
        }

        /** An individual's last name. */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure) = apply {
            body.legalStructure(legalStructure)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /** An individual's middle name. */
        fun middleName(middleName: String) = apply { body.middleName(middleName) }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { body.addPhoneNumber(phoneNumber) }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
            body.politicallyExposedPerson(politicallyExposedPerson)
        }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String) = apply { body.preferredName(preferredName) }

        /** An individual's prefix. */
        fun prefix(prefix: String) = apply { body.prefix(prefix) }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating) = apply { body.riskRating(riskRating) }

        /** An individual's suffix. */
        fun suffix(suffix: String) = apply { body.suffix(suffix) }

        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails) =
            apply {
                body.wealthAndEmploymentDetails(wealthAndEmploymentDetails)
            }

        /** The entity's primary website URL. */
        fun website(website: String) = apply { body.website(website) }

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): LegalEntityUpdateParams =
            LegalEntityUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class LegalEntityAddressCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
        @JsonProperty("line1") private val line1: String?,
        @JsonProperty("line2") private val line2: String?,
        @JsonProperty("locality") private val locality: String?,
        @JsonProperty("region") private val region: String?,
        @JsonProperty("postal_code") private val postalCode: String?,
        @JsonProperty("country") private val country: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var addressTypes: MutableList<AddressType>? = null
            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest) =
                apply {
                    addressTypes = legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                    line1 = legalEntityAddressCreateRequest.line1
                    line2 = legalEntityAddressCreateRequest.line2
                    locality = legalEntityAddressCreateRequest.locality
                    region = legalEntityAddressCreateRequest.region
                    postalCode = legalEntityAddressCreateRequest.postalCode
                    country = legalEntityAddressCreateRequest.country
                    additionalProperties =
                        legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                }

            /** The types of this address. */
            fun addressTypes(addressTypes: List<AddressType>) = apply {
                this.addressTypes = addressTypes.toMutableList()
            }

            /** The types of this address. */
            fun addAddressType(addressType: AddressType) = apply {
                addressTypes = (addressTypes ?: mutableListOf()).apply { add(addressType) }
            }

            fun line1(line1: String) = apply { this.line1 = line1 }

            fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

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

            fun build(): LegalEntityAddressCreateRequest =
                LegalEntityAddressCreateRequest(
                    addressTypes?.toImmutable(),
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toImmutable(),
                )
        }

        class AddressType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BUSINESS = of("business")

                val MAILING = of("mailing")

                val OTHER = of("other")

                val PO_BOX = of("po_box")

                val RESIDENTIAL = of("residential")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityAddressCreateRequest && addressTypes == other.addressTypes && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addressTypes, line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityAddressCreateRequest{addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class IdentificationCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("id_number") private val idNumber: String,
        @JsonProperty("id_type") private val idType: IdType,
        @JsonProperty("issuing_country") private val issuingCountry: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID number of identification document. */
        @JsonProperty("id_number") fun idNumber(): String = idNumber

        /** The type of ID number. */
        @JsonProperty("id_type") fun idType(): IdType = idType

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        @JsonProperty("issuing_country") fun issuingCountry(): String? = issuingCountry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var idNumber: String? = null
            private var idType: IdType? = null
            private var issuingCountry: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identificationCreateRequest: IdentificationCreateRequest) = apply {
                idNumber = identificationCreateRequest.idNumber
                idType = identificationCreateRequest.idType
                issuingCountry = identificationCreateRequest.issuingCountry
                additionalProperties =
                    identificationCreateRequest.additionalProperties.toMutableMap()
            }

            /** The ID number of identification document. */
            fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

            /** The type of ID number. */
            fun idType(idType: IdType) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String) = apply {
                this.issuingCountry = issuingCountry
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

            fun build(): IdentificationCreateRequest =
                IdentificationCreateRequest(
                    checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                    checkNotNull(idType) { "`idType` is required but was not set" },
                    issuingCountry,
                    additionalProperties.toImmutable(),
                )
        }

        class IdType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AR_CUIL = of("ar_cuil")

                val AR_CUIT = of("ar_cuit")

                val BR_CNPJ = of("br_cnpj")

                val BR_CPF = of("br_cpf")

                val CL_RUN = of("cl_run")

                val CL_RUT = of("cl_rut")

                val CO_CEDULAS = of("co_cedulas")

                val CO_NIT = of("co_nit")

                val HN_ID = of("hn_id")

                val HN_RTN = of("hn_rtn")

                val IN_LEI = of("in_lei")

                val KR_BRN = of("kr_brn")

                val KR_CRN = of("kr_crn")

                val KR_RRN = of("kr_rrn")

                val PASSPORT = of("passport")

                val SA_TIN = of("sa_tin")

                val SA_VAT = of("sa_vat")

                val US_EIN = of("us_ein")

                val US_ITIN = of("us_itin")

                val US_SSN = of("us_ssn")

                val VN_TIN = of("vn_tin")

                fun of(value: String) = IdType(JsonField.of(value))
            }

            enum class Known {
                AR_CUIL,
                AR_CUIT,
                BR_CNPJ,
                BR_CPF,
                CL_RUN,
                CL_RUT,
                CO_CEDULAS,
                CO_NIT,
                HN_ID,
                HN_RTN,
                IN_LEI,
                KR_BRN,
                KR_CRN,
                KR_RRN,
                PASSPORT,
                SA_TIN,
                SA_VAT,
                US_EIN,
                US_ITIN,
                US_SSN,
                VN_TIN,
            }

            enum class Value {
                AR_CUIL,
                AR_CUIT,
                BR_CNPJ,
                BR_CPF,
                CL_RUN,
                CL_RUT,
                CO_CEDULAS,
                CO_NIT,
                HN_ID,
                HN_RTN,
                IN_LEI,
                KR_BRN,
                KR_CRN,
                KR_RRN,
                PASSPORT,
                SA_TIN,
                SA_VAT,
                US_EIN,
                US_ITIN,
                US_SSN,
                VN_TIN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AR_CUIL -> Value.AR_CUIL
                    AR_CUIT -> Value.AR_CUIT
                    BR_CNPJ -> Value.BR_CNPJ
                    BR_CPF -> Value.BR_CPF
                    CL_RUN -> Value.CL_RUN
                    CL_RUT -> Value.CL_RUT
                    CO_CEDULAS -> Value.CO_CEDULAS
                    CO_NIT -> Value.CO_NIT
                    HN_ID -> Value.HN_ID
                    HN_RTN -> Value.HN_RTN
                    IN_LEI -> Value.IN_LEI
                    KR_BRN -> Value.KR_BRN
                    KR_CRN -> Value.KR_CRN
                    KR_RRN -> Value.KR_RRN
                    PASSPORT -> Value.PASSPORT
                    SA_TIN -> Value.SA_TIN
                    SA_VAT -> Value.SA_VAT
                    US_EIN -> Value.US_EIN
                    US_ITIN -> Value.US_ITIN
                    US_SSN -> Value.US_SSN
                    VN_TIN -> Value.VN_TIN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AR_CUIL -> Known.AR_CUIL
                    AR_CUIT -> Known.AR_CUIT
                    BR_CNPJ -> Known.BR_CNPJ
                    BR_CPF -> Known.BR_CPF
                    CL_RUN -> Known.CL_RUN
                    CL_RUT -> Known.CL_RUT
                    CO_CEDULAS -> Known.CO_CEDULAS
                    CO_NIT -> Known.CO_NIT
                    HN_ID -> Known.HN_ID
                    HN_RTN -> Known.HN_RTN
                    IN_LEI -> Known.IN_LEI
                    KR_BRN -> Known.KR_BRN
                    KR_CRN -> Known.KR_CRN
                    KR_RRN -> Known.KR_RRN
                    PASSPORT -> Known.PASSPORT
                    SA_TIN -> Known.SA_TIN
                    SA_VAT -> Known.SA_VAT
                    US_EIN -> Known.US_EIN
                    US_ITIN -> Known.US_ITIN
                    US_SSN -> Known.US_SSN
                    VN_TIN -> Known.VN_TIN
                    else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
    }

    class LegalStructure
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CORPORATION = of("corporation")

            val LLC = of("llc")

            val NON_PROFIT = of("non_profit")

            val PARTNERSHIP = of("partnership")

            val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

            val TRUST = of("trust")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** A list of phone numbers in E.164 format. */
    @NoAutoDetect
    class PhoneNumber
    @JsonCreator
    private constructor(
        @JsonProperty("phone_number") private val phoneNumber: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var phoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

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

            fun build(): PhoneNumber = PhoneNumber(phoneNumber, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class RiskRating
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val LOW = of("low")

            val MEDIUM = of("medium")

            val HIGH = of("high")

            fun of(value: String) = RiskRating(JsonField.of(value))
        }

        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
        }

        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LegalEntityUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LegalEntityUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
