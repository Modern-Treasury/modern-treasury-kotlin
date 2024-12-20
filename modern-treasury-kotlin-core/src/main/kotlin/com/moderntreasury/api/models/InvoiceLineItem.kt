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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class InvoiceLineItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("unit_amount")
    @ExcludeMissing
    private val unitAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("unit_amount_decimal")
    @ExcludeMissing
    private val unitAmountDecimal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The name of the line item, typically a product or SKU name. */
    fun name(): String = name.getRequired("name")

    /** An optional free-form description of the line item. */
    fun description(): String = description.getRequired("description")

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     */
    fun quantity(): Long = quantity.getRequired("quantity")

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     */
    fun unitAmount(): Long = unitAmount.getRequired("unit_amount")

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     */
    fun unitAmountDecimal(): String = unitAmountDecimal.getRequired("unit_amount_decimal")

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    fun direction(): String = direction.getRequired("direction")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The total amount for this line item specified in the invoice currency's smallest unit. */
    fun amount(): Long = amount.getRequired("amount")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The name of the line item, typically a product or SKU name. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An optional free-form description of the line item. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     */
    @JsonProperty("unit_amount_decimal")
    @ExcludeMissing
    fun _unitAmountDecimal() = unitAmountDecimal

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The total amount for this line item specified in the invoice currency's smallest unit. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvoiceLineItem = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            name()
            description()
            quantity()
            unitAmount()
            unitAmountDecimal()
            direction()
            metadata().validate()
            amount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Long> = JsonMissing.of()
        private var unitAmount: JsonField<Long> = JsonMissing.of()
        private var unitAmountDecimal: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItem: InvoiceLineItem) = apply {
            id = invoiceLineItem.id
            object_ = invoiceLineItem.object_
            liveMode = invoiceLineItem.liveMode
            createdAt = invoiceLineItem.createdAt
            updatedAt = invoiceLineItem.updatedAt
            name = invoiceLineItem.name
            description = invoiceLineItem.description
            quantity = invoiceLineItem.quantity
            unitAmount = invoiceLineItem.unitAmount
            unitAmountDecimal = invoiceLineItem.unitAmountDecimal
            direction = invoiceLineItem.direction
            metadata = invoiceLineItem.metadata
            amount = invoiceLineItem.amount
            additionalProperties = invoiceLineItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An optional free-form description of the line item. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional free-form description of the line item. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: Long) = unitAmount(JsonField.of(unitAmount))

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: JsonField<Long>) = apply { this.unitAmount = unitAmount }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: String) =
            unitAmountDecimal(JsonField.of(unitAmountDecimal))

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: JsonField<String>) = apply {
            this.unitAmountDecimal = unitAmountDecimal
        }

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * The total amount for this line item specified in the invoice currency's smallest unit.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The total amount for this line item specified in the invoice currency's smallest unit.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        fun build(): InvoiceLineItem =
            InvoiceLineItem(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                name,
                description,
                quantity,
                unitAmount,
                unitAmountDecimal,
                direction,
                metadata,
                amount,
                additionalProperties.toImmutable(),
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
            if (!validated) {
                validated = true
            }
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

        return /* spotless:off */ other is InvoiceLineItem && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && name == other.name && description == other.description && quantity == other.quantity && unitAmount == other.unitAmount && unitAmountDecimal == other.unitAmountDecimal && direction == other.direction && metadata == other.metadata && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, name, description, quantity, unitAmount, unitAmountDecimal, direction, metadata, amount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItem{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, name=$name, description=$description, quantity=$quantity, unitAmount=$unitAmount, unitAmountDecimal=$unitAmountDecimal, direction=$direction, metadata=$metadata, amount=$amount, additionalProperties=$additionalProperties}"
}
