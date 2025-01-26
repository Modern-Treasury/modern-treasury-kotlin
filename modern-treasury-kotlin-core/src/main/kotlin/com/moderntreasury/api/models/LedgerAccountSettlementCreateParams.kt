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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Create a ledger account settlement. */
class LedgerAccountSettlementCreateParams
private constructor(
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

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     */
    fun _contraLedgerAccountId(): JsonField<String> = body._contraLedgerAccountId()

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     */
    fun _settledLedgerAccountId(): JsonField<String> = body._settledLedgerAccountId()

    /**
     * If true, the settlement amount and settlement_entry_direction will bring the settlement
     * ledger account's balance closer to zero, even if the balance is negative.
     */
    fun _allowEitherDirection(): JsonField<Boolean> = body._allowEitherDirection()

    /** The description of the ledger account settlement. */
    fun _description(): JsonField<String> = body._description()

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     */
    fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = body._effectiveAtUpperBound()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * It is set to `false` by default. It should be set to `true` when migrating existing
     * settlements.
     */
    fun _skipSettlementLedgerTransaction(): JsonField<Boolean> =
        body._skipSettlementLedgerTransaction()

    /**
     * The status of the ledger account settlement. It is set to `pending` by default. To post a
     * ledger account settlement at creation, use `posted`.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): LedgerAccountSettlementCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerAccountSettlementCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contra_ledger_account_id")
        @ExcludeMissing
        private val contraLedgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settled_ledger_account_id")
        @ExcludeMissing
        private val settledLedgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allow_either_direction")
        @ExcludeMissing
        private val allowEitherDirection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        private val effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("skip_settlement_ledger_transaction")
        @ExcludeMissing
        private val skipSettlementLedgerTransaction: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        fun contraLedgerAccountId(): String =
            contraLedgerAccountId.getRequired("contra_ledger_account_id")

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun settledLedgerAccountId(): String =
            settledLedgerAccountId.getRequired("settled_ledger_account_id")

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(): Boolean? =
            allowEitherDirection.getNullable("allow_either_direction")

        /** The description of the ledger account settlement. */
        fun description(): String? = description.getNullable("description")

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(): OffsetDateTime? =
            effectiveAtUpperBound.getNullable("effective_at_upper_bound")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        fun skipSettlementLedgerTransaction(): Boolean? =
            skipSettlementLedgerTransaction.getNullable("skip_settlement_ledger_transaction")

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        fun status(): Status? = status.getNullable("status")

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        @JsonProperty("contra_ledger_account_id")
        @ExcludeMissing
        fun _contraLedgerAccountId(): JsonField<String> = contraLedgerAccountId

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        @JsonProperty("settled_ledger_account_id")
        @ExcludeMissing
        fun _settledLedgerAccountId(): JsonField<String> = settledLedgerAccountId

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        @JsonProperty("allow_either_direction")
        @ExcludeMissing
        fun _allowEitherDirection(): JsonField<Boolean> = allowEitherDirection

        /** The description of the ledger account settlement. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        @JsonProperty("skip_settlement_ledger_transaction")
        @ExcludeMissing
        fun _skipSettlementLedgerTransaction(): JsonField<Boolean> = skipSettlementLedgerTransaction

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerAccountSettlementCreateBody = apply {
            if (validated) {
                return@apply
            }

            contraLedgerAccountId()
            settledLedgerAccountId()
            allowEitherDirection()
            description()
            effectiveAtUpperBound()
            metadata()?.validate()
            skipSettlementLedgerTransaction()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var contraLedgerAccountId: JsonField<String>? = null
            private var settledLedgerAccountId: JsonField<String>? = null
            private var allowEitherDirection: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var skipSettlementLedgerTransaction: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
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
            fun contraLedgerAccountId(contraLedgerAccountId: String) =
                contraLedgerAccountId(JsonField.of(contraLedgerAccountId))

            /**
             * The id of the contra ledger account that sends to or receives funds from the settled
             * ledger account.
             */
            fun contraLedgerAccountId(contraLedgerAccountId: JsonField<String>) = apply {
                this.contraLedgerAccountId = contraLedgerAccountId
            }

            /**
             * The id of the settled ledger account whose ledger entries are queried against, and
             * its balance is reduced as a result.
             */
            fun settledLedgerAccountId(settledLedgerAccountId: String) =
                settledLedgerAccountId(JsonField.of(settledLedgerAccountId))

            /**
             * The id of the settled ledger account whose ledger entries are queried against, and
             * its balance is reduced as a result.
             */
            fun settledLedgerAccountId(settledLedgerAccountId: JsonField<String>) = apply {
                this.settledLedgerAccountId = settledLedgerAccountId
            }

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            fun allowEitherDirection(allowEitherDirection: Boolean?) =
                allowEitherDirection(JsonField.ofNullable(allowEitherDirection))

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            fun allowEitherDirection(allowEitherDirection: Boolean) =
                allowEitherDirection(allowEitherDirection as Boolean?)

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            fun allowEitherDirection(allowEitherDirection: JsonField<Boolean>) = apply {
                this.allowEitherDirection = allowEitherDirection
            }

            /** The description of the ledger account settlement. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** The description of the ledger account settlement. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account settlement. The default value is the created_at
             * timestamp of the ledger account settlement.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) =
                effectiveAtUpperBound(JsonField.ofNullable(effectiveAtUpperBound))

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account settlement. The default value is the created_at
             * timestamp of the ledger account settlement.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean?) =
                skipSettlementLedgerTransaction(
                    JsonField.ofNullable(skipSettlementLedgerTransaction)
                )

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) =
                skipSettlementLedgerTransaction(skipSettlementLedgerTransaction as Boolean?)

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            fun skipSettlementLedgerTransaction(
                skipSettlementLedgerTransaction: JsonField<Boolean>
            ) = apply { this.skipSettlementLedgerTransaction = skipSettlementLedgerTransaction }

            /**
             * The status of the ledger account settlement. It is set to `pending` by default. To
             * post a ledger account settlement at creation, use `posted`.
             */
            fun status(status: Status?) = status(JsonField.ofNullable(status))

            /**
             * The status of the ledger account settlement. It is set to `pending` by default. To
             * post a ledger account settlement at creation, use `posted`.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
                    checkRequired("contraLedgerAccountId", contraLedgerAccountId),
                    checkRequired("settledLedgerAccountId", settledLedgerAccountId),
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
    class Builder internal constructor() {

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
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        fun contraLedgerAccountId(contraLedgerAccountId: JsonField<String>) = apply {
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
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun settledLedgerAccountId(settledLedgerAccountId: JsonField<String>) = apply {
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

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(allowEitherDirection: JsonField<Boolean>) = apply {
            body.allowEitherDirection(allowEitherDirection)
        }

        /** The description of the ledger account settlement. */
        fun description(description: String?) = apply { body.description(description) }

        /** The description of the ledger account settlement. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: JsonField<Boolean>) =
            apply {
                body.skipSettlementLedgerTransaction(skipSettlementLedgerTransaction)
            }

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        fun status(status: Status?) = apply { body.status(status) }

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

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

    /**
     * The status of the ledger account settlement. It is set to `pending` by default. To post a
     * ledger account settlement at creation, use `posted`.
     */
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
