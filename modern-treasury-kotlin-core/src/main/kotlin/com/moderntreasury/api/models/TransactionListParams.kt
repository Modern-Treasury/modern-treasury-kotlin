// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects

/** Get a list of all transactions. */
class TransactionListParams
private constructor(
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): String? = afterCursor

    /**
     * Filters transactions with an `as_of_date` starting on or before the specified date
     * (YYYY-MM-DD).
     */
    fun asOfDateEnd(): LocalDate? = asOfDateEnd

    /**
     * Filters transactions with an `as_of_date` starting on or after the specified date
     * (YYYY-MM-DD).
     */
    fun asOfDateStart(): LocalDate? = asOfDateStart

    fun counterpartyId(): String? = counterpartyId

    /** Filters for transactions including the queried string in the description. */
    fun description(): String? = description

    fun direction(): String? = direction

    /** Specify `internal_account_id` if you wish to see transactions to/from a specific account. */
    fun internalAccountId(): String? = internalAccountId

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Metadata? = metadata

    fun paymentType(): String? = paymentType

    fun perPage(): Long? = perPage

    /** Either `true` or `false`. */
    fun posted(): Boolean? = posted

    fun transactableType(): String? = transactableType

    /**
     * Filters for transactions including the queried vendor id (an identifier given to transactions
     * by the bank).
     */
    fun vendorId(): String? = vendorId

    fun virtualAccountId(): String? = virtualAccountId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TransactionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TransactionListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TransactionListParams]. */
    class Builder internal constructor() {

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionListParams: TransactionListParams) = apply {
            afterCursor = transactionListParams.afterCursor
            asOfDateEnd = transactionListParams.asOfDateEnd
            asOfDateStart = transactionListParams.asOfDateStart
            counterpartyId = transactionListParams.counterpartyId
            description = transactionListParams.description
            direction = transactionListParams.direction
            internalAccountId = transactionListParams.internalAccountId
            metadata = transactionListParams.metadata
            paymentType = transactionListParams.paymentType
            perPage = transactionListParams.perPage
            posted = transactionListParams.posted
            transactableType = transactionListParams.transactableType
            vendorId = transactionListParams.vendorId
            virtualAccountId = transactionListParams.virtualAccountId
            additionalHeaders = transactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /**
         * Filters transactions with an `as_of_date` starting on or before the specified date
         * (YYYY-MM-DD).
         */
        fun asOfDateEnd(asOfDateEnd: LocalDate?) = apply { this.asOfDateEnd = asOfDateEnd }

        /**
         * Filters transactions with an `as_of_date` starting on or after the specified date
         * (YYYY-MM-DD).
         */
        fun asOfDateStart(asOfDateStart: LocalDate?) = apply { this.asOfDateStart = asOfDateStart }

        fun counterpartyId(counterpartyId: String?) = apply { this.counterpartyId = counterpartyId }

        /** Filters for transactions including the queried string in the description. */
        fun description(description: String?) = apply { this.description = description }

        fun direction(direction: String?) = apply { this.direction = direction }

        /**
         * Specify `internal_account_id` if you wish to see transactions to/from a specific account.
         */
        fun internalAccountId(internalAccountId: String?) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        fun paymentType(paymentType: String?) = apply { this.paymentType = paymentType }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Either `true` or `false`. */
        fun posted(posted: Boolean?) = apply { this.posted = posted }

        /**
         * Alias for [Builder.posted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun posted(posted: Boolean) = posted(posted as Boolean?)

        fun transactableType(transactableType: String?) = apply {
            this.transactableType = transactableType
        }

        /**
         * Filters for transactions including the queried vendor id (an identifier given to
         * transactions by the bank).
         */
        fun vendorId(vendorId: String?) = apply { this.vendorId = vendorId }

        fun virtualAccountId(virtualAccountId: String?) = apply {
            this.virtualAccountId = virtualAccountId
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

        /**
         * Returns an immutable instance of [TransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterCursor?.let { put("after_cursor", it) }
                asOfDateEnd?.let { put("as_of_date_end", it.toString()) }
                asOfDateStart?.let { put("as_of_date_start", it.toString()) }
                counterpartyId?.let { put("counterparty_id", it) }
                description?.let { put("description", it) }
                direction?.let { put("direction", it) }
                internalAccountId?.let { put("internal_account_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                paymentType?.let { put("payment_type", it) }
                perPage?.let { put("per_page", it.toString()) }
                posted?.let { put("posted", it.toString()) }
                transactableType?.let { put("transactable_type", it) }
                vendorId?.let { put("vendor_id", it) }
                virtualAccountId?.let { put("virtual_account_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListParams && afterCursor == other.afterCursor && asOfDateEnd == other.asOfDateEnd && asOfDateStart == other.asOfDateStart && counterpartyId == other.counterpartyId && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && metadata == other.metadata && paymentType == other.paymentType && perPage == other.perPage && posted == other.posted && transactableType == other.transactableType && vendorId == other.vendorId && virtualAccountId == other.virtualAccountId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, asOfDateEnd, asOfDateStart, counterpartyId, description, direction, internalAccountId, metadata, paymentType, perPage, posted, transactableType, vendorId, virtualAccountId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionListParams{afterCursor=$afterCursor, asOfDateEnd=$asOfDateEnd, asOfDateStart=$asOfDateStart, counterpartyId=$counterpartyId, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, paymentType=$paymentType, perPage=$perPage, posted=$posted, transactableType=$transactableType, vendorId=$vendorId, virtualAccountId=$virtualAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
