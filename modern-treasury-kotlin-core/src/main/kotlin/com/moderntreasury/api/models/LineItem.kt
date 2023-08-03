package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LineItem.Builder::class)
@NoAutoDetect
class LineItem
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val itemizableId: JsonField<String>,
    private val itemizableType: JsonField<ItemizableType>,
    private val amount: JsonField<Long>,
    private val description: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val accounting: JsonField<Accounting>,
    private val accountingCategoryId: JsonField<String>,
    private val accountingLedgerClassId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The ID of the payment order or expected payment. */
    fun itemizableId(): String = itemizableId.getRequired("itemizable_id")

    /** One of `payment_orders` or `expected_payments`. */
    fun itemizableType(): ItemizableType = itemizableType.getRequired("itemizable_type")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** A free-form description of the line item. */
    fun description(): String? = description.getNullable("description")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun accounting(): Accounting = accounting.getRequired("accounting")

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     */
    fun accountingCategoryId(): String? = accountingCategoryId.getNullable("accounting_category_id")

    /**
     * The ID of one of the class objects in your accounting system. Class objects track segments of
     * your business independent of client or project. Note that these will only be accessible if
     * your accounting system has been connected.
     */
    fun accountingLedgerClassId(): String? =
        accountingLedgerClassId.getNullable("accounting_ledger_class_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The ID of the payment order or expected payment. */
    @JsonProperty("itemizable_id") @ExcludeMissing fun _itemizableId() = itemizableId

    /** One of `payment_orders` or `expected_payments`. */
    @JsonProperty("itemizable_type") @ExcludeMissing fun _itemizableType() = itemizableType

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** A free-form description of the line item. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("accounting") @ExcludeMissing fun _accounting() = accounting

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     */
    @JsonProperty("accounting_category_id")
    @ExcludeMissing
    fun _accountingCategoryId() = accountingCategoryId

    /**
     * The ID of one of the class objects in your accounting system. Class objects track segments of
     * your business independent of client or project. Note that these will only be accessible if
     * your accounting system has been connected.
     */
    @JsonProperty("accounting_ledger_class_id")
    @ExcludeMissing
    fun _accountingLedgerClassId() = accountingLedgerClassId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LineItem = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            itemizableId()
            itemizableType()
            amount()
            description()
            metadata().validate()
            accounting().validate()
            accountingCategoryId()
            accountingLedgerClassId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LineItem &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.itemizableId == other.itemizableId &&
            this.itemizableType == other.itemizableType &&
            this.amount == other.amount &&
            this.description == other.description &&
            this.metadata == other.metadata &&
            this.accounting == other.accounting &&
            this.accountingCategoryId == other.accountingCategoryId &&
            this.accountingLedgerClassId == other.accountingLedgerClassId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    itemizableId,
                    itemizableType,
                    amount,
                    description,
                    metadata,
                    accounting,
                    accountingCategoryId,
                    accountingLedgerClassId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LineItem{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, itemizableId=$itemizableId, itemizableType=$itemizableType, amount=$amount, description=$description, metadata=$metadata, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var itemizableId: JsonField<String> = JsonMissing.of()
        private var itemizableType: JsonField<ItemizableType> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var accounting: JsonField<Accounting> = JsonMissing.of()
        private var accountingCategoryId: JsonField<String> = JsonMissing.of()
        private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(lineItem: LineItem) = apply {
            this.id = lineItem.id
            this.object_ = lineItem.object_
            this.liveMode = lineItem.liveMode
            this.createdAt = lineItem.createdAt
            this.updatedAt = lineItem.updatedAt
            this.itemizableId = lineItem.itemizableId
            this.itemizableType = lineItem.itemizableType
            this.amount = lineItem.amount
            this.description = lineItem.description
            this.metadata = lineItem.metadata
            this.accounting = lineItem.accounting
            this.accountingCategoryId = lineItem.accountingCategoryId
            this.accountingLedgerClassId = lineItem.accountingLedgerClassId
            additionalProperties(lineItem.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
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
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the payment order or expected payment. */
        fun itemizableId(itemizableId: String) = itemizableId(JsonField.of(itemizableId))

        /** The ID of the payment order or expected payment. */
        @JsonProperty("itemizable_id")
        @ExcludeMissing
        fun itemizableId(itemizableId: JsonField<String>) = apply {
            this.itemizableId = itemizableId
        }

        /** One of `payment_orders` or `expected_payments`. */
        fun itemizableType(itemizableType: ItemizableType) =
            itemizableType(JsonField.of(itemizableType))

        /** One of `payment_orders` or `expected_payments`. */
        @JsonProperty("itemizable_type")
        @ExcludeMissing
        fun itemizableType(itemizableType: JsonField<ItemizableType>) = apply {
            this.itemizableType = itemizableType
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** A free-form description of the line item. */
        fun description(description: String) = description(JsonField.of(description))

        /** A free-form description of the line item. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

        @JsonProperty("accounting")
        @ExcludeMissing
        fun accounting(accounting: JsonField<Accounting>) = apply { this.accounting = accounting }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountingCategoryId(accountingCategoryId: String) =
            accountingCategoryId(JsonField.of(accountingCategoryId))

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        @ExcludeMissing
        fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
            this.accountingCategoryId = accountingCategoryId
        }

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        fun accountingLedgerClassId(accountingLedgerClassId: String) =
            accountingLedgerClassId(JsonField.of(accountingLedgerClassId))

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        @JsonProperty("accounting_ledger_class_id")
        @ExcludeMissing
        fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
            this.accountingLedgerClassId = accountingLedgerClassId
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): LineItem =
            LineItem(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                itemizableId,
                itemizableType,
                amount,
                description,
                metadata,
                accounting,
                accountingCategoryId,
                accountingLedgerClassId,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Accounting.Builder::class)
    @NoAutoDetect
    class Accounting
    private constructor(
        private val accountId: JsonField<String>,
        private val classId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountId(): String? = accountId.getNullable("account_id")

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        fun classId(): String? = classId.getNullable("class_id")

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        @JsonProperty("class_id") @ExcludeMissing fun _classId() = classId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Accounting = apply {
            if (!validated) {
                accountId()
                classId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Accounting &&
                this.accountId == other.accountId &&
                this.classId == other.classId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        classId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var classId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accounting: Accounting) = apply {
                this.accountId = accounting.accountId
                this.classId = accounting.classId
                additionalProperties(accounting.additionalProperties)
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            fun classId(classId: String) = classId(JsonField.of(classId))

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            @JsonProperty("class_id")
            @ExcludeMissing
            fun classId(classId: JsonField<String>) = apply { this.classId = classId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Accounting =
                Accounting(
                    accountId,
                    classId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class ItemizableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ItemizableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EXPECTED_PAYMENT = ItemizableType(JsonField.of("ExpectedPayment"))

            val PAYMENT_ORDER = ItemizableType(JsonField.of("PaymentOrder"))

            fun of(value: String) = ItemizableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENT,
            PAYMENT_ORDER,
        }

        enum class Value {
            EXPECTED_PAYMENT,
            PAYMENT_ORDER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                else -> throw ModernTreasuryInvalidDataException("Unknown ItemizableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
