// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class InvoiceListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val dueDateEnd: LocalDate?,
    private val dueDateStart: LocalDate?,
    private val expectedPaymentId: String?,
    private val metadata: Metadata?,
    private val number: String?,
    private val originatingAccountId: String?,
    private val paymentOrderId: String?,
    private val perPage: Long?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun counterpartyId(): String? = counterpartyId

    fun dueDateEnd(): LocalDate? = dueDateEnd

    fun dueDateStart(): LocalDate? = dueDateStart

    fun expectedPaymentId(): String? = expectedPaymentId

    fun metadata(): Metadata? = metadata

    fun number(): String? = number

    fun originatingAccountId(): String? = originatingAccountId

    fun paymentOrderId(): String? = paymentOrderId

    fun perPage(): Long? = perPage

    fun status(): Status? = status

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.dueDateEnd?.let { params.put("due_date_end", listOf(it.toString())) }
        this.dueDateStart?.let { params.put("due_date_start", listOf(it.toString())) }
        this.expectedPaymentId?.let { params.put("expected_payment_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.number?.let { params.put("number", listOf(it.toString())) }
        this.originatingAccountId?.let {
            params.put("originating_account_id", listOf(it.toString()))
        }
        this.paymentOrderId?.let { params.put("payment_order_id", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
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

        return /* spotless:off */ other is InvoiceListParams && this.afterCursor == other.afterCursor && this.counterpartyId == other.counterpartyId && this.dueDateEnd == other.dueDateEnd && this.dueDateStart == other.dueDateStart && this.expectedPaymentId == other.expectedPaymentId && this.metadata == other.metadata && this.number == other.number && this.originatingAccountId == other.originatingAccountId && this.paymentOrderId == other.paymentOrderId && this.perPage == other.perPage && this.status == other.status && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, counterpartyId, dueDateEnd, dueDateStart, expectedPaymentId, metadata, number, originatingAccountId, paymentOrderId, perPage, status, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "InvoiceListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, dueDateEnd=$dueDateEnd, dueDateStart=$dueDateStart, expectedPaymentId=$expectedPaymentId, metadata=$metadata, number=$number, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, perPage=$perPage, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var counterpartyId: String? = null
        private var dueDateEnd: LocalDate? = null
        private var dueDateStart: LocalDate? = null
        private var expectedPaymentId: String? = null
        private var metadata: Metadata? = null
        private var number: String? = null
        private var originatingAccountId: String? = null
        private var paymentOrderId: String? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(invoiceListParams: InvoiceListParams) = apply {
            this.afterCursor = invoiceListParams.afterCursor
            this.counterpartyId = invoiceListParams.counterpartyId
            this.dueDateEnd = invoiceListParams.dueDateEnd
            this.dueDateStart = invoiceListParams.dueDateStart
            this.expectedPaymentId = invoiceListParams.expectedPaymentId
            this.metadata = invoiceListParams.metadata
            this.number = invoiceListParams.number
            this.originatingAccountId = invoiceListParams.originatingAccountId
            this.paymentOrderId = invoiceListParams.paymentOrderId
            this.perPage = invoiceListParams.perPage
            this.status = invoiceListParams.status
            additionalQueryParams(invoiceListParams.additionalQueryParams)
            additionalHeaders(invoiceListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** An inclusive upper bound for searching due_date */
        fun dueDateEnd(dueDateEnd: LocalDate) = apply { this.dueDateEnd = dueDateEnd }

        /** An inclusive lower bound for searching due_date */
        fun dueDateStart(dueDateStart: LocalDate) = apply { this.dueDateStart = dueDateStart }

        fun expectedPaymentId(expectedPaymentId: String) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** A unique record number assigned to each invoice that is issued. */
        fun number(number: String) = apply { this.number = number }

        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun paymentOrderId(paymentOrderId: String) = apply { this.paymentOrderId = paymentOrderId }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun status(status: Status) = apply { this.status = status }

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

        fun build(): InvoiceListParams =
            InvoiceListParams(
                afterCursor,
                counterpartyId,
                dueDateEnd,
                dueDateStart,
                expectedPaymentId,
                metadata,
                number,
                originatingAccountId,
                paymentOrderId,
                perPage,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DRAFT = Status(JsonField.of("draft"))

            val PAID = Status(JsonField.of("paid"))

            val PARTIALLY_PAID = Status(JsonField.of("partially_paid"))

            val PAYMENT_PENDING = Status(JsonField.of("payment_pending"))

            val UNPAID = Status(JsonField.of("unpaid"))

            val VOIDED = Status(JsonField.of("voided"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
        }

        enum class Value {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                PAID -> Value.PAID
                PARTIALLY_PAID -> Value.PARTIALLY_PAID
                PAYMENT_PENDING -> Value.PAYMENT_PENDING
                UNPAID -> Value.UNPAID
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                PAID -> Known.PAID
                PARTIALLY_PAID -> Known.PARTIALLY_PAID
                PAYMENT_PENDING -> Known.PAYMENT_PENDING
                UNPAID -> Known.UNPAID
                VOIDED -> Known.VOIDED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
