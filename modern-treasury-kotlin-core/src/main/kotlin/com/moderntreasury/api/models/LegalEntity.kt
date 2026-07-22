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
import com.moderntreasury.api.models.BankSettings
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import com.moderntreasury.api.models.ThirdPartyVerification
import com.moderntreasury.api.models.WealthAndEmploymentDetails
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LegalEntity @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val id: JsonField<String>,
    private val addresses: JsonField<List<LegalEntityAddress>>,
    private val bankSettings: JsonField<BankSettings>,
    private val businessDescription: JsonField<String>,
    private val businessName: JsonField<String>,
    private val citizenshipCountry: JsonField<String>,
    private val complianceDetails: JsonValue,
    private val countryOfIncorporation: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dateFormed: JsonField<LocalDate>,
    private val dateOfBirth: JsonField<LocalDate>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val documents: JsonField<List<Document>>,
    private val doingBusinessAsNames: JsonField<List<String>>,
    private val email: JsonField<String>,
    private val expectedActivityVolume: JsonField<Long>,
    private val externalId: JsonField<String>,
    private val firstName: JsonField<String>,
    private val identifications: JsonField<List<Identification>>,
    private val industryClassifications: JsonField<List<LegalEntityIndustryClassification>>,
    private val intendedUse: JsonField<String>,
    private val lastName: JsonField<String>,
    private val legalEntityType: JsonField<LegalEntityType>,
    private val legalStructure: JsonField<LegalStructure>,
    private val listedExchange: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val middleName: JsonField<String>,
    private val object_: JsonField<String>,
    private val operatingJurisdictions: JsonField<List<String>>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val politicallyExposedPerson: JsonField<Boolean>,
    private val preferredName: JsonField<String>,
    private val prefix: JsonField<String>,
    private val primarySocialMediaSites: JsonField<List<String>>,
    private val regulators: JsonField<List<LegalEntityRegulator>>,
    private val riskRating: JsonField<RiskRating>,
    private val serviceProviderLegalEntityId: JsonField<String>,
    private val status: JsonField<Status>,
    private val suffix: JsonField<String>,
    private val termsOfUse: JsonField<TermsOfUse>,
    private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
    private val thirdPartyVerifications: JsonField<List<ThirdPartyVerification>>,
    private val tickerSymbol: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>,
    private val website: JsonField<String>,
    private val legalEntityAssociations: JsonField<List<LegalEntityAssociation>>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addresses") @ExcludeMissing addresses: JsonField<List<LegalEntityAddress>> = JsonMissing.of(),
        @JsonProperty("bank_settings") @ExcludeMissing bankSettings: JsonField<BankSettings> = JsonMissing.of(),
        @JsonProperty("business_description") @ExcludeMissing businessDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_name") @ExcludeMissing businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citizenship_country") @ExcludeMissing citizenshipCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compliance_details") @ExcludeMissing complianceDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("country_of_incorporation") @ExcludeMissing countryOfIncorporation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_formed") @ExcludeMissing dateFormed: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_of_birth") @ExcludeMissing dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("discarded_at") @ExcludeMissing discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("documents") @ExcludeMissing documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("doing_business_as_names") @ExcludeMissing doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected_activity_volume") @ExcludeMissing expectedActivityVolume: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("external_id") @ExcludeMissing externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifications") @ExcludeMissing identifications: JsonField<List<Identification>> = JsonMissing.of(),
        @JsonProperty("industry_classifications") @ExcludeMissing industryClassifications: JsonField<List<LegalEntityIndustryClassification>> = JsonMissing.of(),
        @JsonProperty("intended_use") @ExcludeMissing intendedUse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_type") @ExcludeMissing legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
        @JsonProperty("legal_structure") @ExcludeMissing legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
        @JsonProperty("listed_exchange") @ExcludeMissing listedExchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("middle_name") @ExcludeMissing middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operating_jurisdictions") @ExcludeMissing operatingJurisdictions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("phone_numbers") @ExcludeMissing phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
        @JsonProperty("politically_exposed_person") @ExcludeMissing politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("preferred_name") @ExcludeMissing preferredName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_social_media_sites") @ExcludeMissing primarySocialMediaSites: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("regulators") @ExcludeMissing regulators: JsonField<List<LegalEntityRegulator>> = JsonMissing.of(),
        @JsonProperty("risk_rating") @ExcludeMissing riskRating: JsonField<RiskRating> = JsonMissing.of(),
        @JsonProperty("service_provider_legal_entity_id") @ExcludeMissing serviceProviderLegalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("terms_of_use") @ExcludeMissing termsOfUse: JsonField<TermsOfUse> = JsonMissing.of(),
        @JsonProperty("third_party_verification") @ExcludeMissing thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
        @JsonProperty("third_party_verifications") @ExcludeMissing thirdPartyVerifications: JsonField<List<ThirdPartyVerification>> = JsonMissing.of(),
        @JsonProperty("ticker_symbol") @ExcludeMissing tickerSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("wealth_and_employment_details") @ExcludeMissing wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_associations") @ExcludeMissing legalEntityAssociations: JsonField<List<LegalEntityAssociation>> = JsonMissing.of()
    ) : this(
      id,
      addresses,
      bankSettings,
      businessDescription,
      businessName,
      citizenshipCountry,
      complianceDetails,
      countryOfIncorporation,
      createdAt,
      dateFormed,
      dateOfBirth,
      discardedAt,
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
      legalEntityType,
      legalStructure,
      listedExchange,
      liveMode,
      metadata,
      middleName,
      object_,
      operatingJurisdictions,
      phoneNumbers,
      politicallyExposedPerson,
      preferredName,
      prefix,
      primarySocialMediaSites,
      regulators,
      riskRating,
      serviceProviderLegalEntityId,
      status,
      suffix,
      termsOfUse,
      thirdPartyVerification,
      thirdPartyVerifications,
      tickerSymbol,
      updatedAt,
      wealthAndEmploymentDetails,
      website,
      legalEntityAssociations,
      mutableMapOf(),
    )

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun id(): String = id.getRequired("id")

    /**
     * A list of addresses for the entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addresses(): List<LegalEntityAddress> = addresses.getRequired("addresses")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

    /**
     * A description of the business.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun businessDescription(): String? = businessDescription.getNullable("business_description")

    /**
     * The business's legal business name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun businessName(): String? = businessName.getNullable("business_name")

    /**
     * The country of citizenship for an individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = legalEntity.complianceDetails().convert(MyClass::class.java)
     * ```
     */
    @Deprecated("deprecated")
    @JsonProperty("compliance_details")
    @ExcludeMissing
    fun _complianceDetails(): JsonValue = complianceDetails

    /**
     * The country code where the business is incorporated in the ISO 3166-1 alpha-2 or alpha-3 formats.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun countryOfIncorporation(): String? = countryOfIncorporation.getNullable("country_of_incorporation")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A business's formation date (YYYY-MM-DD).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

    /**
     * An individual's date of birth (YYYY-MM-DD).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun documents(): List<Document> = documents.getRequired("documents")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun doingBusinessAsNames(): List<String> = doingBusinessAsNames.getRequired("doing_business_as_names")

    /**
     * The entity's primary email.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * Monthly expected transaction volume in USD.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun expectedActivityVolume(): Long? = expectedActivityVolume.getNullable("expected_activity_volume")

    /**
     * An optional user-defined 180 character unique identifier.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * An individual's first name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String? = firstName.getNullable("first_name")

    /**
     * A list of identifications for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifications(): List<Identification> = identifications.getRequired("identifications")

    /**
     * A list of industry classifications for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun industryClassifications(): List<LegalEntityIndustryClassification> = industryClassifications.getRequired("industry_classifications")

    /**
     * A description of the intended use of the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun intendedUse(): String? = intendedUse.getNullable("intended_use")

    /**
     * An individual's last name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String? = lastName.getNullable("last_name")

    /**
     * The type of legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalEntityType(): LegalEntityType = legalEntityType.getRequired("legal_entity_type")

    /**
     * The business's legal structure.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

    /**
     * ISO 10383 market identifier code.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun listedExchange(): String? = listedExchange.getNullable("listed_exchange")

    /**
     * This field will be true if this object exists in the live environment or false if it exists in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * An individual's middle name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun middleName(): String? = middleName.getNullable("middle_name")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun object_(): String = object_.getRequired("object")

    /**
     * A list of countries where the business operates (ISO 3166-1 alpha-2 or alpha-3 codes).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operatingJurisdictions(): List<String> = operatingJurisdictions.getRequired("operating_jurisdictions")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun phoneNumbers(): List<PhoneNumber> = phoneNumbers.getRequired("phone_numbers")

    /**
     * Whether the individual is a politically exposed person.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun politicallyExposedPerson(): Boolean? = politicallyExposedPerson.getNullable("politically_exposed_person")

    /**
     * An individual's preferred name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun preferredName(): String? = preferredName.getNullable("preferred_name")

    /**
     * An individual's prefix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun prefix(): String? = prefix.getNullable("prefix")

    /**
     * A list of primary social media URLs for the business.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primarySocialMediaSites(): List<String> = primarySocialMediaSites.getRequired("primary_social_media_sites")

    /**
     * Array of regulatory bodies overseeing this institution.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun regulators(): List<LegalEntityRegulator>? = regulators.getNullable("regulators")

    /**
     * The risk rating of the legal entity. One of low, medium, high.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

    /**
     * The UUID of the parent legal entity in the service provider tree.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun serviceProviderLegalEntityId(): String? = serviceProviderLegalEntityId.getNullable("service_provider_legal_entity_id")

    /**
     * The activation status of the legal entity. One of pending, active, suspended, or denied.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * An individual's suffix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun suffix(): String? = suffix.getNullable("suffix")

    /**
     * Acceptance of terms of use by the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun termsOfUse(): TermsOfUse? = termsOfUse.getNullable("terms_of_use")

    /**
     * Deprecated. Use `third_party_verifications` instead.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun thirdPartyVerification(): ThirdPartyVerification? = thirdPartyVerification.getNullable("third_party_verification")

    /**
     * A list of third-party verifications run by external vendors.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thirdPartyVerifications(): List<ThirdPartyVerification> = thirdPartyVerifications.getRequired("third_party_verifications")

    /**
     * Stock ticker symbol for publicly traded companies.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun tickerSymbol(): String? = tickerSymbol.getNullable("ticker_symbol")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? = wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

    /**
     * The entity's primary website URL.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun website(): String? = website.getNullable("website")

    /**
     * The legal entity associations and its child legal entities.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun legalEntityAssociations(): List<LegalEntityAssociation>? = legalEntityAssociations.getNullable("legal_entity_associations")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addresses")
    @ExcludeMissing
    fun _addresses(): JsonField<List<LegalEntityAddress>> = addresses

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
     * Unlike [businessDescription], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [citizenshipCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citizenship_country")
    @ExcludeMissing
    fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

    /**
     * Returns the raw JSON value of [countryOfIncorporation].
     *
     * Unlike [countryOfIncorporation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_of_incorporation")
    @ExcludeMissing
    fun _countryOfIncorporation(): JsonField<String> = countryOfIncorporation

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

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
     * Unlike [doingBusinessAsNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doing_business_as_names")
    @ExcludeMissing
    fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email")
    @ExcludeMissing
    fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [expectedActivityVolume].
     *
     * Unlike [expectedActivityVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expected_activity_volume")
    @ExcludeMissing
    fun _expectedActivityVolume(): JsonField<Long> = expectedActivityVolume

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id")
    @ExcludeMissing
    fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name")
    @ExcludeMissing
    fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [identifications].
     *
     * Unlike [identifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifications")
    @ExcludeMissing
    fun _identifications(): JsonField<List<Identification>> = identifications

    /**
     * Returns the raw JSON value of [industryClassifications].
     *
     * Unlike [industryClassifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("industry_classifications")
    @ExcludeMissing
    fun _industryClassifications(): JsonField<List<LegalEntityIndustryClassification>> = industryClassifications

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
    @JsonProperty("last_name")
    @ExcludeMissing
    fun _lastName(): JsonField<String> = lastName

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
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode")
    @ExcludeMissing
    fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middle_name")
    @ExcludeMissing
    fun _middleName(): JsonField<String> = middleName

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object")
    @ExcludeMissing
    fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [operatingJurisdictions].
     *
     * Unlike [operatingJurisdictions], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [politicallyExposedPerson], this method doesn't throw if the JSON field has an unexpected type.
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
    @JsonProperty("prefix")
    @ExcludeMissing
    fun _prefix(): JsonField<String> = prefix

    /**
     * Returns the raw JSON value of [primarySocialMediaSites].
     *
     * Unlike [primarySocialMediaSites], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [serviceProviderLegalEntityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_provider_legal_entity_id")
    @ExcludeMissing
    fun _serviceProviderLegalEntityId(): JsonField<String> = serviceProviderLegalEntityId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffix")
    @ExcludeMissing
    fun _suffix(): JsonField<String> = suffix

    /**
     * Returns the raw JSON value of [termsOfUse].
     *
     * Unlike [termsOfUse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("terms_of_use")
    @ExcludeMissing
    fun _termsOfUse(): JsonField<TermsOfUse> = termsOfUse

    /**
     * Returns the raw JSON value of [thirdPartyVerification].
     *
     * Unlike [thirdPartyVerification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("third_party_verification")
    @ExcludeMissing
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> = thirdPartyVerification

    /**
     * Returns the raw JSON value of [thirdPartyVerifications].
     *
     * Unlike [thirdPartyVerifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("third_party_verifications")
    @ExcludeMissing
    fun _thirdPartyVerifications(): JsonField<List<ThirdPartyVerification>> = thirdPartyVerifications

    /**
     * Returns the raw JSON value of [tickerSymbol].
     *
     * Unlike [tickerSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ticker_symbol")
    @ExcludeMissing
    fun _tickerSymbol(): JsonField<String> = tickerSymbol

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [wealthAndEmploymentDetails].
     *
     * Unlike [wealthAndEmploymentDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wealth_and_employment_details")
    @ExcludeMissing
    fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> = wealthAndEmploymentDetails

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website")
    @ExcludeMissing
    fun _website(): JsonField<String> = website

    /**
     * Returns the raw JSON value of [legalEntityAssociations].
     *
     * Unlike [legalEntityAssociations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_entity_associations")
    @ExcludeMissing
    fun _legalEntityAssociations(): JsonField<List<LegalEntityAssociation>> = legalEntityAssociations

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LegalEntity].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .id()
         * .addresses()
         * .bankSettings()
         * .businessDescription()
         * .businessName()
         * .citizenshipCountry()
         * .complianceDetails()
         * .countryOfIncorporation()
         * .createdAt()
         * .dateFormed()
         * .dateOfBirth()
         * .discardedAt()
         * .documents()
         * .doingBusinessAsNames()
         * .email()
         * .expectedActivityVolume()
         * .externalId()
         * .firstName()
         * .identifications()
         * .industryClassifications()
         * .intendedUse()
         * .lastName()
         * .legalEntityType()
         * .legalStructure()
         * .listedExchange()
         * .liveMode()
         * .metadata()
         * .middleName()
         * .object_()
         * .operatingJurisdictions()
         * .phoneNumbers()
         * .politicallyExposedPerson()
         * .preferredName()
         * .prefix()
         * .primarySocialMediaSites()
         * .regulators()
         * .riskRating()
         * .serviceProviderLegalEntityId()
         * .status()
         * .suffix()
         * .termsOfUse()
         * .thirdPartyVerification()
         * .thirdPartyVerifications()
         * .tickerSymbol()
         * .updatedAt()
         * .wealthAndEmploymentDetails()
         * .website()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addresses: JsonField<MutableList<LegalEntityAddress>>? = null
        private var bankSettings: JsonField<BankSettings>? = null
        private var businessDescription: JsonField<String>? = null
        private var businessName: JsonField<String>? = null
        private var citizenshipCountry: JsonField<String>? = null
        private var complianceDetails: JsonValue? = null
        private var countryOfIncorporation: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dateFormed: JsonField<LocalDate>? = null
        private var dateOfBirth: JsonField<LocalDate>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var documents: JsonField<MutableList<Document>>? = null
        private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
        private var email: JsonField<String>? = null
        private var expectedActivityVolume: JsonField<Long>? = null
        private var externalId: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var identifications: JsonField<MutableList<Identification>>? = null
        private var industryClassifications: JsonField<MutableList<LegalEntityIndustryClassification>>? = null
        private var intendedUse: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var legalEntityType: JsonField<LegalEntityType>? = null
        private var legalStructure: JsonField<LegalStructure>? = null
        private var listedExchange: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var middleName: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var operatingJurisdictions: JsonField<MutableList<String>>? = null
        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var politicallyExposedPerson: JsonField<Boolean>? = null
        private var preferredName: JsonField<String>? = null
        private var prefix: JsonField<String>? = null
        private var primarySocialMediaSites: JsonField<MutableList<String>>? = null
        private var regulators: JsonField<MutableList<LegalEntityRegulator>>? = null
        private var riskRating: JsonField<RiskRating>? = null
        private var serviceProviderLegalEntityId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var suffix: JsonField<String>? = null
        private var termsOfUse: JsonField<TermsOfUse>? = null
        private var thirdPartyVerification: JsonField<ThirdPartyVerification>? = null
        private var thirdPartyVerifications: JsonField<MutableList<ThirdPartyVerification>>? = null
        private var tickerSymbol: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>? = null
        private var website: JsonField<String>? = null
        private var legalEntityAssociations: JsonField<MutableList<LegalEntityAssociation>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntity: LegalEntity) =
            apply {
                id = legalEntity.id
                addresses = legalEntity.addresses.map { it.toMutableList() }
                bankSettings = legalEntity.bankSettings
                businessDescription = legalEntity.businessDescription
                businessName = legalEntity.businessName
                citizenshipCountry = legalEntity.citizenshipCountry
                complianceDetails = legalEntity.complianceDetails
                countryOfIncorporation = legalEntity.countryOfIncorporation
                createdAt = legalEntity.createdAt
                dateFormed = legalEntity.dateFormed
                dateOfBirth = legalEntity.dateOfBirth
                discardedAt = legalEntity.discardedAt
                documents = legalEntity.documents.map { it.toMutableList() }
                doingBusinessAsNames = legalEntity.doingBusinessAsNames.map { it.toMutableList() }
                email = legalEntity.email
                expectedActivityVolume = legalEntity.expectedActivityVolume
                externalId = legalEntity.externalId
                firstName = legalEntity.firstName
                identifications = legalEntity.identifications.map { it.toMutableList() }
                industryClassifications = legalEntity.industryClassifications.map { it.toMutableList() }
                intendedUse = legalEntity.intendedUse
                lastName = legalEntity.lastName
                legalEntityType = legalEntity.legalEntityType
                legalStructure = legalEntity.legalStructure
                listedExchange = legalEntity.listedExchange
                liveMode = legalEntity.liveMode
                metadata = legalEntity.metadata
                middleName = legalEntity.middleName
                object_ = legalEntity.object_
                operatingJurisdictions = legalEntity.operatingJurisdictions.map { it.toMutableList() }
                phoneNumbers = legalEntity.phoneNumbers.map { it.toMutableList() }
                politicallyExposedPerson = legalEntity.politicallyExposedPerson
                preferredName = legalEntity.preferredName
                prefix = legalEntity.prefix
                primarySocialMediaSites = legalEntity.primarySocialMediaSites.map { it.toMutableList() }
                regulators = legalEntity.regulators.map { it.toMutableList() }
                riskRating = legalEntity.riskRating
                serviceProviderLegalEntityId = legalEntity.serviceProviderLegalEntityId
                status = legalEntity.status
                suffix = legalEntity.suffix
                termsOfUse = legalEntity.termsOfUse
                thirdPartyVerification = legalEntity.thirdPartyVerification
                thirdPartyVerifications = legalEntity.thirdPartyVerifications.map { it.toMutableList() }
                tickerSymbol = legalEntity.tickerSymbol
                updatedAt = legalEntity.updatedAt
                wealthAndEmploymentDetails = legalEntity.wealthAndEmploymentDetails
                website = legalEntity.website
                legalEntityAssociations = legalEntity.legalEntityAssociations.map { it.toMutableList() }
                additionalProperties = legalEntity.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddress>) = addresses(JsonField.of(addresses))

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed `List<LegalEntityAddress>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addresses(addresses: JsonField<List<LegalEntityAddress>>) =
            apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

        /**
         * Adds a single [LegalEntityAddress] to [addresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddress(address: LegalEntityAddress) =
            apply {
                addresses = (addresses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addresses", it).add(address)
                }
            }

        fun bankSettings(bankSettings: BankSettings?) = bankSettings(JsonField.ofNullable(bankSettings))

        /**
         * Sets [Builder.bankSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankSettings] with a well-typed [BankSettings] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bankSettings(bankSettings: JsonField<BankSettings>) =
            apply {
                this.bankSettings = bankSettings
            }

        /** A description of the business. */
        fun businessDescription(businessDescription: String?) = businessDescription(JsonField.ofNullable(businessDescription))

        /**
         * Sets [Builder.businessDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessDescription] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessDescription(businessDescription: JsonField<String>) =
            apply {
                this.businessDescription = businessDescription
            }

        /** The business's legal business name. */
        fun businessName(businessName: String?) = businessName(JsonField.ofNullable(businessName))

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessName(businessName: JsonField<String>) =
            apply {
                this.businessName = businessName
            }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String?) = citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

        /**
         * Sets [Builder.citizenshipCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citizenshipCountry] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citizenshipCountry(citizenshipCountry: JsonField<String>) =
            apply {
                this.citizenshipCountry = citizenshipCountry
            }

        @Deprecated("deprecated")
        fun complianceDetails(complianceDetails: JsonValue) =
            apply {
                this.complianceDetails = complianceDetails
            }

        /** The country code where the business is incorporated in the ISO 3166-1 alpha-2 or alpha-3 formats. */
        fun countryOfIncorporation(countryOfIncorporation: String?) = countryOfIncorporation(JsonField.ofNullable(countryOfIncorporation))

        /**
         * Sets [Builder.countryOfIncorporation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryOfIncorporation] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryOfIncorporation(countryOfIncorporation: JsonField<String>) =
            apply {
                this.countryOfIncorporation = countryOfIncorporation
            }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

        /**
         * Sets [Builder.dateFormed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFormed] with a well-typed [LocalDate] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateFormed(dateFormed: JsonField<LocalDate>) =
            apply {
                this.dateFormed = dateFormed
            }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate?) = dateOfBirth(JsonField.ofNullable(dateOfBirth))

        /**
         * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) =
            apply {
                this.dateOfBirth = dateOfBirth
            }

        fun discardedAt(discardedAt: OffsetDateTime?) = discardedAt(JsonField.ofNullable(discardedAt))

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) =
            apply {
                this.discardedAt = discardedAt
            }

        fun documents(documents: List<Document>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) =
            apply {
                this.documents = documents.map { it.toMutableList() }
            }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) =
            apply {
                documents = (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
            }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

        /**
         * Sets [Builder.doingBusinessAsNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAsNames] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) =
            apply {
                this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [doingBusinessAsNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDoingBusinessAsName(doingBusinessAsName: String) =
            apply {
                doingBusinessAsNames = (doingBusinessAsNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("doingBusinessAsNames", it).add(doingBusinessAsName)
                }
            }

        /** The entity's primary email. */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun email(email: JsonField<String>) =
            apply {
                this.email = email
            }

        /** Monthly expected transaction volume in USD. */
        fun expectedActivityVolume(expectedActivityVolume: Long?) = expectedActivityVolume(JsonField.ofNullable(expectedActivityVolume))

        /**
         * Alias for [Builder.expectedActivityVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expectedActivityVolume(expectedActivityVolume: Long) = expectedActivityVolume(expectedActivityVolume as Long?)

        /**
         * Sets [Builder.expectedActivityVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedActivityVolume] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedActivityVolume(expectedActivityVolume: JsonField<Long>) =
            apply {
                this.expectedActivityVolume = expectedActivityVolume
            }

        /** An optional user-defined 180 character unique identifier. */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalId(externalId: JsonField<String>) =
            apply {
                this.externalId = externalId
            }

        /** An individual's first name. */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstName(firstName: JsonField<String>) =
            apply {
                this.firstName = firstName
            }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<Identification>) = identifications(JsonField.of(identifications))

        /**
         * Sets [Builder.identifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifications] with a well-typed `List<Identification>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun identifications(identifications: JsonField<List<Identification>>) =
            apply {
                this.identifications = identifications.map { it.toMutableList() }
            }

        /**
         * Adds a single [Identification] to [identifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIdentification(identification: Identification) =
            apply {
                identifications = (identifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("identifications", it).add(identification)
                }
            }

        /** A list of industry classifications for the legal entity. */
        fun industryClassifications(industryClassifications: List<LegalEntityIndustryClassification>) = industryClassifications(JsonField.of(industryClassifications))

        /**
         * Sets [Builder.industryClassifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industryClassifications] with a well-typed `List<LegalEntityIndustryClassification>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun industryClassifications(industryClassifications: JsonField<List<LegalEntityIndustryClassification>>) =
            apply {
                this.industryClassifications = industryClassifications.map { it.toMutableList() }
            }

        /**
         * Adds a single [LegalEntityIndustryClassification] to [industryClassifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndustryClassification(industryClassification: LegalEntityIndustryClassification) =
            apply {
                industryClassifications = (industryClassifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("industryClassifications", it).add(industryClassification)
                }
            }

        /** A description of the intended use of the legal entity. */
        fun intendedUse(intendedUse: String?) = intendedUse(JsonField.ofNullable(intendedUse))

        /**
         * Sets [Builder.intendedUse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intendedUse] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intendedUse(intendedUse: JsonField<String>) =
            apply {
                this.intendedUse = intendedUse
            }

        /** An individual's last name. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastName(lastName: JsonField<String>) =
            apply {
                this.lastName = lastName
            }

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: LegalEntityType) = legalEntityType(JsonField.of(legalEntityType))

        /**
         * Sets [Builder.legalEntityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityType] with a well-typed [LegalEntityType] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) =
            apply {
                this.legalEntityType = legalEntityType
            }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure?) = legalStructure(JsonField.ofNullable(legalStructure))

        /**
         * Sets [Builder.legalStructure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalStructure] with a well-typed [LegalStructure] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalStructure(legalStructure: JsonField<LegalStructure>) =
            apply {
                this.legalStructure = legalStructure
            }

        /** ISO 10383 market identifier code. */
        fun listedExchange(listedExchange: String?) = listedExchange(JsonField.ofNullable(listedExchange))

        /**
         * Sets [Builder.listedExchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listedExchange] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun listedExchange(listedExchange: JsonField<String>) =
            apply {
                this.listedExchange = listedExchange
            }

        /** This field will be true if this object exists in the live environment or false if it exists in the test environment. */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) =
            apply {
                this.liveMode = liveMode
            }

        /** Additional data represented as key-value pairs. Both the key and value must be strings. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadata(metadata: JsonField<Metadata>) =
            apply {
                this.metadata = metadata
            }

        /** An individual's middle name. */
        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun middleName(middleName: JsonField<String>) =
            apply {
                this.middleName = middleName
            }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun object_(object_: JsonField<String>) =
            apply {
                this.object_ = object_
            }

        /** A list of countries where the business operates (ISO 3166-1 alpha-2 or alpha-3 codes). */
        fun operatingJurisdictions(operatingJurisdictions: List<String>) = operatingJurisdictions(JsonField.of(operatingJurisdictions))

        /**
         * Sets [Builder.operatingJurisdictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingJurisdictions] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operatingJurisdictions(operatingJurisdictions: JsonField<List<String>>) =
            apply {
                this.operatingJurisdictions = operatingJurisdictions.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [operatingJurisdictions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperatingJurisdiction(operatingJurisdiction: String) =
            apply {
                operatingJurisdictions = (operatingJurisdictions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operatingJurisdictions", it).add(operatingJurisdiction)
                }
            }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) =
            apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

        /**
         * Adds a single [PhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumber) =
            apply {
                phoneNumbers = (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
            }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) = politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

        /**
         * Alias for [Builder.politicallyExposedPerson].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = politicallyExposedPerson(politicallyExposedPerson as Boolean?)

        /**
         * Sets [Builder.politicallyExposedPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.politicallyExposedPerson] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) =
            apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String?) = preferredName(JsonField.ofNullable(preferredName))

        /**
         * Sets [Builder.preferredName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferredName(preferredName: JsonField<String>) =
            apply {
                this.preferredName = preferredName
            }

        /** An individual's prefix. */
        fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prefix(prefix: JsonField<String>) =
            apply {
                this.prefix = prefix
            }

        /** A list of primary social media URLs for the business. */
        fun primarySocialMediaSites(primarySocialMediaSites: List<String>) = primarySocialMediaSites(JsonField.of(primarySocialMediaSites))

        /**
         * Sets [Builder.primarySocialMediaSites] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primarySocialMediaSites] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primarySocialMediaSites(primarySocialMediaSites: JsonField<List<String>>) =
            apply {
                this.primarySocialMediaSites = primarySocialMediaSites.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [primarySocialMediaSites].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrimarySocialMediaSite(primarySocialMediaSite: String) =
            apply {
                primarySocialMediaSites = (primarySocialMediaSites ?: JsonField.of(mutableListOf())).also {
                    checkKnown("primarySocialMediaSites", it).add(primarySocialMediaSite)
                }
            }

        /** Array of regulatory bodies overseeing this institution. */
        fun regulators(regulators: List<LegalEntityRegulator>?) = regulators(JsonField.ofNullable(regulators))

        /**
         * Sets [Builder.regulators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulators] with a well-typed `List<LegalEntityRegulator>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regulators(regulators: JsonField<List<LegalEntityRegulator>>) =
            apply {
                this.regulators = regulators.map { it.toMutableList() }
            }

        /**
         * Adds a single [LegalEntityRegulator] to [regulators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulator(regulator: LegalEntityRegulator) =
            apply {
                regulators = (regulators ?: JsonField.of(mutableListOf())).also {
                    checkKnown("regulators", it).add(regulator)
                }
            }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

        /**
         * Sets [Builder.riskRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun riskRating(riskRating: JsonField<RiskRating>) =
            apply {
                this.riskRating = riskRating
            }

        /** The UUID of the parent legal entity in the service provider tree. */
        fun serviceProviderLegalEntityId(serviceProviderLegalEntityId: String?) = serviceProviderLegalEntityId(JsonField.ofNullable(serviceProviderLegalEntityId))

        /**
         * Sets [Builder.serviceProviderLegalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceProviderLegalEntityId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceProviderLegalEntityId(serviceProviderLegalEntityId: JsonField<String>) =
            apply {
                this.serviceProviderLegalEntityId = serviceProviderLegalEntityId
            }

        /** The activation status of the legal entity. One of pending, active, suspended, or denied. */
        fun status(status: Status?) = status(JsonField.ofNullable(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<Status>) =
            apply {
                this.status = status
            }

        /** An individual's suffix. */
        fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suffix(suffix: JsonField<String>) =
            apply {
                this.suffix = suffix
            }

        /** Acceptance of terms of use by the legal entity. */
        fun termsOfUse(termsOfUse: TermsOfUse?) = termsOfUse(JsonField.ofNullable(termsOfUse))

        /**
         * Sets [Builder.termsOfUse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsOfUse] with a well-typed [TermsOfUse] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun termsOfUse(termsOfUse: JsonField<TermsOfUse>) =
            apply {
                this.termsOfUse = termsOfUse
            }

        /** Deprecated. Use `third_party_verifications` instead. */
        @Deprecated("deprecated")
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification?) = thirdPartyVerification(JsonField.ofNullable(thirdPartyVerification))

        /**
         * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerification] with a well-typed [ThirdPartyVerification] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                this.thirdPartyVerification = thirdPartyVerification
            }

        /** A list of third-party verifications run by external vendors. */
        fun thirdPartyVerifications(thirdPartyVerifications: List<ThirdPartyVerification>) = thirdPartyVerifications(JsonField.of(thirdPartyVerifications))

        /**
         * Sets [Builder.thirdPartyVerifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerifications] with a well-typed `List<ThirdPartyVerification>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thirdPartyVerifications(thirdPartyVerifications: JsonField<List<ThirdPartyVerification>>) =
            apply {
                this.thirdPartyVerifications = thirdPartyVerifications.map { it.toMutableList() }
            }

        /**
         * Adds a single [ThirdPartyVerification] to [thirdPartyVerifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) =
            apply {
                thirdPartyVerifications = (thirdPartyVerifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thirdPartyVerifications", it).add(thirdPartyVerification)
                }
            }

        /** Stock ticker symbol for publicly traded companies. */
        fun tickerSymbol(tickerSymbol: String?) = tickerSymbol(JsonField.ofNullable(tickerSymbol))

        /**
         * Sets [Builder.tickerSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tickerSymbol] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tickerSymbol(tickerSymbol: JsonField<String>) =
            apply {
                this.tickerSymbol = tickerSymbol
            }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply {
                this.updatedAt = updatedAt
            }

        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails?) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

        /**
         * Sets [Builder.wealthAndEmploymentDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wealthAndEmploymentDetails] with a well-typed [WealthAndEmploymentDetails] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>) =
            apply {
                this.wealthAndEmploymentDetails = wealthAndEmploymentDetails
            }

        /** The entity's primary website URL. */
        fun website(website: String?) = website(JsonField.ofNullable(website))

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun website(website: JsonField<String>) =
            apply {
                this.website = website
            }

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(legalEntityAssociations: List<LegalEntityAssociation>?) = legalEntityAssociations(JsonField.ofNullable(legalEntityAssociations))

        /**
         * Sets [Builder.legalEntityAssociations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityAssociations] with a well-typed `List<LegalEntityAssociation>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalEntityAssociations(legalEntityAssociations: JsonField<List<LegalEntityAssociation>>) =
            apply {
                this.legalEntityAssociations = legalEntityAssociations.map { it.toMutableList() }
            }

        /**
         * Adds a single [LegalEntityAssociation] to [legalEntityAssociations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLegalEntityAssociation(legalEntityAssociation: LegalEntityAssociation) =
            apply {
                legalEntityAssociations = (legalEntityAssociations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("legalEntityAssociations", it).add(legalEntityAssociation)
                }
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [LegalEntity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```kotlin
         * .id()
         * .addresses()
         * .bankSettings()
         * .businessDescription()
         * .businessName()
         * .citizenshipCountry()
         * .complianceDetails()
         * .countryOfIncorporation()
         * .createdAt()
         * .dateFormed()
         * .dateOfBirth()
         * .discardedAt()
         * .documents()
         * .doingBusinessAsNames()
         * .email()
         * .expectedActivityVolume()
         * .externalId()
         * .firstName()
         * .identifications()
         * .industryClassifications()
         * .intendedUse()
         * .lastName()
         * .legalEntityType()
         * .legalStructure()
         * .listedExchange()
         * .liveMode()
         * .metadata()
         * .middleName()
         * .object_()
         * .operatingJurisdictions()
         * .phoneNumbers()
         * .politicallyExposedPerson()
         * .preferredName()
         * .prefix()
         * .primarySocialMediaSites()
         * .regulators()
         * .riskRating()
         * .serviceProviderLegalEntityId()
         * .status()
         * .suffix()
         * .termsOfUse()
         * .thirdPartyVerification()
         * .thirdPartyVerifications()
         * .tickerSymbol()
         * .updatedAt()
         * .wealthAndEmploymentDetails()
         * .website()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntity =
            LegalEntity(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "addresses", addresses
              ).map { it.toImmutable() },
              checkRequired(
                "bankSettings", bankSettings
              ),
              checkRequired(
                "businessDescription", businessDescription
              ),
              checkRequired(
                "businessName", businessName
              ),
              checkRequired(
                "citizenshipCountry", citizenshipCountry
              ),
              checkRequired(
                "complianceDetails", complianceDetails
              ),
              checkRequired(
                "countryOfIncorporation", countryOfIncorporation
              ),
              checkRequired(
                "createdAt", createdAt
              ),
              checkRequired(
                "dateFormed", dateFormed
              ),
              checkRequired(
                "dateOfBirth", dateOfBirth
              ),
              checkRequired(
                "discardedAt", discardedAt
              ),
              checkRequired(
                "documents", documents
              ).map { it.toImmutable() },
              checkRequired(
                "doingBusinessAsNames", doingBusinessAsNames
              ).map { it.toImmutable() },
              checkRequired(
                "email", email
              ),
              checkRequired(
                "expectedActivityVolume", expectedActivityVolume
              ),
              checkRequired(
                "externalId", externalId
              ),
              checkRequired(
                "firstName", firstName
              ),
              checkRequired(
                "identifications", identifications
              ).map { it.toImmutable() },
              checkRequired(
                "industryClassifications", industryClassifications
              ).map { it.toImmutable() },
              checkRequired(
                "intendedUse", intendedUse
              ),
              checkRequired(
                "lastName", lastName
              ),
              checkRequired(
                "legalEntityType", legalEntityType
              ),
              checkRequired(
                "legalStructure", legalStructure
              ),
              checkRequired(
                "listedExchange", listedExchange
              ),
              checkRequired(
                "liveMode", liveMode
              ),
              checkRequired(
                "metadata", metadata
              ),
              checkRequired(
                "middleName", middleName
              ),
              checkRequired(
                "object_", object_
              ),
              checkRequired(
                "operatingJurisdictions", operatingJurisdictions
              ).map { it.toImmutable() },
              checkRequired(
                "phoneNumbers", phoneNumbers
              ).map { it.toImmutable() },
              checkRequired(
                "politicallyExposedPerson", politicallyExposedPerson
              ),
              checkRequired(
                "preferredName", preferredName
              ),
              checkRequired(
                "prefix", prefix
              ),
              checkRequired(
                "primarySocialMediaSites", primarySocialMediaSites
              ).map { it.toImmutable() },
              checkRequired(
                "regulators", regulators
              ).map { it.toImmutable() },
              checkRequired(
                "riskRating", riskRating
              ),
              checkRequired(
                "serviceProviderLegalEntityId", serviceProviderLegalEntityId
              ),
              checkRequired(
                "status", status
              ),
              checkRequired(
                "suffix", suffix
              ),
              checkRequired(
                "termsOfUse", termsOfUse
              ),
              checkRequired(
                "thirdPartyVerification", thirdPartyVerification
              ),
              checkRequired(
                "thirdPartyVerifications", thirdPartyVerifications
              ).map { it.toImmutable() },
              checkRequired(
                "tickerSymbol", tickerSymbol
              ),
              checkRequired(
                "updatedAt", updatedAt
              ),
              checkRequired(
                "wealthAndEmploymentDetails", wealthAndEmploymentDetails
              ),
              checkRequired(
                "website", website
              ),
              (legalEntityAssociations?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): LegalEntity =
        apply {
            if (validated) {
              return@apply
            }

            id()
            addresses().forEach { it.validate() }
            bankSettings()?.validate()
            businessDescription()
            businessName()
            citizenshipCountry()
            countryOfIncorporation()
            createdAt()
            dateFormed()
            dateOfBirth()
            discardedAt()
            documents().forEach { it.validate() }
            doingBusinessAsNames()
            email()
            expectedActivityVolume()
            externalId()
            firstName()
            identifications().forEach { it.validate() }
            industryClassifications().forEach { it.validate() }
            intendedUse()
            lastName()
            legalEntityType().validate()
            legalStructure()?.validate()
            listedExchange()
            liveMode()
            metadata().validate()
            middleName()
            object_()
            operatingJurisdictions()
            phoneNumbers().forEach { it.validate() }
            politicallyExposedPerson()
            preferredName()
            prefix()
            primarySocialMediaSites()
            regulators()?.forEach { it.validate() }
            riskRating()?.validate()
            serviceProviderLegalEntityId()
            status()?.validate()
            suffix()
            termsOfUse()?.validate()
            thirdPartyVerification()?.validate()
            thirdPartyVerifications().forEach { it.validate() }
            tickerSymbol()
            updatedAt()
            wealthAndEmploymentDetails()?.validate()
            website()
            legalEntityAssociations()?.forEach { it.validate() }
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
    internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1) + (addresses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (bankSettings.asKnown()?.validity() ?: 0) + (if (businessDescription.asKnown() == null) 0 else 1) + (if (businessName.asKnown() == null) 0 else 1) + (if (citizenshipCountry.asKnown() == null) 0 else 1) + (if (countryOfIncorporation.asKnown() == null) 0 else 1) + (if (createdAt.asKnown() == null) 0 else 1) + (if (dateFormed.asKnown() == null) 0 else 1) + (if (dateOfBirth.asKnown() == null) 0 else 1) + (if (discardedAt.asKnown() == null) 0 else 1) + (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (doingBusinessAsNames.asKnown()?.size ?: 0) + (if (email.asKnown() == null) 0 else 1) + (if (expectedActivityVolume.asKnown() == null) 0 else 1) + (if (externalId.asKnown() == null) 0 else 1) + (if (firstName.asKnown() == null) 0 else 1) + (identifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (industryClassifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (if (intendedUse.asKnown() == null) 0 else 1) + (if (lastName.asKnown() == null) 0 else 1) + (legalEntityType.asKnown()?.validity() ?: 0) + (legalStructure.asKnown()?.validity() ?: 0) + (if (listedExchange.asKnown() == null) 0 else 1) + (if (liveMode.asKnown() == null) 0 else 1) + (metadata.asKnown()?.validity() ?: 0) + (if (middleName.asKnown() == null) 0 else 1) + (if (object_.asKnown() == null) 0 else 1) + (operatingJurisdictions.asKnown()?.size ?: 0) + (phoneNumbers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (if (politicallyExposedPerson.asKnown() == null) 0 else 1) + (if (preferredName.asKnown() == null) 0 else 1) + (if (prefix.asKnown() == null) 0 else 1) + (primarySocialMediaSites.asKnown()?.size ?: 0) + (regulators.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (riskRating.asKnown()?.validity() ?: 0) + (if (serviceProviderLegalEntityId.asKnown() == null) 0 else 1) + (status.asKnown()?.validity() ?: 0) + (if (suffix.asKnown() == null) 0 else 1) + (termsOfUse.asKnown()?.validity() ?: 0) + (thirdPartyVerification.asKnown()?.validity() ?: 0) + (thirdPartyVerifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (if (tickerSymbol.asKnown() == null) 0 else 1) + (if (updatedAt.asKnown() == null) 0 else 1) + (wealthAndEmploymentDetails.asKnown()?.validity() ?: 0) + (if (website.asKnown() == null) 0 else 1) + (legalEntityAssociations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class LegalEntityAddress @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val id: JsonField<String>,
        private val addressTypes: JsonField<List<AddressType>>,
        private val country: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val locality: JsonField<String>,
        private val object_: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val primary: JsonField<Boolean>,
        private val region: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address_types") @ExcludeMissing addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at") @ExcludeMissing discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code") @ExcludeMissing postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary") @ExcludeMissing primary: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(
          id,
          addressTypes,
          country,
          createdAt,
          discardedAt,
          line1,
          line2,
          liveMode,
          locality,
          object_,
          postalCode,
          primary,
          region,
          updatedAt,
          mutableMapOf(),
        )

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun id(): String = id.getRequired("id")

        /**
         * The types of this address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addressTypes(): List<AddressType> = addressTypes.getRequired("address_types")

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun country(): String? = country.getNullable("country")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
        fun line1(): String? = line1.getNullable("line1")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
        fun line2(): String? = line2.getNullable("line2")

        /**
         * This field will be true if this object exists in the live environment or false if it exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String? = locality.getNullable("locality")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun object_(): String = object_.getRequired("object")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /**
         * Whether this address is the primary address for the legal entity. Optional; when omitted it is inferred from the address types.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun primary(): Boolean? = primary.getNullable("primary")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun region(): String? = region.getNullable("region")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [addressTypes].
         *
         * Unlike [addressTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address_types")
        @ExcludeMissing
        fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country")
        @ExcludeMissing
        fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [discardedAt].
         *
         * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1")
        @ExcludeMissing
        fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2")
        @ExcludeMissing
        fun _line2(): JsonField<String> = line2

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality")
        @ExcludeMissing
        fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object")
        @ExcludeMissing
        fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [primary].
         *
         * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("primary")
        @ExcludeMissing
        fun _primary(): JsonField<Boolean> = primary

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region")
        @ExcludeMissing
        fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LegalEntityAddress].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .id()
             * .addressTypes()
             * .country()
             * .createdAt()
             * .discardedAt()
             * .line1()
             * .line2()
             * .liveMode()
             * .locality()
             * .object_()
             * .postalCode()
             * .primary()
             * .region()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LegalEntityAddress]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var addressTypes: JsonField<MutableList<AddressType>>? = null
            private var country: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var locality: JsonField<String>? = null
            private var object_: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var primary: JsonField<Boolean>? = null
            private var region: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityAddress: LegalEntityAddress) =
                apply {
                    id = legalEntityAddress.id
                    addressTypes = legalEntityAddress.addressTypes.map { it.toMutableList() }
                    country = legalEntityAddress.country
                    createdAt = legalEntityAddress.createdAt
                    discardedAt = legalEntityAddress.discardedAt
                    line1 = legalEntityAddress.line1
                    line2 = legalEntityAddress.line2
                    liveMode = legalEntityAddress.liveMode
                    locality = legalEntityAddress.locality
                    object_ = legalEntityAddress.object_
                    postalCode = legalEntityAddress.postalCode
                    primary = legalEntityAddress.primary
                    region = legalEntityAddress.region
                    updatedAt = legalEntityAddress.updatedAt
                    additionalProperties = legalEntityAddress.additionalProperties.toMutableMap()
                }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            /** The types of this address. */
            fun addressTypes(addressTypes: List<AddressType>) = addressTypes(JsonField.of(addressTypes))

            /**
             * Sets [Builder.addressTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressTypes] with a well-typed `List<AddressType>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressTypes(addressTypes: JsonField<List<AddressType>>) =
                apply {
                    this.addressTypes = addressTypes.map { it.toMutableList() }
                }

            /**
             * Adds a single [AddressType] to [addressTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddressType(addressType: AddressType) =
                apply {
                    addressTypes = (addressTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addressTypes", it).add(addressType)
                    }
                }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) =
                apply {
                    this.country = country
                }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply {
                    this.createdAt = createdAt
                }

            fun discardedAt(discardedAt: OffsetDateTime?) = discardedAt(JsonField.ofNullable(discardedAt))

            /**
             * Sets [Builder.discardedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.discardedAt = discardedAt
                }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) =
                apply {
                    this.line1 = line1
                }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) =
                apply {
                    this.line2 = line2
                }

            /** This field will be true if this object exists in the live environment or false if it exists in the test environment. */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * Sets [Builder.liveMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) =
                apply {
                    this.liveMode = liveMode
                }

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) =
                apply {
                    this.locality = locality
                }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) =
                apply {
                    this.object_ = object_
                }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) =
                apply {
                    this.postalCode = postalCode
                }

            /** Whether this address is the primary address for the legal entity. Optional; when omitted it is inferred from the address types. */
            fun primary(primary: Boolean?) = primary(JsonField.ofNullable(primary))

            /**
             * Alias for [Builder.primary].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun primary(primary: Boolean) = primary(primary as Boolean?)

            /**
             * Sets [Builder.primary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primary] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primary(primary: JsonField<Boolean>) =
                apply {
                    this.primary = primary
                }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) =
                apply {
                    this.region = region
                }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.updatedAt = updatedAt
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [LegalEntityAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```kotlin
             * .id()
             * .addressTypes()
             * .country()
             * .createdAt()
             * .discardedAt()
             * .line1()
             * .line2()
             * .liveMode()
             * .locality()
             * .object_()
             * .postalCode()
             * .primary()
             * .region()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LegalEntityAddress =
                LegalEntityAddress(
                  checkRequired(
                    "id", id
                  ),
                  checkRequired(
                    "addressTypes", addressTypes
                  ).map { it.toImmutable() },
                  checkRequired(
                    "country", country
                  ),
                  checkRequired(
                    "createdAt", createdAt
                  ),
                  checkRequired(
                    "discardedAt", discardedAt
                  ),
                  checkRequired(
                    "line1", line1
                  ),
                  checkRequired(
                    "line2", line2
                  ),
                  checkRequired(
                    "liveMode", liveMode
                  ),
                  checkRequired(
                    "locality", locality
                  ),
                  checkRequired(
                    "object_", object_
                  ),
                  checkRequired(
                    "postalCode", postalCode
                  ),
                  checkRequired(
                    "primary", primary
                  ),
                  checkRequired(
                    "region", region
                  ),
                  checkRequired(
                    "updatedAt", updatedAt
                  ),
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
        fun validate(): LegalEntityAddress =
            apply {
                if (validated) {
                  return@apply
                }

                id()
                addressTypes().forEach { it.validate() }
                country()
                createdAt()
                discardedAt()
                line1()
                line2()
                liveMode()
                locality()
                object_()
                postalCode()
                primary()
                region()
                updatedAt()
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
        internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1) + (addressTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (if (country.asKnown() == null) 0 else 1) + (if (createdAt.asKnown() == null) 0 else 1) + (if (discardedAt.asKnown() == null) 0 else 1) + (if (line1.asKnown() == null) 0 else 1) + (if (line2.asKnown() == null) 0 else 1) + (if (liveMode.asKnown() == null) 0 else 1) + (if (locality.asKnown() == null) 0 else 1) + (if (object_.asKnown() == null) 0 else 1) + (if (postalCode.asKnown() == null) 0 else 1) + (if (primary.asKnown() == null) 0 else 1) + (if (region.asKnown() == null) 0 else 1) + (if (updatedAt.asKnown() == null) 0 else 1)

        class AddressType @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                val BUSINESS = of("business")

                val BUSINESS_PHYSICAL = of("business_physical")

                val BUSINESS_REGISTERED = of("business_registered")

                val MAILING = of("mailing")

                val OTHER = of("other")

                val PO_BOX = of("po_box")

                val RESIDENTIAL = of("residential")

                fun of(value: String) = AddressType(JsonField.of(value))
            }

            /** An enum containing [AddressType]'s known values. */
            enum class Known {
                BUSINESS,
                BUSINESS_PHYSICAL,
                BUSINESS_REGISTERED,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
            }

            /**
             * An enum containing [AddressType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AddressType] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                BUSINESS_PHYSICAL,
                BUSINESS_REGISTERED,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
                /** An enum member indicating that [AddressType] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    BUSINESS_PHYSICAL -> Value.BUSINESS_PHYSICAL
                    BUSINESS_REGISTERED -> Value.BUSINESS_REGISTERED
                    MAILING -> Value.MAILING
                    OTHER -> Value.OTHER
                    PO_BOX -> Value.PO_BOX
                    RESIDENTIAL -> Value.RESIDENTIAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known member.
             */
            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    BUSINESS_PHYSICAL -> Known.BUSINESS_PHYSICAL
                    BUSINESS_REGISTERED -> Known.BUSINESS_REGISTERED
                    MAILING -> Known.MAILING
                    OTHER -> Known.OTHER
                    PO_BOX -> Known.PO_BOX
                    RESIDENTIAL -> Known.RESIDENTIAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the expected
             *   primitive type.
             */
            fun asString(): String = _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing fields.
             *
             * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): AddressType =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
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

          return other is LegalEntityAddress && id == other.id && addressTypes == other.addressTypes && country == other.country && createdAt == other.createdAt && discardedAt == other.discardedAt && line1 == other.line1 && line2 == other.line2 && liveMode == other.liveMode && locality == other.locality && object_ == other.object_ && postalCode == other.postalCode && primary == other.primary && region == other.region && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, addressTypes, country, createdAt, discardedAt, line1, line2, liveMode, locality, object_, postalCode, primary, region, updatedAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LegalEntityAddress{id=$id, addressTypes=$addressTypes, country=$country, createdAt=$createdAt, discardedAt=$discardedAt, line1=$line1, line2=$line2, liveMode=$liveMode, locality=$locality, object_=$object_, postalCode=$postalCode, primary=$primary, region=$region, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class Identification @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val documents: JsonField<List<Document>>,
        private val expirationDate: JsonField<LocalDate>,
        private val idType: JsonField<IdType>,
        private val issuingCountry: JsonField<String>,
        private val issuingRegion: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at") @ExcludeMissing discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("documents") @ExcludeMissing documents: JsonField<List<Document>> = JsonMissing.of(),
            @JsonProperty("expiration_date") @ExcludeMissing expirationDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("id_type") @ExcludeMissing idType: JsonField<IdType> = JsonMissing.of(),
            @JsonProperty("issuing_country") @ExcludeMissing issuingCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issuing_region") @ExcludeMissing issuingRegion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(
          id,
          createdAt,
          discardedAt,
          documents,
          expirationDate,
          idType,
          issuingCountry,
          issuingRegion,
          liveMode,
          object_,
          updatedAt,
          mutableMapOf(),
        )

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun id(): String = id.getRequired("id")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun documents(): List<Document> = documents.getRequired("documents")

        /**
         * The date when the Identification is no longer considered valid by the issuing authority.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun expirationDate(): LocalDate? = expirationDate.getNullable("expiration_date")

        /**
         * The type of ID number.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun idType(): IdType = idType.getRequired("id_type")

        /**
         * The ISO 3166-1 alpha-2 country code of the country that issued the identification
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

        /**
         * The region in which the identifcation was issued.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun issuingRegion(): String? = issuingRegion.getNullable("issuing_region")

        /**
         * This field will be true if this object exists in the live environment or false if it exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun object_(): String = object_.getRequired("object")

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [discardedAt].
         *
         * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<Document>> = documents

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<LocalDate> = expirationDate

        /**
         * Returns the raw JSON value of [idType].
         *
         * Unlike [idType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id_type")
        @ExcludeMissing
        fun _idType(): JsonField<IdType> = idType

        /**
         * Returns the raw JSON value of [issuingCountry].
         *
         * Unlike [issuingCountry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issuing_country")
        @ExcludeMissing
        fun _issuingCountry(): JsonField<String> = issuingCountry

        /**
         * Returns the raw JSON value of [issuingRegion].
         *
         * Unlike [issuingRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issuing_region")
        @ExcludeMissing
        fun _issuingRegion(): JsonField<String> = issuingRegion

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object")
        @ExcludeMissing
        fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Identification].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .id()
             * .createdAt()
             * .discardedAt()
             * .documents()
             * .expirationDate()
             * .idType()
             * .issuingCountry()
             * .issuingRegion()
             * .liveMode()
             * .object_()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Identification]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var documents: JsonField<MutableList<Document>>? = null
            private var expirationDate: JsonField<LocalDate>? = null
            private var idType: JsonField<IdType>? = null
            private var issuingCountry: JsonField<String>? = null
            private var issuingRegion: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identification: Identification) =
                apply {
                    id = identification.id
                    createdAt = identification.createdAt
                    discardedAt = identification.discardedAt
                    documents = identification.documents.map { it.toMutableList() }
                    expirationDate = identification.expirationDate
                    idType = identification.idType
                    issuingCountry = identification.issuingCountry
                    issuingRegion = identification.issuingRegion
                    liveMode = identification.liveMode
                    object_ = identification.object_
                    updatedAt = identification.updatedAt
                    additionalProperties = identification.additionalProperties.toMutableMap()
                }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply {
                    this.createdAt = createdAt
                }

            fun discardedAt(discardedAt: OffsetDateTime?) = discardedAt(JsonField.ofNullable(discardedAt))

            /**
             * Sets [Builder.discardedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.discardedAt = discardedAt
                }

            fun documents(documents: List<Document>) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed `List<Document>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documents(documents: JsonField<List<Document>>) =
                apply {
                    this.documents = documents.map { it.toMutableList() }
                }

            /**
             * Adds a single [Document] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: Document) =
                apply {
                    documents = (documents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
                    }
                }

            /** The date when the Identification is no longer considered valid by the issuing authority. */
            fun expirationDate(expirationDate: LocalDate?) = expirationDate(JsonField.ofNullable(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [LocalDate] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<LocalDate>) =
                apply {
                    this.expirationDate = expirationDate
                }

            /** The type of ID number. */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /**
             * Sets [Builder.idType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idType] with a well-typed [IdType] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idType(idType: JsonField<IdType>) =
                apply {
                    this.idType = idType
                }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String?) = issuingCountry(JsonField.ofNullable(issuingCountry))

            /**
             * Sets [Builder.issuingCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuingCountry] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuingCountry(issuingCountry: JsonField<String>) =
                apply {
                    this.issuingCountry = issuingCountry
                }

            /** The region in which the identifcation was issued. */
            fun issuingRegion(issuingRegion: String?) = issuingRegion(JsonField.ofNullable(issuingRegion))

            /**
             * Sets [Builder.issuingRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuingRegion] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuingRegion(issuingRegion: JsonField<String>) =
                apply {
                    this.issuingRegion = issuingRegion
                }

            /** This field will be true if this object exists in the live environment or false if it exists in the test environment. */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * Sets [Builder.liveMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) =
                apply {
                    this.liveMode = liveMode
                }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) =
                apply {
                    this.object_ = object_
                }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.updatedAt = updatedAt
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [Identification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```kotlin
             * .id()
             * .createdAt()
             * .discardedAt()
             * .documents()
             * .expirationDate()
             * .idType()
             * .issuingCountry()
             * .issuingRegion()
             * .liveMode()
             * .object_()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Identification =
                Identification(
                  checkRequired(
                    "id", id
                  ),
                  checkRequired(
                    "createdAt", createdAt
                  ),
                  checkRequired(
                    "discardedAt", discardedAt
                  ),
                  checkRequired(
                    "documents", documents
                  ).map { it.toImmutable() },
                  checkRequired(
                    "expirationDate", expirationDate
                  ),
                  checkRequired(
                    "idType", idType
                  ),
                  checkRequired(
                    "issuingCountry", issuingCountry
                  ),
                  checkRequired(
                    "issuingRegion", issuingRegion
                  ),
                  checkRequired(
                    "liveMode", liveMode
                  ),
                  checkRequired(
                    "object_", object_
                  ),
                  checkRequired(
                    "updatedAt", updatedAt
                  ),
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
        fun validate(): Identification =
            apply {
                if (validated) {
                  return@apply
                }

                id()
                createdAt()
                discardedAt()
                documents().forEach { it.validate() }
                expirationDate()
                idType().validate()
                issuingCountry()
                issuingRegion()
                liveMode()
                object_()
                updatedAt()
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
        internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1) + (if (createdAt.asKnown() == null) 0 else 1) + (if (discardedAt.asKnown() == null) 0 else 1) + (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (if (expirationDate.asKnown() == null) 0 else 1) + (idType.asKnown()?.validity() ?: 0) + (if (issuingCountry.asKnown() == null) 0 else 1) + (if (issuingRegion.asKnown() == null) 0 else 1) + (if (liveMode.asKnown() == null) 0 else 1) + (if (object_.asKnown() == null) 0 else 1) + (if (updatedAt.asKnown() == null) 0 else 1)

        /** The type of ID number. */
        class IdType @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                val AR_CUIL = of("ar_cuil")

                val AR_CUIT = of("ar_cuit")

                val AT_ATIN = of("at_atin")

                val AT_VAT = of("at_vat")

                val AU_ABN = of("au_abn")

                val AU_TFN = of("au_tfn")

                val BE_ENT = of("be_ent")

                val BE_NRN = of("be_nrn")

                val BR_CNPJ = of("br_cnpj")

                val BR_CPF = of("br_cpf")

                val CA_BN = of("ca_bn")

                val CA_SIN = of("ca_sin")

                val CH_AHV = of("ch_ahv")

                val CH_UID = of("ch_uid")

                val CL_RUN = of("cl_run")

                val CL_RUT = of("cl_rut")

                val CO_CEDULAS = of("co_cedulas")

                val CO_NIT = of("co_nit")

                val CY_TIN = of("cy_tin")

                val CZ_ICO = of("cz_ico")

                val CZ_RC = of("cz_rc")

                val DE_STID = of("de_stid")

                val DE_STNR = of("de_stnr")

                val DE_VAT = of("de_vat")

                val DK_CPR = of("dk_cpr")

                val DK_CVR = of("dk_cvr")

                val DRIVERS_LICENSE = of("drivers_license")

                val EE_IK = of("ee_ik")

                val EE_RK = of("ee_rk")

                val ES_NIE = of("es_nie")

                val ES_NIF = of("es_nif")

                val FI_HETU = of("fi_hetu")

                val FI_YTJ = of("fi_ytj")

                val FR_NIF = of("fr_nif")

                val FR_SIREN = of("fr_siren")

                val FR_VAT = of("fr_vat")

                val GB_NINO = of("gb_nino")

                val GB_UTR = of("gb_utr")

                val GB_VAT = of("gb_vat")

                val GENERIC_INTERNATIONAL = of("generic_international")

                val GR_VAT = of("gr_vat")

                val HN_ID = of("hn_id")

                val HN_RTN = of("hn_rtn")

                val HR_OIB = of("hr_oib")

                val HU_ADJ = of("hu_adj")

                val HU_ANUM = of("hu_anum")

                val IE_PPS = of("ie_pps")

                val IE_TRN = of("ie_trn")

                val IN_LEI = of("in_lei")

                val IS_KNT = of("is_knt")

                val IT_CF = of("it_cf")

                val IT_PIVA = of("it_piva")

                val JP_HB = of("jp_hb")

                val JP_MN = of("jp_mn")

                val KR_BRN = of("kr_brn")

                val KR_CRN = of("kr_crn")

                val KR_RRN = of("kr_rrn")

                val LI_PEID = of("li_peid")

                val LT_AK = of("lt_ak")

                val LT_JAK = of("lt_jak")

                val LU_MTC = of("lu_mtc")

                val LU_VAT = of("lu_vat")

                val LV_PK = of("lv_pk")

                val LV_RN = of("lv_rn")

                val MT_TIN = of("mt_tin")

                val MT_VAT = of("mt_vat")

                val MX_CURP = of("mx_curp")

                val MX_INE = of("mx_ine")

                val MX_RFC = of("mx_rfc")

                val NATIONAL_ID = of("national_id")

                val NL_BSN = of("nl_bsn")

                val NL_BTW = of("nl_btw")

                val NL_RSIN = of("nl_rsin")

                val NO_FDN = of("no_fdn")

                val NO_MVA = of("no_mva")

                val NO_ORGNR = of("no_orgnr")

                val NZ_IRD = of("nz_ird")

                val PASSPORT = of("passport")

                val PL_NIP = of("pl_nip")

                val PL_PESEL = of("pl_pesel")

                val PT_NIF = of("pt_nif")

                val RO_CNP = of("ro_cnp")

                val RO_CUI = of("ro_cui")

                val SA_TIN = of("sa_tin")

                val SA_VAT = of("sa_vat")

                val SE_ORGNR = of("se_orgnr")

                val SE_PNMR = of("se_pnmr")

                val SG_FIN = of("sg_fin")

                val SG_NRIC = of("sg_nric")

                val SG_UEN = of("sg_uen")

                val SI_DAV = of("si_dav")

                val SI_TIN = of("si_tin")

                val SK_ICO = of("sk_ico")

                val SK_RC = of("sk_rc")

                val US_EIN = of("us_ein")

                val US_ITIN = of("us_itin")

                val US_SSN = of("us_ssn")

                val UY_RUT = of("uy_rut")

                val VN_TIN = of("vn_tin")

                fun of(value: String) = IdType(JsonField.of(value))
            }

            /** An enum containing [IdType]'s known values. */
            enum class Known {
                AR_CUIL,
                AR_CUIT,
                AT_ATIN,
                AT_VAT,
                AU_ABN,
                AU_TFN,
                BE_ENT,
                BE_NRN,
                BR_CNPJ,
                BR_CPF,
                CA_BN,
                CA_SIN,
                CH_AHV,
                CH_UID,
                CL_RUN,
                CL_RUT,
                CO_CEDULAS,
                CO_NIT,
                CY_TIN,
                CZ_ICO,
                CZ_RC,
                DE_STID,
                DE_STNR,
                DE_VAT,
                DK_CPR,
                DK_CVR,
                DRIVERS_LICENSE,
                EE_IK,
                EE_RK,
                ES_NIE,
                ES_NIF,
                FI_HETU,
                FI_YTJ,
                FR_NIF,
                FR_SIREN,
                FR_VAT,
                GB_NINO,
                GB_UTR,
                GB_VAT,
                GENERIC_INTERNATIONAL,
                GR_VAT,
                HN_ID,
                HN_RTN,
                HR_OIB,
                HU_ADJ,
                HU_ANUM,
                IE_PPS,
                IE_TRN,
                IN_LEI,
                IS_KNT,
                IT_CF,
                IT_PIVA,
                JP_HB,
                JP_MN,
                KR_BRN,
                KR_CRN,
                KR_RRN,
                LI_PEID,
                LT_AK,
                LT_JAK,
                LU_MTC,
                LU_VAT,
                LV_PK,
                LV_RN,
                MT_TIN,
                MT_VAT,
                MX_CURP,
                MX_INE,
                MX_RFC,
                NATIONAL_ID,
                NL_BSN,
                NL_BTW,
                NL_RSIN,
                NO_FDN,
                NO_MVA,
                NO_ORGNR,
                NZ_IRD,
                PASSPORT,
                PL_NIP,
                PL_PESEL,
                PT_NIF,
                RO_CNP,
                RO_CUI,
                SA_TIN,
                SA_VAT,
                SE_ORGNR,
                SE_PNMR,
                SG_FIN,
                SG_NRIC,
                SG_UEN,
                SI_DAV,
                SI_TIN,
                SK_ICO,
                SK_RC,
                US_EIN,
                US_ITIN,
                US_SSN,
                UY_RUT,
                VN_TIN,
            }

            /**
             * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IdType] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AR_CUIL,
                AR_CUIT,
                AT_ATIN,
                AT_VAT,
                AU_ABN,
                AU_TFN,
                BE_ENT,
                BE_NRN,
                BR_CNPJ,
                BR_CPF,
                CA_BN,
                CA_SIN,
                CH_AHV,
                CH_UID,
                CL_RUN,
                CL_RUT,
                CO_CEDULAS,
                CO_NIT,
                CY_TIN,
                CZ_ICO,
                CZ_RC,
                DE_STID,
                DE_STNR,
                DE_VAT,
                DK_CPR,
                DK_CVR,
                DRIVERS_LICENSE,
                EE_IK,
                EE_RK,
                ES_NIE,
                ES_NIF,
                FI_HETU,
                FI_YTJ,
                FR_NIF,
                FR_SIREN,
                FR_VAT,
                GB_NINO,
                GB_UTR,
                GB_VAT,
                GENERIC_INTERNATIONAL,
                GR_VAT,
                HN_ID,
                HN_RTN,
                HR_OIB,
                HU_ADJ,
                HU_ANUM,
                IE_PPS,
                IE_TRN,
                IN_LEI,
                IS_KNT,
                IT_CF,
                IT_PIVA,
                JP_HB,
                JP_MN,
                KR_BRN,
                KR_CRN,
                KR_RRN,
                LI_PEID,
                LT_AK,
                LT_JAK,
                LU_MTC,
                LU_VAT,
                LV_PK,
                LV_RN,
                MT_TIN,
                MT_VAT,
                MX_CURP,
                MX_INE,
                MX_RFC,
                NATIONAL_ID,
                NL_BSN,
                NL_BTW,
                NL_RSIN,
                NO_FDN,
                NO_MVA,
                NO_ORGNR,
                NZ_IRD,
                PASSPORT,
                PL_NIP,
                PL_PESEL,
                PT_NIF,
                RO_CNP,
                RO_CUI,
                SA_TIN,
                SA_VAT,
                SE_ORGNR,
                SE_PNMR,
                SG_FIN,
                SG_NRIC,
                SG_UEN,
                SI_DAV,
                SI_TIN,
                SK_ICO,
                SK_RC,
                US_EIN,
                US_ITIN,
                US_SSN,
                UY_RUT,
                VN_TIN,
                /** An enum member indicating that [IdType] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AR_CUIL -> Value.AR_CUIL
                    AR_CUIT -> Value.AR_CUIT
                    AT_ATIN -> Value.AT_ATIN
                    AT_VAT -> Value.AT_VAT
                    AU_ABN -> Value.AU_ABN
                    AU_TFN -> Value.AU_TFN
                    BE_ENT -> Value.BE_ENT
                    BE_NRN -> Value.BE_NRN
                    BR_CNPJ -> Value.BR_CNPJ
                    BR_CPF -> Value.BR_CPF
                    CA_BN -> Value.CA_BN
                    CA_SIN -> Value.CA_SIN
                    CH_AHV -> Value.CH_AHV
                    CH_UID -> Value.CH_UID
                    CL_RUN -> Value.CL_RUN
                    CL_RUT -> Value.CL_RUT
                    CO_CEDULAS -> Value.CO_CEDULAS
                    CO_NIT -> Value.CO_NIT
                    CY_TIN -> Value.CY_TIN
                    CZ_ICO -> Value.CZ_ICO
                    CZ_RC -> Value.CZ_RC
                    DE_STID -> Value.DE_STID
                    DE_STNR -> Value.DE_STNR
                    DE_VAT -> Value.DE_VAT
                    DK_CPR -> Value.DK_CPR
                    DK_CVR -> Value.DK_CVR
                    DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                    EE_IK -> Value.EE_IK
                    EE_RK -> Value.EE_RK
                    ES_NIE -> Value.ES_NIE
                    ES_NIF -> Value.ES_NIF
                    FI_HETU -> Value.FI_HETU
                    FI_YTJ -> Value.FI_YTJ
                    FR_NIF -> Value.FR_NIF
                    FR_SIREN -> Value.FR_SIREN
                    FR_VAT -> Value.FR_VAT
                    GB_NINO -> Value.GB_NINO
                    GB_UTR -> Value.GB_UTR
                    GB_VAT -> Value.GB_VAT
                    GENERIC_INTERNATIONAL -> Value.GENERIC_INTERNATIONAL
                    GR_VAT -> Value.GR_VAT
                    HN_ID -> Value.HN_ID
                    HN_RTN -> Value.HN_RTN
                    HR_OIB -> Value.HR_OIB
                    HU_ADJ -> Value.HU_ADJ
                    HU_ANUM -> Value.HU_ANUM
                    IE_PPS -> Value.IE_PPS
                    IE_TRN -> Value.IE_TRN
                    IN_LEI -> Value.IN_LEI
                    IS_KNT -> Value.IS_KNT
                    IT_CF -> Value.IT_CF
                    IT_PIVA -> Value.IT_PIVA
                    JP_HB -> Value.JP_HB
                    JP_MN -> Value.JP_MN
                    KR_BRN -> Value.KR_BRN
                    KR_CRN -> Value.KR_CRN
                    KR_RRN -> Value.KR_RRN
                    LI_PEID -> Value.LI_PEID
                    LT_AK -> Value.LT_AK
                    LT_JAK -> Value.LT_JAK
                    LU_MTC -> Value.LU_MTC
                    LU_VAT -> Value.LU_VAT
                    LV_PK -> Value.LV_PK
                    LV_RN -> Value.LV_RN
                    MT_TIN -> Value.MT_TIN
                    MT_VAT -> Value.MT_VAT
                    MX_CURP -> Value.MX_CURP
                    MX_INE -> Value.MX_INE
                    MX_RFC -> Value.MX_RFC
                    NATIONAL_ID -> Value.NATIONAL_ID
                    NL_BSN -> Value.NL_BSN
                    NL_BTW -> Value.NL_BTW
                    NL_RSIN -> Value.NL_RSIN
                    NO_FDN -> Value.NO_FDN
                    NO_MVA -> Value.NO_MVA
                    NO_ORGNR -> Value.NO_ORGNR
                    NZ_IRD -> Value.NZ_IRD
                    PASSPORT -> Value.PASSPORT
                    PL_NIP -> Value.PL_NIP
                    PL_PESEL -> Value.PL_PESEL
                    PT_NIF -> Value.PT_NIF
                    RO_CNP -> Value.RO_CNP
                    RO_CUI -> Value.RO_CUI
                    SA_TIN -> Value.SA_TIN
                    SA_VAT -> Value.SA_VAT
                    SE_ORGNR -> Value.SE_ORGNR
                    SE_PNMR -> Value.SE_PNMR
                    SG_FIN -> Value.SG_FIN
                    SG_NRIC -> Value.SG_NRIC
                    SG_UEN -> Value.SG_UEN
                    SI_DAV -> Value.SI_DAV
                    SI_TIN -> Value.SI_TIN
                    SK_ICO -> Value.SK_ICO
                    SK_RC -> Value.SK_RC
                    US_EIN -> Value.US_EIN
                    US_ITIN -> Value.US_ITIN
                    US_SSN -> Value.US_SSN
                    UY_RUT -> Value.UY_RUT
                    VN_TIN -> Value.VN_TIN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known member.
             */
            fun known(): Known =
                when (this) {
                    AR_CUIL -> Known.AR_CUIL
                    AR_CUIT -> Known.AR_CUIT
                    AT_ATIN -> Known.AT_ATIN
                    AT_VAT -> Known.AT_VAT
                    AU_ABN -> Known.AU_ABN
                    AU_TFN -> Known.AU_TFN
                    BE_ENT -> Known.BE_ENT
                    BE_NRN -> Known.BE_NRN
                    BR_CNPJ -> Known.BR_CNPJ
                    BR_CPF -> Known.BR_CPF
                    CA_BN -> Known.CA_BN
                    CA_SIN -> Known.CA_SIN
                    CH_AHV -> Known.CH_AHV
                    CH_UID -> Known.CH_UID
                    CL_RUN -> Known.CL_RUN
                    CL_RUT -> Known.CL_RUT
                    CO_CEDULAS -> Known.CO_CEDULAS
                    CO_NIT -> Known.CO_NIT
                    CY_TIN -> Known.CY_TIN
                    CZ_ICO -> Known.CZ_ICO
                    CZ_RC -> Known.CZ_RC
                    DE_STID -> Known.DE_STID
                    DE_STNR -> Known.DE_STNR
                    DE_VAT -> Known.DE_VAT
                    DK_CPR -> Known.DK_CPR
                    DK_CVR -> Known.DK_CVR
                    DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                    EE_IK -> Known.EE_IK
                    EE_RK -> Known.EE_RK
                    ES_NIE -> Known.ES_NIE
                    ES_NIF -> Known.ES_NIF
                    FI_HETU -> Known.FI_HETU
                    FI_YTJ -> Known.FI_YTJ
                    FR_NIF -> Known.FR_NIF
                    FR_SIREN -> Known.FR_SIREN
                    FR_VAT -> Known.FR_VAT
                    GB_NINO -> Known.GB_NINO
                    GB_UTR -> Known.GB_UTR
                    GB_VAT -> Known.GB_VAT
                    GENERIC_INTERNATIONAL -> Known.GENERIC_INTERNATIONAL
                    GR_VAT -> Known.GR_VAT
                    HN_ID -> Known.HN_ID
                    HN_RTN -> Known.HN_RTN
                    HR_OIB -> Known.HR_OIB
                    HU_ADJ -> Known.HU_ADJ
                    HU_ANUM -> Known.HU_ANUM
                    IE_PPS -> Known.IE_PPS
                    IE_TRN -> Known.IE_TRN
                    IN_LEI -> Known.IN_LEI
                    IS_KNT -> Known.IS_KNT
                    IT_CF -> Known.IT_CF
                    IT_PIVA -> Known.IT_PIVA
                    JP_HB -> Known.JP_HB
                    JP_MN -> Known.JP_MN
                    KR_BRN -> Known.KR_BRN
                    KR_CRN -> Known.KR_CRN
                    KR_RRN -> Known.KR_RRN
                    LI_PEID -> Known.LI_PEID
                    LT_AK -> Known.LT_AK
                    LT_JAK -> Known.LT_JAK
                    LU_MTC -> Known.LU_MTC
                    LU_VAT -> Known.LU_VAT
                    LV_PK -> Known.LV_PK
                    LV_RN -> Known.LV_RN
                    MT_TIN -> Known.MT_TIN
                    MT_VAT -> Known.MT_VAT
                    MX_CURP -> Known.MX_CURP
                    MX_INE -> Known.MX_INE
                    MX_RFC -> Known.MX_RFC
                    NATIONAL_ID -> Known.NATIONAL_ID
                    NL_BSN -> Known.NL_BSN
                    NL_BTW -> Known.NL_BTW
                    NL_RSIN -> Known.NL_RSIN
                    NO_FDN -> Known.NO_FDN
                    NO_MVA -> Known.NO_MVA
                    NO_ORGNR -> Known.NO_ORGNR
                    NZ_IRD -> Known.NZ_IRD
                    PASSPORT -> Known.PASSPORT
                    PL_NIP -> Known.PL_NIP
                    PL_PESEL -> Known.PL_PESEL
                    PT_NIF -> Known.PT_NIF
                    RO_CNP -> Known.RO_CNP
                    RO_CUI -> Known.RO_CUI
                    SA_TIN -> Known.SA_TIN
                    SA_VAT -> Known.SA_VAT
                    SE_ORGNR -> Known.SE_ORGNR
                    SE_PNMR -> Known.SE_PNMR
                    SG_FIN -> Known.SG_FIN
                    SG_NRIC -> Known.SG_NRIC
                    SG_UEN -> Known.SG_UEN
                    SI_DAV -> Known.SI_DAV
                    SI_TIN -> Known.SI_TIN
                    SK_ICO -> Known.SK_ICO
                    SK_RC -> Known.SK_RC
                    US_EIN -> Known.US_EIN
                    US_ITIN -> Known.US_ITIN
                    US_SSN -> Known.US_SSN
                    UY_RUT -> Known.UY_RUT
                    VN_TIN -> Known.VN_TIN
                    else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the expected
             *   primitive type.
             */
            fun asString(): String = _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing fields.
             *
             * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): IdType =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is IdType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Identification && id == other.id && createdAt == other.createdAt && discardedAt == other.discardedAt && documents == other.documents && expirationDate == other.expirationDate && idType == other.idType && issuingCountry == other.issuingCountry && issuingRegion == other.issuingRegion && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, createdAt, discardedAt, documents, expirationDate, idType, issuingCountry, issuingRegion, liveMode, object_, updatedAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Identification{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, documents=$documents, expirationDate=$expirationDate, idType=$idType, issuingCountry=$issuingCountry, issuingRegion=$issuingRegion, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The type of legal entity. */
    class LegalEntityType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /** An enum member indicating that [LegalEntityType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String = _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LegalEntityType =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
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
    class LegalStructure @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
            /** An enum member indicating that [LegalStructure] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String = _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LegalStructure =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
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
    class Metadata @JsonCreator private constructor(
        @com.fasterxml.jackson.annotation.JsonValue private val additionalProperties: Map<String, JsonValue>,

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

            internal fun from(metadata: Metadata) =
                apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
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
         * Validates that the types of all values in this object match their expected types recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Metadata =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
    class PhoneNumber @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number") @ExcludeMissing phoneNumber: JsonField<String> = JsonMissing.of()
        ) : this(
          phoneNumber, mutableMapOf()
        )

        /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
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
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
            fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) =
                apply {
                    this.phoneNumber = phoneNumber.phoneNumber
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) =
                apply {
                    this.phoneNumber = phoneNumber
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [PhoneNumber].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumber =
                PhoneNumber(
                  phoneNumber, additionalProperties.toMutableMap()
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
        fun validate(): PhoneNumber =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (if (phoneNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class LegalEntityRegulator @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val jurisdiction: JsonField<String>,
        private val name: JsonField<String>,
        private val registrationNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("jurisdiction") @ExcludeMissing jurisdiction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_number") @ExcludeMissing registrationNumber: JsonField<String> = JsonMissing.of()
        ) : this(
          jurisdiction,
          name,
          registrationNumber,
          mutableMapOf(),
        )

        /**
         * The country code where the regulator operates in the ISO 3166-1 alpha-2 format (e.g., "US", "CA", "GB").
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jurisdiction(): String = jurisdiction.getRequired("jurisdiction")

        /**
         * Full name of the regulatory body.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Registration or identification number with the regulator.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun registrationNumber(): String = registrationNumber.getRequired("registration_number")

        /**
         * Returns the raw JSON value of [jurisdiction].
         *
         * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        fun _jurisdiction(): JsonField<String> = jurisdiction

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [registrationNumber].
         *
         * Unlike [registrationNumber], this method doesn't throw if the JSON field has an unexpected type.
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
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LegalEntityRegulator].
             *
             * The following fields are required:
             *
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

            internal fun from(legalEntityRegulator: LegalEntityRegulator) =
                apply {
                    jurisdiction = legalEntityRegulator.jurisdiction
                    name = legalEntityRegulator.name
                    registrationNumber = legalEntityRegulator.registrationNumber
                    additionalProperties = legalEntityRegulator.additionalProperties.toMutableMap()
                }

            /** The country code where the regulator operates in the ISO 3166-1 alpha-2 format (e.g., "US", "CA", "GB"). */
            fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

            /**
             * Sets [Builder.jurisdiction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jurisdiction(jurisdiction: JsonField<String>) =
                apply {
                    this.jurisdiction = jurisdiction
                }

            /** Full name of the regulatory body. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            /** Registration or identification number with the regulator. */
            fun registrationNumber(registrationNumber: String) = registrationNumber(JsonField.of(registrationNumber))

            /**
             * Sets [Builder.registrationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationNumber(registrationNumber: JsonField<String>) =
                apply {
                    this.registrationNumber = registrationNumber
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [LegalEntityRegulator].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
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
                  checkRequired(
                    "jurisdiction", jurisdiction
                  ),
                  checkRequired(
                    "name", name
                  ),
                  checkRequired(
                    "registrationNumber", registrationNumber
                  ),
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
        fun validate(): LegalEntityRegulator =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (if (jurisdiction.asKnown() == null) 0 else 1) + (if (name.asKnown() == null) 0 else 1) + (if (registrationNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is LegalEntityRegulator && jurisdiction == other.jurisdiction && name == other.name && registrationNumber == other.registrationNumber && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(jurisdiction, name, registrationNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LegalEntityRegulator{jurisdiction=$jurisdiction, name=$name, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
    }

    /** The risk rating of the legal entity. One of low, medium, high. */
    class RiskRating @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            /** An enum member indicating that [RiskRating] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String = _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RiskRating =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
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

    /** The activation status of the legal entity. One of pending, active, suspended, or denied. */
    class Status @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val DENIED = of("denied")

            val PENDING = of("pending")

            val SUSPENDED = of("suspended")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            DENIED,
            PENDING,
            SUSPENDED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            DENIED,
            PENDING,
            SUSPENDED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DENIED -> Value.DENIED
                PENDING -> Value.PENDING
                SUSPENDED -> Value.SUSPENDED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DENIED -> Known.DENIED
                PENDING -> Known.PENDING
                SUSPENDED -> Known.SUSPENDED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String = _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Acceptance of terms of use by the legal entity. */
    class TermsOfUse @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val ipAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_at") @ExcludeMissing acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ip_address") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of()
        ) : this(
          acceptedAt,
          ipAddress,
          mutableMapOf(),
        )

        /**
         * The ISO 8601 timestamp indicating when the terms of use were accepted.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun acceptedAt(): OffsetDateTime? = acceptedAt.getNullable("accepted_at")

        /**
         * The IP address from which the terms of use were accepted. Supports both IPv4 and IPv6 formats.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun ipAddress(): String? = ipAddress.getNullable("ip_address")

        /**
         * Returns the raw JSON value of [acceptedAt].
         *
         * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address")
        @ExcludeMissing
        fun _ipAddress(): JsonField<String> = ipAddress

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [TermsOfUse]. */
            fun builder() = Builder()
        }

        /** A builder for [TermsOfUse]. */
        class Builder internal constructor() {

            private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ipAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(termsOfUse: TermsOfUse) =
                apply {
                    acceptedAt = termsOfUse.acceptedAt
                    ipAddress = termsOfUse.ipAddress
                    additionalProperties = termsOfUse.additionalProperties.toMutableMap()
                }

            /** The ISO 8601 timestamp indicating when the terms of use were accepted. */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /**
             * Sets [Builder.acceptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.acceptedAt = acceptedAt
                }

            /** The IP address from which the terms of use were accepted. Supports both IPv4 and IPv6 formats. */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) =
                apply {
                    this.ipAddress = ipAddress
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [TermsOfUse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TermsOfUse =
                TermsOfUse(
                  acceptedAt,
                  ipAddress,
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
        fun validate(): TermsOfUse =
            apply {
                if (validated) {
                  return@apply
                }

                acceptedAt()
                ipAddress()
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
        internal fun validity(): Int = (if (acceptedAt.asKnown() == null) 0 else 1) + (if (ipAddress.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TermsOfUse && acceptedAt == other.acceptedAt && ipAddress == other.ipAddress && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(acceptedAt, ipAddress, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TermsOfUse{acceptedAt=$acceptedAt, ipAddress=$ipAddress, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is LegalEntity && id == other.id && addresses == other.addresses && bankSettings == other.bankSettings && businessDescription == other.businessDescription && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && complianceDetails == other.complianceDetails && countryOfIncorporation == other.countryOfIncorporation && createdAt == other.createdAt && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && discardedAt == other.discardedAt && documents == other.documents && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && expectedActivityVolume == other.expectedActivityVolume && externalId == other.externalId && firstName == other.firstName && identifications == other.identifications && industryClassifications == other.industryClassifications && intendedUse == other.intendedUse && lastName == other.lastName && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && listedExchange == other.listedExchange && liveMode == other.liveMode && metadata == other.metadata && middleName == other.middleName && object_ == other.object_ && operatingJurisdictions == other.operatingJurisdictions && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && primarySocialMediaSites == other.primarySocialMediaSites && regulators == other.regulators && riskRating == other.riskRating && serviceProviderLegalEntityId == other.serviceProviderLegalEntityId && status == other.status && suffix == other.suffix && termsOfUse == other.termsOfUse && thirdPartyVerification == other.thirdPartyVerification && thirdPartyVerifications == other.thirdPartyVerifications && tickerSymbol == other.tickerSymbol && updatedAt == other.updatedAt && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && legalEntityAssociations == other.legalEntityAssociations && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, addresses, bankSettings, businessDescription, businessName, citizenshipCountry, complianceDetails, countryOfIncorporation, createdAt, dateFormed, dateOfBirth, discardedAt, documents, doingBusinessAsNames, email, expectedActivityVolume, externalId, firstName, identifications, industryClassifications, intendedUse, lastName, legalEntityType, legalStructure, listedExchange, liveMode, metadata, middleName, object_, operatingJurisdictions, phoneNumbers, politicallyExposedPerson, preferredName, prefix, primarySocialMediaSites, regulators, riskRating, serviceProviderLegalEntityId, status, suffix, termsOfUse, thirdPartyVerification, thirdPartyVerifications, tickerSymbol, updatedAt, wealthAndEmploymentDetails, website, legalEntityAssociations, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "LegalEntity{id=$id, addresses=$addresses, bankSettings=$bankSettings, businessDescription=$businessDescription, businessName=$businessName, citizenshipCountry=$citizenshipCountry, complianceDetails=$complianceDetails, countryOfIncorporation=$countryOfIncorporation, createdAt=$createdAt, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, discardedAt=$discardedAt, documents=$documents, doingBusinessAsNames=$doingBusinessAsNames, email=$email, expectedActivityVolume=$expectedActivityVolume, externalId=$externalId, firstName=$firstName, identifications=$identifications, industryClassifications=$industryClassifications, intendedUse=$intendedUse, lastName=$lastName, legalEntityType=$legalEntityType, legalStructure=$legalStructure, listedExchange=$listedExchange, liveMode=$liveMode, metadata=$metadata, middleName=$middleName, object_=$object_, operatingJurisdictions=$operatingJurisdictions, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, primarySocialMediaSites=$primarySocialMediaSites, regulators=$regulators, riskRating=$riskRating, serviceProviderLegalEntityId=$serviceProviderLegalEntityId, status=$status, suffix=$suffix, termsOfUse=$termsOfUse, thirdPartyVerification=$thirdPartyVerification, thirdPartyVerifications=$thirdPartyVerifications, tickerSymbol=$tickerSymbol, updatedAt=$updatedAt, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, legalEntityAssociations=$legalEntityAssociations, additionalProperties=$additionalProperties}"
}
