// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class ValidationValidateRoutingNumberParams
constructor(
    private val routingNumber: String,
    private val routingNumberType: RoutingNumberType,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun routingNumber(): String = routingNumber

    fun routingNumberType(): RoutingNumberType = routingNumberType

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.routingNumber.let { params.put("routing_number", listOf(it.toString())) }
        this.routingNumberType.let { params.put("routing_number_type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValidationValidateRoutingNumberParams &&
            this.routingNumber == other.routingNumber &&
            this.routingNumberType == other.routingNumberType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            routingNumber,
            routingNumberType,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ValidationValidateRoutingNumberParams{routingNumber=$routingNumber, routingNumberType=$routingNumberType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routingNumber: String? = null
        private var routingNumberType: RoutingNumberType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            validationValidateRoutingNumberParams: ValidationValidateRoutingNumberParams
        ) = apply {
            this.routingNumber = validationValidateRoutingNumberParams.routingNumber
            this.routingNumberType = validationValidateRoutingNumberParams.routingNumberType
            additionalQueryParams(validationValidateRoutingNumberParams.additionalQueryParams)
            additionalHeaders(validationValidateRoutingNumberParams.additionalHeaders)
        }

        /** The routing number that is being validated. */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

        /**
         * One of `aba`, `au_bsb`, `br_codigo`, `ca_cpa`, `cnaps`, `gb_sort_code`, `in_ifsc`,
         * `my_branch_code`, `se_bankgiro_clearing_code`, or `swift`. In sandbox mode we currently
         * only support `aba` and `swift` with routing numbers '123456789' and 'GRINUST0XXX'
         * respectively.
         */
        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
            this.routingNumberType = routingNumberType
        }

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

        fun build(): ValidationValidateRoutingNumberParams =
            ValidationValidateRoutingNumberParams(
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                checkNotNull(routingNumberType) {
                    "`routingNumberType` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class RoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoutingNumberType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ABA = RoutingNumberType(JsonField.of("aba"))

            val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

            val BR_CODIGO = RoutingNumberType(JsonField.of("br_codigo"))

            val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

            val CHIPS = RoutingNumberType(JsonField.of("chips"))

            val CNAPS = RoutingNumberType(JsonField.of("cnaps"))

            val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

            val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

            val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

            val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

            val SE_BANKGIRO_CLEARING_CODE =
                RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

            val SWIFT = RoutingNumberType(JsonField.of("swift"))

            fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        enum class Known {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            GB_SORT_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MY_BRANCH_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
        }

        enum class Value {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            GB_SORT_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MY_BRANCH_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                BR_CODIGO -> Value.BR_CODIGO
                CA_CPA -> Value.CA_CPA
                CHIPS -> Value.CHIPS
                CNAPS -> Value.CNAPS
                GB_SORT_CODE -> Value.GB_SORT_CODE
                IN_IFSC -> Value.IN_IFSC
                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Value.SWIFT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                BR_CODIGO -> Known.BR_CODIGO
                CA_CPA -> Known.CA_CPA
                CHIPS -> Known.CHIPS
                CNAPS -> Known.CNAPS
                GB_SORT_CODE -> Known.GB_SORT_CODE
                IN_IFSC -> Known.IN_IFSC
                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown RoutingNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
