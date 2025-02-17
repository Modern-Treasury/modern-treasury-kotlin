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
import java.util.Objects

/** update external account */
class ExternalAccountUpdateParams
private constructor(
    private val id: String,
    private val body: ExternalAccountUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /** Can be `checking`, `savings` or `other`. */
    fun accountType(): ExternalAccountType? = body.accountType()

    fun counterpartyId(): String? = body.counterpartyId()

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * A nickname for the external account. This is only for internal usage and won't affect any
     * payments
     */
    fun name(): String? = body.name()

    fun partyAddress(): AddressRequest? = body.partyAddress()

    /** If this value isn't provided, it will be inherited from the counterparty's name. */
    fun partyName(): String? = body.partyName()

    /** Either `individual` or `business`. */
    fun partyType(): PartyType? = body.partyType()

    /** Can be `checking`, `savings` or `other`. */
    fun _accountType(): JsonField<ExternalAccountType> = body._accountType()

    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * A nickname for the external account. This is only for internal usage and won't affect any
     * payments
     */
    fun _name(): JsonField<String> = body._name()

    fun _partyAddress(): JsonField<AddressRequest> = body._partyAddress()

    /** If this value isn't provided, it will be inherited from the counterparty's name. */
    fun _partyName(): JsonField<String> = body._partyName()

    /** Either `individual` or `business`. */
    fun _partyType(): JsonField<PartyType> = body._partyType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): ExternalAccountUpdateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class ExternalAccountUpdateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("account_type")
        @ExcludeMissing
        private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        private val counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_address")
        @ExcludeMissing
        private val partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
        @JsonProperty("party_name")
        @ExcludeMissing
        private val partyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_type")
        @ExcludeMissing
        private val partyType: JsonField<PartyType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

        fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(): String? = name.getNullable("name")

        fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(): String? = partyName.getNullable("party_name")

        /** Either `individual` or `business`. */
        fun partyType(): PartyType? = partyType.getNullable("party_type")

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<ExternalAccountType> = accountType

        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<AddressRequest> = partyAddress

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /** Either `individual` or `business`. */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): JsonField<PartyType> = partyType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalAccountUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            accountType()
            counterpartyId()
            metadata()?.validate()
            name()
            partyAddress()?.validate()
            partyName()
            partyType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ExternalAccountUpdateRequest]. */
        class Builder internal constructor() {

            private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
            private var counterpartyId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
            private var partyName: JsonField<String> = JsonMissing.of()
            private var partyType: JsonField<PartyType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalAccountUpdateRequest: ExternalAccountUpdateRequest) = apply {
                accountType = externalAccountUpdateRequest.accountType
                counterpartyId = externalAccountUpdateRequest.counterpartyId
                metadata = externalAccountUpdateRequest.metadata
                name = externalAccountUpdateRequest.name
                partyAddress = externalAccountUpdateRequest.partyAddress
                partyName = externalAccountUpdateRequest.partyName
                partyType = externalAccountUpdateRequest.partyType
                additionalProperties =
                    externalAccountUpdateRequest.additionalProperties.toMutableMap()
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun counterpartyId(counterpartyId: String?) =
                counterpartyId(JsonField.ofNullable(counterpartyId))

            fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                this.counterpartyId = counterpartyId
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun partyAddress(partyAddress: AddressRequest) =
                partyAddress(JsonField.of(partyAddress))

            fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                this.partyAddress = partyAddress
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

            /** Either `individual` or `business`. */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

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

            fun build(): ExternalAccountUpdateRequest =
                ExternalAccountUpdateRequest(
                    accountType,
                    counterpartyId,
                    metadata,
                    name,
                    partyAddress,
                    partyName,
                    partyType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountUpdateRequest && accountType == other.accountType && counterpartyId == other.counterpartyId && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyName == other.partyName && partyType == other.partyType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountType, counterpartyId, metadata, name, partyAddress, partyName, partyType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountUpdateRequest{accountType=$accountType, counterpartyId=$counterpartyId, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyName=$partyName, partyType=$partyType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ExternalAccountUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var body: ExternalAccountUpdateRequest.Builder =
            ExternalAccountUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(externalAccountUpdateParams: ExternalAccountUpdateParams) = apply {
            id = externalAccountUpdateParams.id
            body = externalAccountUpdateParams.body.toBuilder()
            additionalHeaders = externalAccountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: ExternalAccountType) = apply { body.accountType(accountType) }

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
            body.accountType(accountType)
        }

        fun counterpartyId(counterpartyId: String?) = apply { body.counterpartyId(counterpartyId) }

        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun partyAddress(partyAddress: AddressRequest) = apply { body.partyAddress(partyAddress) }

        fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
            body.partyAddress(partyAddress)
        }

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(partyName: String) = apply { body.partyName(partyName) }

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(partyName: JsonField<String>) = apply { body.partyName(partyName) }

        /** Either `individual` or `business`. */
        fun partyType(partyType: PartyType?) = apply { body.partyType(partyType) }

        /** Either `individual` or `business`. */
        fun partyType(partyType: JsonField<PartyType>) = apply { body.partyType(partyType) }

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

        fun build(): ExternalAccountUpdateParams =
            ExternalAccountUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
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

    @NoAutoDetect
    class AddressRequest
    @JsonCreator
    private constructor(
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddressRequest = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            line2()
            locality()
            postalCode()
            region()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [AddressRequest]. */
        class Builder internal constructor() {

            private var country: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addressRequest: AddressRequest) = apply {
                country = addressRequest.country
                line1 = addressRequest.line1
                line2 = addressRequest.line2
                locality = addressRequest.locality
                postalCode = addressRequest.postalCode
                region = addressRequest.region
                additionalProperties = addressRequest.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

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

            fun build(): AddressRequest =
                AddressRequest(
                    country,
                    line1,
                    line2,
                    locality,
                    postalCode,
                    region,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
    }

    /** Either `individual` or `business`. */
    class PartyType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            fun of(value: String) = PartyType(JsonField.of(value))
        }

        /** An enum containing [PartyType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        /**
         * An enum containing [PartyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PartyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /**
             * An enum member indicating that [PartyType] was instantiated with an unknown value.
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
                else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalAccountUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
