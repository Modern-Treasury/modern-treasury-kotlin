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

/** Create a payment action. */
class PaymentActionCreateParams
private constructor(
    private val body: PaymentActionCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Required. The type of the payment action. Determines the action to be taken.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = body.type()

    /**
     * Optional. The ID of the associated actionable object.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun actionableId(): String? = body.actionableId()

    /**
     * Optional. The type of the associated actionable object. One of `payment_order`,
     * `expected_payment`. Required if `actionable_id` is passed.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun actionableType(): String? = body.actionableType()

    /** Optional. The specifc details of the payment action based on type. */
    fun _details(): JsonValue = body._details()

    /**
     * Optional. The ID of one of your organization's internal accounts. Required if `actionable_id`
     * is not passed.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun internalAccountId(): String? = body.internalAccountId()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<String> = body._type()

    /**
     * Returns the raw JSON value of [actionableId].
     *
     * Unlike [actionableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actionableId(): JsonField<String> = body._actionableId()

    /**
     * Returns the raw JSON value of [actionableType].
     *
     * Unlike [actionableType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actionableType(): JsonField<String> = body._actionableType()

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentActionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentActionCreateParams]. */
    class Builder internal constructor() {

        private var body: PaymentActionCreateRequest.Builder = PaymentActionCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentActionCreateParams: PaymentActionCreateParams) = apply {
            body = paymentActionCreateParams.body.toBuilder()
            additionalHeaders = paymentActionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentActionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [actionableId]
         * - [actionableType]
         * - [details]
         * - [internalAccountId]
         * - etc.
         */
        fun body(body: PaymentActionCreateRequest) = apply { this.body = body.toBuilder() }

        /** Required. The type of the payment action. Determines the action to be taken. */
        fun type(type: String) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { body.type(type) }

        /** Optional. The ID of the associated actionable object. */
        fun actionableId(actionableId: String) = apply { body.actionableId(actionableId) }

        /**
         * Sets [Builder.actionableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionableId(actionableId: JsonField<String>) = apply {
            body.actionableId(actionableId)
        }

        /**
         * Optional. The type of the associated actionable object. One of `payment_order`,
         * `expected_payment`. Required if `actionable_id` is passed.
         */
        fun actionableType(actionableType: String) = apply { body.actionableType(actionableType) }

        /**
         * Sets [Builder.actionableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionableType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionableType(actionableType: JsonField<String>) = apply {
            body.actionableType(actionableType)
        }

        /** Optional. The specifc details of the payment action based on type. */
        fun details(details: JsonValue) = apply { body.details(details) }

        /**
         * Optional. The ID of one of your organization's internal accounts. Required if
         * `actionable_id` is not passed.
         */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
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
         * Returns an immutable instance of [PaymentActionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentActionCreateParams =
            PaymentActionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PaymentActionCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class PaymentActionCreateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<String>,
        private val actionableId: JsonField<String>,
        private val actionableType: JsonField<String>,
        private val details: JsonValue,
        private val internalAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actionable_id")
            @ExcludeMissing
            actionableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actionable_type")
            @ExcludeMissing
            actionableType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("details") @ExcludeMissing details: JsonValue = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            internalAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(type, actionableId, actionableType, details, internalAccountId, mutableMapOf())

        /**
         * Required. The type of the payment action. Determines the action to be taken.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Optional. The ID of the associated actionable object.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun actionableId(): String? = actionableId.getNullable("actionable_id")

        /**
         * Optional. The type of the associated actionable object. One of `payment_order`,
         * `expected_payment`. Required if `actionable_id` is passed.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun actionableType(): String? = actionableType.getNullable("actionable_type")

        /** Optional. The specifc details of the payment action based on type. */
        @JsonProperty("details") @ExcludeMissing fun _details(): JsonValue = details

        /**
         * Optional. The ID of one of your organization's internal accounts. Required if
         * `actionable_id` is not passed.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [actionableId].
         *
         * Unlike [actionableId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actionable_id")
        @ExcludeMissing
        fun _actionableId(): JsonField<String> = actionableId

        /**
         * Returns the raw JSON value of [actionableType].
         *
         * Unlike [actionableType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actionable_type")
        @ExcludeMissing
        fun _actionableType(): JsonField<String> = actionableType

        /**
         * Returns the raw JSON value of [internalAccountId].
         *
         * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

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
             * [PaymentActionCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentActionCreateRequest]. */
        class Builder internal constructor() {

            private var type: JsonField<String>? = null
            private var actionableId: JsonField<String> = JsonMissing.of()
            private var actionableType: JsonField<String> = JsonMissing.of()
            private var details: JsonValue = JsonMissing.of()
            private var internalAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentActionCreateRequest: PaymentActionCreateRequest) = apply {
                type = paymentActionCreateRequest.type
                actionableId = paymentActionCreateRequest.actionableId
                actionableType = paymentActionCreateRequest.actionableType
                details = paymentActionCreateRequest.details
                internalAccountId = paymentActionCreateRequest.internalAccountId
                additionalProperties =
                    paymentActionCreateRequest.additionalProperties.toMutableMap()
            }

            /** Required. The type of the payment action. Determines the action to be taken. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Optional. The ID of the associated actionable object. */
            fun actionableId(actionableId: String) = actionableId(JsonField.of(actionableId))

            /**
             * Sets [Builder.actionableId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionableId(actionableId: JsonField<String>) = apply {
                this.actionableId = actionableId
            }

            /**
             * Optional. The type of the associated actionable object. One of `payment_order`,
             * `expected_payment`. Required if `actionable_id` is passed.
             */
            fun actionableType(actionableType: String) =
                actionableType(JsonField.of(actionableType))

            /**
             * Sets [Builder.actionableType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionableType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionableType(actionableType: JsonField<String>) = apply {
                this.actionableType = actionableType
            }

            /** Optional. The specifc details of the payment action based on type. */
            fun details(details: JsonValue) = apply { this.details = details }

            /**
             * Optional. The ID of one of your organization's internal accounts. Required if
             * `actionable_id` is not passed.
             */
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

            /**
             * Sets [Builder.internalAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
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
             * Returns an immutable instance of [PaymentActionCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentActionCreateRequest =
                PaymentActionCreateRequest(
                    checkRequired("type", type),
                    actionableId,
                    actionableType,
                    details,
                    internalAccountId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentActionCreateRequest = apply {
            if (validated) {
                return@apply
            }

            type()
            actionableId()
            actionableType()
            internalAccountId()
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
            (if (type.asKnown() == null) 0 else 1) +
                (if (actionableId.asKnown() == null) 0 else 1) +
                (if (actionableType.asKnown() == null) 0 else 1) +
                (if (internalAccountId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentActionCreateRequest &&
                type == other.type &&
                actionableId == other.actionableId &&
                actionableType == other.actionableType &&
                details == other.details &&
                internalAccountId == other.internalAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                actionableId,
                actionableType,
                details,
                internalAccountId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentActionCreateRequest{type=$type, actionableId=$actionableId, actionableType=$actionableType, details=$details, internalAccountId=$internalAccountId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentActionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentActionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
