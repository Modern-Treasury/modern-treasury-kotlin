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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class ChildLegalEntityCreate
private constructor(
    private val addresses: JsonField<List<LegalEntityAddressCreateRequest>>,
    private val bankSettings: JsonField<BankSettings>,
    private val businessName: JsonField<String>,
    private val citizenshipCountry: JsonField<String>,
    private val complianceDetails: JsonField<LegalEntityComplianceDetail>,
    private val dateFormed: JsonField<LocalDate>,
    private val dateOfBirth: JsonField<LocalDate>,
    private val doingBusinessAsNames: JsonField<List<String>>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val identifications: JsonField<List<IdentificationCreateRequest>>,
    private val industryClassifications: JsonField<List<LegalEntityIndustryClassification>>,
    private val lastName: JsonField<String>,
    private val legalEntityType: JsonField<LegalEntityType>,
    private val legalStructure: JsonField<LegalStructure>,
    private val metadata: JsonField<Metadata>,
    private val middleName: JsonField<String>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val politicallyExposedPerson: JsonField<Boolean>,
    private val preferredName: JsonField<String>,
    private val prefix: JsonField<String>,
    private val riskRating: JsonField<RiskRating>,
    private val suffix: JsonField<String>,
    private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>,
    private val website: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        addresses: JsonField<List<LegalEntityAddressCreateRequest>> = JsonMissing.of(),
        @JsonProperty("bank_settings")
        @ExcludeMissing
        bankSettings: JsonField<BankSettings> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        citizenshipCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compliance_details")
        @ExcludeMissing
        complianceDetails: JsonField<LegalEntityComplianceDetail> = JsonMissing.of(),
        @JsonProperty("date_formed")
        @ExcludeMissing
        dateFormed: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifications")
        @ExcludeMissing
        identifications: JsonField<List<IdentificationCreateRequest>> = JsonMissing.of(),
        @JsonProperty("industry_classifications")
        @ExcludeMissing
        industryClassifications: JsonField<List<LegalEntityIndustryClassification>> =
            JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
        @JsonProperty("legal_structure")
        @ExcludeMissing
        legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("preferred_name")
        @ExcludeMissing
        preferredName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("risk_rating")
        @ExcludeMissing
        riskRating: JsonField<RiskRating> = JsonMissing.of(),
        @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
    ) : this(
        addresses,
        bankSettings,
        businessName,
        citizenshipCountry,
        complianceDetails,
        dateFormed,
        dateOfBirth,
        doingBusinessAsNames,
        email,
        firstName,
        identifications,
        industryClassifications,
        lastName,
        legalEntityType,
        legalStructure,
        metadata,
        middleName,
        phoneNumbers,
        politicallyExposedPerson,
        preferredName,
        prefix,
        riskRating,
        suffix,
        wealthAndEmploymentDetails,
        website,
        mutableMapOf(),
    )

    /**
     * A list of addresses for the entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses.getNullable("addresses")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

    /**
     * The business's legal business name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessName(): String? = businessName.getNullable("business_name")

    /**
     * The country of citizenship for an individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun complianceDetails(): LegalEntityComplianceDetail? =
        complianceDetails.getNullable("compliance_details")

    /**
     * A business's formation date (YYYY-MM-DD).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

    /**
     * An individual's date of birth (YYYY-MM-DD).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun doingBusinessAsNames(): List<String>? =
        doingBusinessAsNames.getNullable("doing_business_as_names")

    /**
     * The entity's primary email.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * An individual's first name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstName(): String? = firstName.getNullable("first_name")

    /**
     * A list of identifications for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun identifications(): List<IdentificationCreateRequest>? =
        identifications.getNullable("identifications")

    /**
     * A list of industry classifications for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun industryClassifications(): List<LegalEntityIndustryClassification>? =
        industryClassifications.getNullable("industry_classifications")

    /**
     * An individual's last name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastName(): String? = lastName.getNullable("last_name")

    /**
     * The type of legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun legalEntityType(): LegalEntityType? = legalEntityType.getNullable("legal_entity_type")

    /**
     * The business's legal structure.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * An individual's middle name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun middleName(): String? = middleName.getNullable("middle_name")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

    /**
     * Whether the individual is a politically exposed person.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun politicallyExposedPerson(): Boolean? =
        politicallyExposedPerson.getNullable("politically_exposed_person")

    /**
     * An individual's preferred name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun preferredName(): String? = preferredName.getNullable("preferred_name")

    /**
     * An individual's prefix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prefix(): String? = prefix.getNullable("prefix")

    /**
     * The risk rating of the legal entity. One of low, medium, high.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

    /**
     * An individual's suffix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun suffix(): String? = suffix.getNullable("suffix")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
        wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

    /**
     * The entity's primary website URL.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun website(): String? = website.getNullable("website")

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addresses")
    @ExcludeMissing
    fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

    /**
     * Returns the raw JSON value of [bankSettings].
     *
     * Unlike [bankSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank_settings")
    @ExcludeMissing
    fun _bankSettings(): JsonField<BankSettings> = bankSettings

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_name")
    @ExcludeMissing
    fun _businessName(): JsonField<String> = businessName

    /**
     * Returns the raw JSON value of [citizenshipCountry].
     *
     * Unlike [citizenshipCountry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("citizenship_country")
    @ExcludeMissing
    fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

    /**
     * Returns the raw JSON value of [complianceDetails].
     *
     * Unlike [complianceDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("compliance_details")
    @ExcludeMissing
    fun _complianceDetails(): JsonField<LegalEntityComplianceDetail> = complianceDetails

    /**
     * Returns the raw JSON value of [dateFormed].
     *
     * Unlike [dateFormed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_formed")
    @ExcludeMissing
    fun _dateFormed(): JsonField<LocalDate> = dateFormed

    /**
     * Returns the raw JSON value of [dateOfBirth].
     *
     * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_of_birth")
    @ExcludeMissing
    fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

    /**
     * Returns the raw JSON value of [doingBusinessAsNames].
     *
     * Unlike [doingBusinessAsNames], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("doing_business_as_names")
    @ExcludeMissing
    fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [identifications].
     *
     * Unlike [identifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifications")
    @ExcludeMissing
    fun _identifications(): JsonField<List<IdentificationCreateRequest>> = identifications

    /**
     * Returns the raw JSON value of [industryClassifications].
     *
     * Unlike [industryClassifications], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("industry_classifications")
    @ExcludeMissing
    fun _industryClassifications(): JsonField<List<LegalEntityIndustryClassification>> =
        industryClassifications

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [legalEntityType].
     *
     * Unlike [legalEntityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_entity_type")
    @ExcludeMissing
    fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

    /**
     * Returns the raw JSON value of [legalStructure].
     *
     * Unlike [legalStructure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_structure")
    @ExcludeMissing
    fun _legalStructure(): JsonField<LegalStructure> = legalStructure

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [politicallyExposedPerson].
     *
     * Unlike [politicallyExposedPerson], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("politically_exposed_person")
    @ExcludeMissing
    fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

    /**
     * Returns the raw JSON value of [preferredName].
     *
     * Unlike [preferredName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferred_name")
    @ExcludeMissing
    fun _preferredName(): JsonField<String> = preferredName

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    /**
     * Returns the raw JSON value of [riskRating].
     *
     * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("risk_rating")
    @ExcludeMissing
    fun _riskRating(): JsonField<RiskRating> = riskRating

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

    /**
     * Returns the raw JSON value of [wealthAndEmploymentDetails].
     *
     * Unlike [wealthAndEmploymentDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("wealth_and_employment_details")
    @ExcludeMissing
    fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
        wealthAndEmploymentDetails

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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

        /** Returns a mutable builder for constructing an instance of [ChildLegalEntityCreate]. */
        fun builder() = Builder()
    }

    /** A builder for [ChildLegalEntityCreate]. */
    class Builder internal constructor() {

        private var addresses: JsonField<MutableList<LegalEntityAddressCreateRequest>>? = null
        private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
        private var businessName: JsonField<String> = JsonMissing.of()
        private var citizenshipCountry: JsonField<String> = JsonMissing.of()
        private var complianceDetails: JsonField<LegalEntityComplianceDetail> = JsonMissing.of()
        private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
        private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
        private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
        private var industryClassifications:
            JsonField<MutableList<LegalEntityIndustryClassification>>? =
            null
        private var lastName: JsonField<String> = JsonMissing.of()
        private var legalEntityType: JsonField<LegalEntityType> = JsonMissing.of()
        private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of()
        private var preferredName: JsonField<String> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var riskRating: JsonField<RiskRating> = JsonMissing.of()
        private var suffix: JsonField<String> = JsonMissing.of()
        private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
            JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
            addresses = childLegalEntityCreate.addresses.map { it.toMutableList() }
            bankSettings = childLegalEntityCreate.bankSettings
            businessName = childLegalEntityCreate.businessName
            citizenshipCountry = childLegalEntityCreate.citizenshipCountry
            complianceDetails = childLegalEntityCreate.complianceDetails
            dateFormed = childLegalEntityCreate.dateFormed
            dateOfBirth = childLegalEntityCreate.dateOfBirth
            doingBusinessAsNames =
                childLegalEntityCreate.doingBusinessAsNames.map { it.toMutableList() }
            email = childLegalEntityCreate.email
            firstName = childLegalEntityCreate.firstName
            identifications = childLegalEntityCreate.identifications.map { it.toMutableList() }
            industryClassifications =
                childLegalEntityCreate.industryClassifications.map { it.toMutableList() }
            lastName = childLegalEntityCreate.lastName
            legalEntityType = childLegalEntityCreate.legalEntityType
            legalStructure = childLegalEntityCreate.legalStructure
            metadata = childLegalEntityCreate.metadata
            middleName = childLegalEntityCreate.middleName
            phoneNumbers = childLegalEntityCreate.phoneNumbers.map { it.toMutableList() }
            politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
            preferredName = childLegalEntityCreate.preferredName
            prefix = childLegalEntityCreate.prefix
            riskRating = childLegalEntityCreate.riskRating
            suffix = childLegalEntityCreate.suffix
            wealthAndEmploymentDetails = childLegalEntityCreate.wealthAndEmploymentDetails
            website = childLegalEntityCreate.website
            additionalProperties = childLegalEntityCreate.additionalProperties.toMutableMap()
        }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
            addresses(JsonField.of(addresses))

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed
         * `List<LegalEntityAddressCreateRequest>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
            this.addresses = addresses.map { it.toMutableList() }
        }

        /**
         * Adds a single [LegalEntityAddressCreateRequest] to [addresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
            addresses =
                (addresses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addresses", it).add(address)
                }
        }

        fun bankSettings(bankSettings: BankSettings?) =
            bankSettings(JsonField.ofNullable(bankSettings))

        /**
         * Sets [Builder.bankSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankSettings] with a well-typed [BankSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
            this.bankSettings = bankSettings
        }

        /** The business's legal business name. */
        fun businessName(businessName: String?) = businessName(JsonField.ofNullable(businessName))

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            this.businessName = businessName
        }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String?) =
            citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

        /**
         * Sets [Builder.citizenshipCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citizenshipCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
            this.citizenshipCountry = citizenshipCountry
        }

        fun complianceDetails(complianceDetails: LegalEntityComplianceDetail?) =
            complianceDetails(JsonField.ofNullable(complianceDetails))

        /**
         * Sets [Builder.complianceDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complianceDetails] with a well-typed
         * [LegalEntityComplianceDetail] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun complianceDetails(complianceDetails: JsonField<LegalEntityComplianceDetail>) = apply {
            this.complianceDetails = complianceDetails
        }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

        /**
         * Sets [Builder.dateFormed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFormed] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateFormed(dateFormed: JsonField<LocalDate>) = apply { this.dateFormed = dateFormed }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate?) = dateOfBirth(JsonField.ofNullable(dateOfBirth))

        /**
         * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
            this.dateOfBirth = dateOfBirth
        }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
            doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

        /**
         * Sets [Builder.doingBusinessAsNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAsNames] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
            this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [doingBusinessAsNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            doingBusinessAsNames =
                (doingBusinessAsNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("doingBusinessAsNames", it).add(doingBusinessAsName)
                }
        }

        /** The entity's primary email. */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** An individual's first name. */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<IdentificationCreateRequest>) =
            identifications(JsonField.of(identifications))

        /**
         * Sets [Builder.identifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifications] with a well-typed
         * `List<IdentificationCreateRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) = apply {
            this.identifications = identifications.map { it.toMutableList() }
        }

        /**
         * Adds a single [IdentificationCreateRequest] to [identifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIdentification(identification: IdentificationCreateRequest) = apply {
            identifications =
                (identifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("identifications", it).add(identification)
                }
        }

        /** A list of industry classifications for the legal entity. */
        fun industryClassifications(
            industryClassifications: List<LegalEntityIndustryClassification>
        ) = industryClassifications(JsonField.of(industryClassifications))

        /**
         * Sets [Builder.industryClassifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industryClassifications] with a well-typed
         * `List<LegalEntityIndustryClassification>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun industryClassifications(
            industryClassifications: JsonField<List<LegalEntityIndustryClassification>>
        ) = apply {
            this.industryClassifications = industryClassifications.map { it.toMutableList() }
        }

        /**
         * Adds a single [LegalEntityIndustryClassification] to [industryClassifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndustryClassification(industryClassification: LegalEntityIndustryClassification) =
            apply {
                industryClassifications =
                    (industryClassifications ?: JsonField.of(mutableListOf())).also {
                        checkKnown("industryClassifications", it).add(industryClassification)
                    }
            }

        /** An individual's last name. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: LegalEntityType) =
            legalEntityType(JsonField.of(legalEntityType))

        /**
         * Sets [Builder.legalEntityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityType] with a well-typed [LegalEntityType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
            this.legalEntityType = legalEntityType
        }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure?) =
            legalStructure(JsonField.ofNullable(legalStructure))

        /**
         * Sets [Builder.legalStructure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalStructure] with a well-typed [LegalStructure] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
            this.legalStructure = legalStructure
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** An individual's middle name. */
        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
            politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

        /**
         * Alias for [Builder.politicallyExposedPerson].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
            politicallyExposedPerson(politicallyExposedPerson as Boolean?)

        /**
         * Sets [Builder.politicallyExposedPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.politicallyExposedPerson] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
            this.politicallyExposedPerson = politicallyExposedPerson
        }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String?) =
            preferredName(JsonField.ofNullable(preferredName))

        /**
         * Sets [Builder.preferredName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        /** An individual's prefix. */
        fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

        /**
         * Sets [Builder.riskRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { this.riskRating = riskRating }

        /** An individual's suffix. */
        fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails?) =
            wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

        /**
         * Sets [Builder.wealthAndEmploymentDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wealthAndEmploymentDetails] with a well-typed
         * [WealthAndEmploymentDetails] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
        ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

        /** The entity's primary website URL. */
        fun website(website: String?) = website(JsonField.ofNullable(website))

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { this.website = website }

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
         * Returns an immutable instance of [ChildLegalEntityCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChildLegalEntityCreate =
            ChildLegalEntityCreate(
                (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                bankSettings,
                businessName,
                citizenshipCountry,
                complianceDetails,
                dateFormed,
                dateOfBirth,
                (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                email,
                firstName,
                (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                (industryClassifications ?: JsonMissing.of()).map { it.toImmutable() },
                lastName,
                legalEntityType,
                legalStructure,
                metadata,
                middleName,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                politicallyExposedPerson,
                preferredName,
                prefix,
                riskRating,
                suffix,
                wealthAndEmploymentDetails,
                website,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChildLegalEntityCreate = apply {
        if (validated) {
            return@apply
        }

        addresses()?.forEach { it.validate() }
        bankSettings()?.validate()
        businessName()
        citizenshipCountry()
        complianceDetails()?.validate()
        dateFormed()
        dateOfBirth()
        doingBusinessAsNames()
        email()
        firstName()
        identifications()?.forEach { it.validate() }
        industryClassifications()?.forEach { it.validate() }
        lastName()
        legalEntityType()?.validate()
        legalStructure()?.validate()
        metadata()?.validate()
        middleName()
        phoneNumbers()?.forEach { it.validate() }
        politicallyExposedPerson()
        preferredName()
        prefix()
        riskRating()?.validate()
        suffix()
        wealthAndEmploymentDetails()?.validate()
        website()
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
        (addresses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (bankSettings.asKnown()?.validity() ?: 0) +
            (if (businessName.asKnown() == null) 0 else 1) +
            (if (citizenshipCountry.asKnown() == null) 0 else 1) +
            (complianceDetails.asKnown()?.validity() ?: 0) +
            (if (dateFormed.asKnown() == null) 0 else 1) +
            (if (dateOfBirth.asKnown() == null) 0 else 1) +
            (doingBusinessAsNames.asKnown()?.size ?: 0) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (firstName.asKnown() == null) 0 else 1) +
            (identifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (industryClassifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (lastName.asKnown() == null) 0 else 1) +
            (legalEntityType.asKnown()?.validity() ?: 0) +
            (legalStructure.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (middleName.asKnown() == null) 0 else 1) +
            (phoneNumbers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (politicallyExposedPerson.asKnown() == null) 0 else 1) +
            (if (preferredName.asKnown() == null) 0 else 1) +
            (if (prefix.asKnown() == null) 0 else 1) +
            (riskRating.asKnown()?.validity() ?: 0) +
            (if (suffix.asKnown() == null) 0 else 1) +
            (wealthAndEmploymentDetails.asKnown()?.validity() ?: 0) +
            (if (website.asKnown() == null) 0 else 1)

    /** The type of legal entity. */
    class LegalEntityType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val INDIVIDUAL = of("individual")

            fun of(value: String) = LegalEntityType(JsonField.of(value))
        }

        /** An enum containing [LegalEntityType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        /**
         * An enum containing [LegalEntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalEntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /**
             * An enum member indicating that [LegalEntityType] was instantiated with an unknown
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
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
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
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

        fun validate(): LegalEntityType = apply {
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

            return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The business's legal structure. */
    class LegalStructure @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CORPORATION = of("corporation")

            val LLC = of("llc")

            val NON_PROFIT = of("non_profit")

            val PARTNERSHIP = of("partnership")

            val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

            val TRUST = of("trust")

            fun of(value: String) = LegalStructure(JsonField.of(value))
        }

        /** An enum containing [LegalStructure]'s known values. */
        enum class Known {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
        }

        /**
         * An enum containing [LegalStructure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalStructure] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
            /**
             * An enum member indicating that [LegalStructure] was instantiated with an unknown
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
                CORPORATION -> Value.CORPORATION
                LLC -> Value.LLC
                NON_PROFIT -> Value.NON_PROFIT
                PARTNERSHIP -> Value.PARTNERSHIP
                SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                TRUST -> Value.TRUST
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
                CORPORATION -> Known.CORPORATION
                LLC -> Known.LLC
                NON_PROFIT -> Known.NON_PROFIT
                PARTNERSHIP -> Known.PARTNERSHIP
                SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                TRUST -> Known.TRUST
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
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

        fun validate(): LegalStructure = apply {
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

            return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** A list of phone numbers in E.164 format. */
    class PhoneNumber
    private constructor(
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of()
        ) : this(phoneNumber, mutableMapOf())

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
            fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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

            /**
             * Returns an immutable instance of [PhoneNumber].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumber = PhoneNumber(phoneNumber, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
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
        internal fun validity(): Int = (if (phoneNumber.asKnown() == null) 0 else 1)

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

    /** The risk rating of the legal entity. One of low, medium, high. */
    class RiskRating @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val LOW = of("low")

            val MEDIUM = of("medium")

            val HIGH = of("high")

            fun of(value: String) = RiskRating(JsonField.of(value))
        }

        /** An enum containing [RiskRating]'s known values. */
        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
        }

        /**
         * An enum containing [RiskRating]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RiskRating] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            /**
             * An enum member indicating that [RiskRating] was instantiated with an unknown value.
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
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
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
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
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

        fun validate(): RiskRating = apply {
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

            return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChildLegalEntityCreate && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && complianceDetails == other.complianceDetails && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && industryClassifications == other.industryClassifications && lastName == other.lastName && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, complianceDetails, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, industryClassifications, lastName, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChildLegalEntityCreate{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, complianceDetails=$complianceDetails, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, industryClassifications=$industryClassifications, lastName=$lastName, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
}
