// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LegalEntityAssociation.Builder::class)
@NoAutoDetect
class LegalEntityAssociation
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val associatorLegalEntityId: JsonField<String>,
    private val relationshipTypes: JsonField<List<RelationshipType>>,
    private val title: JsonField<String>,
    private val ownershipPercentage: JsonField<Long>,
    private val associatedLegalEntity: JsonField<AssociatedLegalEntity>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String? = id.getNullable("id")

    fun object_(): String? = object_.getNullable("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The ID of the associator legal entity. This must be a business or joint legal entity. */
    fun associatorLegalEntityId(): String? =
        associatorLegalEntityId.getNullable("associator_legal_entity_id")

    fun relationshipTypes(): List<RelationshipType>? =
        relationshipTypes.getNullable("relationship_types")

    /** The job title of the associated entity at the associator entity. */
    fun title(): String? = title.getNullable("title")

    /** The associated entity's ownership percentage iff they are a beneficial owner. */
    fun ownershipPercentage(): Long? = ownershipPercentage.getNullable("ownership_percentage")

    /** The associated legal entity. */
    fun associatedLegalEntity(): AssociatedLegalEntity? =
        associatedLegalEntity.getNullable("associated_legal_entity")

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

    /** The ID of the associator legal entity. This must be a business or joint legal entity. */
    @JsonProperty("associator_legal_entity_id")
    @ExcludeMissing
    fun _associatorLegalEntityId() = associatorLegalEntityId

    @JsonProperty("relationship_types") @ExcludeMissing fun _relationshipTypes() = relationshipTypes

    /** The job title of the associated entity at the associator entity. */
    @JsonProperty("title") @ExcludeMissing fun _title() = title

    /** The associated entity's ownership percentage iff they are a beneficial owner. */
    @JsonProperty("ownership_percentage")
    @ExcludeMissing
    fun _ownershipPercentage() = ownershipPercentage

    /** The associated legal entity. */
    @JsonProperty("associated_legal_entity")
    @ExcludeMissing
    fun _associatedLegalEntity() = associatedLegalEntity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LegalEntityAssociation = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            associatorLegalEntityId()
            relationshipTypes()
            title()
            ownershipPercentage()
            associatedLegalEntity()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityAssociation &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.associatorLegalEntityId == other.associatorLegalEntityId &&
            this.relationshipTypes == other.relationshipTypes &&
            this.title == other.title &&
            this.ownershipPercentage == other.ownershipPercentage &&
            this.associatedLegalEntity == other.associatedLegalEntity &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    associatorLegalEntityId,
                    relationshipTypes,
                    title,
                    ownershipPercentage,
                    associatedLegalEntity,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LegalEntityAssociation{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, associatorLegalEntityId=$associatorLegalEntityId, relationshipTypes=$relationshipTypes, title=$title, ownershipPercentage=$ownershipPercentage, associatedLegalEntity=$associatedLegalEntity, additionalProperties=$additionalProperties}"

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
        private var associatorLegalEntityId: JsonField<String> = JsonMissing.of()
        private var relationshipTypes: JsonField<List<RelationshipType>> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
        private var associatedLegalEntity: JsonField<AssociatedLegalEntity> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityAssociation: LegalEntityAssociation) = apply {
            this.id = legalEntityAssociation.id
            this.object_ = legalEntityAssociation.object_
            this.liveMode = legalEntityAssociation.liveMode
            this.createdAt = legalEntityAssociation.createdAt
            this.updatedAt = legalEntityAssociation.updatedAt
            this.discardedAt = legalEntityAssociation.discardedAt
            this.associatorLegalEntityId = legalEntityAssociation.associatorLegalEntityId
            this.relationshipTypes = legalEntityAssociation.relationshipTypes
            this.title = legalEntityAssociation.title
            this.ownershipPercentage = legalEntityAssociation.ownershipPercentage
            this.associatedLegalEntity = legalEntityAssociation.associatedLegalEntity
            additionalProperties(legalEntityAssociation.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
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
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The ID of the associator legal entity. This must be a business or joint legal entity. */
        fun associatorLegalEntityId(associatorLegalEntityId: String) =
            associatorLegalEntityId(JsonField.of(associatorLegalEntityId))

        /** The ID of the associator legal entity. This must be a business or joint legal entity. */
        @JsonProperty("associator_legal_entity_id")
        @ExcludeMissing
        fun associatorLegalEntityId(associatorLegalEntityId: JsonField<String>) = apply {
            this.associatorLegalEntityId = associatorLegalEntityId
        }

        fun relationshipTypes(relationshipTypes: List<RelationshipType>) =
            relationshipTypes(JsonField.of(relationshipTypes))

        @JsonProperty("relationship_types")
        @ExcludeMissing
        fun relationshipTypes(relationshipTypes: JsonField<List<RelationshipType>>) = apply {
            this.relationshipTypes = relationshipTypes
        }

        /** The job title of the associated entity at the associator entity. */
        fun title(title: String) = title(JsonField.of(title))

        /** The job title of the associated entity at the associator entity. */
        @JsonProperty("title")
        @ExcludeMissing
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** The associated entity's ownership percentage iff they are a beneficial owner. */
        fun ownershipPercentage(ownershipPercentage: Long) =
            ownershipPercentage(JsonField.of(ownershipPercentage))

        /** The associated entity's ownership percentage iff they are a beneficial owner. */
        @JsonProperty("ownership_percentage")
        @ExcludeMissing
        fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
            this.ownershipPercentage = ownershipPercentage
        }

        /** The associated legal entity. */
        fun associatedLegalEntity(associatedLegalEntity: AssociatedLegalEntity) =
            associatedLegalEntity(JsonField.of(associatedLegalEntity))

        /** The associated legal entity. */
        @JsonProperty("associated_legal_entity")
        @ExcludeMissing
        fun associatedLegalEntity(associatedLegalEntity: JsonField<AssociatedLegalEntity>) = apply {
            this.associatedLegalEntity = associatedLegalEntity
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

        fun build(): LegalEntityAssociation =
            LegalEntityAssociation(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                associatorLegalEntityId,
                relationshipTypes.map { it.toUnmodifiable() },
                title,
                ownershipPercentage,
                associatedLegalEntity,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The associated legal entity. */
    @JsonDeserialize(builder = AssociatedLegalEntity.Builder::class)
    @NoAutoDetect
    class AssociatedLegalEntity
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val legalEntityType: JsonField<LegalEntityType>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val dateFormed: JsonField<LocalDate>,
        private val businessName: JsonField<String>,
        private val doingBusinessAsNames: JsonField<List<String>>,
        private val legalStructure: JsonField<LegalStructure>,
        private val phoneNumbers: JsonField<List<PhoneNumber>>,
        private val email: JsonField<String>,
        private val website: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val addresses: JsonField<List<LegalEntityAddress>>,
        private val identifications: JsonField<List<Identification>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String? = id.getNullable("id")

        fun object_(): String? = object_.getNullable("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** The type of legal entity. */
        fun legalEntityType(): LegalEntityType? = legalEntityType.getNullable("legal_entity_type")

        /** An individual's first name. */
        fun firstName(): String? = firstName.getNullable("first_name")

        /** An individual's last name. */
        fun lastName(): String? = lastName.getNullable("last_name")

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

        /** The business's legal business name. */
        fun businessName(): String? = businessName.getNullable("business_name")

        fun doingBusinessAsNames(): List<String>? =
            doingBusinessAsNames.getNullable("doing_business_as_names")

        /** The business's legal structure. */
        fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

        fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

        /** The entity's primary email. */
        fun email(): String? = email.getNullable("email")

        /** The entity's primary website URL. */
        fun website(): String? = website.getNullable("website")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** A list of addresses for the entity. */
        fun addresses(): List<LegalEntityAddress>? = addresses.getNullable("addresses")

        /** A list of identifications for the legal entity. */
        fun identifications(): List<Identification>? =
            identifications.getNullable("identifications")

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

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type") @ExcludeMissing fun _legalEntityType() = legalEntityType

        /** An individual's first name. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

        /** An individual's last name. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        /** A list of addresses for the entity. */
        @JsonProperty("addresses") @ExcludeMissing fun _addresses() = addresses

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications") @ExcludeMissing fun _identifications() = identifications

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AssociatedLegalEntity = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                legalEntityType()
                firstName()
                lastName()
                dateOfBirth()
                dateFormed()
                businessName()
                doingBusinessAsNames()
                legalStructure()
                phoneNumbers()?.forEach { it.validate() }
                email()
                website()
                metadata()?.validate()
                addresses()?.forEach { it.validate() }
                identifications()?.forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AssociatedLegalEntity &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.updatedAt == other.updatedAt &&
                this.discardedAt == other.discardedAt &&
                this.legalEntityType == other.legalEntityType &&
                this.firstName == other.firstName &&
                this.lastName == other.lastName &&
                this.dateOfBirth == other.dateOfBirth &&
                this.dateFormed == other.dateFormed &&
                this.businessName == other.businessName &&
                this.doingBusinessAsNames == other.doingBusinessAsNames &&
                this.legalStructure == other.legalStructure &&
                this.phoneNumbers == other.phoneNumbers &&
                this.email == other.email &&
                this.website == other.website &&
                this.metadata == other.metadata &&
                this.addresses == other.addresses &&
                this.identifications == other.identifications &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        discardedAt,
                        legalEntityType,
                        firstName,
                        lastName,
                        dateOfBirth,
                        dateFormed,
                        businessName,
                        doingBusinessAsNames,
                        legalStructure,
                        phoneNumbers,
                        email,
                        website,
                        metadata,
                        addresses,
                        identifications,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AssociatedLegalEntity{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, legalEntityType=$legalEntityType, firstName=$firstName, lastName=$lastName, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, addresses=$addresses, identifications=$identifications, additionalProperties=$additionalProperties}"

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
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of()
            private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
            private var phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var addresses: JsonField<List<LegalEntityAddress>> = JsonMissing.of()
            private var identifications: JsonField<List<Identification>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(associatedLegalEntity: AssociatedLegalEntity) = apply {
                this.id = associatedLegalEntity.id
                this.object_ = associatedLegalEntity.object_
                this.liveMode = associatedLegalEntity.liveMode
                this.createdAt = associatedLegalEntity.createdAt
                this.updatedAt = associatedLegalEntity.updatedAt
                this.discardedAt = associatedLegalEntity.discardedAt
                this.legalEntityType = associatedLegalEntity.legalEntityType
                this.firstName = associatedLegalEntity.firstName
                this.lastName = associatedLegalEntity.lastName
                this.dateOfBirth = associatedLegalEntity.dateOfBirth
                this.dateFormed = associatedLegalEntity.dateFormed
                this.businessName = associatedLegalEntity.businessName
                this.doingBusinessAsNames = associatedLegalEntity.doingBusinessAsNames
                this.legalStructure = associatedLegalEntity.legalStructure
                this.phoneNumbers = associatedLegalEntity.phoneNumbers
                this.email = associatedLegalEntity.email
                this.website = associatedLegalEntity.website
                this.metadata = associatedLegalEntity.metadata
                this.addresses = associatedLegalEntity.addresses
                this.identifications = associatedLegalEntity.identifications
                additionalProperties(associatedLegalEntity.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            @JsonProperty("object")
            @ExcludeMissing
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
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            @JsonProperty("discarded_at")
            @ExcludeMissing
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /** The type of legal entity. */
            fun legalEntityType(legalEntityType: LegalEntityType) =
                legalEntityType(JsonField.of(legalEntityType))

            /** The type of legal entity. */
            @JsonProperty("legal_entity_type")
            @ExcludeMissing
            fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
                this.legalEntityType = legalEntityType
            }

            /** An individual's first name. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** An individual's first name. */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** An individual's last name. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** An individual's last name. */
            @JsonProperty("last_name")
            @ExcludeMissing
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

            /** An individual's date of birth (YYYY-MM-DD). */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate) = dateFormed(JsonField.of(dateFormed))

            /** A business's formation date (YYYY-MM-DD). */
            @JsonProperty("date_formed")
            @ExcludeMissing
            fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                this.dateFormed = dateFormed
            }

            /** The business's legal business name. */
            fun businessName(businessName: String) = businessName(JsonField.of(businessName))

            /** The business's legal business name. */
            @JsonProperty("business_name")
            @ExcludeMissing
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

            @JsonProperty("doing_business_as_names")
            @ExcludeMissing
            fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure) =
                legalStructure(JsonField.of(legalStructure))

            /** The business's legal structure. */
            @JsonProperty("legal_structure")
            @ExcludeMissing
            fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
                this.legalStructure = legalStructure
            }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            @JsonProperty("phone_numbers")
            @ExcludeMissing
            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The entity's primary email. */
            fun email(email: String) = email(JsonField.of(email))

            /** The entity's primary email. */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The entity's primary website URL. */
            fun website(website: String) = website(JsonField.of(website))

            /** The entity's primary website URL. */
            @JsonProperty("website")
            @ExcludeMissing
            fun website(website: JsonField<String>) = apply { this.website = website }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddress>) = addresses(JsonField.of(addresses))

            /** A list of addresses for the entity. */
            @JsonProperty("addresses")
            @ExcludeMissing
            fun addresses(addresses: JsonField<List<LegalEntityAddress>>) = apply {
                this.addresses = addresses
            }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<Identification>) =
                identifications(JsonField.of(identifications))

            /** A list of identifications for the legal entity. */
            @JsonProperty("identifications")
            @ExcludeMissing
            fun identifications(identifications: JsonField<List<Identification>>) = apply {
                this.identifications = identifications
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

            fun build(): AssociatedLegalEntity =
                AssociatedLegalEntity(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    legalEntityType,
                    firstName,
                    lastName,
                    dateOfBirth,
                    dateFormed,
                    businessName,
                    doingBusinessAsNames.map { it.toUnmodifiable() },
                    legalStructure,
                    phoneNumbers.map { it.toUnmodifiable() },
                    email,
                    website,
                    metadata,
                    addresses.map { it.toUnmodifiable() },
                    identifications.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = LegalEntityAddress.Builder::class)
        @NoAutoDetect
        class LegalEntityAddress
        private constructor(
            private val id: JsonField<String>,
            private val object_: JsonField<String>,
            private val liveMode: JsonField<Boolean>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val discardedAt: JsonField<OffsetDateTime>,
            private val addressTypes: JsonField<List<AddressType>>,
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LegalEntityAddress &&
                    this.id == other.id &&
                    this.object_ == other.object_ &&
                    this.liveMode == other.liveMode &&
                    this.createdAt == other.createdAt &&
                    this.updatedAt == other.updatedAt &&
                    this.discardedAt == other.discardedAt &&
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
                            id,
                            object_,
                            liveMode,
                            createdAt,
                            updatedAt,
                            discardedAt,
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
                "LegalEntityAddress{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

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
                    this.id = legalEntityAddress.id
                    this.object_ = legalEntityAddress.object_
                    this.liveMode = legalEntityAddress.liveMode
                    this.createdAt = legalEntityAddress.createdAt
                    this.updatedAt = legalEntityAddress.updatedAt
                    this.discardedAt = legalEntityAddress.discardedAt
                    this.addressTypes = legalEntityAddress.addressTypes
                    this.line1 = legalEntityAddress.line1
                    this.line2 = legalEntityAddress.line2
                    this.locality = legalEntityAddress.locality
                    this.region = legalEntityAddress.region
                    this.postalCode = legalEntityAddress.postalCode
                    this.country = legalEntityAddress.country
                    additionalProperties(legalEntityAddress.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun object_(object_: String) = object_(JsonField.of(object_))

                @JsonProperty("object")
                @ExcludeMissing
                fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                @JsonProperty("live_mode")
                @ExcludeMissing
                fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                @JsonProperty("updated_at")
                @ExcludeMissing
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun discardedAt(discardedAt: OffsetDateTime) =
                    discardedAt(JsonField.of(discardedAt))

                @JsonProperty("discarded_at")
                @ExcludeMissing
                fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                    this.discardedAt = discardedAt
                }

                /** The types of this address. */
                fun addressTypes(addressTypes: List<AddressType>) =
                    addressTypes(JsonField.of(addressTypes))

                /** The types of this address. */
                @JsonProperty("address_types")
                @ExcludeMissing
                fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
                    this.addressTypes = addressTypes
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
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LegalEntityAddress =
                    LegalEntityAddress(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        discardedAt,
                        addressTypes.map { it.toUnmodifiable() },
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
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = Identification.Builder::class)
        @NoAutoDetect
        class Identification
        private constructor(
            private val id: JsonField<String>,
            private val object_: JsonField<String>,
            private val liveMode: JsonField<Boolean>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val discardedAt: JsonField<OffsetDateTime>,
            private val idType: JsonField<IdType>,
            private val issuingCountry: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Identification &&
                    this.id == other.id &&
                    this.object_ == other.object_ &&
                    this.liveMode == other.liveMode &&
                    this.createdAt == other.createdAt &&
                    this.updatedAt == other.updatedAt &&
                    this.discardedAt == other.discardedAt &&
                    this.idType == other.idType &&
                    this.issuingCountry == other.issuingCountry &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            object_,
                            liveMode,
                            createdAt,
                            updatedAt,
                            discardedAt,
                            idType,
                            issuingCountry,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Identification{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"

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
                    this.id = identification.id
                    this.object_ = identification.object_
                    this.liveMode = identification.liveMode
                    this.createdAt = identification.createdAt
                    this.updatedAt = identification.updatedAt
                    this.discardedAt = identification.discardedAt
                    this.idType = identification.idType
                    this.issuingCountry = identification.issuingCountry
                    additionalProperties(identification.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun object_(object_: String) = object_(JsonField.of(object_))

                @JsonProperty("object")
                @ExcludeMissing
                fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                @JsonProperty("live_mode")
                @ExcludeMissing
                fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                @JsonProperty("updated_at")
                @ExcludeMissing
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun discardedAt(discardedAt: OffsetDateTime) =
                    discardedAt(JsonField.of(discardedAt))

                @JsonProperty("discarded_at")
                @ExcludeMissing
                fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                    this.discardedAt = discardedAt
                }

                /** The type of ID number. */
                fun idType(idType: IdType) = idType(JsonField.of(idType))

                /** The type of ID number. */
                @JsonProperty("id_type")
                @ExcludeMissing
                fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: String) =
                    issuingCountry(JsonField.of(issuingCountry))

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                @JsonProperty("issuing_country")
                @ExcludeMissing
                fun issuingCountry(issuingCountry: JsonField<String>) = apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

                val JOINT = LegalEntityType(JsonField.of("joint"))

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
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

            @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PhoneNumber = apply {
                if (!validated) {
                    phoneNumber()
                    validated = true
                }
            }

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

                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(phoneNumber: PhoneNumber) = apply {
                    this.phoneNumber = phoneNumber.phoneNumber
                    additionalProperties(phoneNumber.additionalProperties)
                }

                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                @JsonProperty("phone_number")
                @ExcludeMissing
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toUnmodifiable())
            }
        }
    }

    class RelationshipType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RelationshipType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BENEFICIAL_OWNER = RelationshipType(JsonField.of("beneficial_owner"))

            val CONTROL_PERSON = RelationshipType(JsonField.of("control_person"))

            fun of(value: String) = RelationshipType(JsonField.of(value))
        }

        enum class Known {
            BENEFICIAL_OWNER,
            CONTROL_PERSON,
        }

        enum class Value {
            BENEFICIAL_OWNER,
            CONTROL_PERSON,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                CONTROL_PERSON -> Value.CONTROL_PERSON
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                CONTROL_PERSON -> Known.CONTROL_PERSON
                else -> throw ModernTreasuryInvalidDataException("Unknown RelationshipType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
