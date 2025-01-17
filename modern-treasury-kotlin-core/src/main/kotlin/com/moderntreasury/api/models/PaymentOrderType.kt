// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

/**
 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
 * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
 * `provexchange`, `zengin`.
 */
class PaymentOrderType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

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

        fun of(value: String) = PaymentOrderType(JsonField.of(value))
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
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
