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

class ConnectionLegalEntityCreateParams
constructor(
    private val connectionId: String,
    private val legalEntity: LegalEntity?,
    private val legalEntityId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun connectionId(): String = connectionId

    fun legalEntity(): LegalEntity? = legalEntity

    fun legalEntityId(): String? = legalEntityId

    internal fun getBody(): ConnectionLegalEntityCreateBody {
        return ConnectionLegalEntityCreateBody(
            connectionId,
            legalEntity,
            legalEntityId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ConnectionLegalEntityCreateBody.Builder::class)
    @NoAutoDetect
    class ConnectionLegalEntityCreateBody
    internal constructor(
        private val connectionId: String?,
        private val legalEntity: LegalEntity?,
        private val legalEntityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The ID of the connection. */
        @JsonProperty("connection_id") fun connectionId(): String? = connectionId

        /** The legal entity. */
        @JsonProperty("legal_entity") fun legalEntity(): LegalEntity? = legalEntity

        /** The ID of the legal entity. */
        @JsonProperty("legal_entity_id") fun legalEntityId(): String? = legalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectionLegalEntityCreateBody &&
                this.connectionId == other.connectionId &&
                this.legalEntity == other.legalEntity &&
                this.legalEntityId == other.legalEntityId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        connectionId,
                        legalEntity,
                        legalEntityId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ConnectionLegalEntityCreateBody{connectionId=$connectionId, legalEntity=$legalEntity, legalEntityId=$legalEntityId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var connectionId: String? = null
            private var legalEntity: LegalEntity? = null
            private var legalEntityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(connectionLegalEntityCreateBody: ConnectionLegalEntityCreateBody) =
                apply {
                    this.connectionId = connectionLegalEntityCreateBody.connectionId
                    this.legalEntity = connectionLegalEntityCreateBody.legalEntity
                    this.legalEntityId = connectionLegalEntityCreateBody.legalEntityId
                    additionalProperties(connectionLegalEntityCreateBody.additionalProperties)
                }

            /** The ID of the connection. */
            @JsonProperty("connection_id")
            fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

            /** The legal entity. */
            @JsonProperty("legal_entity")
            fun legalEntity(legalEntity: LegalEntity) = apply { this.legalEntity = legalEntity }

            /** The ID of the legal entity. */
            @JsonProperty("legal_entity_id")
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

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

            fun build(): ConnectionLegalEntityCreateBody =
                ConnectionLegalEntityCreateBody(
                    checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                    legalEntity,
                    legalEntityId,
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

        return other is ConnectionLegalEntityCreateParams &&
            this.connectionId == other.connectionId &&
            this.legalEntity == other.legalEntity &&
            this.legalEntityId == other.legalEntityId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            connectionId,
            legalEntity,
            legalEntityId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ConnectionLegalEntityCreateParams{connectionId=$connectionId, legalEntity=$legalEntity, legalEntityId=$legalEntityId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var connectionId: String? = null
        private var legalEntity: LegalEntity? = null
        private var legalEntityId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(connectionLegalEntityCreateParams: ConnectionLegalEntityCreateParams) =
            apply {
                this.connectionId = connectionLegalEntityCreateParams.connectionId
                this.legalEntity = connectionLegalEntityCreateParams.legalEntity
                this.legalEntityId = connectionLegalEntityCreateParams.legalEntityId
                additionalQueryParams(connectionLegalEntityCreateParams.additionalQueryParams)
                additionalHeaders(connectionLegalEntityCreateParams.additionalHeaders)
                additionalBodyProperties(connectionLegalEntityCreateParams.additionalBodyProperties)
            }

        /** The ID of the connection. */
        fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

        /** The legal entity. */
        fun legalEntity(legalEntity: LegalEntity) = apply { this.legalEntity = legalEntity }

        /** The ID of the legal entity. */
        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

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

        fun build(): ConnectionLegalEntityCreateParams =
            ConnectionLegalEntityCreateParams(
                checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                legalEntity,
                legalEntityId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** The legal entity. */
    @JsonDeserialize(builder = LegalEntity.Builder::class)
    @NoAutoDetect
    class LegalEntity
    private constructor(
        private val legalEntityType: LegalEntityType?,
        private val firstName: String?,
        private val lastName: String?,
        private val dateOfBirth: LocalDate?,
        private val dateFormed: LocalDate?,
        private val businessName: String?,
        private val doingBusinessAsNames: List<String>?,
        private val legalStructure: LegalStructure?,
        private val phoneNumbers: List<PhoneNumber>?,
        private val email: String?,
        private val website: String?,
        private val metadata: Metadata?,
        private val addresses: List<LegalEntityAddressCreateRequest>?,
        private val identifications: List<IdentificationCreateRequest>?,
        private val legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type") fun legalEntityType(): LegalEntityType? = legalEntityType

        /** An individual's first name. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** An individual's last name. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

        /** The business's legal business name. */
        @JsonProperty("business_name") fun businessName(): String? = businessName

        @JsonProperty("doing_business_as_names")
        fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

        /** The business's legal structure. */
        @JsonProperty("legal_structure") fun legalStructure(): LegalStructure? = legalStructure

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

        /** The entity's primary email. */
        @JsonProperty("email") fun email(): String? = email

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): String? = website

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        fun identifications(): List<IdentificationCreateRequest>? = identifications

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreateRequest>? =
            legalEntityAssociations

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntity &&
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
                this.legalEntityAssociations == other.legalEntityAssociations &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
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
                        legalEntityAssociations,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LegalEntity{legalEntityType=$legalEntityType, firstName=$firstName, lastName=$lastName, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, addresses=$addresses, identifications=$identifications, legalEntityAssociations=$legalEntityAssociations, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var legalEntityType: LegalEntityType? = null
            private var firstName: String? = null
            private var lastName: String? = null
            private var dateOfBirth: LocalDate? = null
            private var dateFormed: LocalDate? = null
            private var businessName: String? = null
            private var doingBusinessAsNames: List<String>? = null
            private var legalStructure: LegalStructure? = null
            private var phoneNumbers: List<PhoneNumber>? = null
            private var email: String? = null
            private var website: String? = null
            private var metadata: Metadata? = null
            private var addresses: List<LegalEntityAddressCreateRequest>? = null
            private var identifications: List<IdentificationCreateRequest>? = null
            private var legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntity: LegalEntity) = apply {
                this.legalEntityType = legalEntity.legalEntityType
                this.firstName = legalEntity.firstName
                this.lastName = legalEntity.lastName
                this.dateOfBirth = legalEntity.dateOfBirth
                this.dateFormed = legalEntity.dateFormed
                this.businessName = legalEntity.businessName
                this.doingBusinessAsNames = legalEntity.doingBusinessAsNames
                this.legalStructure = legalEntity.legalStructure
                this.phoneNumbers = legalEntity.phoneNumbers
                this.email = legalEntity.email
                this.website = legalEntity.website
                this.metadata = legalEntity.metadata
                this.addresses = legalEntity.addresses
                this.identifications = legalEntity.identifications
                this.legalEntityAssociations = legalEntity.legalEntityAssociations
                additionalProperties(legalEntity.additionalProperties)
            }

            /** The type of legal entity. */
            @JsonProperty("legal_entity_type")
            fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                this.legalEntityType = legalEntityType
            }

            /** An individual's first name. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** An individual's last name. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** An individual's date of birth (YYYY-MM-DD). */
            @JsonProperty("date_of_birth")
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            /** A business's formation date (YYYY-MM-DD). */
            @JsonProperty("date_formed")
            fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

            /** The business's legal business name. */
            @JsonProperty("business_name")
            fun businessName(businessName: String) = apply { this.businessName = businessName }

            @JsonProperty("doing_business_as_names")
            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames
            }

            /** The business's legal structure. */
            @JsonProperty("legal_structure")
            fun legalStructure(legalStructure: LegalStructure) = apply {
                this.legalStructure = legalStructure
            }

            @JsonProperty("phone_numbers")
            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The entity's primary email. */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** The entity's primary website URL. */
            @JsonProperty("website") fun website(website: String) = apply { this.website = website }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** A list of addresses for the entity. */
            @JsonProperty("addresses")
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                this.addresses = addresses
            }

            /** A list of identifications for the legal entity. */
            @JsonProperty("identifications")
            fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                this.identifications = identifications
            }

            /** The legal entity associations and its child legal entities. */
            @JsonProperty("legal_entity_associations")
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>
            ) = apply { this.legalEntityAssociations = legalEntityAssociations }

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

            fun build(): LegalEntity =
                LegalEntity(
                    legalEntityType,
                    firstName,
                    lastName,
                    dateOfBirth,
                    dateFormed,
                    businessName,
                    doingBusinessAsNames?.toUnmodifiable(),
                    legalStructure,
                    phoneNumbers?.toUnmodifiable(),
                    email,
                    website,
                    metadata,
                    addresses?.toUnmodifiable(),
                    identifications?.toUnmodifiable(),
                    legalEntityAssociations?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
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

                internal fun from(
                    legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                ) = apply {
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
                @JsonProperty("country")
                fun country(country: String) = apply { this.country = country }

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
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
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

                internal fun from(identificationCreateRequest: IdentificationCreateRequest) =
                    apply {
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

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                    val CL_RUT = IdType(JsonField.of("cl_rut"))

                    val CO_CEDULAS = IdType(JsonField.of("co_cedulas"))

                    val CO_NIT = IdType(JsonField.of("co_nit"))

                    val HN_ID = IdType(JsonField.of("hn_id"))

                    val HN_RTN = IdType(JsonField.of("hn_rtn"))

                    val PASSPORT = IdType(JsonField.of("passport"))

                    val SA_TIN = IdType(JsonField.of("sa_tin"))

                    val SA_VAT = IdType(JsonField.of("sa_vat"))

                    val US_EIN = IdType(JsonField.of("us_ein"))

                    val US_ITIN = IdType(JsonField.of("us_itin"))

                    val US_SSN = IdType(JsonField.of("us_ssn"))

                    val VN_TIN = IdType(JsonField.of("vn_tin"))

                    fun of(value: String) = IdType(JsonField.of(value))
                }

                enum class Known {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
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
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
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
                        CL_RUT -> Value.CL_RUT
                        CO_CEDULAS -> Value.CO_CEDULAS
                        CO_NIT -> Value.CO_NIT
                        HN_ID -> Value.HN_ID
                        HN_RTN -> Value.HN_RTN
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
                        CL_RUT -> Known.CL_RUT
                        CO_CEDULAS -> Known.CO_CEDULAS
                        CO_NIT -> Known.CO_NIT
                        HN_ID -> Known.HN_ID
                        HN_RTN -> Known.HN_RTN
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
            }
        }

        @JsonDeserialize(builder = LegalEntityAssociationInlineCreateRequest.Builder::class)
        @NoAutoDetect
        class LegalEntityAssociationInlineCreateRequest
        private constructor(
            private val relationshipTypes: List<RelationshipType>?,
            private val title: String?,
            private val ownershipPercentage: Long?,
            private val childLegalEntity: ChildLegalEntityCreate?,
            private val childLegalEntityId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("relationship_types")
            fun relationshipTypes(): List<RelationshipType>? = relationshipTypes

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") fun title(): String? = title

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            fun ownershipPercentage(): Long? = ownershipPercentage

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            fun childLegalEntity(): ChildLegalEntityCreate? = childLegalEntity

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            fun childLegalEntityId(): String? = childLegalEntityId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LegalEntityAssociationInlineCreateRequest &&
                    this.relationshipTypes == other.relationshipTypes &&
                    this.title == other.title &&
                    this.ownershipPercentage == other.ownershipPercentage &&
                    this.childLegalEntity == other.childLegalEntity &&
                    this.childLegalEntityId == other.childLegalEntityId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            relationshipTypes,
                            title,
                            ownershipPercentage,
                            childLegalEntity,
                            childLegalEntityId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, title=$title, ownershipPercentage=$ownershipPercentage, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var relationshipTypes: List<RelationshipType>? = null
                private var title: String? = null
                private var ownershipPercentage: Long? = null
                private var childLegalEntity: ChildLegalEntityCreate? = null
                private var childLegalEntityId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    legalEntityAssociationInlineCreateRequest:
                        LegalEntityAssociationInlineCreateRequest
                ) = apply {
                    this.relationshipTypes =
                        legalEntityAssociationInlineCreateRequest.relationshipTypes
                    this.title = legalEntityAssociationInlineCreateRequest.title
                    this.ownershipPercentage =
                        legalEntityAssociationInlineCreateRequest.ownershipPercentage
                    this.childLegalEntity =
                        legalEntityAssociationInlineCreateRequest.childLegalEntity
                    this.childLegalEntityId =
                        legalEntityAssociationInlineCreateRequest.childLegalEntityId
                    additionalProperties(
                        legalEntityAssociationInlineCreateRequest.additionalProperties
                    )
                }

                @JsonProperty("relationship_types")
                fun relationshipTypes(relationshipTypes: List<RelationshipType>) = apply {
                    this.relationshipTypes = relationshipTypes
                }

                /** The job title of the child entity at the parent entity. */
                @JsonProperty("title") fun title(title: String) = apply { this.title = title }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                @JsonProperty("ownership_percentage")
                fun ownershipPercentage(ownershipPercentage: Long) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The child legal entity. */
                @JsonProperty("child_legal_entity")
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The ID of the child legal entity. */
                @JsonProperty("child_legal_entity_id")
                fun childLegalEntityId(childLegalEntityId: String) = apply {
                    this.childLegalEntityId = childLegalEntityId
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

                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkNotNull(relationshipTypes) {
                                "`relationshipTypes` is required but was not set"
                            }
                            .toUnmodifiable(),
                        title,
                        ownershipPercentage,
                        childLegalEntity,
                        childLegalEntityId,
                        additionalProperties.toUnmodifiable(),
                    )
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
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RelationshipType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The child legal entity. */
            @JsonDeserialize(builder = ChildLegalEntityCreate.Builder::class)
            @NoAutoDetect
            class ChildLegalEntityCreate
            private constructor(
                private val legalEntityType: LegalEntityType?,
                private val firstName: String?,
                private val lastName: String?,
                private val dateOfBirth: LocalDate?,
                private val dateFormed: LocalDate?,
                private val businessName: String?,
                private val doingBusinessAsNames: List<String>?,
                private val legalStructure: LegalStructure?,
                private val phoneNumbers: List<PhoneNumber>?,
                private val email: String?,
                private val website: String?,
                private val metadata: Metadata?,
                private val addresses: List<LegalEntityAddressCreateRequest>?,
                private val identifications: List<IdentificationCreateRequest>?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                fun legalEntityType(): LegalEntityType? = legalEntityType

                /** An individual's first name. */
                @JsonProperty("first_name") fun firstName(): String? = firstName

                /** An individual's last name. */
                @JsonProperty("last_name") fun lastName(): String? = lastName

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

                /** The business's legal business name. */
                @JsonProperty("business_name") fun businessName(): String? = businessName

                @JsonProperty("doing_business_as_names")
                fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                fun legalStructure(): LegalStructure? = legalStructure

                @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

                /** The entity's primary email. */
                @JsonProperty("email") fun email(): String? = email

                /** The entity's primary website URL. */
                @JsonProperty("website") fun website(): String? = website

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                fun identifications(): List<IdentificationCreateRequest>? = identifications

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChildLegalEntityCreate &&
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
                    "ChildLegalEntityCreate{legalEntityType=$legalEntityType, firstName=$firstName, lastName=$lastName, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, addresses=$addresses, identifications=$identifications, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var legalEntityType: LegalEntityType? = null
                    private var firstName: String? = null
                    private var lastName: String? = null
                    private var dateOfBirth: LocalDate? = null
                    private var dateFormed: LocalDate? = null
                    private var businessName: String? = null
                    private var doingBusinessAsNames: List<String>? = null
                    private var legalStructure: LegalStructure? = null
                    private var phoneNumbers: List<PhoneNumber>? = null
                    private var email: String? = null
                    private var website: String? = null
                    private var metadata: Metadata? = null
                    private var addresses: List<LegalEntityAddressCreateRequest>? = null
                    private var identifications: List<IdentificationCreateRequest>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
                        this.legalEntityType = childLegalEntityCreate.legalEntityType
                        this.firstName = childLegalEntityCreate.firstName
                        this.lastName = childLegalEntityCreate.lastName
                        this.dateOfBirth = childLegalEntityCreate.dateOfBirth
                        this.dateFormed = childLegalEntityCreate.dateFormed
                        this.businessName = childLegalEntityCreate.businessName
                        this.doingBusinessAsNames = childLegalEntityCreate.doingBusinessAsNames
                        this.legalStructure = childLegalEntityCreate.legalStructure
                        this.phoneNumbers = childLegalEntityCreate.phoneNumbers
                        this.email = childLegalEntityCreate.email
                        this.website = childLegalEntityCreate.website
                        this.metadata = childLegalEntityCreate.metadata
                        this.addresses = childLegalEntityCreate.addresses
                        this.identifications = childLegalEntityCreate.identifications
                        additionalProperties(childLegalEntityCreate.additionalProperties)
                    }

                    /** The type of legal entity. */
                    @JsonProperty("legal_entity_type")
                    fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                        this.legalEntityType = legalEntityType
                    }

                    /** An individual's first name. */
                    @JsonProperty("first_name")
                    fun firstName(firstName: String) = apply { this.firstName = firstName }

                    /** An individual's last name. */
                    @JsonProperty("last_name")
                    fun lastName(lastName: String) = apply { this.lastName = lastName }

                    /** An individual's date of birth (YYYY-MM-DD). */
                    @JsonProperty("date_of_birth")
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A business's formation date (YYYY-MM-DD). */
                    @JsonProperty("date_formed")
                    fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

                    /** The business's legal business name. */
                    @JsonProperty("business_name")
                    fun businessName(businessName: String) = apply {
                        this.businessName = businessName
                    }

                    @JsonProperty("doing_business_as_names")
                    fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                        this.doingBusinessAsNames = doingBusinessAsNames
                    }

                    /** The business's legal structure. */
                    @JsonProperty("legal_structure")
                    fun legalStructure(legalStructure: LegalStructure) = apply {
                        this.legalStructure = legalStructure
                    }

                    @JsonProperty("phone_numbers")
                    fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                        this.phoneNumbers = phoneNumbers
                    }

                    /** The entity's primary email. */
                    @JsonProperty("email") fun email(email: String) = apply { this.email = email }

                    /** The entity's primary website URL. */
                    @JsonProperty("website")
                    fun website(website: String) = apply { this.website = website }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /** A list of addresses for the entity. */
                    @JsonProperty("addresses")
                    fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                        this.addresses = addresses
                    }

                    /** A list of identifications for the legal entity. */
                    @JsonProperty("identifications")
                    fun identifications(identifications: List<IdentificationCreateRequest>) =
                        apply {
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ChildLegalEntityCreate =
                        ChildLegalEntityCreate(
                            legalEntityType,
                            firstName,
                            lastName,
                            dateOfBirth,
                            dateFormed,
                            businessName,
                            doingBusinessAsNames?.toUnmodifiable(),
                            legalStructure,
                            phoneNumbers?.toUnmodifiable(),
                            email,
                            website,
                            metadata,
                            addresses?.toUnmodifiable(),
                            identifications?.toUnmodifiable(),
                            additionalProperties.toUnmodifiable(),
                        )
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
                    @JsonProperty("address_types")
                    fun addressTypes(): List<AddressType>? = addressTypes

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                        ) = apply {
                            this.addressTypes = legalEntityAddressCreateRequest.addressTypes
                            this.line1 = legalEntityAddressCreateRequest.line1
                            this.line2 = legalEntityAddressCreateRequest.line2
                            this.locality = legalEntityAddressCreateRequest.locality
                            this.region = legalEntityAddressCreateRequest.region
                            this.postalCode = legalEntityAddressCreateRequest.postalCode
                            this.country = legalEntityAddressCreateRequest.country
                            additionalProperties(
                                legalEntityAddressCreateRequest.additionalProperties
                            )
                        }

                        /** The types of this address. */
                        @JsonProperty("address_types")
                        fun addressTypes(addressTypes: List<AddressType>) = apply {
                            this.addressTypes = addressTypes
                        }

                        @JsonProperty("line1")
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        @JsonProperty("line2")
                        fun line2(line2: String) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        @JsonProperty("locality")
                        fun locality(locality: String) = apply { this.locality = locality }

                        /** Region or State. */
                        @JsonProperty("region")
                        fun region(region: String) = apply { this.region = region }

                        /** The postal code of the address. */
                        @JsonProperty("postal_code")
                        fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AddressType: $value"
                                    )
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

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            identificationCreateRequest: IdentificationCreateRequest
                        ) = apply {
                            this.idNumber = identificationCreateRequest.idNumber
                            this.idType = identificationCreateRequest.idType
                            this.issuingCountry = identificationCreateRequest.issuingCountry
                            additionalProperties(identificationCreateRequest.additionalProperties)
                        }

                        /** The ID number of identification document. */
                        @JsonProperty("id_number")
                        fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                        /** The type of ID number. */
                        @JsonProperty("id_type")
                        fun idType(idType: IdType) = apply { this.idType = idType }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        @JsonProperty("issuing_country")
                        fun issuingCountry(issuingCountry: String) = apply {
                            this.issuingCountry = issuingCountry
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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

                            val CL_RUT = IdType(JsonField.of("cl_rut"))

                            val CO_CEDULAS = IdType(JsonField.of("co_cedulas"))

                            val CO_NIT = IdType(JsonField.of("co_nit"))

                            val HN_ID = IdType(JsonField.of("hn_id"))

                            val HN_RTN = IdType(JsonField.of("hn_rtn"))

                            val PASSPORT = IdType(JsonField.of("passport"))

                            val SA_TIN = IdType(JsonField.of("sa_tin"))

                            val SA_VAT = IdType(JsonField.of("sa_vat"))

                            val US_EIN = IdType(JsonField.of("us_ein"))

                            val US_ITIN = IdType(JsonField.of("us_itin"))

                            val US_SSN = IdType(JsonField.of("us_ssn"))

                            val VN_TIN = IdType(JsonField.of("vn_tin"))

                            fun of(value: String) = IdType(JsonField.of(value))
                        }

                        enum class Known {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
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
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
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
                                CL_RUT -> Value.CL_RUT
                                CO_CEDULAS -> Value.CO_CEDULAS
                                CO_NIT -> Value.CO_NIT
                                HN_ID -> Value.HN_ID
                                HN_RTN -> Value.HN_RTN
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
                                CL_RUT -> Known.CL_RUT
                                CO_CEDULAS -> Known.CO_CEDULAS
                                CO_NIT -> Known.CO_NIT
                                HN_ID -> Known.HN_ID
                                HN_RTN -> Known.HN_RTN
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
                    }
                }

                class LegalEntityType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalEntityType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class LegalStructure
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                        val SOLE_PROPRIETORSHIP =
                            LegalStructure(JsonField.of("sole_proprietorship"))

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
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalStructure: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(phoneNumber: PhoneNumber) = apply {
                            this.phoneNumber = phoneNumber.phoneNumber
                            additionalProperties(phoneNumber.additionalProperties)
                        }

                        @JsonProperty("phone_number")
                        fun phoneNumber(phoneNumber: String) = apply {
                            this.phoneNumber = phoneNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PhoneNumber =
                            PhoneNumber(phoneNumber, additionalProperties.toUnmodifiable())
                    }
                }
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toUnmodifiable())
            }
        }
    }
}
