// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.BaseDeserializer
import com.moderntreasury.api.core.BaseSerializer
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(using = ExternalAccountVerifyResponse.Deserializer::class)
@JsonSerialize(using = ExternalAccountVerifyResponse.Serializer::class)
class ExternalAccountVerifyResponse
private constructor(
    private val externalAccount: ExternalAccount? = null,
    private val externalAccountVerificationAttempt: ExternalAccountVerificationAttempt? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun externalAccount(): ExternalAccount? = externalAccount

    fun externalAccountVerificationAttempt(): ExternalAccountVerificationAttempt? =
        externalAccountVerificationAttempt

    fun isExternalAccount(): Boolean = externalAccount != null

    fun isExternalAccountVerificationAttempt(): Boolean = externalAccountVerificationAttempt != null

    fun asExternalAccount(): ExternalAccount = externalAccount.getOrThrow("externalAccount")

    fun asExternalAccountVerificationAttempt(): ExternalAccountVerificationAttempt =
        externalAccountVerificationAttempt.getOrThrow("externalAccountVerificationAttempt")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            externalAccount != null -> visitor.visitExternalAccount(externalAccount)
            externalAccountVerificationAttempt != null ->
                visitor.visitExternalAccountVerificationAttempt(externalAccountVerificationAttempt)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): ExternalAccountVerifyResponse = apply {
        if (!validated) {
            if (externalAccount == null && externalAccountVerificationAttempt == null) {
                throw ModernTreasuryInvalidDataException(
                    "Unknown ExternalAccountVerifyResponse: $_json"
                )
            }
            externalAccount?.validate()
            externalAccountVerificationAttempt?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountVerifyResponse && this.externalAccount == other.externalAccount && this.externalAccountVerificationAttempt == other.externalAccountVerificationAttempt /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalAccount, externalAccountVerificationAttempt) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            externalAccount != null ->
                "ExternalAccountVerifyResponse{externalAccount=$externalAccount}"
            externalAccountVerificationAttempt != null ->
                "ExternalAccountVerifyResponse{externalAccountVerificationAttempt=$externalAccountVerificationAttempt}"
            _json != null -> "ExternalAccountVerifyResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExternalAccountVerifyResponse")
        }
    }

    companion object {

        fun ofExternalAccount(externalAccount: ExternalAccount) =
            ExternalAccountVerifyResponse(externalAccount = externalAccount)

        fun ofExternalAccountVerificationAttempt(
            externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
        ) =
            ExternalAccountVerifyResponse(
                externalAccountVerificationAttempt = externalAccountVerificationAttempt
            )
    }

    interface Visitor<out T> {

        fun visitExternalAccount(externalAccount: ExternalAccount): T

        fun visitExternalAccountVerificationAttempt(
            externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
        ): T

        fun unknown(json: JsonValue?): T {
            throw ModernTreasuryInvalidDataException("Unknown ExternalAccountVerifyResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<ExternalAccountVerifyResponse>(ExternalAccountVerifyResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ExternalAccountVerifyResponse {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<ExternalAccount>()) { it.validate() }
                ?.let {
                    return ExternalAccountVerifyResponse(externalAccount = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ExternalAccountVerificationAttempt>()) {
                    it.validate()
                }
                ?.let {
                    return ExternalAccountVerifyResponse(
                        externalAccountVerificationAttempt = it,
                        _json = json
                    )
                }

            return ExternalAccountVerifyResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<ExternalAccountVerifyResponse>(ExternalAccountVerifyResponse::class) {

        override fun serialize(
            value: ExternalAccountVerifyResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.externalAccount != null -> generator.writeObject(value.externalAccount)
                value.externalAccountVerificationAttempt != null ->
                    generator.writeObject(value.externalAccountVerificationAttempt)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountVerifyResponse")
            }
        }
    }

    @JsonDeserialize(builder = ExternalAccountVerificationAttempt.Builder::class)
    @NoAutoDetect
    class ExternalAccountVerificationAttempt
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val externalAccountId: JsonField<String>,
        private val originatingAccountId: JsonField<String>,
        private val paymentType: JsonField<PaymentType>,
        private val priority: JsonField<Priority>,
        private val status: JsonField<Status>,
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

        /** The ID of the external account. */
        fun externalAccountId(): String = externalAccountId.getRequired("external_account_id")

        /** The ID of the internal account where the micro-deposits originate from. */
        fun originatingAccountId(): String =
            originatingAccountId.getRequired("originating_account_id")

        /** The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`. */
        fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

        /** The priority of the payment. Can be `normal` or `high`. */
        fun priority(): Priority? = priority.getNullable("priority")

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         */
        fun status(): Status = status.getRequired("status")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        /** The ID of the external account. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId() = externalAccountId

        /** The ID of the internal account where the micro-deposits originate from. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId() = originatingAccountId

        /** The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`. */
        @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

        /** The priority of the payment. Can be `normal` or `high`. */
        @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExternalAccountVerificationAttempt = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                externalAccountId()
                originatingAccountId()
                paymentType()
                priority()
                status()
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
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var originatingAccountId: JsonField<String> = JsonMissing.of()
            private var paymentType: JsonField<PaymentType> = JsonMissing.of()
            private var priority: JsonField<Priority> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
            ) = apply {
                this.id = externalAccountVerificationAttempt.id
                this.object_ = externalAccountVerificationAttempt.object_
                this.liveMode = externalAccountVerificationAttempt.liveMode
                this.createdAt = externalAccountVerificationAttempt.createdAt
                this.updatedAt = externalAccountVerificationAttempt.updatedAt
                this.externalAccountId = externalAccountVerificationAttempt.externalAccountId
                this.originatingAccountId = externalAccountVerificationAttempt.originatingAccountId
                this.paymentType = externalAccountVerificationAttempt.paymentType
                this.priority = externalAccountVerificationAttempt.priority
                this.status = externalAccountVerificationAttempt.status
                additionalProperties(externalAccountVerificationAttempt.additionalProperties)
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

            /** The ID of the external account. */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /** The ID of the external account. */
            @JsonProperty("external_account_id")
            @ExcludeMissing
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /** The ID of the internal account where the micro-deposits originate from. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /** The ID of the internal account where the micro-deposits originate from. */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`.
             */
            fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

            /**
             * The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`.
             */
            @JsonProperty("payment_type")
            @ExcludeMissing
            fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                this.paymentType = paymentType
            }

            /** The priority of the payment. Can be `normal` or `high`. */
            fun priority(priority: Priority) = priority(JsonField.of(priority))

            /** The priority of the payment. Can be `normal` or `high`. */
            @JsonProperty("priority")
            @ExcludeMissing
            fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

            /**
             * The status of the verification attempt. Can be `pending_verification`, `verified`,
             * `failed`, or `cancelled`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * The status of the verification attempt. Can be `pending_verification`, `verified`,
             * `failed`, or `cancelled`.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): ExternalAccountVerificationAttempt =
                ExternalAccountVerificationAttempt(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    externalAccountId,
                    originatingAccountId,
                    paymentType,
                    priority,
                    status,
                    additionalProperties.toUnmodifiable(),
                )
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

                return /* spotless:off */ other is PaymentType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACH = PaymentType(JsonField.of("ach"))

                val AU_BECS = PaymentType(JsonField.of("au_becs"))

                val BACS = PaymentType(JsonField.of("bacs"))

                val BOOK = PaymentType(JsonField.of("book"))

                val CARD = PaymentType(JsonField.of("card"))

                val CHATS = PaymentType(JsonField.of("chats"))

                val CHECK = PaymentType(JsonField.of("check"))

                val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                val DK_NETS = PaymentType(JsonField.of("dk_nets"))

                val EFT = PaymentType(JsonField.of("eft"))

                val HU_ICS = PaymentType(JsonField.of("hu_ics"))

                val INTERAC = PaymentType(JsonField.of("interac"))

                val MASAV = PaymentType(JsonField.of("masav"))

                val MX_CCEN = PaymentType(JsonField.of("mx_ccen"))

                val NEFT = PaymentType(JsonField.of("neft"))

                val NICS = PaymentType(JsonField.of("nics"))

                val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                val PL_ELIXIR = PaymentType(JsonField.of("pl_elixir"))

                val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                val RO_SENT = PaymentType(JsonField.of("ro_sent"))

                val RTP = PaymentType(JsonField.of("rtp"))

                val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                val SEN = PaymentType(JsonField.of("sen"))

                val SEPA = PaymentType(JsonField.of("sepa"))

                val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

                val SIC = PaymentType(JsonField.of("sic"))

                val SIGNET = PaymentType(JsonField.of("signet"))

                val SKNBI = PaymentType(JsonField.of("sknbi"))

                val WIRE = PaymentType(JsonField.of("wire"))

                val ZENGIN = PaymentType(JsonField.of("zengin"))

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

        class Priority
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Priority && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val HIGH = Priority(JsonField.of("high"))

                val NORMAL = Priority(JsonField.of("normal"))

                fun of(value: String) = Priority(JsonField.of(value))
            }

            enum class Known {
                HIGH,
                NORMAL,
            }

            enum class Value {
                HIGH,
                NORMAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    HIGH -> Value.HIGH
                    NORMAL -> Value.NORMAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    HIGH -> Known.HIGH
                    NORMAL -> Known.NORMAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val CANCELLED = Status(JsonField.of("cancelled"))

                val FAILED = Status(JsonField.of("failed"))

                val PENDING_VERIFICATION = Status(JsonField.of("pending_verification"))

                val VERIFIED = Status(JsonField.of("verified"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                CANCELLED,
                FAILED,
                PENDING_VERIFICATION,
                VERIFIED,
            }

            enum class Value {
                CANCELLED,
                FAILED,
                PENDING_VERIFICATION,
                VERIFIED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CANCELLED -> Value.CANCELLED
                    FAILED -> Value.FAILED
                    PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                    VERIFIED -> Value.VERIFIED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CANCELLED -> Known.CANCELLED
                    FAILED -> Known.FAILED
                    PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                    VERIFIED -> Known.VERIFIED
                    else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountVerificationAttempt && this.id == other.id && this.object_ == other.object_ && this.liveMode == other.liveMode && this.createdAt == other.createdAt && this.updatedAt == other.updatedAt && this.externalAccountId == other.externalAccountId && this.originatingAccountId == other.originatingAccountId && this.paymentType == other.paymentType && this.priority == other.priority && this.status == other.status && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, object_, liveMode, createdAt, updatedAt, externalAccountId, originatingAccountId, paymentType, priority, status, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalAccountVerificationAttempt{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, externalAccountId=$externalAccountId, originatingAccountId=$originatingAccountId, paymentType=$paymentType, priority=$priority, status=$status, additionalProperties=$additionalProperties}"
    }
}
