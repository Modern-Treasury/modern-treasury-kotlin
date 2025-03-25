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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AccountCollectionFlow
private constructor(
    private val counterpartyId: JsonField<String>,
    private val paymentTypes: JsonField<List<PaymentType>>,
    private val id: JsonField<String>,
    private val clientToken: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val externalAccountId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val receivingCountries: JsonField<List<ReceivingCountry>>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_types")
        @ExcludeMissing
        paymentTypes: JsonField<List<PaymentType>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_token")
        @ExcludeMissing
        clientToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_countries")
        @ExcludeMissing
        receivingCountries: JsonField<List<ReceivingCountry>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        counterpartyId,
        paymentTypes,
        id,
        clientToken,
        createdAt,
        externalAccountId,
        liveMode,
        object_,
        receivingCountries,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentTypes(): List<PaymentType> = paymentTypes.getRequired("payment_types")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clientToken(): String? = clientToken.getNullable("client_token")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * If present, the ID of the external account created using this flow.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun object_(): String? = object_.getNullable("object")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivingCountries(): List<ReceivingCountry>? =
        receivingCountries.getNullable("receiving_countries")

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    /**
     * Returns the raw JSON value of [paymentTypes].
     *
     * Unlike [paymentTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_types")
    @ExcludeMissing
    fun _paymentTypes(): JsonField<List<PaymentType>> = paymentTypes

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [clientToken].
     *
     * Unlike [clientToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_token")
    @ExcludeMissing
    fun _clientToken(): JsonField<String> = clientToken

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [receivingCountries].
     *
     * Unlike [receivingCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiving_countries")
    @ExcludeMissing
    fun _receivingCountries(): JsonField<List<ReceivingCountry>> = receivingCountries

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [AccountCollectionFlow].
         *
         * The following fields are required:
         * ```kotlin
         * .counterpartyId()
         * .paymentTypes()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountCollectionFlow]. */
    class Builder internal constructor() {

        private var counterpartyId: JsonField<String>? = null
        private var paymentTypes: JsonField<MutableList<PaymentType>>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var clientToken: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var receivingCountries: JsonField<MutableList<ReceivingCountry>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountCollectionFlow: AccountCollectionFlow) = apply {
            counterpartyId = accountCollectionFlow.counterpartyId
            paymentTypes = accountCollectionFlow.paymentTypes.map { it.toMutableList() }
            id = accountCollectionFlow.id
            clientToken = accountCollectionFlow.clientToken
            createdAt = accountCollectionFlow.createdAt
            externalAccountId = accountCollectionFlow.externalAccountId
            liveMode = accountCollectionFlow.liveMode
            object_ = accountCollectionFlow.object_
            receivingCountries = accountCollectionFlow.receivingCountries.map { it.toMutableList() }
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
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun paymentTypes(paymentTypes: List<PaymentType>) = paymentTypes(JsonField.of(paymentTypes))

        /**
         * Sets [Builder.paymentTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentTypes] with a well-typed `List<PaymentType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentTypes(paymentTypes: JsonField<List<PaymentType>>) = apply {
            this.paymentTypes = paymentTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentType] to [paymentTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentType(paymentType: PaymentType) = apply {
            paymentTypes =
                (paymentTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentTypes", it).add(paymentType)
                }
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * Sets [Builder.clientToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** If present, the ID of the external account created using this flow. */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
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

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun receivingCountries(receivingCountries: List<ReceivingCountry>) =
            receivingCountries(JsonField.of(receivingCountries))

        /**
         * Sets [Builder.receivingCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingCountries] with a well-typed
         * `List<ReceivingCountry>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun receivingCountries(receivingCountries: JsonField<List<ReceivingCountry>>) = apply {
            this.receivingCountries = receivingCountries.map { it.toMutableList() }
        }

        /**
         * Adds a single [ReceivingCountry] to [receivingCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReceivingCountry(receivingCountry: ReceivingCountry) = apply {
            receivingCountries =
                (receivingCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("receivingCountries", it).add(receivingCountry)
                }
        }

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [AccountCollectionFlow].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .counterpartyId()
         * .paymentTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountCollectionFlow =
            AccountCollectionFlow(
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("paymentTypes", paymentTypes).map { it.toImmutable() },
                id,
                clientToken,
                createdAt,
                externalAccountId,
                liveMode,
                object_,
                (receivingCountries ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountCollectionFlow = apply {
        if (validated) {
            return@apply
        }

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

    /** An account created with this flow will support payments of one of these types. */
    class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val ACH = of("ach")

            val WIRE = of("wire")

            fun of(value: String) = PaymentType(JsonField.of(value))
        }

        /** An enum containing [PaymentType]'s known values. */
        enum class Known {
            ACH,
            WIRE,
        }

        /**
         * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            WIRE,
            /**
             * An enum member indicating that [PaymentType] was instantiated with an unknown value.
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
                ACH -> Value.ACH
                WIRE -> Value.WIRE
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
                ACH -> Known.ACH
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** An account created with this flow will support wires from the US to these countries. */
    class ReceivingCountry @JsonCreator private constructor(private val value: JsonField<String>) :
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

        /** An enum containing [ReceivingCountry]'s known values. */
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

        /**
         * An enum containing [ReceivingCountry]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReceivingCountry] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [ReceivingCountry] was instantiated with an unknown
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingCountry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CANCELLED = of("cancelled")

            val COMPLETED = of("completed")

            val EXPIRED = of("expired")

            val PENDING = of("pending")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
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
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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
