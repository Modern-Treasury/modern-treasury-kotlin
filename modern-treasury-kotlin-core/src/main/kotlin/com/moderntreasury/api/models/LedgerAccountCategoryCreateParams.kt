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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create a ledger account category. */
class LedgerAccountCategoryCreateParams
private constructor(
    private val body: LedgerAccountCategoryCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The currency of the ledger account category.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The id of the ledger that this account category belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerId(): String = body.ledgerId()

    /**
     * The name of the ledger account category.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The normal balance of the ledger account category.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun normalBalance(): TransactionDirection = body.normalBalance()

    /**
     * The currency exponent of the ledger account category.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencyExponent(): Long? = body.currencyExponent()

    /**
     * The description of the ledger account category.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * The array of ledger account category ids that this ledger account category should be a child
     * of.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccountCategoryIds(): List<String>? = body.ledgerAccountCategoryIds()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [ledgerId].
     *
     * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerId(): JsonField<String> = body._ledgerId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [normalBalance].
     *
     * Unlike [normalBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _normalBalance(): JsonField<TransactionDirection> = body._normalBalance()

    /**
     * Returns the raw JSON value of [currencyExponent].
     *
     * Unlike [currencyExponent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _currencyExponent(): JsonField<Long> = body._currencyExponent()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [ledgerAccountCategoryIds].
     *
     * Unlike [ledgerAccountCategoryIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ledgerAccountCategoryIds(): JsonField<List<String>> = body._ledgerAccountCategoryIds()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .currency()
         * .ledgerId()
         * .name()
         * .normalBalance()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountCategoryCreateParams]. */
    class Builder internal constructor() {

        private var body: LedgerAccountCategoryCreateRequest.Builder =
            LedgerAccountCategoryCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerAccountCategoryCreateParams: LedgerAccountCategoryCreateParams) =
            apply {
                body = ledgerAccountCategoryCreateParams.body.toBuilder()
                additionalHeaders = ledgerAccountCategoryCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    ledgerAccountCategoryCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [currency]
         * - [ledgerId]
         * - [name]
         * - [normalBalance]
         * - [currencyExponent]
         * - etc.
         */
        fun body(body: LedgerAccountCategoryCreateRequest) = apply { this.body = body.toBuilder() }

        /** The currency of the ledger account category. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** The id of the ledger that this account category belongs to. */
        fun ledgerId(ledgerId: String) = apply { body.ledgerId(ledgerId) }

        /**
         * Sets [Builder.ledgerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ledgerId(ledgerId: JsonField<String>) = apply { body.ledgerId(ledgerId) }

        /** The name of the ledger account category. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The normal balance of the ledger account category. */
        fun normalBalance(normalBalance: TransactionDirection) = apply {
            body.normalBalance(normalBalance)
        }

        /**
         * Sets [Builder.normalBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.normalBalance] with a well-typed [TransactionDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
            body.normalBalance(normalBalance)
        }

        /** The currency exponent of the ledger account category. */
        fun currencyExponent(currencyExponent: Long?) = apply {
            body.currencyExponent(currencyExponent)
        }

        /**
         * Alias for [Builder.currencyExponent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun currencyExponent(currencyExponent: Long) = currencyExponent(currencyExponent as Long?)

        /**
         * Sets [Builder.currencyExponent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyExponent] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
            body.currencyExponent(currencyExponent)
        }

        /** The description of the ledger account category. */
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
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) = apply {
            body.ledgerAccountCategoryIds(ledgerAccountCategoryIds)
        }

        /**
         * Sets [Builder.ledgerAccountCategoryIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountCategoryIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: JsonField<List<String>>) = apply {
            body.ledgerAccountCategoryIds(ledgerAccountCategoryIds)
        }

        /**
         * Adds a single [String] to [ledgerAccountCategoryIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            body.addLedgerAccountCategoryId(ledgerAccountCategoryId)
        }

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

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [LedgerAccountCategoryCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .currency()
         * .ledgerId()
         * .name()
         * .normalBalance()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountCategoryCreateParams =
            LedgerAccountCategoryCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LedgerAccountCategoryCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class LedgerAccountCategoryCreateRequest
    private constructor(
        private val currency: JsonField<String>,
        private val ledgerId: JsonField<String>,
        private val name: JsonField<String>,
        private val normalBalance: JsonField<TransactionDirection>,
        private val currencyExponent: JsonField<Long>,
        private val description: JsonField<String>,
        private val ledgerAccountCategoryIds: JsonField<List<String>>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_id")
            @ExcludeMissing
            ledgerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("normal_balance")
            @ExcludeMissing
            normalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            currencyExponent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account_category_ids")
            @ExcludeMissing
            ledgerAccountCategoryIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(
            currency,
            ledgerId,
            name,
            normalBalance,
            currencyExponent,
            description,
            ledgerAccountCategoryIds,
            metadata,
            mutableMapOf(),
        )

        /**
         * The currency of the ledger account category.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The id of the ledger that this account category belongs to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerId(): String = ledgerId.getRequired("ledger_id")

        /**
         * The name of the ledger account category.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The normal balance of the ledger account category.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun normalBalance(): TransactionDirection = normalBalance.getRequired("normal_balance")

        /**
         * The currency exponent of the ledger account category.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currencyExponent(): Long? = currencyExponent.getNullable("currency_exponent")

        /**
         * The description of the ledger account category.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccountCategoryIds(): List<String>? =
            ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [ledgerId].
         *
         * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [normalBalance].
         *
         * Unlike [normalBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("normal_balance")
        @ExcludeMissing
        fun _normalBalance(): JsonField<TransactionDirection> = normalBalance

        /**
         * Returns the raw JSON value of [currencyExponent].
         *
         * Unlike [currencyExponent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun _currencyExponent(): JsonField<Long> = currencyExponent

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [ledgerAccountCategoryIds].
         *
         * Unlike [ledgerAccountCategoryIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account_category_ids")
        @ExcludeMissing
        fun _ledgerAccountCategoryIds(): JsonField<List<String>> = ledgerAccountCategoryIds

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
             * [LedgerAccountCategoryCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .ledgerId()
             * .name()
             * .normalBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerAccountCategoryCreateRequest]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var ledgerId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var normalBalance: JsonField<TransactionDirection>? = null
            private var currencyExponent: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ledgerAccountCategoryIds: JsonField<MutableList<String>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountCategoryCreateRequest: LedgerAccountCategoryCreateRequest
            ) = apply {
                currency = ledgerAccountCategoryCreateRequest.currency
                ledgerId = ledgerAccountCategoryCreateRequest.ledgerId
                name = ledgerAccountCategoryCreateRequest.name
                normalBalance = ledgerAccountCategoryCreateRequest.normalBalance
                currencyExponent = ledgerAccountCategoryCreateRequest.currencyExponent
                description = ledgerAccountCategoryCreateRequest.description
                ledgerAccountCategoryIds =
                    ledgerAccountCategoryCreateRequest.ledgerAccountCategoryIds.map {
                        it.toMutableList()
                    }
                metadata = ledgerAccountCategoryCreateRequest.metadata
                additionalProperties =
                    ledgerAccountCategoryCreateRequest.additionalProperties.toMutableMap()
            }

            /** The currency of the ledger account category. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The id of the ledger that this account category belongs to. */
            fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

            /**
             * Sets [Builder.ledgerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

            /** The name of the ledger account category. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The normal balance of the ledger account category. */
            fun normalBalance(normalBalance: TransactionDirection) =
                normalBalance(JsonField.of(normalBalance))

            /**
             * Sets [Builder.normalBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.normalBalance] with a well-typed
             * [TransactionDirection] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                this.normalBalance = normalBalance
            }

            /** The currency exponent of the ledger account category. */
            fun currencyExponent(currencyExponent: Long?) =
                currencyExponent(JsonField.ofNullable(currencyExponent))

            /**
             * Alias for [Builder.currencyExponent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun currencyExponent(currencyExponent: Long) =
                currencyExponent(currencyExponent as Long?)

            /**
             * Sets [Builder.currencyExponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyExponent] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                this.currencyExponent = currencyExponent
            }

            /** The description of the ledger account category. */
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
             * The array of ledger account category ids that this ledger account category should be
             * a child of.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

            /**
             * Sets [Builder.ledgerAccountCategoryIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountCategoryIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: JsonField<List<String>>) =
                apply {
                    this.ledgerAccountCategoryIds =
                        ledgerAccountCategoryIds.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [ledgerAccountCategoryIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                ledgerAccountCategoryIds =
                    (ledgerAccountCategoryIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ledgerAccountCategoryIds", it).add(ledgerAccountCategoryId)
                    }
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LedgerAccountCategoryCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .ledgerId()
             * .name()
             * .normalBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LedgerAccountCategoryCreateRequest =
                LedgerAccountCategoryCreateRequest(
                    checkRequired("currency", currency),
                    checkRequired("ledgerId", ledgerId),
                    checkRequired("name", name),
                    checkRequired("normalBalance", normalBalance),
                    currencyExponent,
                    description,
                    (ledgerAccountCategoryIds ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LedgerAccountCategoryCreateRequest = apply {
            if (validated) {
                return@apply
            }

            currency()
            ledgerId()
            name()
            normalBalance().validate()
            currencyExponent()
            description()
            ledgerAccountCategoryIds()
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
            (if (currency.asKnown() == null) 0 else 1) +
                (if (ledgerId.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (normalBalance.asKnown()?.validity() ?: 0) +
                (if (currencyExponent.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (ledgerAccountCategoryIds.asKnown()?.size ?: 0) +
                (metadata.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerAccountCategoryCreateRequest &&
                currency == other.currency &&
                ledgerId == other.ledgerId &&
                name == other.name &&
                normalBalance == other.normalBalance &&
                currencyExponent == other.currencyExponent &&
                description == other.description &&
                ledgerAccountCategoryIds == other.ledgerAccountCategoryIds &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                ledgerId,
                name,
                normalBalance,
                currencyExponent,
                description,
                ledgerAccountCategoryIds,
                metadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountCategoryCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, metadata=$metadata, additionalProperties=$additionalProperties}"
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountCategoryCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LedgerAccountCategoryCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
