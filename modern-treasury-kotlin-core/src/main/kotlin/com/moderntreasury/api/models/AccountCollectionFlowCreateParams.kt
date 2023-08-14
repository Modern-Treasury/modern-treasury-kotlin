package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects

class AccountCollectionFlowCreateParams
constructor(
    private val counterpartyId: String,
    private val paymentTypes: List<String>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun counterpartyId(): String = counterpartyId

    fun paymentTypes(): List<String> = paymentTypes

    internal fun getBody(): AccountCollectionFlowCreateBody {
        return AccountCollectionFlowCreateBody(
            counterpartyId,
            paymentTypes,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AccountCollectionFlowCreateBody.Builder::class)
    @NoAutoDetect
    class AccountCollectionFlowCreateBody
    internal constructor(
        private val counterpartyId: String?,
        private val paymentTypes: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Required. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        @JsonProperty("payment_types") fun paymentTypes(): List<String>? = paymentTypes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountCollectionFlowCreateBody &&
                this.counterpartyId == other.counterpartyId &&
                this.paymentTypes == other.paymentTypes &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        counterpartyId,
                        paymentTypes,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountCollectionFlowCreateBody{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var paymentTypes: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountCollectionFlowCreateBody: AccountCollectionFlowCreateBody) =
                apply {
                    this.counterpartyId = accountCollectionFlowCreateBody.counterpartyId
                    this.paymentTypes = accountCollectionFlowCreateBody.paymentTypes
                    additionalProperties(accountCollectionFlowCreateBody.additionalProperties)
                }

            /** Required. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            @JsonProperty("payment_types")
            fun paymentTypes(paymentTypes: List<String>) = apply {
                this.paymentTypes = paymentTypes
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountCollectionFlowCreateBody =
                AccountCollectionFlowCreateBody(
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(paymentTypes) { "`paymentTypes` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountCollectionFlowCreateParams &&
            this.counterpartyId == other.counterpartyId &&
            this.paymentTypes == other.paymentTypes &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            counterpartyId,
            paymentTypes,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountCollectionFlowCreateParams{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var counterpartyId: String? = null
        private var paymentTypes: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountCollectionFlowCreateParams: AccountCollectionFlowCreateParams) =
            apply {
                this.counterpartyId = accountCollectionFlowCreateParams.counterpartyId
                this.paymentTypes(accountCollectionFlowCreateParams.paymentTypes)
                additionalQueryParams(accountCollectionFlowCreateParams.additionalQueryParams)
                additionalHeaders(accountCollectionFlowCreateParams.additionalHeaders)
                additionalBodyProperties(accountCollectionFlowCreateParams.additionalBodyProperties)
            }

        /** Required. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun paymentTypes(paymentTypes: List<String>) = apply {
            this.paymentTypes.clear()
            this.paymentTypes.addAll(paymentTypes)
        }

        fun addPaymentType(paymentType: String) = apply { this.paymentTypes.add(paymentType) }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountCollectionFlowCreateParams =
            AccountCollectionFlowCreateParams(
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                checkNotNull(paymentTypes) { "`paymentTypes` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
