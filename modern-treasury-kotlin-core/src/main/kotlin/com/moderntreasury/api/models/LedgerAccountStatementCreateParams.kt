// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class LedgerAccountStatementCreateParams
constructor(
    private val effectiveAtLowerBound: OffsetDateTime,
    private val effectiveAtUpperBound: OffsetDateTime,
    private val ledgerAccountId: String,
    private val description: String?,
    private val metadata: Metadata?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun effectiveAtLowerBound(): OffsetDateTime = effectiveAtLowerBound

    fun effectiveAtUpperBound(): OffsetDateTime = effectiveAtUpperBound

    fun ledgerAccountId(): String = ledgerAccountId

    fun description(): String? = description

    fun metadata(): Metadata? = metadata

    internal fun getBody(): LedgerAccountStatementCreateBody {
        return LedgerAccountStatementCreateBody(
            effectiveAtLowerBound,
            effectiveAtUpperBound,
            ledgerAccountId,
            description,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = LedgerAccountStatementCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountStatementCreateBody
    internal constructor(
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val ledgerAccountId: String?,
        private val description: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_lower_bound")
        fun effectiveAtLowerBound(): OffsetDateTime? = effectiveAtLowerBound

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_upper_bound")
        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        @JsonProperty("ledger_account_id") fun ledgerAccountId(): String? = ledgerAccountId

        /** The description of the ledger account statement. */
        @JsonProperty("description") fun description(): String? = description

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

            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var ledgerAccountId: String? = null
            private var description: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerAccountStatementCreateBody: LedgerAccountStatementCreateBody) =
                apply {
                    this.effectiveAtLowerBound =
                        ledgerAccountStatementCreateBody.effectiveAtLowerBound
                    this.effectiveAtUpperBound =
                        ledgerAccountStatementCreateBody.effectiveAtUpperBound
                    this.ledgerAccountId = ledgerAccountStatementCreateBody.ledgerAccountId
                    this.description = ledgerAccountStatementCreateBody.description
                    this.metadata = ledgerAccountStatementCreateBody.metadata
                    additionalProperties(ledgerAccountStatementCreateBody.additionalProperties)
                }

            /**
             * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            @JsonProperty("effective_at_lower_bound")
            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            @JsonProperty("effective_at_upper_bound")
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * The id of the ledger account whose ledger entries are queried against, and its
             * balances are computed as a result.
             */
            @JsonProperty("ledger_account_id")
            fun ledgerAccountId(ledgerAccountId: String) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /** The description of the ledger account statement. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

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
                    checkNotNull(effectiveAtLowerBound) {
                        "`effectiveAtLowerBound` is required but was not set"
                    },
                    checkNotNull(effectiveAtUpperBound) {
                        "`effectiveAtUpperBound` is required but was not set"
                    },
                    checkNotNull(ledgerAccountId) {
                        "`ledgerAccountId` is required but was not set"
                    },
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountStatementCreateBody && this.effectiveAtLowerBound == other.effectiveAtLowerBound && this.effectiveAtUpperBound == other.effectiveAtUpperBound && this.ledgerAccountId == other.ledgerAccountId && this.description == other.description && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(effectiveAtLowerBound, effectiveAtUpperBound, ledgerAccountId, description, metadata, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountStatementCreateBody{effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountStatementCreateParams && this.effectiveAtLowerBound == other.effectiveAtLowerBound && this.effectiveAtUpperBound == other.effectiveAtUpperBound && this.ledgerAccountId == other.ledgerAccountId && this.description == other.description && this.metadata == other.metadata && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(effectiveAtLowerBound, effectiveAtUpperBound, ledgerAccountId, description, metadata, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountStatementCreateParams{effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var effectiveAtLowerBound: OffsetDateTime? = null
        private var effectiveAtUpperBound: OffsetDateTime? = null
        private var ledgerAccountId: String? = null
        private var description: String? = null
        private var metadata: Metadata? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountStatementCreateParams: LedgerAccountStatementCreateParams) =
            apply {
                this.effectiveAtLowerBound =
                    ledgerAccountStatementCreateParams.effectiveAtLowerBound
                this.effectiveAtUpperBound =
                    ledgerAccountStatementCreateParams.effectiveAtUpperBound
                this.ledgerAccountId = ledgerAccountStatementCreateParams.ledgerAccountId
                this.description = ledgerAccountStatementCreateParams.description
                this.metadata = ledgerAccountStatementCreateParams.metadata
                additionalHeaders(ledgerAccountStatementCreateParams.additionalHeaders)
                additionalQueryParams(ledgerAccountStatementCreateParams.additionalQueryParams)
                additionalBodyProperties(
                    ledgerAccountStatementCreateParams.additionalBodyProperties
                )
            }

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
            this.effectiveAtLowerBound = effectiveAtLowerBound
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** The description of the ledger account statement. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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
                checkNotNull(effectiveAtLowerBound) {
                    "`effectiveAtLowerBound` is required but was not set"
                },
                checkNotNull(effectiveAtUpperBound) {
                    "`effectiveAtUpperBound` is required but was not set"
                },
                checkNotNull(ledgerAccountId) { "`ledgerAccountId` is required but was not set" },
                description,
                metadata,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
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

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
