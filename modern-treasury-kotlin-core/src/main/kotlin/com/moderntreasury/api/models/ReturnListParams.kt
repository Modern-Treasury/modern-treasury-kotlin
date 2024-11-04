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

class ReturnListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val internalAccountId: String?,
    private val perPage: Long?,
    private val returnableId: String?,
    private val returnableType: ReturnableType?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun counterpartyId(): String? = counterpartyId

    fun internalAccountId(): String? = internalAccountId

    fun perPage(): Long? = perPage

    fun returnableId(): String? = returnableId

    fun returnableType(): ReturnableType? = returnableType

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.internalAccountId?.let { params.put("internal_account_id", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.returnableId?.let { params.put("returnable_id", listOf(it.toString())) }
        this.returnableType?.let { params.put("returnable_type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnListParams && this.afterCursor == other.afterCursor && this.counterpartyId == other.counterpartyId && this.internalAccountId == other.internalAccountId && this.perPage == other.perPage && this.returnableId == other.returnableId && this.returnableType == other.returnableType && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, counterpartyId, internalAccountId, perPage, returnableId, returnableType, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ReturnListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, internalAccountId=$internalAccountId, perPage=$perPage, returnableId=$returnableId, returnableType=$returnableType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(returnListParams: ReturnListParams) = apply {
            this.afterCursor = returnListParams.afterCursor
            this.counterpartyId = returnListParams.counterpartyId
            this.internalAccountId = returnListParams.internalAccountId
            this.perPage = returnListParams.perPage
            this.returnableId = returnListParams.returnableId
            this.returnableType = returnListParams.returnableType
            additionalHeaders(returnListParams.additionalHeaders)
            additionalQueryParams(returnListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * Specify `counterparty_id` if you wish to see returns that occurred with a specific
         * counterparty.
         */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Specify `internal_account_id` if you wish to see returns to/from a specific account. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** The ID of a valid returnable. Must be accompanied by `returnable_type`. */
        fun returnableId(returnableId: String) = apply { this.returnableId = returnableId }

        /**
         * One of `payment_order`, `paper_item`, `reversal`, or `incoming_payment_detail`. Must be
         * accompanied by `returnable_id`.
         */
        fun returnableType(returnableType: ReturnableType) = apply {
            this.returnableType = returnableType
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

        fun build(): ReturnListParams =
            ReturnListParams(
                afterCursor,
                counterpartyId,
                internalAccountId,
                perPage,
                returnableId,
                returnableType,
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

    class ReturnableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnableType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INCOMING_PAYMENT_DETAIL = ReturnableType(JsonField.of("incoming_payment_detail"))

            val PAPER_ITEM = ReturnableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = ReturnableType(JsonField.of("payment_order"))

            val RETURN = ReturnableType(JsonField.of("return"))

            val REVERSAL = ReturnableType(JsonField.of("reversal"))

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
    }
}
