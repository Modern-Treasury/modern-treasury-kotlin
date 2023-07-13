package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class DocumentListParams
constructor(
    private val documentableId: String?,
    private val documentableType: DocumentableType?,
    private val afterCursor: String?,
    private val perPage: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun documentableId(): String? = documentableId

    fun documentableType(): DocumentableType? = documentableType

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.documentableId?.let { params.put("documentable_id", listOf(it.toString())) }
        this.documentableType?.let { params.put("documentable_type", listOf(it.toString())) }
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
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

        return other is DocumentListParams &&
            this.documentableId == other.documentableId &&
            this.documentableType == other.documentableType &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            documentableId,
            documentableType,
            afterCursor,
            perPage,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "DocumentListParams{documentableId=$documentableId, documentableType=$documentableType, afterCursor=$afterCursor, perPage=$perPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var documentableId: String? = null
        private var documentableType: DocumentableType? = null
        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(documentListParams: DocumentListParams) = apply {
            this.documentableId = documentListParams.documentableId
            this.documentableType = documentListParams.documentableType
            this.afterCursor = documentListParams.afterCursor
            this.perPage = documentListParams.perPage
            additionalQueryParams(documentListParams.additionalQueryParams)
            additionalHeaders(documentListParams.additionalHeaders)
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = apply { this.documentableId = documentableId }

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: DocumentableType) = apply {
            this.documentableType = documentableType
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

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

        fun build(): DocumentListParams =
            DocumentListParams(
                documentableId,
                documentableType,
                afterCursor,
                perPage,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class DocumentableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CASES = DocumentableType(JsonField.of("cases"))

            val COUNTERPARTIES = DocumentableType(JsonField.of("counterparties"))

            val EXPECTED_PAYMENTS = DocumentableType(JsonField.of("expected_payments"))

            val EXTERNAL_ACCOUNTS = DocumentableType(JsonField.of("external_accounts"))

            val INTERNAL_ACCOUNTS = DocumentableType(JsonField.of("internal_accounts"))

            val ORGANIZATIONS = DocumentableType(JsonField.of("organizations"))

            val PAPER_ITEMS = DocumentableType(JsonField.of("paper_items"))

            val PAYMENT_ORDERS = DocumentableType(JsonField.of("payment_orders"))

            val TRANSACTIONS = DocumentableType(JsonField.of("transactions"))

            val DECISIONS = DocumentableType(JsonField.of("decisions"))

            val CONNECTIONS = DocumentableType(JsonField.of("connections"))

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        enum class Known {
            CASES,
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAPER_ITEMS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
            DECISIONS,
            CONNECTIONS,
        }

        enum class Value {
            CASES,
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAPER_ITEMS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
            DECISIONS,
            CONNECTIONS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CASES -> Value.CASES
                COUNTERPARTIES -> Value.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                INTERNAL_ACCOUNTS -> Value.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Value.ORGANIZATIONS
                PAPER_ITEMS -> Value.PAPER_ITEMS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                TRANSACTIONS -> Value.TRANSACTIONS
                DECISIONS -> Value.DECISIONS
                CONNECTIONS -> Value.CONNECTIONS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CASES -> Known.CASES
                COUNTERPARTIES -> Known.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                INTERNAL_ACCOUNTS -> Known.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Known.ORGANIZATIONS
                PAPER_ITEMS -> Known.PAPER_ITEMS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                TRANSACTIONS -> Known.TRANSACTIONS
                DECISIONS -> Known.DECISIONS
                CONNECTIONS -> Known.CONNECTIONS
                else -> throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
