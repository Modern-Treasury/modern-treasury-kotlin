// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun referenceNumber(): String? = referenceNumber

    fun referenceableId(): String? = referenceableId

    fun referenceableType(): ReferenceableType? = referenceableType

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.referenceNumber?.let { queryParams.put("reference_number", listOf(it.toString())) }
        this.referenceableId?.let { queryParams.put("referenceable_id", listOf(it.toString())) }
        this.referenceableType?.let { queryParams.put("referenceable_type", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentReferenceListParams: PaymentReferenceListParams) = apply {
            afterCursor = paymentReferenceListParams.afterCursor
            perPage = paymentReferenceListParams.perPage
            referenceNumber = paymentReferenceListParams.referenceNumber
            referenceableId = paymentReferenceListParams.referenceableId
            referenceableType = paymentReferenceListParams.referenceableType
            additionalHeaders = paymentReferenceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentReferenceListParams.additionalQueryParams.toBuilder()
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

        fun build(): PaymentReferenceListParams =
            PaymentReferenceListParams(
                afterCursor,
                perPage,
                referenceNumber,
                referenceableId,
                referenceableType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ReferenceableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PAYMENT_ORDER = of("payment_order")

            val RETURN = of("return")

            val REVERSAL = of("reversal")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReferenceableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentReferenceListParams && afterCursor == other.afterCursor && perPage == other.perPage && referenceNumber == other.referenceNumber && referenceableId == other.referenceableId && referenceableType == other.referenceableType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, perPage, referenceNumber, referenceableId, referenceableType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentReferenceListParams{afterCursor=$afterCursor, perPage=$perPage, referenceNumber=$referenceNumber, referenceableId=$referenceableId, referenceableType=$referenceableType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
