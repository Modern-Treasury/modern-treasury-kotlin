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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class LedgerAccountCreateRequest
private constructor(
    private val currency: JsonField<String>,
    private val ledgerId: JsonField<String>,
    private val name: JsonField<String>,
    private val normalBalance: JsonField<TransactionDirection>,
    private val currencyExponent: JsonField<Long>,
    private val description: JsonField<String>,
    private val ledgerAccountCategoryIds: JsonField<List<String>>,
    private val ledgerableId: JsonField<String>,
    private val ledgerableType: JsonField<LedgerableType>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_id") @ExcludeMissing ledgerId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        ledgerableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        currency,
        ledgerId,
        name,
        normalBalance,
        currencyExponent,
        description,
        ledgerAccountCategoryIds,
        ledgerableId,
        ledgerableType,
        metadata,
        mutableMapOf(),
    )

    /**
     * The currency of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The id of the ledger that this account belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * The name of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The normal balance of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun normalBalance(): TransactionDirection = normalBalance.getRequired("normal_balance")

    /**
     * The currency exponent of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencyExponent(): Long? = currencyExponent.getNullable("currency_exponent")

    /**
     * The description of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * The array of ledger account category ids that this ledger account should be a child of.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccountCategoryIds(): List<String>? =
        ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")

    /**
     * If the ledger account links to another object in Modern Treasury, the id will be populated
     * here, otherwise null.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

    /**
     * If the ledger account links to another object in Modern Treasury, the type will be populated
     * here, otherwise null. The value is one of internal_account or external_account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
     * Unlike [normalBalance], this method doesn't throw if the JSON field has an unexpected type.
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
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [ledgerableId].
     *
     * Unlike [ledgerableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledgerable_id")
    @ExcludeMissing
    fun _ledgerableId(): JsonField<String> = ledgerableId

    /**
     * Returns the raw JSON value of [ledgerableType].
     *
     * Unlike [ledgerableType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledgerable_type")
    @ExcludeMissing
    fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

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
         * Returns a mutable builder for constructing an instance of [LedgerAccountCreateRequest].
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

    /** A builder for [LedgerAccountCreateRequest]. */
    class Builder internal constructor() {

        private var currency: JsonField<String>? = null
        private var ledgerId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var normalBalance: JsonField<TransactionDirection>? = null
        private var currencyExponent: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var ledgerAccountCategoryIds: JsonField<MutableList<String>>? = null
        private var ledgerableId: JsonField<String> = JsonMissing.of()
        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
            currency = ledgerAccountCreateRequest.currency
            ledgerId = ledgerAccountCreateRequest.ledgerId
            name = ledgerAccountCreateRequest.name
            normalBalance = ledgerAccountCreateRequest.normalBalance
            currencyExponent = ledgerAccountCreateRequest.currencyExponent
            description = ledgerAccountCreateRequest.description
            ledgerAccountCategoryIds =
                ledgerAccountCreateRequest.ledgerAccountCategoryIds.map { it.toMutableList() }
            ledgerableId = ledgerAccountCreateRequest.ledgerableId
            ledgerableType = ledgerAccountCreateRequest.ledgerableType
            metadata = ledgerAccountCreateRequest.metadata
            additionalProperties = ledgerAccountCreateRequest.additionalProperties.toMutableMap()
        }

        /** The currency of the ledger account. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /**
         * Sets [Builder.ledgerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /** The name of the ledger account. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The normal balance of the ledger account. */
        fun normalBalance(normalBalance: TransactionDirection) =
            normalBalance(JsonField.of(normalBalance))

        /**
         * Sets [Builder.normalBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.normalBalance] with a well-typed [TransactionDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
            this.normalBalance = normalBalance
        }

        /** The currency exponent of the ledger account. */
        fun currencyExponent(currencyExponent: Long?) =
            currencyExponent(JsonField.ofNullable(currencyExponent))

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
            this.currencyExponent = currencyExponent
        }

        /** The description of the ledger account. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The array of ledger account category ids that this ledger account should be a child of.
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
        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: JsonField<List<String>>) = apply {
            this.ledgerAccountCategoryIds = ledgerAccountCategoryIds.map { it.toMutableList() }
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
         * If the ledger account links to another object in Modern Treasury, the id will be
         * populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

        /**
         * Sets [Builder.ledgerableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
            this.ledgerableId = ledgerableId
        }

        /**
         * If the ledger account links to another object in Modern Treasury, the type will be
         * populated here, otherwise null. The value is one of internal_account or external_account.
         */
        fun ledgerableType(ledgerableType: LedgerableType) =
            ledgerableType(JsonField.of(ledgerableType))

        /**
         * Sets [Builder.ledgerableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerableType] with a well-typed [LedgerableType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
            this.ledgerableType = ledgerableType
        }

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
         * Returns an immutable instance of [LedgerAccountCreateRequest].
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
        fun build(): LedgerAccountCreateRequest =
            LedgerAccountCreateRequest(
                checkRequired("currency", currency),
                checkRequired("ledgerId", ledgerId),
                checkRequired("name", name),
                checkRequired("normalBalance", normalBalance),
                currencyExponent,
                description,
                (ledgerAccountCategoryIds ?: JsonMissing.of()).map { it.toImmutable() },
                ledgerableId,
                ledgerableType,
                metadata,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LedgerAccountCreateRequest = apply {
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
        ledgerableId()
        ledgerableType()?.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
            (if (ledgerableId.asKnown() == null) 0 else 1) +
            (ledgerableType.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0)

    /**
     * If the ledger account links to another object in Modern Treasury, the type will be populated
     * here, otherwise null. The value is one of internal_account or external_account.
     */
    class LedgerableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COUNTERPARTY = of("counterparty")

            val EXTERNAL_ACCOUNT = of("external_account")

            val INTERNAL_ACCOUNT = of("internal_account")

            val VIRTUAL_ACCOUNT = of("virtual_account")

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        /** An enum containing [LedgerableType]'s known values. */
        enum class Known {
            COUNTERPARTY,
            EXTERNAL_ACCOUNT,
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
        }

        /**
         * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LedgerableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COUNTERPARTY,
            EXTERNAL_ACCOUNT,
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
            /**
             * An enum member indicating that [LedgerableType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COUNTERPARTY -> Value.COUNTERPARTY
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                COUNTERPARTY -> Known.COUNTERPARTY
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): LedgerableType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
}
