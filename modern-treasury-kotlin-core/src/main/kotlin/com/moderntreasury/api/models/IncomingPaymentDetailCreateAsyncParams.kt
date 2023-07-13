package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class IncomingPaymentDetailCreateAsyncParams
constructor(
    private val type: Type?,
    private val direction: Direction?,
    private val amount: Long?,
    private val currency: Currency?,
    private val internalAccountId: String?,
    private val virtualAccountId: String?,
    private val asOfDate: LocalDate?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun type(): Type? = type

    fun direction(): Direction? = direction

    fun amount(): Long? = amount

    fun currency(): Currency? = currency

    fun internalAccountId(): String? = internalAccountId

    fun virtualAccountId(): String? = virtualAccountId

    fun asOfDate(): LocalDate? = asOfDate

    internal fun getBody(): IncomingPaymentDetailCreateAsyncBody {
        return IncomingPaymentDetailCreateAsyncBody(
            type,
            direction,
            amount,
            currency,
            internalAccountId,
            virtualAccountId,
            asOfDate,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = IncomingPaymentDetailCreateAsyncBody.Builder::class)
    @NoAutoDetect
    class IncomingPaymentDetailCreateAsyncBody
    internal constructor(
        private val type: Type?,
        private val direction: Direction?,
        private val amount: Long?,
        private val currency: Currency?,
        private val internalAccountId: String?,
        private val virtualAccountId: String?,
        private val asOfDate: LocalDate?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** One of `ach`, `wire`, `check`. */
        @JsonProperty("type") fun type(): Type? = type

        /** One of `credit`, `debit`. */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** The ID of one of your internal accounts. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        @JsonProperty("virtual_account_id") fun virtualAccountId(): String? = virtualAccountId

        /** Defaults to today. */
        @JsonProperty("as_of_date") fun asOfDate(): LocalDate? = asOfDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IncomingPaymentDetailCreateAsyncBody &&
                this.type == other.type &&
                this.direction == other.direction &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.internalAccountId == other.internalAccountId &&
                this.virtualAccountId == other.virtualAccountId &&
                this.asOfDate == other.asOfDate &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        direction,
                        amount,
                        currency,
                        internalAccountId,
                        virtualAccountId,
                        asOfDate,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "IncomingPaymentDetailCreateAsyncBody{type=$type, direction=$direction, amount=$amount, currency=$currency, internalAccountId=$internalAccountId, virtualAccountId=$virtualAccountId, asOfDate=$asOfDate, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var direction: Direction? = null
            private var amount: Long? = null
            private var currency: Currency? = null
            private var internalAccountId: String? = null
            private var virtualAccountId: String? = null
            private var asOfDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                incomingPaymentDetailCreateAsyncBody: IncomingPaymentDetailCreateAsyncBody
            ) = apply {
                this.type = incomingPaymentDetailCreateAsyncBody.type
                this.direction = incomingPaymentDetailCreateAsyncBody.direction
                this.amount = incomingPaymentDetailCreateAsyncBody.amount
                this.currency = incomingPaymentDetailCreateAsyncBody.currency
                this.internalAccountId = incomingPaymentDetailCreateAsyncBody.internalAccountId
                this.virtualAccountId = incomingPaymentDetailCreateAsyncBody.virtualAccountId
                this.asOfDate = incomingPaymentDetailCreateAsyncBody.asOfDate
                additionalProperties(incomingPaymentDetailCreateAsyncBody.additionalProperties)
            }

            /** One of `ach`, `wire`, `check`. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** One of `credit`, `debit`. */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The ID of one of your internal accounts. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * An optional parameter to associate the incoming payment detail to a virtual account.
             */
            @JsonProperty("virtual_account_id")
            fun virtualAccountId(virtualAccountId: String) = apply {
                this.virtualAccountId = virtualAccountId
            }

            /** Defaults to today. */
            @JsonProperty("as_of_date")
            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

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

            fun build(): IncomingPaymentDetailCreateAsyncBody =
                IncomingPaymentDetailCreateAsyncBody(
                    type,
                    direction,
                    amount,
                    currency,
                    internalAccountId,
                    virtualAccountId,
                    asOfDate,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IncomingPaymentDetailCreateAsyncParams &&
            this.type == other.type &&
            this.direction == other.direction &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.internalAccountId == other.internalAccountId &&
            this.virtualAccountId == other.virtualAccountId &&
            this.asOfDate == other.asOfDate &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            type,
            direction,
            amount,
            currency,
            internalAccountId,
            virtualAccountId,
            asOfDate,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "IncomingPaymentDetailCreateAsyncParams{type=$type, direction=$direction, amount=$amount, currency=$currency, internalAccountId=$internalAccountId, virtualAccountId=$virtualAccountId, asOfDate=$asOfDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var type: Type? = null
        private var direction: Direction? = null
        private var amount: Long? = null
        private var currency: Currency? = null
        private var internalAccountId: String? = null
        private var virtualAccountId: String? = null
        private var asOfDate: LocalDate? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            incomingPaymentDetailCreateAsyncParams: IncomingPaymentDetailCreateAsyncParams
        ) = apply {
            this.type = incomingPaymentDetailCreateAsyncParams.type
            this.direction = incomingPaymentDetailCreateAsyncParams.direction
            this.amount = incomingPaymentDetailCreateAsyncParams.amount
            this.currency = incomingPaymentDetailCreateAsyncParams.currency
            this.internalAccountId = incomingPaymentDetailCreateAsyncParams.internalAccountId
            this.virtualAccountId = incomingPaymentDetailCreateAsyncParams.virtualAccountId
            this.asOfDate = incomingPaymentDetailCreateAsyncParams.asOfDate
            additionalQueryParams(incomingPaymentDetailCreateAsyncParams.additionalQueryParams)
            additionalHeaders(incomingPaymentDetailCreateAsyncParams.additionalHeaders)
            additionalBodyProperties(
                incomingPaymentDetailCreateAsyncParams.additionalBodyProperties
            )
        }

        /** One of `ach`, `wire`, `check`. */
        fun type(type: Type) = apply { this.type = type }

        /** One of `credit`, `debit`. */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** The ID of one of your internal accounts. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(virtualAccountId: String) = apply {
            this.virtualAccountId = virtualAccountId
        }

        /** Defaults to today. */
        fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams(
                type,
                direction,
                amount,
                currency,
                internalAccountId,
                virtualAccountId,
                asOfDate,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = Type(JsonField.of("ach"))

            val BOOK = Type(JsonField.of("book"))

            val CHECK = Type(JsonField.of("check"))

            val EFT = Type(JsonField.of("eft"))

            val INTERAC = Type(JsonField.of("interac"))

            val RTP = Type(JsonField.of("rtp"))

            val SEPA = Type(JsonField.of("sepa"))

            val SIGNET = Type(JsonField.of("signet"))

            val WIRE = Type(JsonField.of("wire"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
        }

        enum class Value {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
