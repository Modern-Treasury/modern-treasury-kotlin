// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class PaymentOrderType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val ACH = PaymentOrderType(JsonField.of("ach"))

        val AU_BECS = PaymentOrderType(JsonField.of("au_becs"))

        val BACS = PaymentOrderType(JsonField.of("bacs"))

        val BOOK = PaymentOrderType(JsonField.of("book"))

        val CARD = PaymentOrderType(JsonField.of("card"))

        val CHECK = PaymentOrderType(JsonField.of("check"))

        val CROSS_BORDER = PaymentOrderType(JsonField.of("cross_border"))

        val EFT = PaymentOrderType(JsonField.of("eft"))

        val INTERAC = PaymentOrderType(JsonField.of("interac"))

        val MASAV = PaymentOrderType(JsonField.of("masav"))

        val NEFT = PaymentOrderType(JsonField.of("neft"))

        val NICS = PaymentOrderType(JsonField.of("nics"))

        val PROVXCHANGE = PaymentOrderType(JsonField.of("provxchange"))

        val RTP = PaymentOrderType(JsonField.of("rtp"))

        val SE_BANKGIROT = PaymentOrderType(JsonField.of("se_bankgirot"))

        val SEN = PaymentOrderType(JsonField.of("sen"))

        val SEPA = PaymentOrderType(JsonField.of("sepa"))

        val SIC = PaymentOrderType(JsonField.of("sic"))

        val SIGNET = PaymentOrderType(JsonField.of("signet"))

        val WIRE = PaymentOrderType(JsonField.of("wire"))

        val ZENGIN = PaymentOrderType(JsonField.of("zengin"))

        fun of(value: String) = PaymentOrderType(JsonField.of(value))
    }

    enum class Known {
        ACH,
        AU_BECS,
        BACS,
        BOOK,
        CARD,
        CHECK,
        CROSS_BORDER,
        EFT,
        INTERAC,
        MASAV,
        NEFT,
        NICS,
        PROVXCHANGE,
        RTP,
        SE_BANKGIROT,
        SEN,
        SEPA,
        SIC,
        SIGNET,
        WIRE,
        ZENGIN,
    }

    enum class Value {
        ACH,
        AU_BECS,
        BACS,
        BOOK,
        CARD,
        CHECK,
        CROSS_BORDER,
        EFT,
        INTERAC,
        MASAV,
        NEFT,
        NICS,
        PROVXCHANGE,
        RTP,
        SE_BANKGIROT,
        SEN,
        SEPA,
        SIC,
        SIGNET,
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
            CHECK -> Value.CHECK
            CROSS_BORDER -> Value.CROSS_BORDER
            EFT -> Value.EFT
            INTERAC -> Value.INTERAC
            MASAV -> Value.MASAV
            NEFT -> Value.NEFT
            NICS -> Value.NICS
            PROVXCHANGE -> Value.PROVXCHANGE
            RTP -> Value.RTP
            SE_BANKGIROT -> Value.SE_BANKGIROT
            SEN -> Value.SEN
            SEPA -> Value.SEPA
            SIC -> Value.SIC
            SIGNET -> Value.SIGNET
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
            CHECK -> Known.CHECK
            CROSS_BORDER -> Known.CROSS_BORDER
            EFT -> Known.EFT
            INTERAC -> Known.INTERAC
            MASAV -> Known.MASAV
            NEFT -> Known.NEFT
            NICS -> Known.NICS
            PROVXCHANGE -> Known.PROVXCHANGE
            RTP -> Known.RTP
            SE_BANKGIROT -> Known.SE_BANKGIROT
            SEN -> Known.SEN
            SEPA -> Known.SEPA
            SIC -> Known.SIC
            SIGNET -> Known.SIGNET
            WIRE -> Known.WIRE
            ZENGIN -> Known.ZENGIN
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
