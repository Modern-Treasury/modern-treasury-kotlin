// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class ExpectedPaymentType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpectedPaymentType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val ACH = ExpectedPaymentType(JsonField.of("ach"))

        val AU_BECS = ExpectedPaymentType(JsonField.of("au_becs"))

        val BACS = ExpectedPaymentType(JsonField.of("bacs"))

        val BOOK = ExpectedPaymentType(JsonField.of("book"))

        val CARD = ExpectedPaymentType(JsonField.of("card"))

        val CHECK = ExpectedPaymentType(JsonField.of("check"))

        val CROSS_BORDER = ExpectedPaymentType(JsonField.of("cross_border"))

        val EFT = ExpectedPaymentType(JsonField.of("eft"))

        val INTERAC = ExpectedPaymentType(JsonField.of("interac"))

        val MASAV = ExpectedPaymentType(JsonField.of("masav"))

        val NEFT = ExpectedPaymentType(JsonField.of("neft"))

        val NICS = ExpectedPaymentType(JsonField.of("nics"))

        val PROVXCHANGE = ExpectedPaymentType(JsonField.of("provxchange"))

        val RTP = ExpectedPaymentType(JsonField.of("rtp"))

        val SE_BANKGIROT = ExpectedPaymentType(JsonField.of("se_bankgirot"))

        val SEN = ExpectedPaymentType(JsonField.of("sen"))

        val SEPA = ExpectedPaymentType(JsonField.of("sepa"))

        val SIC = ExpectedPaymentType(JsonField.of("sic"))

        val SIGNET = ExpectedPaymentType(JsonField.of("signet"))

        val WIRE = ExpectedPaymentType(JsonField.of("wire"))

        val ZENGIN = ExpectedPaymentType(JsonField.of("zengin"))

        fun of(value: String) = ExpectedPaymentType(JsonField.of(value))
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
            else -> throw ModernTreasuryInvalidDataException("Unknown ExpectedPaymentType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
