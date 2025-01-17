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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class RoutingDetail
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bank_address")
    @ExcludeMissing
    private val bankAddress: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("bank_name")
    @ExcludeMissing
    private val bankName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_type")
    @ExcludeMissing
    private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    private val routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun bankAddress(): Address? = bankAddress.getNullable("bank_address")

    /** The name of the bank. */
    fun bankName(): String = bankName.getRequired("bank_name")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     */
    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

    /** The routing number of the bank. */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     */
    fun routingNumberType(): RoutingNumberType =
        routingNumberType.getRequired("routing_number_type")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("bank_address")
    @ExcludeMissing
    fun _bankAddress(): JsonField<Address> = bankAddress

    /** The name of the bank. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     */
    @JsonProperty("payment_type")
    @ExcludeMissing
    fun _paymentType(): JsonField<PaymentType> = paymentType

    /** The routing number of the bank. */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     */
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RoutingDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        bankAddress()?.validate()
        bankName()
        createdAt()
        discardedAt()
        liveMode()
        object_()
        paymentType()
        routingNumber()
        routingNumberType()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var bankAddress: JsonField<Address>? = null
        private var bankName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var paymentType: JsonField<PaymentType>? = null
        private var routingNumber: JsonField<String>? = null
        private var routingNumberType: JsonField<RoutingNumberType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routingDetail: RoutingDetail) = apply {
            id = routingDetail.id
            bankAddress = routingDetail.bankAddress
            bankName = routingDetail.bankName
            createdAt = routingDetail.createdAt
            discardedAt = routingDetail.discardedAt
            liveMode = routingDetail.liveMode
            object_ = routingDetail.object_
            paymentType = routingDetail.paymentType
            routingNumber = routingDetail.routingNumber
            routingNumberType = routingDetail.routingNumberType
            updatedAt = routingDetail.updatedAt
            additionalProperties = routingDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun bankAddress(bankAddress: Address?) = bankAddress(JsonField.ofNullable(bankAddress))

        fun bankAddress(bankAddress: JsonField<Address>) = apply { this.bankAddress = bankAddress }

        /** The name of the bank. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the bank. */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        fun paymentType(paymentType: PaymentType?) = paymentType(JsonField.ofNullable(paymentType))

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
            this.paymentType = paymentType
        }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number of the bank. */
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
        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
            this.routingNumberType = routingNumberType
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): RoutingDetail =
            RoutingDetail(
                checkRequired("id", id),
                checkRequired("bankAddress", bankAddress),
                checkRequired("bankName", bankName),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("paymentType", paymentType),
                checkRequired("routingNumber", routingNumber),
                checkRequired("routingNumberType", routingNumberType),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Address
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        fun object_(): String = object_.getRequired("object")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            createdAt()
            line1()
            line2()
            liveMode()
            locality()
            object_()
            postalCode()
            region()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var locality: JsonField<String>? = null
            private var object_: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(address: Address) = apply {
                id = address.id
                country = address.country
                createdAt = address.createdAt
                line1 = address.line1
                line2 = address.line2
                liveMode = address.liveMode
                locality = address.locality
                object_ = address.object_
                postalCode = address.postalCode
                region = address.region
                updatedAt = address.updatedAt
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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

            fun build(): Address =
                Address(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("createdAt", createdAt),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("liveMode", liveMode),
                    checkRequired("locality", locality),
                    checkRequired("object_", object_),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && id == other.id && country == other.country && createdAt == other.createdAt && line1 == other.line1 && line2 == other.line2 && liveMode == other.liveMode && locality == other.locality && object_ == other.object_ && postalCode == other.postalCode && region == other.region && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, country, createdAt, line1, line2, liveMode, locality, object_, postalCode, region, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{id=$id, country=$country, createdAt=$createdAt, line1=$line1, line2=$line2, liveMode=$liveMode, locality=$locality, object_=$object_, postalCode=$postalCode, region=$region, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     */
    class PaymentType
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     */
    class RoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingDetail && id == other.id && bankAddress == other.bankAddress && bankName == other.bankName && createdAt == other.createdAt && discardedAt == other.discardedAt && liveMode == other.liveMode && object_ == other.object_ && paymentType == other.paymentType && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, bankAddress, bankName, createdAt, discardedAt, liveMode, object_, paymentType, routingNumber, routingNumberType, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingDetail{id=$id, bankAddress=$bankAddress, bankName=$bankName, createdAt=$createdAt, discardedAt=$discardedAt, liveMode=$liveMode, object_=$object_, paymentType=$paymentType, routingNumber=$routingNumber, routingNumberType=$routingNumberType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
