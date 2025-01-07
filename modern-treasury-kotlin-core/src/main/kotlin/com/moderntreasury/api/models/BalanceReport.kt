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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class BalanceReport
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
    private val balances: JsonField<List<Balance>> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The date of the balance report in local time. */
    fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

    /** The time (24-hour clock) of the balance report in local time. */
    fun asOfTime(): String? = asOfTime.getNullable("as_of_time")

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    fun balanceReportType(): BalanceReportType =
        balanceReportType.getRequired("balance_report_type")

    /** An array of `Balance` objects. */
    fun balances(): List<Balance> = balances.getRequired("balances")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The ID of one of your organization's Internal Accounts. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
    @JsonProperty("balances") @ExcludeMissing fun _balances(): JsonField<List<Balance>> = balances

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The ID of one of your organization's Internal Accounts. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BalanceReport = apply {
        if (!validated) {
            id()
            asOfDate()
            asOfTime()
            balanceReportType()
            balances().forEach { it.validate() }
            createdAt()
            internalAccountId()
            liveMode()
            object_()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var asOfDate: JsonField<LocalDate>? = null
        private var asOfTime: JsonField<String>? = null
        private var balanceReportType: JsonField<BalanceReportType>? = null
        private var balances: JsonField<MutableList<Balance>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var internalAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceReport: BalanceReport) = apply {
            id = balanceReport.id
            asOfDate = balanceReport.asOfDate
            asOfTime = balanceReport.asOfTime
            balanceReportType = balanceReport.balanceReportType
            balances = balanceReport.balances.map { it.toMutableList() }
            createdAt = balanceReport.createdAt
            internalAccountId = balanceReport.internalAccountId
            liveMode = balanceReport.liveMode
            object_ = balanceReport.object_
            updatedAt = balanceReport.updatedAt
            additionalProperties = balanceReport.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: String?) = asOfTime(JsonField.ofNullable(asOfTime))

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: BalanceReportType) =
            balanceReportType(JsonField.of(balanceReportType))

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
            this.balanceReportType = balanceReportType
        }

        /** An array of `Balance` objects. */
        fun balances(balances: List<Balance>) = balances(JsonField.of(balances))

        /** An array of `Balance` objects. */
        fun balances(balances: JsonField<List<Balance>>) = apply {
            this.balances = balances.map { it.toMutableList() }
        }

        /** An array of `Balance` objects. */
        fun addBalance(balance: Balance) = apply {
            balances =
                (balances ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(balance)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of one of your organization's Internal Accounts. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of one of your organization's Internal Accounts. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
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

        fun build(): BalanceReport =
            BalanceReport(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(asOfDate) { "`asOfDate` is required but was not set" },
                checkNotNull(asOfTime) { "`asOfTime` is required but was not set" },
                checkNotNull(balanceReportType) {
                    "`balanceReportType` is required but was not set"
                },
                checkNotNull(balances) { "`balances` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

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
    class Balance
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("as_of_date")
        @ExcludeMissing
        private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("as_of_time")
        @ExcludeMissing
        private val asOfTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance_type")
        @ExcludeMissing
        private val balanceType: JsonField<BalanceType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value_date")
        @ExcludeMissing
        private val valueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("vendor_code")
        @ExcludeMissing
        private val vendorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        private val vendorCodeType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The balance amount. */
        fun amount(): Long = amount.getRequired("amount")

        /** The date on which the balance became true for the account. */
        fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

        /** The time on which the balance became true for the account. */
        fun asOfTime(): String? = asOfTime.getNullable("as_of_time")

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, or `other`.
         */
        fun balanceType(): BalanceType = balanceType.getRequired("balance_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The currency of the balance. */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /** The date on which the balance becomes available. */
        fun valueDate(): LocalDate? = valueDate.getNullable("value_date")

        /** The code used by the bank when reporting this specific balance. */
        fun vendorCode(): String = vendorCode.getRequired("vendor_code")

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        fun vendorCodeType(): String? = vendorCodeType.getNullable("vendor_code_type")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The balance amount. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The date on which the balance became true for the account. */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /** The time on which the balance became true for the account. */
        @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, or `other`.
         */
        @JsonProperty("balance_type")
        @ExcludeMissing
        fun _balanceType(): JsonField<BalanceType> = balanceType

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The currency of the balance. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /** The date on which the balance becomes available. */
        @JsonProperty("value_date")
        @ExcludeMissing
        fun _valueDate(): JsonField<LocalDate> = valueDate

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

        fun validate(): Balance = apply {
            if (!validated) {
                id()
                amount()
                asOfDate()
                asOfTime()
                balanceType()
                createdAt()
                currency()
                liveMode()
                object_()
                updatedAt()
                valueDate()
                vendorCode()
                vendorCodeType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var asOfDate: JsonField<LocalDate>? = null
            private var asOfTime: JsonField<String>? = null
            private var balanceType: JsonField<BalanceType>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<Currency>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var valueDate: JsonField<LocalDate>? = null
            private var vendorCode: JsonField<String>? = null
            private var vendorCodeType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balance: Balance) = apply {
                id = balance.id
                amount = balance.amount
                asOfDate = balance.asOfDate
                asOfTime = balance.asOfTime
                balanceType = balance.balanceType
                createdAt = balance.createdAt
                currency = balance.currency
                liveMode = balance.liveMode
                object_ = balance.object_
                updatedAt = balance.updatedAt
                valueDate = balance.valueDate
                vendorCode = balance.vendorCode
                vendorCodeType = balance.vendorCodeType
                additionalProperties = balance.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The balance amount. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The balance amount. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The date on which the balance became true for the account. */
            fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

            /** The date on which the balance became true for the account. */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** The time on which the balance became true for the account. */
            fun asOfTime(asOfTime: String?) = asOfTime(JsonField.ofNullable(asOfTime))

            /** The time on which the balance became true for the account. */
            fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, or `other`.
             */
            fun balanceType(balanceType: BalanceType) = balanceType(JsonField.of(balanceType))

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, or `other`.
             */
            fun balanceType(balanceType: JsonField<BalanceType>) = apply {
                this.balanceType = balanceType
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The currency of the balance. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /** The currency of the balance. */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The date on which the balance becomes available. */
            fun valueDate(valueDate: LocalDate?) = valueDate(JsonField.ofNullable(valueDate))

            /** The date on which the balance becomes available. */
            fun valueDate(valueDate: JsonField<LocalDate>) = apply { this.valueDate = valueDate }

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

            fun build(): Balance =
                Balance(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(asOfDate) { "`asOfDate` is required but was not set" },
                    checkNotNull(asOfTime) { "`asOfTime` is required but was not set" },
                    checkNotNull(balanceType) { "`balanceType` is required but was not set" },
                    checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                    checkNotNull(object_) { "`object_` is required but was not set" },
                    checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                    checkNotNull(valueDate) { "`valueDate` is required but was not set" },
                    checkNotNull(vendorCode) { "`vendorCode` is required but was not set" },
                    checkNotNull(vendorCodeType) { "`vendorCodeType` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

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

            return /* spotless:off */ other is Balance && id == other.id && amount == other.amount && asOfDate == other.asOfDate && asOfTime == other.asOfTime && balanceType == other.balanceType && createdAt == other.createdAt && currency == other.currency && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && valueDate == other.valueDate && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, asOfDate, asOfTime, balanceType, createdAt, currency, liveMode, object_, updatedAt, valueDate, vendorCode, vendorCodeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balance{id=$id, amount=$amount, asOfDate=$asOfDate, asOfTime=$asOfTime, balanceType=$balanceType, createdAt=$createdAt, currency=$currency, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, valueDate=$valueDate, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReport && id == other.id && asOfDate == other.asOfDate && asOfTime == other.asOfTime && balanceReportType == other.balanceReportType && balances == other.balances && createdAt == other.createdAt && internalAccountId == other.internalAccountId && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, asOfDate, asOfTime, balanceReportType, balances, createdAt, internalAccountId, liveMode, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceReport{id=$id, asOfDate=$asOfDate, asOfTime=$asOfTime, balanceReportType=$balanceReportType, balances=$balances, createdAt=$createdAt, internalAccountId=$internalAccountId, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
