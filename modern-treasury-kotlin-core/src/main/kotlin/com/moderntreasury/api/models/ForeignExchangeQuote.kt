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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ForeignExchangeQuote
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val foreignExchangeIndicator: JsonField<String>,
    private val foreignExchangeRate: JsonField<ForeignExchangeRate>,
    private val internalAccountId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vendorId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        foreignExchangeIndicator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_rate")
        @ExcludeMissing
        foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vendor_id") @ExcludeMissing vendorId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        effectiveAt,
        expiresAt,
        foreignExchangeIndicator,
        foreignExchangeRate,
        internalAccountId,
        liveMode,
        metadata,
        object_,
        updatedAt,
        vendorId,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The timestamp until when the quoted rate is valid.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /**
     * The timestamp until which the quote must be booked by.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if the
     * `target_amount` was specified when requesting the quote.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun foreignExchangeIndicator(): String =
        foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

    /**
     * The serialized rate information represented by this quote.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun foreignExchangeRate(): ForeignExchangeRate =
        foreignExchangeRate.getRequired("foreign_exchange_rate")

    /**
     * The ID for the `InternalAccount` this quote is associated with.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * This vendor assigned ID for this quote.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [foreignExchangeIndicator].
     *
     * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    fun _foreignExchangeIndicator(): JsonField<String> = foreignExchangeIndicator

    /**
     * Returns the raw JSON value of [foreignExchangeRate].
     *
     * Unlike [foreignExchangeRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate(): JsonField<ForeignExchangeRate> = foreignExchangeRate

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vendorId].
     *
     * Unlike [vendorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId(): JsonField<String> = vendorId

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
         * Returns a mutable builder for constructing an instance of [ForeignExchangeQuote].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .effectiveAt()
         * .expiresAt()
         * .foreignExchangeIndicator()
         * .foreignExchangeRate()
         * .internalAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ForeignExchangeQuote]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var foreignExchangeIndicator: JsonField<String>? = null
        private var foreignExchangeRate: JsonField<ForeignExchangeRate>? = null
        private var internalAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(foreignExchangeQuote: ForeignExchangeQuote) = apply {
            id = foreignExchangeQuote.id
            createdAt = foreignExchangeQuote.createdAt
            effectiveAt = foreignExchangeQuote.effectiveAt
            expiresAt = foreignExchangeQuote.expiresAt
            foreignExchangeIndicator = foreignExchangeQuote.foreignExchangeIndicator
            foreignExchangeRate = foreignExchangeQuote.foreignExchangeRate
            internalAccountId = foreignExchangeQuote.internalAccountId
            liveMode = foreignExchangeQuote.liveMode
            metadata = foreignExchangeQuote.metadata
            object_ = foreignExchangeQuote.object_
            updatedAt = foreignExchangeQuote.updatedAt
            vendorId = foreignExchangeQuote.vendorId
            additionalProperties = foreignExchangeQuote.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /** The timestamp until which the quote must be booked by. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if
         * the `target_amount` was specified when requesting the quote.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
            foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

        /**
         * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeIndicator] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) = apply {
            this.foreignExchangeIndicator = foreignExchangeIndicator
        }

        /** The serialized rate information represented by this quote. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate) =
            foreignExchangeRate(JsonField.of(foreignExchangeRate))

        /**
         * Sets [Builder.foreignExchangeRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeRate] with a well-typed
         * [ForeignExchangeRate] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** This vendor assigned ID for this quote. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /**
         * Sets [Builder.vendorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

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
         * Returns an immutable instance of [ForeignExchangeQuote].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .effectiveAt()
         * .expiresAt()
         * .foreignExchangeIndicator()
         * .foreignExchangeRate()
         * .internalAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ForeignExchangeQuote =
            ForeignExchangeQuote(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("foreignExchangeIndicator", foreignExchangeIndicator),
                checkRequired("foreignExchangeRate", foreignExchangeRate),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                vendorId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ForeignExchangeQuote = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        effectiveAt()
        expiresAt()
        foreignExchangeIndicator()
        foreignExchangeRate().validate()
        internalAccountId()
        liveMode()
        metadata().validate()
        object_()
        updatedAt()
        vendorId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (effectiveAt.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (foreignExchangeIndicator.asKnown() == null) 0 else 1) +
            (foreignExchangeRate.asKnown()?.validity() ?: 0) +
            (if (internalAccountId.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (vendorId.asKnown() == null) 0 else 1)

    /** The serialized rate information represented by this quote. */
    class ForeignExchangeRate
    private constructor(
        private val baseAmount: JsonField<Long>,
        private val baseCurrency: JsonField<Currency>,
        private val exponent: JsonField<Long>,
        private val rateString: JsonField<String>,
        private val targetAmount: JsonField<Long>,
        private val targetCurrency: JsonField<Currency>,
        private val value: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("base_amount")
            @ExcludeMissing
            baseAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("base_currency")
            @ExcludeMissing
            baseCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("exponent") @ExcludeMissing exponent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rate_string")
            @ExcludeMissing
            rateString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_amount")
            @ExcludeMissing
            targetAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("target_currency")
            @ExcludeMissing
            targetCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
        ) : this(
            baseAmount,
            baseCurrency,
            exponent,
            rateString,
            targetAmount,
            targetCurrency,
            value,
            mutableMapOf(),
        )

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseAmount(): Long = baseAmount.getRequired("base_amount")

        /**
         * Currency to convert, often called the "sell" currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseCurrency(): Currency = baseCurrency.getRequired("base_currency")

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exponent(): Long = exponent.getRequired("exponent")

        /**
         * A string representation of the rate.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rateString(): String = rateString.getRequired("rate_string")

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetAmount(): Long = targetAmount.getRequired("target_amount")

        /**
         * Currency to convert the `base_currency` to, often called the "buy" currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Returns the raw JSON value of [baseAmount].
         *
         * Unlike [baseAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

        /**
         * Returns the raw JSON value of [baseCurrency].
         *
         * Unlike [baseCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("base_currency")
        @ExcludeMissing
        fun _baseCurrency(): JsonField<Currency> = baseCurrency

        /**
         * Returns the raw JSON value of [exponent].
         *
         * Unlike [exponent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent(): JsonField<Long> = exponent

        /**
         * Returns the raw JSON value of [rateString].
         *
         * Unlike [rateString], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_string")
        @ExcludeMissing
        fun _rateString(): JsonField<String> = rateString

        /**
         * Returns the raw JSON value of [targetAmount].
         *
         * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<Long> = targetAmount

        /**
         * Returns the raw JSON value of [targetCurrency].
         *
         * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_currency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<Currency> = targetCurrency

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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
             * Returns a mutable builder for constructing an instance of [ForeignExchangeRate].
             *
             * The following fields are required:
             * ```kotlin
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ForeignExchangeRate]. */
        class Builder internal constructor() {

            private var baseAmount: JsonField<Long>? = null
            private var baseCurrency: JsonField<Currency>? = null
            private var exponent: JsonField<Long>? = null
            private var rateString: JsonField<String>? = null
            private var targetAmount: JsonField<Long>? = null
            private var targetCurrency: JsonField<Currency>? = null
            private var value: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(foreignExchangeRate: ForeignExchangeRate) = apply {
                baseAmount = foreignExchangeRate.baseAmount
                baseCurrency = foreignExchangeRate.baseCurrency
                exponent = foreignExchangeRate.exponent
                rateString = foreignExchangeRate.rateString
                targetAmount = foreignExchangeRate.targetAmount
                targetCurrency = foreignExchangeRate.targetCurrency
                value = foreignExchangeRate.value
                additionalProperties = foreignExchangeRate.additionalProperties.toMutableMap()
            }

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: Long) = baseAmount(JsonField.of(baseAmount))

            /**
             * Sets [Builder.baseAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

            /**
             * Sets [Builder.baseCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
                this.baseCurrency = baseCurrency
            }

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

            /**
             * Sets [Builder.exponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exponent] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

            /** A string representation of the rate. */
            fun rateString(rateString: String) = rateString(JsonField.of(rateString))

            /**
             * Sets [Builder.rateString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateString(rateString: JsonField<String>) = apply { this.rateString = rateString }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

            /**
             * Sets [Builder.targetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /**
             * Sets [Builder.targetCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

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
             * Returns an immutable instance of [ForeignExchangeRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ForeignExchangeRate =
                ForeignExchangeRate(
                    checkRequired("baseAmount", baseAmount),
                    checkRequired("baseCurrency", baseCurrency),
                    checkRequired("exponent", exponent),
                    checkRequired("rateString", rateString),
                    checkRequired("targetAmount", targetAmount),
                    checkRequired("targetCurrency", targetCurrency),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ForeignExchangeRate = apply {
            if (validated) {
                return@apply
            }

            baseAmount()
            baseCurrency().validate()
            exponent()
            rateString()
            targetAmount()
            targetCurrency().validate()
            value()
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
            (if (baseAmount.asKnown() == null) 0 else 1) +
                (baseCurrency.asKnown()?.validity() ?: 0) +
                (if (exponent.asKnown() == null) 0 else 1) +
                (if (rateString.asKnown() == null) 0 else 1) +
                (if (targetAmount.asKnown() == null) 0 else 1) +
                (targetCurrency.asKnown()?.validity() ?: 0) +
                (if (value.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeRate && baseAmount == other.baseAmount && baseCurrency == other.baseCurrency && exponent == other.exponent && rateString == other.rateString && targetAmount == other.targetAmount && targetCurrency == other.targetCurrency && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(baseAmount, baseCurrency, exponent, rateString, targetAmount, targetCurrency, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ForeignExchangeRate{baseAmount=$baseAmount, baseCurrency=$baseCurrency, exponent=$exponent, rateString=$rateString, targetAmount=$targetAmount, targetCurrency=$targetCurrency, value=$value, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ForeignExchangeQuote && id == other.id && createdAt == other.createdAt && effectiveAt == other.effectiveAt && expiresAt == other.expiresAt && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeRate == other.foreignExchangeRate && internalAccountId == other.internalAccountId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && updatedAt == other.updatedAt && vendorId == other.vendorId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, effectiveAt, expiresAt, foreignExchangeIndicator, foreignExchangeRate, internalAccountId, liveMode, metadata, object_, updatedAt, vendorId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ForeignExchangeQuote{id=$id, createdAt=$createdAt, effectiveAt=$effectiveAt, expiresAt=$expiresAt, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeRate=$foreignExchangeRate, internalAccountId=$internalAccountId, liveMode=$liveMode, metadata=$metadata, object_=$object_, updatedAt=$updatedAt, vendorId=$vendorId, additionalProperties=$additionalProperties}"
}
