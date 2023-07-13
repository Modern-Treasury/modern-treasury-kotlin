package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class Currency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Currency && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val AED = Currency(JsonField.of("AED"))

        val AFN = Currency(JsonField.of("AFN"))

        val ALL = Currency(JsonField.of("ALL"))

        val AMD = Currency(JsonField.of("AMD"))

        val ANG = Currency(JsonField.of("ANG"))

        val AOA = Currency(JsonField.of("AOA"))

        val ARS = Currency(JsonField.of("ARS"))

        val AUD = Currency(JsonField.of("AUD"))

        val AWG = Currency(JsonField.of("AWG"))

        val AZN = Currency(JsonField.of("AZN"))

        val BAM = Currency(JsonField.of("BAM"))

        val BBD = Currency(JsonField.of("BBD"))

        val BCH = Currency(JsonField.of("BCH"))

        val BDT = Currency(JsonField.of("BDT"))

        val BGN = Currency(JsonField.of("BGN"))

        val BHD = Currency(JsonField.of("BHD"))

        val BIF = Currency(JsonField.of("BIF"))

        val BMD = Currency(JsonField.of("BMD"))

        val BND = Currency(JsonField.of("BND"))

        val BOB = Currency(JsonField.of("BOB"))

        val BRL = Currency(JsonField.of("BRL"))

        val BSD = Currency(JsonField.of("BSD"))

        val BTC = Currency(JsonField.of("BTC"))

        val BTN = Currency(JsonField.of("BTN"))

        val BWP = Currency(JsonField.of("BWP"))

        val BYN = Currency(JsonField.of("BYN"))

        val BYR = Currency(JsonField.of("BYR"))

        val BZD = Currency(JsonField.of("BZD"))

        val CAD = Currency(JsonField.of("CAD"))

        val CDF = Currency(JsonField.of("CDF"))

        val CHF = Currency(JsonField.of("CHF"))

        val CLF = Currency(JsonField.of("CLF"))

        val CLP = Currency(JsonField.of("CLP"))

        val CNH = Currency(JsonField.of("CNH"))

        val CNY = Currency(JsonField.of("CNY"))

        val COP = Currency(JsonField.of("COP"))

        val CRC = Currency(JsonField.of("CRC"))

        val CUC = Currency(JsonField.of("CUC"))

        val CUP = Currency(JsonField.of("CUP"))

        val CVE = Currency(JsonField.of("CVE"))

        val CZK = Currency(JsonField.of("CZK"))

        val DJF = Currency(JsonField.of("DJF"))

        val DKK = Currency(JsonField.of("DKK"))

        val DOP = Currency(JsonField.of("DOP"))

        val DZD = Currency(JsonField.of("DZD"))

        val EEK = Currency(JsonField.of("EEK"))

        val EGP = Currency(JsonField.of("EGP"))

        val ERN = Currency(JsonField.of("ERN"))

        val ETB = Currency(JsonField.of("ETB"))

        val EUR = Currency(JsonField.of("EUR"))

        val FJD = Currency(JsonField.of("FJD"))

        val FKP = Currency(JsonField.of("FKP"))

        val GBP = Currency(JsonField.of("GBP"))

        val GBX = Currency(JsonField.of("GBX"))

        val GEL = Currency(JsonField.of("GEL"))

        val GGP = Currency(JsonField.of("GGP"))

        val GHS = Currency(JsonField.of("GHS"))

        val GIP = Currency(JsonField.of("GIP"))

        val GMD = Currency(JsonField.of("GMD"))

        val GNF = Currency(JsonField.of("GNF"))

        val GTQ = Currency(JsonField.of("GTQ"))

        val GYD = Currency(JsonField.of("GYD"))

        val HKD = Currency(JsonField.of("HKD"))

        val HNL = Currency(JsonField.of("HNL"))

        val HRK = Currency(JsonField.of("HRK"))

        val HTG = Currency(JsonField.of("HTG"))

        val HUF = Currency(JsonField.of("HUF"))

        val IDR = Currency(JsonField.of("IDR"))

        val ILS = Currency(JsonField.of("ILS"))

        val IMP = Currency(JsonField.of("IMP"))

        val INR = Currency(JsonField.of("INR"))

        val IQD = Currency(JsonField.of("IQD"))

        val IRR = Currency(JsonField.of("IRR"))

        val ISK = Currency(JsonField.of("ISK"))

        val JEP = Currency(JsonField.of("JEP"))

        val JMD = Currency(JsonField.of("JMD"))

        val JOD = Currency(JsonField.of("JOD"))

        val JPY = Currency(JsonField.of("JPY"))

        val KES = Currency(JsonField.of("KES"))

        val KGS = Currency(JsonField.of("KGS"))

        val KHR = Currency(JsonField.of("KHR"))

        val KMF = Currency(JsonField.of("KMF"))

        val KPW = Currency(JsonField.of("KPW"))

        val KRW = Currency(JsonField.of("KRW"))

        val KWD = Currency(JsonField.of("KWD"))

        val KYD = Currency(JsonField.of("KYD"))

        val KZT = Currency(JsonField.of("KZT"))

        val LAK = Currency(JsonField.of("LAK"))

        val LBP = Currency(JsonField.of("LBP"))

        val LKR = Currency(JsonField.of("LKR"))

        val LRD = Currency(JsonField.of("LRD"))

        val LSL = Currency(JsonField.of("LSL"))

        val LTL = Currency(JsonField.of("LTL"))

        val LVL = Currency(JsonField.of("LVL"))

        val LYD = Currency(JsonField.of("LYD"))

        val MAD = Currency(JsonField.of("MAD"))

        val MDL = Currency(JsonField.of("MDL"))

        val MGA = Currency(JsonField.of("MGA"))

        val MKD = Currency(JsonField.of("MKD"))

        val MMK = Currency(JsonField.of("MMK"))

        val MNT = Currency(JsonField.of("MNT"))

        val MOP = Currency(JsonField.of("MOP"))

        val MRO = Currency(JsonField.of("MRO"))

        val MRU = Currency(JsonField.of("MRU"))

        val MTL = Currency(JsonField.of("MTL"))

        val MUR = Currency(JsonField.of("MUR"))

        val MVR = Currency(JsonField.of("MVR"))

        val MWK = Currency(JsonField.of("MWK"))

        val MXN = Currency(JsonField.of("MXN"))

        val MYR = Currency(JsonField.of("MYR"))

        val MZN = Currency(JsonField.of("MZN"))

        val NAD = Currency(JsonField.of("NAD"))

        val NGN = Currency(JsonField.of("NGN"))

        val NIO = Currency(JsonField.of("NIO"))

        val NOK = Currency(JsonField.of("NOK"))

        val NPR = Currency(JsonField.of("NPR"))

        val NZD = Currency(JsonField.of("NZD"))

        val OMR = Currency(JsonField.of("OMR"))

        val PAB = Currency(JsonField.of("PAB"))

        val PEN = Currency(JsonField.of("PEN"))

        val PGK = Currency(JsonField.of("PGK"))

        val PHP = Currency(JsonField.of("PHP"))

        val PKR = Currency(JsonField.of("PKR"))

        val PLN = Currency(JsonField.of("PLN"))

        val PYG = Currency(JsonField.of("PYG"))

        val QAR = Currency(JsonField.of("QAR"))

        val RON = Currency(JsonField.of("RON"))

        val RSD = Currency(JsonField.of("RSD"))

        val RUB = Currency(JsonField.of("RUB"))

        val RWF = Currency(JsonField.of("RWF"))

        val SAR = Currency(JsonField.of("SAR"))

        val SBD = Currency(JsonField.of("SBD"))

        val SCR = Currency(JsonField.of("SCR"))

        val SDG = Currency(JsonField.of("SDG"))

        val SEK = Currency(JsonField.of("SEK"))

        val SGD = Currency(JsonField.of("SGD"))

        val SHP = Currency(JsonField.of("SHP"))

        val SKK = Currency(JsonField.of("SKK"))

        val SLL = Currency(JsonField.of("SLL"))

        val SOS = Currency(JsonField.of("SOS"))

        val SRD = Currency(JsonField.of("SRD"))

        val SSP = Currency(JsonField.of("SSP"))

        val STD = Currency(JsonField.of("STD"))

        val SVC = Currency(JsonField.of("SVC"))

        val SYP = Currency(JsonField.of("SYP"))

        val SZL = Currency(JsonField.of("SZL"))

        val THB = Currency(JsonField.of("THB"))

        val TJS = Currency(JsonField.of("TJS"))

        val TMM = Currency(JsonField.of("TMM"))

        val TMT = Currency(JsonField.of("TMT"))

        val TND = Currency(JsonField.of("TND"))

        val TOP = Currency(JsonField.of("TOP"))

        val TRY = Currency(JsonField.of("TRY"))

        val TTD = Currency(JsonField.of("TTD"))

        val TWD = Currency(JsonField.of("TWD"))

        val TZS = Currency(JsonField.of("TZS"))

        val UAH = Currency(JsonField.of("UAH"))

        val UGX = Currency(JsonField.of("UGX"))

        val USD = Currency(JsonField.of("USD"))

        val UYU = Currency(JsonField.of("UYU"))

        val UZS = Currency(JsonField.of("UZS"))

        val VEF = Currency(JsonField.of("VEF"))

        val VES = Currency(JsonField.of("VES"))

        val VND = Currency(JsonField.of("VND"))

        val VUV = Currency(JsonField.of("VUV"))

        val WST = Currency(JsonField.of("WST"))

        val XAF = Currency(JsonField.of("XAF"))

        val XAG = Currency(JsonField.of("XAG"))

        val XAU = Currency(JsonField.of("XAU"))

        val XBA = Currency(JsonField.of("XBA"))

        val XBB = Currency(JsonField.of("XBB"))

        val XBC = Currency(JsonField.of("XBC"))

        val XBD = Currency(JsonField.of("XBD"))

        val XCD = Currency(JsonField.of("XCD"))

        val XDR = Currency(JsonField.of("XDR"))

        val XFU = Currency(JsonField.of("XFU"))

        val XOF = Currency(JsonField.of("XOF"))

        val XPD = Currency(JsonField.of("XPD"))

        val XPF = Currency(JsonField.of("XPF"))

        val XPT = Currency(JsonField.of("XPT"))

        val XTS = Currency(JsonField.of("XTS"))

        val YER = Currency(JsonField.of("YER"))

        val ZAR = Currency(JsonField.of("ZAR"))

        val ZMK = Currency(JsonField.of("ZMK"))

        val ZMW = Currency(JsonField.of("ZMW"))

        val ZWD = Currency(JsonField.of("ZWD"))

        val ZWL = Currency(JsonField.of("ZWL"))

        val ZWN = Currency(JsonField.of("ZWN"))

        val ZWR = Currency(JsonField.of("ZWR"))

        fun of(value: String) = Currency(JsonField.of(value))
    }

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
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
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
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
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
        _UNKNOWN,
    }

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
            QAR -> Value.QAR
            RON -> Value.RON
            RSD -> Value.RSD
            RUB -> Value.RUB
            RWF -> Value.RWF
            SAR -> Value.SAR
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
            QAR -> Known.QAR
            RON -> Known.RON
            RSD -> Known.RSD
            RUB -> Known.RUB
            RWF -> Known.RWF
            SAR -> Known.SAR
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

    fun asString(): String = _value().asStringOrThrow()
}
