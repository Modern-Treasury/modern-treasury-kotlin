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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

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

            return /* spotless:off */ other is LedgerAccountSettlementCreateBody && contraLedgerAccountId == other.contraLedgerAccountId && settledLedgerAccountId == other.settledLedgerAccountId && allowEitherDirection == other.allowEitherDirection && description == other.description && effectiveAtUpperBound == other.effectiveAtUpperBound && metadata == other.metadata && skipSettlementLedgerTransaction == other.skipSettlementLedgerTransaction && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contraLedgerAccountId, settledLedgerAccountId, allowEitherDirection, description, effectiveAtUpperBound, metadata, skipSettlementLedgerTransaction, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountSettlementCreateBody{contraLedgerAccountId=$contraLedgerAccountId, settledLedgerAccountId=$settledLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipSettlementLedgerTransaction=$skipSettlementLedgerTransaction, status=$status, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            ledgerAccountSettlementCreateParams: LedgerAccountSettlementCreateParams
        ) = apply {
            contraLedgerAccountId = ledgerAccountSettlementCreateParams.contraLedgerAccountId
            settledLedgerAccountId = ledgerAccountSettlementCreateParams.settledLedgerAccountId
            allowEitherDirection = ledgerAccountSettlementCreateParams.allowEitherDirection
            description = ledgerAccountSettlementCreateParams.description
            effectiveAtUpperBound = ledgerAccountSettlementCreateParams.effectiveAtUpperBound
            metadata = ledgerAccountSettlementCreateParams.metadata
            skipSettlementLedgerTransaction =
                ledgerAccountSettlementCreateParams.skipSettlementLedgerTransaction
            status = ledgerAccountSettlementCreateParams.status
            additionalHeaders = ledgerAccountSettlementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountSettlementCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                ledgerAccountSettlementCreateParams.additionalBodyProperties.toMutableMap()
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementCreateParams && contraLedgerAccountId == other.contraLedgerAccountId && settledLedgerAccountId == other.settledLedgerAccountId && allowEitherDirection == other.allowEitherDirection && description == other.description && effectiveAtUpperBound == other.effectiveAtUpperBound && metadata == other.metadata && skipSettlementLedgerTransaction == other.skipSettlementLedgerTransaction && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(contraLedgerAccountId, settledLedgerAccountId, allowEitherDirection, description, effectiveAtUpperBound, metadata, skipSettlementLedgerTransaction, status, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementCreateParams{contraLedgerAccountId=$contraLedgerAccountId, settledLedgerAccountId=$settledLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipSettlementLedgerTransaction=$skipSettlementLedgerTransaction, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
