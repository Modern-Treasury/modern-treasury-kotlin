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

/** create internal account */
class InternalAccountCreateParams
private constructor(
    private val body: InternalAccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** The identifier of the financial institution the account belongs to. */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
    fun _currency(): JsonField<Currency> = body._currency()

    /** The nickname of the account. */
    fun _name(): JsonField<String> = body._name()

    /** The legal name of the entity which owns the account. */
    fun _partyName(): JsonField<String> = body._partyName()

    /** The Counterparty associated to this account. */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /** The LegalEntity associated to this account. */
    fun _legalEntityId(): JsonField<String> = body._legalEntityId()

    /** The parent internal account of this new account. */
    fun _parentAccountId(): JsonField<String> = body._parentAccountId()

    /** The address associated with the owner or null. */
    fun _partyAddress(): JsonField<PartyAddress> = body._partyAddress()

    /**
     * A hash of vendor specific attributes that will be used when creating the account at the
     * vendor specified by the given connection.
     */
    fun _vendorAttributes(): JsonField<VendorAttributes> = body._vendorAttributes()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): InternalAccountCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InternalAccountCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("connection_id")
        @ExcludeMissing
        private val connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_name")
        @ExcludeMissing
        private val partyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        private val counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        private val legalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_account_id")
        @ExcludeMissing
        private val parentAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_address")
        @ExcludeMissing
        private val partyAddress: JsonField<PartyAddress> = JsonMissing.of(),
        @JsonProperty("vendor_attributes")
        @ExcludeMissing
        private val vendorAttributes: JsonField<VendorAttributes> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the financial institution the account belongs to. */
        fun connectionId(): String = connectionId.getRequired("connection_id")

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        fun currency(): Currency = currency.getRequired("currency")

        /** The nickname of the account. */
        fun name(): String = name.getRequired("name")

        /** The legal name of the entity which owns the account. */
        fun partyName(): String = partyName.getRequired("party_name")

        /** The Counterparty associated to this account. */
        fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

        /** The LegalEntity associated to this account. */
        fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

        /** The parent internal account of this new account. */
        fun parentAccountId(): String? = parentAccountId.getNullable("parent_account_id")

        /** The address associated with the owner or null. */
        fun partyAddress(): PartyAddress? = partyAddress.getNullable("party_address")

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        fun vendorAttributes(): VendorAttributes? =
            vendorAttributes.getNullable("vendor_attributes")

        /** The identifier of the financial institution the account belongs to. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** The nickname of the account. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The legal name of the entity which owns the account. */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /** The Counterparty associated to this account. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        /** The LegalEntity associated to this account. */
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        fun _legalEntityId(): JsonField<String> = legalEntityId

        /** The parent internal account of this new account. */
        @JsonProperty("parent_account_id")
        @ExcludeMissing
        fun _parentAccountId(): JsonField<String> = parentAccountId

        /** The address associated with the owner or null. */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<PartyAddress> = partyAddress

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        @JsonProperty("vendor_attributes")
        @ExcludeMissing
        fun _vendorAttributes(): JsonField<VendorAttributes> = vendorAttributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InternalAccountCreateBody = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            currency()
            name()
            partyName()
            counterpartyId()
            legalEntityId()
            parentAccountId()
            partyAddress()?.validate()
            vendorAttributes()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InternalAccountCreateBody]. */
        class Builder internal constructor() {

            private var connectionId: JsonField<String>? = null
            private var currency: JsonField<Currency>? = null
            private var name: JsonField<String>? = null
            private var partyName: JsonField<String>? = null
            private var counterpartyId: JsonField<String> = JsonMissing.of()
            private var legalEntityId: JsonField<String> = JsonMissing.of()
            private var parentAccountId: JsonField<String> = JsonMissing.of()
            private var partyAddress: JsonField<PartyAddress> = JsonMissing.of()
            private var vendorAttributes: JsonField<VendorAttributes> = JsonMissing.of()
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
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /** The identifier of the financial institution the account belongs to. */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The nickname of the account. */
            fun name(name: String) = name(JsonField.of(name))

            /** The nickname of the account. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** The Counterparty associated to this account. */
            fun counterpartyId(counterpartyId: String) =
                counterpartyId(JsonField.of(counterpartyId))

            /** The Counterparty associated to this account. */
            fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The LegalEntity associated to this account. */
            fun legalEntityId(legalEntityId: String) = legalEntityId(JsonField.of(legalEntityId))

            /** The LegalEntity associated to this account. */
            fun legalEntityId(legalEntityId: JsonField<String>) = apply {
                this.legalEntityId = legalEntityId
            }

            /** The parent internal account of this new account. */
            fun parentAccountId(parentAccountId: String) =
                parentAccountId(JsonField.of(parentAccountId))

            /** The parent internal account of this new account. */
            fun parentAccountId(parentAccountId: JsonField<String>) = apply {
                this.parentAccountId = parentAccountId
            }

            /** The address associated with the owner or null. */
            fun partyAddress(partyAddress: PartyAddress) = partyAddress(JsonField.of(partyAddress))

            /** The address associated with the owner or null. */
            fun partyAddress(partyAddress: JsonField<PartyAddress>) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A hash of vendor specific attributes that will be used when creating the account at
             * the vendor specified by the given connection.
             */
            fun vendorAttributes(vendorAttributes: VendorAttributes) =
                vendorAttributes(JsonField.of(vendorAttributes))

            /**
             * A hash of vendor specific attributes that will be used when creating the account at
             * the vendor specified by the given connection.
             */
            fun vendorAttributes(vendorAttributes: JsonField<VendorAttributes>) = apply {
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
                    checkRequired("connectionId", connectionId),
                    checkRequired("currency", currency),
                    checkRequired("name", name),
                    checkRequired("partyName", partyName),
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

    /** A builder for [InternalAccountCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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

        /** The identifier of the financial institution the account belongs to. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** The nickname of the account. */
        fun name(name: String) = apply { body.name(name) }

        /** The nickname of the account. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = apply { body.partyName(partyName) }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: JsonField<String>) = apply { body.partyName(partyName) }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /** The LegalEntity associated to this account. */
        fun legalEntityId(legalEntityId: String) = apply { body.legalEntityId(legalEntityId) }

        /** The LegalEntity associated to this account. */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            body.legalEntityId(legalEntityId)
        }

        /** The parent internal account of this new account. */
        fun parentAccountId(parentAccountId: String) = apply {
            body.parentAccountId(parentAccountId)
        }

        /** The parent internal account of this new account. */
        fun parentAccountId(parentAccountId: JsonField<String>) = apply {
            body.parentAccountId(parentAccountId)
        }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: PartyAddress) = apply { body.partyAddress(partyAddress) }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: JsonField<PartyAddress>) = apply {
            body.partyAddress(partyAddress)
        }

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
            body.vendorAttributes(vendorAttributes)
        }

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        fun vendorAttributes(vendorAttributes: JsonField<VendorAttributes>) = apply {
            body.vendorAttributes(vendorAttributes)
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

        fun build(): InternalAccountCreateParams =
            InternalAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val USD = of("USD")

            val CAD = of("CAD")

            fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            USD,
            CAD,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USD,
            CAD,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                USD -> Value.USD
                CAD -> Value.CAD
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
                USD -> Known.USD
                CAD -> Known.CAD
                else -> throw ModernTreasuryInvalidDataException("Unknown Currency: $value")
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
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        fun line1(): String = line1.getRequired("line1")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

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

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PartyAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PartyAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(partyAddress: PartyAddress) = apply {
                country = partyAddress.country
                line1 = partyAddress.line1
                locality = partyAddress.locality
                postalCode = partyAddress.postalCode
                region = partyAddress.region
                line2 = partyAddress.line2
                additionalProperties = partyAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartyAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PartyAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VendorAttributes = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [VendorAttributes]. */
        class Builder internal constructor() {

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
