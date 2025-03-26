// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.util.Objects

/** list payment_flows */
class PaymentFlowListParams
private constructor(
    private val afterCursor: String?,
    private val clientToken: String?,
    private val counterpartyId: String?,
    private val originatingAccountId: String?,
    private val paymentOrderId: String?,
    private val perPage: Long?,
    private val receivingAccountId: String?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): String? = afterCursor

    fun clientToken(): String? = clientToken

    fun counterpartyId(): String? = counterpartyId

    fun originatingAccountId(): String? = originatingAccountId

    fun paymentOrderId(): String? = paymentOrderId

    fun perPage(): Long? = perPage

    fun receivingAccountId(): String? = receivingAccountId

    fun status(): String? = status

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PaymentFlowListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PaymentFlowListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PaymentFlowListParams]. */
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var clientToken: String? = null
        private var counterpartyId: String? = null
        private var originatingAccountId: String? = null
        private var paymentOrderId: String? = null
        private var perPage: Long? = null
        private var receivingAccountId: String? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentFlowListParams: PaymentFlowListParams) = apply {
            afterCursor = paymentFlowListParams.afterCursor
            clientToken = paymentFlowListParams.clientToken
            counterpartyId = paymentFlowListParams.counterpartyId
            originatingAccountId = paymentFlowListParams.originatingAccountId
            paymentOrderId = paymentFlowListParams.paymentOrderId
            perPage = paymentFlowListParams.perPage
            receivingAccountId = paymentFlowListParams.receivingAccountId
            status = paymentFlowListParams.status
            additionalHeaders = paymentFlowListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentFlowListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        fun clientToken(clientToken: String?) = apply { this.clientToken = clientToken }

        fun counterpartyId(counterpartyId: String?) = apply { this.counterpartyId = counterpartyId }

        fun originatingAccountId(originatingAccountId: String?) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun paymentOrderId(paymentOrderId: String?) = apply { this.paymentOrderId = paymentOrderId }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        fun receivingAccountId(receivingAccountId: String?) = apply {
            this.receivingAccountId = receivingAccountId
        }

        fun status(status: String?) = apply { this.status = status }

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
         * Returns an immutable instance of [PaymentFlowListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PaymentFlowListParams =
            PaymentFlowListParams(
                afterCursor,
                clientToken,
                counterpartyId,
                originatingAccountId,
                paymentOrderId,
                perPage,
                receivingAccountId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterCursor?.let { put("after_cursor", it) }
                clientToken?.let { put("client_token", it) }
                counterpartyId?.let { put("counterparty_id", it) }
                originatingAccountId?.let { put("originating_account_id", it) }
                paymentOrderId?.let { put("payment_order_id", it) }
                perPage?.let { put("per_page", it.toString()) }
                receivingAccountId?.let { put("receiving_account_id", it) }
                status?.let { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowListParams && afterCursor == other.afterCursor && clientToken == other.clientToken && counterpartyId == other.counterpartyId && originatingAccountId == other.originatingAccountId && paymentOrderId == other.paymentOrderId && perPage == other.perPage && receivingAccountId == other.receivingAccountId && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, clientToken, counterpartyId, originatingAccountId, paymentOrderId, perPage, receivingAccountId, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentFlowListParams{afterCursor=$afterCursor, clientToken=$clientToken, counterpartyId=$counterpartyId, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, perPage=$perPage, receivingAccountId=$receivingAccountId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
