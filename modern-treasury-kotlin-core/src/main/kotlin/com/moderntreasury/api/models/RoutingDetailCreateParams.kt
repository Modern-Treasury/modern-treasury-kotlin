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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create a routing detail for a single external account. */
class RoutingDetailCreateParams
private constructor(
    private val accountsType: AccountsType,
    private val accountId: String?,
    private val body: RoutingDetailCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountsType(): AccountsType = accountsType

    fun accountId(): String? = accountId

    /**
     * The routing number of the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = body.routingNumber()

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumberType(): RoutingNumberType = body.routingNumberType()

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentType(): PaymentType? = body.paymentType()

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routingNumber(): JsonField<String> = body._routingNumber()

    /**
     * Returns the raw JSON value of [routingNumberType].
     *
     * Unlike [routingNumberType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _routingNumberType(): JsonField<RoutingNumberType> = body._routingNumberType()

    /**
     * Returns the raw JSON value of [paymentType].
     *
     * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentType(): JsonField<PaymentType> = body._paymentType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingDetailCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountsType()
         * .routingNumber()
         * .routingNumberType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RoutingDetailCreateParams]. */
    class Builder internal constructor() {

        private var accountsType: AccountsType? = null
        private var accountId: String? = null
        private var body: RoutingDetailCreateRequest.Builder = RoutingDetailCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(routingDetailCreateParams: RoutingDetailCreateParams) = apply {
            accountsType = routingDetailCreateParams.accountsType
            accountId = routingDetailCreateParams.accountId
            body = routingDetailCreateParams.body.toBuilder()
            additionalHeaders = routingDetailCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = routingDetailCreateParams.additionalQueryParams.toBuilder()
        }

        fun accountsType(accountsType: AccountsType) = apply { this.accountsType = accountsType }

        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [routingNumber]
         * - [routingNumberType]
         * - [paymentType]
         */
        fun body(body: RoutingDetailCreateRequest) = apply { this.body = body.toBuilder() }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = apply { body.routingNumber(routingNumber) }

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            body.routingNumber(routingNumber)
        }

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
            body.routingNumberType(routingNumberType)
        }

        /**
         * Sets [Builder.routingNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumberType] with a well-typed [RoutingNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
            body.routingNumberType(routingNumberType)
        }

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        fun paymentType(paymentType: PaymentType?) = apply { body.paymentType(paymentType) }

        /**
         * Sets [Builder.paymentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentType] with a well-typed [PaymentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
            body.paymentType(paymentType)
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

        /**
         * Returns an immutable instance of [RoutingDetailCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountsType()
         * .routingNumber()
         * .routingNumberType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RoutingDetailCreateParams =
            RoutingDetailCreateParams(
                checkRequired("accountsType", accountsType),
                accountId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): RoutingDetailCreateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountsType.toString()
            1 -> accountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class RoutingDetailCreateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val routingNumber: JsonField<String>,
        private val routingNumberType: JsonField<RoutingNumberType>,
        private val paymentType: JsonField<PaymentType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
            @JsonProperty("payment_type")
            @ExcludeMissing
            paymentType: JsonField<PaymentType> = JsonMissing.of(),
        ) : this(routingNumber, routingNumberType, paymentType, mutableMapOf())

        /**
         * The routing number of the bank.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumberType(): RoutingNumberType =
            routingNumberType.getRequired("routing_number_type")

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [routingNumberType].
         *
         * Unlike [routingNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

        /**
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

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
             * [RoutingDetailCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .routingNumber()
             * .routingNumberType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RoutingDetailCreateRequest]. */
        class Builder internal constructor() {

            private var routingNumber: JsonField<String>? = null
            private var routingNumberType: JsonField<RoutingNumberType>? = null
            private var paymentType: JsonField<PaymentType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(routingDetailCreateRequest: RoutingDetailCreateRequest) = apply {
                routingNumber = routingDetailCreateRequest.routingNumber
                routingNumberType = routingDetailCreateRequest.routingNumberType
                paymentType = routingDetailCreateRequest.paymentType
                additionalProperties =
                    routingDetailCreateRequest.additionalProperties.toMutableMap()
            }

            /** The routing number of the bank. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * The type of routing number. See
             * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
             * details.
             */
            fun routingNumberType(routingNumberType: RoutingNumberType) =
                routingNumberType(JsonField.of(routingNumberType))

            /**
             * Sets [Builder.routingNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumberType] with a well-typed
             * [RoutingNumberType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
                this.routingNumberType = routingNumberType
            }

            /**
             * If the routing detail is to be used for a specific payment type this field will be
             * populated, otherwise null.
             */
            fun paymentType(paymentType: PaymentType?) =
                paymentType(JsonField.ofNullable(paymentType))

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

            /**
             * Returns an immutable instance of [RoutingDetailCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .routingNumber()
             * .routingNumberType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RoutingDetailCreateRequest =
                RoutingDetailCreateRequest(
                    checkRequired("routingNumber", routingNumber),
                    checkRequired("routingNumberType", routingNumberType),
                    paymentType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RoutingDetailCreateRequest = apply {
            if (validated) {
                return@apply
            }

            routingNumber()
            routingNumberType().validate()
            paymentType()?.validate()
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
            (if (routingNumber.asKnown() == null) 0 else 1) +
                (routingNumberType.asKnown()?.validity() ?: 0) +
                (paymentType.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoutingDetailCreateRequest &&
                routingNumber == other.routingNumber &&
                routingNumberType == other.routingNumberType &&
                paymentType == other.paymentType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoutingDetailCreateRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
    }

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details.
     */
    class RoutingNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val ABA = of("aba")

            val AU_BSB = of("au_bsb")

            val BR_CODIGO = of("br_codigo")

            val CA_CPA = of("ca_cpa")

            val CHIPS = of("chips")

            val CNAPS = of("cnaps")

            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

            val GB_SORT_CODE = of("gb_sort_code")

            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

            val ID_SKNBI_CODE = of("id_sknbi_code")

            val IL_BANK_CODE = of("il_bank_code")

            val IN_IFSC = of("in_ifsc")

            val JP_ZENGIN_CODE = of("jp_zengin_code")

            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

            val MY_BRANCH_CODE = of("my_branch_code")

            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

            val SWIFT = of("swift")

            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

            fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        /** An enum containing [RoutingNumberType]'s known values. */
        enum class Known {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IL_BANK_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SG_INTERBANK_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
        }

        /**
         * An enum containing [RoutingNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RoutingNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IL_BANK_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SG_INTERBANK_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
            /**
             * An enum member indicating that [RoutingNumberType] was instantiated with an unknown
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
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                BR_CODIGO -> Value.BR_CODIGO
                CA_CPA -> Value.CA_CPA
                CHIPS -> Value.CHIPS
                CNAPS -> Value.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Value.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                IL_BANK_CODE -> Value.IL_BANK_CODE
                IN_IFSC -> Value.IN_IFSC
                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
                SWIFT -> Value.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                BR_CODIGO -> Known.BR_CODIGO
                CA_CPA -> Known.CA_CPA
                CHIPS -> Known.CHIPS
                CNAPS -> Known.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Known.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                IL_BANK_CODE -> Known.IL_BANK_CODE
                IN_IFSC -> Known.IN_IFSC
                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                SWIFT -> Known.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown RoutingNumberType: $value")
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

        fun validate(): RoutingNumberType = apply {
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

            return other is RoutingNumberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If the routing detail is to be used for a specific payment type this field will be populated,
     * otherwise null.
     */
    class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val GB_FPS = of("gb_fps")

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
            GB_FPS,
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            GB_FPS,
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
             * An enum member indicating that [PaymentType] was instantiated with an unknown value.
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
                GB_FPS -> Value.GB_FPS
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                GB_FPS -> Known.GB_FPS
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

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

    class AccountsType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val EXTERNAL_ACCOUNTS = of("external_accounts")

            fun of(value: String) = AccountsType(JsonField.of(value))
        }

        /** An enum containing [AccountsType]'s known values. */
        enum class Known {
            EXTERNAL_ACCOUNTS
        }

        /**
         * An enum containing [AccountsType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountsType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXTERNAL_ACCOUNTS,
            /**
             * An enum member indicating that [AccountsType] was instantiated with an unknown value.
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
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
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
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                else -> throw ModernTreasuryInvalidDataException("Unknown AccountsType: $value")
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

        fun validate(): AccountsType = apply {
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

            return other is AccountsType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutingDetailCreateParams &&
            accountsType == other.accountsType &&
            accountId == other.accountId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountsType, accountId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RoutingDetailCreateParams{accountsType=$accountsType, accountId=$accountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
