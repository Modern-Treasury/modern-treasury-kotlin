// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Create a ledger account statement. */
class LedgerAccountStatementCreateParams
private constructor(
    private val body: LedgerAccountStatementCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The inclusive lower bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAtLowerBound(): OffsetDateTime = body.effectiveAtLowerBound()

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAtUpperBound(): OffsetDateTime = body.effectiveAtUpperBound()

    /**
     * The id of the ledger account whose ledger entries are queried against, and its balances are
     * computed as a result.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerAccountId(): String = body.ledgerAccountId()

    /**
     * The description of the ledger account statement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Returns the raw JSON value of [effectiveAtLowerBound].
     *
     * Unlike [effectiveAtLowerBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _effectiveAtLowerBound(): JsonField<OffsetDateTime> = body._effectiveAtLowerBound()

    /**
     * Returns the raw JSON value of [effectiveAtUpperBound].
     *
     * Unlike [effectiveAtUpperBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = body._effectiveAtUpperBound()

    /**
     * Returns the raw JSON value of [ledgerAccountId].
     *
     * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerAccountId(): JsonField<String> = body._ledgerAccountId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountStatementCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .effectiveAtLowerBound()
         * .effectiveAtUpperBound()
         * .ledgerAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountStatementCreateParams]. */
    class Builder internal constructor() {

        private var body: LedgerAccountStatementCreateRequest.Builder =
            LedgerAccountStatementCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerAccountStatementCreateParams: LedgerAccountStatementCreateParams) =
            apply {
                body = ledgerAccountStatementCreateParams.body.toBuilder()
                additionalHeaders = ledgerAccountStatementCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    ledgerAccountStatementCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
            body.effectiveAtLowerBound(effectiveAtLowerBound)
        }

        /**
         * Sets [Builder.effectiveAtLowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtLowerBound] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: JsonField<OffsetDateTime>) = apply {
            body.effectiveAtLowerBound(effectiveAtLowerBound)
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * Sets [Builder.effectiveAtUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtUpperBound] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            body.ledgerAccountId(ledgerAccountId)
        }

        /**
         * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            body.ledgerAccountId(ledgerAccountId)
        }

        /** The description of the ledger account statement. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [LedgerAccountStatementCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .effectiveAtLowerBound()
         * .effectiveAtUpperBound()
         * .ledgerAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountStatementCreateParams =
            LedgerAccountStatementCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): LedgerAccountStatementCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class LedgerAccountStatementCreateRequest
    private constructor(
        private val effectiveAtLowerBound: JsonField<OffsetDateTime>,
        private val effectiveAtUpperBound: JsonField<OffsetDateTime>,
        private val ledgerAccountId: JsonField<String>,
        private val description: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effective_at_lower_bound")
            @ExcludeMissing
            effectiveAtLowerBound: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("effective_at_upper_bound")
            @ExcludeMissing
            effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            ledgerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(
            effectiveAtLowerBound,
            effectiveAtUpperBound,
            ledgerAccountId,
            description,
            metadata,
            mutableMapOf(),
        )

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveAtLowerBound(): OffsetDateTime =
            effectiveAtLowerBound.getRequired("effective_at_lower_bound")

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveAtUpperBound(): OffsetDateTime =
            effectiveAtUpperBound.getRequired("effective_at_upper_bound")

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

        /**
         * The description of the ledger account statement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [effectiveAtLowerBound].
         *
         * Unlike [effectiveAtLowerBound], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("effective_at_lower_bound")
        @ExcludeMissing
        fun _effectiveAtLowerBound(): JsonField<OffsetDateTime> = effectiveAtLowerBound

        /**
         * Returns the raw JSON value of [effectiveAtUpperBound].
         *
         * Unlike [effectiveAtUpperBound], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

        /**
         * Returns the raw JSON value of [ledgerAccountId].
         *
         * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerAccountStatementCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveAtLowerBound()
             * .effectiveAtUpperBound()
             * .ledgerAccountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerAccountStatementCreateRequest]. */
        class Builder internal constructor() {

            private var effectiveAtLowerBound: JsonField<OffsetDateTime>? = null
            private var effectiveAtUpperBound: JsonField<OffsetDateTime>? = null
            private var ledgerAccountId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountStatementCreateRequest: LedgerAccountStatementCreateRequest
            ) = apply {
                effectiveAtLowerBound = ledgerAccountStatementCreateRequest.effectiveAtLowerBound
                effectiveAtUpperBound = ledgerAccountStatementCreateRequest.effectiveAtUpperBound
                ledgerAccountId = ledgerAccountStatementCreateRequest.ledgerAccountId
                description = ledgerAccountStatementCreateRequest.description
                metadata = ledgerAccountStatementCreateRequest.metadata
                additionalProperties =
                    ledgerAccountStatementCreateRequest.additionalProperties.toMutableMap()
            }

            /**
             * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) =
                effectiveAtLowerBound(JsonField.of(effectiveAtLowerBound))

            /**
             * Sets [Builder.effectiveAtLowerBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAtLowerBound] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun effectiveAtLowerBound(effectiveAtLowerBound: JsonField<OffsetDateTime>) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) =
                effectiveAtUpperBound(JsonField.of(effectiveAtUpperBound))

            /**
             * Sets [Builder.effectiveAtUpperBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAtUpperBound] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * The id of the ledger account whose ledger entries are queried against, and its
             * balances are computed as a result.
             */
            fun ledgerAccountId(ledgerAccountId: String) =
                ledgerAccountId(JsonField.of(ledgerAccountId))

            /**
             * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /** The description of the ledger account statement. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [LedgerAccountStatementCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveAtLowerBound()
             * .effectiveAtUpperBound()
             * .ledgerAccountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LedgerAccountStatementCreateRequest =
                LedgerAccountStatementCreateRequest(
                    checkRequired("effectiveAtLowerBound", effectiveAtLowerBound),
                    checkRequired("effectiveAtUpperBound", effectiveAtUpperBound),
                    checkRequired("ledgerAccountId", ledgerAccountId),
                    description,
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LedgerAccountStatementCreateRequest = apply {
            if (validated) {
                return@apply
            }

            effectiveAtLowerBound()
            effectiveAtUpperBound()
            ledgerAccountId()
            description()
            metadata()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (effectiveAtLowerBound.asKnown() == null) 0 else 1) +
                (if (effectiveAtUpperBound.asKnown() == null) 0 else 1) +
                (if (ledgerAccountId.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountStatementCreateRequest && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && ledgerAccountId == other.ledgerAccountId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveAtLowerBound, effectiveAtUpperBound, ledgerAccountId, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountStatementCreateRequest{effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

        return /* spotless:off */ other is LedgerAccountStatementCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountStatementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
