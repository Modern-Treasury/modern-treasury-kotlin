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

class LegalEntityUpdateParams
constructor(
    private val id: String,
    private val businessName: String?,
    private val dateOfBirth: LocalDate?,
    private val doingBusinessAsNames: List<String>?,
    private val email: String?,
    private val firstName: String?,
    private val lastName: String?,
    private val legalStructure: LegalStructure?,
    private val metadata: Metadata?,
    private val phoneNumbers: List<PhoneNumber>?,
    private val website: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun businessName(): String? = businessName

    fun dateOfBirth(): LocalDate? = dateOfBirth

    fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

    fun email(): String? = email

    fun firstName(): String? = firstName

    fun lastName(): String? = lastName

    fun legalStructure(): LegalStructure? = legalStructure

    fun metadata(): Metadata? = metadata

    fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

    fun website(): String? = website

    internal fun getBody(): LegalEntityUpdateBody {
        return LegalEntityUpdateBody(
            businessName,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
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

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = LegalEntityUpdateBody.Builder::class)
    @NoAutoDetect
    class LegalEntityUpdateBody
    internal constructor(
        private val businessName: String?,
        private val dateOfBirth: LocalDate?,
        private val doingBusinessAsNames: List<String>?,
        private val email: String?,
        private val firstName: String?,
        private val lastName: String?,
        private val legalStructure: LegalStructure?,
        private val metadata: Metadata?,
        private val phoneNumbers: List<PhoneNumber>?,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

            return other is LegalEntityUpdateBody &&
                this.businessName == other.businessName &&
                this.dateOfBirth == other.dateOfBirth &&
                this.doingBusinessAsNames == other.doingBusinessAsNames &&
                this.email == other.email &&
                this.firstName == other.firstName &&
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
                        businessName,
                        dateOfBirth,
                        doingBusinessAsNames,
                        email,
                        firstName,
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
            "LegalEntityUpdateBody{businessName=$businessName, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, phoneNumbers=$phoneNumbers, website=$website, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var businessName: String? = null
            private var dateOfBirth: LocalDate? = null
            private var doingBusinessAsNames: List<String>? = null
            private var email: String? = null
            private var firstName: String? = null
            private var lastName: String? = null
            private var legalStructure: LegalStructure? = null
            private var metadata: Metadata? = null
            private var phoneNumbers: List<PhoneNumber>? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityUpdateBody: LegalEntityUpdateBody) = apply {
                this.businessName = legalEntityUpdateBody.businessName
                this.dateOfBirth = legalEntityUpdateBody.dateOfBirth
                this.doingBusinessAsNames = legalEntityUpdateBody.doingBusinessAsNames
                this.email = legalEntityUpdateBody.email
                this.firstName = legalEntityUpdateBody.firstName
                this.lastName = legalEntityUpdateBody.lastName
                this.legalStructure = legalEntityUpdateBody.legalStructure
                this.metadata = legalEntityUpdateBody.metadata
                this.phoneNumbers = legalEntityUpdateBody.phoneNumbers
                this.website = legalEntityUpdateBody.website
                additionalProperties(legalEntityUpdateBody.additionalProperties)
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

            fun build(): LegalEntityUpdateBody =
                LegalEntityUpdateBody(
                    businessName,
                    dateOfBirth,
                    doingBusinessAsNames?.toUnmodifiable(),
                    email,
                    firstName,
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

        return other is LegalEntityUpdateParams &&
            this.id == other.id &&
            this.businessName == other.businessName &&
            this.dateOfBirth == other.dateOfBirth &&
            this.doingBusinessAsNames == other.doingBusinessAsNames &&
            this.email == other.email &&
            this.firstName == other.firstName &&
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
            id,
            businessName,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
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
        "LegalEntityUpdateParams{id=$id, businessName=$businessName, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, phoneNumbers=$phoneNumbers, website=$website, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var businessName: String? = null
        private var dateOfBirth: LocalDate? = null
        private var doingBusinessAsNames: MutableList<String> = mutableListOf()
        private var email: String? = null
        private var firstName: String? = null
        private var lastName: String? = null
        private var legalStructure: LegalStructure? = null
        private var metadata: Metadata? = null
        private var phoneNumbers: MutableList<PhoneNumber> = mutableListOf()
        private var website: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityUpdateParams: LegalEntityUpdateParams) = apply {
            this.id = legalEntityUpdateParams.id
            this.businessName = legalEntityUpdateParams.businessName
            this.dateOfBirth = legalEntityUpdateParams.dateOfBirth
            this.doingBusinessAsNames(legalEntityUpdateParams.doingBusinessAsNames ?: listOf())
            this.email = legalEntityUpdateParams.email
            this.firstName = legalEntityUpdateParams.firstName
            this.lastName = legalEntityUpdateParams.lastName
            this.legalStructure = legalEntityUpdateParams.legalStructure
            this.metadata = legalEntityUpdateParams.metadata
            this.phoneNumbers(legalEntityUpdateParams.phoneNumbers ?: listOf())
            this.website = legalEntityUpdateParams.website
            additionalQueryParams(legalEntityUpdateParams.additionalQueryParams)
            additionalHeaders(legalEntityUpdateParams.additionalHeaders)
            additionalBodyProperties(legalEntityUpdateParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

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

        fun build(): LegalEntityUpdateParams =
            LegalEntityUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                businessName,
                dateOfBirth,
                if (doingBusinessAsNames.size == 0) null else doingBusinessAsNames.toUnmodifiable(),
                email,
                firstName,
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
