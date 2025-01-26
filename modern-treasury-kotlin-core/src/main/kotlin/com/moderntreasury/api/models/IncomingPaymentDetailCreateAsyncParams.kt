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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** Simulate Incoming Payment Detail */
class IncomingPaymentDetailCreateAsyncParams
private constructor(
    private val body: IncomingPaymentDetailCreateAsyncBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long? = body.amount()

    /** Defaults to today. */
    fun asOfDate(): LocalDate? = body.asOfDate()

    /** Defaults to the currency of the originating account. */
    fun currency(): Currency? = body.currency()

    /** Defaults to a random description. */
    fun description(): String? = body.description()

    /** One of `credit`, `debit`. */
    fun direction(): Direction? = body.direction()

    /** The ID of one of your internal accounts. */
    fun internalAccountId(): String? = body.internalAccountId()

    /** One of `ach`, `wire`, `check`. */
    fun type(): Type? = body.type()

    /** An optional parameter to associate the incoming payment detail to a virtual account. */
    fun virtualAccountId(): String? = body.virtualAccountId()

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun _amount(): JsonField<Long> = body._amount()

    /** Defaults to today. */
    fun _asOfDate(): JsonField<LocalDate> = body._asOfDate()

    /** Defaults to the currency of the originating account. */
    fun _currency(): JsonField<Currency> = body._currency()

    /** Defaults to a random description. */
    fun _description(): JsonField<String> = body._description()

    /** One of `credit`, `debit`. */
    fun _direction(): JsonField<Direction> = body._direction()

    /** The ID of one of your internal accounts. */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /** One of `ach`, `wire`, `check`. */
    fun _type(): JsonField<Type> = body._type()

    /** An optional parameter to associate the incoming payment detail to a virtual account. */
    fun _virtualAccountId(): JsonField<String> = body._virtualAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): IncomingPaymentDetailCreateAsyncBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class IncomingPaymentDetailCreateAsyncBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("as_of_date")
        @ExcludeMissing
        private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        private val internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        private val virtualAccountId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(): Long? = amount.getNullable("amount")

        /** Defaults to today. */
        fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

        /** Defaults to the currency of the originating account. */
        fun currency(): Currency? = currency.getNullable("currency")

        /** Defaults to a random description. */
        fun description(): String? = description.getNullable("description")

        /** One of `credit`, `debit`. */
        fun direction(): Direction? = direction.getNullable("direction")

        /** The ID of one of your internal accounts. */
        fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

        /** One of `ach`, `wire`, `check`. */
        fun type(): Type? = type.getNullable("type")

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(): String? = virtualAccountId.getNullable("virtual_account_id")

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Defaults to today. */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** Defaults to a random description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** One of `credit`, `debit`. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /** The ID of one of your internal accounts. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

        /** One of `ach`, `wire`, `check`. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        fun _virtualAccountId(): JsonField<String> = virtualAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): IncomingPaymentDetailCreateAsyncBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            asOfDate()
            currency()
            description()
            direction()
            internalAccountId()
            type()
            virtualAccountId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var asOfDate: JsonField<LocalDate> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var internalAccountId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var virtualAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                incomingPaymentDetailCreateAsyncBody: IncomingPaymentDetailCreateAsyncBody
            ) = apply {
                amount = incomingPaymentDetailCreateAsyncBody.amount
                asOfDate = incomingPaymentDetailCreateAsyncBody.asOfDate
                currency = incomingPaymentDetailCreateAsyncBody.currency
                description = incomingPaymentDetailCreateAsyncBody.description
                direction = incomingPaymentDetailCreateAsyncBody.direction
                internalAccountId = incomingPaymentDetailCreateAsyncBody.internalAccountId
                type = incomingPaymentDetailCreateAsyncBody.type
                virtualAccountId = incomingPaymentDetailCreateAsyncBody.virtualAccountId
                additionalProperties =
                    incomingPaymentDetailCreateAsyncBody.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Defaults to today. */
            fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

            /** Defaults to today. */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** Defaults to the currency of the originating account. */
            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /** Defaults to the currency of the originating account. */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Defaults to a random description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Defaults to a random description. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** One of `credit`, `debit`. */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /** One of `credit`, `debit`. */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** The ID of one of your internal accounts. */
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

            /** The ID of one of your internal accounts. */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
            }

            /** One of `ach`, `wire`, `check`. */
            fun type(type: Type) = type(JsonField.of(type))

            /** One of `ach`, `wire`, `check`. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * An optional parameter to associate the incoming payment detail to a virtual account.
             */
            fun virtualAccountId(virtualAccountId: String?) =
                virtualAccountId(JsonField.ofNullable(virtualAccountId))

            /**
             * An optional parameter to associate the incoming payment detail to a virtual account.
             */
            fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
                this.virtualAccountId = virtualAccountId
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

            fun build(): IncomingPaymentDetailCreateAsyncBody =
                IncomingPaymentDetailCreateAsyncBody(
                    amount,
                    asOfDate,
                    currency,
                    description,
                    direction,
                    internalAccountId,
                    type,
                    virtualAccountId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IncomingPaymentDetailCreateAsyncBody && amount == other.amount && asOfDate == other.asOfDate && currency == other.currency && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && type == other.type && virtualAccountId == other.virtualAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, currency, description, direction, internalAccountId, type, virtualAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IncomingPaymentDetailCreateAsyncBody{amount=$amount, asOfDate=$asOfDate, currency=$currency, description=$description, direction=$direction, internalAccountId=$internalAccountId, type=$type, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: IncomingPaymentDetailCreateAsyncBody.Builder =
            IncomingPaymentDetailCreateAsyncBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            incomingPaymentDetailCreateAsyncParams: IncomingPaymentDetailCreateAsyncParams
        ) = apply {
            body = incomingPaymentDetailCreateAsyncParams.body.toBuilder()
            additionalHeaders = incomingPaymentDetailCreateAsyncParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                incomingPaymentDetailCreateAsyncParams.additionalQueryParams.toBuilder()
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Defaults to today. */
        fun asOfDate(asOfDate: LocalDate?) = apply { body.asOfDate(asOfDate) }

        /** Defaults to today. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { body.asOfDate(asOfDate) }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** Defaults to a random description. */
        fun description(description: String?) = apply { body.description(description) }

        /** Defaults to a random description. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** One of `credit`, `debit`. */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /** One of `credit`, `debit`. */
        fun direction(direction: JsonField<Direction>) = apply { body.direction(direction) }

        /** The ID of one of your internal accounts. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** The ID of one of your internal accounts. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** One of `ach`, `wire`, `check`. */
        fun type(type: Type) = apply { body.type(type) }

        /** One of `ach`, `wire`, `check`. */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(virtualAccountId: String?) = apply {
            body.virtualAccountId(virtualAccountId)
        }

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
            body.virtualAccountId(virtualAccountId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** One of `credit`, `debit`. */
    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREDIT = of("credit")

            val DEBIT = of("debit")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** One of `ach`, `wire`, `check`. */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            val BOOK = of("book")

            val CHECK = of("check")

            val EFT = of("eft")

            val INTERAC = of("interac")

            val RTP = of("rtp")

            val SEPA = of("sepa")

            val SIGNET = of("signet")

            val WIRE = of("wire")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailCreateAsyncParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailCreateAsyncParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
