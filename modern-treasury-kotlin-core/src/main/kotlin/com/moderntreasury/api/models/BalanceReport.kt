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
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = BalanceReport.Builder::class)
@NoAutoDetect
class BalanceReport
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val balanceReportType: JsonField<BalanceReportType>,
    private val asOfDate: JsonField<LocalDate>,
    private val asOfTime: JsonField<String>,
    private val balances: JsonField<List<Balance>>,
    private val internalAccountId: JsonField<String>,
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

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    fun balanceReportType(): BalanceReportType =
        balanceReportType.getRequired("balance_report_type")

    /** The date of the balance report in local time. */
    fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

    /** The time (24-hour clock) of the balance report in local time. */
    fun asOfTime(): String? = asOfTime.getNullable("as_of_time")

    /** An array of `Balance` objects. */
    fun balances(): List<Balance> = balances.getRequired("balances")

    /** The ID of one of your organization's Internal Accounts. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    @JsonProperty("balance_report_type")
    @ExcludeMissing
    fun _balanceReportType() = balanceReportType

    /** The date of the balance report in local time. */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate() = asOfDate

    /** The time (24-hour clock) of the balance report in local time. */
    @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime() = asOfTime

    /** An array of `Balance` objects. */
    @JsonProperty("balances") @ExcludeMissing fun _balances() = balances

    /** The ID of one of your organization's Internal Accounts. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BalanceReport = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            balanceReportType()
            asOfDate()
            asOfTime()
            balances().forEach { it.validate() }
            internalAccountId()
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
        private var balanceReportType: JsonField<BalanceReportType> = JsonMissing.of()
        private var asOfDate: JsonField<LocalDate> = JsonMissing.of()
        private var asOfTime: JsonField<String> = JsonMissing.of()
        private var balances: JsonField<List<Balance>> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceReport: BalanceReport) = apply {
            this.id = balanceReport.id
            this.object_ = balanceReport.object_
            this.liveMode = balanceReport.liveMode
            this.createdAt = balanceReport.createdAt
            this.updatedAt = balanceReport.updatedAt
            this.balanceReportType = balanceReport.balanceReportType
            this.asOfDate = balanceReport.asOfDate
            this.asOfTime = balanceReport.asOfTime
            this.balances = balanceReport.balances
            this.internalAccountId = balanceReport.internalAccountId
            additionalProperties(balanceReport.additionalProperties)
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
        @JsonProperty("balance_report_type")
        @ExcludeMissing
        fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
            this.balanceReportType = balanceReportType
        }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /** The date of the balance report in local time. */
        @JsonProperty("as_of_date")
        @ExcludeMissing
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: String) = asOfTime(JsonField.of(asOfTime))

        /** The time (24-hour clock) of the balance report in local time. */
        @JsonProperty("as_of_time")
        @ExcludeMissing
        fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

        /** An array of `Balance` objects. */
        fun balances(balances: List<Balance>) = balances(JsonField.of(balances))

        /** An array of `Balance` objects. */
        @JsonProperty("balances")
        @ExcludeMissing
        fun balances(balances: JsonField<List<Balance>>) = apply { this.balances = balances }

        /** The ID of one of your organization's Internal Accounts. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of one of your organization's Internal Accounts. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

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

        fun build(): BalanceReport =
            BalanceReport(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                balanceReportType,
                asOfDate,
                asOfTime,
                balances.map { it.toUnmodifiable() },
                internalAccountId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class BalanceReportType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceReportType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INTRADAY = BalanceReportType(JsonField.of("intraday"))

            val OTHER = BalanceReportType(JsonField.of("other"))

            val PREVIOUS_DAY = BalanceReportType(JsonField.of("previous_day"))

            val REAL_TIME = BalanceReportType(JsonField.of("real_time"))

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
    }

    @JsonDeserialize(builder = Balance.Builder::class)
    @NoAutoDetect
    class Balance
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<Currency>,
        private val balanceType: JsonField<BalanceType>,
        private val vendorCode: JsonField<String>,
        private val vendorCodeType: JsonField<String>,
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

        /** The balance amount. */
        fun amount(): Long = amount.getRequired("amount")

        /** The currency of the balance. */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, or `other`.
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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        /** The balance amount. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The currency of the balance. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, or `other`.
         */
        @JsonProperty("balance_type") @ExcludeMissing fun _balanceType() = balanceType

        /** The code used by the bank when reporting this specific balance. */
        @JsonProperty("vendor_code") @ExcludeMissing fun _vendorCode() = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        @JsonProperty("vendor_code_type") @ExcludeMissing fun _vendorCodeType() = vendorCodeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Balance = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                amount()
                currency()
                balanceType()
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

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var balanceType: JsonField<BalanceType> = JsonMissing.of()
            private var vendorCode: JsonField<String> = JsonMissing.of()
            private var vendorCodeType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balance: Balance) = apply {
                this.id = balance.id
                this.object_ = balance.object_
                this.liveMode = balance.liveMode
                this.createdAt = balance.createdAt
                this.updatedAt = balance.updatedAt
                this.amount = balance.amount
                this.currency = balance.currency
                this.balanceType = balance.balanceType
                this.vendorCode = balance.vendorCode
                this.vendorCodeType = balance.vendorCodeType
                additionalProperties(balance.additionalProperties)
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

            /** The balance amount. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The balance amount. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The currency of the balance. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /** The currency of the balance. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
            @JsonProperty("balance_type")
            @ExcludeMissing
            fun balanceType(balanceType: JsonField<BalanceType>) = apply {
                this.balanceType = balanceType
            }

            /** The code used by the bank when reporting this specific balance. */
            fun vendorCode(vendorCode: String) = vendorCode(JsonField.of(vendorCode))

            /** The code used by the bank when reporting this specific balance. */
            @JsonProperty("vendor_code")
            @ExcludeMissing
            fun vendorCode(vendorCode: JsonField<String>) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            fun vendorCodeType(vendorCodeType: String) =
                vendorCodeType(JsonField.of(vendorCodeType))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            @JsonProperty("vendor_code_type")
            @ExcludeMissing
            fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                this.vendorCodeType = vendorCodeType
            }

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

            fun build(): Balance =
                Balance(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    amount,
                    currency,
                    balanceType,
                    vendorCode,
                    vendorCodeType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class BalanceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BalanceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val CLOSING_AVAILABLE = BalanceType(JsonField.of("closing_available"))

                val CLOSING_LEDGER = BalanceType(JsonField.of("closing_ledger"))

                val CURRENT_AVAILABLE = BalanceType(JsonField.of("current_available"))

                val CURRENT_LEDGER = BalanceType(JsonField.of("current_ledger"))

                val OPENING_AVAILABLE = BalanceType(JsonField.of("opening_available"))

                val OPENING_AVAILABLE_NEXT_BUSINESS_DAY =
                    BalanceType(JsonField.of("opening_available_next_business_day"))

                val OPENING_LEDGER = BalanceType(JsonField.of("opening_ledger"))

                val OTHER = BalanceType(JsonField.of("other"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Balance &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.updatedAt == other.updatedAt &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.balanceType == other.balanceType &&
                this.vendorCode == other.vendorCode &&
                this.vendorCodeType == other.vendorCodeType &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        amount,
                        currency,
                        balanceType,
                        vendorCode,
                        vendorCodeType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Balance{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, amount=$amount, currency=$currency, balanceType=$balanceType, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceReport &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.balanceReportType == other.balanceReportType &&
            this.asOfDate == other.asOfDate &&
            this.asOfTime == other.asOfTime &&
            this.balances == other.balances &&
            this.internalAccountId == other.internalAccountId &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    balanceReportType,
                    asOfDate,
                    asOfTime,
                    balances,
                    internalAccountId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BalanceReport{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, balanceReportType=$balanceReportType, asOfDate=$asOfDate, asOfTime=$asOfTime, balances=$balances, internalAccountId=$internalAccountId, additionalProperties=$additionalProperties}"
}
