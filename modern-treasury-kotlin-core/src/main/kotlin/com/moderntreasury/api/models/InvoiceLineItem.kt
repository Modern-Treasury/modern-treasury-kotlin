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
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("unit_amount")
    @ExcludeMissing
    private val unitAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("unit_amount_decimal")
    @ExcludeMissing
    private val unitAmountDecimal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The total amount for this line item specified in the invoice currency's smallest unit. */
    fun amount(): Long = amount.getRequired("amount")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** An optional free-form description of the line item. */
    fun description(): String = description.getRequired("description")

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    fun direction(): String = direction.getRequired("direction")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The name of the line item, typically a product or SKU name. */
    fun name(): String = name.getRequired("name")

    fun object_(): String = object_.getRequired("object")

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

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The total amount for this line item specified in the invoice currency's smallest unit. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** An optional free-form description of the line item. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The name of the line item, typically a product or SKU name. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<Long> = unitAmount

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     */
    @JsonProperty("unit_amount_decimal")
    @ExcludeMissing
    fun _unitAmountDecimal(): JsonField<String> = unitAmountDecimal

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvoiceLineItem = apply {
        if (!validated) {
            id()
            amount()
            createdAt()
            description()
            direction()
            liveMode()
            metadata().validate()
            name()
            object_()
            quantity()
            unitAmount()
            unitAmountDecimal()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var direction: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var unitAmount: JsonField<Long>? = null
        private var unitAmountDecimal: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItem: InvoiceLineItem) = apply {
            id = invoiceLineItem.id
            amount = invoiceLineItem.amount
            createdAt = invoiceLineItem.createdAt
            description = invoiceLineItem.description
            direction = invoiceLineItem.direction
            liveMode = invoiceLineItem.liveMode
            metadata = invoiceLineItem.metadata
            name = invoiceLineItem.name
            object_ = invoiceLineItem.object_
            quantity = invoiceLineItem.quantity
            unitAmount = invoiceLineItem.unitAmount
            unitAmountDecimal = invoiceLineItem.unitAmountDecimal
            updatedAt = invoiceLineItem.updatedAt
            additionalProperties = invoiceLineItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The total amount for this line item specified in the invoice currency's smallest unit.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The total amount for this line item specified in the invoice currency's smallest unit.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An optional free-form description of the line item. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional free-form description of the line item. */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(metadata) { "`metadata` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                checkNotNull(unitAmountDecimal) {
                    "`unitAmountDecimal` is required but was not set"
                },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
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

        return /* spotless:off */ other is InvoiceLineItem && id == other.id && amount == other.amount && createdAt == other.createdAt && description == other.description && direction == other.direction && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && quantity == other.quantity && unitAmount == other.unitAmount && unitAmountDecimal == other.unitAmountDecimal && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, description, direction, liveMode, metadata, name, object_, quantity, unitAmount, unitAmountDecimal, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItem{id=$id, amount=$amount, createdAt=$createdAt, description=$description, direction=$direction, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, quantity=$quantity, unitAmount=$unitAmount, unitAmountDecimal=$unitAmountDecimal, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
