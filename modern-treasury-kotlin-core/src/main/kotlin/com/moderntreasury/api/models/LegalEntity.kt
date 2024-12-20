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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LegalEntity
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("legal_entity_type")
    @ExcludeMissing
    private val legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
    @JsonProperty("risk_rating")
    @ExcludeMissing
    private val riskRating: JsonField<RiskRating> = JsonMissing.of(),
    @JsonProperty("prefix")
    @ExcludeMissing
    private val prefix: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("middle_name")
    @ExcludeMissing
    private val middleName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("suffix")
    @ExcludeMissing
    private val suffix: JsonField<String> = JsonMissing.of(),
    @JsonProperty("preferred_name")
    @ExcludeMissing
    private val preferredName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("citizenship_country")
    @ExcludeMissing
    private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
    @JsonProperty("politically_exposed_person")
    @ExcludeMissing
    private val politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("date_of_birth")
    @ExcludeMissing
    private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("date_formed")
    @ExcludeMissing
    private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("business_name")
    @ExcludeMissing
    private val businessName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("doing_business_as_names")
    @ExcludeMissing
    private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("legal_structure")
    @ExcludeMissing
    private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    private val phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("website")
    @ExcludeMissing
    private val website: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("bank_settings")
    @ExcludeMissing
    private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
    @JsonProperty("wealth_and_employment_details")
    @ExcludeMissing
    private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
        JsonMissing.of(),
    @JsonProperty("addresses")
    @ExcludeMissing
    private val addresses: JsonField<List<LegalEntityAddress>> = JsonMissing.of(),
    @JsonProperty("identifications")
    @ExcludeMissing
    private val identifications: JsonField<List<Identification>> = JsonMissing.of(),
    @JsonProperty("legal_entity_associations")
    @ExcludeMissing
    private val legalEntityAssociations: JsonField<List<LegalEntityAssociation>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The type of legal entity. */
    fun legalEntityType(): LegalEntityType = legalEntityType.getRequired("legal_entity_type")

    /** The risk rating of the legal entity. One of low, medium, high. */
    fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

    /** An individual's prefix. */
    fun prefix(): String? = prefix.getNullable("prefix")

    /** An individual's first name. */
    fun firstName(): String? = firstName.getNullable("first_name")

    /** An individual's middle name. */
    fun middleName(): String? = middleName.getNullable("middle_name")

    /** An individual's last name. */
    fun lastName(): String? = lastName.getNullable("last_name")

    /** An individual's suffix. */
    fun suffix(): String? = suffix.getNullable("suffix")

    /** An individual's preferred name. */
    fun preferredName(): String? = preferredName.getNullable("preferred_name")

    /** The country of citizenship for an individual. */
    fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

    /** Whether the individual is a politically exposed person. */
    fun politicallyExposedPerson(): Boolean? =
        politicallyExposedPerson.getNullable("politically_exposed_person")

    /** An individual's date of birth (YYYY-MM-DD). */
    fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

    /** A business's formation date (YYYY-MM-DD). */
    fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

    /** The business's legal business name. */
    fun businessName(): String? = businessName.getNullable("business_name")

    fun doingBusinessAsNames(): List<String> =
        doingBusinessAsNames.getRequired("doing_business_as_names")

    /** The business's legal structure. */
    fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

    fun phoneNumbers(): List<PhoneNumber> = phoneNumbers.getRequired("phone_numbers")

    /** The entity's primary email. */
    fun email(): String? = email.getNullable("email")

    /** The entity's primary website URL. */
    fun website(): String? = website.getNullable("website")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

    fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
        wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

    /** A list of addresses for the entity. */
    fun addresses(): List<LegalEntityAddress> = addresses.getRequired("addresses")

    /** A list of identifications for the legal entity. */
    fun identifications(): List<Identification> = identifications.getRequired("identifications")

    /** The legal entity associations and its child legal entities. */
    fun legalEntityAssociations(): List<LegalEntityAssociation>? =
        legalEntityAssociations.getNullable("legal_entity_associations")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** The type of legal entity. */
    @JsonProperty("legal_entity_type") @ExcludeMissing fun _legalEntityType() = legalEntityType

    /** The risk rating of the legal entity. One of low, medium, high. */
    @JsonProperty("risk_rating") @ExcludeMissing fun _riskRating() = riskRating

    /** An individual's prefix. */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix() = prefix

    /** An individual's first name. */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    /** An individual's middle name. */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

    /** An individual's last name. */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    /** An individual's suffix. */
    @JsonProperty("suffix") @ExcludeMissing fun _suffix() = suffix

    /** An individual's preferred name. */
    @JsonProperty("preferred_name") @ExcludeMissing fun _preferredName() = preferredName

    /** The country of citizenship for an individual. */
    @JsonProperty("citizenship_country")
    @ExcludeMissing
    fun _citizenshipCountry() = citizenshipCountry

    /** Whether the individual is a politically exposed person. */
    @JsonProperty("politically_exposed_person")
    @ExcludeMissing
    fun _politicallyExposedPerson() = politicallyExposedPerson

    /** An individual's date of birth (YYYY-MM-DD). */
    @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

    /** A business's formation date (YYYY-MM-DD). */
    @JsonProperty("date_formed") @ExcludeMissing fun _dateFormed() = dateFormed

    /** The business's legal business name. */
    @JsonProperty("business_name") @ExcludeMissing fun _businessName() = businessName

    @JsonProperty("doing_business_as_names")
    @ExcludeMissing
    fun _doingBusinessAsNames() = doingBusinessAsNames

    /** The business's legal structure. */
    @JsonProperty("legal_structure") @ExcludeMissing fun _legalStructure() = legalStructure

    @JsonProperty("phone_numbers") @ExcludeMissing fun _phoneNumbers() = phoneNumbers

    /** The entity's primary email. */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** The entity's primary website URL. */
    @JsonProperty("website") @ExcludeMissing fun _website() = website

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("bank_settings") @ExcludeMissing fun _bankSettings() = bankSettings

    @JsonProperty("wealth_and_employment_details")
    @ExcludeMissing
    fun _wealthAndEmploymentDetails() = wealthAndEmploymentDetails

    /** A list of addresses for the entity. */
    @JsonProperty("addresses") @ExcludeMissing fun _addresses() = addresses

    /** A list of identifications for the legal entity. */
    @JsonProperty("identifications") @ExcludeMissing fun _identifications() = identifications

    /** The legal entity associations and its child legal entities. */
    @JsonProperty("legal_entity_associations")
    @ExcludeMissing
    fun _legalEntityAssociations() = legalEntityAssociations

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LegalEntity = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            legalEntityType()
            riskRating()
            prefix()
            firstName()
            middleName()
            lastName()
            suffix()
            preferredName()
            citizenshipCountry()
            politicallyExposedPerson()
            dateOfBirth()
            dateFormed()
            businessName()
            doingBusinessAsNames()
            legalStructure()
            phoneNumbers().forEach { it.validate() }
            email()
            website()
            metadata().validate()
            bankSettings()?.validate()
            wealthAndEmploymentDetails()?.validate()
            addresses().forEach { it.validate() }
            identifications().forEach { it.validate() }
            legalEntityAssociations()?.forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var legalEntityType: JsonField<LegalEntityType> = JsonMissing.of()
        private var riskRating: JsonField<RiskRating> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var suffix: JsonField<String> = JsonMissing.of()
        private var preferredName: JsonField<String> = JsonMissing.of()
        private var citizenshipCountry: JsonField<String> = JsonMissing.of()
        private var politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of()
        private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
        private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
        private var businessName: JsonField<String> = JsonMissing.of()
        private var doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of()
        private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
        private var phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
        private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
            JsonMissing.of()
        private var addresses: JsonField<List<LegalEntityAddress>> = JsonMissing.of()
        private var identifications: JsonField<List<Identification>> = JsonMissing.of()
        private var legalEntityAssociations: JsonField<List<LegalEntityAssociation>> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntity: LegalEntity) = apply {
            id = legalEntity.id
            object_ = legalEntity.object_
            liveMode = legalEntity.liveMode
            createdAt = legalEntity.createdAt
            updatedAt = legalEntity.updatedAt
            discardedAt = legalEntity.discardedAt
            legalEntityType = legalEntity.legalEntityType
            riskRating = legalEntity.riskRating
            prefix = legalEntity.prefix
            firstName = legalEntity.firstName
            middleName = legalEntity.middleName
            lastName = legalEntity.lastName
            suffix = legalEntity.suffix
            preferredName = legalEntity.preferredName
            citizenshipCountry = legalEntity.citizenshipCountry
            politicallyExposedPerson = legalEntity.politicallyExposedPerson
            dateOfBirth = legalEntity.dateOfBirth
            dateFormed = legalEntity.dateFormed
            businessName = legalEntity.businessName
            doingBusinessAsNames = legalEntity.doingBusinessAsNames
            legalStructure = legalEntity.legalStructure
            phoneNumbers = legalEntity.phoneNumbers
            email = legalEntity.email
            website = legalEntity.website
            metadata = legalEntity.metadata
            bankSettings = legalEntity.bankSettings
            wealthAndEmploymentDetails = legalEntity.wealthAndEmploymentDetails
            addresses = legalEntity.addresses
            identifications = legalEntity.identifications
            legalEntityAssociations = legalEntity.legalEntityAssociations
            additionalProperties = legalEntity.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: LegalEntityType) =
            legalEntityType(JsonField.of(legalEntityType))

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
            this.legalEntityType = legalEntityType
        }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating) = riskRating(JsonField.of(riskRating))

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { this.riskRating = riskRating }

        /** An individual's prefix. */
        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

        /** An individual's prefix. */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

        /** An individual's first name. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** An individual's first name. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** An individual's middle name. */
        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /** An individual's middle name. */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        /** An individual's last name. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** An individual's last name. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** An individual's suffix. */
        fun suffix(suffix: String) = suffix(JsonField.of(suffix))

        /** An individual's suffix. */
        fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String) = preferredName(JsonField.of(preferredName))

        /** An individual's preferred name. */
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String) =
            citizenshipCountry(JsonField.of(citizenshipCountry))

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
            this.citizenshipCountry = citizenshipCountry
        }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
            politicallyExposedPerson(JsonField.of(politicallyExposedPerson))

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
            this.politicallyExposedPerson = politicallyExposedPerson
        }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
            this.dateOfBirth = dateOfBirth
        }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate) = dateFormed(JsonField.of(dateFormed))

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: JsonField<LocalDate>) = apply { this.dateFormed = dateFormed }

        /** The business's legal business name. */
        fun businessName(businessName: String) = businessName(JsonField.of(businessName))

        /** The business's legal business name. */
        fun businessName(businessName: JsonField<String>) = apply {
            this.businessName = businessName
        }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
            doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

        fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
            this.doingBusinessAsNames = doingBusinessAsNames
        }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure) =
            legalStructure(JsonField.of(legalStructure))

        /** The business's legal structure. */
        fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
            this.legalStructure = legalStructure
        }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers
        }

        /** The entity's primary email. */
        fun email(email: String) = email(JsonField.of(email))

        /** The entity's primary email. */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The entity's primary website URL. */
        fun website(website: String) = website(JsonField.of(website))

        /** The entity's primary website URL. */
        fun website(website: JsonField<String>) = apply { this.website = website }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun bankSettings(bankSettings: BankSettings) = bankSettings(JsonField.of(bankSettings))

        fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
            this.bankSettings = bankSettings
        }

        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails) =
            wealthAndEmploymentDetails(JsonField.of(wealthAndEmploymentDetails))

        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
        ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddress>) = addresses(JsonField.of(addresses))

        /** A list of addresses for the entity. */
        fun addresses(addresses: JsonField<List<LegalEntityAddress>>) = apply {
            this.addresses = addresses
        }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<Identification>) =
            identifications(JsonField.of(identifications))

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: JsonField<List<Identification>>) = apply {
            this.identifications = identifications
        }

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(legalEntityAssociations: List<LegalEntityAssociation>) =
            legalEntityAssociations(JsonField.of(legalEntityAssociations))

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(
            legalEntityAssociations: JsonField<List<LegalEntityAssociation>>
        ) = apply { this.legalEntityAssociations = legalEntityAssociations }

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

        fun build(): LegalEntity =
            LegalEntity(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                legalEntityType,
                riskRating,
                prefix,
                firstName,
                middleName,
                lastName,
                suffix,
                preferredName,
                citizenshipCountry,
                politicallyExposedPerson,
                dateOfBirth,
                dateFormed,
                businessName,
                doingBusinessAsNames.map { it.toImmutable() },
                legalStructure,
                phoneNumbers.map { it.toImmutable() },
                email,
                website,
                metadata,
                bankSettings,
                wealthAndEmploymentDetails,
                addresses.map { it.toImmutable() },
                identifications.map { it.toImmutable() },
                legalEntityAssociations.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class LegalEntityAddress
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("address_types")
        @ExcludeMissing
        private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** The types of this address. */
        fun addressTypes(): List<AddressType> = addressTypes.getRequired("address_types")

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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        /** The types of this address. */
        @JsonProperty("address_types") @ExcludeMissing fun _addressTypes() = addressTypes

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

        private var validated: Boolean = false

        fun validate(): LegalEntityAddress = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                addressTypes()
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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var addressTypes: JsonField<List<AddressType>> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityAddress: LegalEntityAddress) = apply {
                id = legalEntityAddress.id
                object_ = legalEntityAddress.object_
                liveMode = legalEntityAddress.liveMode
                createdAt = legalEntityAddress.createdAt
                updatedAt = legalEntityAddress.updatedAt
                discardedAt = legalEntityAddress.discardedAt
                addressTypes = legalEntityAddress.addressTypes
                line1 = legalEntityAddress.line1
                line2 = legalEntityAddress.line2
                locality = legalEntityAddress.locality
                region = legalEntityAddress.region
                postalCode = legalEntityAddress.postalCode
                country = legalEntityAddress.country
                additionalProperties = legalEntityAddress.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /** The types of this address. */
            fun addressTypes(addressTypes: List<AddressType>) =
                addressTypes(JsonField.of(addressTypes))

            /** The types of this address. */
            fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
                this.addressTypes = addressTypes
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            fun build(): LegalEntityAddress =
                LegalEntityAddress(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    addressTypes.map { it.toImmutable() },
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

            return /* spotless:off */ other is LegalEntityAddress && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && addressTypes == other.addressTypes && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, addressTypes, line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityAddress{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Identification
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id_type")
        @ExcludeMissing
        private val idType: JsonField<IdType> = JsonMissing.of(),
        @JsonProperty("issuing_country")
        @ExcludeMissing
        private val issuingCountry: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** The type of ID number. */
        fun idType(): IdType = idType.getRequired("id_type")

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        /** The type of ID number. */
        @JsonProperty("id_type") @ExcludeMissing fun _idType() = idType

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        @JsonProperty("issuing_country") @ExcludeMissing fun _issuingCountry() = issuingCountry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Identification = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                idType()
                issuingCountry()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var idType: JsonField<IdType> = JsonMissing.of()
            private var issuingCountry: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identification: Identification) = apply {
                id = identification.id
                object_ = identification.object_
                liveMode = identification.liveMode
                createdAt = identification.createdAt
                updatedAt = identification.updatedAt
                discardedAt = identification.discardedAt
                idType = identification.idType
                issuingCountry = identification.issuingCountry
                additionalProperties = identification.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /** The type of ID number. */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /** The type of ID number. */
            fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String) =
                issuingCountry(JsonField.of(issuingCountry))

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: JsonField<String>) = apply {
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

            fun build(): Identification =
                Identification(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    idType,
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

            return /* spotless:off */ other is Identification && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, idType, issuingCountry, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Identification{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
    }

    class LegalEntityType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BUSINESS = of("business")

            val INDIVIDUAL = of("individual")

            val JOINT = of("joint")

            fun of(value: String) = LegalEntityType(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
            JOINT,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            JOINT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                JOINT -> Value.JOINT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                JOINT -> Known.JOINT
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (!validated) {
                phoneNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

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

        return /* spotless:off */ other is LegalEntity && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && legalEntityType == other.legalEntityType && riskRating == other.riskRating && prefix == other.prefix && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && suffix == other.suffix && preferredName == other.preferredName && citizenshipCountry == other.citizenshipCountry && politicallyExposedPerson == other.politicallyExposedPerson && dateOfBirth == other.dateOfBirth && dateFormed == other.dateFormed && businessName == other.businessName && doingBusinessAsNames == other.doingBusinessAsNames && legalStructure == other.legalStructure && phoneNumbers == other.phoneNumbers && email == other.email && website == other.website && metadata == other.metadata && bankSettings == other.bankSettings && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && addresses == other.addresses && identifications == other.identifications && legalEntityAssociations == other.legalEntityAssociations && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, legalEntityType, riskRating, prefix, firstName, middleName, lastName, suffix, preferredName, citizenshipCountry, politicallyExposedPerson, dateOfBirth, dateFormed, businessName, doingBusinessAsNames, legalStructure, phoneNumbers, email, website, metadata, bankSettings, wealthAndEmploymentDetails, addresses, identifications, legalEntityAssociations, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntity{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, legalEntityType=$legalEntityType, riskRating=$riskRating, prefix=$prefix, firstName=$firstName, middleName=$middleName, lastName=$lastName, suffix=$suffix, preferredName=$preferredName, citizenshipCountry=$citizenshipCountry, politicallyExposedPerson=$politicallyExposedPerson, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, bankSettings=$bankSettings, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, addresses=$addresses, identifications=$identifications, legalEntityAssociations=$legalEntityAssociations, additionalProperties=$additionalProperties}"
}
