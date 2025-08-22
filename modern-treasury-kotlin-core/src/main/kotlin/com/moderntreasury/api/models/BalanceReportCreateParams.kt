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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** create balance reports */
class BalanceReportCreateParams
private constructor(
    private val internalAccountId: String?,
    private val body: BalanceReportCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun internalAccountId(): String? = internalAccountId

    /**
     * The date of the balance report in local time.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun asOfDate(): LocalDate = body.asOfDate()

    /**
     * The time (24-hour clock) of the balance report in local time.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun asOfTime(): String = body.asOfTime()

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceReportType(): BalanceReportType = body.balanceReportType()

    /**
     * An array of `Balance` objects.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balances(): List<BalanceCreateRequest> = body.balances()

    /**
     * Returns the raw JSON value of [asOfDate].
     *
     * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _asOfDate(): JsonField<LocalDate> = body._asOfDate()

    /**
     * Returns the raw JSON value of [asOfTime].
     *
     * Unlike [asOfTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _asOfTime(): JsonField<String> = body._asOfTime()

    /**
     * Returns the raw JSON value of [balanceReportType].
     *
     * Unlike [balanceReportType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _balanceReportType(): JsonField<BalanceReportType> = body._balanceReportType()

    /**
     * Returns the raw JSON value of [balances].
     *
     * Unlike [balances], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _balances(): JsonField<List<BalanceCreateRequest>> = body._balances()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceReportCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .asOfDate()
         * .asOfTime()
         * .balanceReportType()
         * .balances()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceReportCreateParams]. */
    class Builder internal constructor() {

        private var internalAccountId: String? = null
        private var body: BalanceReportCreateRequest.Builder = BalanceReportCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(balanceReportCreateParams: BalanceReportCreateParams) = apply {
            internalAccountId = balanceReportCreateParams.internalAccountId
            body = balanceReportCreateParams.body.toBuilder()
            additionalHeaders = balanceReportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceReportCreateParams.additionalQueryParams.toBuilder()
        }

        fun internalAccountId(internalAccountId: String?) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [asOfDate]
         * - [asOfTime]
         * - [balanceReportType]
         * - [balances]
         */
        fun body(body: BalanceReportCreateRequest) = apply { this.body = body.toBuilder() }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = apply { body.asOfDate(asOfDate) }

        /**
         * Sets [Builder.asOfDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { body.asOfDate(asOfDate) }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: String) = apply { body.asOfTime(asOfTime) }

        /**
         * Sets [Builder.asOfTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asOfTime(asOfTime: JsonField<String>) = apply { body.asOfTime(asOfTime) }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: BalanceReportType) = apply {
            body.balanceReportType(balanceReportType)
        }

        /**
         * Sets [Builder.balanceReportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceReportType] with a well-typed [BalanceReportType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
            body.balanceReportType(balanceReportType)
        }

        /** An array of `Balance` objects. */
        fun balances(balances: List<BalanceCreateRequest>) = apply { body.balances(balances) }

        /**
         * Sets [Builder.balances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balances] with a well-typed `List<BalanceCreateRequest>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun balances(balances: JsonField<List<BalanceCreateRequest>>) = apply {
            body.balances(balances)
        }

        /**
         * Adds a single [BalanceCreateRequest] to [balances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBalance(balance: BalanceCreateRequest) = apply { body.addBalance(balance) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BalanceReportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .asOfDate()
         * .asOfTime()
         * .balanceReportType()
         * .balances()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceReportCreateParams =
            BalanceReportCreateParams(
                internalAccountId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BalanceReportCreateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> internalAccountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class BalanceReportCreateRequest
    private constructor(
        private val asOfDate: JsonField<LocalDate>,
        private val asOfTime: JsonField<String>,
        private val balanceReportType: JsonField<BalanceReportType>,
        private val balances: JsonField<List<BalanceCreateRequest>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("as_of_date")
            @ExcludeMissing
            asOfDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("as_of_time")
            @ExcludeMissing
            asOfTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balance_report_type")
            @ExcludeMissing
            balanceReportType: JsonField<BalanceReportType> = JsonMissing.of(),
            @JsonProperty("balances")
            @ExcludeMissing
            balances: JsonField<List<BalanceCreateRequest>> = JsonMissing.of(),
        ) : this(asOfDate, asOfTime, balanceReportType, balances, mutableMapOf())

        /**
         * The date of the balance report in local time.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

        /**
         * The time (24-hour clock) of the balance report in local time.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun asOfTime(): String = asOfTime.getRequired("as_of_time")

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balanceReportType(): BalanceReportType =
            balanceReportType.getRequired("balance_report_type")

        /**
         * An array of `Balance` objects.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balances(): List<BalanceCreateRequest> = balances.getRequired("balances")

        /**
         * Returns the raw JSON value of [asOfDate].
         *
         * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /**
         * Returns the raw JSON value of [asOfTime].
         *
         * Unlike [asOfTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

        /**
         * Returns the raw JSON value of [balanceReportType].
         *
         * Unlike [balanceReportType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("balance_report_type")
        @ExcludeMissing
        fun _balanceReportType(): JsonField<BalanceReportType> = balanceReportType

        /**
         * Returns the raw JSON value of [balances].
         *
         * Unlike [balances], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balances")
        @ExcludeMissing
        fun _balances(): JsonField<List<BalanceCreateRequest>> = balances

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
             * [BalanceReportCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .asOfDate()
             * .asOfTime()
             * .balanceReportType()
             * .balances()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BalanceReportCreateRequest]. */
        class Builder internal constructor() {

            private var asOfDate: JsonField<LocalDate>? = null
            private var asOfTime: JsonField<String>? = null
            private var balanceReportType: JsonField<BalanceReportType>? = null
            private var balances: JsonField<MutableList<BalanceCreateRequest>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(balanceReportCreateRequest: BalanceReportCreateRequest) = apply {
                asOfDate = balanceReportCreateRequest.asOfDate
                asOfTime = balanceReportCreateRequest.asOfTime
                balanceReportType = balanceReportCreateRequest.balanceReportType
                balances = balanceReportCreateRequest.balances.map { it.toMutableList() }
                additionalProperties =
                    balanceReportCreateRequest.additionalProperties.toMutableMap()
            }

            /** The date of the balance report in local time. */
            fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

            /**
             * Sets [Builder.asOfDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** The time (24-hour clock) of the balance report in local time. */
            fun asOfTime(asOfTime: String) = asOfTime(JsonField.of(asOfTime))

            /**
             * Sets [Builder.asOfTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asOfTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

            /**
             * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`,
             * or `other`.
             */
            fun balanceReportType(balanceReportType: BalanceReportType) =
                balanceReportType(JsonField.of(balanceReportType))

            /**
             * Sets [Builder.balanceReportType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceReportType] with a well-typed
             * [BalanceReportType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
                this.balanceReportType = balanceReportType
            }

            /** An array of `Balance` objects. */
            fun balances(balances: List<BalanceCreateRequest>) = balances(JsonField.of(balances))

            /**
             * Sets [Builder.balances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balances] with a well-typed
             * `List<BalanceCreateRequest>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun balances(balances: JsonField<List<BalanceCreateRequest>>) = apply {
                this.balances = balances.map { it.toMutableList() }
            }

            /**
             * Adds a single [BalanceCreateRequest] to [balances].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBalance(balance: BalanceCreateRequest) = apply {
                balances =
                    (balances ?: JsonField.of(mutableListOf())).also {
                        checkKnown("balances", it).add(balance)
                    }
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
             * Returns an immutable instance of [BalanceReportCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .asOfDate()
             * .asOfTime()
             * .balanceReportType()
             * .balances()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BalanceReportCreateRequest =
                BalanceReportCreateRequest(
                    checkRequired("asOfDate", asOfDate),
                    checkRequired("asOfTime", asOfTime),
                    checkRequired("balanceReportType", balanceReportType),
                    checkRequired("balances", balances).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BalanceReportCreateRequest = apply {
            if (validated) {
                return@apply
            }

            asOfDate()
            asOfTime()
            balanceReportType().validate()
            balances().forEach { it.validate() }
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
            (if (asOfDate.asKnown() == null) 0 else 1) +
                (if (asOfTime.asKnown() == null) 0 else 1) +
                (balanceReportType.asKnown()?.validity() ?: 0) +
                (balances.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceReportCreateRequest &&
                asOfDate == other.asOfDate &&
                asOfTime == other.asOfTime &&
                balanceReportType == other.balanceReportType &&
                balances == other.balances &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(asOfDate, asOfTime, balanceReportType, balances, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceReportCreateRequest{asOfDate=$asOfDate, asOfTime=$asOfTime, balanceReportType=$balanceReportType, balances=$balances, additionalProperties=$additionalProperties}"
    }

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    class BalanceReportType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val INTRADAY = of("intraday")

            val OTHER = of("other")

            val PREVIOUS_DAY = of("previous_day")

            val REAL_TIME = of("real_time")

            fun of(value: String) = BalanceReportType(JsonField.of(value))
        }

        /** An enum containing [BalanceReportType]'s known values. */
        enum class Known {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
        }

        /**
         * An enum containing [BalanceReportType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BalanceReportType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
            /**
             * An enum member indicating that [BalanceReportType] was instantiated with an unknown
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
                INTRADAY -> Value.INTRADAY
                OTHER -> Value.OTHER
                PREVIOUS_DAY -> Value.PREVIOUS_DAY
                REAL_TIME -> Value.REAL_TIME
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
                INTRADAY -> Known.INTRADAY
                OTHER -> Known.OTHER
                PREVIOUS_DAY -> Known.PREVIOUS_DAY
                REAL_TIME -> Known.REAL_TIME
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown BalanceReportType: $value")
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

        private var validated: Boolean = false

        fun validate(): BalanceReportType = apply {
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

            return other is BalanceReportType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BalanceCreateRequest
    private constructor(
        private val amount: JsonField<Long>,
        private val balanceType: JsonField<BalanceType>,
        private val vendorCode: JsonField<String>,
        private val vendorCodeType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("balance_type")
            @ExcludeMissing
            balanceType: JsonField<BalanceType> = JsonMissing.of(),
            @JsonProperty("vendor_code")
            @ExcludeMissing
            vendorCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor_code_type")
            @ExcludeMissing
            vendorCodeType: JsonField<String> = JsonMissing.of(),
        ) : this(amount, balanceType, vendorCode, vendorCodeType, mutableMapOf())

        /**
         * The balance amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balanceType(): BalanceType = balanceType.getRequired("balance_type")

        /**
         * The code used by the bank when reporting this specific balance.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vendorCode(): String = vendorCode.getRequired("vendor_code")

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vendorCodeType(): String? = vendorCodeType.getNullable("vendor_code_type")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [balanceType].
         *
         * Unlike [balanceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance_type")
        @ExcludeMissing
        fun _balanceType(): JsonField<BalanceType> = balanceType

        /**
         * Returns the raw JSON value of [vendorCode].
         *
         * Unlike [vendorCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vendor_code")
        @ExcludeMissing
        fun _vendorCode(): JsonField<String> = vendorCode

        /**
         * Returns the raw JSON value of [vendorCodeType].
         *
         * Unlike [vendorCodeType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        fun _vendorCodeType(): JsonField<String> = vendorCodeType

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
             * Returns a mutable builder for constructing an instance of [BalanceCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .balanceType()
             * .vendorCode()
             * .vendorCodeType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BalanceCreateRequest]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
             */
            fun balanceType(balanceType: BalanceType) = balanceType(JsonField.of(balanceType))

            /**
             * Sets [Builder.balanceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceType] with a well-typed [BalanceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceType(balanceType: JsonField<BalanceType>) = apply {
                this.balanceType = balanceType
            }

            /** The code used by the bank when reporting this specific balance. */
            fun vendorCode(vendorCode: String) = vendorCode(JsonField.of(vendorCode))

            /**
             * Sets [Builder.vendorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.vendorCodeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorCodeType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                this.vendorCodeType = vendorCodeType
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
             * Returns an immutable instance of [BalanceCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .balanceType()
             * .vendorCode()
             * .vendorCodeType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BalanceCreateRequest =
                BalanceCreateRequest(
                    checkRequired("amount", amount),
                    checkRequired("balanceType", balanceType),
                    checkRequired("vendorCode", vendorCode),
                    checkRequired("vendorCodeType", vendorCodeType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BalanceCreateRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            balanceType().validate()
            vendorCode()
            vendorCodeType()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (balanceType.asKnown()?.validity() ?: 0) +
                (if (vendorCode.asKnown() == null) 0 else 1) +
                (if (vendorCodeType.asKnown() == null) 0 else 1)

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        class BalanceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /** An enum containing [BalanceType]'s known values. */
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

            /**
             * An enum containing [BalanceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BalanceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [BalanceType] was instantiated with an unknown
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

            fun validate(): BalanceType = apply {
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

                return other is BalanceType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceCreateRequest &&
                amount == other.amount &&
                balanceType == other.balanceType &&
                vendorCode == other.vendorCode &&
                vendorCodeType == other.vendorCodeType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, balanceType, vendorCode, vendorCodeType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceCreateRequest{amount=$amount, balanceType=$balanceType, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceReportCreateParams &&
            internalAccountId == other.internalAccountId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(internalAccountId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BalanceReportCreateParams{internalAccountId=$internalAccountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
