// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class ExternalAccountUpdateParams
constructor(
    private val id: String,
    private val accountType: ExternalAccountType?,
    private val counterpartyId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val partyAddress: AddressRequest?,
    private val partyName: String?,
    private val partyType: PartyType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun accountType(): ExternalAccountType? = accountType

    fun counterpartyId(): String? = counterpartyId

    fun metadata(): Metadata? = metadata

    fun name(): String? = name

    fun partyAddress(): AddressRequest? = partyAddress

    fun partyName(): String? = partyName

    fun partyType(): PartyType? = partyType

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): ExternalAccountUpdateBody {
        return ExternalAccountUpdateBody(
            accountType,
            counterpartyId,
            metadata,
            name,
            partyAddress,
            partyName,
            partyType,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalAccountUpdateBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountUpdateBody
    internal constructor(
        private val accountType: ExternalAccountType?,
        private val counterpartyId: String?,
        private val metadata: Metadata?,
        private val name: String?,
        private val partyAddress: AddressRequest?,
        private val partyName: String?,
        private val partyType: PartyType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

        /** Either `individual` or `business`. */
        @JsonProperty("party_type") fun partyType(): PartyType? = partyType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountType: ExternalAccountType? = null
            private var counterpartyId: String? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var partyAddress: AddressRequest? = null
            private var partyName: String? = null
            private var partyType: PartyType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalAccountUpdateBody: ExternalAccountUpdateBody) = apply {
                this.accountType = externalAccountUpdateBody.accountType
                this.counterpartyId = externalAccountUpdateBody.counterpartyId
                this.metadata = externalAccountUpdateBody.metadata
                this.name = externalAccountUpdateBody.name
                this.partyAddress = externalAccountUpdateBody.partyAddress
                this.partyName = externalAccountUpdateBody.partyName
                this.partyType = externalAccountUpdateBody.partyType
                additionalProperties(externalAccountUpdateBody.additionalProperties)
            }

            /** Can be `checking`, `savings` or `other`. */
            @JsonProperty("account_type")
            fun accountType(accountType: ExternalAccountType) = apply {
                this.accountType = accountType
            }

            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("party_address")
            fun partyAddress(partyAddress: AddressRequest) = apply {
                this.partyAddress = partyAddress
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            @JsonProperty("party_type")
            fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

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

            fun build(): ExternalAccountUpdateBody =
                ExternalAccountUpdateBody(
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

            return /* spotless:off */ other is ExternalAccountUpdateBody && accountType == other.accountType && counterpartyId == other.counterpartyId && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyName == other.partyName && partyType == other.partyType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountType, counterpartyId, metadata, name, partyAddress, partyName, partyType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountUpdateBody{accountType=$accountType, counterpartyId=$counterpartyId, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyName=$partyName, partyType=$partyType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var accountType: ExternalAccountType? = null
        private var counterpartyId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var partyAddress: AddressRequest? = null
        private var partyName: String? = null
        private var partyType: PartyType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountUpdateParams: ExternalAccountUpdateParams) = apply {
            id = externalAccountUpdateParams.id
            accountType = externalAccountUpdateParams.accountType
            counterpartyId = externalAccountUpdateParams.counterpartyId
            metadata = externalAccountUpdateParams.metadata
            name = externalAccountUpdateParams.name
            partyAddress = externalAccountUpdateParams.partyAddress
            partyName = externalAccountUpdateParams.partyName
            partyType = externalAccountUpdateParams.partyType
            additionalHeaders = externalAccountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                externalAccountUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String) = apply { this.id = id }

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: ExternalAccountType) = apply { this.accountType = accountType }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: String) = apply { this.name = name }

        fun partyAddress(partyAddress: AddressRequest) = apply { this.partyAddress = partyAddress }

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(partyName: String) = apply { this.partyName = partyName }

        /** Either `individual` or `business`. */
        fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ExternalAccountUpdateParams =
            ExternalAccountUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                accountType,
                counterpartyId,
                metadata,
                name,
                partyAddress,
                partyName,
                partyType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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

    @JsonDeserialize(builder = AddressRequest.Builder::class)
    @NoAutoDetect
    class AddressRequest
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addressRequest: AddressRequest) = apply {
                this.line1 = addressRequest.line1
                this.line2 = addressRequest.line2
                this.locality = addressRequest.locality
                this.region = addressRequest.region
                this.postalCode = addressRequest.postalCode
                this.country = addressRequest.country
                additionalProperties(addressRequest.additionalProperties)
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
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): AddressRequest =
                AddressRequest(
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddressRequest && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    class PartyType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BUSINESS = PartyType(JsonField.of("business"))

            val INDIVIDUAL = PartyType(JsonField.of("individual"))

            fun of(value: String) = PartyType(JsonField.of(value))
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
                else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountUpdateParams && id == other.id && accountType == other.accountType && counterpartyId == other.counterpartyId && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyName == other.partyName && partyType == other.partyType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, accountType, counterpartyId, metadata, name, partyAddress, partyName, partyType, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ExternalAccountUpdateParams{id=$id, accountType=$accountType, counterpartyId=$counterpartyId, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyName=$partyName, partyType=$partyType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
