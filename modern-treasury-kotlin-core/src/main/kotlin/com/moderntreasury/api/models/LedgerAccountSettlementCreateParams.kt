// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Create a ledger account settlement. */
class LedgerAccountSettlementCreateParams
constructor(
    private val body: LedgerAccountSettlementCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     */
    fun contraLedgerAccountId(): String = body.contraLedgerAccountId()

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     */
    fun settledLedgerAccountId(): String = body.settledLedgerAccountId()

    /**
     * If true, the settlement amount and settlement_entry_direction will bring the settlement
     * ledger account's balance closer to zero, even if the balance is negative.
     */
    fun allowEitherDirection(): Boolean? = body.allowEitherDirection()

    /** The description of the ledger account settlement. */
    fun description(): String? = body.description()

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     */
    fun effectiveAtUpperBound(): OffsetDateTime? = body.effectiveAtUpperBound()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /**
     * It is set to `false` by default. It should be set to `true` when migrating existing
     * settlements.
     */
    fun skipSettlementLedgerTransaction(): Boolean? = body.skipSettlementLedgerTransaction()

    /**
     * The status of the ledger account settlement. It is set to `pending` by default. To post a
     * ledger account settlement at creation, use `posted`.
     */
    fun status(): Status? = body.status()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): LedgerAccountSettlementCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerAccountSettlementCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contra_ledger_account_id") private val contraLedgerAccountId: String,
        @JsonProperty("settled_ledger_account_id") private val settledLedgerAccountId: String,
        @JsonProperty("allow_either_direction") private val allowEitherDirection: Boolean?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("effective_at_upper_bound")
        private val effectiveAtUpperBound: OffsetDateTime?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("skip_settlement_ledger_transaction")
        private val skipSettlementLedgerTransaction: Boolean?,
        @JsonProperty("status") private val status: Status?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        @JsonProperty("contra_ledger_account_id")
        fun contraLedgerAccountId(): String = contraLedgerAccountId

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        @JsonProperty("settled_ledger_account_id")
        fun settledLedgerAccountId(): String = settledLedgerAccountId

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
                contraLedgerAccountId = ledgerAccountSettlementCreateBody.contraLedgerAccountId
                settledLedgerAccountId = ledgerAccountSettlementCreateBody.settledLedgerAccountId
                allowEitherDirection = ledgerAccountSettlementCreateBody.allowEitherDirection
                description = ledgerAccountSettlementCreateBody.description
                effectiveAtUpperBound = ledgerAccountSettlementCreateBody.effectiveAtUpperBound
                metadata = ledgerAccountSettlementCreateBody.metadata
                skipSettlementLedgerTransaction =
                    ledgerAccountSettlementCreateBody.skipSettlementLedgerTransaction
                status = ledgerAccountSettlementCreateBody.status
                additionalProperties =
                    ledgerAccountSettlementCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * The id of the contra ledger account that sends to or receives funds from the settled
             * ledger account.
             */
            fun contraLedgerAccountId(contraLedgerAccountId: String) = apply {
                this.contraLedgerAccountId = contraLedgerAccountId
            }

            /**
             * The id of the settled ledger account whose ledger entries are queried against, and
             * its balance is reduced as a result.
             */
            fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
                this.settledLedgerAccountId = settledLedgerAccountId
            }

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            fun allowEitherDirection(allowEitherDirection: Boolean?) = apply {
                this.allowEitherDirection = allowEitherDirection
            }

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            fun allowEitherDirection(allowEitherDirection: Boolean) =
                allowEitherDirection(allowEitherDirection as Boolean?)

            /** The description of the ledger account settlement. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account settlement. The default value is the created_at
             * timestamp of the ledger account settlement.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean?) = apply {
                this.skipSettlementLedgerTransaction = skipSettlementLedgerTransaction
            }

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) =
                skipSettlementLedgerTransaction(skipSettlementLedgerTransaction as Boolean?)

            /**
             * The status of the ledger account settlement. It is set to `pending` by default. To
             * post a ledger account settlement at creation, use `posted`.
             */
            fun status(status: Status?) = apply { this.status = status }

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

        private var body: LedgerAccountSettlementCreateBody.Builder =
            LedgerAccountSettlementCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            ledgerAccountSettlementCreateParams: LedgerAccountSettlementCreateParams
        ) = apply {
            body = ledgerAccountSettlementCreateParams.body.toBuilder()
            additionalHeaders = ledgerAccountSettlementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountSettlementCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        fun contraLedgerAccountId(contraLedgerAccountId: String) = apply {
            body.contraLedgerAccountId(contraLedgerAccountId)
        }

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
            body.settledLedgerAccountId(settledLedgerAccountId)
        }

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(allowEitherDirection: Boolean?) = apply {
            body.allowEitherDirection(allowEitherDirection)
        }

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(allowEitherDirection: Boolean) =
            allowEitherDirection(allowEitherDirection as Boolean?)

        /** The description of the ledger account settlement. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean?) = apply {
            body.skipSettlementLedgerTransaction(skipSettlementLedgerTransaction)
        }

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) =
            skipSettlementLedgerTransaction(skipSettlementLedgerTransaction as Boolean?)

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        fun status(status: Status?) = apply { body.status(status) }

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

        fun build(): LedgerAccountSettlementCreateParams =
            LedgerAccountSettlementCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val POSTED = of("posted")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
