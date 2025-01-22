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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** create balance reports */
class BalanceReportCreateParams
constructor(
    private val internalAccountId: String,
    private val body: BalanceReportCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun internalAccountId(): String = internalAccountId

    /** The date of the balance report in local time. */
    fun asOfDate(): LocalDate = body.asOfDate()

    /** The time (24-hour clock) of the balance report in local time. */
    fun asOfTime(): String = body.asOfTime()

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    fun balanceReportType(): BalanceReportType = body.balanceReportType()

    /** An array of `Balance` objects. */
    fun balances(): List<BalanceCreateRequest> = body.balances()

    /** The date of the balance report in local time. */
    fun _asOfDate(): JsonField<LocalDate> = body._asOfDate()

    /** The time (24-hour clock) of the balance report in local time. */
    fun _asOfTime(): JsonField<String> = body._asOfTime()

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    fun _balanceReportType(): JsonField<BalanceReportType> = body._balanceReportType()

    /** An array of `Balance` objects. */
    fun _balances(): JsonField<List<BalanceCreateRequest>> = body._balances()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): BalanceReportCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> internalAccountId
            else -> ""
        }
    }

    @NoAutoDetect
    class BalanceReportCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("as_of_date")
        @ExcludeMissing
        private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("as_of_time")
        @ExcludeMissing
        private val asOfTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance_report_type")
        @ExcludeMissing
        private val balanceReportType: JsonField<BalanceReportType> = JsonMissing.of(),
        @JsonProperty("balances")
        @ExcludeMissing
        private val balances: JsonField<List<BalanceCreateRequest>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The date of the balance report in local time. */
        fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(): String = asOfTime.getRequired("as_of_time")

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(): BalanceReportType =
            balanceReportType.getRequired("balance_report_type")

        /** An array of `Balance` objects. */
        fun balances(): List<BalanceCreateRequest> = balances.getRequired("balances")

        /** The date of the balance report in local time. */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /** The time (24-hour clock) of the balance report in local time. */
        @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        @JsonProperty("balance_report_type")
        @ExcludeMissing
        fun _balanceReportType(): JsonField<BalanceReportType> = balanceReportType

        /** An array of `Balance` objects. */
        @JsonProperty("balances")
        @ExcludeMissing
        fun _balances(): JsonField<List<BalanceCreateRequest>> = balances

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BalanceReportCreateBody = apply {
            if (validated) {
                return@apply
            }

            asOfDate()
            asOfTime()
            balanceReportType()
            balances().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var asOfDate: JsonField<LocalDate>? = null
            private var asOfTime: JsonField<String>? = null
            private var balanceReportType: JsonField<BalanceReportType>? = null
            private var balances: JsonField<MutableList<BalanceCreateRequest>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balanceReportCreateBody: BalanceReportCreateBody) = apply {
                asOfDate = balanceReportCreateBody.asOfDate
                asOfTime = balanceReportCreateBody.asOfTime
                balanceReportType = balanceReportCreateBody.balanceReportType
                balances = balanceReportCreateBody.balances.map { it.toMutableList() }
                additionalProperties = balanceReportCreateBody.additionalProperties.toMutableMap()
            }

            /** The date of the balance report in local time. */
            fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

            /** The date of the balance report in local time. */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** The time (24-hour clock) of the balance report in local time. */
            fun asOfTime(asOfTime: String) = asOfTime(JsonField.of(asOfTime))

            /** The time (24-hour clock) of the balance report in local time. */
            fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

            /**
             * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`,
             * or `other`.
             */
            fun balanceReportType(balanceReportType: BalanceReportType) =
                balanceReportType(JsonField.of(balanceReportType))

            /**
             * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`,
             * or `other`.
             */
            fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
                this.balanceReportType = balanceReportType
            }

            /** An array of `Balance` objects. */
            fun balances(balances: List<BalanceCreateRequest>) = balances(JsonField.of(balances))

            /** An array of `Balance` objects. */
            fun balances(balances: JsonField<List<BalanceCreateRequest>>) = apply {
                this.balances = balances.map { it.toMutableList() }
            }

            /** An array of `Balance` objects. */
            fun addBalance(balance: BalanceCreateRequest) = apply {
                balances =
                    (balances ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(balance)
                    }
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

            fun build(): BalanceReportCreateBody =
                BalanceReportCreateBody(
                    checkRequired("asOfDate", asOfDate),
                    checkRequired("asOfTime", asOfTime),
                    checkRequired("balanceReportType", balanceReportType),
                    checkRequired("balances", balances).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceReportCreateBody && asOfDate == other.asOfDate && asOfTime == other.asOfTime && balanceReportType == other.balanceReportType && balances == other.balances && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(asOfDate, asOfTime, balanceReportType, balances, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceReportCreateBody{asOfDate=$asOfDate, asOfTime=$asOfTime, balanceReportType=$balanceReportType, balances=$balances, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var internalAccountId: String? = null
        private var body: BalanceReportCreateBody.Builder = BalanceReportCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(balanceReportCreateParams: BalanceReportCreateParams) = apply {
            internalAccountId = balanceReportCreateParams.internalAccountId
            body = balanceReportCreateParams.body.toBuilder()
            additionalHeaders = balanceReportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceReportCreateParams.additionalQueryParams.toBuilder()
        }

        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = apply { body.asOfDate(asOfDate) }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { body.asOfDate(asOfDate) }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: String) = apply { body.asOfTime(asOfTime) }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: JsonField<String>) = apply { body.asOfTime(asOfTime) }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: BalanceReportType) = apply {
            body.balanceReportType(balanceReportType)
        }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
            body.balanceReportType(balanceReportType)
        }

        /** An array of `Balance` objects. */
        fun balances(balances: List<BalanceCreateRequest>) = apply { body.balances(balances) }

        /** An array of `Balance` objects. */
        fun balances(balances: JsonField<List<BalanceCreateRequest>>) = apply {
            body.balances(balances)
        }

        /** An array of `Balance` objects. */
        fun addBalance(balance: BalanceCreateRequest) = apply { body.addBalance(balance) }

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

        fun build(): BalanceReportCreateParams =
            BalanceReportCreateParams(
                checkRequired("internalAccountId", internalAccountId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    class BalanceReportType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INTRADAY = of("intraday")

            val OTHER = of("other")

            val PREVIOUS_DAY = of("previous_day")

            val REAL_TIME = of("real_time")

            fun of(value: String) = BalanceReportType(JsonField.of(value))
        }

        enum class Known {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
        }

        enum class Value {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTRADAY -> Value.INTRADAY
                OTHER -> Value.OTHER
                PREVIOUS_DAY -> Value.PREVIOUS_DAY
                REAL_TIME -> Value.REAL_TIME
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTRADAY -> Known.INTRADAY
                OTHER -> Known.OTHER
                PREVIOUS_DAY -> Known.PREVIOUS_DAY
                REAL_TIME -> Known.REAL_TIME
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown BalanceReportType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceReportType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class BalanceCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("balance_type")
        @ExcludeMissing
        private val balanceType: JsonField<BalanceType> = JsonMissing.of(),
        @JsonProperty("vendor_code")
        @ExcludeMissing
        private val vendorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        private val vendorCodeType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The balance amount. */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        fun balanceType(): BalanceType = balanceType.getRequired("balance_type")

        /** The code used by the bank when reporting this specific balance. */
        fun vendorCode(): String = vendorCode.getRequired("vendor_code")

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        fun vendorCodeType(): String? = vendorCodeType.getNullable("vendor_code_type")

        /** The balance amount. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        @JsonProperty("balance_type")
        @ExcludeMissing
        fun _balanceType(): JsonField<BalanceType> = balanceType

        /** The code used by the bank when reporting this specific balance. */
        @JsonProperty("vendor_code")
        @ExcludeMissing
        fun _vendorCode(): JsonField<String> = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        fun _vendorCodeType(): JsonField<String> = vendorCodeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BalanceCreateRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            balanceType()
            vendorCode()
            vendorCodeType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long>? = null
            private var balanceType: JsonField<BalanceType>? = null
            private var vendorCode: JsonField<String>? = null
            private var vendorCodeType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balanceCreateRequest: BalanceCreateRequest) = apply {
                amount = balanceCreateRequest.amount
                balanceType = balanceCreateRequest.balanceType
                vendorCode = balanceCreateRequest.vendorCode
                vendorCodeType = balanceCreateRequest.vendorCodeType
                additionalProperties = balanceCreateRequest.additionalProperties.toMutableMap()
            }

            /** The balance amount. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The balance amount. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
             */
            fun balanceType(balanceType: BalanceType) = balanceType(JsonField.of(balanceType))

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
             */
            fun balanceType(balanceType: JsonField<BalanceType>) = apply {
                this.balanceType = balanceType
            }

            /** The code used by the bank when reporting this specific balance. */
            fun vendorCode(vendorCode: String) = vendorCode(JsonField.of(vendorCode))

            /** The code used by the bank when reporting this specific balance. */
            fun vendorCode(vendorCode: JsonField<String>) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            fun vendorCodeType(vendorCodeType: String?) =
                vendorCodeType(JsonField.ofNullable(vendorCodeType))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                this.vendorCodeType = vendorCodeType
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

            fun build(): BalanceCreateRequest =
                BalanceCreateRequest(
                    checkRequired("amount", amount),
                    checkRequired("balanceType", balanceType),
                    checkRequired("vendorCode", vendorCode),
                    checkRequired("vendorCodeType", vendorCodeType),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        class BalanceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CLOSING_AVAILABLE = of("closing_available")

                val CLOSING_LEDGER = of("closing_ledger")

                val CURRENT_AVAILABLE = of("current_available")

                val CURRENT_LEDGER = of("current_ledger")

                val OPENING_AVAILABLE = of("opening_available")

                val OPENING_AVAILABLE_NEXT_BUSINESS_DAY = of("opening_available_next_business_day")

                val OPENING_LEDGER = of("opening_ledger")

                val OTHER = of("other")

                val PREVIOUSLY_CLOSED_BOOK = of("previously_closed_book")

                fun of(value: String) = BalanceType(JsonField.of(value))
            }

            enum class Known {
                CLOSING_AVAILABLE,
                CLOSING_LEDGER,
                CURRENT_AVAILABLE,
                CURRENT_LEDGER,
                OPENING_AVAILABLE,
                OPENING_AVAILABLE_NEXT_BUSINESS_DAY,
                OPENING_LEDGER,
                OTHER,
                PREVIOUSLY_CLOSED_BOOK,
            }

            enum class Value {
                CLOSING_AVAILABLE,
                CLOSING_LEDGER,
                CURRENT_AVAILABLE,
                CURRENT_LEDGER,
                OPENING_AVAILABLE,
                OPENING_AVAILABLE_NEXT_BUSINESS_DAY,
                OPENING_LEDGER,
                OTHER,
                PREVIOUSLY_CLOSED_BOOK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CLOSING_AVAILABLE -> Value.CLOSING_AVAILABLE
                    CLOSING_LEDGER -> Value.CLOSING_LEDGER
                    CURRENT_AVAILABLE -> Value.CURRENT_AVAILABLE
                    CURRENT_LEDGER -> Value.CURRENT_LEDGER
                    OPENING_AVAILABLE -> Value.OPENING_AVAILABLE
                    OPENING_AVAILABLE_NEXT_BUSINESS_DAY -> Value.OPENING_AVAILABLE_NEXT_BUSINESS_DAY
                    OPENING_LEDGER -> Value.OPENING_LEDGER
                    OTHER -> Value.OTHER
                    PREVIOUSLY_CLOSED_BOOK -> Value.PREVIOUSLY_CLOSED_BOOK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CLOSING_AVAILABLE -> Known.CLOSING_AVAILABLE
                    CLOSING_LEDGER -> Known.CLOSING_LEDGER
                    CURRENT_AVAILABLE -> Known.CURRENT_AVAILABLE
                    CURRENT_LEDGER -> Known.CURRENT_LEDGER
                    OPENING_AVAILABLE -> Known.OPENING_AVAILABLE
                    OPENING_AVAILABLE_NEXT_BUSINESS_DAY -> Known.OPENING_AVAILABLE_NEXT_BUSINESS_DAY
                    OPENING_LEDGER -> Known.OPENING_LEDGER
                    OTHER -> Known.OTHER
                    PREVIOUSLY_CLOSED_BOOK -> Known.PREVIOUSLY_CLOSED_BOOK
                    else -> throw ModernTreasuryInvalidDataException("Unknown BalanceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BalanceType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceCreateRequest && amount == other.amount && balanceType == other.balanceType && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, balanceType, vendorCode, vendorCodeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceCreateRequest{amount=$amount, balanceType=$balanceType, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReportCreateParams && internalAccountId == other.internalAccountId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(internalAccountId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceReportCreateParams{internalAccountId=$internalAccountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
