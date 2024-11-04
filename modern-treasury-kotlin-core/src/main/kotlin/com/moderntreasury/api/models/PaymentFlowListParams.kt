// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.util.Objects

class PaymentFlowListParams
constructor(
    private val afterCursor: String?,
    private val clientToken: String?,
    private val counterpartyId: String?,
    private val originatingAccountId: String?,
    private val paymentOrderId: String?,
    private val perPage: Long?,
    private val receivingAccountId: String?,
    private val status: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun clientToken(): String? = clientToken

    fun counterpartyId(): String? = counterpartyId

    fun originatingAccountId(): String? = originatingAccountId

    fun paymentOrderId(): String? = paymentOrderId

    fun perPage(): Long? = perPage

    fun receivingAccountId(): String? = receivingAccountId

    fun status(): String? = status

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.clientToken?.let { params.put("client_token", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.originatingAccountId?.let {
            params.put("originating_account_id", listOf(it.toString()))
        }
        this.paymentOrderId?.let { params.put("payment_order_id", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.receivingAccountId?.let { params.put("receiving_account_id", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowListParams && this.afterCursor == other.afterCursor && this.clientToken == other.clientToken && this.counterpartyId == other.counterpartyId && this.originatingAccountId == other.originatingAccountId && this.paymentOrderId == other.paymentOrderId && this.perPage == other.perPage && this.receivingAccountId == other.receivingAccountId && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, clientToken, counterpartyId, originatingAccountId, paymentOrderId, perPage, receivingAccountId, status, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "PaymentFlowListParams{afterCursor=$afterCursor, clientToken=$clientToken, counterpartyId=$counterpartyId, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, perPage=$perPage, receivingAccountId=$receivingAccountId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var clientToken: String? = null
        private var counterpartyId: String? = null
        private var originatingAccountId: String? = null
        private var paymentOrderId: String? = null
        private var perPage: Long? = null
        private var receivingAccountId: String? = null
        private var status: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(paymentFlowListParams: PaymentFlowListParams) = apply {
            this.afterCursor = paymentFlowListParams.afterCursor
            this.clientToken = paymentFlowListParams.clientToken
            this.counterpartyId = paymentFlowListParams.counterpartyId
            this.originatingAccountId = paymentFlowListParams.originatingAccountId
            this.paymentOrderId = paymentFlowListParams.paymentOrderId
            this.perPage = paymentFlowListParams.perPage
            this.receivingAccountId = paymentFlowListParams.receivingAccountId
            this.status = paymentFlowListParams.status
            additionalHeaders(paymentFlowListParams.additionalHeaders)
            additionalQueryParams(paymentFlowListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun clientToken(clientToken: String) = apply { this.clientToken = clientToken }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun paymentOrderId(paymentOrderId: String) = apply { this.paymentOrderId = paymentOrderId }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun receivingAccountId(receivingAccountId: String) = apply {
            this.receivingAccountId = receivingAccountId
        }

        fun status(status: String) = apply { this.status = status }

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
}
