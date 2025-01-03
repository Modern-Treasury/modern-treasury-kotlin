// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

class InternalAccountCreateParams
constructor(
    private val body: InternalAccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the financial institution the account belongs to. */
    fun connectionId(): String = body.connectionId()

    /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
    fun currency(): Currency = body.currency()

    /** The nickname of the account. */
    fun name(): String = body.name()

    /** The legal name of the entity which owns the account. */
    fun partyName(): String = body.partyName()

    /** The Counterparty associated to this account. */
    fun counterpartyId(): String? = body.counterpartyId()

    /** The LegalEntity associated to this account. */
    fun legalEntityId(): String? = body.legalEntityId()

    /** The parent internal account of this new account. */
    fun parentAccountId(): String? = body.parentAccountId()

    /** The address associated with the owner or null. */
    fun partyAddress(): PartyAddress? = body.partyAddress()

    /**
     * A hash of vendor specific attributes that will be used when creating the account at the
     * vendor specified by the given connection.
     */
    fun vendorAttributes(): VendorAttributes? = body.vendorAttributes()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): InternalAccountCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InternalAccountCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("connection_id") private val connectionId: String,
        @JsonProperty("currency") private val currency: Currency,
        @JsonProperty("name") private val name: String,
        @JsonProperty("party_name") private val partyName: String,
        @JsonProperty("counterparty_id") private val counterpartyId: String?,
        @JsonProperty("legal_entity_id") private val legalEntityId: String?,
        @JsonProperty("parent_account_id") private val parentAccountId: String?,
        @JsonProperty("party_address") private val partyAddress: PartyAddress?,
        @JsonProperty("vendor_attributes") private val vendorAttributes: VendorAttributes?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the financial institution the account belongs to. */
        @JsonProperty("connection_id") fun connectionId(): String = connectionId

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        @JsonProperty("currency") fun currency(): Currency = currency

        /** The nickname of the account. */
        @JsonProperty("name") fun name(): String = name

        /** The legal name of the entity which owns the account. */
        @JsonProperty("party_name") fun partyName(): String = partyName

        /** The Counterparty associated to this account. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** The LegalEntity associated to this account. */
        @JsonProperty("legal_entity_id") fun legalEntityId(): String? = legalEntityId

        /** The parent internal account of this new account. */
        @JsonProperty("parent_account_id") fun parentAccountId(): String? = parentAccountId

        /** The address associated with the owner or null. */
        @JsonProperty("party_address") fun partyAddress(): PartyAddress? = partyAddress

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        @JsonProperty("vendor_attributes")
        fun vendorAttributes(): VendorAttributes? = vendorAttributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var connectionId: String? = null
            private var currency: Currency? = null
            private var name: String? = null
            private var partyName: String? = null
            private var counterpartyId: String? = null
            private var legalEntityId: String? = null
            private var parentAccountId: String? = null
            private var partyAddress: PartyAddress? = null
            private var vendorAttributes: VendorAttributes? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(internalAccountCreateBody: InternalAccountCreateBody) = apply {
                connectionId = internalAccountCreateBody.connectionId
                currency = internalAccountCreateBody.currency
                name = internalAccountCreateBody.name
                partyName = internalAccountCreateBody.partyName
                counterpartyId = internalAccountCreateBody.counterpartyId
                legalEntityId = internalAccountCreateBody.legalEntityId
                parentAccountId = internalAccountCreateBody.parentAccountId
                partyAddress = internalAccountCreateBody.partyAddress
                vendorAttributes = internalAccountCreateBody.vendorAttributes
                additionalProperties = internalAccountCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier of the financial institution the account belongs to. */
            fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

            /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The nickname of the account. */
            fun name(name: String) = apply { this.name = name }

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            /** The Counterparty associated to this account. */
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The LegalEntity associated to this account. */
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            /** The parent internal account of this new account. */
            fun parentAccountId(parentAccountId: String) = apply {
                this.parentAccountId = parentAccountId
            }

            /** The address associated with the owner or null. */
            fun partyAddress(partyAddress: PartyAddress) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A hash of vendor specific attributes that will be used when creating the account at
             * the vendor specified by the given connection.
             */
            fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
                this.vendorAttributes = vendorAttributes
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

            fun build(): InternalAccountCreateBody =
                InternalAccountCreateBody(
                    checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(partyName) { "`partyName` is required but was not set" },
                    counterpartyId,
                    legalEntityId,
                    parentAccountId,
                    partyAddress,
                    vendorAttributes,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InternalAccountCreateBody && connectionId == other.connectionId && currency == other.currency && name == other.name && partyName == other.partyName && counterpartyId == other.counterpartyId && legalEntityId == other.legalEntityId && parentAccountId == other.parentAccountId && partyAddress == other.partyAddress && vendorAttributes == other.vendorAttributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(connectionId, currency, name, partyName, counterpartyId, legalEntityId, parentAccountId, partyAddress, vendorAttributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InternalAccountCreateBody{connectionId=$connectionId, currency=$currency, name=$name, partyName=$partyName, counterpartyId=$counterpartyId, legalEntityId=$legalEntityId, parentAccountId=$parentAccountId, partyAddress=$partyAddress, vendorAttributes=$vendorAttributes, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: InternalAccountCreateBody.Builder = InternalAccountCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(internalAccountCreateParams: InternalAccountCreateParams) = apply {
            body = internalAccountCreateParams.body.toBuilder()
            additionalHeaders = internalAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = internalAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the financial institution the account belongs to. */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /** The nickname of the account. */
        fun name(name: String) = apply { body.name(name) }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = apply { body.partyName(partyName) }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /** The LegalEntity associated to this account. */
        fun legalEntityId(legalEntityId: String) = apply { body.legalEntityId(legalEntityId) }

        /** The parent internal account of this new account. */
        fun parentAccountId(parentAccountId: String) = apply {
            body.parentAccountId(parentAccountId)
        }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: PartyAddress) = apply { body.partyAddress(partyAddress) }

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
            body.vendorAttributes(vendorAttributes)
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

        fun build(): InternalAccountCreateParams =
            InternalAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val USD = of("USD")

            val CAD = of("CAD")

            fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            USD,
            CAD,
        }

        enum class Value {
            USD,
            CAD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USD -> Value.USD
                CAD -> Value.CAD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USD -> Known.USD
                CAD -> Known.CAD
                else -> throw ModernTreasuryInvalidDataException("Unknown Currency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The address associated with the owner or null. */
    @NoAutoDetect
    class PartyAddress
    @JsonCreator
    private constructor(
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("country") private val country: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("line1") fun line1(): String = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

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

            internal fun from(partyAddress: PartyAddress) = apply {
                line1 = partyAddress.line1
                line2 = partyAddress.line2
                locality = partyAddress.locality
                region = partyAddress.region
                postalCode = partyAddress.postalCode
                country = partyAddress.country
                additionalProperties = partyAddress.additionalProperties.toMutableMap()
            }

            fun line1(line1: String) = apply { this.line1 = line1 }

            fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

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

            fun build(): PartyAddress =
                PartyAddress(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartyAddress && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PartyAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    /**
     * A hash of vendor specific attributes that will be used when creating the account at the
     * vendor specified by the given connection.
     */
    @NoAutoDetect
    class VendorAttributes
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

            internal fun from(vendorAttributes: VendorAttributes) = apply {
                additionalProperties = vendorAttributes.additionalProperties.toMutableMap()
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

            fun build(): VendorAttributes = VendorAttributes(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VendorAttributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "VendorAttributes{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InternalAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InternalAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
