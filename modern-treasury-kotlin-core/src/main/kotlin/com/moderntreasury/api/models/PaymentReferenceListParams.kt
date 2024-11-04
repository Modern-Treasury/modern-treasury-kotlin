// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class PaymentReferenceListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val referenceNumber: String?,
    private val referenceableId: String?,
    private val referenceableType: ReferenceableType?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun referenceNumber(): String? = referenceNumber

    fun referenceableId(): String? = referenceableId

    fun referenceableType(): ReferenceableType? = referenceableType

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.referenceNumber?.let { params.put("reference_number", listOf(it.toString())) }
        this.referenceableId?.let { params.put("referenceable_id", listOf(it.toString())) }
        this.referenceableType?.let { params.put("referenceable_type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentReferenceListParams && this.afterCursor == other.afterCursor && this.perPage == other.perPage && this.referenceNumber == other.referenceNumber && this.referenceableId == other.referenceableId && this.referenceableType == other.referenceableType && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, perPage, referenceNumber, referenceableId, referenceableType, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "PaymentReferenceListParams{afterCursor=$afterCursor, perPage=$perPage, referenceNumber=$referenceNumber, referenceableId=$referenceableId, referenceableType=$referenceableType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var referenceNumber: String? = null
        private var referenceableId: String? = null
        private var referenceableType: ReferenceableType? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(paymentReferenceListParams: PaymentReferenceListParams) = apply {
            this.afterCursor = paymentReferenceListParams.afterCursor
            this.perPage = paymentReferenceListParams.perPage
            this.referenceNumber = paymentReferenceListParams.referenceNumber
            this.referenceableId = paymentReferenceListParams.referenceableId
            this.referenceableType = paymentReferenceListParams.referenceableType
            additionalHeaders(paymentReferenceListParams.additionalHeaders)
            additionalQueryParams(paymentReferenceListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** The actual reference number assigned by the bank. */
        fun referenceNumber(referenceNumber: String) = apply {
            this.referenceNumber = referenceNumber
        }

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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): PaymentReferenceListParams =
            PaymentReferenceListParams(
                afterCursor,
                perPage,
                referenceNumber,
                referenceableId,
                referenceableType,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }

    class ReferenceableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReferenceableType && this.value == other.value /* spotless:on */
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
