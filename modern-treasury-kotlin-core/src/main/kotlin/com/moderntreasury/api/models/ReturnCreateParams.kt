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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** Create a return. */
class ReturnCreateParams
private constructor(
    private val body: ReturnCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The ID of the object being returned or `null`. */
    fun returnableId(): String? = body.returnableId()

    /** The type of object being returned. Currently, this may only be incoming_payment_detail. */
    fun returnableType(): ReturnableType = body.returnableType()

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     */
    fun additionalInformation(): String? = body.additionalInformation()

    /** The return code. For ACH returns, this is the required ACH return code. */
    fun code(): Code? = body.code()

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     */
    fun dateOfDeath(): LocalDate? = body.dateOfDeath()

    /**
     * An optional description of the reason for the return. This is for internal usage and will not
     * be transmitted to the bank.”
     */
    fun reason(): String? = body.reason()

    /** The ID of the object being returned or `null`. */
    fun _returnableId(): JsonField<String> = body._returnableId()

    /** The type of object being returned. Currently, this may only be incoming_payment_detail. */
    fun _returnableType(): JsonField<ReturnableType> = body._returnableType()

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     */
    fun _additionalInformation(): JsonField<String> = body._additionalInformation()

    /** The return code. For ACH returns, this is the required ACH return code. */
    fun _code(): JsonField<Code> = body._code()

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     */
    fun _dateOfDeath(): JsonField<LocalDate> = body._dateOfDeath()

    /**
     * An optional description of the reason for the return. This is for internal usage and will not
     * be transmitted to the bank.”
     */
    fun _reason(): JsonField<String> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): ReturnCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ReturnCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("returnable_id")
        @ExcludeMissing
        private val returnableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("returnable_type")
        @ExcludeMissing
        private val returnableType: JsonField<ReturnableType> = JsonMissing.of(),
        @JsonProperty("additional_information")
        @ExcludeMissing
        private val additionalInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing private val code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("date_of_death")
        @ExcludeMissing
        private val dateOfDeath: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the object being returned or `null`. */
        fun returnableId(): String? = returnableId.getNullable("returnable_id")

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        fun returnableType(): ReturnableType = returnableType.getRequired("returnable_type")

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(): String? =
            additionalInformation.getNullable("additional_information")

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(): Code? = code.getNullable("code")

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(): LocalDate? = dateOfDeath.getNullable("date_of_death")

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        fun reason(): String? = reason.getNullable("reason")

        /** The ID of the object being returned or `null`. */
        @JsonProperty("returnable_id")
        @ExcludeMissing
        fun _returnableId(): JsonField<String> = returnableId

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        @JsonProperty("returnable_type")
        @ExcludeMissing
        fun _returnableType(): JsonField<ReturnableType> = returnableType

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        @JsonProperty("additional_information")
        @ExcludeMissing
        fun _additionalInformation(): JsonField<String> = additionalInformation

        /** The return code. For ACH returns, this is the required ACH return code. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        @JsonProperty("date_of_death")
        @ExcludeMissing
        fun _dateOfDeath(): JsonField<LocalDate> = dateOfDeath

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ReturnCreateBody = apply {
            if (validated) {
                return@apply
            }

            returnableId()
            returnableType()
            additionalInformation()
            code()
            dateOfDeath()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ReturnCreateBody]. */
        class Builder internal constructor() {

            private var returnableId: JsonField<String>? = null
            private var returnableType: JsonField<ReturnableType>? = null
            private var additionalInformation: JsonField<String> = JsonMissing.of()
            private var code: JsonField<Code> = JsonMissing.of()
            private var dateOfDeath: JsonField<LocalDate> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(returnCreateBody: ReturnCreateBody) = apply {
                returnableId = returnCreateBody.returnableId
                returnableType = returnCreateBody.returnableType
                additionalInformation = returnCreateBody.additionalInformation
                code = returnCreateBody.code
                dateOfDeath = returnCreateBody.dateOfDeath
                reason = returnCreateBody.reason
                additionalProperties = returnCreateBody.additionalProperties.toMutableMap()
            }

            /** The ID of the object being returned or `null`. */
            fun returnableId(returnableId: String?) =
                returnableId(JsonField.ofNullable(returnableId))

            /** The ID of the object being returned or `null`. */
            fun returnableId(returnableId: JsonField<String>) = apply {
                this.returnableId = returnableId
            }

            /**
             * The type of object being returned. Currently, this may only be
             * incoming_payment_detail.
             */
            fun returnableType(returnableType: ReturnableType) =
                returnableType(JsonField.of(returnableType))

            /**
             * The type of object being returned. Currently, this may only be
             * incoming_payment_detail.
             */
            fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
                this.returnableType = returnableType
            }

            /**
             * Some returns may include additional information from the bank. In these cases, this
             * string will be present.
             */
            fun additionalInformation(additionalInformation: String?) =
                additionalInformation(JsonField.ofNullable(additionalInformation))

            /**
             * Some returns may include additional information from the bank. In these cases, this
             * string will be present.
             */
            fun additionalInformation(additionalInformation: JsonField<String>) = apply {
                this.additionalInformation = additionalInformation
            }

            /** The return code. For ACH returns, this is the required ACH return code. */
            fun code(code: Code?) = code(JsonField.ofNullable(code))

            /** The return code. For ACH returns, this is the required ACH return code. */
            fun code(code: JsonField<Code>) = apply { this.code = code }

            /**
             * If the return code is `R14` or `R15` this is the date the deceased counterparty
             * passed away.
             */
            fun dateOfDeath(dateOfDeath: LocalDate?) =
                dateOfDeath(JsonField.ofNullable(dateOfDeath))

            /**
             * If the return code is `R14` or `R15` this is the date the deceased counterparty
             * passed away.
             */
            fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply {
                this.dateOfDeath = dateOfDeath
            }

            /**
             * An optional description of the reason for the return. This is for internal usage and
             * will not be transmitted to the bank.”
             */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * An optional description of the reason for the return. This is for internal usage and
             * will not be transmitted to the bank.”
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): ReturnCreateBody =
                ReturnCreateBody(
                    checkRequired("returnableId", returnableId),
                    checkRequired("returnableType", returnableType),
                    additionalInformation,
                    code,
                    dateOfDeath,
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnCreateBody && returnableId == other.returnableId && returnableType == other.returnableType && additionalInformation == other.additionalInformation && code == other.code && dateOfDeath == other.dateOfDeath && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(returnableId, returnableType, additionalInformation, code, dateOfDeath, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReturnCreateBody{returnableId=$returnableId, returnableType=$returnableType, additionalInformation=$additionalInformation, code=$code, dateOfDeath=$dateOfDeath, reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ReturnCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ReturnCreateBody.Builder = ReturnCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(returnCreateParams: ReturnCreateParams) = apply {
            body = returnCreateParams.body.toBuilder()
            additionalHeaders = returnCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = returnCreateParams.additionalQueryParams.toBuilder()
        }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: String?) = apply { body.returnableId(returnableId) }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: JsonField<String>) = apply {
            body.returnableId(returnableId)
        }

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        fun returnableType(returnableType: ReturnableType) = apply {
            body.returnableType(returnableType)
        }

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
            body.returnableType(returnableType)
        }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: String?) = apply {
            body.additionalInformation(additionalInformation)
        }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            body.additionalInformation(additionalInformation)
        }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: Code?) = apply { body.code(code) }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: JsonField<Code>) = apply { body.code(code) }

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: LocalDate?) = apply { body.dateOfDeath(dateOfDeath) }

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply { body.dateOfDeath(dateOfDeath) }

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        fun reason(reason: String?) = apply { body.reason(reason) }

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        fun reason(reason: JsonField<String>) = apply { body.reason(reason) }

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

        fun build(): ReturnCreateParams =
            ReturnCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of object being returned. Currently, this may only be incoming_payment_detail. */
    class ReturnableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            fun of(value: String) = ReturnableType(JsonField.of(value))
        }

        /** An enum containing [ReturnableType]'s known values. */
        enum class Known {
            INCOMING_PAYMENT_DETAIL
        }

        /**
         * An enum containing [ReturnableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReturnableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            /**
             * An enum member indicating that [ReturnableType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                else -> throw ModernTreasuryInvalidDataException("Unknown ReturnableType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The return code. For ACH returns, this is the required ACH return code. */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val _901 = of("901")

            val _902 = of("902")

            val _903 = of("903")

            val _904 = of("904")

            val _905 = of("905")

            val _907 = of("907")

            val _908 = of("908")

            val _909 = of("909")

            val _910 = of("910")

            val _911 = of("911")

            val _912 = of("912")

            val _914 = of("914")

            val C01 = of("C01")

            val C02 = of("C02")

            val C03 = of("C03")

            val C05 = of("C05")

            val C06 = of("C06")

            val C07 = of("C07")

            val C08 = of("C08")

            val C09 = of("C09")

            val C13 = of("C13")

            val C14 = of("C14")

            val R01 = of("R01")

            val R02 = of("R02")

            val R03 = of("R03")

            val R04 = of("R04")

            val R05 = of("R05")

            val R06 = of("R06")

            val R07 = of("R07")

            val R08 = of("R08")

            val R09 = of("R09")

            val R10 = of("R10")

            val R11 = of("R11")

            val R12 = of("R12")

            val R14 = of("R14")

            val R15 = of("R15")

            val R16 = of("R16")

            val R17 = of("R17")

            val R20 = of("R20")

            val R21 = of("R21")

            val R22 = of("R22")

            val R23 = of("R23")

            val R24 = of("R24")

            val R29 = of("R29")

            val R31 = of("R31")

            val R33 = of("R33")

            val R37 = of("R37")

            val R38 = of("R38")

            val R39 = of("R39")

            val R51 = of("R51")

            val R52 = of("R52")

            val R53 = of("R53")

            val CURRENCYCLOUD = of("currencycloud")

            fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            _901,
            _902,
            _903,
            _904,
            _905,
            _907,
            _908,
            _909,
            _910,
            _911,
            _912,
            _914,
            C01,
            C02,
            C03,
            C05,
            C06,
            C07,
            C08,
            C09,
            C13,
            C14,
            R01,
            R02,
            R03,
            R04,
            R05,
            R06,
            R07,
            R08,
            R09,
            R10,
            R11,
            R12,
            R14,
            R15,
            R16,
            R17,
            R20,
            R21,
            R22,
            R23,
            R24,
            R29,
            R31,
            R33,
            R37,
            R38,
            R39,
            R51,
            R52,
            R53,
            CURRENCYCLOUD,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _901,
            _902,
            _903,
            _904,
            _905,
            _907,
            _908,
            _909,
            _910,
            _911,
            _912,
            _914,
            C01,
            C02,
            C03,
            C05,
            C06,
            C07,
            C08,
            C09,
            C13,
            C14,
            R01,
            R02,
            R03,
            R04,
            R05,
            R06,
            R07,
            R08,
            R09,
            R10,
            R11,
            R12,
            R14,
            R15,
            R16,
            R17,
            R20,
            R21,
            R22,
            R23,
            R24,
            R29,
            R31,
            R33,
            R37,
            R38,
            R39,
            R51,
            R52,
            R53,
            CURRENCYCLOUD,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _901 -> Value._901
                _902 -> Value._902
                _903 -> Value._903
                _904 -> Value._904
                _905 -> Value._905
                _907 -> Value._907
                _908 -> Value._908
                _909 -> Value._909
                _910 -> Value._910
                _911 -> Value._911
                _912 -> Value._912
                _914 -> Value._914
                C01 -> Value.C01
                C02 -> Value.C02
                C03 -> Value.C03
                C05 -> Value.C05
                C06 -> Value.C06
                C07 -> Value.C07
                C08 -> Value.C08
                C09 -> Value.C09
                C13 -> Value.C13
                C14 -> Value.C14
                R01 -> Value.R01
                R02 -> Value.R02
                R03 -> Value.R03
                R04 -> Value.R04
                R05 -> Value.R05
                R06 -> Value.R06
                R07 -> Value.R07
                R08 -> Value.R08
                R09 -> Value.R09
                R10 -> Value.R10
                R11 -> Value.R11
                R12 -> Value.R12
                R14 -> Value.R14
                R15 -> Value.R15
                R16 -> Value.R16
                R17 -> Value.R17
                R20 -> Value.R20
                R21 -> Value.R21
                R22 -> Value.R22
                R23 -> Value.R23
                R24 -> Value.R24
                R29 -> Value.R29
                R31 -> Value.R31
                R33 -> Value.R33
                R37 -> Value.R37
                R38 -> Value.R38
                R39 -> Value.R39
                R51 -> Value.R51
                R52 -> Value.R52
                R53 -> Value.R53
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                _901 -> Known._901
                _902 -> Known._902
                _903 -> Known._903
                _904 -> Known._904
                _905 -> Known._905
                _907 -> Known._907
                _908 -> Known._908
                _909 -> Known._909
                _910 -> Known._910
                _911 -> Known._911
                _912 -> Known._912
                _914 -> Known._914
                C01 -> Known.C01
                C02 -> Known.C02
                C03 -> Known.C03
                C05 -> Known.C05
                C06 -> Known.C06
                C07 -> Known.C07
                C08 -> Known.C08
                C09 -> Known.C09
                C13 -> Known.C13
                C14 -> Known.C14
                R01 -> Known.R01
                R02 -> Known.R02
                R03 -> Known.R03
                R04 -> Known.R04
                R05 -> Known.R05
                R06 -> Known.R06
                R07 -> Known.R07
                R08 -> Known.R08
                R09 -> Known.R09
                R10 -> Known.R10
                R11 -> Known.R11
                R12 -> Known.R12
                R14 -> Known.R14
                R15 -> Known.R15
                R16 -> Known.R16
                R17 -> Known.R17
                R20 -> Known.R20
                R21 -> Known.R21
                R22 -> Known.R22
                R23 -> Known.R23
                R24 -> Known.R24
                R29 -> Known.R29
                R31 -> Known.R31
                R33 -> Known.R33
                R37 -> Known.R37
                R38 -> Known.R38
                R39 -> Known.R39
                R51 -> Known.R51
                R52 -> Known.R52
                R53 -> Known.R53
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                else -> throw ModernTreasuryInvalidDataException("Unknown Code: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Code && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ReturnCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
