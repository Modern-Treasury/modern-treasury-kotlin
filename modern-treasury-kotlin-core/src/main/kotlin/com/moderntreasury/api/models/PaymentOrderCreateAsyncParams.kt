// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.util.Objects

/** Create a new payment order asynchronously */
class PaymentOrderCreateAsyncParams
private constructor(
    private val paymentOrderAsyncCreate: PaymentOrderAsyncCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun paymentOrderAsyncCreate(): PaymentOrderAsyncCreate = paymentOrderAsyncCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        paymentOrderAsyncCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PaymentOrderCreateAsyncParams].
         *
         * The following fields are required:
         * ```kotlin
         * .paymentOrderAsyncCreate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentOrderCreateAsyncParams]. */
    class Builder internal constructor() {

        private var paymentOrderAsyncCreate: PaymentOrderAsyncCreate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentOrderCreateAsyncParams: PaymentOrderCreateAsyncParams) = apply {
            paymentOrderAsyncCreate = paymentOrderCreateAsyncParams.paymentOrderAsyncCreate
            additionalHeaders = paymentOrderCreateAsyncParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentOrderCreateAsyncParams.additionalQueryParams.toBuilder()
        }

        fun paymentOrderAsyncCreate(paymentOrderAsyncCreate: PaymentOrderAsyncCreate) = apply {
            this.paymentOrderAsyncCreate = paymentOrderAsyncCreate
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
         * Returns an immutable instance of [PaymentOrderCreateAsyncParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .paymentOrderAsyncCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentOrderCreateAsyncParams =
            PaymentOrderCreateAsyncParams(
                checkRequired("paymentOrderAsyncCreate", paymentOrderAsyncCreate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PaymentOrderAsyncCreate = paymentOrderAsyncCreate

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderCreateAsyncParams &&
            paymentOrderAsyncCreate == other.paymentOrderAsyncCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(paymentOrderAsyncCreate, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentOrderCreateAsyncParams{paymentOrderAsyncCreate=$paymentOrderAsyncCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
