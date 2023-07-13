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
import java.util.Objects

class LedgerAccountCategoryCreateParams
constructor(
    private val name: String,
    private val description: String?,
    private val metadata: Metadata?,
    private val currency: String,
    private val currencyExponent: Long?,
    private val ledgerId: String,
    private val normalBalance: NormalBalance,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun description(): String? = description

    fun metadata(): Metadata? = metadata

    fun currency(): String = currency

    fun currencyExponent(): Long? = currencyExponent

    fun ledgerId(): String = ledgerId

    fun normalBalance(): NormalBalance = normalBalance

    internal fun getBody(): LedgerAccountCategoryCreateBody {
        return LedgerAccountCategoryCreateBody(
            name,
            description,
            metadata,
            currency,
            currencyExponent,
            ledgerId,
            normalBalance,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LedgerAccountCategoryCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountCategoryCreateBody
    internal constructor(
        private val name: String?,
        private val description: String?,
        private val metadata: Metadata?,
        private val currency: String?,
        private val currencyExponent: Long?,
        private val ledgerId: String?,
        private val normalBalance: NormalBalance?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The name of the ledger account category. */
        @JsonProperty("name") fun name(): String? = name

        /** The description of the ledger account category. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** The currency of the ledger account category. */
        @JsonProperty("currency") fun currency(): String? = currency

        /** The currency exponent of the ledger account category. */
        @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

        /** The id of the ledger that this account category belongs to. */
        @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

        /** The normal balance of the ledger account category. */
        @JsonProperty("normal_balance") fun normalBalance(): NormalBalance? = normalBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerAccountCategoryCreateBody &&
                this.name == other.name &&
                this.description == other.description &&
                this.metadata == other.metadata &&
                this.currency == other.currency &&
                this.currencyExponent == other.currencyExponent &&
                this.ledgerId == other.ledgerId &&
                this.normalBalance == other.normalBalance &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        description,
                        metadata,
                        currency,
                        currencyExponent,
                        ledgerId,
                        normalBalance,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountCategoryCreateBody{name=$name, description=$description, metadata=$metadata, currency=$currency, currencyExponent=$currencyExponent, ledgerId=$ledgerId, normalBalance=$normalBalance, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var description: String? = null
            private var metadata: Metadata? = null
            private var currency: String? = null
            private var currencyExponent: Long? = null
            private var ledgerId: String? = null
            private var normalBalance: NormalBalance? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerAccountCategoryCreateBody: LedgerAccountCategoryCreateBody) =
                apply {
                    this.name = ledgerAccountCategoryCreateBody.name
                    this.description = ledgerAccountCategoryCreateBody.description
                    this.metadata = ledgerAccountCategoryCreateBody.metadata
                    this.currency = ledgerAccountCategoryCreateBody.currency
                    this.currencyExponent = ledgerAccountCategoryCreateBody.currencyExponent
                    this.ledgerId = ledgerAccountCategoryCreateBody.ledgerId
                    this.normalBalance = ledgerAccountCategoryCreateBody.normalBalance
                    additionalProperties(ledgerAccountCategoryCreateBody.additionalProperties)
                }

            /** The name of the ledger account category. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The description of the ledger account category. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The currency of the ledger account category. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** The currency exponent of the ledger account category. */
            @JsonProperty("currency_exponent")
            fun currencyExponent(currencyExponent: Long) = apply {
                this.currencyExponent = currencyExponent
            }

            /** The id of the ledger that this account category belongs to. */
            @JsonProperty("ledger_id")
            fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

            /** The normal balance of the ledger account category. */
            @JsonProperty("normal_balance")
            fun normalBalance(normalBalance: NormalBalance) = apply {
                this.normalBalance = normalBalance
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

            fun build(): LedgerAccountCategoryCreateBody =
                LedgerAccountCategoryCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    metadata,
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    currencyExponent,
                    checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                    checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
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

        return other is LedgerAccountCategoryCreateParams &&
            this.name == other.name &&
            this.description == other.description &&
            this.metadata == other.metadata &&
            this.currency == other.currency &&
            this.currencyExponent == other.currencyExponent &&
            this.ledgerId == other.ledgerId &&
            this.normalBalance == other.normalBalance &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            description,
            metadata,
            currency,
            currencyExponent,
            ledgerId,
            normalBalance,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LedgerAccountCategoryCreateParams{name=$name, description=$description, metadata=$metadata, currency=$currency, currencyExponent=$currencyExponent, ledgerId=$ledgerId, normalBalance=$normalBalance, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var description: String? = null
        private var metadata: Metadata? = null
        private var currency: String? = null
        private var currencyExponent: Long? = null
        private var ledgerId: String? = null
        private var normalBalance: NormalBalance? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountCategoryCreateParams: LedgerAccountCategoryCreateParams) =
            apply {
                this.name = ledgerAccountCategoryCreateParams.name
                this.description = ledgerAccountCategoryCreateParams.description
                this.metadata = ledgerAccountCategoryCreateParams.metadata
                this.currency = ledgerAccountCategoryCreateParams.currency
                this.currencyExponent = ledgerAccountCategoryCreateParams.currencyExponent
                this.ledgerId = ledgerAccountCategoryCreateParams.ledgerId
                this.normalBalance = ledgerAccountCategoryCreateParams.normalBalance
                additionalQueryParams(ledgerAccountCategoryCreateParams.additionalQueryParams)
                additionalHeaders(ledgerAccountCategoryCreateParams.additionalHeaders)
                additionalBodyProperties(ledgerAccountCategoryCreateParams.additionalBodyProperties)
            }

        /** The name of the ledger account category. */
        fun name(name: String) = apply { this.name = name }

        /** The description of the ledger account category. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The currency of the ledger account category. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** The currency exponent of the ledger account category. */
        fun currencyExponent(currencyExponent: Long) = apply {
            this.currencyExponent = currencyExponent
        }

        /** The id of the ledger that this account category belongs to. */
        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        /** The normal balance of the ledger account category. */
        fun normalBalance(normalBalance: NormalBalance) = apply {
            this.normalBalance = normalBalance
        }

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

        fun build(): LedgerAccountCategoryCreateParams =
            LedgerAccountCategoryCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                description,
                metadata,
                checkNotNull(currency) { "`currency` is required but was not set" },
                currencyExponent,
                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
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

    class NormalBalance
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NormalBalance && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = NormalBalance(JsonField.of("credit"))

            val DEBIT = NormalBalance(JsonField.of("debit"))

            fun of(value: String) = NormalBalance(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown NormalBalance: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
