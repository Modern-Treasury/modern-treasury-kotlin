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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

@NoAutoDetect
class ReconciliationRule
@JsonCreator
private constructor(
    @JsonProperty("amount_lower_bound")
    @ExcludeMissing
    private val amountLowerBound: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amount_upper_bound")
    @ExcludeMissing
    private val amountUpperBound: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("custom_identifiers")
    @ExcludeMissing
    private val customIdentifiers: JsonField<CustomIdentifiers> = JsonMissing.of(),
    @JsonProperty("date_lower_bound")
    @ExcludeMissing
    private val dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("date_upper_bound")
    @ExcludeMissing
    private val dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountLowerBound(): Long = amountLowerBound.getRequired("amount_lower_bound")

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountUpperBound(): Long = amountUpperBound.getRequired("amount_upper_bound")

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    fun direction(): Direction = direction.getRequired("direction")

    /** The ID of the Internal Account for the expected payment */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /** The ID of the counterparty you expect for this payment */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /** Must conform to ISO 4217. Defaults to the currency of the internal account */
    fun currency(): Currency? = currency.getNullable("currency")

    /** A hash of custom identifiers for this payment */
    fun customIdentifiers(): CustomIdentifiers? =
        customIdentifiers.getNullable("custom_identifiers")

    /** The earliest date the payment may come in. Format is yyyy-mm-dd */
    fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

    /** The latest date the payment may come in. Format is yyyy-mm-dd */
    fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

    /**
     * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
     * wire
     */
    fun type(): Type? = type.getNullable("type")

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_lower_bound")
    @ExcludeMissing
    fun _amountLowerBound(): JsonField<Long> = amountLowerBound

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_upper_bound")
    @ExcludeMissing
    fun _amountUpperBound(): JsonField<Long> = amountUpperBound

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /** The ID of the Internal Account for the expected payment */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /** The ID of the counterparty you expect for this payment */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    /** Must conform to ISO 4217. Defaults to the currency of the internal account */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** A hash of custom identifiers for this payment */
    @JsonProperty("custom_identifiers")
    @ExcludeMissing
    fun _customIdentifiers(): JsonField<CustomIdentifiers> = customIdentifiers

    /** The earliest date the payment may come in. Format is yyyy-mm-dd */
    @JsonProperty("date_lower_bound")
    @ExcludeMissing
    fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

    /** The latest date the payment may come in. Format is yyyy-mm-dd */
    @JsonProperty("date_upper_bound")
    @ExcludeMissing
    fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

    /**
     * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
     * wire
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ReconciliationRule = apply {
        if (validated) {
            return@apply
        }

        amountLowerBound()
        amountUpperBound()
        direction()
        internalAccountId()
        counterpartyId()
        currency()
        customIdentifiers()?.validate()
        dateLowerBound()
        dateUpperBound()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ReconciliationRule]. */
    class Builder internal constructor() {

        private var amountLowerBound: JsonField<Long>? = null
        private var amountUpperBound: JsonField<Long>? = null
        private var direction: JsonField<Direction>? = null
        private var internalAccountId: JsonField<String>? = null
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var customIdentifiers: JsonField<CustomIdentifiers> = JsonMissing.of()
        private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
        private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(reconciliationRule: ReconciliationRule) = apply {
            amountLowerBound = reconciliationRule.amountLowerBound
            amountUpperBound = reconciliationRule.amountUpperBound
            direction = reconciliationRule.direction
            internalAccountId = reconciliationRule.internalAccountId
            counterpartyId = reconciliationRule.counterpartyId
            currency = reconciliationRule.currency
            customIdentifiers = reconciliationRule.customIdentifiers
            dateLowerBound = reconciliationRule.dateLowerBound
            dateUpperBound = reconciliationRule.dateUpperBound
            type = reconciliationRule.type
            additionalProperties = reconciliationRule.additionalProperties.toMutableMap()
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) =
            amountLowerBound(JsonField.of(amountLowerBound))

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) =
            amountUpperBound(JsonField.of(amountUpperBound))

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the Internal Account for the expected payment */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The ID of the counterparty you expect for this payment */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /** The ID of the counterparty you expect for this payment */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Must conform to ISO 4217. Defaults to the currency of the internal account */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** A hash of custom identifiers for this payment */
        fun customIdentifiers(customIdentifiers: CustomIdentifiers?) =
            customIdentifiers(JsonField.ofNullable(customIdentifiers))

        /** A hash of custom identifiers for this payment */
        fun customIdentifiers(customIdentifiers: JsonField<CustomIdentifiers>) = apply {
            this.customIdentifiers = customIdentifiers
        }

        /** The earliest date the payment may come in. Format is yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate?) =
            dateLowerBound(JsonField.ofNullable(dateLowerBound))

        /** The earliest date the payment may come in. Format is yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** The latest date the payment may come in. Format is yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate?) =
            dateUpperBound(JsonField.ofNullable(dateUpperBound))

        /** The latest date the payment may come in. Format is yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /**
         * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
         * wire
         */
        fun type(type: Type?) = type(JsonField.ofNullable(type))

        /**
         * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
         * wire
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): ReconciliationRule =
            ReconciliationRule(
                checkRequired("amountLowerBound", amountLowerBound),
                checkRequired("amountUpperBound", amountUpperBound),
                checkRequired("direction", direction),
                checkRequired("internalAccountId", internalAccountId),
                counterpartyId,
                currency,
                customIdentifiers,
                dateLowerBound,
                dateUpperBound,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
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

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A hash of custom identifiers for this payment */
    @NoAutoDetect
    class CustomIdentifiers
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomIdentifiers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [CustomIdentifiers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customIdentifiers: CustomIdentifiers) = apply {
                additionalProperties = customIdentifiers.additionalProperties.toMutableMap()
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

            fun build(): CustomIdentifiers = CustomIdentifiers(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomIdentifiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomIdentifiers{additionalProperties=$additionalProperties}"
    }

    /**
     * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
     * wire
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val AU_BECS = of("au_becs")

            val BACS = of("bacs")

            val BOOK = of("book")

            val CARD = of("card")

            val CHATS = of("chats")

            val CHECK = of("check")

            val CROSS_BORDER = of("cross_border")

            val DK_NETS = of("dk_nets")

            val EFT = of("eft")

            val HU_ICS = of("hu_ics")

            val INTERAC = of("interac")

            val MASAV = of("masav")

            val MX_CCEN = of("mx_ccen")

            val NEFT = of("neft")

            val NICS = of("nics")

            val NZ_BECS = of("nz_becs")

            val PL_ELIXIR = of("pl_elixir")

            val PROVXCHANGE = of("provxchange")

            val RO_SENT = of("ro_sent")

            val RTP = of("rtp")

            val SE_BANKGIROT = of("se_bankgirot")

            val SEN = of("sen")

            val SEPA = of("sepa")

            val SG_GIRO = of("sg_giro")

            val SIC = of("sic")

            val SIGNET = of("signet")

            val SKNBI = of("sknbi")

            val WIRE = of("wire")

            val ZENGIN = of("zengin")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                MX_CCEN -> Value.MX_CCEN
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PL_ELIXIR -> Value.PL_ELIXIR
                PROVXCHANGE -> Value.PROVXCHANGE
                RO_SENT -> Value.RO_SENT
                RTP -> Value.RTP
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SG_GIRO -> Value.SG_GIRO
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                SKNBI -> Value.SKNBI
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
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
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                MX_CCEN -> Known.MX_CCEN
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PL_ELIXIR -> Known.PL_ELIXIR
                PROVXCHANGE -> Known.PROVXCHANGE
                RO_SENT -> Known.RO_SENT
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SG_GIRO -> Known.SG_GIRO
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                SKNBI -> Known.SKNBI
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReconciliationRule && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && direction == other.direction && internalAccountId == other.internalAccountId && counterpartyId == other.counterpartyId && currency == other.currency && customIdentifiers == other.customIdentifiers && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amountLowerBound, amountUpperBound, direction, internalAccountId, counterpartyId, currency, customIdentifiers, dateLowerBound, dateUpperBound, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReconciliationRule{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, direction=$direction, internalAccountId=$internalAccountId, counterpartyId=$counterpartyId, currency=$currency, customIdentifiers=$customIdentifiers, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, type=$type, additionalProperties=$additionalProperties}"
}
