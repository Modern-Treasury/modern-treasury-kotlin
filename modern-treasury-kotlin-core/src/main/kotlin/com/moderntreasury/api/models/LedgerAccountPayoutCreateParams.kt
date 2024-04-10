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
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class LedgerAccountPayoutCreateParams
constructor(
    private val fundingLedgerAccountId: String,
    private val payoutLedgerAccountId: String,
    private val allowEitherDirection: Boolean?,
    private val description: String?,
    private val effectiveAtUpperBound: OffsetDateTime?,
    private val metadata: Metadata?,
    private val skipPayoutLedgerTransaction: Boolean?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun fundingLedgerAccountId(): String = fundingLedgerAccountId

    fun payoutLedgerAccountId(): String = payoutLedgerAccountId

    fun allowEitherDirection(): Boolean? = allowEitherDirection

    fun description(): String? = description

    fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

    fun metadata(): Metadata? = metadata

    fun skipPayoutLedgerTransaction(): Boolean? = skipPayoutLedgerTransaction

    fun status(): Status? = status

    internal fun getBody(): LedgerAccountPayoutCreateBody {
        return LedgerAccountPayoutCreateBody(
            fundingLedgerAccountId,
            payoutLedgerAccountId,
            allowEitherDirection,
            description,
            effectiveAtUpperBound,
            metadata,
            skipPayoutLedgerTransaction,
            status,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LedgerAccountPayoutCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountPayoutCreateBody
    internal constructor(
        private val fundingLedgerAccountId: String?,
        private val payoutLedgerAccountId: String?,
        private val allowEitherDirection: Boolean?,
        private val description: String?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val metadata: Metadata?,
        private val skipPayoutLedgerTransaction: Boolean?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The id of the funding ledger account that sends to or receives funds from the payout
         * ledger account.
         */
        @JsonProperty("funding_ledger_account_id")
        fun fundingLedgerAccountId(): String? = fundingLedgerAccountId

        /**
         * The id of the payout ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        @JsonProperty("payout_ledger_account_id")
        fun payoutLedgerAccountId(): String? = payoutLedgerAccountId

        /**
         * If true, the payout amount and payout_entry_direction will bring the payout ledger
         * account's balance closer to zero, even if the balance is negative.
         */
        @JsonProperty("allow_either_direction")
        fun allowEitherDirection(): Boolean? = allowEitherDirection

        /** The description of the ledger account payout. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account payout. The default value is the created_at timestamp of
         * the ledger account payout.
         */
        @JsonProperty("effective_at_upper_bound")
        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * payouts.
         */
        @JsonProperty("skip_payout_ledger_transaction")
        fun skipPayoutLedgerTransaction(): Boolean? = skipPayoutLedgerTransaction

        /**
         * The status of the ledger account payout. It is set to `pending` by default. To post a
         * ledger account payout at creation, use `posted`.
         */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerAccountPayoutCreateBody &&
                this.fundingLedgerAccountId == other.fundingLedgerAccountId &&
                this.payoutLedgerAccountId == other.payoutLedgerAccountId &&
                this.allowEitherDirection == other.allowEitherDirection &&
                this.description == other.description &&
                this.effectiveAtUpperBound == other.effectiveAtUpperBound &&
                this.metadata == other.metadata &&
                this.skipPayoutLedgerTransaction == other.skipPayoutLedgerTransaction &&
                this.status == other.status &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        fundingLedgerAccountId,
                        payoutLedgerAccountId,
                        allowEitherDirection,
                        description,
                        effectiveAtUpperBound,
                        metadata,
                        skipPayoutLedgerTransaction,
                        status,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountPayoutCreateBody{fundingLedgerAccountId=$fundingLedgerAccountId, payoutLedgerAccountId=$payoutLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipPayoutLedgerTransaction=$skipPayoutLedgerTransaction, status=$status, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var fundingLedgerAccountId: String? = null
            private var payoutLedgerAccountId: String? = null
            private var allowEitherDirection: Boolean? = null
            private var description: String? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var metadata: Metadata? = null
            private var skipPayoutLedgerTransaction: Boolean? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerAccountPayoutCreateBody: LedgerAccountPayoutCreateBody) =
                apply {
                    this.fundingLedgerAccountId =
                        ledgerAccountPayoutCreateBody.fundingLedgerAccountId
                    this.payoutLedgerAccountId = ledgerAccountPayoutCreateBody.payoutLedgerAccountId
                    this.allowEitherDirection = ledgerAccountPayoutCreateBody.allowEitherDirection
                    this.description = ledgerAccountPayoutCreateBody.description
                    this.effectiveAtUpperBound = ledgerAccountPayoutCreateBody.effectiveAtUpperBound
                    this.metadata = ledgerAccountPayoutCreateBody.metadata
                    this.skipPayoutLedgerTransaction =
                        ledgerAccountPayoutCreateBody.skipPayoutLedgerTransaction
                    this.status = ledgerAccountPayoutCreateBody.status
                    additionalProperties(ledgerAccountPayoutCreateBody.additionalProperties)
                }

            /**
             * The id of the funding ledger account that sends to or receives funds from the payout
             * ledger account.
             */
            @JsonProperty("funding_ledger_account_id")
            fun fundingLedgerAccountId(fundingLedgerAccountId: String) = apply {
                this.fundingLedgerAccountId = fundingLedgerAccountId
            }

            /**
             * The id of the payout ledger account whose ledger entries are queried against, and its
             * balance is reduced as a result.
             */
            @JsonProperty("payout_ledger_account_id")
            fun payoutLedgerAccountId(payoutLedgerAccountId: String) = apply {
                this.payoutLedgerAccountId = payoutLedgerAccountId
            }

            /**
             * If true, the payout amount and payout_entry_direction will bring the payout ledger
             * account's balance closer to zero, even if the balance is negative.
             */
            @JsonProperty("allow_either_direction")
            fun allowEitherDirection(allowEitherDirection: Boolean) = apply {
                this.allowEitherDirection = allowEitherDirection
            }

            /** The description of the ledger account payout. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account payout. The default value is the created_at timestamp
             * of the ledger account payout.
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
             * payouts.
             */
            @JsonProperty("skip_payout_ledger_transaction")
            fun skipPayoutLedgerTransaction(skipPayoutLedgerTransaction: Boolean) = apply {
                this.skipPayoutLedgerTransaction = skipPayoutLedgerTransaction
            }

            /**
             * The status of the ledger account payout. It is set to `pending` by default. To post a
             * ledger account payout at creation, use `posted`.
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

            fun build(): LedgerAccountPayoutCreateBody =
                LedgerAccountPayoutCreateBody(
                    checkNotNull(fundingLedgerAccountId) {
                        "`fundingLedgerAccountId` is required but was not set"
                    },
                    checkNotNull(payoutLedgerAccountId) {
                        "`payoutLedgerAccountId` is required but was not set"
                    },
                    allowEitherDirection,
                    description,
                    effectiveAtUpperBound,
                    metadata,
                    skipPayoutLedgerTransaction,
                    status,
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

        return other is LedgerAccountPayoutCreateParams &&
            this.fundingLedgerAccountId == other.fundingLedgerAccountId &&
            this.payoutLedgerAccountId == other.payoutLedgerAccountId &&
            this.allowEitherDirection == other.allowEitherDirection &&
            this.description == other.description &&
            this.effectiveAtUpperBound == other.effectiveAtUpperBound &&
            this.metadata == other.metadata &&
            this.skipPayoutLedgerTransaction == other.skipPayoutLedgerTransaction &&
            this.status == other.status &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            fundingLedgerAccountId,
            payoutLedgerAccountId,
            allowEitherDirection,
            description,
            effectiveAtUpperBound,
            metadata,
            skipPayoutLedgerTransaction,
            status,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LedgerAccountPayoutCreateParams{fundingLedgerAccountId=$fundingLedgerAccountId, payoutLedgerAccountId=$payoutLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipPayoutLedgerTransaction=$skipPayoutLedgerTransaction, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var fundingLedgerAccountId: String? = null
        private var payoutLedgerAccountId: String? = null
        private var allowEitherDirection: Boolean? = null
        private var description: String? = null
        private var effectiveAtUpperBound: OffsetDateTime? = null
        private var metadata: Metadata? = null
        private var skipPayoutLedgerTransaction: Boolean? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountPayoutCreateParams: LedgerAccountPayoutCreateParams) =
            apply {
                this.fundingLedgerAccountId = ledgerAccountPayoutCreateParams.fundingLedgerAccountId
                this.payoutLedgerAccountId = ledgerAccountPayoutCreateParams.payoutLedgerAccountId
                this.allowEitherDirection = ledgerAccountPayoutCreateParams.allowEitherDirection
                this.description = ledgerAccountPayoutCreateParams.description
                this.effectiveAtUpperBound = ledgerAccountPayoutCreateParams.effectiveAtUpperBound
                this.metadata = ledgerAccountPayoutCreateParams.metadata
                this.skipPayoutLedgerTransaction =
                    ledgerAccountPayoutCreateParams.skipPayoutLedgerTransaction
                this.status = ledgerAccountPayoutCreateParams.status
                additionalQueryParams(ledgerAccountPayoutCreateParams.additionalQueryParams)
                additionalHeaders(ledgerAccountPayoutCreateParams.additionalHeaders)
                additionalBodyProperties(ledgerAccountPayoutCreateParams.additionalBodyProperties)
            }

        /**
         * The id of the funding ledger account that sends to or receives funds from the payout
         * ledger account.
         */
        fun fundingLedgerAccountId(fundingLedgerAccountId: String) = apply {
            this.fundingLedgerAccountId = fundingLedgerAccountId
        }

        /**
         * The id of the payout ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun payoutLedgerAccountId(payoutLedgerAccountId: String) = apply {
            this.payoutLedgerAccountId = payoutLedgerAccountId
        }

        /**
         * If true, the payout amount and payout_entry_direction will bring the payout ledger
         * account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(allowEitherDirection: Boolean) = apply {
            this.allowEitherDirection = allowEitherDirection
        }

        /** The description of the ledger account payout. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account payout. The default value is the created_at timestamp of
         * the ledger account payout.
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
         * payouts.
         */
        fun skipPayoutLedgerTransaction(skipPayoutLedgerTransaction: Boolean) = apply {
            this.skipPayoutLedgerTransaction = skipPayoutLedgerTransaction
        }

        /**
         * The status of the ledger account payout. It is set to `pending` by default. To post a
         * ledger account payout at creation, use `posted`.
         */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): LedgerAccountPayoutCreateParams =
            LedgerAccountPayoutCreateParams(
                checkNotNull(fundingLedgerAccountId) {
                    "`fundingLedgerAccountId` is required but was not set"
                },
                checkNotNull(payoutLedgerAccountId) {
                    "`payoutLedgerAccountId` is required but was not set"
                },
                allowEitherDirection,
                description,
                effectiveAtUpperBound,
                metadata,
                skipPayoutLedgerTransaction,
                status,
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

            return other is Status && this.value == other.value
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
