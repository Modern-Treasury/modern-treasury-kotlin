package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects

class AccountCollectionFlowListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val clientToken: String?,
    private val status: String?,
    private val counterpartyId: String?,
    private val externalAccountId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun clientToken(): String? = clientToken

    fun status(): String? = status

    fun counterpartyId(): String? = counterpartyId

    fun externalAccountId(): String? = externalAccountId

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.clientToken?.let { params.put("client_token", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.externalAccountId?.let { params.put("external_account_id", listOf(it.toString())) }
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

        return other is AccountCollectionFlowListParams &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.clientToken == other.clientToken &&
            this.status == other.status &&
            this.counterpartyId == other.counterpartyId &&
            this.externalAccountId == other.externalAccountId &&
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
            externalAccountId,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AccountCollectionFlowListParams{afterCursor=$afterCursor, perPage=$perPage, clientToken=$clientToken, status=$status, counterpartyId=$counterpartyId, externalAccountId=$externalAccountId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var externalAccountId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(accountCollectionFlowListParams: AccountCollectionFlowListParams) =
            apply {
                this.afterCursor = accountCollectionFlowListParams.afterCursor
                this.perPage = accountCollectionFlowListParams.perPage
                this.clientToken = accountCollectionFlowListParams.clientToken
                this.status = accountCollectionFlowListParams.status
                this.counterpartyId = accountCollectionFlowListParams.counterpartyId
                this.externalAccountId = accountCollectionFlowListParams.externalAccountId
                additionalQueryParams(accountCollectionFlowListParams.additionalQueryParams)
                additionalHeaders(accountCollectionFlowListParams.additionalHeaders)
            }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun clientToken(clientToken: String) = apply { this.clientToken = clientToken }

        fun status(status: String) = apply { this.status = status }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

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

        fun build(): AccountCollectionFlowListParams =
            AccountCollectionFlowListParams(
                afterCursor,
                perPage,
                clientToken,
                status,
                counterpartyId,
                externalAccountId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
