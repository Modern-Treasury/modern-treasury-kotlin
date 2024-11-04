// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class TransactionListParams
constructor(
    private val afterCursor: String?,
    private val asOfDateEnd: LocalDate?,
    private val asOfDateStart: LocalDate?,
    private val counterpartyId: String?,
    private val description: String?,
    private val direction: String?,
    private val internalAccountId: String?,
    private val metadata: Metadata?,
    private val paymentType: String?,
    private val perPage: Long?,
    private val posted: Boolean?,
    private val transactableType: String?,
    private val vendorId: String?,
    private val virtualAccountId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun asOfDateEnd(): LocalDate? = asOfDateEnd

    fun asOfDateStart(): LocalDate? = asOfDateStart

    fun counterpartyId(): String? = counterpartyId

    fun description(): String? = description

    fun direction(): String? = direction

    fun internalAccountId(): String? = internalAccountId

    fun metadata(): Metadata? = metadata

    fun paymentType(): String? = paymentType

    fun perPage(): Long? = perPage

    fun posted(): Boolean? = posted

    fun transactableType(): String? = transactableType

    fun vendorId(): String? = vendorId

    fun virtualAccountId(): String? = virtualAccountId

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.asOfDateEnd?.let { params.put("as_of_date_end", listOf(it.toString())) }
        this.asOfDateStart?.let { params.put("as_of_date_start", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.description?.let { params.put("description", listOf(it.toString())) }
        this.direction?.let { params.put("direction", listOf(it.toString())) }
        this.internalAccountId?.let { params.put("internal_account_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.paymentType?.let { params.put("payment_type", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.posted?.let { params.put("posted", listOf(it.toString())) }
        this.transactableType?.let { params.put("transactable_type", listOf(it.toString())) }
        this.vendorId?.let { params.put("vendor_id", listOf(it.toString())) }
        this.virtualAccountId?.let { params.put("virtual_account_id", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListParams && this.afterCursor == other.afterCursor && this.asOfDateEnd == other.asOfDateEnd && this.asOfDateStart == other.asOfDateStart && this.counterpartyId == other.counterpartyId && this.description == other.description && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.metadata == other.metadata && this.paymentType == other.paymentType && this.perPage == other.perPage && this.posted == other.posted && this.transactableType == other.transactableType && this.vendorId == other.vendorId && this.virtualAccountId == other.virtualAccountId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, asOfDateEnd, asOfDateStart, counterpartyId, description, direction, internalAccountId, metadata, paymentType, perPage, posted, transactableType, vendorId, virtualAccountId, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "TransactionListParams{afterCursor=$afterCursor, asOfDateEnd=$asOfDateEnd, asOfDateStart=$asOfDateStart, counterpartyId=$counterpartyId, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, paymentType=$paymentType, perPage=$perPage, posted=$posted, transactableType=$transactableType, vendorId=$vendorId, virtualAccountId=$virtualAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var asOfDateEnd: LocalDate? = null
        private var asOfDateStart: LocalDate? = null
        private var counterpartyId: String? = null
        private var description: String? = null
        private var direction: String? = null
        private var internalAccountId: String? = null
        private var metadata: Metadata? = null
        private var paymentType: String? = null
        private var perPage: Long? = null
        private var posted: Boolean? = null
        private var transactableType: String? = null
        private var vendorId: String? = null
        private var virtualAccountId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(transactionListParams: TransactionListParams) = apply {
            this.afterCursor = transactionListParams.afterCursor
            this.asOfDateEnd = transactionListParams.asOfDateEnd
            this.asOfDateStart = transactionListParams.asOfDateStart
            this.counterpartyId = transactionListParams.counterpartyId
            this.description = transactionListParams.description
            this.direction = transactionListParams.direction
            this.internalAccountId = transactionListParams.internalAccountId
            this.metadata = transactionListParams.metadata
            this.paymentType = transactionListParams.paymentType
            this.perPage = transactionListParams.perPage
            this.posted = transactionListParams.posted
            this.transactableType = transactionListParams.transactableType
            this.vendorId = transactionListParams.vendorId
            this.virtualAccountId = transactionListParams.virtualAccountId
            additionalHeaders(transactionListParams.additionalHeaders)
            additionalQueryParams(transactionListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * Filters transactions with an `as_of_date` starting on or before the specified date
         * (YYYY-MM-DD).
         */
        fun asOfDateEnd(asOfDateEnd: LocalDate) = apply { this.asOfDateEnd = asOfDateEnd }

        /**
         * Filters transactions with an `as_of_date` starting on or after the specified date
         * (YYYY-MM-DD).
         */
        fun asOfDateStart(asOfDateStart: LocalDate) = apply { this.asOfDateStart = asOfDateStart }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Filters for transactions including the queried string in the description. */
        fun description(description: String) = apply { this.description = description }

        fun direction(direction: String) = apply { this.direction = direction }

        /**
         * Specify `internal_account_id` if you wish to see transactions to/from a specific account.
         */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun paymentType(paymentType: String) = apply { this.paymentType = paymentType }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** Either `true` or `false`. */
        fun posted(posted: Boolean) = apply { this.posted = posted }

        fun transactableType(transactableType: String) = apply {
            this.transactableType = transactableType
        }

        /**
         * Filters for transactions including the queried vendor id (an identifier given to
         * transactions by the bank).
         */
        fun vendorId(vendorId: String) = apply { this.vendorId = vendorId }

        fun virtualAccountId(virtualAccountId: String) = apply {
            this.virtualAccountId = virtualAccountId
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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): TransactionListParams =
            TransactionListParams(
                afterCursor,
                asOfDateEnd,
                asOfDateStart,
                counterpartyId,
                description,
                direction,
                internalAccountId,
                metadata,
                paymentType,
                perPage,
                posted,
                transactableType,
                vendorId,
                virtualAccountId,
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
}
