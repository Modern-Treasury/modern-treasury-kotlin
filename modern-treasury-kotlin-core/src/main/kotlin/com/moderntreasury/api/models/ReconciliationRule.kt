// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

@JsonDeserialize(builder = ReconciliationRule.Builder::class)
@NoAutoDetect
class ReconciliationRule
private constructor(
    private val amountUpperBound: JsonField<Long>,
    private val amountLowerBound: JsonField<Long>,
    private val direction: JsonField<Direction>,
    private val internalAccountId: JsonField<String>,
    private val type: JsonField<Type>,
    private val currency: JsonField<Currency>,
    private val dateUpperBound: JsonField<LocalDate>,
    private val dateLowerBound: JsonField<LocalDate>,
    private val counterpartyId: JsonField<String>,
    private val customIdentifiers: JsonField<CustomIdentifiers>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountUpperBound(): Long = amountUpperBound.getRequired("amount_upper_bound")

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountLowerBound(): Long = amountLowerBound.getRequired("amount_lower_bound")

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    fun direction(): Direction = direction.getRequired("direction")

    /** The ID of the Internal Account for the expected payment */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
     * wire
     */
    fun type(): Type? = type.getNullable("type")

    /** Must conform to ISO 4217. Defaults to the currency of the internal account */
    fun currency(): Currency? = currency.getNullable("currency")

    /** The latest date the payment may come in. Format is yyyy-mm-dd */
    fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

    /** The earliest date the payment may come in. Format is yyyy-mm-dd */
    fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

    /** The ID of the counterparty you expect for this payment */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /** A hash of custom identifiers for this payment */
    fun customIdentifiers(): CustomIdentifiers? =
        customIdentifiers.getNullable("custom_identifiers")

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_upper_bound") @ExcludeMissing fun _amountUpperBound() = amountUpperBound

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_lower_bound") @ExcludeMissing fun _amountLowerBound() = amountLowerBound

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** The ID of the Internal Account for the expected payment */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /**
     * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
     * wire
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Must conform to ISO 4217. Defaults to the currency of the internal account */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The latest date the payment may come in. Format is yyyy-mm-dd */
    @JsonProperty("date_upper_bound") @ExcludeMissing fun _dateUpperBound() = dateUpperBound

    /** The earliest date the payment may come in. Format is yyyy-mm-dd */
    @JsonProperty("date_lower_bound") @ExcludeMissing fun _dateLowerBound() = dateLowerBound

    /** The ID of the counterparty you expect for this payment */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** A hash of custom identifiers for this payment */
    @JsonProperty("custom_identifiers") @ExcludeMissing fun _customIdentifiers() = customIdentifiers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ReconciliationRule = apply {
        if (!validated) {
            amountUpperBound()
            amountLowerBound()
            direction()
            internalAccountId()
            type()
            currency()
            dateUpperBound()
            dateLowerBound()
            counterpartyId()
            customIdentifiers()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var amountUpperBound: JsonField<Long> = JsonMissing.of()
        private var amountLowerBound: JsonField<Long> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
        private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var customIdentifiers: JsonField<CustomIdentifiers> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(reconciliationRule: ReconciliationRule) = apply {
            this.amountUpperBound = reconciliationRule.amountUpperBound
            this.amountLowerBound = reconciliationRule.amountLowerBound
            this.direction = reconciliationRule.direction
            this.internalAccountId = reconciliationRule.internalAccountId
            this.type = reconciliationRule.type
            this.currency = reconciliationRule.currency
            this.dateUpperBound = reconciliationRule.dateUpperBound
            this.dateLowerBound = reconciliationRule.dateLowerBound
            this.counterpartyId = reconciliationRule.counterpartyId
            this.customIdentifiers = reconciliationRule.customIdentifiers
            additionalProperties(reconciliationRule.additionalProperties)
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
        @JsonProperty("amount_upper_bound")
        @ExcludeMissing
        fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
            this.amountUpperBound = amountUpperBound
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
        @JsonProperty("amount_lower_bound")
        @ExcludeMissing
        fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
            this.amountLowerBound = amountLowerBound
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
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the Internal Account for the expected payment */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
         * wire
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * One of ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet
         * wire
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Must conform to ISO 4217. Defaults to the currency of the internal account */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The latest date the payment may come in. Format is yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate) = dateUpperBound(JsonField.of(dateUpperBound))

        /** The latest date the payment may come in. Format is yyyy-mm-dd */
        @JsonProperty("date_upper_bound")
        @ExcludeMissing
        fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** The earliest date the payment may come in. Format is yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate) = dateLowerBound(JsonField.of(dateLowerBound))

        /** The earliest date the payment may come in. Format is yyyy-mm-dd */
        @JsonProperty("date_lower_bound")
        @ExcludeMissing
        fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** The ID of the counterparty you expect for this payment */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID of the counterparty you expect for this payment */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** A hash of custom identifiers for this payment */
        fun customIdentifiers(customIdentifiers: CustomIdentifiers) =
            customIdentifiers(JsonField.of(customIdentifiers))

        /** A hash of custom identifiers for this payment */
        @JsonProperty("custom_identifiers")
        @ExcludeMissing
        fun customIdentifiers(customIdentifiers: JsonField<CustomIdentifiers>) = apply {
            this.customIdentifiers = customIdentifiers
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

        fun build(): ReconciliationRule =
            ReconciliationRule(
                amountUpperBound,
                amountLowerBound,
                direction,
                internalAccountId,
                type,
                currency,
                dateUpperBound,
                dateLowerBound,
                counterpartyId,
                customIdentifiers,
                additionalProperties.toImmutable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** A hash of custom identifiers for this payment */
    @JsonDeserialize(builder = CustomIdentifiers.Builder::class)
    @NoAutoDetect
    class CustomIdentifiers
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomIdentifiers = apply {
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

            internal fun from(customIdentifiers: CustomIdentifiers) = apply {
                additionalProperties(customIdentifiers.additionalProperties)
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = Type(JsonField.of("ach"))

            val AU_BECS = Type(JsonField.of("au_becs"))

            val BACS = Type(JsonField.of("bacs"))

            val BOOK = Type(JsonField.of("book"))

            val CARD = Type(JsonField.of("card"))

            val CHATS = Type(JsonField.of("chats"))

            val CHECK = Type(JsonField.of("check"))

            val CROSS_BORDER = Type(JsonField.of("cross_border"))

            val DK_NETS = Type(JsonField.of("dk_nets"))

            val EFT = Type(JsonField.of("eft"))

            val HU_ICS = Type(JsonField.of("hu_ics"))

            val INTERAC = Type(JsonField.of("interac"))

            val MASAV = Type(JsonField.of("masav"))

            val MX_CCEN = Type(JsonField.of("mx_ccen"))

            val NEFT = Type(JsonField.of("neft"))

            val NICS = Type(JsonField.of("nics"))

            val NZ_BECS = Type(JsonField.of("nz_becs"))

            val PL_ELIXIR = Type(JsonField.of("pl_elixir"))

            val PROVXCHANGE = Type(JsonField.of("provxchange"))

            val RO_SENT = Type(JsonField.of("ro_sent"))

            val RTP = Type(JsonField.of("rtp"))

            val SE_BANKGIROT = Type(JsonField.of("se_bankgirot"))

            val SEN = Type(JsonField.of("sen"))

            val SEPA = Type(JsonField.of("sepa"))

            val SG_GIRO = Type(JsonField.of("sg_giro"))

            val SIC = Type(JsonField.of("sic"))

            val SIGNET = Type(JsonField.of("signet"))

            val SKNBI = Type(JsonField.of("sknbi"))

            val WIRE = Type(JsonField.of("wire"))

            val ZENGIN = Type(JsonField.of("zengin"))

            fun of(value: String) = Type(JsonField.of(value))
        }

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
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReconciliationRule && amountUpperBound == other.amountUpperBound && amountLowerBound == other.amountLowerBound && direction == other.direction && internalAccountId == other.internalAccountId && type == other.type && currency == other.currency && dateUpperBound == other.dateUpperBound && dateLowerBound == other.dateLowerBound && counterpartyId == other.counterpartyId && customIdentifiers == other.customIdentifiers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amountUpperBound, amountLowerBound, direction, internalAccountId, type, currency, dateUpperBound, dateLowerBound, counterpartyId, customIdentifiers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReconciliationRule{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, counterpartyId=$counterpartyId, customIdentifiers=$customIdentifiers, additionalProperties=$additionalProperties}"
}
