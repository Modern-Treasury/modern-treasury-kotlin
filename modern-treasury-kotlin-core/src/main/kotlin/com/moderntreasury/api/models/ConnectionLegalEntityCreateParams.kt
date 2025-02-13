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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** Create a connection legal entity. */
class ConnectionLegalEntityCreateParams
private constructor(
    private val body: ConnectionLegalEntityCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The ID of the connection. */
    fun connectionId(): String = body.connectionId()

    /** The legal entity. */
    fun legalEntity(): LegalEntity? = body.legalEntity()

    /** The ID of the legal entity. */
    fun legalEntityId(): String? = body.legalEntityId()

    /** The ID of the connection. */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /** The legal entity. */
    fun _legalEntity(): JsonField<LegalEntity> = body._legalEntity()

    /** The ID of the legal entity. */
    fun _legalEntityId(): JsonField<String> = body._legalEntityId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): ConnectionLegalEntityCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ConnectionLegalEntityCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("connection_id")
        @ExcludeMissing
        private val connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity")
        @ExcludeMissing
        private val legalEntity: JsonField<LegalEntity> = JsonMissing.of(),
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        private val legalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the connection. */
        fun connectionId(): String = connectionId.getRequired("connection_id")

        /** The legal entity. */
        fun legalEntity(): LegalEntity? = legalEntity.getNullable("legal_entity")

        /** The ID of the legal entity. */
        fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

        /** The ID of the connection. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /** The legal entity. */
        @JsonProperty("legal_entity")
        @ExcludeMissing
        fun _legalEntity(): JsonField<LegalEntity> = legalEntity

        /** The ID of the legal entity. */
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        fun _legalEntityId(): JsonField<String> = legalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ConnectionLegalEntityCreateBody = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            legalEntity()?.validate()
            legalEntityId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ConnectionLegalEntityCreateBody]. */
        class Builder internal constructor() {

            private var connectionId: JsonField<String>? = null
            private var legalEntity: JsonField<LegalEntity> = JsonMissing.of()
            private var legalEntityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(connectionLegalEntityCreateBody: ConnectionLegalEntityCreateBody) =
                apply {
                    connectionId = connectionLegalEntityCreateBody.connectionId
                    legalEntity = connectionLegalEntityCreateBody.legalEntity
                    legalEntityId = connectionLegalEntityCreateBody.legalEntityId
                    additionalProperties =
                        connectionLegalEntityCreateBody.additionalProperties.toMutableMap()
                }

            /** The ID of the connection. */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /** The ID of the connection. */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** The legal entity. */
            fun legalEntity(legalEntity: LegalEntity) = legalEntity(JsonField.of(legalEntity))

            /** The legal entity. */
            fun legalEntity(legalEntity: JsonField<LegalEntity>) = apply {
                this.legalEntity = legalEntity
            }

            /** The ID of the legal entity. */
            fun legalEntityId(legalEntityId: String) = legalEntityId(JsonField.of(legalEntityId))

            /** The ID of the legal entity. */
            fun legalEntityId(legalEntityId: JsonField<String>) = apply {
                this.legalEntityId = legalEntityId
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

            fun build(): ConnectionLegalEntityCreateBody =
                ConnectionLegalEntityCreateBody(
                    checkRequired("connectionId", connectionId),
                    legalEntity,
                    legalEntityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionLegalEntityCreateBody && connectionId == other.connectionId && legalEntity == other.legalEntity && legalEntityId == other.legalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(connectionId, legalEntity, legalEntityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectionLegalEntityCreateBody{connectionId=$connectionId, legalEntity=$legalEntity, legalEntityId=$legalEntityId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ConnectionLegalEntityCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ConnectionLegalEntityCreateBody.Builder =
            ConnectionLegalEntityCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(connectionLegalEntityCreateParams: ConnectionLegalEntityCreateParams) =
            apply {
                body = connectionLegalEntityCreateParams.body.toBuilder()
                additionalHeaders = connectionLegalEntityCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    connectionLegalEntityCreateParams.additionalQueryParams.toBuilder()
            }

        /** The ID of the connection. */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /** The ID of the connection. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /** The legal entity. */
        fun legalEntity(legalEntity: LegalEntity) = apply { body.legalEntity(legalEntity) }

        /** The legal entity. */
        fun legalEntity(legalEntity: JsonField<LegalEntity>) = apply {
            body.legalEntity(legalEntity)
        }

        /** The ID of the legal entity. */
        fun legalEntityId(legalEntityId: String) = apply { body.legalEntityId(legalEntityId) }

        /** The ID of the legal entity. */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            body.legalEntityId(legalEntityId)
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

        fun build(): ConnectionLegalEntityCreateParams =
            ConnectionLegalEntityCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The legal entity. */
    @NoAutoDetect
    class LegalEntity
    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        private val addresses: JsonField<List<LegalEntityAddressCreateRequest>> = JsonMissing.of(),
        @JsonProperty("bank_settings")
        @ExcludeMissing
        private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        private val businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_formed")
        @ExcludeMissing
        private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifications")
        @ExcludeMissing
        private val identifications: JsonField<List<IdentificationCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_associations")
        @ExcludeMissing
        private val legalEntityAssociations:
            JsonField<List<LegalEntityAssociationInlineCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        private val legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
        @JsonProperty("legal_structure")
        @ExcludeMissing
        private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        private val middleName: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
            JsonMissing.of(),
        @JsonProperty("website")
        @ExcludeMissing
        private val website: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A list of addresses for the entity. */
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses.getNullable("addresses")

        fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

        /** The business's legal business name. */
        fun businessName(): String? = businessName.getNullable("business_name")

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

        fun doingBusinessAsNames(): List<String>? =
            doingBusinessAsNames.getNullable("doing_business_as_names")

        /** The entity's primary email. */
        fun email(): String? = email.getNullable("email")

        /** An individual's first name. */
        fun firstName(): String? = firstName.getNullable("first_name")

        /** A list of identifications for the legal entity. */
        fun identifications(): List<IdentificationCreateRequest>? =
            identifications.getNullable("identifications")

        /** An individual's last name. */
        fun lastName(): String? = lastName.getNullable("last_name")

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreateRequest>? =
            legalEntityAssociations.getNullable("legal_entity_associations")

        /** The type of legal entity. */
        fun legalEntityType(): LegalEntityType? = legalEntityType.getNullable("legal_entity_type")

        /** The business's legal structure. */
        fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** An individual's middle name. */
        fun middleName(): String? = middleName.getNullable("middle_name")

        fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

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

        fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
            wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

        /** The entity's primary website URL. */
        fun website(): String? = website.getNullable("website")

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

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

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed")
        @ExcludeMissing
        fun _dateFormed(): JsonField<LocalDate> = dateFormed

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

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
        fun _identifications(): JsonField<List<IdentificationCreateRequest>> = identifications

        /** An individual's last name. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        @ExcludeMissing
        fun _legalEntityAssociations(): JsonField<List<LegalEntityAssociationInlineCreateRequest>> =
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
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** An individual's middle name. */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

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

            addresses()?.forEach { it.validate() }
            bankSettings()?.validate()
            businessName()
            citizenshipCountry()
            dateFormed()
            dateOfBirth()
            doingBusinessAsNames()
            email()
            firstName()
            identifications()?.forEach { it.validate() }
            lastName()
            legalEntityAssociations()?.forEach { it.validate() }
            legalEntityType()
            legalStructure()
            metadata()?.validate()
            middleName()
            phoneNumbers()?.forEach { it.validate() }
            politicallyExposedPerson()
            preferredName()
            prefix()
            riskRating()
            suffix()
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

            private var addresses: JsonField<MutableList<LegalEntityAddressCreateRequest>>? = null
            private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var citizenshipCountry: JsonField<String> = JsonMissing.of()
            private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
            private var lastName: JsonField<String> = JsonMissing.of()
            private var legalEntityAssociations:
                JsonField<MutableList<LegalEntityAssociationInlineCreateRequest>>? =
                null
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

            internal fun from(legalEntity: LegalEntity) = apply {
                addresses = legalEntity.addresses.map { it.toMutableList() }
                bankSettings = legalEntity.bankSettings
                businessName = legalEntity.businessName
                citizenshipCountry = legalEntity.citizenshipCountry
                dateFormed = legalEntity.dateFormed
                dateOfBirth = legalEntity.dateOfBirth
                doingBusinessAsNames = legalEntity.doingBusinessAsNames.map { it.toMutableList() }
                email = legalEntity.email
                firstName = legalEntity.firstName
                identifications = legalEntity.identifications.map { it.toMutableList() }
                lastName = legalEntity.lastName
                legalEntityAssociations =
                    legalEntity.legalEntityAssociations.map { it.toMutableList() }
                legalEntityType = legalEntity.legalEntityType
                legalStructure = legalEntity.legalStructure
                metadata = legalEntity.metadata
                middleName = legalEntity.middleName
                phoneNumbers = legalEntity.phoneNumbers.map { it.toMutableList() }
                politicallyExposedPerson = legalEntity.politicallyExposedPerson
                preferredName = legalEntity.preferredName
                prefix = legalEntity.prefix
                riskRating = legalEntity.riskRating
                suffix = legalEntity.suffix
                wealthAndEmploymentDetails = legalEntity.wealthAndEmploymentDetails
                website = legalEntity.website
                additionalProperties = legalEntity.additionalProperties.toMutableMap()
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                addresses(JsonField.of(addresses))

            /** A list of addresses for the entity. */
            fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
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
            fun businessName(businessName: String?) =
                businessName(JsonField.ofNullable(businessName))

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

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                this.dateFormed = dateFormed
            }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate?) =
                dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
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
            fun identifications(identifications: List<IdentificationCreateRequest>) =
                identifications(JsonField.of(identifications))

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) =
                apply {
                    this.identifications = identifications.map { it.toMutableList() }
                }

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
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
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?
            ) = legalEntityAssociations(JsonField.ofNullable(legalEntityAssociations))

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreateRequest>>
            ) = apply {
                this.legalEntityAssociations = legalEntityAssociations.map { it.toMutableList() }
            }

            /** The legal entity associations and its child legal entities. */
            fun addLegalEntityAssociation(
                legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
            ) = apply {
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
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** An individual's middle name. */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

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
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /** An individual's suffix. */
            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /** An individual's suffix. */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: WealthAndEmploymentDetails?
            ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

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
                    (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    dateFormed,
                    dateOfBirth,
                    (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                    lastName,
                    (legalEntityAssociations ?: JsonMissing.of()).map { it.toImmutable() },
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
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class LegalEntityAddressCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            private val locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region")
            @ExcludeMissing
            private val region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address_types")
            @ExcludeMissing
            private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(): String? = country.getNullable("country")

            fun line1(): String? = line1.getNullable("line1")

            /** Locality or City. */
            fun locality(): String? = locality.getNullable("locality")

            /** The postal code of the address. */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /** Region or State. */
            fun region(): String? = region.getNullable("region")

            /** The types of this address. */
            fun addressTypes(): List<AddressType>? = addressTypes.getNullable("address_types")

            fun line2(): String? = line2.getNullable("line2")

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** Locality or City. */
            @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** Region or State. */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /** The types of this address. */
            @JsonProperty("address_types")
            @ExcludeMissing
            fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                addressTypes()
                line2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                internal fun from(
                    legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                ) = apply {
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

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** Locality or City. */
                fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                /** Locality or City. */
                fun locality(locality: JsonField<String>) = apply { this.locality = locality }

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** The postal code of the address. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** Region or State. */
                fun region(region: String?) = region(JsonField.ofNullable(region))

                /** Region or State. */
                fun region(region: JsonField<String>) = apply { this.region = region }

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

                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LegalEntityAddressCreateRequest =
                    LegalEntityAddressCreateRequest(
                        checkRequired("country", country),
                        checkRequired("line1", line1),
                        checkRequired("locality", locality),
                        checkRequired("postalCode", postalCode),
                        checkRequired("region", region),
                        (addressTypes ?: JsonMissing.of()).map { it.toImmutable() },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            class AddressType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
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

                return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class IdentificationCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("id_number")
            @ExcludeMissing
            private val idNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id_type")
            @ExcludeMissing
            private val idType: JsonField<IdType> = JsonMissing.of(),
            @JsonProperty("issuing_country")
            @ExcludeMissing
            private val issuingCountry: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID number of identification document. */
            fun idNumber(): String = idNumber.getRequired("id_number")

            /** The type of ID number. */
            fun idType(): IdType = idType.getRequired("id_type")

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

            /** The ID number of identification document. */
            @JsonProperty("id_number") @ExcludeMissing fun _idNumber(): JsonField<String> = idNumber

            /** The type of ID number. */
            @JsonProperty("id_type") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country")
            @ExcludeMissing
            fun _issuingCountry(): JsonField<String> = issuingCountry

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): IdentificationCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                idNumber()
                idType()
                issuingCountry()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [IdentificationCreateRequest]. */
            class Builder internal constructor() {

                private var idNumber: JsonField<String>? = null
                private var idType: JsonField<IdType>? = null
                private var issuingCountry: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(identificationCreateRequest: IdentificationCreateRequest) =
                    apply {
                        idNumber = identificationCreateRequest.idNumber
                        idType = identificationCreateRequest.idType
                        issuingCountry = identificationCreateRequest.issuingCountry
                        additionalProperties =
                            identificationCreateRequest.additionalProperties.toMutableMap()
                    }

                /** The ID number of identification document. */
                fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

                /** The ID number of identification document. */
                fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

                /** The type of ID number. */
                fun idType(idType: IdType) = idType(JsonField.of(idType))

                /** The type of ID number. */
                fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: String?) =
                    issuingCountry(JsonField.ofNullable(issuingCountry))

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): IdentificationCreateRequest =
                    IdentificationCreateRequest(
                        checkRequired("idNumber", idNumber),
                        checkRequired("idType", idType),
                        issuingCountry,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The type of ID number. */
            class IdType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [IdType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
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

        @NoAutoDetect
        class LegalEntityAssociationInlineCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("relationship_types")
            @ExcludeMissing
            private val relationshipTypes: JsonField<List<RelationshipType>> = JsonMissing.of(),
            @JsonProperty("child_legal_entity")
            @ExcludeMissing
            private val childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of(),
            @JsonProperty("child_legal_entity_id")
            @ExcludeMissing
            private val childLegalEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            private val ownershipPercentage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("title")
            @ExcludeMissing
            private val title: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun relationshipTypes(): List<RelationshipType> =
                relationshipTypes.getRequired("relationship_types")

            /** The child legal entity. */
            fun childLegalEntity(): ChildLegalEntityCreate? =
                childLegalEntity.getNullable("child_legal_entity")

            /** The ID of the child legal entity. */
            fun childLegalEntityId(): String? =
                childLegalEntityId.getNullable("child_legal_entity_id")

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            fun ownershipPercentage(): Long? =
                ownershipPercentage.getNullable("ownership_percentage")

            /** The job title of the child entity at the parent entity. */
            fun title(): String? = title.getNullable("title")

            @JsonProperty("relationship_types")
            @ExcludeMissing
            fun _relationshipTypes(): JsonField<List<RelationshipType>> = relationshipTypes

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            @ExcludeMissing
            fun _childLegalEntity(): JsonField<ChildLegalEntityCreate> = childLegalEntity

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            @ExcludeMissing
            fun _childLegalEntityId(): JsonField<String> = childLegalEntityId

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LegalEntityAssociationInlineCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                relationshipTypes()
                childLegalEntity()?.validate()
                childLegalEntityId()
                ownershipPercentage()
                title()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [LegalEntityAssociationInlineCreateRequest]. */
            class Builder internal constructor() {

                private var relationshipTypes: JsonField<MutableList<RelationshipType>>? = null
                private var childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of()
                private var childLegalEntityId: JsonField<String> = JsonMissing.of()
                private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    legalEntityAssociationInlineCreateRequest:
                        LegalEntityAssociationInlineCreateRequest
                ) = apply {
                    relationshipTypes =
                        legalEntityAssociationInlineCreateRequest.relationshipTypes.map {
                            it.toMutableList()
                        }
                    childLegalEntity = legalEntityAssociationInlineCreateRequest.childLegalEntity
                    childLegalEntityId =
                        legalEntityAssociationInlineCreateRequest.childLegalEntityId
                    ownershipPercentage =
                        legalEntityAssociationInlineCreateRequest.ownershipPercentage
                    title = legalEntityAssociationInlineCreateRequest.title
                    additionalProperties =
                        legalEntityAssociationInlineCreateRequest.additionalProperties
                            .toMutableMap()
                }

                fun relationshipTypes(relationshipTypes: List<RelationshipType>) =
                    relationshipTypes(JsonField.of(relationshipTypes))

                fun relationshipTypes(relationshipTypes: JsonField<List<RelationshipType>>) =
                    apply {
                        this.relationshipTypes = relationshipTypes.map { it.toMutableList() }
                    }

                fun addRelationshipType(relationshipType: RelationshipType) = apply {
                    relationshipTypes =
                        (relationshipTypes ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(relationshipType)
                        }
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) =
                    childLegalEntity(JsonField.of(childLegalEntity))

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: JsonField<ChildLegalEntityCreate>) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: String) =
                    childLegalEntityId(JsonField.of(childLegalEntityId))

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: JsonField<String>) = apply {
                    this.childLegalEntityId = childLegalEntityId
                }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long?) =
                    ownershipPercentage(JsonField.ofNullable(ownershipPercentage))

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long) =
                    ownershipPercentage(ownershipPercentage as Long?)

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The job title of the child entity at the parent entity. */
                fun title(title: String?) = title(JsonField.ofNullable(title))

                /** The job title of the child entity at the parent entity. */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkRequired("relationshipTypes", relationshipTypes).map {
                            it.toImmutable()
                        },
                        childLegalEntity,
                        childLegalEntityId,
                        ownershipPercentage,
                        title,
                        additionalProperties.toImmutable(),
                    )
            }

            /** A list of relationship types for how the child entity relates to parent entity. */
            class RelationshipType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BENEFICIAL_OWNER = of("beneficial_owner")

                    val CONTROL_PERSON = of("control_person")

                    fun of(value: String) = RelationshipType(JsonField.of(value))
                }

                /** An enum containing [RelationshipType]'s known values. */
                enum class Known {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                }

                /**
                 * An enum containing [RelationshipType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RelationshipType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                    /**
                     * An enum member indicating that [RelationshipType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Value.CONTROL_PERSON
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Known.CONTROL_PERSON
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RelationshipType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RelationshipType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The child legal entity. */
            @NoAutoDetect
            class ChildLegalEntityCreate
            @JsonCreator
            private constructor(
                @JsonProperty("addresses")
                @ExcludeMissing
                private val addresses: JsonField<List<LegalEntityAddressCreateRequest>> =
                    JsonMissing.of(),
                @JsonProperty("bank_settings")
                @ExcludeMissing
                private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
                @JsonProperty("business_name")
                @ExcludeMissing
                private val businessName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("citizenship_country")
                @ExcludeMissing
                private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("date_formed")
                @ExcludeMissing
                private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("doing_business_as_names")
                @ExcludeMissing
                private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("email")
                @ExcludeMissing
                private val email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("first_name")
                @ExcludeMissing
                private val firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("identifications")
                @ExcludeMissing
                private val identifications: JsonField<List<IdentificationCreateRequest>> =
                    JsonMissing.of(),
                @JsonProperty("last_name")
                @ExcludeMissing
                private val lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("legal_entity_type")
                @ExcludeMissing
                private val legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
                @JsonProperty("legal_structure")
                @ExcludeMissing
                private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("middle_name")
                @ExcludeMissing
                private val middleName: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("wealth_and_employment_details")
                @ExcludeMissing
                private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
                    JsonMissing.of(),
                @JsonProperty("website")
                @ExcludeMissing
                private val website: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A list of addresses for the entity. */
                fun addresses(): List<LegalEntityAddressCreateRequest>? =
                    addresses.getNullable("addresses")

                fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

                /** The business's legal business name. */
                fun businessName(): String? = businessName.getNullable("business_name")

                /** The country of citizenship for an individual. */
                fun citizenshipCountry(): String? =
                    citizenshipCountry.getNullable("citizenship_country")

                /** A business's formation date (YYYY-MM-DD). */
                fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

                /** An individual's date of birth (YYYY-MM-DD). */
                fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

                fun doingBusinessAsNames(): List<String>? =
                    doingBusinessAsNames.getNullable("doing_business_as_names")

                /** The entity's primary email. */
                fun email(): String? = email.getNullable("email")

                /** An individual's first name. */
                fun firstName(): String? = firstName.getNullable("first_name")

                /** A list of identifications for the legal entity. */
                fun identifications(): List<IdentificationCreateRequest>? =
                    identifications.getNullable("identifications")

                /** An individual's last name. */
                fun lastName(): String? = lastName.getNullable("last_name")

                /** The type of legal entity. */
                fun legalEntityType(): LegalEntityType? =
                    legalEntityType.getNullable("legal_entity_type")

                /** The business's legal structure. */
                fun legalStructure(): LegalStructure? =
                    legalStructure.getNullable("legal_structure")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /** An individual's middle name. */
                fun middleName(): String? = middleName.getNullable("middle_name")

                fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

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

                fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
                    wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

                /** The entity's primary website URL. */
                fun website(): String? = website.getNullable("website")

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                @ExcludeMissing
                fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

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

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed")
                @ExcludeMissing
                fun _dateFormed(): JsonField<LocalDate> = dateFormed

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

                @JsonProperty("doing_business_as_names")
                @ExcludeMissing
                fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

                /** The entity's primary email. */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /** An individual's first name. */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                @ExcludeMissing
                fun _identifications(): JsonField<List<IdentificationCreateRequest>> =
                    identifications

                /** An individual's last name. */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                @ExcludeMissing
                fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                @ExcludeMissing
                fun _legalStructure(): JsonField<LegalStructure> = legalStructure

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /** An individual's middle name. */
                @JsonProperty("middle_name")
                @ExcludeMissing
                fun _middleName(): JsonField<String> = middleName

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

                fun validate(): ChildLegalEntityCreate = apply {
                    if (validated) {
                        return@apply
                    }

                    addresses()?.forEach { it.validate() }
                    bankSettings()?.validate()
                    businessName()
                    citizenshipCountry()
                    dateFormed()
                    dateOfBirth()
                    doingBusinessAsNames()
                    email()
                    firstName()
                    identifications()?.forEach { it.validate() }
                    lastName()
                    legalEntityType()
                    legalStructure()
                    metadata()?.validate()
                    middleName()
                    phoneNumbers()?.forEach { it.validate() }
                    politicallyExposedPerson()
                    preferredName()
                    prefix()
                    riskRating()
                    suffix()
                    wealthAndEmploymentDetails()?.validate()
                    website()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [ChildLegalEntityCreate]. */
                class Builder internal constructor() {

                    private var addresses:
                        JsonField<MutableList<LegalEntityAddressCreateRequest>>? =
                        null
                    private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
                    private var businessName: JsonField<String> = JsonMissing.of()
                    private var citizenshipCountry: JsonField<String> = JsonMissing.of()
                    private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
                    private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                    private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var identifications:
                        JsonField<MutableList<IdentificationCreateRequest>>? =
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
                        dateFormed = childLegalEntityCreate.dateFormed
                        dateOfBirth = childLegalEntityCreate.dateOfBirth
                        doingBusinessAsNames =
                            childLegalEntityCreate.doingBusinessAsNames.map { it.toMutableList() }
                        email = childLegalEntityCreate.email
                        firstName = childLegalEntityCreate.firstName
                        identifications =
                            childLegalEntityCreate.identifications.map { it.toMutableList() }
                        lastName = childLegalEntityCreate.lastName
                        legalEntityType = childLegalEntityCreate.legalEntityType
                        legalStructure = childLegalEntityCreate.legalStructure
                        metadata = childLegalEntityCreate.metadata
                        middleName = childLegalEntityCreate.middleName
                        phoneNumbers =
                            childLegalEntityCreate.phoneNumbers.map { it.toMutableList() }
                        politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
                        preferredName = childLegalEntityCreate.preferredName
                        prefix = childLegalEntityCreate.prefix
                        riskRating = childLegalEntityCreate.riskRating
                        suffix = childLegalEntityCreate.suffix
                        wealthAndEmploymentDetails =
                            childLegalEntityCreate.wealthAndEmploymentDetails
                        website = childLegalEntityCreate.website
                        additionalProperties =
                            childLegalEntityCreate.additionalProperties.toMutableMap()
                    }

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                        addresses(JsonField.of(addresses))

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) =
                        apply {
                            this.addresses = addresses.map { it.toMutableList() }
                        }

                    /** A list of addresses for the entity. */
                    fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
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
                    fun businessName(businessName: String?) =
                        businessName(JsonField.ofNullable(businessName))

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

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: LocalDate?) =
                        dateFormed(JsonField.ofNullable(dateFormed))

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                        this.dateFormed = dateFormed
                    }

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: LocalDate?) =
                        dateOfBirth(JsonField.ofNullable(dateOfBirth))

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                        doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

                    fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) =
                        apply {
                            this.doingBusinessAsNames =
                                doingBusinessAsNames.map { it.toMutableList() }
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
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /** A list of identifications for the legal entity. */
                    fun identifications(identifications: List<IdentificationCreateRequest>) =
                        identifications(JsonField.of(identifications))

                    /** A list of identifications for the legal entity. */
                    fun identifications(
                        identifications: JsonField<List<IdentificationCreateRequest>>
                    ) = apply { this.identifications = identifications.map { it.toMutableList() } }

                    /** A list of identifications for the legal entity. */
                    fun addIdentification(identification: IdentificationCreateRequest) = apply {
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
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** An individual's middle name. */
                    fun middleName(middleName: String?) =
                        middleName(JsonField.ofNullable(middleName))

                    /** An individual's middle name. */
                    fun middleName(middleName: JsonField<String>) = apply {
                        this.middleName = middleName
                    }

                    fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                        phoneNumbers(JsonField.of(phoneNumbers))

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
                    fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) =
                        apply {
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
                    fun riskRating(riskRating: RiskRating?) =
                        riskRating(JsonField.ofNullable(riskRating))

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                        this.riskRating = riskRating
                    }

                    /** An individual's suffix. */
                    fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

                    /** An individual's suffix. */
                    fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: WealthAndEmploymentDetails?
                    ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ChildLegalEntityCreate =
                        ChildLegalEntityCreate(
                            (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                            bankSettings,
                            businessName,
                            citizenshipCountry,
                            dateFormed,
                            dateOfBirth,
                            (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                            email,
                            firstName,
                            (identifications ?: JsonMissing.of()).map { it.toImmutable() },
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
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LegalEntityAddressCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locality")
                    @ExcludeMissing
                    private val locality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    private val postalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    private val region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address_types")
                    @ExcludeMissing
                    private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    fun country(): String? = country.getNullable("country")

                    fun line1(): String? = line1.getNullable("line1")

                    /** Locality or City. */
                    fun locality(): String? = locality.getNullable("locality")

                    /** The postal code of the address. */
                    fun postalCode(): String? = postalCode.getNullable("postal_code")

                    /** Region or State. */
                    fun region(): String? = region.getNullable("region")

                    /** The types of this address. */
                    fun addressTypes(): List<AddressType>? =
                        addressTypes.getNullable("address_types")

                    fun line2(): String? = line2.getNullable("line2")

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /** Locality or City. */
                    @JsonProperty("locality")
                    @ExcludeMissing
                    fun _locality(): JsonField<String> = locality

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /** Region or State. */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    /** The types of this address. */
                    @JsonProperty("address_types")
                    @ExcludeMissing
                    fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                        addressTypes()
                        line2()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                        ) = apply {
                            country = legalEntityAddressCreateRequest.country
                            line1 = legalEntityAddressCreateRequest.line1
                            locality = legalEntityAddressCreateRequest.locality
                            postalCode = legalEntityAddressCreateRequest.postalCode
                            region = legalEntityAddressCreateRequest.region
                            addressTypes =
                                legalEntityAddressCreateRequest.addressTypes.map {
                                    it.toMutableList()
                                }
                            line2 = legalEntityAddressCreateRequest.line2
                            additionalProperties =
                                legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = country(JsonField.ofNullable(country))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** Locality or City. */
                        fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                        /** Locality or City. */
                        fun locality(locality: JsonField<String>) = apply {
                            this.locality = locality
                        }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) =
                            postalCode(JsonField.ofNullable(postalCode))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** Region or State. */
                        fun region(region: String?) = region(JsonField.ofNullable(region))

                        /** Region or State. */
                        fun region(region: JsonField<String>) = apply { this.region = region }

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

                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LegalEntityAddressCreateRequest =
                            LegalEntityAddressCreateRequest(
                                checkRequired("country", country),
                                checkRequired("line1", line1),
                                checkRequired("locality", locality),
                                checkRequired("postalCode", postalCode),
                                checkRequired("region", region),
                                (addressTypes ?: JsonMissing.of()).map { it.toImmutable() },
                                line2,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AddressType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [AddressType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [AddressType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                            /**
                             * An enum member indicating that [AddressType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BUSINESS -> Known.BUSINESS
                                MAILING -> Known.MAILING
                                OTHER -> Known.OTHER
                                PO_BOX -> Known.PO_BOX
                                RESIDENTIAL -> Known.RESIDENTIAL
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AddressType: $value"
                                    )
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

                        return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class IdentificationCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("id_number")
                    @ExcludeMissing
                    private val idNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("id_type")
                    @ExcludeMissing
                    private val idType: JsonField<IdType> = JsonMissing.of(),
                    @JsonProperty("issuing_country")
                    @ExcludeMissing
                    private val issuingCountry: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The ID number of identification document. */
                    fun idNumber(): String = idNumber.getRequired("id_number")

                    /** The type of ID number. */
                    fun idType(): IdType = idType.getRequired("id_type")

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

                    /** The ID number of identification document. */
                    @JsonProperty("id_number")
                    @ExcludeMissing
                    fun _idNumber(): JsonField<String> = idNumber

                    /** The type of ID number. */
                    @JsonProperty("id_type")
                    @ExcludeMissing
                    fun _idType(): JsonField<IdType> = idType

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    @JsonProperty("issuing_country")
                    @ExcludeMissing
                    fun _issuingCountry(): JsonField<String> = issuingCountry

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): IdentificationCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        idNumber()
                        idType()
                        issuingCountry()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [IdentificationCreateRequest]. */
                    class Builder internal constructor() {

                        private var idNumber: JsonField<String>? = null
                        private var idType: JsonField<IdType>? = null
                        private var issuingCountry: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            identificationCreateRequest: IdentificationCreateRequest
                        ) = apply {
                            idNumber = identificationCreateRequest.idNumber
                            idType = identificationCreateRequest.idType
                            issuingCountry = identificationCreateRequest.issuingCountry
                            additionalProperties =
                                identificationCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** The ID number of identification document. */
                        fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

                        /** The ID number of identification document. */
                        fun idNumber(idNumber: JsonField<String>) = apply {
                            this.idNumber = idNumber
                        }

                        /** The type of ID number. */
                        fun idType(idType: IdType) = idType(JsonField.of(idType))

                        /** The type of ID number. */
                        fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: String?) =
                            issuingCountry(JsonField.ofNullable(issuingCountry))

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                            this.issuingCountry = issuingCountry
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): IdentificationCreateRequest =
                            IdentificationCreateRequest(
                                checkRequired("idNumber", idNumber),
                                checkRequired("idType", idType),
                                issuingCountry,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /** The type of ID number. */
                    class IdType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [IdType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [IdType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                             * An enum member indicating that [IdType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
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
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown IdType: $value"
                                    )
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

                /** The type of legal entity. */
                class LegalEntityType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
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
                     * An enum containing [LegalEntityType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [LegalEntityType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        /**
                         * An enum member indicating that [LegalEntityType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalEntityType: $value"
                                )
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

                /** The business's legal structure. */
                class LegalStructure
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
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
                     * An enum containing [LegalStructure]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [LegalStructure] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [LegalStructure] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CORPORATION -> Known.CORPORATION
                            LLC -> Known.LLC
                            NON_PROFIT -> Known.NON_PROFIT
                            PARTNERSHIP -> Known.PARTNERSHIP
                            SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                            TRUST -> Known.TRUST
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalStructure: $value"
                                )
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

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(phoneNumber: PhoneNumber) = apply {
                            this.phoneNumber = phoneNumber.phoneNumber
                            additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                        }

                        fun phoneNumber(phoneNumber: String) =
                            phoneNumber(JsonField.of(phoneNumber))

                        fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                            this.phoneNumber = phoneNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PhoneNumber =
                            PhoneNumber(phoneNumber, additionalProperties.toImmutable())
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
                class RiskRating
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
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
                     * An enum containing [RiskRating]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [RiskRating] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        /**
                         * An enum member indicating that [RiskRating] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            LOW -> Known.LOW
                            MEDIUM -> Known.MEDIUM
                            HIGH -> Known.HIGH
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown RiskRating: $value"
                                )
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

                    return /* spotless:off */ other is ChildLegalEntityCreate && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChildLegalEntityCreate{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAssociationInlineCreateRequest && relationshipTypes == other.relationshipTypes && childLegalEntity == other.childLegalEntity && childLegalEntityId == other.childLegalEntityId && ownershipPercentage == other.ownershipPercentage && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(relationshipTypes, childLegalEntity, childLegalEntityId, ownershipPercentage, title, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, ownershipPercentage=$ownershipPercentage, title=$title, additionalProperties=$additionalProperties}"
        }

        /** The type of legal entity. */
        class LegalEntityType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
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

        /** The business's legal structure. */
        class LegalStructure
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toImmutable())
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
        class RiskRating
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOW,
                MEDIUM,
                HIGH,
                /**
                 * An enum member indicating that [RiskRating] was instantiated with an unknown
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
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
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

            return /* spotless:off */ other is LegalEntity && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntity{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionLegalEntityCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ConnectionLegalEntityCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
