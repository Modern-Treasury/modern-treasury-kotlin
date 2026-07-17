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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class ChildLegalEntityCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addresses: JsonField<List<LegalEntityAddressCreateRequest>>,
    private val bankSettings: JsonField<BankSettings>,
    private val businessDescription: JsonField<String>,
    private val businessName: JsonField<String>,
    private val citizenshipCountry: JsonField<String>,
    private val complianceDetails: JsonValue,
    private val connectionId: JsonField<String>,
    private val countryOfIncorporation: JsonField<String>,
    private val dateFormed: JsonField<LocalDate>,
    private val dateOfBirth: JsonField<LocalDate>,
    private val documents: JsonField<List<Document>>,
    private val doingBusinessAsNames: JsonField<List<String>>,
    private val email: JsonField<String>,
    private val expectedActivityVolume: JsonField<Long>,
    private val externalId: JsonField<String>,
    private val firstName: JsonField<String>,
    private val identifications: JsonField<List<IdentificationCreateRequest>>,
    private val industryClassifications: JsonField<List<LegalEntityIndustryClassification>>,
    private val intendedUse: JsonField<String>,
    private val lastName: JsonField<String>,
    private val legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreate>>,
    private val legalEntityType: JsonField<LegalEntityType>,
    private val legalStructure: JsonField<LegalStructure>,
    private val listedExchange: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val middleName: JsonField<String>,
    private val operatingJurisdictions: JsonField<List<String>>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val politicallyExposedPerson: JsonField<Boolean>,
    private val preferredName: JsonField<String>,
    private val prefix: JsonField<String>,
    private val primarySocialMediaSites: JsonField<List<String>>,
    private val regulators: JsonField<List<LegalEntityRegulator>>,
    private val riskRating: JsonField<RiskRating>,
    private val serviceProviderLegalEntityId: JsonField<String>,
    private val suffix: JsonField<String>,
    private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
    private val thirdPartyVerifications: JsonField<List<ThirdPartyVerification>>,
    private val tickerSymbol: JsonField<String>,
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
        @JsonProperty("business_description")
        @ExcludeMissing
        businessDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        citizenshipCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compliance_details")
        @ExcludeMissing
        complianceDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_of_incorporation")
        @ExcludeMissing
        countryOfIncorporation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_formed")
        @ExcludeMissing
        dateFormed: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected_activity_volume")
        @ExcludeMissing
        expectedActivityVolume: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifications")
        @ExcludeMissing
        identifications: JsonField<List<IdentificationCreateRequest>> = JsonMissing.of(),
        @JsonProperty("industry_classifications")
        @ExcludeMissing
        industryClassifications: JsonField<List<LegalEntityIndustryClassification>> =
            JsonMissing.of(),
        @JsonProperty("intended_use")
        @ExcludeMissing
        intendedUse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_associations")
        @ExcludeMissing
        legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreate>> =
            JsonMissing.of(),
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
        @JsonProperty("legal_structure")
        @ExcludeMissing
        legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
        @JsonProperty("listed_exchange")
        @ExcludeMissing
        listedExchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operating_jurisdictions")
        @ExcludeMissing
        operatingJurisdictions: JsonField<List<String>> = JsonMissing.of(),
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
        @JsonProperty("primary_social_media_sites")
        @ExcludeMissing
        primarySocialMediaSites: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("regulators")
        @ExcludeMissing
        regulators: JsonField<List<LegalEntityRegulator>> = JsonMissing.of(),
        @JsonProperty("risk_rating")
        @ExcludeMissing
        riskRating: JsonField<RiskRating> = JsonMissing.of(),
        @JsonProperty("service_provider_legal_entity_id")
        @ExcludeMissing
        serviceProviderLegalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("third_party_verification")
        @ExcludeMissing
        thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
        @JsonProperty("third_party_verifications")
        @ExcludeMissing
        thirdPartyVerifications: JsonField<List<ThirdPartyVerification>> = JsonMissing.of(),
        @JsonProperty("ticker_symbol")
        @ExcludeMissing
        tickerSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
    ) : this(
        addresses,
        bankSettings,
        businessDescription,
        businessName,
        citizenshipCountry,
        complianceDetails,
        connectionId,
        countryOfIncorporation,
        dateFormed,
        dateOfBirth,
        documents,
        doingBusinessAsNames,
        email,
        expectedActivityVolume,
        externalId,
        firstName,
        identifications,
        industryClassifications,
        intendedUse,
        lastName,
        legalEntityAssociations,
        legalEntityType,
        legalStructure,
        listedExchange,
        metadata,
        middleName,
        operatingJurisdictions,
        phoneNumbers,
        politicallyExposedPerson,
        preferredName,
        prefix,
        primarySocialMediaSites,
        regulators,
        riskRating,
        serviceProviderLegalEntityId,
        suffix,
        thirdPartyVerification,
        thirdPartyVerifications,
        tickerSymbol,
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
     * A description of the business.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessDescription(): String? = businessDescription.getNullable("business_description")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = childLegalEntityCreate.complianceDetails().convert(MyClass::class.java)
     * ```
     */
    @Deprecated("deprecated")
    @JsonProperty("compliance_details")
    @ExcludeMissing
    fun _complianceDetails(): JsonValue = complianceDetails

    /**
     * The connection ID for the connection the legal entity is associated with. Defaults to the id
     * of the connection designated with an is_default value of true or the id of an existing
     * operational connection if only one is available. Pass in a value of null to prevent the
     * connection from being associated with the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun connectionId(): String? = connectionId.getNullable("connection_id")

    /**
     * The country code where the business is incorporated in the ISO 3166-1 alpha-2 or alpha-3
     * formats.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun countryOfIncorporation(): String? =
        countryOfIncorporation.getNullable("country_of_incorporation")

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
     * A list of documents to attach to the legal entity (e.g. articles of incorporation,
     * certificate of good standing, proof of address).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documents(): List<Document>? = documents.getNullable("documents")

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
     * Monthly expected transaction volume in USD.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedActivityVolume(): Long? =
        expectedActivityVolume.getNullable("expected_activity_volume")

    /**
     * An optional user-defined 180 character unique identifier.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

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
     * A description of the intended use of the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun intendedUse(): String? = intendedUse.getNullable("intended_use")

    /**
     * An individual's last name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastName(): String? = lastName.getNullable("last_name")

    /**
     * The legal entity associations and its child legal entities.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreate>? =
        legalEntityAssociations.getNullable("legal_entity_associations")

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
     * ISO 10383 market identifier code.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun listedExchange(): String? = listedExchange.getNullable("listed_exchange")

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
     * A list of countries where the business operates (ISO 3166-1 alpha-2 or alpha-3 codes).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun operatingJurisdictions(): List<String>? =
        operatingJurisdictions.getNullable("operating_jurisdictions")

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
     * A list of primary social media URLs for the business.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun primarySocialMediaSites(): List<String>? =
        primarySocialMediaSites.getNullable("primary_social_media_sites")

    /**
     * Array of regulatory bodies overseeing this institution.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun regulators(): List<LegalEntityRegulator>? = regulators.getNullable("regulators")

    /**
     * The risk rating of the legal entity. One of low, medium, high.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

    /**
     * The UUID of the parent legal entity in the service provider tree.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun serviceProviderLegalEntityId(): String? =
        serviceProviderLegalEntityId.getNullable("service_provider_legal_entity_id")

    /**
     * An individual's suffix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun suffix(): String? = suffix.getNullable("suffix")

    /**
     * Deprecated. Use `third_party_verifications` instead.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun thirdPartyVerification(): ThirdPartyVerification? =
        thirdPartyVerification.getNullable("third_party_verification")

    /**
     * A list of third-party verifications run by external vendors.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun thirdPartyVerifications(): List<ThirdPartyVerification>? =
        thirdPartyVerifications.getNullable("third_party_verifications")

    /**
     * Stock ticker symbol for publicly traded companies.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tickerSymbol(): String? = tickerSymbol.getNullable("ticker_symbol")

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
     * Returns the raw JSON value of [businessDescription].
     *
     * Unlike [businessDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("business_description")
    @ExcludeMissing
    fun _businessDescription(): JsonField<String> = businessDescription

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
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [countryOfIncorporation].
     *
     * Unlike [countryOfIncorporation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("country_of_incorporation")
    @ExcludeMissing
    fun _countryOfIncorporation(): JsonField<String> = countryOfIncorporation

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
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<Document>> = documents

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
     * Returns the raw JSON value of [expectedActivityVolume].
     *
     * Unlike [expectedActivityVolume], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expected_activity_volume")
    @ExcludeMissing
    fun _expectedActivityVolume(): JsonField<Long> = expectedActivityVolume

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

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
     * Returns the raw JSON value of [intendedUse].
     *
     * Unlike [intendedUse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intended_use")
    @ExcludeMissing
    fun _intendedUse(): JsonField<String> = intendedUse

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [legalEntityAssociations].
     *
     * Unlike [legalEntityAssociations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("legal_entity_associations")
    @ExcludeMissing
    fun _legalEntityAssociations(): JsonField<List<LegalEntityAssociationInlineCreate>> =
        legalEntityAssociations

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
     * Returns the raw JSON value of [listedExchange].
     *
     * Unlike [listedExchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listed_exchange")
    @ExcludeMissing
    fun _listedExchange(): JsonField<String> = listedExchange

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
     * Returns the raw JSON value of [operatingJurisdictions].
     *
     * Unlike [operatingJurisdictions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("operating_jurisdictions")
    @ExcludeMissing
    fun _operatingJurisdictions(): JsonField<List<String>> = operatingJurisdictions

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
     * Returns the raw JSON value of [primarySocialMediaSites].
     *
     * Unlike [primarySocialMediaSites], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primary_social_media_sites")
    @ExcludeMissing
    fun _primarySocialMediaSites(): JsonField<List<String>> = primarySocialMediaSites

    /**
     * Returns the raw JSON value of [regulators].
     *
     * Unlike [regulators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regulators")
    @ExcludeMissing
    fun _regulators(): JsonField<List<LegalEntityRegulator>> = regulators

    /**
     * Returns the raw JSON value of [riskRating].
     *
     * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("risk_rating")
    @ExcludeMissing
    fun _riskRating(): JsonField<RiskRating> = riskRating

    /**
     * Returns the raw JSON value of [serviceProviderLegalEntityId].
     *
     * Unlike [serviceProviderLegalEntityId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("service_provider_legal_entity_id")
    @ExcludeMissing
    fun _serviceProviderLegalEntityId(): JsonField<String> = serviceProviderLegalEntityId

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

    /**
     * Returns the raw JSON value of [thirdPartyVerification].
     *
     * Unlike [thirdPartyVerification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("third_party_verification")
    @ExcludeMissing
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> = thirdPartyVerification

    /**
     * Returns the raw JSON value of [thirdPartyVerifications].
     *
     * Unlike [thirdPartyVerifications], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("third_party_verifications")
    @ExcludeMissing
    fun _thirdPartyVerifications(): JsonField<List<ThirdPartyVerification>> =
        thirdPartyVerifications

    /**
     * Returns the raw JSON value of [tickerSymbol].
     *
     * Unlike [tickerSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ticker_symbol")
    @ExcludeMissing
    fun _tickerSymbol(): JsonField<String> = tickerSymbol

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
        private var businessDescription: JsonField<String> = JsonMissing.of()
        private var businessName: JsonField<String> = JsonMissing.of()
        private var citizenshipCountry: JsonField<String> = JsonMissing.of()
        private var complianceDetails: JsonValue = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var countryOfIncorporation: JsonField<String> = JsonMissing.of()
        private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
        private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
        private var documents: JsonField<MutableList<Document>>? = null
        private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var expectedActivityVolume: JsonField<Long> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
        private var industryClassifications:
            JsonField<MutableList<LegalEntityIndustryClassification>>? =
            null
        private var intendedUse: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var legalEntityAssociations:
            JsonField<MutableList<LegalEntityAssociationInlineCreate>>? =
            null
        private var legalEntityType: JsonField<LegalEntityType> = JsonMissing.of()
        private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
        private var listedExchange: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var operatingJurisdictions: JsonField<MutableList<String>>? = null
        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of()
        private var preferredName: JsonField<String> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var primarySocialMediaSites: JsonField<MutableList<String>>? = null
        private var regulators: JsonField<MutableList<LegalEntityRegulator>>? = null
        private var riskRating: JsonField<RiskRating> = JsonMissing.of()
        private var serviceProviderLegalEntityId: JsonField<String> = JsonMissing.of()
        private var suffix: JsonField<String> = JsonMissing.of()
        private var thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of()
        private var thirdPartyVerifications: JsonField<MutableList<ThirdPartyVerification>>? = null
        private var tickerSymbol: JsonField<String> = JsonMissing.of()
        private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
            JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
            addresses = childLegalEntityCreate.addresses.map { it.toMutableList() }
            bankSettings = childLegalEntityCreate.bankSettings
            businessDescription = childLegalEntityCreate.businessDescription
            businessName = childLegalEntityCreate.businessName
            citizenshipCountry = childLegalEntityCreate.citizenshipCountry
            complianceDetails = childLegalEntityCreate.complianceDetails
            connectionId = childLegalEntityCreate.connectionId
            countryOfIncorporation = childLegalEntityCreate.countryOfIncorporation
            dateFormed = childLegalEntityCreate.dateFormed
            dateOfBirth = childLegalEntityCreate.dateOfBirth
            documents = childLegalEntityCreate.documents.map { it.toMutableList() }
            doingBusinessAsNames =
                childLegalEntityCreate.doingBusinessAsNames.map { it.toMutableList() }
            email = childLegalEntityCreate.email
            expectedActivityVolume = childLegalEntityCreate.expectedActivityVolume
            externalId = childLegalEntityCreate.externalId
            firstName = childLegalEntityCreate.firstName
            identifications = childLegalEntityCreate.identifications.map { it.toMutableList() }
            industryClassifications =
                childLegalEntityCreate.industryClassifications.map { it.toMutableList() }
            intendedUse = childLegalEntityCreate.intendedUse
            lastName = childLegalEntityCreate.lastName
            legalEntityAssociations =
                childLegalEntityCreate.legalEntityAssociations.map { it.toMutableList() }
            legalEntityType = childLegalEntityCreate.legalEntityType
            legalStructure = childLegalEntityCreate.legalStructure
            listedExchange = childLegalEntityCreate.listedExchange
            metadata = childLegalEntityCreate.metadata
            middleName = childLegalEntityCreate.middleName
            operatingJurisdictions =
                childLegalEntityCreate.operatingJurisdictions.map { it.toMutableList() }
            phoneNumbers = childLegalEntityCreate.phoneNumbers.map { it.toMutableList() }
            politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
            preferredName = childLegalEntityCreate.preferredName
            prefix = childLegalEntityCreate.prefix
            primarySocialMediaSites =
                childLegalEntityCreate.primarySocialMediaSites.map { it.toMutableList() }
            regulators = childLegalEntityCreate.regulators.map { it.toMutableList() }
            riskRating = childLegalEntityCreate.riskRating
            serviceProviderLegalEntityId = childLegalEntityCreate.serviceProviderLegalEntityId
            suffix = childLegalEntityCreate.suffix
            thirdPartyVerification = childLegalEntityCreate.thirdPartyVerification
            thirdPartyVerifications =
                childLegalEntityCreate.thirdPartyVerifications.map { it.toMutableList() }
            tickerSymbol = childLegalEntityCreate.tickerSymbol
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

        /** A description of the business. */
        fun businessDescription(businessDescription: String?) =
            businessDescription(JsonField.ofNullable(businessDescription))

        /**
         * Sets [Builder.businessDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessDescription(businessDescription: JsonField<String>) = apply {
            this.businessDescription = businessDescription
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

        @Deprecated("deprecated")
        fun complianceDetails(complianceDetails: JsonValue) = apply {
            this.complianceDetails = complianceDetails
        }

        /**
         * The connection ID for the connection the legal entity is associated with. Defaults to the
         * id of the connection designated with an is_default value of true or the id of an existing
         * operational connection if only one is available. Pass in a value of null to prevent the
         * connection from being associated with the legal entity.
         */
        fun connectionId(connectionId: String?) = connectionId(JsonField.ofNullable(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /**
         * The country code where the business is incorporated in the ISO 3166-1 alpha-2 or alpha-3
         * formats.
         */
        fun countryOfIncorporation(countryOfIncorporation: String?) =
            countryOfIncorporation(JsonField.ofNullable(countryOfIncorporation))

        /**
         * Sets [Builder.countryOfIncorporation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryOfIncorporation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryOfIncorporation(countryOfIncorporation: JsonField<String>) = apply {
            this.countryOfIncorporation = countryOfIncorporation
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

        /**
         * A list of documents to attach to the legal entity (e.g. articles of incorporation,
         * certificate of good standing, proof of address).
         */
        fun documents(documents: List<Document>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
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

        /** Monthly expected transaction volume in USD. */
        fun expectedActivityVolume(expectedActivityVolume: Long?) =
            expectedActivityVolume(JsonField.ofNullable(expectedActivityVolume))

        /**
         * Alias for [Builder.expectedActivityVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expectedActivityVolume(expectedActivityVolume: Long) =
            expectedActivityVolume(expectedActivityVolume as Long?)

        /**
         * Sets [Builder.expectedActivityVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedActivityVolume] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedActivityVolume(expectedActivityVolume: JsonField<Long>) = apply {
            this.expectedActivityVolume = expectedActivityVolume
        }

        /** An optional user-defined 180 character unique identifier. */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

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

        /** A description of the intended use of the legal entity. */
        fun intendedUse(intendedUse: String?) = intendedUse(JsonField.ofNullable(intendedUse))

        /**
         * Sets [Builder.intendedUse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intendedUse] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun intendedUse(intendedUse: JsonField<String>) = apply { this.intendedUse = intendedUse }

        /** An individual's last name. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(
            legalEntityAssociations: List<LegalEntityAssociationInlineCreate>?
        ) = legalEntityAssociations(JsonField.ofNullable(legalEntityAssociations))

        /**
         * Sets [Builder.legalEntityAssociations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityAssociations] with a well-typed
         * `List<LegalEntityAssociationInlineCreate>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun legalEntityAssociations(
            legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreate>>
        ) = apply {
            this.legalEntityAssociations = legalEntityAssociations.map { it.toMutableList() }
        }

        /**
         * Adds a single [LegalEntityAssociationInlineCreate] to [legalEntityAssociations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLegalEntityAssociation(legalEntityAssociation: LegalEntityAssociationInlineCreate) =
            apply {
                legalEntityAssociations =
                    (legalEntityAssociations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("legalEntityAssociations", it).add(legalEntityAssociation)
                    }
            }

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

        /** ISO 10383 market identifier code. */
        fun listedExchange(listedExchange: String?) =
            listedExchange(JsonField.ofNullable(listedExchange))

        /**
         * Sets [Builder.listedExchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listedExchange] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun listedExchange(listedExchange: JsonField<String>) = apply {
            this.listedExchange = listedExchange
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

        /**
         * A list of countries where the business operates (ISO 3166-1 alpha-2 or alpha-3 codes).
         */
        fun operatingJurisdictions(operatingJurisdictions: List<String>) =
            operatingJurisdictions(JsonField.of(operatingJurisdictions))

        /**
         * Sets [Builder.operatingJurisdictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingJurisdictions] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun operatingJurisdictions(operatingJurisdictions: JsonField<List<String>>) = apply {
            this.operatingJurisdictions = operatingJurisdictions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [operatingJurisdictions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperatingJurisdiction(operatingJurisdiction: String) = apply {
            operatingJurisdictions =
                (operatingJurisdictions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operatingJurisdictions", it).add(operatingJurisdiction)
                }
        }

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

        /** A list of primary social media URLs for the business. */
        fun primarySocialMediaSites(primarySocialMediaSites: List<String>) =
            primarySocialMediaSites(JsonField.of(primarySocialMediaSites))

        /**
         * Sets [Builder.primarySocialMediaSites] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primarySocialMediaSites] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun primarySocialMediaSites(primarySocialMediaSites: JsonField<List<String>>) = apply {
            this.primarySocialMediaSites = primarySocialMediaSites.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [primarySocialMediaSites].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrimarySocialMediaSite(primarySocialMediaSite: String) = apply {
            primarySocialMediaSites =
                (primarySocialMediaSites ?: JsonField.of(mutableListOf())).also {
                    checkKnown("primarySocialMediaSites", it).add(primarySocialMediaSite)
                }
        }

        /** Array of regulatory bodies overseeing this institution. */
        fun regulators(regulators: List<LegalEntityRegulator>?) =
            regulators(JsonField.ofNullable(regulators))

        /**
         * Sets [Builder.regulators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulators] with a well-typed
         * `List<LegalEntityRegulator>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun regulators(regulators: JsonField<List<LegalEntityRegulator>>) = apply {
            this.regulators = regulators.map { it.toMutableList() }
        }

        /**
         * Adds a single [LegalEntityRegulator] to [regulators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulator(regulator: LegalEntityRegulator) = apply {
            regulators =
                (regulators ?: JsonField.of(mutableListOf())).also {
                    checkKnown("regulators", it).add(regulator)
                }
        }

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

        /** The UUID of the parent legal entity in the service provider tree. */
        fun serviceProviderLegalEntityId(serviceProviderLegalEntityId: String?) =
            serviceProviderLegalEntityId(JsonField.ofNullable(serviceProviderLegalEntityId))

        /**
         * Sets [Builder.serviceProviderLegalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceProviderLegalEntityId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun serviceProviderLegalEntityId(serviceProviderLegalEntityId: JsonField<String>) = apply {
            this.serviceProviderLegalEntityId = serviceProviderLegalEntityId
        }

        /** An individual's suffix. */
        fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

        /** Deprecated. Use `third_party_verifications` instead. */
        @Deprecated("deprecated")
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification?) =
            thirdPartyVerification(JsonField.ofNullable(thirdPartyVerification))

        /**
         * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerification] with a well-typed
         * [ThirdPartyVerification] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                this.thirdPartyVerification = thirdPartyVerification
            }

        /** A list of third-party verifications run by external vendors. */
        fun thirdPartyVerifications(thirdPartyVerifications: List<ThirdPartyVerification>) =
            thirdPartyVerifications(JsonField.of(thirdPartyVerifications))

        /**
         * Sets [Builder.thirdPartyVerifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerifications] with a well-typed
         * `List<ThirdPartyVerification>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun thirdPartyVerifications(
            thirdPartyVerifications: JsonField<List<ThirdPartyVerification>>
        ) = apply {
            this.thirdPartyVerifications = thirdPartyVerifications.map { it.toMutableList() }
        }

        /**
         * Adds a single [ThirdPartyVerification] to [thirdPartyVerifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) = apply {
            thirdPartyVerifications =
                (thirdPartyVerifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thirdPartyVerifications", it).add(thirdPartyVerification)
                }
        }

        /** Stock ticker symbol for publicly traded companies. */
        fun tickerSymbol(tickerSymbol: String?) = tickerSymbol(JsonField.ofNullable(tickerSymbol))

        /**
         * Sets [Builder.tickerSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tickerSymbol] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tickerSymbol(tickerSymbol: JsonField<String>) = apply {
            this.tickerSymbol = tickerSymbol
        }

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
                businessDescription,
                businessName,
                citizenshipCountry,
                complianceDetails,
                connectionId,
                countryOfIncorporation,
                dateFormed,
                dateOfBirth,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                email,
                expectedActivityVolume,
                externalId,
                firstName,
                (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                (industryClassifications ?: JsonMissing.of()).map { it.toImmutable() },
                intendedUse,
                lastName,
                (legalEntityAssociations ?: JsonMissing.of()).map { it.toImmutable() },
                legalEntityType,
                legalStructure,
                listedExchange,
                metadata,
                middleName,
                (operatingJurisdictions ?: JsonMissing.of()).map { it.toImmutable() },
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                politicallyExposedPerson,
                preferredName,
                prefix,
                (primarySocialMediaSites ?: JsonMissing.of()).map { it.toImmutable() },
                (regulators ?: JsonMissing.of()).map { it.toImmutable() },
                riskRating,
                serviceProviderLegalEntityId,
                suffix,
                thirdPartyVerification,
                (thirdPartyVerifications ?: JsonMissing.of()).map { it.toImmutable() },
                tickerSymbol,
                wealthAndEmploymentDetails,
                website,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ChildLegalEntityCreate = apply {
        if (validated) {
            return@apply
        }

        addresses()?.forEach { it.validate() }
        bankSettings()?.validate()
        businessDescription()
        businessName()
        citizenshipCountry()
        connectionId()
        countryOfIncorporation()
        dateFormed()
        dateOfBirth()
        documents()?.forEach { it.validate() }
        doingBusinessAsNames()
        email()
        expectedActivityVolume()
        externalId()
        firstName()
        identifications()?.forEach { it.validate() }
        industryClassifications()?.forEach { it.validate() }
        intendedUse()
        lastName()
        legalEntityAssociations()?.forEach { it.validate() }
        legalEntityType()?.validate()
        legalStructure()?.validate()
        listedExchange()
        metadata()?.validate()
        middleName()
        operatingJurisdictions()
        phoneNumbers()?.forEach { it.validate() }
        politicallyExposedPerson()
        preferredName()
        prefix()
        primarySocialMediaSites()
        regulators()?.forEach { it.validate() }
        riskRating()?.validate()
        serviceProviderLegalEntityId()
        suffix()
        thirdPartyVerification()?.validate()
        thirdPartyVerifications()?.forEach { it.validate() }
        tickerSymbol()
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
            (if (businessDescription.asKnown() == null) 0 else 1) +
            (if (businessName.asKnown() == null) 0 else 1) +
            (if (citizenshipCountry.asKnown() == null) 0 else 1) +
            (if (connectionId.asKnown() == null) 0 else 1) +
            (if (countryOfIncorporation.asKnown() == null) 0 else 1) +
            (if (dateFormed.asKnown() == null) 0 else 1) +
            (if (dateOfBirth.asKnown() == null) 0 else 1) +
            (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (doingBusinessAsNames.asKnown()?.size ?: 0) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (expectedActivityVolume.asKnown() == null) 0 else 1) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (if (firstName.asKnown() == null) 0 else 1) +
            (identifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (industryClassifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (intendedUse.asKnown() == null) 0 else 1) +
            (if (lastName.asKnown() == null) 0 else 1) +
            (legalEntityAssociations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (legalEntityType.asKnown()?.validity() ?: 0) +
            (legalStructure.asKnown()?.validity() ?: 0) +
            (if (listedExchange.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (middleName.asKnown() == null) 0 else 1) +
            (operatingJurisdictions.asKnown()?.size ?: 0) +
            (phoneNumbers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (politicallyExposedPerson.asKnown() == null) 0 else 1) +
            (if (preferredName.asKnown() == null) 0 else 1) +
            (if (prefix.asKnown() == null) 0 else 1) +
            (primarySocialMediaSites.asKnown()?.size ?: 0) +
            (regulators.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (riskRating.asKnown()?.validity() ?: 0) +
            (if (serviceProviderLegalEntityId.asKnown() == null) 0 else 1) +
            (if (suffix.asKnown() == null) 0 else 1) +
            (thirdPartyVerification.asKnown()?.validity() ?: 0) +
            (thirdPartyVerifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (tickerSymbol.asKnown() == null) 0 else 1) +
            (wealthAndEmploymentDetails.asKnown()?.validity() ?: 0) +
            (if (website.asKnown() == null) 0 else 1)

    class Document
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentType: JsonField<DocumentType>,
        private val fileData: JsonField<String>,
        private val filename: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_type")
            @ExcludeMissing
            documentType: JsonField<DocumentType> = JsonMissing.of(),
            @JsonProperty("file_data")
            @ExcludeMissing
            fileData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        ) : this(documentType, fileData, filename, mutableMapOf())

        /**
         * A category given to the document, can be `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.getRequired("document_type")

        /**
         * Base64-encoded file content for the document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileData(): String = fileData.getRequired("file_data")

        /**
         * The original filename of the document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filename(): String? = filename.getNullable("filename")

        /**
         * Returns the raw JSON value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

        /**
         * Returns the raw JSON value of [fileData].
         *
         * Unlike [fileData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_data") @ExcludeMissing fun _fileData(): JsonField<String> = fileData

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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
             * Returns a mutable builder for constructing an instance of [Document].
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * .fileData()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Document]. */
        class Builder internal constructor() {

            private var documentType: JsonField<DocumentType>? = null
            private var fileData: JsonField<String>? = null
            private var filename: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(document: Document) = apply {
                documentType = document.documentType
                fileData = document.fileData
                filename = document.filename
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** Base64-encoded file content for the document. */
            fun fileData(fileData: String) = fileData(JsonField.of(fileData))

            /**
             * Sets [Builder.fileData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileData] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileData(fileData: JsonField<String>) = apply { this.fileData = fileData }

            /** The original filename of the document. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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
             * Returns an immutable instance of [Document].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * .fileData()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Document =
                Document(
                    checkRequired("documentType", documentType),
                    checkRequired("fileData", fileData),
                    filename,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            documentType().validate()
            fileData()
            filename()
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
            (documentType.asKnown()?.validity() ?: 0) +
                (if (fileData.asKnown() == null) 0 else 1) +
                (if (filename.asKnown() == null) 0 else 1)

        /** A category given to the document, can be `null`. */
        class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ARTICLES_OF_INCORPORATION = of("articles_of_incorporation")

                val CERTIFICATE_OF_GOOD_STANDING = of("certificate_of_good_standing")

                val EIN_LETTER = of("ein_letter")

                val GENERIC = of("generic")

                val IDENTIFICATION_BACK = of("identification_back")

                val IDENTIFICATION_FRONT = of("identification_front")

                val PROOF_OF_ADDRESS = of("proof_of_address")

                fun of(value: String) = DocumentType(JsonField.of(value))
            }

            /** An enum containing [DocumentType]'s known values. */
            enum class Known {
                ARTICLES_OF_INCORPORATION,
                CERTIFICATE_OF_GOOD_STANDING,
                EIN_LETTER,
                GENERIC,
                IDENTIFICATION_BACK,
                IDENTIFICATION_FRONT,
                PROOF_OF_ADDRESS,
            }

            /**
             * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DocumentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARTICLES_OF_INCORPORATION,
                CERTIFICATE_OF_GOOD_STANDING,
                EIN_LETTER,
                GENERIC,
                IDENTIFICATION_BACK,
                IDENTIFICATION_FRONT,
                PROOF_OF_ADDRESS,
                /**
                 * An enum member indicating that [DocumentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                    CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                    EIN_LETTER -> Value.EIN_LETTER
                    GENERIC -> Value.GENERIC
                    IDENTIFICATION_BACK -> Value.IDENTIFICATION_BACK
                    IDENTIFICATION_FRONT -> Value.IDENTIFICATION_FRONT
                    PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                    CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                    EIN_LETTER -> Known.EIN_LETTER
                    GENERIC -> Known.GENERIC
                    IDENTIFICATION_BACK -> Known.IDENTIFICATION_BACK
                    IDENTIFICATION_FRONT -> Known.IDENTIFICATION_FRONT
                    PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                    else -> throw ModernTreasuryInvalidDataException("Unknown DocumentType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): DocumentType = apply {
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

                return other is DocumentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Document &&
                documentType == other.documentType &&
                fileData == other.fileData &&
                filename == other.filename &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentType, fileData, filename, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{documentType=$documentType, fileData=$fileData, filename=$filename, additionalProperties=$additionalProperties}"
    }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

            return other is LegalEntityType && value == other.value
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

            return other is LegalStructure && value == other.value
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** A list of phone numbers in E.164 format. */
    class PhoneNumber
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

            return other is PhoneNumber &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class LegalEntityRegulator
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val jurisdiction: JsonField<String>,
        private val name: JsonField<String>,
        private val registrationNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("jurisdiction")
            @ExcludeMissing
            jurisdiction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_number")
            @ExcludeMissing
            registrationNumber: JsonField<String> = JsonMissing.of(),
        ) : this(jurisdiction, name, registrationNumber, mutableMapOf())

        /**
         * The country code where the regulator operates in the ISO 3166-1 alpha-2 format (e.g.,
         * "US", "CA", "GB").
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jurisdiction(): String = jurisdiction.getRequired("jurisdiction")

        /**
         * Full name of the regulatory body.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Registration or identification number with the regulator.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun registrationNumber(): String = registrationNumber.getRequired("registration_number")

        /**
         * Returns the raw JSON value of [jurisdiction].
         *
         * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        fun _jurisdiction(): JsonField<String> = jurisdiction

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [registrationNumber].
         *
         * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("registration_number")
        @ExcludeMissing
        fun _registrationNumber(): JsonField<String> = registrationNumber

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
             * Returns a mutable builder for constructing an instance of [LegalEntityRegulator].
             *
             * The following fields are required:
             * ```kotlin
             * .jurisdiction()
             * .name()
             * .registrationNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LegalEntityRegulator]. */
        class Builder internal constructor() {

            private var jurisdiction: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var registrationNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityRegulator: LegalEntityRegulator) = apply {
                jurisdiction = legalEntityRegulator.jurisdiction
                name = legalEntityRegulator.name
                registrationNumber = legalEntityRegulator.registrationNumber
                additionalProperties = legalEntityRegulator.additionalProperties.toMutableMap()
            }

            /**
             * The country code where the regulator operates in the ISO 3166-1 alpha-2 format (e.g.,
             * "US", "CA", "GB").
             */
            fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

            /**
             * Sets [Builder.jurisdiction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdiction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jurisdiction(jurisdiction: JsonField<String>) = apply {
                this.jurisdiction = jurisdiction
            }

            /** Full name of the regulatory body. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Registration or identification number with the regulator. */
            fun registrationNumber(registrationNumber: String) =
                registrationNumber(JsonField.of(registrationNumber))

            /**
             * Sets [Builder.registrationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                this.registrationNumber = registrationNumber
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
             * Returns an immutable instance of [LegalEntityRegulator].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .jurisdiction()
             * .name()
             * .registrationNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LegalEntityRegulator =
                LegalEntityRegulator(
                    checkRequired("jurisdiction", jurisdiction),
                    checkRequired("name", name),
                    checkRequired("registrationNumber", registrationNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): LegalEntityRegulator = apply {
            if (validated) {
                return@apply
            }

            jurisdiction()
            name()
            registrationNumber()
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
            (if (jurisdiction.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (registrationNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityRegulator &&
                jurisdiction == other.jurisdiction &&
                name == other.name &&
                registrationNumber == other.registrationNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(jurisdiction, name, registrationNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityRegulator{jurisdiction=$jurisdiction, name=$name, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

            return other is RiskRating && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChildLegalEntityCreate &&
            addresses == other.addresses &&
            bankSettings == other.bankSettings &&
            businessDescription == other.businessDescription &&
            businessName == other.businessName &&
            citizenshipCountry == other.citizenshipCountry &&
            complianceDetails == other.complianceDetails &&
            connectionId == other.connectionId &&
            countryOfIncorporation == other.countryOfIncorporation &&
            dateFormed == other.dateFormed &&
            dateOfBirth == other.dateOfBirth &&
            documents == other.documents &&
            doingBusinessAsNames == other.doingBusinessAsNames &&
            email == other.email &&
            expectedActivityVolume == other.expectedActivityVolume &&
            externalId == other.externalId &&
            firstName == other.firstName &&
            identifications == other.identifications &&
            industryClassifications == other.industryClassifications &&
            intendedUse == other.intendedUse &&
            lastName == other.lastName &&
            legalEntityAssociations == other.legalEntityAssociations &&
            legalEntityType == other.legalEntityType &&
            legalStructure == other.legalStructure &&
            listedExchange == other.listedExchange &&
            metadata == other.metadata &&
            middleName == other.middleName &&
            operatingJurisdictions == other.operatingJurisdictions &&
            phoneNumbers == other.phoneNumbers &&
            politicallyExposedPerson == other.politicallyExposedPerson &&
            preferredName == other.preferredName &&
            prefix == other.prefix &&
            primarySocialMediaSites == other.primarySocialMediaSites &&
            regulators == other.regulators &&
            riskRating == other.riskRating &&
            serviceProviderLegalEntityId == other.serviceProviderLegalEntityId &&
            suffix == other.suffix &&
            thirdPartyVerification == other.thirdPartyVerification &&
            thirdPartyVerifications == other.thirdPartyVerifications &&
            tickerSymbol == other.tickerSymbol &&
            wealthAndEmploymentDetails == other.wealthAndEmploymentDetails &&
            website == other.website &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            addresses,
            bankSettings,
            businessDescription,
            businessName,
            citizenshipCountry,
            complianceDetails,
            connectionId,
            countryOfIncorporation,
            dateFormed,
            dateOfBirth,
            documents,
            doingBusinessAsNames,
            email,
            expectedActivityVolume,
            externalId,
            firstName,
            identifications,
            industryClassifications,
            intendedUse,
            lastName,
            legalEntityAssociations,
            legalEntityType,
            legalStructure,
            listedExchange,
            metadata,
            middleName,
            operatingJurisdictions,
            phoneNumbers,
            politicallyExposedPerson,
            preferredName,
            prefix,
            primarySocialMediaSites,
            regulators,
            riskRating,
            serviceProviderLegalEntityId,
            suffix,
            thirdPartyVerification,
            thirdPartyVerifications,
            tickerSymbol,
            wealthAndEmploymentDetails,
            website,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChildLegalEntityCreate{addresses=$addresses, bankSettings=$bankSettings, businessDescription=$businessDescription, businessName=$businessName, citizenshipCountry=$citizenshipCountry, complianceDetails=$complianceDetails, connectionId=$connectionId, countryOfIncorporation=$countryOfIncorporation, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, documents=$documents, doingBusinessAsNames=$doingBusinessAsNames, email=$email, expectedActivityVolume=$expectedActivityVolume, externalId=$externalId, firstName=$firstName, identifications=$identifications, industryClassifications=$industryClassifications, intendedUse=$intendedUse, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalEntityType=$legalEntityType, legalStructure=$legalStructure, listedExchange=$listedExchange, metadata=$metadata, middleName=$middleName, operatingJurisdictions=$operatingJurisdictions, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, primarySocialMediaSites=$primarySocialMediaSites, regulators=$regulators, riskRating=$riskRating, serviceProviderLegalEntityId=$serviceProviderLegalEntityId, suffix=$suffix, thirdPartyVerification=$thirdPartyVerification, thirdPartyVerifications=$thirdPartyVerifications, tickerSymbol=$tickerSymbol, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
}
