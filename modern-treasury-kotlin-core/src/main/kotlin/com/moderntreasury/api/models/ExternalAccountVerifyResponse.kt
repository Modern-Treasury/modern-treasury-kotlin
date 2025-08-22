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
import com.moderntreasury.api.core.allMaxBy
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
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

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            externalAccount != null -> visitor.visitExternalAccount(externalAccount)
            verificationAttempt != null -> visitor.visitVerificationAttempt(verificationAttempt)
            else -> visitor.unknown(_json)
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
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitExternalAccount(externalAccount: ExternalAccount) =
                    externalAccount.validity()

                override fun visitVerificationAttempt(
                    verificationAttempt: ExternalAccountVerificationAttempt
                ) = verificationAttempt.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountVerifyResponse &&
            externalAccount == other.externalAccount &&
            verificationAttempt == other.verificationAttempt
    }

    override fun hashCode(): Int = Objects.hash(externalAccount, verificationAttempt)

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

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ExternalAccount>())?.let {
                            ExternalAccountVerifyResponse(externalAccount = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ExternalAccountVerificationAttempt>())
                            ?.let {
                                ExternalAccountVerifyResponse(
                                    verificationAttempt = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ExternalAccountVerifyResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
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

    class ExternalAccountVerificationAttempt
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val externalAccountId: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val originatingAccountId: JsonField<String>,
        private val paymentType: JsonField<PaymentType>,
        private val priority: JsonField<Priority>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("external_account_id")
            @ExcludeMissing
            externalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            originatingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_type")
            @ExcludeMissing
            paymentType: JsonField<PaymentType> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Priority> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            externalAccountId,
            liveMode,
            object_,
            originatingAccountId,
            paymentType,
            priority,
            status,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The ID of the external account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalAccountId(): String = externalAccountId.getRequired("external_account_id")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun object_(): String = object_.getRequired("object")

        /**
         * The ID of the internal account where the micro-deposits originate from.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingAccountId(): String =
            originatingAccountId.getRequired("originating_account_id")

        /**
         * The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

        /**
         * The priority of the payment. Can be `normal` or `high`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun priority(): Priority? = priority.getNullable("priority")

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [externalAccountId].
         *
         * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId(): JsonField<String> = externalAccountId

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [originatingAccountId].
         *
         * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): JsonField<String> = originatingAccountId

        /**
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Priority> = priority

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ExternalAccountVerificationAttempt].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .externalAccountId()
             * .liveMode()
             * .object_()
             * .originatingAccountId()
             * .paymentType()
             * .priority()
             * .status()
             * .updatedAt()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The ID of the external account. */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /**
             * Sets [Builder.externalAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * Sets [Builder.liveMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The ID of the internal account where the micro-deposits originate from. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /**
             * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatingAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`.
             */
            fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

            /**
             * Sets [Builder.paymentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentType] with a well-typed [PaymentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                this.paymentType = paymentType
            }

            /** The priority of the payment. Can be `normal` or `high`. */
            fun priority(priority: Priority?) = priority(JsonField.ofNullable(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Priority] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

            /**
             * The status of the verification attempt. Can be `pending_verification`, `verified`,
             * `failed`, or `cancelled`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ExternalAccountVerificationAttempt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .externalAccountId()
             * .liveMode()
             * .object_()
             * .originatingAccountId()
             * .paymentType()
             * .priority()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

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
            paymentType().validate()
            priority()?.validate()
            status().validate()
            updatedAt()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (externalAccountId.asKnown() == null) 0 else 1) +
                (if (liveMode.asKnown() == null) 0 else 1) +
                (if (object_.asKnown() == null) 0 else 1) +
                (if (originatingAccountId.asKnown() == null) 0 else 1) +
                (paymentType.asKnown()?.validity() ?: 0) +
                (priority.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

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

                val BASE = of("base")

                val BOOK = of("book")

                val CARD = of("card")

                val CHATS = of("chats")

                val CHECK = of("check")

                val CROSS_BORDER = of("cross_border")

                val DK_NETS = of("dk_nets")

                val EFT = of("eft")

                val ETHEREUM = of("ethereum")

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

                fun of(value: String) = PaymentType(JsonField.of(value))
            }

            /** An enum containing [PaymentType]'s known values. */
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
                BASE,
                BOOK,
                CARD,
                CHATS,
                CHECK,
                CROSS_BORDER,
                DK_NETS,
                EFT,
                ETHEREUM,
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
                    BASE -> Value.BASE
                    BOOK -> Value.BOOK
                    CARD -> Value.CARD
                    CHATS -> Value.CHATS
                    CHECK -> Value.CHECK
                    CROSS_BORDER -> Value.CROSS_BORDER
                    DK_NETS -> Value.DK_NETS
                    EFT -> Value.EFT
                    ETHEREUM -> Value.ETHEREUM
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
                    BASE -> Known.BASE
                    BOOK -> Known.BOOK
                    CARD -> Known.CARD
                    CHATS -> Known.CHATS
                    CHECK -> Known.CHECK
                    CROSS_BORDER -> Known.CROSS_BORDER
                    DK_NETS -> Known.DK_NETS
                    EFT -> Known.EFT
                    ETHEREUM -> Known.ETHEREUM
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

            private var validated: Boolean = false

            fun validate(): PaymentType = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentType && value == other.value
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

            private var validated: Boolean = false

            fun validate(): Priority = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Priority && value == other.value
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

            private var validated: Boolean = false

            fun validate(): Status = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalAccountVerificationAttempt &&
                id == other.id &&
                createdAt == other.createdAt &&
                externalAccountId == other.externalAccountId &&
                liveMode == other.liveMode &&
                object_ == other.object_ &&
                originatingAccountId == other.originatingAccountId &&
                paymentType == other.paymentType &&
                priority == other.priority &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                externalAccountId,
                liveMode,
                object_,
                originatingAccountId,
                paymentType,
                priority,
                status,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountVerificationAttempt{id=$id, createdAt=$createdAt, externalAccountId=$externalAccountId, liveMode=$liveMode, object_=$object_, originatingAccountId=$originatingAccountId, paymentType=$paymentType, priority=$priority, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }
}
