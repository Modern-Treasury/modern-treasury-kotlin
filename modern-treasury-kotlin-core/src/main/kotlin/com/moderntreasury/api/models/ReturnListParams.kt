// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

class ReturnListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val internalAccountId: String?,
    private val perPage: Long?,
    private val returnableId: String?,
    private val returnableType: ReturnableType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): String? = afterCursor

    /**
     * Specify `counterparty_id` if you wish to see returns that occurred with a specific
     * counterparty.
     */
    fun counterpartyId(): String? = counterpartyId

    /** Specify `internal_account_id` if you wish to see returns to/from a specific account. */
    fun internalAccountId(): String? = internalAccountId

    fun perPage(): Long? = perPage

    /** The ID of a valid returnable. Must be accompanied by `returnable_type`. */
    fun returnableId(): String? = returnableId

    /**
     * One of `payment_order`, `paper_item`, `reversal`, or `incoming_payment_detail`. Must be
     * accompanied by `returnable_id`.
     */
    fun returnableType(): ReturnableType? = returnableType

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { queryParams.put("counterparty_id", listOf(it.toString())) }
        this.internalAccountId?.let {
            queryParams.put("internal_account_id", listOf(it.toString()))
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.returnableId?.let { queryParams.put("returnable_id", listOf(it.toString())) }
        this.returnableType?.let { queryParams.put("returnable_type", listOf(it.toString())) }
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
        private var counterpartyId: String? = null
        private var internalAccountId: String? = null
        private var perPage: Long? = null
        private var returnableId: String? = null
        private var returnableType: ReturnableType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(returnListParams: ReturnListParams) = apply {
            afterCursor = returnListParams.afterCursor
            counterpartyId = returnListParams.counterpartyId
            internalAccountId = returnListParams.internalAccountId
            perPage = returnListParams.perPage
            returnableId = returnListParams.returnableId
            returnableType = returnListParams.returnableType
            additionalHeaders = returnListParams.additionalHeaders.toBuilder()
            additionalQueryParams = returnListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /**
         * Specify `counterparty_id` if you wish to see returns that occurred with a specific
         * counterparty.
         */
        fun counterpartyId(counterpartyId: String?) = apply { this.counterpartyId = counterpartyId }

        /** Specify `internal_account_id` if you wish to see returns to/from a specific account. */
        fun internalAccountId(internalAccountId: String?) = apply {
            this.internalAccountId = internalAccountId
        }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** The ID of a valid returnable. Must be accompanied by `returnable_type`. */
        fun returnableId(returnableId: String?) = apply { this.returnableId = returnableId }

        /**
         * One of `payment_order`, `paper_item`, `reversal`, or `incoming_payment_detail`. Must be
         * accompanied by `returnable_id`.
         */
        fun returnableType(returnableType: ReturnableType?) = apply {
            this.returnableType = returnableType
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

        fun build(): ReturnListParams =
            ReturnListParams(
                afterCursor,
                counterpartyId,
                internalAccountId,
                perPage,
                returnableId,
                returnableType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ReturnableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val PAPER_ITEM = of("paper_item")

            val PAYMENT_ORDER = of("payment_order")

            val RETURN = of("return")

            val REVERSAL = of("reversal")

            fun of(value: String) = ReturnableType(JsonField.of(value))
        }

        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown ReturnableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnListParams && afterCursor == other.afterCursor && counterpartyId == other.counterpartyId && internalAccountId == other.internalAccountId && perPage == other.perPage && returnableId == other.returnableId && returnableType == other.returnableType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, counterpartyId, internalAccountId, perPage, returnableId, returnableType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ReturnListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, internalAccountId=$internalAccountId, perPage=$perPage, returnableId=$returnableId, returnableType=$returnableType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
