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

class AccountCollectionFlowCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val counterpartyId: JsonField<String>,
    private val paymentTypes: JsonField<List<String>>,
    private val receivingCountries: JsonField<List<ReceivingCountry>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_types")
        @ExcludeMissing
        paymentTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("receiving_countries")
        @ExcludeMissing
        receivingCountries: JsonField<List<ReceivingCountry>> = JsonMissing.of(),
    ) : this(counterpartyId, paymentTypes, receivingCountries, mutableMapOf())

    /**
     * Required.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentTypes(): List<String> = paymentTypes.getRequired("payment_types")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivingCountries(): List<ReceivingCountry>? =
        receivingCountries.getNullable("receiving_countries")

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
    fun _paymentTypes(): JsonField<List<String>> = paymentTypes

    /**
     * Returns the raw JSON value of [receivingCountries].
     *
     * Unlike [receivingCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiving_countries")
    @ExcludeMissing
    fun _receivingCountries(): JsonField<List<ReceivingCountry>> = receivingCountries

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
         * Returns a mutable builder for constructing an instance of
         * [AccountCollectionFlowCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .counterpartyId()
         * .paymentTypes()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountCollectionFlowCreateRequest]. */
    class Builder internal constructor() {

        private var counterpartyId: JsonField<String>? = null
        private var paymentTypes: JsonField<MutableList<String>>? = null
        private var receivingCountries: JsonField<MutableList<ReceivingCountry>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest) =
            apply {
                counterpartyId = accountCollectionFlowCreateRequest.counterpartyId
                paymentTypes =
                    accountCollectionFlowCreateRequest.paymentTypes.map { it.toMutableList() }
                receivingCountries =
                    accountCollectionFlowCreateRequest.receivingCountries.map { it.toMutableList() }
                additionalProperties =
                    accountCollectionFlowCreateRequest.additionalProperties.toMutableMap()
            }

        /** Required. */
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

        fun paymentTypes(paymentTypes: List<String>) = paymentTypes(JsonField.of(paymentTypes))

        /**
         * Sets [Builder.paymentTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentTypes(paymentTypes: JsonField<List<String>>) = apply {
            this.paymentTypes = paymentTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [paymentTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentType(paymentType: String) = apply {
            paymentTypes =
                (paymentTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentTypes", it).add(paymentType)
                }
        }

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
         * Returns an immutable instance of [AccountCollectionFlowCreateRequest].
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
        fun build(): AccountCollectionFlowCreateRequest =
            AccountCollectionFlowCreateRequest(
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("paymentTypes", paymentTypes).map { it.toImmutable() },
                (receivingCountries ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AccountCollectionFlowCreateRequest = apply {
        if (validated) {
            return@apply
        }

        counterpartyId()
        paymentTypes()
        receivingCountries()?.forEach { it.validate() }
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
        (if (counterpartyId.asKnown() == null) 0 else 1) +
            (paymentTypes.asKnown()?.size ?: 0) +
            (receivingCountries.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** Optional. Array of 3-digit ISO country codes. */
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ReceivingCountry = apply {
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

            return other is ReceivingCountry && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountCollectionFlowCreateRequest &&
            counterpartyId == other.counterpartyId &&
            paymentTypes == other.paymentTypes &&
            receivingCountries == other.receivingCountries &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(counterpartyId, paymentTypes, receivingCountries, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountCollectionFlowCreateRequest{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalProperties=$additionalProperties}"
}
