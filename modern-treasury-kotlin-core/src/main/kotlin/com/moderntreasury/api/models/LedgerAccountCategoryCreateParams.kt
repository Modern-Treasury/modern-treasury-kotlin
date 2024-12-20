// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

class LedgerAccountCategoryCreateParams
constructor(
    private val currency: String,
    private val ledgerId: String,
    private val name: String,
    private val normalBalance: TransactionDirection,
    private val currencyExponent: Long?,
    private val description: String?,
    private val ledgerAccountCategoryIds: List<String>?,
    private val metadata: Metadata?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun currency(): String = currency

    fun ledgerId(): String = ledgerId

    fun name(): String = name

    fun normalBalance(): TransactionDirection = normalBalance

    fun currencyExponent(): Long? = currencyExponent

    fun description(): String? = description

    fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

    fun metadata(): Metadata? = metadata

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): LedgerAccountCategoryCreateBody {
        return LedgerAccountCategoryCreateBody(
            currency,
            ledgerId,
            name,
            normalBalance,
            currencyExponent,
            description,
            ledgerAccountCategoryIds,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerAccountCategoryCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("ledger_id") private val ledgerId: String,
        @JsonProperty("name") private val name: String,
        @JsonProperty("normal_balance") private val normalBalance: TransactionDirection,
        @JsonProperty("currency_exponent") private val currencyExponent: Long?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("ledger_account_category_ids")
        private val ledgerAccountCategoryIds: List<String>?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The currency of the ledger account category. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the ledger that this account category belongs to. */
        @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

        /** The name of the ledger account category. */
        @JsonProperty("name") fun name(): String = name

        /** The normal balance of the ledger account category. */
        @JsonProperty("normal_balance") fun normalBalance(): TransactionDirection = normalBalance

        /** The currency exponent of the ledger account category. */
        @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

        /** The description of the ledger account category. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        @JsonProperty("ledger_account_category_ids")
        fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var ledgerId: String? = null
            private var name: String? = null
            private var normalBalance: TransactionDirection? = null
            private var currencyExponent: Long? = null
            private var description: String? = null
            private var ledgerAccountCategoryIds: List<String>? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerAccountCategoryCreateBody: LedgerAccountCategoryCreateBody) =
                apply {
                    currency = ledgerAccountCategoryCreateBody.currency
                    ledgerId = ledgerAccountCategoryCreateBody.ledgerId
                    name = ledgerAccountCategoryCreateBody.name
                    normalBalance = ledgerAccountCategoryCreateBody.normalBalance
                    currencyExponent = ledgerAccountCategoryCreateBody.currencyExponent
                    description = ledgerAccountCategoryCreateBody.description
                    ledgerAccountCategoryIds =
                        ledgerAccountCategoryCreateBody.ledgerAccountCategoryIds?.toMutableList()
                    metadata = ledgerAccountCategoryCreateBody.metadata
                    additionalProperties =
                        ledgerAccountCategoryCreateBody.additionalProperties.toMutableMap()
                }

            /** The currency of the ledger account category. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the ledger that this account category belongs to. */
            fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

            /** The name of the ledger account category. */
            fun name(name: String) = apply { this.name = name }

            /** The normal balance of the ledger account category. */
            fun normalBalance(normalBalance: TransactionDirection) = apply {
                this.normalBalance = normalBalance
            }

            /** The currency exponent of the ledger account category. */
            fun currencyExponent(currencyExponent: Long?) = apply {
                this.currencyExponent = currencyExponent
            }

            /** The description of the ledger account category. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * The array of ledger account category ids that this ledger account category should be
             * a child of.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>?) = apply {
                this.ledgerAccountCategoryIds = ledgerAccountCategoryIds
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

            fun build(): LedgerAccountCategoryCreateBody =
                LedgerAccountCategoryCreateBody(
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
                    currencyExponent,
                    description,
                    ledgerAccountCategoryIds?.toImmutable(),
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountCategoryCreateBody && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountCategoryCreateBody{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var currency: String? = null
        private var ledgerId: String? = null
        private var name: String? = null
        private var normalBalance: TransactionDirection? = null
        private var currencyExponent: Long? = null
        private var description: String? = null
        private var ledgerAccountCategoryIds: MutableList<String> = mutableListOf()
        private var metadata: Metadata? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountCategoryCreateParams: LedgerAccountCategoryCreateParams) =
            apply {
                currency = ledgerAccountCategoryCreateParams.currency
                ledgerId = ledgerAccountCategoryCreateParams.ledgerId
                name = ledgerAccountCategoryCreateParams.name
                normalBalance = ledgerAccountCategoryCreateParams.normalBalance
                currencyExponent = ledgerAccountCategoryCreateParams.currencyExponent
                description = ledgerAccountCategoryCreateParams.description
                ledgerAccountCategoryIds =
                    ledgerAccountCategoryCreateParams.ledgerAccountCategoryIds?.toMutableList()
                        ?: mutableListOf()
                metadata = ledgerAccountCategoryCreateParams.metadata
                additionalHeaders = ledgerAccountCategoryCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    ledgerAccountCategoryCreateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    ledgerAccountCategoryCreateParams.additionalBodyProperties.toMutableMap()
            }

        /** The currency of the ledger account category. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** The id of the ledger that this account category belongs to. */
        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        /** The name of the ledger account category. */
        fun name(name: String) = apply { this.name = name }

        /** The normal balance of the ledger account category. */
        fun normalBalance(normalBalance: TransactionDirection) = apply {
            this.normalBalance = normalBalance
        }

        /** The currency exponent of the ledger account category. */
        fun currencyExponent(currencyExponent: Long) = apply {
            this.currencyExponent = currencyExponent
        }

        /** The description of the ledger account category. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) = apply {
            this.ledgerAccountCategoryIds.clear()
            this.ledgerAccountCategoryIds.addAll(ledgerAccountCategoryIds)
        }

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            this.ledgerAccountCategoryIds.add(ledgerAccountCategoryId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun build(): LedgerAccountCategoryCreateParams =
            LedgerAccountCategoryCreateParams(
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
                currencyExponent,
                description,
                ledgerAccountCategoryIds.toImmutable().ifEmpty { null },
                metadata,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryCreateParams && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && metadata == other.metadata && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, metadata, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryCreateParams{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
