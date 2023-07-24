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

@JsonDeserialize(builder = AccountCollectionFlow.Builder::class)
@NoAutoDetect
class AccountCollectionFlow
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val clientToken: JsonField<String>,
    private val status: JsonField<Status>,
    private val counterpartyId: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val paymentTypes: JsonField<List<PaymentType>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String? = id.getNullable("id")

    fun object_(): String? = object_.getNullable("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     */
    fun clientToken(): String? = clientToken.getNullable("client_token")

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /** If present, the ID of the external account created using this flow. */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    fun paymentTypes(): List<PaymentType> = paymentTypes.getRequired("payment_types")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     */
    @JsonProperty("client_token") @ExcludeMissing fun _clientToken() = clientToken

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** If present, the ID of the external account created using this flow. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    @JsonProperty("payment_types") @ExcludeMissing fun _paymentTypes() = paymentTypes

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountCollectionFlow = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            clientToken()
            status()
            counterpartyId()
            externalAccountId()
            paymentTypes()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountCollectionFlow &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.clientToken == other.clientToken &&
            this.status == other.status &&
            this.counterpartyId == other.counterpartyId &&
            this.externalAccountId == other.externalAccountId &&
            this.paymentTypes == other.paymentTypes &&
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
                    clientToken,
                    status,
                    counterpartyId,
                    externalAccountId,
                    paymentTypes,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountCollectionFlow{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, clientToken=$clientToken, status=$status, counterpartyId=$counterpartyId, externalAccountId=$externalAccountId, paymentTypes=$paymentTypes, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var clientToken: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var paymentTypes: JsonField<List<PaymentType>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountCollectionFlow: AccountCollectionFlow) = apply {
            this.id = accountCollectionFlow.id
            this.object_ = accountCollectionFlow.object_
            this.liveMode = accountCollectionFlow.liveMode
            this.createdAt = accountCollectionFlow.createdAt
            this.updatedAt = accountCollectionFlow.updatedAt
            this.clientToken = accountCollectionFlow.clientToken
            this.status = accountCollectionFlow.status
            this.counterpartyId = accountCollectionFlow.counterpartyId
            this.externalAccountId = accountCollectionFlow.externalAccountId
            this.paymentTypes = accountCollectionFlow.paymentTypes
            additionalProperties(accountCollectionFlow.additionalProperties)
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

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        @JsonProperty("client_token")
        @ExcludeMissing
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The ID of a counterparty. An external account created with this flow will be associated
         * with this counterparty.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * The ID of a counterparty. An external account created with this flow will be associated
         * with this counterparty.
         */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** If present, the ID of the external account created using this flow. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** If present, the ID of the external account created using this flow. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        fun paymentTypes(paymentTypes: List<PaymentType>) = paymentTypes(JsonField.of(paymentTypes))

        @JsonProperty("payment_types")
        @ExcludeMissing
        fun paymentTypes(paymentTypes: JsonField<List<PaymentType>>) = apply {
            this.paymentTypes = paymentTypes
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

        fun build(): AccountCollectionFlow =
            AccountCollectionFlow(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                clientToken,
                status,
                counterpartyId,
                externalAccountId,
                paymentTypes.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CANCELLED = Status(JsonField.of("cancelled"))

            val COMPLETED = Status(JsonField.of("completed"))

            val EXPIRED = Status(JsonField.of("expired"))

            val PENDING = Status(JsonField.of("pending"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
        }

        enum class Value {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = PaymentType(JsonField.of("ach"))

            val WIRE = PaymentType(JsonField.of("wire"))

            fun of(value: String) = PaymentType(JsonField.of(value))
        }

        enum class Known {
            ACH,
            WIRE,
        }

        enum class Value {
            ACH,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
