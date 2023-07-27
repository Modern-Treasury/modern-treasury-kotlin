package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LedgerableEvent.Builder::class)
@NoAutoDetect
class LedgerableEvent
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val direction: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val currencyExponent: JsonField<Long>,
    private val customData: JsonValue,
    private val ledgerEventHandlerId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
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

    /** Name of the ledgerable event. */
    fun name(): String = name.getRequired("name")

    /** Description of the ledgerable event. */
    fun description(): String? = description.getNullable("description")

    /** One of `credit`, `debit`. */
    fun direction(): String? = direction.getNullable("direction")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** An ISO 4217 conformed currency or a custom currency. */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Must be included if currency is a custom currency. The currency_exponent cannot exceed 30.
     */
    fun currencyExponent(): Long? = currencyExponent.getNullable("currency_exponent")

    /** Id of the ledger event handler that is used to create a ledger transaction. */
    fun ledgerEventHandlerId(): String = ledgerEventHandlerId.getRequired("ledger_event_handler_id")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** Name of the ledgerable event. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Description of the ledgerable event. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** One of `credit`, `debit`. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** An ISO 4217 conformed currency or a custom currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * Must be included if currency is a custom currency. The currency_exponent cannot exceed 30.
     */
    @JsonProperty("currency_exponent") @ExcludeMissing fun _currencyExponent() = currencyExponent

    /** Additionally data to be used by the Ledger Event Handler. */
    @JsonProperty("custom_data") @ExcludeMissing fun _customData() = customData

    /** Id of the ledger event handler that is used to create a ledger transaction. */
    @JsonProperty("ledger_event_handler_id")
    @ExcludeMissing
    fun _ledgerEventHandlerId() = ledgerEventHandlerId

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerableEvent = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            name()
            description()
            direction()
            amount()
            currency()
            currencyExponent()
            ledgerEventHandlerId()
            metadata()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerableEvent &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.name == other.name &&
            this.description == other.description &&
            this.direction == other.direction &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.currencyExponent == other.currencyExponent &&
            this.customData == other.customData &&
            this.ledgerEventHandlerId == other.ledgerEventHandlerId &&
            this.metadata == other.metadata &&
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
                    name,
                    description,
                    direction,
                    amount,
                    currency,
                    currencyExponent,
                    customData,
                    ledgerEventHandlerId,
                    metadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LedgerableEvent{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, name=$name, description=$description, direction=$direction, amount=$amount, currency=$currency, currencyExponent=$currencyExponent, customData=$customData, ledgerEventHandlerId=$ledgerEventHandlerId, metadata=$metadata, additionalProperties=$additionalProperties}"

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
        private var direction: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var currencyExponent: JsonField<Long> = JsonMissing.of()
        private var customData: JsonValue = JsonMissing.of()
        private var ledgerEventHandlerId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerableEvent: LedgerableEvent) = apply {
            this.id = ledgerableEvent.id
            this.object_ = ledgerableEvent.object_
            this.liveMode = ledgerableEvent.liveMode
            this.createdAt = ledgerableEvent.createdAt
            this.updatedAt = ledgerableEvent.updatedAt
            this.name = ledgerableEvent.name
            this.description = ledgerableEvent.description
            this.direction = ledgerableEvent.direction
            this.amount = ledgerableEvent.amount
            this.currency = ledgerableEvent.currency
            this.currencyExponent = ledgerableEvent.currencyExponent
            this.customData = ledgerableEvent.customData
            this.ledgerEventHandlerId = ledgerableEvent.ledgerEventHandlerId
            this.metadata = ledgerableEvent.metadata
            additionalProperties(ledgerableEvent.additionalProperties)
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

        /** Name of the ledgerable event. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the ledgerable event. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Description of the ledgerable event. */
        fun description(description: String) = description(JsonField.of(description))

        /** Description of the ledgerable event. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** One of `credit`, `debit`. */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /** One of `credit`, `debit`. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** An ISO 4217 conformed currency or a custom currency. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** An ISO 4217 conformed currency or a custom currency. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Must be included if currency is a custom currency. The currency_exponent cannot exceed
         * 30.
         */
        fun currencyExponent(currencyExponent: Long) =
            currencyExponent(JsonField.of(currencyExponent))

        /**
         * Must be included if currency is a custom currency. The currency_exponent cannot exceed
         * 30.
         */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
            this.currencyExponent = currencyExponent
        }

        /** Additionally data to be used by the Ledger Event Handler. */
        @JsonProperty("custom_data")
        @ExcludeMissing
        fun customData(customData: JsonValue) = apply { this.customData = customData }

        /** Id of the ledger event handler that is used to create a ledger transaction. */
        fun ledgerEventHandlerId(ledgerEventHandlerId: String) =
            ledgerEventHandlerId(JsonField.of(ledgerEventHandlerId))

        /** Id of the ledger event handler that is used to create a ledger transaction. */
        @JsonProperty("ledger_event_handler_id")
        @ExcludeMissing
        fun ledgerEventHandlerId(ledgerEventHandlerId: JsonField<String>) = apply {
            this.ledgerEventHandlerId = ledgerEventHandlerId
        }

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

        fun build(): LedgerableEvent =
            LedgerableEvent(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                name,
                description,
                direction,
                amount,
                currency,
                currencyExponent,
                customData,
                ledgerEventHandlerId,
                metadata,
                additionalProperties.toUnmodifiable(),
            )
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
