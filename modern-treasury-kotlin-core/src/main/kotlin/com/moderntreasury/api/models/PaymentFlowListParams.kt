package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects

class PaymentFlowListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val clientToken: String?,
    private val status: String?,
    private val counterpartyId: String?,
    private val receivingAccountId: String?,
    private val originatingAccountId: String?,
    private val paymentOrderId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun clientToken(): String? = clientToken

    fun status(): String? = status

    fun counterpartyId(): String? = counterpartyId

    fun receivingAccountId(): String? = receivingAccountId

    fun originatingAccountId(): String? = originatingAccountId

    fun paymentOrderId(): String? = paymentOrderId

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.clientToken?.let { params.put("client_token", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.receivingAccountId?.let { params.put("receiving_account_id", listOf(it.toString())) }
        this.originatingAccountId?.let {
            params.put("originating_account_id", listOf(it.toString()))
        }
        this.paymentOrderId?.let { params.put("payment_order_id", listOf(it.toString())) }
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

        return other is PaymentFlowListParams &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.clientToken == other.clientToken &&
            this.status == other.status &&
            this.counterpartyId == other.counterpartyId &&
            this.receivingAccountId == other.receivingAccountId &&
            this.originatingAccountId == other.originatingAccountId &&
            this.paymentOrderId == other.paymentOrderId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            perPage,
            clientToken,
            status,
            counterpartyId,
            receivingAccountId,
            originatingAccountId,
            paymentOrderId,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "PaymentFlowListParams{afterCursor=$afterCursor, perPage=$perPage, clientToken=$clientToken, status=$status, counterpartyId=$counterpartyId, receivingAccountId=$receivingAccountId, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var clientToken: String? = null
        private var status: String? = null
        private var counterpartyId: String? = null
        private var receivingAccountId: String? = null
        private var originatingAccountId: String? = null
        private var paymentOrderId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(paymentFlowListParams: PaymentFlowListParams) = apply {
            this.afterCursor = paymentFlowListParams.afterCursor
            this.perPage = paymentFlowListParams.perPage
            this.clientToken = paymentFlowListParams.clientToken
            this.status = paymentFlowListParams.status
            this.counterpartyId = paymentFlowListParams.counterpartyId
            this.receivingAccountId = paymentFlowListParams.receivingAccountId
            this.originatingAccountId = paymentFlowListParams.originatingAccountId
            this.paymentOrderId = paymentFlowListParams.paymentOrderId
            additionalQueryParams(paymentFlowListParams.additionalQueryParams)
            additionalHeaders(paymentFlowListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun clientToken(clientToken: String) = apply { this.clientToken = clientToken }

        fun status(status: String) = apply { this.status = status }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun receivingAccountId(receivingAccountId: String) = apply {
            this.receivingAccountId = receivingAccountId
        }

        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun paymentOrderId(paymentOrderId: String) = apply { this.paymentOrderId = paymentOrderId }

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

        fun build(): PaymentFlowListParams =
            PaymentFlowListParams(
                afterCursor,
                perPage,
                clientToken,
                status,
                counterpartyId,
                receivingAccountId,
                originatingAccountId,
                paymentOrderId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
