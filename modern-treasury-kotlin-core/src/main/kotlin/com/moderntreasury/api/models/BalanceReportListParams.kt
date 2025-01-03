// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

class BalanceReportListParams
constructor(
    private val internalAccountId: String,
    private val afterCursor: String?,
    private val asOfDate: LocalDate?,
    private val balanceReportType: BalanceReportType?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun internalAccountId(): String = internalAccountId

    fun afterCursor(): String? = afterCursor

    /** The date of the balance report in local time. */
    fun asOfDate(): LocalDate? = asOfDate

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    fun balanceReportType(): BalanceReportType? = balanceReportType

    fun perPage(): Long? = perPage

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.asOfDate?.let { queryParams.put("as_of_date", listOf(it.toString())) }
        this.balanceReportType?.let {
            queryParams.put("balance_report_type", listOf(it.toString()))
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> internalAccountId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var internalAccountId: String? = null
        private var afterCursor: String? = null
        private var asOfDate: LocalDate? = null
        private var balanceReportType: BalanceReportType? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(balanceReportListParams: BalanceReportListParams) = apply {
            internalAccountId = balanceReportListParams.internalAccountId
            afterCursor = balanceReportListParams.afterCursor
            asOfDate = balanceReportListParams.asOfDate
            balanceReportType = balanceReportListParams.balanceReportType
            perPage = balanceReportListParams.perPage
            additionalHeaders = balanceReportListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceReportListParams.additionalQueryParams.toBuilder()
        }

        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: BalanceReportType) = apply {
            this.balanceReportType = balanceReportType
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

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

        fun build(): BalanceReportListParams =
            BalanceReportListParams(
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                afterCursor,
                asOfDate,
                balanceReportType,
                perPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReportListParams && internalAccountId == other.internalAccountId && afterCursor == other.afterCursor && asOfDate == other.asOfDate && balanceReportType == other.balanceReportType && perPage == other.perPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(internalAccountId, afterCursor, asOfDate, balanceReportType, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceReportListParams{internalAccountId=$internalAccountId, afterCursor=$afterCursor, asOfDate=$asOfDate, balanceReportType=$balanceReportType, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
