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

/** Create a ledger transaction that partially posts another ledger transaction. */
class LedgerTransactionCreatePartialPostParams
constructor(
    private val id: String,
    private val body: LedgerTransactionCreatePartialPostBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = id

    /**
     * An array of ledger entry objects to be set on the posted ledger transaction. There must be
     * one entry for each of the existing entries with a lesser amount than the existing entry.
     */
    fun postedLedgerEntries(): List<LedgerEntryPartialPostCreateRequest> =
        body.postedLedgerEntries()

    /**
     * An optional free-form description for the posted ledger transaction. Maximum of 1000
     * characters allowed.
     */
    fun description(): String? = body.description()

    /**
     * The timestamp (IS08601 format) at which the posted ledger transaction happened for reporting
     * purposes.
     */
    fun effectiveAt(): OffsetDateTime? = body.effectiveAt()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /**
     * An array of ledger entry objects to be set on the posted ledger transaction. There must be
     * one entry for each of the existing entries with a lesser amount than the existing entry.
     */
    fun _postedLedgerEntries(): JsonField<List<LedgerEntryPartialPostCreateRequest>> =
        body._postedLedgerEntries()

    /**
     * An optional free-form description for the posted ledger transaction. Maximum of 1000
     * characters allowed.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * The timestamp (IS08601 format) at which the posted ledger transaction happened for reporting
     * purposes.
     */
    fun _effectiveAt(): JsonField<OffsetDateTime> = body._effectiveAt()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): LedgerTransactionCreatePartialPostBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class LedgerTransactionCreatePartialPostBody
    @JsonCreator
    internal constructor(
        @JsonProperty("posted_ledger_entries")
        @ExcludeMissing
        private val postedLedgerEntries: JsonField<List<LedgerEntryPartialPostCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An array of ledger entry objects to be set on the posted ledger transaction. There must
         * be one entry for each of the existing entries with a lesser amount than the existing
         * entry.
         */
        fun postedLedgerEntries(): List<LedgerEntryPartialPostCreateRequest> =
            postedLedgerEntries.getRequired("posted_ledger_entries")

        /**
         * An optional free-form description for the posted ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(): String? = description.getNullable("description")

        /**
         * The timestamp (IS08601 format) at which the posted ledger transaction happened for
         * reporting purposes.
         */
        fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * An array of ledger entry objects to be set on the posted ledger transaction. There must
         * be one entry for each of the existing entries with a lesser amount than the existing
         * entry.
         */
        @JsonProperty("posted_ledger_entries")
        @ExcludeMissing
        fun _postedLedgerEntries(): JsonField<List<LedgerEntryPartialPostCreateRequest>> =
            postedLedgerEntries

        /**
         * An optional free-form description for the posted ledger transaction. Maximum of 1000
         * characters allowed.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The timestamp (IS08601 format) at which the posted ledger transaction happened for
         * reporting purposes.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerTransactionCreatePartialPostBody = apply {
            if (validated) {
                return@apply
            }

            postedLedgerEntries().forEach { it.validate() }
            description()
            effectiveAt()
            metadata()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var postedLedgerEntries:
                JsonField<MutableList<LedgerEntryPartialPostCreateRequest>>? =
                null
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerTransactionCreatePartialPostBody: LedgerTransactionCreatePartialPostBody
            ) = apply {
                postedLedgerEntries =
                    ledgerTransactionCreatePartialPostBody.postedLedgerEntries.map {
                        it.toMutableList()
                    }
                description = ledgerTransactionCreatePartialPostBody.description
                effectiveAt = ledgerTransactionCreatePartialPostBody.effectiveAt
                metadata = ledgerTransactionCreatePartialPostBody.metadata
                additionalProperties =
                    ledgerTransactionCreatePartialPostBody.additionalProperties.toMutableMap()
            }

            /**
             * An array of ledger entry objects to be set on the posted ledger transaction. There
             * must be one entry for each of the existing entries with a lesser amount than the
             * existing entry.
             */
            fun postedLedgerEntries(
                postedLedgerEntries: List<LedgerEntryPartialPostCreateRequest>
            ) = postedLedgerEntries(JsonField.of(postedLedgerEntries))

            /**
             * An array of ledger entry objects to be set on the posted ledger transaction. There
             * must be one entry for each of the existing entries with a lesser amount than the
             * existing entry.
             */
            fun postedLedgerEntries(
                postedLedgerEntries: JsonField<List<LedgerEntryPartialPostCreateRequest>>
            ) = apply { this.postedLedgerEntries = postedLedgerEntries.map { it.toMutableList() } }

            /**
             * An array of ledger entry objects to be set on the posted ledger transaction. There
             * must be one entry for each of the existing entries with a lesser amount than the
             * existing entry.
             */
            fun addPostedLedgerEntry(postedLedgerEntry: LedgerEntryPartialPostCreateRequest) =
                apply {
                    postedLedgerEntries =
                        (postedLedgerEntries ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(postedLedgerEntry)
                        }
                }

            /**
             * An optional free-form description for the posted ledger transaction. Maximum of 1000
             * characters allowed.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * An optional free-form description for the posted ledger transaction. Maximum of 1000
             * characters allowed.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The timestamp (IS08601 format) at which the posted ledger transaction happened for
             * reporting purposes.
             */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * The timestamp (IS08601 format) at which the posted ledger transaction happened for
             * reporting purposes.
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
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

            fun build(): LedgerTransactionCreatePartialPostBody =
                LedgerTransactionCreatePartialPostBody(
                    checkRequired("postedLedgerEntries", postedLedgerEntries).map {
                        it.toImmutable()
                    },
                    description,
                    effectiveAt,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerTransactionCreatePartialPostBody && postedLedgerEntries == other.postedLedgerEntries && description == other.description && effectiveAt == other.effectiveAt && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(postedLedgerEntries, description, effectiveAt, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerTransactionCreatePartialPostBody{postedLedgerEntries=$postedLedgerEntries, description=$description, effectiveAt=$effectiveAt, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var body: LedgerTransactionCreatePartialPostBody.Builder =
            LedgerTransactionCreatePartialPostBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            ledgerTransactionCreatePartialPostParams: LedgerTransactionCreatePartialPostParams
        ) = apply {
            id = ledgerTransactionCreatePartialPostParams.id
            body = ledgerTransactionCreatePartialPostParams.body.toBuilder()
            additionalHeaders =
                ledgerTransactionCreatePartialPostParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerTransactionCreatePartialPostParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * An array of ledger entry objects to be set on the posted ledger transaction. There must
         * be one entry for each of the existing entries with a lesser amount than the existing
         * entry.
         */
        fun postedLedgerEntries(postedLedgerEntries: List<LedgerEntryPartialPostCreateRequest>) =
            apply {
                body.postedLedgerEntries(postedLedgerEntries)
            }

        /**
         * An array of ledger entry objects to be set on the posted ledger transaction. There must
         * be one entry for each of the existing entries with a lesser amount than the existing
         * entry.
         */
        fun postedLedgerEntries(
            postedLedgerEntries: JsonField<List<LedgerEntryPartialPostCreateRequest>>
        ) = apply { body.postedLedgerEntries(postedLedgerEntries) }

        /**
         * An array of ledger entry objects to be set on the posted ledger transaction. There must
         * be one entry for each of the existing entries with a lesser amount than the existing
         * entry.
         */
        fun addPostedLedgerEntry(postedLedgerEntry: LedgerEntryPartialPostCreateRequest) = apply {
            body.addPostedLedgerEntry(postedLedgerEntry)
        }

        /**
         * An optional free-form description for the posted ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(description: String) = apply { body.description(description) }

        /**
         * An optional free-form description for the posted ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The timestamp (IS08601 format) at which the posted ledger transaction happened for
         * reporting purposes.
         */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { body.effectiveAt(effectiveAt) }

        /**
         * The timestamp (IS08601 format) at which the posted ledger transaction happened for
         * reporting purposes.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            body.effectiveAt(effectiveAt)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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

        fun build(): LedgerTransactionCreatePartialPostParams =
            LedgerTransactionCreatePartialPostParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class LedgerEntryPartialPostCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(): Direction = direction.getRequired("direction")

        /** The ledger account that this ledger entry is associated with. */
        fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /** The ledger account that this ledger entry is associated with. */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEntryPartialPostCreateRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            direction()
            ledgerAccountId()
            metadata()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long>? = null
            private var direction: JsonField<Direction>? = null
            private var ledgerAccountId: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerEntryPartialPostCreateRequest: LedgerEntryPartialPostCreateRequest
            ) = apply {
                amount = ledgerEntryPartialPostCreateRequest.amount
                direction = ledgerEntryPartialPostCreateRequest.direction
                ledgerAccountId = ledgerEntryPartialPostCreateRequest.ledgerAccountId
                metadata = ledgerEntryPartialPostCreateRequest.metadata
                additionalProperties =
                    ledgerEntryPartialPostCreateRequest.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** The ledger account that this ledger entry is associated with. */
            fun ledgerAccountId(ledgerAccountId: String) =
                ledgerAccountId(JsonField.of(ledgerAccountId))

            /** The ledger account that this ledger entry is associated with. */
            fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                this.ledgerAccountId = ledgerAccountId
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

            fun build(): LedgerEntryPartialPostCreateRequest =
                LedgerEntryPartialPostCreateRequest(
                    checkRequired("amount", amount),
                    checkRequired("direction", direction),
                    checkRequired("ledgerAccountId", ledgerAccountId),
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        class Direction
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CREDIT = of("credit")

                val DEBIT = of("debit")

                fun of(value: String) = Direction(JsonField.of(value))
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
                    else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

            return /* spotless:off */ other is LedgerEntryPartialPostCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEntryPartialPostCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, metadata=$metadata, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is LedgerTransactionCreatePartialPostParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerTransactionCreatePartialPostParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
