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

class LedgerAccountStatementCreateParams
constructor(
    private val description: String?,
    private val ledgerAccountId: String,
    private val effectiveAtLowerBound: String,
    private val effectiveAtUpperBound: String,
    private val metadata: Metadata?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun description(): String? = description

    fun ledgerAccountId(): String = ledgerAccountId

    fun effectiveAtLowerBound(): String = effectiveAtLowerBound

    fun effectiveAtUpperBound(): String = effectiveAtUpperBound

    fun metadata(): Metadata? = metadata

    internal fun getBody(): LedgerAccountStatementCreateBody {
        return LedgerAccountStatementCreateBody(
            description,
            ledgerAccountId,
            effectiveAtLowerBound,
            effectiveAtUpperBound,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LedgerAccountStatementCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountStatementCreateBody
    internal constructor(
        private val description: String?,
        private val ledgerAccountId: String?,
        private val effectiveAtLowerBound: String?,
        private val effectiveAtUpperBound: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The description of the ledger account statement. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        @JsonProperty("ledger_account_id") fun ledgerAccountId(): String? = ledgerAccountId

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_lower_bound")
        fun effectiveAtLowerBound(): String? = effectiveAtLowerBound

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_upper_bound")
        fun effectiveAtUpperBound(): String? = effectiveAtUpperBound

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

            return other is LedgerAccountStatementCreateBody &&
                this.description == other.description &&
                this.ledgerAccountId == other.ledgerAccountId &&
                this.effectiveAtLowerBound == other.effectiveAtLowerBound &&
                this.effectiveAtUpperBound == other.effectiveAtUpperBound &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        ledgerAccountId,
                        effectiveAtLowerBound,
                        effectiveAtUpperBound,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountStatementCreateBody{description=$description, ledgerAccountId=$ledgerAccountId, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var ledgerAccountId: String? = null
            private var effectiveAtLowerBound: String? = null
            private var effectiveAtUpperBound: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerAccountStatementCreateBody: LedgerAccountStatementCreateBody) =
                apply {
                    this.description = ledgerAccountStatementCreateBody.description
                    this.ledgerAccountId = ledgerAccountStatementCreateBody.ledgerAccountId
                    this.effectiveAtLowerBound =
                        ledgerAccountStatementCreateBody.effectiveAtLowerBound
                    this.effectiveAtUpperBound =
                        ledgerAccountStatementCreateBody.effectiveAtUpperBound
                    this.metadata = ledgerAccountStatementCreateBody.metadata
                    additionalProperties(ledgerAccountStatementCreateBody.additionalProperties)
                }

            /** The description of the ledger account statement. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The id of the ledger account whose ledger entries are queried against, and its
             * balances are computed as a result.
             */
            @JsonProperty("ledger_account_id")
            fun ledgerAccountId(ledgerAccountId: String) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /**
             * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            @JsonProperty("effective_at_lower_bound")
            fun effectiveAtLowerBound(effectiveAtLowerBound: String) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            @JsonProperty("effective_at_upper_bound")
            fun effectiveAtUpperBound(effectiveAtUpperBound: String) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

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

            fun build(): LedgerAccountStatementCreateBody =
                LedgerAccountStatementCreateBody(
                    description,
                    checkNotNull(ledgerAccountId) {
                        "`ledgerAccountId` is required but was not set"
                    },
                    checkNotNull(effectiveAtLowerBound) {
                        "`effectiveAtLowerBound` is required but was not set"
                    },
                    checkNotNull(effectiveAtUpperBound) {
                        "`effectiveAtUpperBound` is required but was not set"
                    },
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

        return other is LedgerAccountStatementCreateParams &&
            this.description == other.description &&
            this.ledgerAccountId == other.ledgerAccountId &&
            this.effectiveAtLowerBound == other.effectiveAtLowerBound &&
            this.effectiveAtUpperBound == other.effectiveAtUpperBound &&
            this.metadata == other.metadata &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            description,
            ledgerAccountId,
            effectiveAtLowerBound,
            effectiveAtUpperBound,
            metadata,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LedgerAccountStatementCreateParams{description=$description, ledgerAccountId=$ledgerAccountId, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var description: String? = null
        private var ledgerAccountId: String? = null
        private var effectiveAtLowerBound: String? = null
        private var effectiveAtUpperBound: String? = null
        private var metadata: Metadata? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountStatementCreateParams: LedgerAccountStatementCreateParams) =
            apply {
                this.description = ledgerAccountStatementCreateParams.description
                this.ledgerAccountId = ledgerAccountStatementCreateParams.ledgerAccountId
                this.effectiveAtLowerBound =
                    ledgerAccountStatementCreateParams.effectiveAtLowerBound
                this.effectiveAtUpperBound =
                    ledgerAccountStatementCreateParams.effectiveAtUpperBound
                this.metadata = ledgerAccountStatementCreateParams.metadata
                additionalQueryParams(ledgerAccountStatementCreateParams.additionalQueryParams)
                additionalHeaders(ledgerAccountStatementCreateParams.additionalHeaders)
                additionalBodyProperties(
                    ledgerAccountStatementCreateParams.additionalBodyProperties
                )
            }

        /** The description of the ledger account statement. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: String) = apply {
            this.effectiveAtLowerBound = effectiveAtLowerBound
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: String) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

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

        fun build(): LedgerAccountStatementCreateParams =
            LedgerAccountStatementCreateParams(
                description,
                checkNotNull(ledgerAccountId) { "`ledgerAccountId` is required but was not set" },
                checkNotNull(effectiveAtLowerBound) {
                    "`effectiveAtLowerBound` is required but was not set"
                },
                checkNotNull(effectiveAtUpperBound) {
                    "`effectiveAtUpperBound` is required but was not set"
                },
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
