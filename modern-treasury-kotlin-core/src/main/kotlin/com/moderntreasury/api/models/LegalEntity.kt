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
import com.moderntreasury.api.core.checkRequired
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
    @JsonProperty("addresses")
    @ExcludeMissing
    private val addresses: JsonField<List<LegalEntityAddress>> = JsonMissing.of(),
    @JsonProperty("bank_settings")
    @ExcludeMissing
    private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
    @JsonProperty("business_name")
    @ExcludeMissing
    private val businessName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("citizenship_country")
    @ExcludeMissing
    private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date_formed")
    @ExcludeMissing
    private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("date_of_birth")
    @ExcludeMissing
    private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("doing_business_as_names")
    @ExcludeMissing
    private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("identifications")
    @ExcludeMissing
    private val identifications: JsonField<List<Identification>> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legal_entity_associations")
    @ExcludeMissing
    private val legalEntityAssociations: JsonField<List<LegalEntityAssociation>> = JsonMissing.of(),
    @JsonProperty("legal_entity_type")
    @ExcludeMissing
    private val legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
    @JsonProperty("legal_structure")
    @ExcludeMissing
    private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("middle_name")
    @ExcludeMissing
    private val middleName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    private val phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
    @JsonProperty("politically_exposed_person")
    @ExcludeMissing
    private val politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("preferred_name")
    @ExcludeMissing
    private val preferredName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prefix")
    @ExcludeMissing
    private val prefix: JsonField<String> = JsonMissing.of(),
    @JsonProperty("risk_rating")
    @ExcludeMissing
    private val riskRating: JsonField<RiskRating> = JsonMissing.of(),
    @JsonProperty("suffix")
    @ExcludeMissing
    private val suffix: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("wealth_and_employment_details")
    @ExcludeMissing
    private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
        JsonMissing.of(),
    @JsonProperty("website")
    @ExcludeMissing
    private val website: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** A list of addresses for the entity. */
    fun addresses(): List<LegalEntityAddress> = addresses.getRequired("addresses")

    fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

    /** The business's legal business name. */
    fun businessName(): String? = businessName.getNullable("business_name")

    /** The country of citizenship for an individual. */
    fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A business's formation date (YYYY-MM-DD). */
    fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

    /** An individual's date of birth (YYYY-MM-DD). */
    fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    fun doingBusinessAsNames(): List<String> =
        doingBusinessAsNames.getRequired("doing_business_as_names")

    /** The entity's primary email. */
    fun email(): String? = email.getNullable("email")

    /** An individual's first name. */
    fun firstName(): String? = firstName.getNullable("first_name")

    /** A list of identifications for the legal entity. */
    fun identifications(): List<Identification> = identifications.getRequired("identifications")

    /** An individual's last name. */
    fun lastName(): String? = lastName.getNullable("last_name")

    /** The legal entity associations and its child legal entities. */
    fun legalEntityAssociations(): List<LegalEntityAssociation>? =
        legalEntityAssociations.getNullable("legal_entity_associations")

    /** The type of legal entity. */
    fun legalEntityType(): LegalEntityType = legalEntityType.getRequired("legal_entity_type")

    /** The business's legal structure. */
    fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** An individual's middle name. */
    fun middleName(): String? = middleName.getNullable("middle_name")

    fun object_(): String = object_.getRequired("object")

    fun phoneNumbers(): List<PhoneNumber> = phoneNumbers.getRequired("phone_numbers")

    /** Whether the individual is a politically exposed person. */
    fun politicallyExposedPerson(): Boolean? =
        politicallyExposedPerson.getNullable("politically_exposed_person")

    /** An individual's preferred name. */
    fun preferredName(): String? = preferredName.getNullable("preferred_name")

    /** An individual's prefix. */
    fun prefix(): String? = prefix.getNullable("prefix")

    /** The risk rating of the legal entity. One of low, medium, high. */
    fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

    /** An individual's suffix. */
    fun suffix(): String? = suffix.getNullable("suffix")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
        wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

    /** The entity's primary website URL. */
    fun website(): String? = website.getNullable("website")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** A list of addresses for the entity. */
    @JsonProperty("addresses")
    @ExcludeMissing
    fun _addresses(): JsonField<List<LegalEntityAddress>> = addresses

    @JsonProperty("bank_settings")
    @ExcludeMissing
    fun _bankSettings(): JsonField<BankSettings> = bankSettings

    /** The business's legal business name. */
    @JsonProperty("business_name")
    @ExcludeMissing
    fun _businessName(): JsonField<String> = businessName

    /** The country of citizenship for an individual. */
    @JsonProperty("citizenship_country")
    @ExcludeMissing
    fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** A business's formation date (YYYY-MM-DD). */
    @JsonProperty("date_formed")
    @ExcludeMissing
    fun _dateFormed(): JsonField<LocalDate> = dateFormed

    /** An individual's date of birth (YYYY-MM-DD). */
    @JsonProperty("date_of_birth")
    @ExcludeMissing
    fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    @JsonProperty("doing_business_as_names")
    @ExcludeMissing
    fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

    /** The entity's primary email. */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** An individual's first name. */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /** A list of identifications for the legal entity. */
    @JsonProperty("identifications")
    @ExcludeMissing
    fun _identifications(): JsonField<List<Identification>> = identifications

    /** An individual's last name. */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /** The legal entity associations and its child legal entities. */
    @JsonProperty("legal_entity_associations")
    @ExcludeMissing
    fun _legalEntityAssociations(): JsonField<List<LegalEntityAssociation>> =
        legalEntityAssociations

    /** The type of legal entity. */
    @JsonProperty("legal_entity_type")
    @ExcludeMissing
    fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

    /** The business's legal structure. */
    @JsonProperty("legal_structure")
    @ExcludeMissing
    fun _legalStructure(): JsonField<LegalStructure> = legalStructure

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** An individual's middle name. */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

    /** Whether the individual is a politically exposed person. */
    @JsonProperty("politically_exposed_person")
    @ExcludeMissing
    fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

    /** An individual's preferred name. */
    @JsonProperty("preferred_name")
    @ExcludeMissing
    fun _preferredName(): JsonField<String> = preferredName

    /** An individual's prefix. */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    /** The risk rating of the legal entity. One of low, medium, high. */
    @JsonProperty("risk_rating")
    @ExcludeMissing
    fun _riskRating(): JsonField<RiskRating> = riskRating

    /** An individual's suffix. */
    @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonProperty("wealth_and_employment_details")
    @ExcludeMissing
    fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
        wealthAndEmploymentDetails

    /** The entity's primary website URL. */
    @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LegalEntity = apply {
        if (validated) {
            return@apply
        }

        id()
        addresses().forEach { it.validate() }
        bankSettings()?.validate()
        businessName()
        citizenshipCountry()
        createdAt()
        dateFormed()
        dateOfBirth()
        discardedAt()
        doingBusinessAsNames()
        email()
        firstName()
        identifications().forEach { it.validate() }
        lastName()
        legalEntityAssociations()?.forEach { it.validate() }
        legalEntityType()
        legalStructure()
        liveMode()
        metadata().validate()
        middleName()
        object_()
        phoneNumbers().forEach { it.validate() }
        politicallyExposedPerson()
        preferredName()
        prefix()
        riskRating()
        suffix()
        updatedAt()
        wealthAndEmploymentDetails()?.validate()
        website()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LegalEntity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addresses: JsonField<MutableList<LegalEntityAddress>>? = null
        private var bankSettings: JsonField<BankSettings>? = null
        private var businessName: JsonField<String>? = null
        private var citizenshipCountry: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dateFormed: JsonField<LocalDate>? = null
        private var dateOfBirth: JsonField<LocalDate>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var identifications: JsonField<MutableList<Identification>>? = null
        private var lastName: JsonField<String>? = null
        private var legalEntityAssociations: JsonField<MutableList<LegalEntityAssociation>>? = null
        private var legalEntityType: JsonField<LegalEntityType>? = null
        private var legalStructure: JsonField<LegalStructure>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var middleName: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var politicallyExposedPerson: JsonField<Boolean>? = null
        private var preferredName: JsonField<String>? = null
        private var prefix: JsonField<String>? = null
        private var riskRating: JsonField<RiskRating>? = null
        private var suffix: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>? = null
        private var website: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntity: LegalEntity) = apply {
            id = legalEntity.id
            addresses = legalEntity.addresses.map { it.toMutableList() }
            bankSettings = legalEntity.bankSettings
            businessName = legalEntity.businessName
            citizenshipCountry = legalEntity.citizenshipCountry
            createdAt = legalEntity.createdAt
            dateFormed = legalEntity.dateFormed
            dateOfBirth = legalEntity.dateOfBirth
            discardedAt = legalEntity.discardedAt
            doingBusinessAsNames = legalEntity.doingBusinessAsNames.map { it.toMutableList() }
            email = legalEntity.email
            firstName = legalEntity.firstName
            identifications = legalEntity.identifications.map { it.toMutableList() }
            lastName = legalEntity.lastName
            legalEntityAssociations = legalEntity.legalEntityAssociations.map { it.toMutableList() }
            legalEntityType = legalEntity.legalEntityType
            legalStructure = legalEntity.legalStructure
            liveMode = legalEntity.liveMode
            metadata = legalEntity.metadata
            middleName = legalEntity.middleName
            object_ = legalEntity.object_
            phoneNumbers = legalEntity.phoneNumbers.map { it.toMutableList() }
            politicallyExposedPerson = legalEntity.politicallyExposedPerson
            preferredName = legalEntity.preferredName
            prefix = legalEntity.prefix
            riskRating = legalEntity.riskRating
            suffix = legalEntity.suffix
            updatedAt = legalEntity.updatedAt
            wealthAndEmploymentDetails = legalEntity.wealthAndEmploymentDetails
            website = legalEntity.website
            additionalProperties = legalEntity.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddress>) = addresses(JsonField.of(addresses))

        /** A list of addresses for the entity. */
        fun addresses(addresses: JsonField<List<LegalEntityAddress>>) = apply {
            this.addresses = addresses.map { it.toMutableList() }
        }

        /** A list of addresses for the entity. */
        fun addAddress(address: LegalEntityAddress) = apply {
            addresses =
                (addresses ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(address)
                }
        }

        fun bankSettings(bankSettings: BankSettings?) =
            bankSettings(JsonField.ofNullable(bankSettings))

        fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
            this.bankSettings = bankSettings
        }

        /** The business's legal business name. */
        fun businessName(businessName: String?) = businessName(JsonField.ofNullable(businessName))

        /** The business's legal business name. */
        fun businessName(businessName: JsonField<String>) = apply {
            this.businessName = businessName
        }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String?) =
            citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
            this.citizenshipCountry = citizenshipCountry
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: JsonField<LocalDate>) = apply { this.dateFormed = dateFormed }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate?) = dateOfBirth(JsonField.ofNullable(dateOfBirth))

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
            this.dateOfBirth = dateOfBirth
        }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
            doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

        fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
            this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
        }

        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            doingBusinessAsNames =
                (doingBusinessAsNames ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(doingBusinessAsName)
                }
        }

        /** The entity's primary email. */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** The entity's primary email. */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** An individual's first name. */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** An individual's first name. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<Identification>) =
            identifications(JsonField.of(identifications))

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: JsonField<List<Identification>>) = apply {
            this.identifications = identifications.map { it.toMutableList() }
        }

        /** A list of identifications for the legal entity. */
        fun addIdentification(identification: Identification) = apply {
            identifications =
                (identifications ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(identification)
                }
        }

        /** An individual's last name. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** An individual's last name. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(legalEntityAssociations: List<LegalEntityAssociation>?) =
            legalEntityAssociations(JsonField.ofNullable(legalEntityAssociations))

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(
            legalEntityAssociations: JsonField<List<LegalEntityAssociation>>
        ) = apply {
            this.legalEntityAssociations = legalEntityAssociations.map { it.toMutableList() }
        }

        /** The legal entity associations and its child legal entities. */
        fun addLegalEntityAssociation(legalEntityAssociation: LegalEntityAssociation) = apply {
            legalEntityAssociations =
                (legalEntityAssociations ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(legalEntityAssociation)
                }
        }

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: LegalEntityType) =
            legalEntityType(JsonField.of(legalEntityType))

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
            this.legalEntityType = legalEntityType
        }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure?) =
            legalStructure(JsonField.ofNullable(legalStructure))

        /** The business's legal structure. */
        fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
            this.legalStructure = legalStructure
        }

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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** An individual's middle name. */
        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /** An individual's middle name. */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(phoneNumber)
                }
        }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
            politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
            politicallyExposedPerson(politicallyExposedPerson as Boolean?)

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
            this.politicallyExposedPerson = politicallyExposedPerson
        }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String?) =
            preferredName(JsonField.ofNullable(preferredName))

        /** An individual's preferred name. */
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        /** An individual's prefix. */
        fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

        /** An individual's prefix. */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { this.riskRating = riskRating }

        /** An individual's suffix. */
        fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

        /** An individual's suffix. */
        fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails?) =
            wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
        ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

        /** The entity's primary website URL. */
        fun website(website: String?) = website(JsonField.ofNullable(website))

        /** The entity's primary website URL. */
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

        fun build(): LegalEntity =
            LegalEntity(
                checkRequired("id", id),
                checkRequired("addresses", addresses).map { it.toImmutable() },
                checkRequired("bankSettings", bankSettings),
                checkRequired("businessName", businessName),
                checkRequired("citizenshipCountry", citizenshipCountry),
                checkRequired("createdAt", createdAt),
                checkRequired("dateFormed", dateFormed),
                checkRequired("dateOfBirth", dateOfBirth),
                checkRequired("discardedAt", discardedAt),
                checkRequired("doingBusinessAsNames", doingBusinessAsNames).map {
                    it.toImmutable()
                },
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("identifications", identifications).map { it.toImmutable() },
                checkRequired("lastName", lastName),
                checkRequired("legalEntityAssociations", legalEntityAssociations).map {
                    it.toImmutable()
                },
                checkRequired("legalEntityType", legalEntityType),
                checkRequired("legalStructure", legalStructure),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("middleName", middleName),
                checkRequired("object_", object_),
                checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                checkRequired("politicallyExposedPerson", politicallyExposedPerson),
                checkRequired("preferredName", preferredName),
                checkRequired("prefix", prefix),
                checkRequired("riskRating", riskRating),
                checkRequired("suffix", suffix),
                checkRequired("updatedAt", updatedAt),
                checkRequired("wealthAndEmploymentDetails", wealthAndEmploymentDetails),
                checkRequired("website", website),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class LegalEntityAddress
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address_types")
        @ExcludeMissing
        private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The types of this address. */
        fun addressTypes(): List<AddressType> = addressTypes.getRequired("address_types")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        fun object_(): String = object_.getRequired("object")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The types of this address. */
        @JsonProperty("address_types")
        @ExcludeMissing
        fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LegalEntityAddress = apply {
            if (validated) {
                return@apply
            }

            id()
            addressTypes()
            country()
            createdAt()
            discardedAt()
            line1()
            line2()
            liveMode()
            locality()
            object_()
            postalCode()
            region()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
            private var region: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityAddress: LegalEntityAddress) = apply {
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
                region = legalEntityAddress.region
                updatedAt = legalEntityAddress.updatedAt
                additionalProperties = legalEntityAddress.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The types of this address. */
            fun addressTypes(addressTypes: List<AddressType>) =
                addressTypes(JsonField.of(addressTypes))

            /** The types of this address. */
            fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
                this.addressTypes = addressTypes.map { it.toMutableList() }
            }

            /** The types of this address. */
            fun addAddressType(addressType: AddressType) = apply {
                addressTypes =
                    (addressTypes ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(addressType)
                    }
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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

            fun build(): LegalEntityAddress =
                LegalEntityAddress(
                    checkRequired("id", id),
                    checkRequired("addressTypes", addressTypes).map { it.toImmutable() },
                    checkRequired("country", country),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("liveMode", liveMode),
                    checkRequired("locality", locality),
                    checkRequired("object_", object_),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        class AddressType @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
                /**
                 * An enum member indicating that [AddressType] was instantiated with an unknown
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

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

            return /* spotless:off */ other is LegalEntityAddress && id == other.id && addressTypes == other.addressTypes && country == other.country && createdAt == other.createdAt && discardedAt == other.discardedAt && line1 == other.line1 && line2 == other.line2 && liveMode == other.liveMode && locality == other.locality && object_ == other.object_ && postalCode == other.postalCode && region == other.region && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, addressTypes, country, createdAt, discardedAt, line1, line2, liveMode, locality, object_, postalCode, region, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityAddress{id=$id, addressTypes=$addressTypes, country=$country, createdAt=$createdAt, discardedAt=$discardedAt, line1=$line1, line2=$line2, liveMode=$liveMode, locality=$locality, object_=$object_, postalCode=$postalCode, region=$region, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Identification
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id_type")
        @ExcludeMissing
        private val idType: JsonField<IdType> = JsonMissing.of(),
        @JsonProperty("issuing_country")
        @ExcludeMissing
        private val issuingCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** The type of ID number. */
        fun idType(): IdType = idType.getRequired("id_type")

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /** The type of ID number. */
        @JsonProperty("id_type") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        @JsonProperty("issuing_country")
        @ExcludeMissing
        fun _issuingCountry(): JsonField<String> = issuingCountry

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Identification = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            discardedAt()
            idType()
            issuingCountry()
            liveMode()
            object_()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Identification]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var idType: JsonField<IdType>? = null
            private var issuingCountry: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identification: Identification) = apply {
                id = identification.id
                createdAt = identification.createdAt
                discardedAt = identification.discardedAt
                idType = identification.idType
                issuingCountry = identification.issuingCountry
                liveMode = identification.liveMode
                object_ = identification.object_
                updatedAt = identification.updatedAt
                additionalProperties = identification.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /** The type of ID number. */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /** The type of ID number. */
            fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String?) =
                issuingCountry(JsonField.ofNullable(issuingCountry))

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                this.issuingCountry = issuingCountry
            }

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

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("idType", idType),
                    checkRequired("issuingCountry", issuingCountry),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of ID number. */
        class IdType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** An enum containing [IdType]'s known values. */
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

            /**
             * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IdType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [IdType] was instantiated with an unknown value.
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

            return /* spotless:off */ other is Identification && id == other.id && createdAt == other.createdAt && discardedAt == other.discardedAt && idType == other.idType && issuingCountry == other.issuingCountry && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, discardedAt, idType, issuingCountry, liveMode, object_, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Identification{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, idType=$idType, issuingCountry=$issuingCountry, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
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

            val JOINT = of("joint")

            fun of(value: String) = LegalEntityType(JsonField.of(value))
        }

        /** An enum containing [LegalEntityType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
            JOINT,
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
            JOINT,
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
                JOINT -> Value.JOINT
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
                JOINT -> Known.JOINT
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

        return /* spotless:off */ other is LegalEntity && id == other.id && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && createdAt == other.createdAt && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && discardedAt == other.discardedAt && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && liveMode == other.liveMode && metadata == other.metadata && middleName == other.middleName && object_ == other.object_ && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && updatedAt == other.updatedAt && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, addresses, bankSettings, businessName, citizenshipCountry, createdAt, dateFormed, dateOfBirth, discardedAt, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalEntityType, legalStructure, liveMode, metadata, middleName, object_, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, updatedAt, wealthAndEmploymentDetails, website, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntity{id=$id, addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, createdAt=$createdAt, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, discardedAt=$discardedAt, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalEntityType=$legalEntityType, legalStructure=$legalStructure, liveMode=$liveMode, metadata=$metadata, middleName=$middleName, object_=$object_, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, updatedAt=$updatedAt, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
}
