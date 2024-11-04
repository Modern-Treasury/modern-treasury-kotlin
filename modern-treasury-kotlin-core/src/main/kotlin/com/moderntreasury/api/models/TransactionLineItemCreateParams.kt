// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.util.Objects

class TransactionLineItemCreateParams
constructor(
    private val amount: Long,
    private val expectedPaymentId: String,
    private val transactionId: String,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionLineItemCreateBody && this.amount == other.amount && this.expectedPaymentId == other.expectedPaymentId && this.transactionId == other.transactionId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, expectedPaymentId, transactionId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TransactionLineItemCreateBody{amount=$amount, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItemCreateParams && this.amount == other.amount && this.expectedPaymentId == other.expectedPaymentId && this.transactionId == other.transactionId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, expectedPaymentId, transactionId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "TransactionLineItemCreateParams{amount=$amount, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var expectedPaymentId: String? = null
        private var transactionId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionLineItemCreateParams: TransactionLineItemCreateParams) =
            apply {
                this.amount = transactionLineItemCreateParams.amount
                this.expectedPaymentId = transactionLineItemCreateParams.expectedPaymentId
                this.transactionId = transactionLineItemCreateParams.transactionId
                additionalHeaders(transactionLineItemCreateParams.additionalHeaders)
                additionalQueryParams(transactionLineItemCreateParams.additionalQueryParams)
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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
