// File generated from our OpenAPI spec by Stainless.

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

class TransactionLineItemCreateParams
constructor(
    private val amount: Long,
    private val expectedPaymentId: String,
    private val transactionId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun expectedPaymentId(): String = expectedPaymentId

    fun transactionId(): String = transactionId

    internal fun getBody(): TransactionLineItemCreateBody {
        return TransactionLineItemCreateBody(
            amount,
            expectedPaymentId,
            transactionId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransactionLineItemCreateBody.Builder::class)
    @NoAutoDetect
    class TransactionLineItemCreateBody
    internal constructor(
        private val amount: Long?,
        private val expectedPaymentId: String?,
        private val transactionId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        @JsonProperty("expected_payment_id") fun expectedPaymentId(): String? = expectedPaymentId

        /** The ID of the parent transaction. */
        @JsonProperty("transaction_id") fun transactionId(): String? = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var expectedPaymentId: String? = null
            private var transactionId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transactionLineItemCreateBody: TransactionLineItemCreateBody) =
                apply {
                    this.amount = transactionLineItemCreateBody.amount
                    this.expectedPaymentId = transactionLineItemCreateBody.expectedPaymentId
                    this.transactionId = transactionLineItemCreateBody.transactionId
                    additionalProperties(transactionLineItemCreateBody.additionalProperties)
                }

            /**
             * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
             * specified currency's smallest unit (taken from parent Transaction).
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The ID of the reconciled Expected Payment, otherwise `null`. */
            @JsonProperty("expected_payment_id")
            fun expectedPaymentId(expectedPaymentId: String) = apply {
                this.expectedPaymentId = expectedPaymentId
            }

            /** The ID of the parent transaction. */
            @JsonProperty("transaction_id")
            fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

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

            fun build(): TransactionLineItemCreateBody =
                TransactionLineItemCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(expectedPaymentId) {
                        "`expectedPaymentId` is required but was not set"
                    },
                    checkNotNull(transactionId) { "`transactionId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionLineItemCreateBody &&
                this.amount == other.amount &&
                this.expectedPaymentId == other.expectedPaymentId &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        expectedPaymentId,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionLineItemCreateBody{amount=$amount, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionLineItemCreateParams &&
            this.amount == other.amount &&
            this.expectedPaymentId == other.expectedPaymentId &&
            this.transactionId == other.transactionId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            expectedPaymentId,
            transactionId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionLineItemCreateParams{amount=$amount, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var expectedPaymentId: String? = null
        private var transactionId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionLineItemCreateParams: TransactionLineItemCreateParams) =
            apply {
                this.amount = transactionLineItemCreateParams.amount
                this.expectedPaymentId = transactionLineItemCreateParams.expectedPaymentId
                this.transactionId = transactionLineItemCreateParams.transactionId
                additionalQueryParams(transactionLineItemCreateParams.additionalQueryParams)
                additionalHeaders(transactionLineItemCreateParams.additionalHeaders)
                additionalBodyProperties(transactionLineItemCreateParams.additionalBodyProperties)
            }

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: String) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

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

        fun build(): TransactionLineItemCreateParams =
            TransactionLineItemCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(expectedPaymentId) {
                    "`expectedPaymentId` is required but was not set"
                },
                checkNotNull(transactionId) { "`transactionId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
