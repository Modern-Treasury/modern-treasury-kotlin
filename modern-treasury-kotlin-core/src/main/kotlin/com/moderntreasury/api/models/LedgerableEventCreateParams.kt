package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects

class LedgerableEventCreateParams
constructor(
    private val name: String,
    private val description: String?,
    private val direction: String?,
    private val amount: Long,
    private val currency: String?,
    private val currencyExponent: Long?,
    private val customData: JsonValue?,
    private val metadata: Metadata?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun description(): String? = description

    fun direction(): String? = direction

    fun amount(): Long = amount

    fun currency(): String? = currency

    fun currencyExponent(): Long? = currencyExponent

    fun customData(): JsonValue? = customData

    fun metadata(): Metadata? = metadata

    internal fun getBody(): LedgerableEventCreateBody {
        return LedgerableEventCreateBody(
            name,
            description,
            direction,
            amount,
            currency,
            currencyExponent,
            customData,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LedgerableEventCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerableEventCreateBody
    internal constructor(
        private val name: String?,
        private val description: String?,
        private val direction: String?,
        private val amount: Long?,
        private val currency: String?,
        private val currencyExponent: Long?,
        private val customData: JsonValue?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Name of the ledgerable event. */
        @JsonProperty("name") fun name(): String? = name

        /** Description of the ledgerable event. */
        @JsonProperty("description") fun description(): String? = description

        /** One of `credit`, `debit`. */
        @JsonProperty("direction") fun direction(): String? = direction

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** An ISO 4217 conformed currency or a custom currency. */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Must be included if currency is a custom currency. The currency_exponent cannot exceed
         * 30.
         */
        @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

        /** Additionally data to be used by the Ledger Event Handler. */
        @JsonProperty("custom_data") fun customData(): JsonValue? = customData

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerableEventCreateBody &&
                this.name == other.name &&
                this.description == other.description &&
                this.direction == other.direction &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.currencyExponent == other.currencyExponent &&
                this.customData == other.customData &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        description,
                        direction,
                        amount,
                        currency,
                        currencyExponent,
                        customData,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerableEventCreateBody{name=$name, description=$description, direction=$direction, amount=$amount, currency=$currency, currencyExponent=$currencyExponent, customData=$customData, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var description: String? = null
            private var direction: String? = null
            private var amount: Long? = null
            private var currency: String? = null
            private var currencyExponent: Long? = null
            private var customData: JsonValue? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerableEventCreateBody: LedgerableEventCreateBody) = apply {
                this.name = ledgerableEventCreateBody.name
                this.description = ledgerableEventCreateBody.description
                this.direction = ledgerableEventCreateBody.direction
                this.amount = ledgerableEventCreateBody.amount
                this.currency = ledgerableEventCreateBody.currency
                this.currencyExponent = ledgerableEventCreateBody.currencyExponent
                this.customData = ledgerableEventCreateBody.customData
                this.metadata = ledgerableEventCreateBody.metadata
                additionalProperties(ledgerableEventCreateBody.additionalProperties)
            }

            /** Name of the ledgerable event. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Description of the ledgerable event. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** One of `credit`, `debit`. */
            @JsonProperty("direction")
            fun direction(direction: String) = apply { this.direction = direction }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** An ISO 4217 conformed currency or a custom currency. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Must be included if currency is a custom currency. The currency_exponent cannot
             * exceed 30.
             */
            @JsonProperty("currency_exponent")
            fun currencyExponent(currencyExponent: Long) = apply {
                this.currencyExponent = currencyExponent
            }

            /** Additionally data to be used by the Ledger Event Handler. */
            @JsonProperty("custom_data")
            fun customData(customData: JsonValue) = apply { this.customData = customData }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): LedgerableEventCreateBody =
                LedgerableEventCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    direction,
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    currency,
                    currencyExponent,
                    customData,
                    metadata,
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

        return other is LedgerableEventCreateParams &&
            this.name == other.name &&
            this.description == other.description &&
            this.direction == other.direction &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.currencyExponent == other.currencyExponent &&
            this.customData == other.customData &&
            this.metadata == other.metadata &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            description,
            direction,
            amount,
            currency,
            currencyExponent,
            customData,
            metadata,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LedgerableEventCreateParams{name=$name, description=$description, direction=$direction, amount=$amount, currency=$currency, currencyExponent=$currencyExponent, customData=$customData, metadata=$metadata, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var description: String? = null
        private var direction: String? = null
        private var amount: Long? = null
        private var currency: String? = null
        private var currencyExponent: Long? = null
        private var customData: JsonValue? = null
        private var metadata: Metadata? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerableEventCreateParams: LedgerableEventCreateParams) = apply {
            this.name = ledgerableEventCreateParams.name
            this.description = ledgerableEventCreateParams.description
            this.direction = ledgerableEventCreateParams.direction
            this.amount = ledgerableEventCreateParams.amount
            this.currency = ledgerableEventCreateParams.currency
            this.currencyExponent = ledgerableEventCreateParams.currencyExponent
            this.customData = ledgerableEventCreateParams.customData
            this.metadata = ledgerableEventCreateParams.metadata
            additionalQueryParams(ledgerableEventCreateParams.additionalQueryParams)
            additionalHeaders(ledgerableEventCreateParams.additionalHeaders)
            additionalBodyProperties(ledgerableEventCreateParams.additionalBodyProperties)
        }

        /** Name of the ledgerable event. */
        fun name(name: String) = apply { this.name = name }

        /** Description of the ledgerable event. */
        fun description(description: String) = apply { this.description = description }

        /** One of `credit`, `debit`. */
        fun direction(direction: String) = apply { this.direction = direction }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** An ISO 4217 conformed currency or a custom currency. */
        fun currency(currency: String) = apply { this.currency = currency }

        /**
         * Must be included if currency is a custom currency. The currency_exponent cannot exceed
         * 30.
         */
        fun currencyExponent(currencyExponent: Long) = apply {
            this.currencyExponent = currencyExponent
        }

        /** Additionally data to be used by the Ledger Event Handler. */
        fun customData(customData: JsonValue) = apply { this.customData = customData }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun build(): LedgerableEventCreateParams =
            LedgerableEventCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                description,
                direction,
                checkNotNull(amount) { "`amount` is required but was not set" },
                currency,
                currencyExponent,
                customData,
                metadata,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
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
}
