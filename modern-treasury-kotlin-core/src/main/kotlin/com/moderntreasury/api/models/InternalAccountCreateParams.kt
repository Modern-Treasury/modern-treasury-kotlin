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
import java.util.Objects

class InternalAccountCreateParams
constructor(
    private val connectionId: String,
    private val currency: Currency,
    private val name: String,
    private val partyName: String,
    private val counterpartyId: String?,
    private val legalEntityId: String?,
    private val parentAccountId: String?,
    private val partyAddress: PartyAddress?,
    private val vendorAttributes: VendorAttributes?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun connectionId(): String = connectionId

    fun currency(): Currency = currency

    fun name(): String = name

    fun partyName(): String = partyName

    fun counterpartyId(): String? = counterpartyId

    fun legalEntityId(): String? = legalEntityId

    fun parentAccountId(): String? = parentAccountId

    fun partyAddress(): PartyAddress? = partyAddress

    fun vendorAttributes(): VendorAttributes? = vendorAttributes

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): InternalAccountCreateBody {
        return InternalAccountCreateBody(
            connectionId,
            currency,
            name,
            partyName,
            counterpartyId,
            legalEntityId,
            parentAccountId,
            partyAddress,
            vendorAttributes,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = InternalAccountCreateBody.Builder::class)
    @NoAutoDetect
    class InternalAccountCreateBody
    internal constructor(
        private val connectionId: String?,
        private val currency: Currency?,
        private val name: String?,
        private val partyName: String?,
        private val counterpartyId: String?,
        private val legalEntityId: String?,
        private val parentAccountId: String?,
        private val partyAddress: PartyAddress?,
        private val vendorAttributes: VendorAttributes?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the financial institution the account belongs to. */
        @JsonProperty("connection_id") fun connectionId(): String? = connectionId

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** The nickname of the account. */
        @JsonProperty("name") fun name(): String? = name

        /** The legal name of the entity which owns the account. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

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
                this.connectionId = internalAccountCreateBody.connectionId
                this.currency = internalAccountCreateBody.currency
                this.name = internalAccountCreateBody.name
                this.partyName = internalAccountCreateBody.partyName
                this.counterpartyId = internalAccountCreateBody.counterpartyId
                this.legalEntityId = internalAccountCreateBody.legalEntityId
                this.parentAccountId = internalAccountCreateBody.parentAccountId
                this.partyAddress = internalAccountCreateBody.partyAddress
                this.vendorAttributes = internalAccountCreateBody.vendorAttributes
                additionalProperties(internalAccountCreateBody.additionalProperties)
            }

            /** The identifier of the financial institution the account belongs to. */
            @JsonProperty("connection_id")
            fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

            /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The nickname of the account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The legal name of the entity which owns the account. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            /** The Counterparty associated to this account. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The LegalEntity associated to this account. */
            @JsonProperty("legal_entity_id")
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            /** The parent internal account of this new account. */
            @JsonProperty("parent_account_id")
            fun parentAccountId(parentAccountId: String) = apply {
                this.parentAccountId = parentAccountId
            }

            /** The address associated with the owner or null. */
            @JsonProperty("party_address")
            fun partyAddress(partyAddress: PartyAddress) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A hash of vendor specific attributes that will be used when creating the account at
             * the vendor specified by the given connection.
             */
            @JsonProperty("vendor_attributes")
            fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
                this.vendorAttributes = vendorAttributes
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

        private var connectionId: String? = null
        private var currency: Currency? = null
        private var name: String? = null
        private var partyName: String? = null
        private var counterpartyId: String? = null
        private var legalEntityId: String? = null
        private var parentAccountId: String? = null
        private var partyAddress: PartyAddress? = null
        private var vendorAttributes: VendorAttributes? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(internalAccountCreateParams: InternalAccountCreateParams) = apply {
            connectionId = internalAccountCreateParams.connectionId
            currency = internalAccountCreateParams.currency
            name = internalAccountCreateParams.name
            partyName = internalAccountCreateParams.partyName
            counterpartyId = internalAccountCreateParams.counterpartyId
            legalEntityId = internalAccountCreateParams.legalEntityId
            parentAccountId = internalAccountCreateParams.parentAccountId
            partyAddress = internalAccountCreateParams.partyAddress
            vendorAttributes = internalAccountCreateParams.vendorAttributes
            additionalHeaders = internalAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = internalAccountCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                internalAccountCreateParams.additionalBodyProperties.toMutableMap()
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
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** The LegalEntity associated to this account. */
        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

        /** The parent internal account of this new account. */
        fun parentAccountId(parentAccountId: String) = apply {
            this.parentAccountId = parentAccountId
        }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: PartyAddress) = apply { this.partyAddress = partyAddress }

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
            this.vendorAttributes = vendorAttributes
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

        fun build(): InternalAccountCreateParams =
            InternalAccountCreateParams(
                checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(partyName) { "`partyName` is required but was not set" },
                counterpartyId,
                legalEntityId,
                parentAccountId,
                partyAddress,
                vendorAttributes,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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
    @JsonDeserialize(builder = PartyAddress.Builder::class)
    @NoAutoDetect
    class PartyAddress
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

            internal fun from(partyAddress: PartyAddress) = apply {
                this.line1 = partyAddress.line1
                this.line2 = partyAddress.line2
                this.locality = partyAddress.locality
                this.region = partyAddress.region
                this.postalCode = partyAddress.postalCode
                this.country = partyAddress.country
                additionalProperties(partyAddress.additionalProperties)
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
    @JsonDeserialize(builder = VendorAttributes.Builder::class)
    @NoAutoDetect
    class VendorAttributes
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

            internal fun from(vendorAttributes: VendorAttributes) = apply {
                additionalProperties(vendorAttributes.additionalProperties)
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

        return /* spotless:off */ other is InternalAccountCreateParams && connectionId == other.connectionId && currency == other.currency && name == other.name && partyName == other.partyName && counterpartyId == other.counterpartyId && legalEntityId == other.legalEntityId && parentAccountId == other.parentAccountId && partyAddress == other.partyAddress && vendorAttributes == other.vendorAttributes && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionId, currency, name, partyName, counterpartyId, legalEntityId, parentAccountId, partyAddress, vendorAttributes, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InternalAccountCreateParams{connectionId=$connectionId, currency=$currency, name=$name, partyName=$partyName, counterpartyId=$counterpartyId, legalEntityId=$legalEntityId, parentAccountId=$parentAccountId, partyAddress=$partyAddress, vendorAttributes=$vendorAttributes, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
