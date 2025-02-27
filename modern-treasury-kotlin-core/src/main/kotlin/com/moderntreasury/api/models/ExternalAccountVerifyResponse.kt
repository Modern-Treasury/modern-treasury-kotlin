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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(using = ExternalAccountVerifyResponse.Deserializer::class)
@JsonSerialize(using = ExternalAccountVerifyResponse.Serializer::class)
class ExternalAccountVerifyResponse
private constructor(
    private val externalAccount: ExternalAccount? = null,
    private val verificationAttempt: ExternalAccountVerificationAttempt? = null,
    private val _json: JsonValue? = null,
) {

    fun externalAccount(): ExternalAccount? = externalAccount

    fun verificationAttempt(): ExternalAccountVerificationAttempt? = verificationAttempt

    fun isExternalAccount(): Boolean = externalAccount != null

    fun isVerificationAttempt(): Boolean = verificationAttempt != null

    fun asExternalAccount(): ExternalAccount = externalAccount.getOrThrow("externalAccount")

    fun asVerificationAttempt(): ExternalAccountVerificationAttempt =
        verificationAttempt.getOrThrow("verificationAttempt")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            externalAccount != null -> visitor.visitExternalAccount(externalAccount)
            verificationAttempt != null -> visitor.visitVerificationAttempt(verificationAttempt)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): ExternalAccountVerifyResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitExternalAccount(externalAccount: ExternalAccount) {
                    externalAccount.validate()
                }

                override fun visitVerificationAttempt(
                    verificationAttempt: ExternalAccountVerificationAttempt
                ) {
                    verificationAttempt.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountVerifyResponse && externalAccount == other.externalAccount && verificationAttempt == other.verificationAttempt /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccount, verificationAttempt) /* spotless:on */

    override fun toString(): String =
        when {
            externalAccount != null ->
                "ExternalAccountVerifyResponse{externalAccount=$externalAccount}"
            verificationAttempt != null ->
                "ExternalAccountVerifyResponse{verificationAttempt=$verificationAttempt}"
            _json != null -> "ExternalAccountVerifyResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExternalAccountVerifyResponse")
        }

    companion object {

        fun ofExternalAccount(externalAccount: ExternalAccount) =
            ExternalAccountVerifyResponse(externalAccount = externalAccount)

        fun ofVerificationAttempt(verificationAttempt: ExternalAccountVerificationAttempt) =
            ExternalAccountVerifyResponse(verificationAttempt = verificationAttempt)
    }

    /**
     * An interface that defines how to map each variant of [ExternalAccountVerifyResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitExternalAccount(externalAccount: ExternalAccount): T

        fun visitVerificationAttempt(verificationAttempt: ExternalAccountVerificationAttempt): T

        /**
         * Maps an unknown variant of [ExternalAccountVerifyResponse] to a value of type [T].
         *
         * An instance of [ExternalAccountVerifyResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws ModernTreasuryInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ModernTreasuryInvalidDataException("Unknown ExternalAccountVerifyResponse: $json")
        }
    }

    internal class Deserializer :
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
                    return ExternalAccountVerifyResponse(verificationAttempt = it, _json = json)
                }

            return ExternalAccountVerifyResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<ExternalAccountVerifyResponse>(ExternalAccountVerifyResponse::class) {

        override fun serialize(
            value: ExternalAccountVerifyResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.externalAccount != null -> generator.writeObject(value.externalAccount)
                value.verificationAttempt != null ->
                    generator.writeObject(value.verificationAttempt)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountVerifyResponse")
            }
        }
    }

    @NoAutoDetect
    class ExternalAccountVerificationAttempt
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        private val externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        private val originatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_type")
        @ExcludeMissing
        private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Priority> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The ID of the external account. */
        fun externalAccountId(): String = externalAccountId.getRequired("external_account_id")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

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

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The ID of the external account. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId(): JsonField<String> = externalAccountId

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /** The ID of the internal account where the micro-deposits originate from. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): JsonField<String> = originatingAccountId

        /** The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`. */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

        /** The priority of the payment. Can be `normal` or `high`. */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Priority> = priority

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalAccountVerificationAttempt = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            externalAccountId()
            liveMode()
            object_()
            originatingAccountId()
            paymentType()
            priority()
            status()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ExternalAccountVerificationAttempt]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var externalAccountId: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var originatingAccountId: JsonField<String>? = null
            private var paymentType: JsonField<PaymentType>? = null
            private var priority: JsonField<Priority>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
            ) = apply {
                id = externalAccountVerificationAttempt.id
                createdAt = externalAccountVerificationAttempt.createdAt
                externalAccountId = externalAccountVerificationAttempt.externalAccountId
                liveMode = externalAccountVerificationAttempt.liveMode
                object_ = externalAccountVerificationAttempt.object_
                originatingAccountId = externalAccountVerificationAttempt.originatingAccountId
                paymentType = externalAccountVerificationAttempt.paymentType
                priority = externalAccountVerificationAttempt.priority
                status = externalAccountVerificationAttempt.status
                updatedAt = externalAccountVerificationAttempt.updatedAt
                additionalProperties =
                    externalAccountVerificationAttempt.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The ID of the external account. */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /** The ID of the external account. */
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
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

            /** The ID of the internal account where the micro-deposits originate from. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /** The ID of the internal account where the micro-deposits originate from. */
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
            fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                this.paymentType = paymentType
            }

            /** The priority of the payment. Can be `normal` or `high`. */
            fun priority(priority: Priority?) = priority(JsonField.ofNullable(priority))

            /** The priority of the payment. Can be `normal` or `high`. */
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
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): ExternalAccountVerificationAttempt =
                ExternalAccountVerificationAttempt(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("externalAccountId", externalAccountId),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("originatingAccountId", originatingAccountId),
                    checkRequired("paymentType", paymentType),
                    checkRequired("priority", priority),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`. */
        class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
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

            /** An enum containing [PaymentType]'s known values. */
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

            /**
             * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [PaymentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The priority of the payment. Can be `normal` or `high`. */
        class Priority @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val HIGH = of("high")

                val NORMAL = of("normal")

                fun of(value: String) = Priority(JsonField.of(value))
            }

            /** An enum containing [Priority]'s known values. */
            enum class Known {
                HIGH,
                NORMAL,
            }

            /**
             * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Priority] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HIGH,
                NORMAL,
                /**
                 * An enum member indicating that [Priority] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    HIGH -> Value.HIGH
                    NORMAL -> Value.NORMAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    HIGH -> Known.HIGH
                    NORMAL -> Known.NORMAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CANCELLED = of("cancelled")

                val FAILED = of("failed")

                val PENDING_VERIFICATION = of("pending_verification")

                val VERIFIED = of("verified")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CANCELLED,
                FAILED,
                PENDING_VERIFICATION,
                VERIFIED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CANCELLED,
                FAILED,
                PENDING_VERIFICATION,
                VERIFIED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CANCELLED -> Value.CANCELLED
                    FAILED -> Value.FAILED
                    PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                    VERIFIED -> Value.VERIFIED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CANCELLED -> Known.CANCELLED
                    FAILED -> Known.FAILED
                    PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                    VERIFIED -> Known.VERIFIED
                    else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountVerificationAttempt && id == other.id && createdAt == other.createdAt && externalAccountId == other.externalAccountId && liveMode == other.liveMode && object_ == other.object_ && originatingAccountId == other.originatingAccountId && paymentType == other.paymentType && priority == other.priority && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, externalAccountId, liveMode, object_, originatingAccountId, paymentType, priority, status, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountVerificationAttempt{id=$id, createdAt=$createdAt, externalAccountId=$externalAccountId, liveMode=$liveMode, object_=$object_, originatingAccountId=$originatingAccountId, paymentType=$paymentType, priority=$priority, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }
}
