// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** create transaction line items */
class TransactionLineItemCreateParams
private constructor(
    private val body: TransactionLineItemCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The ID of the reconciled Expected Payment, otherwise `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expectedPaymentId(): String = body.expectedPaymentId()

    /**
     * The ID of the parent transaction.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionId(): String = body.transactionId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [expectedPaymentId].
     *
     * Unlike [expectedPaymentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expectedPaymentId(): JsonField<String> = body._expectedPaymentId()

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactionId(): JsonField<String> = body._transactionId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionLineItemCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .expectedPaymentId()
         * .transactionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionLineItemCreateParams]. */
    class Builder internal constructor() {

        private var body: TransactionLineItemCreateRequest.Builder =
            TransactionLineItemCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionLineItemCreateParams: TransactionLineItemCreateParams) =
            apply {
                body = transactionLineItemCreateParams.body.toBuilder()
                additionalHeaders = transactionLineItemCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    transactionLineItemCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: String) = apply {
            body.expectedPaymentId(expectedPaymentId)
        }

        /**
         * Sets [Builder.expectedPaymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedPaymentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedPaymentId(expectedPaymentId: JsonField<String>) = apply {
            body.expectedPaymentId(expectedPaymentId)
        }

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: String) = apply { body.transactionId(transactionId) }

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            body.transactionId(transactionId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [TransactionLineItemCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .expectedPaymentId()
         * .transactionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionLineItemCreateParams =
            TransactionLineItemCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): TransactionLineItemCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class TransactionLineItemCreateRequest
    private constructor(
        private val amount: JsonField<Long>,
        private val expectedPaymentId: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expected_payment_id")
            @ExcludeMissing
            expectedPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(amount, expectedPaymentId, transactionId, mutableMapOf())

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The ID of the reconciled Expected Payment, otherwise `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expectedPaymentId(): String = expectedPaymentId.getRequired("expected_payment_id")

        /**
         * The ID of the parent transaction.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [expectedPaymentId].
         *
         * Unlike [expectedPaymentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expected_payment_id")
        @ExcludeMissing
        fun _expectedPaymentId(): JsonField<String> = expectedPaymentId

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [TransactionLineItemCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .expectedPaymentId()
             * .transactionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TransactionLineItemCreateRequest]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var expectedPaymentId: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transactionLineItemCreateRequest: TransactionLineItemCreateRequest) =
                apply {
                    amount = transactionLineItemCreateRequest.amount
                    expectedPaymentId = transactionLineItemCreateRequest.expectedPaymentId
                    transactionId = transactionLineItemCreateRequest.transactionId
                    additionalProperties =
                        transactionLineItemCreateRequest.additionalProperties.toMutableMap()
                }

            /**
             * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
             * specified currency's smallest unit (taken from parent Transaction).
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The ID of the reconciled Expected Payment, otherwise `null`. */
            fun expectedPaymentId(expectedPaymentId: String) =
                expectedPaymentId(JsonField.of(expectedPaymentId))

            /**
             * Sets [Builder.expectedPaymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedPaymentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expectedPaymentId(expectedPaymentId: JsonField<String>) = apply {
                this.expectedPaymentId = expectedPaymentId
            }

            /** The ID of the parent transaction. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [TransactionLineItemCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .expectedPaymentId()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransactionLineItemCreateRequest =
                TransactionLineItemCreateRequest(
                    checkRequired("amount", amount),
                    checkRequired("expectedPaymentId", expectedPaymentId),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TransactionLineItemCreateRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            expectedPaymentId()
            transactionId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (amount.asKnown() == null) 0 else 1) +
                (if (expectedPaymentId.asKnown() == null) 0 else 1) +
                (if (transactionId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionLineItemCreateRequest && amount == other.amount && expectedPaymentId == other.expectedPaymentId && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, expectedPaymentId, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionLineItemCreateRequest{amount=$amount, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItemCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionLineItemCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
