// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class LedgerAccountSettlementCreateParams
constructor(
    private val contraLedgerAccountId: String,
    private val settledLedgerAccountId: String,
    private val allowEitherDirection: Boolean?,
    private val description: String?,
    private val effectiveAtUpperBound: OffsetDateTime?,
    private val metadata: Metadata?,
    private val skipSettlementLedgerTransaction: Boolean?,
    private val status: Status?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contraLedgerAccountId(): String = contraLedgerAccountId

    fun settledLedgerAccountId(): String = settledLedgerAccountId

    fun allowEitherDirection(): Boolean? = allowEitherDirection

    fun description(): String? = description

    fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

    fun metadata(): Metadata? = metadata

    fun skipSettlementLedgerTransaction(): Boolean? = skipSettlementLedgerTransaction

    fun status(): Status? = status

    internal fun getBody(): LedgerAccountSettlementCreateBody {
        return LedgerAccountSettlementCreateBody(
            contraLedgerAccountId,
            settledLedgerAccountId,
            allowEitherDirection,
            description,
            effectiveAtUpperBound,
            metadata,
            skipSettlementLedgerTransaction,
            status,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = LedgerAccountSettlementCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountSettlementCreateBody
    internal constructor(
        private val contraLedgerAccountId: String?,
        private val settledLedgerAccountId: String?,
        private val allowEitherDirection: Boolean?,
        private val description: String?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val metadata: Metadata?,
        private val skipSettlementLedgerTransaction: Boolean?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        @JsonProperty("contra_ledger_account_id")
        fun contraLedgerAccountId(): String? = contraLedgerAccountId

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        @JsonProperty("settled_ledger_account_id")
        fun settledLedgerAccountId(): String? = settledLedgerAccountId

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        @JsonProperty("allow_either_direction")
        fun allowEitherDirection(): Boolean? = allowEitherDirection

        /** The description of the ledger account settlement. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        @JsonProperty("effective_at_upper_bound")
        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        @JsonProperty("skip_settlement_ledger_transaction")
        fun skipSettlementLedgerTransaction(): Boolean? = skipSettlementLedgerTransaction

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var contraLedgerAccountId: String? = null
            private var settledLedgerAccountId: String? = null
            private var allowEitherDirection: Boolean? = null
            private var description: String? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var metadata: Metadata? = null
            private var skipSettlementLedgerTransaction: Boolean? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountSettlementCreateBody: LedgerAccountSettlementCreateBody
            ) = apply {
                this.contraLedgerAccountId = ledgerAccountSettlementCreateBody.contraLedgerAccountId
                this.settledLedgerAccountId =
                    ledgerAccountSettlementCreateBody.settledLedgerAccountId
                this.allowEitherDirection = ledgerAccountSettlementCreateBody.allowEitherDirection
                this.description = ledgerAccountSettlementCreateBody.description
                this.effectiveAtUpperBound = ledgerAccountSettlementCreateBody.effectiveAtUpperBound
                this.metadata = ledgerAccountSettlementCreateBody.metadata
                this.skipSettlementLedgerTransaction =
                    ledgerAccountSettlementCreateBody.skipSettlementLedgerTransaction
                this.status = ledgerAccountSettlementCreateBody.status
                additionalProperties(ledgerAccountSettlementCreateBody.additionalProperties)
            }

            /**
             * The id of the contra ledger account that sends to or receives funds from the settled
             * ledger account.
             */
            @JsonProperty("contra_ledger_account_id")
            fun contraLedgerAccountId(contraLedgerAccountId: String) = apply {
                this.contraLedgerAccountId = contraLedgerAccountId
            }

            /**
             * The id of the settled ledger account whose ledger entries are queried against, and
             * its balance is reduced as a result.
             */
            @JsonProperty("settled_ledger_account_id")
            fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
                this.settledLedgerAccountId = settledLedgerAccountId
            }

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            @JsonProperty("allow_either_direction")
            fun allowEitherDirection(allowEitherDirection: Boolean) = apply {
                this.allowEitherDirection = allowEitherDirection
            }

            /** The description of the ledger account settlement. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account settlement. The default value is the created_at
             * timestamp of the ledger account settlement.
             */
            @JsonProperty("effective_at_upper_bound")
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            @JsonProperty("skip_settlement_ledger_transaction")
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) = apply {
                this.skipSettlementLedgerTransaction = skipSettlementLedgerTransaction
            }

            /**
             * The status of the ledger account settlement. It is set to `pending` by default. To
             * post a ledger account settlement at creation, use `posted`.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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

            fun build(): LedgerAccountSettlementCreateBody =
                LedgerAccountSettlementCreateBody(
                    checkNotNull(contraLedgerAccountId) {
                        "`contraLedgerAccountId` is required but was not set"
                    },
                    checkNotNull(settledLedgerAccountId) {
                        "`settledLedgerAccountId` is required but was not set"
                    },
                    allowEitherDirection,
                    description,
                    effectiveAtUpperBound,
                    metadata,
                    skipSettlementLedgerTransaction,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountSettlementCreateBody && this.contraLedgerAccountId == other.contraLedgerAccountId && this.settledLedgerAccountId == other.settledLedgerAccountId && this.allowEitherDirection == other.allowEitherDirection && this.description == other.description && this.effectiveAtUpperBound == other.effectiveAtUpperBound && this.metadata == other.metadata && this.skipSettlementLedgerTransaction == other.skipSettlementLedgerTransaction && this.status == other.status && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contraLedgerAccountId, settledLedgerAccountId, allowEitherDirection, description, effectiveAtUpperBound, metadata, skipSettlementLedgerTransaction, status, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountSettlementCreateBody{contraLedgerAccountId=$contraLedgerAccountId, settledLedgerAccountId=$settledLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipSettlementLedgerTransaction=$skipSettlementLedgerTransaction, status=$status, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementCreateParams && this.contraLedgerAccountId == other.contraLedgerAccountId && this.settledLedgerAccountId == other.settledLedgerAccountId && this.allowEitherDirection == other.allowEitherDirection && this.description == other.description && this.effectiveAtUpperBound == other.effectiveAtUpperBound && this.metadata == other.metadata && this.skipSettlementLedgerTransaction == other.skipSettlementLedgerTransaction && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contraLedgerAccountId, settledLedgerAccountId, allowEitherDirection, description, effectiveAtUpperBound, metadata, skipSettlementLedgerTransaction, status, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountSettlementCreateParams{contraLedgerAccountId=$contraLedgerAccountId, settledLedgerAccountId=$settledLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipSettlementLedgerTransaction=$skipSettlementLedgerTransaction, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contraLedgerAccountId: String? = null
        private var settledLedgerAccountId: String? = null
        private var allowEitherDirection: Boolean? = null
        private var description: String? = null
        private var effectiveAtUpperBound: OffsetDateTime? = null
        private var metadata: Metadata? = null
        private var skipSettlementLedgerTransaction: Boolean? = null
        private var status: Status? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            ledgerAccountSettlementCreateParams: LedgerAccountSettlementCreateParams
        ) = apply {
            this.contraLedgerAccountId = ledgerAccountSettlementCreateParams.contraLedgerAccountId
            this.settledLedgerAccountId = ledgerAccountSettlementCreateParams.settledLedgerAccountId
            this.allowEitherDirection = ledgerAccountSettlementCreateParams.allowEitherDirection
            this.description = ledgerAccountSettlementCreateParams.description
            this.effectiveAtUpperBound = ledgerAccountSettlementCreateParams.effectiveAtUpperBound
            this.metadata = ledgerAccountSettlementCreateParams.metadata
            this.skipSettlementLedgerTransaction =
                ledgerAccountSettlementCreateParams.skipSettlementLedgerTransaction
            this.status = ledgerAccountSettlementCreateParams.status
            additionalHeaders(ledgerAccountSettlementCreateParams.additionalHeaders)
            additionalQueryParams(ledgerAccountSettlementCreateParams.additionalQueryParams)
            additionalBodyProperties(ledgerAccountSettlementCreateParams.additionalBodyProperties)
        }

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        fun contraLedgerAccountId(contraLedgerAccountId: String) = apply {
            this.contraLedgerAccountId = contraLedgerAccountId
        }

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
            this.settledLedgerAccountId = settledLedgerAccountId
        }

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(allowEitherDirection: Boolean) = apply {
            this.allowEitherDirection = allowEitherDirection
        }

        /** The description of the ledger account settlement. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) = apply {
            this.skipSettlementLedgerTransaction = skipSettlementLedgerTransaction
        }

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): LedgerAccountSettlementCreateParams =
            LedgerAccountSettlementCreateParams(
                checkNotNull(contraLedgerAccountId) {
                    "`contraLedgerAccountId` is required but was not set"
                },
                checkNotNull(settledLedgerAccountId) {
                    "`settledLedgerAccountId` is required but was not set"
                },
                allowEitherDirection,
                description,
                effectiveAtUpperBound,
                metadata,
                skipSettlementLedgerTransaction,
                status,
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val POSTED = Status(JsonField.of("posted"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            POSTED,
        }

        enum class Value {
            PENDING,
            POSTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
