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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AccountCollectionFlow
@JsonCreator
private constructor(
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_types")
    @ExcludeMissing
    private val paymentTypes: JsonField<List<PaymentType>> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_token")
    @ExcludeMissing
    private val clientToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_account_id")
    @ExcludeMissing
    private val externalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiving_countries")
    @ExcludeMissing
    private val receivingCountries: JsonField<List<ReceivingCountry>> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    fun paymentTypes(): List<PaymentType> = paymentTypes.getRequired("payment_types")

    fun id(): String? = id.getNullable("id")

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     */
    fun clientToken(): String? = clientToken.getNullable("client_token")

    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /** If present, the ID of the external account created using this flow. */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

    fun object_(): String? = object_.getNullable("object")

    fun receivingCountries(): List<ReceivingCountry>? =
        receivingCountries.getNullable("receiving_countries")

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    fun status(): Status? = status.getNullable("status")

    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    @JsonProperty("payment_types") @ExcludeMissing fun _paymentTypes() = paymentTypes

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     */
    @JsonProperty("client_token") @ExcludeMissing fun _clientToken() = clientToken

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** If present, the ID of the external account created using this flow. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    @JsonProperty("receiving_countries")
    @ExcludeMissing
    fun _receivingCountries() = receivingCountries

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountCollectionFlow = apply {
        if (!validated) {
            counterpartyId()
            paymentTypes()
            id()
            clientToken()
            createdAt()
            externalAccountId()
            liveMode()
            object_()
            receivingCountries()
            status()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var paymentTypes: JsonField<List<PaymentType>> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var clientToken: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var receivingCountries: JsonField<List<ReceivingCountry>> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountCollectionFlow: AccountCollectionFlow) = apply {
            counterpartyId = accountCollectionFlow.counterpartyId
            paymentTypes = accountCollectionFlow.paymentTypes
            id = accountCollectionFlow.id
            clientToken = accountCollectionFlow.clientToken
            createdAt = accountCollectionFlow.createdAt
            externalAccountId = accountCollectionFlow.externalAccountId
            liveMode = accountCollectionFlow.liveMode
            object_ = accountCollectionFlow.object_
            receivingCountries = accountCollectionFlow.receivingCountries
            status = accountCollectionFlow.status
            updatedAt = accountCollectionFlow.updatedAt
            additionalProperties = accountCollectionFlow.additionalProperties.toMutableMap()
        }

        /**
         * The ID of a counterparty. An external account created with this flow will be associated
         * with this counterparty.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * The ID of a counterparty. An external account created with this flow will be associated
         * with this counterparty.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun paymentTypes(paymentTypes: List<PaymentType>) = paymentTypes(JsonField.of(paymentTypes))

        fun paymentTypes(paymentTypes: JsonField<List<PaymentType>>) = apply {
            this.paymentTypes = paymentTypes
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** If present, the ID of the external account created using this flow. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** If present, the ID of the external account created using this flow. */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

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

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun receivingCountries(receivingCountries: List<ReceivingCountry>) =
            receivingCountries(JsonField.of(receivingCountries))

        fun receivingCountries(receivingCountries: JsonField<List<ReceivingCountry>>) = apply {
            this.receivingCountries = receivingCountries
        }

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): AccountCollectionFlow =
            AccountCollectionFlow(
                counterpartyId,
                paymentTypes.map { it.toImmutable() },
                id,
                clientToken,
                createdAt,
                externalAccountId,
                liveMode,
                object_,
                receivingCountries.map { it.toImmutable() },
                status,
                updatedAt,
                additionalProperties.toImmutable(),
            )
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            val WIRE = of("wire")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ReceivingCountry
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val USA = of("USA")

            val AUS = of("AUS")

            val BEL = of("BEL")

            val CAN = of("CAN")

            val CHL = of("CHL")

            val CHN = of("CHN")

            val COL = of("COL")

            val FRA = of("FRA")

            val DEU = of("DEU")

            val HKG = of("HKG")

            val IND = of("IND")

            val IRL = of("IRL")

            val ITA = of("ITA")

            val MEX = of("MEX")

            val NLD = of("NLD")

            val PER = of("PER")

            val ESP = of("ESP")

            val GBR = of("GBR")

            fun of(value: String) = ReceivingCountry(JsonField.of(value))
        }

        enum class Known {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
        }

        enum class Value {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USA -> Value.USA
                AUS -> Value.AUS
                BEL -> Value.BEL
                CAN -> Value.CAN
                CHL -> Value.CHL
                CHN -> Value.CHN
                COL -> Value.COL
                FRA -> Value.FRA
                DEU -> Value.DEU
                HKG -> Value.HKG
                IND -> Value.IND
                IRL -> Value.IRL
                ITA -> Value.ITA
                MEX -> Value.MEX
                NLD -> Value.NLD
                PER -> Value.PER
                ESP -> Value.ESP
                GBR -> Value.GBR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USA -> Known.USA
                AUS -> Known.AUS
                BEL -> Known.BEL
                CAN -> Known.CAN
                CHL -> Known.CHL
                CHN -> Known.CHN
                COL -> Known.COL
                FRA -> Known.FRA
                DEU -> Known.DEU
                HKG -> Known.HKG
                IND -> Known.IND
                IRL -> Known.IRL
                ITA -> Known.ITA
                MEX -> Known.MEX
                NLD -> Known.NLD
                PER -> Known.PER
                ESP -> Known.ESP
                GBR -> Known.GBR
                else -> throw ModernTreasuryInvalidDataException("Unknown ReceivingCountry: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingCountry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CANCELLED = of("cancelled")

            val COMPLETED = of("completed")

            val EXPIRED = of("expired")

            val PENDING = of("pending")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlow && counterpartyId == other.counterpartyId && paymentTypes == other.paymentTypes && id == other.id && clientToken == other.clientToken && createdAt == other.createdAt && externalAccountId == other.externalAccountId && liveMode == other.liveMode && object_ == other.object_ && receivingCountries == other.receivingCountries && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(counterpartyId, paymentTypes, id, clientToken, createdAt, externalAccountId, liveMode, object_, receivingCountries, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountCollectionFlow{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, id=$id, clientToken=$clientToken, createdAt=$createdAt, externalAccountId=$externalAccountId, liveMode=$liveMode, object_=$object_, receivingCountries=$receivingCountries, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
