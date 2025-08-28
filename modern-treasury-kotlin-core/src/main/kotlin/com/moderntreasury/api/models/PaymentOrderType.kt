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
class PaymentOrderType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val ACH = of("ach")

        val AU_BECS = of("au_becs")

        val BACS = of("bacs")

        val BASE = of("base")

        val BOOK = of("book")

        val CARD = of("card")

        val CHATS = of("chats")

        val CHECK = of("check")

        val CROSS_BORDER = of("cross_border")

        val DK_NETS = of("dk_nets")

        val EFT = of("eft")

        val ETHEREUM = of("ethereum")

        val GB_FPS = of("gb_fps")

        val HU_ICS = of("hu_ics")

        val INTERAC = of("interac")

        val MASAV = of("masav")

        val MX_CCEN = of("mx_ccen")

        val NEFT = of("neft")

        val NICS = of("nics")

        val NZ_BECS = of("nz_becs")

        val PL_ELIXIR = of("pl_elixir")

        val POLYGON = of("polygon")

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

        val SOLANA = of("solana")

        val WIRE = of("wire")

        val ZENGIN = of("zengin")

        fun of(value: String) = PaymentOrderType(JsonField.of(value))
    }

    /** An enum containing [PaymentOrderType]'s known values. */
    enum class Known {
        ACH,
        AU_BECS,
        BACS,
        BASE,
        BOOK,
        CARD,
        CHATS,
        CHECK,
        CROSS_BORDER,
        DK_NETS,
        EFT,
        ETHEREUM,
        GB_FPS,
        HU_ICS,
        INTERAC,
        MASAV,
        MX_CCEN,
        NEFT,
        NICS,
        NZ_BECS,
        PL_ELIXIR,
        POLYGON,
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
        SOLANA,
        WIRE,
        ZENGIN,
    }

    /**
     * An enum containing [PaymentOrderType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentOrderType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ACH,
        AU_BECS,
        BACS,
        BASE,
        BOOK,
        CARD,
        CHATS,
        CHECK,
        CROSS_BORDER,
        DK_NETS,
        EFT,
        ETHEREUM,
        GB_FPS,
        HU_ICS,
        INTERAC,
        MASAV,
        MX_CCEN,
        NEFT,
        NICS,
        NZ_BECS,
        PL_ELIXIR,
        POLYGON,
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
        SOLANA,
        WIRE,
        ZENGIN,
        /**
         * An enum member indicating that [PaymentOrderType] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ACH -> Value.ACH
            AU_BECS -> Value.AU_BECS
            BACS -> Value.BACS
            BASE -> Value.BASE
            BOOK -> Value.BOOK
            CARD -> Value.CARD
            CHATS -> Value.CHATS
            CHECK -> Value.CHECK
            CROSS_BORDER -> Value.CROSS_BORDER
            DK_NETS -> Value.DK_NETS
            EFT -> Value.EFT
            ETHEREUM -> Value.ETHEREUM
            GB_FPS -> Value.GB_FPS
            HU_ICS -> Value.HU_ICS
            INTERAC -> Value.INTERAC
            MASAV -> Value.MASAV
            MX_CCEN -> Value.MX_CCEN
            NEFT -> Value.NEFT
            NICS -> Value.NICS
            NZ_BECS -> Value.NZ_BECS
            PL_ELIXIR -> Value.PL_ELIXIR
            POLYGON -> Value.POLYGON
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
            SOLANA -> Value.SOLANA
            WIRE -> Value.WIRE
            ZENGIN -> Value.ZENGIN
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            ACH -> Known.ACH
            AU_BECS -> Known.AU_BECS
            BACS -> Known.BACS
            BASE -> Known.BASE
            BOOK -> Known.BOOK
            CARD -> Known.CARD
            CHATS -> Known.CHATS
            CHECK -> Known.CHECK
            CROSS_BORDER -> Known.CROSS_BORDER
            DK_NETS -> Known.DK_NETS
            EFT -> Known.EFT
            ETHEREUM -> Known.ETHEREUM
            GB_FPS -> Known.GB_FPS
            HU_ICS -> Known.HU_ICS
            INTERAC -> Known.INTERAC
            MASAV -> Known.MASAV
            MX_CCEN -> Known.MX_CCEN
            NEFT -> Known.NEFT
            NICS -> Known.NICS
            NZ_BECS -> Known.NZ_BECS
            PL_ELIXIR -> Known.PL_ELIXIR
            POLYGON -> Known.POLYGON
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
            SOLANA -> Known.SOLANA
            WIRE -> Known.WIRE
            ZENGIN -> Known.ZENGIN
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    fun validate(): PaymentOrderType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
