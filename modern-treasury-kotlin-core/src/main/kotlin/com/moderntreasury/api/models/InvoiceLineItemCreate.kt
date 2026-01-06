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
import java.util.Collections
import java.util.Objects

class InvoiceLineItemCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val unitAmount: JsonField<Long>,
    private val description: JsonField<String>,
    private val direction: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val quantity: JsonField<Long>,
    private val unitAmountDecimal: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_amount") @ExcludeMissing unitAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction") @ExcludeMissing direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unit_amount_decimal")
        @ExcludeMissing
        unitAmountDecimal: JsonField<String> = JsonMissing.of(),
    ) : this(
        name,
        unitAmount,
        description,
        direction,
        metadata,
        quantity,
        unitAmountDecimal,
        mutableMapOf(),
    )

    /**
     * The name of the line item, typically a product or SKU name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitAmount(): Long = unitAmount.getRequired("unit_amount")

    /**
     * An optional free-form description of the line item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun direction(): String? = direction.getNullable("direction")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun quantity(): Long? = quantity.getNullable("quantity")

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun unitAmountDecimal(): String? = unitAmountDecimal.getNullable("unit_amount_decimal")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [unitAmount].
     *
     * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<Long> = unitAmount

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Returns the raw JSON value of [unitAmountDecimal].
     *
     * Unlike [unitAmountDecimal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unit_amount_decimal")
    @ExcludeMissing
    fun _unitAmountDecimal(): JsonField<String> = unitAmountDecimal

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
         * Returns a mutable builder for constructing an instance of [InvoiceLineItemCreate].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceLineItemCreate]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var unitAmount: JsonField<Long>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var quantity: JsonField<Long> = JsonMissing.of()
        private var unitAmountDecimal: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItemCreate: InvoiceLineItemCreate) = apply {
            name = invoiceLineItemCreate.name
            unitAmount = invoiceLineItemCreate.unitAmount
            description = invoiceLineItemCreate.description
            direction = invoiceLineItemCreate.direction
            metadata = invoiceLineItemCreate.metadata
            quantity = invoiceLineItemCreate.quantity
            unitAmountDecimal = invoiceLineItemCreate.unitAmountDecimal
            additionalProperties = invoiceLineItemCreate.additionalProperties.toMutableMap()
        }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: Long) = unitAmount(JsonField.of(unitAmount))

        /**
         * Sets [Builder.unitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unitAmount(unitAmount: JsonField<Long>) = apply { this.unitAmount = unitAmount }

        /** An optional free-form description of the line item. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

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

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: String) =
            unitAmountDecimal(JsonField.of(unitAmountDecimal))

        /**
         * Sets [Builder.unitAmountDecimal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitAmountDecimal] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unitAmountDecimal(unitAmountDecimal: JsonField<String>) = apply {
            this.unitAmountDecimal = unitAmountDecimal
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
         * Returns an immutable instance of [InvoiceLineItemCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .unitAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceLineItemCreate =
            InvoiceLineItemCreate(
                checkRequired("name", name),
                checkRequired("unitAmount", unitAmount),
                description,
                direction,
                metadata,
                quantity,
                unitAmountDecimal,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvoiceLineItemCreate = apply {
        if (validated) {
            return@apply
        }

        name()
        unitAmount()
        description()
        direction()
        metadata()?.validate()
        quantity()
        unitAmountDecimal()
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
        (if (name.asKnown() == null) 0 else 1) +
            (if (unitAmount.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (direction.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (unitAmountDecimal.asKnown() == null) 0 else 1)

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

        return other is InvoiceLineItemCreate &&
            name == other.name &&
            unitAmount == other.unitAmount &&
            description == other.description &&
            direction == other.direction &&
            metadata == other.metadata &&
            quantity == other.quantity &&
            unitAmountDecimal == other.unitAmountDecimal &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            unitAmount,
            description,
            direction,
            metadata,
            quantity,
            unitAmountDecimal,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItemCreate{name=$name, unitAmount=$unitAmount, description=$description, direction=$direction, metadata=$metadata, quantity=$quantity, unitAmountDecimal=$unitAmountDecimal, additionalProperties=$additionalProperties}"
}
