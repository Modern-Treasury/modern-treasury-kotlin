// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

/** Three-letter ISO currency code. */
class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AED = of("AED")

        val AFN = of("AFN")

        val ALL = of("ALL")

        val AMD = of("AMD")

        val ANG = of("ANG")

        val AOA = of("AOA")

        val ARS = of("ARS")

        val AUD = of("AUD")

        val AWG = of("AWG")

        val AZN = of("AZN")

        val BAM = of("BAM")

        val BBD = of("BBD")

        val BCH = of("BCH")

        val BDT = of("BDT")

        val BGN = of("BGN")

        val BHD = of("BHD")

        val BIF = of("BIF")

        val BMD = of("BMD")

        val BND = of("BND")

        val BOB = of("BOB")

        val BRL = of("BRL")

        val BSD = of("BSD")

        val BTC = of("BTC")

        val BTN = of("BTN")

        val BWP = of("BWP")

        val BYN = of("BYN")

        val BYR = of("BYR")

        val BZD = of("BZD")

        val CAD = of("CAD")

        val CDF = of("CDF")

        val CHF = of("CHF")

        val CLF = of("CLF")

        val CLP = of("CLP")

        val CNH = of("CNH")

        val CNY = of("CNY")

        val COP = of("COP")

        val CRC = of("CRC")

        val CUC = of("CUC")

        val CUP = of("CUP")

        val CVE = of("CVE")

        val CZK = of("CZK")

        val DJF = of("DJF")

        val DKK = of("DKK")

        val DOP = of("DOP")

        val DZD = of("DZD")

        val EEK = of("EEK")

        val EGP = of("EGP")

        val ERN = of("ERN")

        val ETB = of("ETB")

        val EUR = of("EUR")

        val EURC = of("EURC")

        val FJD = of("FJD")

        val FKP = of("FKP")

        val GBP = of("GBP")

        val GBX = of("GBX")

        val GEL = of("GEL")

        val GGP = of("GGP")

        val GHS = of("GHS")

        val GIP = of("GIP")

        val GMD = of("GMD")

        val GNF = of("GNF")

        val GTQ = of("GTQ")

        val GYD = of("GYD")

        val HKD = of("HKD")

        val HNL = of("HNL")

        val HRK = of("HRK")

        val HTG = of("HTG")

        val HUF = of("HUF")

        val IDR = of("IDR")

        val ILS = of("ILS")

        val IMP = of("IMP")

        val INR = of("INR")

        val IQD = of("IQD")

        val IRR = of("IRR")

        val ISK = of("ISK")

        val JEP = of("JEP")

        val JMD = of("JMD")

        val JOD = of("JOD")

        val JPY = of("JPY")

        val KES = of("KES")

        val KGS = of("KGS")

        val KHR = of("KHR")

        val KMF = of("KMF")

        val KPW = of("KPW")

        val KRW = of("KRW")

        val KWD = of("KWD")

        val KYD = of("KYD")

        val KZT = of("KZT")

        val LAK = of("LAK")

        val LBP = of("LBP")

        val LKR = of("LKR")

        val LRD = of("LRD")

        val LSL = of("LSL")

        val LTL = of("LTL")

        val LVL = of("LVL")

        val LYD = of("LYD")

        val MAD = of("MAD")

        val MDL = of("MDL")

        val MGA = of("MGA")

        val MKD = of("MKD")

        val MMK = of("MMK")

        val MNT = of("MNT")

        val MOP = of("MOP")

        val MRO = of("MRO")

        val MRU = of("MRU")

        val MTL = of("MTL")

        val MUR = of("MUR")

        val MVR = of("MVR")

        val MWK = of("MWK")

        val MXN = of("MXN")

        val MYR = of("MYR")

        val MZN = of("MZN")

        val NAD = of("NAD")

        val NGN = of("NGN")

        val NIO = of("NIO")

        val NOK = of("NOK")

        val NPR = of("NPR")

        val NZD = of("NZD")

        val OMR = of("OMR")

        val PAB = of("PAB")

        val PEN = of("PEN")

        val PGK = of("PGK")

        val PHP = of("PHP")

        val PKR = of("PKR")

        val PLN = of("PLN")

        val PYG = of("PYG")

        val PYUSD = of("PYUSD")

        val QAR = of("QAR")

        val RON = of("RON")

        val RSD = of("RSD")

        val RUB = of("RUB")

        val RWF = of("RWF")

        val SAR = of("SAR")

        val SBC = of("SBC")

        val SBD = of("SBD")

        val SCR = of("SCR")

        val SDG = of("SDG")

        val SEK = of("SEK")

        val SGD = of("SGD")

        val SHP = of("SHP")

        val SKK = of("SKK")

        val SLL = of("SLL")

        val SOS = of("SOS")

        val SRD = of("SRD")

        val SSP = of("SSP")

        val STD = of("STD")

        val SVC = of("SVC")

        val SYP = of("SYP")

        val SZL = of("SZL")

        val THB = of("THB")

        val TJS = of("TJS")

        val TMM = of("TMM")

        val TMT = of("TMT")

        val TND = of("TND")

        val TOP = of("TOP")

        val TRY = of("TRY")

        val TTD = of("TTD")

        val TWD = of("TWD")

        val TZS = of("TZS")

        val UAH = of("UAH")

        val UGX = of("UGX")

        val USD = of("USD")

        val USDB = of("USDB")

        val USDC = of("USDC")

        val USDP = of("USDP")

        val USDT = of("USDT")

        val UYU = of("UYU")

        val UZS = of("UZS")

        val VEF = of("VEF")

        val VES = of("VES")

        val VND = of("VND")

        val VUV = of("VUV")

        val WST = of("WST")

        val XAF = of("XAF")

        val XAG = of("XAG")

        val XAU = of("XAU")

        val XBA = of("XBA")

        val XBB = of("XBB")

        val XBC = of("XBC")

        val XBD = of("XBD")

        val XCD = of("XCD")

        val XDR = of("XDR")

        val XFU = of("XFU")

        val XOF = of("XOF")

        val XPD = of("XPD")

        val XPF = of("XPF")

        val XPT = of("XPT")

        val XTS = of("XTS")

        val YER = of("YER")

        val ZAR = of("ZAR")

        val ZMK = of("ZMK")

        val ZMW = of("ZMW")

        val ZWD = of("ZWD")

        val ZWL = of("ZWL")

        val ZWN = of("ZWN")

        val ZWR = of("ZWR")

        fun of(value: String) = Currency(JsonField.of(value))
    }

    /** An enum containing [Currency]'s known values. */
    enum class Known {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BCH,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BRL,
        BSD,
        BTC,
        BTN,
        BWP,
        BYN,
        BYR,
        BZD,
        CAD,
        CDF,
        CHF,
        CLF,
        CLP,
        CNH,
        CNY,
        COP,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EEK,
        EGP,
        ERN,
        ETB,
        EUR,
        EURC,
        FJD,
        FKP,
        GBP,
        GBX,
        GEL,
        GGP,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        IMP,
        INR,
        IQD,
        IRR,
        ISK,
        JEP,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LTL,
        LVL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRO,
        MRU,
        MTL,
        MUR,
        MVR,
        MWK,
        MXN,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        PYUSD,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBC,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SKK,
        SLL,
        SOS,
        SRD,
        SSP,
        STD,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMM,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        USDB,
        USDC,
        USDP,
        USDT,
        UYU,
        UZS,
        VEF,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XFU,
        XOF,
        XPD,
        XPF,
        XPT,
        XTS,
        YER,
        ZAR,
        ZMK,
        ZMW,
        ZWD,
        ZWL,
        ZWN,
        ZWR,
    }

    /**
     * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Currency] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BCH,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BRL,
        BSD,
        BTC,
        BTN,
        BWP,
        BYN,
        BYR,
        BZD,
        CAD,
        CDF,
        CHF,
        CLF,
        CLP,
        CNH,
        CNY,
        COP,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EEK,
        EGP,
        ERN,
        ETB,
        EUR,
        EURC,
        FJD,
        FKP,
        GBP,
        GBX,
        GEL,
        GGP,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        IMP,
        INR,
        IQD,
        IRR,
        ISK,
        JEP,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LTL,
        LVL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRO,
        MRU,
        MTL,
        MUR,
        MVR,
        MWK,
        MXN,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        PYUSD,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBC,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SKK,
        SLL,
        SOS,
        SRD,
        SSP,
        STD,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMM,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        USDB,
        USDC,
        USDP,
        USDT,
        UYU,
        UZS,
        VEF,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XFU,
        XOF,
        XPD,
        XPF,
        XPT,
        XTS,
        YER,
        ZAR,
        ZMK,
        ZMW,
        ZWD,
        ZWL,
        ZWN,
        ZWR,
        /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
            AED -> Value.AED
            AFN -> Value.AFN
            ALL -> Value.ALL
            AMD -> Value.AMD
            ANG -> Value.ANG
            AOA -> Value.AOA
            ARS -> Value.ARS
            AUD -> Value.AUD
            AWG -> Value.AWG
            AZN -> Value.AZN
            BAM -> Value.BAM
            BBD -> Value.BBD
            BCH -> Value.BCH
            BDT -> Value.BDT
            BGN -> Value.BGN
            BHD -> Value.BHD
            BIF -> Value.BIF
            BMD -> Value.BMD
            BND -> Value.BND
            BOB -> Value.BOB
            BRL -> Value.BRL
            BSD -> Value.BSD
            BTC -> Value.BTC
            BTN -> Value.BTN
            BWP -> Value.BWP
            BYN -> Value.BYN
            BYR -> Value.BYR
            BZD -> Value.BZD
            CAD -> Value.CAD
            CDF -> Value.CDF
            CHF -> Value.CHF
            CLF -> Value.CLF
            CLP -> Value.CLP
            CNH -> Value.CNH
            CNY -> Value.CNY
            COP -> Value.COP
            CRC -> Value.CRC
            CUC -> Value.CUC
            CUP -> Value.CUP
            CVE -> Value.CVE
            CZK -> Value.CZK
            DJF -> Value.DJF
            DKK -> Value.DKK
            DOP -> Value.DOP
            DZD -> Value.DZD
            EEK -> Value.EEK
            EGP -> Value.EGP
            ERN -> Value.ERN
            ETB -> Value.ETB
            EUR -> Value.EUR
            EURC -> Value.EURC
            FJD -> Value.FJD
            FKP -> Value.FKP
            GBP -> Value.GBP
            GBX -> Value.GBX
            GEL -> Value.GEL
            GGP -> Value.GGP
            GHS -> Value.GHS
            GIP -> Value.GIP
            GMD -> Value.GMD
            GNF -> Value.GNF
            GTQ -> Value.GTQ
            GYD -> Value.GYD
            HKD -> Value.HKD
            HNL -> Value.HNL
            HRK -> Value.HRK
            HTG -> Value.HTG
            HUF -> Value.HUF
            IDR -> Value.IDR
            ILS -> Value.ILS
            IMP -> Value.IMP
            INR -> Value.INR
            IQD -> Value.IQD
            IRR -> Value.IRR
            ISK -> Value.ISK
            JEP -> Value.JEP
            JMD -> Value.JMD
            JOD -> Value.JOD
            JPY -> Value.JPY
            KES -> Value.KES
            KGS -> Value.KGS
            KHR -> Value.KHR
            KMF -> Value.KMF
            KPW -> Value.KPW
            KRW -> Value.KRW
            KWD -> Value.KWD
            KYD -> Value.KYD
            KZT -> Value.KZT
            LAK -> Value.LAK
            LBP -> Value.LBP
            LKR -> Value.LKR
            LRD -> Value.LRD
            LSL -> Value.LSL
            LTL -> Value.LTL
            LVL -> Value.LVL
            LYD -> Value.LYD
            MAD -> Value.MAD
            MDL -> Value.MDL
            MGA -> Value.MGA
            MKD -> Value.MKD
            MMK -> Value.MMK
            MNT -> Value.MNT
            MOP -> Value.MOP
            MRO -> Value.MRO
            MRU -> Value.MRU
            MTL -> Value.MTL
            MUR -> Value.MUR
            MVR -> Value.MVR
            MWK -> Value.MWK
            MXN -> Value.MXN
            MYR -> Value.MYR
            MZN -> Value.MZN
            NAD -> Value.NAD
            NGN -> Value.NGN
            NIO -> Value.NIO
            NOK -> Value.NOK
            NPR -> Value.NPR
            NZD -> Value.NZD
            OMR -> Value.OMR
            PAB -> Value.PAB
            PEN -> Value.PEN
            PGK -> Value.PGK
            PHP -> Value.PHP
            PKR -> Value.PKR
            PLN -> Value.PLN
            PYG -> Value.PYG
            PYUSD -> Value.PYUSD
            QAR -> Value.QAR
            RON -> Value.RON
            RSD -> Value.RSD
            RUB -> Value.RUB
            RWF -> Value.RWF
            SAR -> Value.SAR
            SBC -> Value.SBC
            SBD -> Value.SBD
            SCR -> Value.SCR
            SDG -> Value.SDG
            SEK -> Value.SEK
            SGD -> Value.SGD
            SHP -> Value.SHP
            SKK -> Value.SKK
            SLL -> Value.SLL
            SOS -> Value.SOS
            SRD -> Value.SRD
            SSP -> Value.SSP
            STD -> Value.STD
            SVC -> Value.SVC
            SYP -> Value.SYP
            SZL -> Value.SZL
            THB -> Value.THB
            TJS -> Value.TJS
            TMM -> Value.TMM
            TMT -> Value.TMT
            TND -> Value.TND
            TOP -> Value.TOP
            TRY -> Value.TRY
            TTD -> Value.TTD
            TWD -> Value.TWD
            TZS -> Value.TZS
            UAH -> Value.UAH
            UGX -> Value.UGX
            USD -> Value.USD
            USDB -> Value.USDB
            USDC -> Value.USDC
            USDP -> Value.USDP
            USDT -> Value.USDT
            UYU -> Value.UYU
            UZS -> Value.UZS
            VEF -> Value.VEF
            VES -> Value.VES
            VND -> Value.VND
            VUV -> Value.VUV
            WST -> Value.WST
            XAF -> Value.XAF
            XAG -> Value.XAG
            XAU -> Value.XAU
            XBA -> Value.XBA
            XBB -> Value.XBB
            XBC -> Value.XBC
            XBD -> Value.XBD
            XCD -> Value.XCD
            XDR -> Value.XDR
            XFU -> Value.XFU
            XOF -> Value.XOF
            XPD -> Value.XPD
            XPF -> Value.XPF
            XPT -> Value.XPT
            XTS -> Value.XTS
            YER -> Value.YER
            ZAR -> Value.ZAR
            ZMK -> Value.ZMK
            ZMW -> Value.ZMW
            ZWD -> Value.ZWD
            ZWL -> Value.ZWL
            ZWN -> Value.ZWN
            ZWR -> Value.ZWR
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
            AED -> Known.AED
            AFN -> Known.AFN
            ALL -> Known.ALL
            AMD -> Known.AMD
            ANG -> Known.ANG
            AOA -> Known.AOA
            ARS -> Known.ARS
            AUD -> Known.AUD
            AWG -> Known.AWG
            AZN -> Known.AZN
            BAM -> Known.BAM
            BBD -> Known.BBD
            BCH -> Known.BCH
            BDT -> Known.BDT
            BGN -> Known.BGN
            BHD -> Known.BHD
            BIF -> Known.BIF
            BMD -> Known.BMD
            BND -> Known.BND
            BOB -> Known.BOB
            BRL -> Known.BRL
            BSD -> Known.BSD
            BTC -> Known.BTC
            BTN -> Known.BTN
            BWP -> Known.BWP
            BYN -> Known.BYN
            BYR -> Known.BYR
            BZD -> Known.BZD
            CAD -> Known.CAD
            CDF -> Known.CDF
            CHF -> Known.CHF
            CLF -> Known.CLF
            CLP -> Known.CLP
            CNH -> Known.CNH
            CNY -> Known.CNY
            COP -> Known.COP
            CRC -> Known.CRC
            CUC -> Known.CUC
            CUP -> Known.CUP
            CVE -> Known.CVE
            CZK -> Known.CZK
            DJF -> Known.DJF
            DKK -> Known.DKK
            DOP -> Known.DOP
            DZD -> Known.DZD
            EEK -> Known.EEK
            EGP -> Known.EGP
            ERN -> Known.ERN
            ETB -> Known.ETB
            EUR -> Known.EUR
            EURC -> Known.EURC
            FJD -> Known.FJD
            FKP -> Known.FKP
            GBP -> Known.GBP
            GBX -> Known.GBX
            GEL -> Known.GEL
            GGP -> Known.GGP
            GHS -> Known.GHS
            GIP -> Known.GIP
            GMD -> Known.GMD
            GNF -> Known.GNF
            GTQ -> Known.GTQ
            GYD -> Known.GYD
            HKD -> Known.HKD
            HNL -> Known.HNL
            HRK -> Known.HRK
            HTG -> Known.HTG
            HUF -> Known.HUF
            IDR -> Known.IDR
            ILS -> Known.ILS
            IMP -> Known.IMP
            INR -> Known.INR
            IQD -> Known.IQD
            IRR -> Known.IRR
            ISK -> Known.ISK
            JEP -> Known.JEP
            JMD -> Known.JMD
            JOD -> Known.JOD
            JPY -> Known.JPY
            KES -> Known.KES
            KGS -> Known.KGS
            KHR -> Known.KHR
            KMF -> Known.KMF
            KPW -> Known.KPW
            KRW -> Known.KRW
            KWD -> Known.KWD
            KYD -> Known.KYD
            KZT -> Known.KZT
            LAK -> Known.LAK
            LBP -> Known.LBP
            LKR -> Known.LKR
            LRD -> Known.LRD
            LSL -> Known.LSL
            LTL -> Known.LTL
            LVL -> Known.LVL
            LYD -> Known.LYD
            MAD -> Known.MAD
            MDL -> Known.MDL
            MGA -> Known.MGA
            MKD -> Known.MKD
            MMK -> Known.MMK
            MNT -> Known.MNT
            MOP -> Known.MOP
            MRO -> Known.MRO
            MRU -> Known.MRU
            MTL -> Known.MTL
            MUR -> Known.MUR
            MVR -> Known.MVR
            MWK -> Known.MWK
            MXN -> Known.MXN
            MYR -> Known.MYR
            MZN -> Known.MZN
            NAD -> Known.NAD
            NGN -> Known.NGN
            NIO -> Known.NIO
            NOK -> Known.NOK
            NPR -> Known.NPR
            NZD -> Known.NZD
            OMR -> Known.OMR
            PAB -> Known.PAB
            PEN -> Known.PEN
            PGK -> Known.PGK
            PHP -> Known.PHP
            PKR -> Known.PKR
            PLN -> Known.PLN
            PYG -> Known.PYG
            PYUSD -> Known.PYUSD
            QAR -> Known.QAR
            RON -> Known.RON
            RSD -> Known.RSD
            RUB -> Known.RUB
            RWF -> Known.RWF
            SAR -> Known.SAR
            SBC -> Known.SBC
            SBD -> Known.SBD
            SCR -> Known.SCR
            SDG -> Known.SDG
            SEK -> Known.SEK
            SGD -> Known.SGD
            SHP -> Known.SHP
            SKK -> Known.SKK
            SLL -> Known.SLL
            SOS -> Known.SOS
            SRD -> Known.SRD
            SSP -> Known.SSP
            STD -> Known.STD
            SVC -> Known.SVC
            SYP -> Known.SYP
            SZL -> Known.SZL
            THB -> Known.THB
            TJS -> Known.TJS
            TMM -> Known.TMM
            TMT -> Known.TMT
            TND -> Known.TND
            TOP -> Known.TOP
            TRY -> Known.TRY
            TTD -> Known.TTD
            TWD -> Known.TWD
            TZS -> Known.TZS
            UAH -> Known.UAH
            UGX -> Known.UGX
            USD -> Known.USD
            USDB -> Known.USDB
            USDC -> Known.USDC
            USDP -> Known.USDP
            USDT -> Known.USDT
            UYU -> Known.UYU
            UZS -> Known.UZS
            VEF -> Known.VEF
            VES -> Known.VES
            VND -> Known.VND
            VUV -> Known.VUV
            WST -> Known.WST
            XAF -> Known.XAF
            XAG -> Known.XAG
            XAU -> Known.XAU
            XBA -> Known.XBA
            XBB -> Known.XBB
            XBC -> Known.XBC
            XBD -> Known.XBD
            XCD -> Known.XCD
            XDR -> Known.XDR
            XFU -> Known.XFU
            XOF -> Known.XOF
            XPD -> Known.XPD
            XPF -> Known.XPF
            XPT -> Known.XPT
            XTS -> Known.XTS
            YER -> Known.YER
            ZAR -> Known.ZAR
            ZMK -> Known.ZMK
            ZMW -> Known.ZMW
            ZWD -> Known.ZWD
            ZWL -> Known.ZWL
            ZWN -> Known.ZWN
            ZWR -> Known.ZWR
            else -> throw ModernTreasuryInvalidDataException("Unknown Currency: $value")
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

    fun validate(): Currency = apply {
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

        return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
