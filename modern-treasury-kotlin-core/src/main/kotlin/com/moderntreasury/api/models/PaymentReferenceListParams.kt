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

class PaymentReferenceListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val referenceableId: String?,
    private val referenceableType: ReferenceableType?,
    private val referenceNumber: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun referenceableId(): String? = referenceableId

    fun referenceableType(): ReferenceableType? = referenceableType

    fun referenceNumber(): String? = referenceNumber

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.referenceableId?.let { params.put("referenceable_id", listOf(it.toString())) }
        this.referenceableType?.let { params.put("referenceable_type", listOf(it.toString())) }
        this.referenceNumber?.let { params.put("reference_number", listOf(it.toString())) }
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

        return other is PaymentReferenceListParams &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.referenceableId == other.referenceableId &&
            this.referenceableType == other.referenceableType &&
            this.referenceNumber == other.referenceNumber &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            perPage,
            referenceableId,
            referenceableType,
            referenceNumber,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "PaymentReferenceListParams{afterCursor=$afterCursor, perPage=$perPage, referenceableId=$referenceableId, referenceableType=$referenceableType, referenceNumber=$referenceNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var referenceableId: String? = null
        private var referenceableType: ReferenceableType? = null
        private var referenceNumber: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(paymentReferenceListParams: PaymentReferenceListParams) = apply {
            this.afterCursor = paymentReferenceListParams.afterCursor
            this.perPage = paymentReferenceListParams.perPage
            this.referenceableId = paymentReferenceListParams.referenceableId
            this.referenceableType = paymentReferenceListParams.referenceableType
            this.referenceNumber = paymentReferenceListParams.referenceNumber
            additionalQueryParams(paymentReferenceListParams.additionalQueryParams)
            additionalHeaders(paymentReferenceListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * The id of the referenceable to search for. Must be accompanied by the referenceable_type
         * or will return an error.
         */
        fun referenceableId(referenceableId: String) = apply {
            this.referenceableId = referenceableId
        }

        /**
         * One of the referenceable types. This must be accompanied by the id of the referenceable
         * or will return an error.
         */
        fun referenceableType(referenceableType: ReferenceableType) = apply {
            this.referenceableType = referenceableType
        }

        /** The actual reference number assigned by the bank. */
        fun referenceNumber(referenceNumber: String) = apply {
            this.referenceNumber = referenceNumber
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

        fun build(): PaymentReferenceListParams =
            PaymentReferenceListParams(
                afterCursor,
                perPage,
                referenceableId,
                referenceableType,
                referenceNumber,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class ReferenceableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReferenceableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PAYMENT_ORDER = ReferenceableType(JsonField.of("payment_order"))

            val RETURN = ReferenceableType(JsonField.of("return"))

            val REVERSAL = ReferenceableType(JsonField.of("reversal"))

            fun of(value: String) = ReferenceableType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReferenceableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
