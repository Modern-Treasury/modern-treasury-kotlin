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

class LineItemRetrieveParams
constructor(
    private val itemizableType: ItemizableType,
    private val itemizableId: String,
    private val id: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun itemizableType(): ItemizableType = itemizableType

    fun itemizableId(): String = itemizableId

    fun id(): String = id

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> itemizableType.toString()
            1 -> itemizableId
            2 -> id
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LineItemRetrieveParams &&
            this.itemizableType == other.itemizableType &&
            this.itemizableId == other.itemizableId &&
            this.id == other.id &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            itemizableType,
            itemizableId,
            id,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "LineItemRetrieveParams{itemizableType=$itemizableType, itemizableId=$itemizableId, id=$id, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var itemizableType: ItemizableType? = null
        private var itemizableId: String? = null
        private var id: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(lineItemRetrieveParams: LineItemRetrieveParams) = apply {
            this.itemizableType = lineItemRetrieveParams.itemizableType
            this.itemizableId = lineItemRetrieveParams.itemizableId
            this.id = lineItemRetrieveParams.id
            additionalQueryParams(lineItemRetrieveParams.additionalQueryParams)
            additionalHeaders(lineItemRetrieveParams.additionalHeaders)
        }

        fun itemizableType(itemizableType: ItemizableType) = apply {
            this.itemizableType = itemizableType
        }

        fun itemizableId(itemizableId: String) = apply { this.itemizableId = itemizableId }

        fun id(id: String) = apply { this.id = id }

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

        fun build(): LineItemRetrieveParams =
            LineItemRetrieveParams(
                checkNotNull(itemizableType) { "`itemizableType` is required but was not set" },
                checkNotNull(itemizableId) { "`itemizableId` is required but was not set" },
                checkNotNull(id) { "`id` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class ItemizableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ItemizableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EXPECTED_PAYMENTS = ItemizableType(JsonField.of("expected_payments"))

            val PAYMENT_ORDERS = ItemizableType(JsonField.of("payment_orders"))

            fun of(value: String) = ItemizableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENTS,
            PAYMENT_ORDERS,
        }

        enum class Value {
            EXPECTED_PAYMENTS,
            PAYMENT_ORDERS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                else -> throw ModernTreasuryInvalidDataException("Unknown ItemizableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
