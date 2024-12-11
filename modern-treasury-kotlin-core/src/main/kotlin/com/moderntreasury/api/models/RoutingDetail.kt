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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = RoutingDetail.Builder::class)
@NoAutoDetect
class RoutingDetail
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val routingNumber: JsonField<String>,
    private val routingNumberType: JsonField<RoutingNumberType>,
    private val paymentType: JsonField<PaymentType>,
    private val bankName: JsonField<String>,
    private val bankAddress: JsonField<Address>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The routing number of the bank. */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     */
    fun routingNumberType(): RoutingNumberType =
        routingNumberType.getRequired("routing_number_type")

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     */
    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

    /** The name of the bank. */
    fun bankName(): String = bankName.getRequired("bank_name")

    fun bankAddress(): Address? = bankAddress.getNullable("bank_address")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** The routing number of the bank. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     */
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    fun _routingNumberType() = routingNumberType

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     */
    @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

    /** The name of the bank. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName() = bankName

    @JsonProperty("bank_address") @ExcludeMissing fun _bankAddress() = bankAddress

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RoutingDetail = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            routingNumber()
            routingNumberType()
            paymentType()
            bankName()
            bankAddress()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of()
        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var bankAddress: JsonField<Address> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routingDetail: RoutingDetail) = apply {
            this.id = routingDetail.id
            this.object_ = routingDetail.object_
            this.liveMode = routingDetail.liveMode
            this.createdAt = routingDetail.createdAt
            this.updatedAt = routingDetail.updatedAt
            this.discardedAt = routingDetail.discardedAt
            this.routingNumber = routingDetail.routingNumber
            this.routingNumberType = routingDetail.routingNumberType
            this.paymentType = routingDetail.paymentType
            this.bankName = routingDetail.bankName
            this.bankAddress = routingDetail.bankAddress
            additionalProperties(routingDetail.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number of the bank. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        fun routingNumberType(routingNumberType: RoutingNumberType) =
            routingNumberType(JsonField.of(routingNumberType))

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
            this.routingNumberType = routingNumberType
        }

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
            this.paymentType = paymentType
        }

        /** The name of the bank. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the bank. */
        @JsonProperty("bank_name")
        @ExcludeMissing
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        fun bankAddress(bankAddress: Address) = bankAddress(JsonField.of(bankAddress))

        @JsonProperty("bank_address")
        @ExcludeMissing
        fun bankAddress(bankAddress: JsonField<Address>) = apply { this.bankAddress = bankAddress }

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

        fun build(): RoutingDetail =
            RoutingDetail(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                routingNumber,
                routingNumberType,
                paymentType,
                bankName,
                bankAddress,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Address.Builder::class)
    @NoAutoDetect
    class Address
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val region: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Address = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(address: Address) = apply {
                this.id = address.id
                this.object_ = address.object_
                this.liveMode = address.liveMode
                this.createdAt = address.createdAt
                this.updatedAt = address.updatedAt
                this.line1 = address.line1
                this.line2 = address.line2
                this.locality = address.locality
                this.region = address.region
                this.postalCode = address.postalCode
                this.country = address.country
                additionalProperties(address.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            @JsonProperty("object")
            @ExcludeMissing
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            @JsonProperty("locality")
            @ExcludeMissing
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            @JsonProperty("region")
            @ExcludeMissing
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            fun build(): Address =
                Address(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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

            fun of(value: String) = PaymentType(JsonField.of(value))
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
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class RoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ABA = of("aba")

            val AU_BSB = of("au_bsb")

            val BR_CODIGO = of("br_codigo")

            val CA_CPA = of("ca_cpa")

            val CHIPS = of("chips")

            val CNAPS = of("cnaps")

            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

            val GB_SORT_CODE = of("gb_sort_code")

            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

            val ID_SKNBI_CODE = of("id_sknbi_code")

            val IN_IFSC = of("in_ifsc")

            val JP_ZENGIN_CODE = of("jp_zengin_code")

            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

            val MY_BRANCH_CODE = of("my_branch_code")

            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            val SWIFT = of("swift")

            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

            fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        enum class Known {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
        }

        enum class Value {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                BR_CODIGO -> Value.BR_CODIGO
                CA_CPA -> Value.CA_CPA
                CHIPS -> Value.CHIPS
                CNAPS -> Value.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Value.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                IN_IFSC -> Value.IN_IFSC
                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Value.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                BR_CODIGO -> Known.BR_CODIGO
                CA_CPA -> Known.CA_CPA
                CHIPS -> Known.CHIPS
                CNAPS -> Known.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Known.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                IN_IFSC -> Known.IN_IFSC
                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown RoutingNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingDetail && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && bankName == other.bankName && bankAddress == other.bankAddress && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, routingNumber, routingNumberType, paymentType, bankName, bankAddress, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, bankName=$bankName, bankAddress=$bankAddress, additionalProperties=$additionalProperties}"
}
