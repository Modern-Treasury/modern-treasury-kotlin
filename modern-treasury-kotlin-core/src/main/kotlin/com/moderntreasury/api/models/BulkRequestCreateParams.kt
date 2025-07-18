// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.BaseDeserializer
import com.moderntreasury.api.core.BaseSerializer
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.allMaxBy
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** create bulk_request */
class BulkRequestCreateParams
private constructor(
    private val body: BulkRequestCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * One of create, or update.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionType(): ActionType = body.actionType()

    /**
     * One of payment_order, expected_payment, or ledger_transaction.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceType(): ResourceType = body.resourceType()

    /**
     * An array of objects where each object contains the input params for a single `action_type`
     * request on a `resource_type` resource
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resources(): List<Resource> = body.resources()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Returns the raw JSON value of [actionType].
     *
     * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actionType(): JsonField<ActionType> = body._actionType()

    /**
     * Returns the raw JSON value of [resourceType].
     *
     * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resourceType(): JsonField<ResourceType> = body._resourceType()

    /**
     * Returns the raw JSON value of [resources].
     *
     * Unlike [resources], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resources(): JsonField<List<Resource>> = body._resources()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkRequestCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .actionType()
         * .resourceType()
         * .resources()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BulkRequestCreateParams]. */
    class Builder internal constructor() {

        private var body: BulkRequestCreateRequest.Builder = BulkRequestCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(bulkRequestCreateParams: BulkRequestCreateParams) = apply {
            body = bulkRequestCreateParams.body.toBuilder()
            additionalHeaders = bulkRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bulkRequestCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [actionType]
         * - [resourceType]
         * - [resources]
         * - [metadata]
         */
        fun body(body: BulkRequestCreateRequest) = apply { this.body = body.toBuilder() }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = apply { body.actionType(actionType) }

        /**
         * Sets [Builder.actionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionType] with a well-typed [ActionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionType(actionType: JsonField<ActionType>) = apply { body.actionType(actionType) }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = apply { body.resourceType(resourceType) }

        /**
         * Sets [Builder.resourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceType] with a well-typed [ResourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resourceType(resourceType: JsonField<ResourceType>) = apply {
            body.resourceType(resourceType)
        }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(resources: List<Resource>) = apply { body.resources(resources) }

        /**
         * Sets [Builder.resources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resources] with a well-typed `List<Resource>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resources(resources: JsonField<List<Resource>>) = apply { body.resources(resources) }

        /**
         * Adds a single [Resource] to [resources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResource(resource: Resource) = apply { body.addResource(resource) }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)`.
         */
        fun addResource(paymentOrderAsyncCreateRequest: Resource.PaymentOrderAsyncCreateRequest) =
            apply {
                body.addResource(paymentOrderAsyncCreateRequest)
            }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofExpectedPaymentCreateRequest(expectedPaymentCreateRequest)`.
         */
        fun addResource(expectedPaymentCreateRequest: Resource.ExpectedPaymentCreateRequest) =
            apply {
                body.addResource(expectedPaymentCreateRequest)
            }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)`.
         */
        fun addResource(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) = apply {
            body.addResource(ledgerTransactionCreateRequest)
        }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofLedgerAccountCreateRequest(ledgerAccountCreateRequest)`.
         */
        fun addResource(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
            body.addResource(ledgerAccountCreateRequest)
        }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofTransactionCreateRequest(transactionCreateRequest)`.
         */
        fun addResource(transactionCreateRequest: Resource.TransactionCreateRequest) = apply {
            body.addResource(transactionCreateRequest)
        }

        /** Alias for calling [addResource] with `Resource.ofId(id)`. */
        fun addResource(id: Resource.Id) = apply { body.addResource(id) }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofPaymentOrderUpdateRequestWithId(paymentOrderUpdateRequestWithId)`.
         */
        fun addResource(paymentOrderUpdateRequestWithId: Resource.PaymentOrderUpdateRequestWithId) =
            apply {
                body.addResource(paymentOrderUpdateRequestWithId)
            }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofExpectedPaymentUpdateRequestWithId(expectedPaymentUpdateRequestWithId)`.
         */
        fun addResource(
            expectedPaymentUpdateRequestWithId: Resource.ExpectedPaymentUpdateRequestWithId
        ) = apply { body.addResource(expectedPaymentUpdateRequestWithId) }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofTransactionUpdateRequestWithId(transactionUpdateRequestWithId)`.
         */
        fun addResource(transactionUpdateRequestWithId: Resource.TransactionUpdateRequestWithId) =
            apply {
                body.addResource(transactionUpdateRequestWithId)
            }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofLedgerTransactionUpdateRequestWithId(ledgerTransactionUpdateRequestWithId)`.
         */
        fun addResource(
            ledgerTransactionUpdateRequestWithId: Resource.LedgerTransactionUpdateRequestWithId
        ) = apply { body.addResource(ledgerTransactionUpdateRequestWithId) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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
         * Returns an immutable instance of [BulkRequestCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .actionType()
         * .resourceType()
         * .resources()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkRequestCreateParams =
            BulkRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BulkRequestCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class BulkRequestCreateRequest
    private constructor(
        private val actionType: JsonField<ActionType>,
        private val resourceType: JsonField<ResourceType>,
        private val resources: JsonField<List<Resource>>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
            @JsonProperty("resource_type")
            @ExcludeMissing
            resourceType: JsonField<ResourceType> = JsonMissing.of(),
            @JsonProperty("resources")
            @ExcludeMissing
            resources: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(actionType, resourceType, resources, metadata, mutableMapOf())

        /**
         * One of create, or update.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * One of payment_order, expected_payment, or ledger_transaction.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resourceType(): ResourceType = resourceType.getRequired("resource_type")

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resources(): List<Resource> = resources.getRequired("resources")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<ActionType> = actionType

        /**
         * Returns the raw JSON value of [resourceType].
         *
         * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resource_type")
        @ExcludeMissing
        fun _resourceType(): JsonField<ResourceType> = resourceType

        /**
         * Returns the raw JSON value of [resources].
         *
         * Unlike [resources], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resources")
        @ExcludeMissing
        fun _resources(): JsonField<List<Resource>> = resources

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * Returns a mutable builder for constructing an instance of [BulkRequestCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .actionType()
             * .resourceType()
             * .resources()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BulkRequestCreateRequest]. */
        class Builder internal constructor() {

            private var actionType: JsonField<ActionType>? = null
            private var resourceType: JsonField<ResourceType>? = null
            private var resources: JsonField<MutableList<Resource>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bulkRequestCreateRequest: BulkRequestCreateRequest) = apply {
                actionType = bulkRequestCreateRequest.actionType
                resourceType = bulkRequestCreateRequest.resourceType
                resources = bulkRequestCreateRequest.resources.map { it.toMutableList() }
                metadata = bulkRequestCreateRequest.metadata
                additionalProperties = bulkRequestCreateRequest.additionalProperties.toMutableMap()
            }

            /** One of create, or update. */
            fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [ActionType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<ActionType>) = apply {
                this.actionType = actionType
            }

            /** One of payment_order, expected_payment, or ledger_transaction. */
            fun resourceType(resourceType: ResourceType) = resourceType(JsonField.of(resourceType))

            /**
             * Sets [Builder.resourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceType] with a well-typed [ResourceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceType(resourceType: JsonField<ResourceType>) = apply {
                this.resourceType = resourceType
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun resources(resources: List<Resource>) = resources(JsonField.of(resources))

            /**
             * Sets [Builder.resources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resources] with a well-typed `List<Resource>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resources(resources: JsonField<List<Resource>>) = apply {
                this.resources = resources.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [resources].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResource(resource: Resource) = apply {
                resources =
                    (resources ?: JsonField.of(mutableListOf())).also {
                        checkKnown("resources", it).add(resource)
                    }
            }

            /**
             * Alias for calling [addResource] with
             * `Resource.ofPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)`.
             */
            fun addResource(
                paymentOrderAsyncCreateRequest: Resource.PaymentOrderAsyncCreateRequest
            ) =
                addResource(
                    Resource.ofPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)
                )

            /**
             * Alias for calling [addResource] with
             * `Resource.ofExpectedPaymentCreateRequest(expectedPaymentCreateRequest)`.
             */
            fun addResource(expectedPaymentCreateRequest: Resource.ExpectedPaymentCreateRequest) =
                addResource(Resource.ofExpectedPaymentCreateRequest(expectedPaymentCreateRequest))

            /**
             * Alias for calling [addResource] with
             * `Resource.ofLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)`.
             */
            fun addResource(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                addResource(
                    Resource.ofLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                )

            /**
             * Alias for calling [addResource] with
             * `Resource.ofLedgerAccountCreateRequest(ledgerAccountCreateRequest)`.
             */
            fun addResource(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                addResource(Resource.ofLedgerAccountCreateRequest(ledgerAccountCreateRequest))

            /**
             * Alias for calling [addResource] with
             * `Resource.ofTransactionCreateRequest(transactionCreateRequest)`.
             */
            fun addResource(transactionCreateRequest: Resource.TransactionCreateRequest) =
                addResource(Resource.ofTransactionCreateRequest(transactionCreateRequest))

            /** Alias for calling [addResource] with `Resource.ofId(id)`. */
            fun addResource(id: Resource.Id) = addResource(Resource.ofId(id))

            /**
             * Alias for calling [addResource] with
             * `Resource.ofPaymentOrderUpdateRequestWithId(paymentOrderUpdateRequestWithId)`.
             */
            fun addResource(
                paymentOrderUpdateRequestWithId: Resource.PaymentOrderUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofPaymentOrderUpdateRequestWithId(paymentOrderUpdateRequestWithId)
                )

            /**
             * Alias for calling [addResource] with
             * `Resource.ofExpectedPaymentUpdateRequestWithId(expectedPaymentUpdateRequestWithId)`.
             */
            fun addResource(
                expectedPaymentUpdateRequestWithId: Resource.ExpectedPaymentUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId
                    )
                )

            /**
             * Alias for calling [addResource] with
             * `Resource.ofTransactionUpdateRequestWithId(transactionUpdateRequestWithId)`.
             */
            fun addResource(
                transactionUpdateRequestWithId: Resource.TransactionUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofTransactionUpdateRequestWithId(transactionUpdateRequestWithId)
                )

            /**
             * Alias for calling [addResource] with
             * `Resource.ofLedgerTransactionUpdateRequestWithId(ledgerTransactionUpdateRequestWithId)`.
             */
            fun addResource(
                ledgerTransactionUpdateRequestWithId: Resource.LedgerTransactionUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId
                    )
                )

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * Returns an immutable instance of [BulkRequestCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .actionType()
             * .resourceType()
             * .resources()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BulkRequestCreateRequest =
                BulkRequestCreateRequest(
                    checkRequired("actionType", actionType),
                    checkRequired("resourceType", resourceType),
                    checkRequired("resources", resources).map { it.toImmutable() },
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BulkRequestCreateRequest = apply {
            if (validated) {
                return@apply
            }

            actionType().validate()
            resourceType().validate()
            resources().forEach { it.validate() }
            metadata()?.validate()
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
            (actionType.asKnown()?.validity() ?: 0) +
                (resourceType.asKnown()?.validity() ?: 0) +
                (resources.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BulkRequestCreateRequest && actionType == other.actionType && resourceType == other.resourceType && resources == other.resources && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(actionType, resourceType, resources, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BulkRequestCreateRequest{actionType=$actionType, resourceType=$resourceType, resources=$resources, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /** One of create, or update. */
    class ActionType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREATE = of("create")

            val UPDATE = of("update")

            val DELETE = of("delete")

            fun of(value: String) = ActionType(JsonField.of(value))
        }

        /** An enum containing [ActionType]'s known values. */
        enum class Known {
            CREATE,
            UPDATE,
            DELETE,
        }

        /**
         * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ActionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATE,
            UPDATE,
            DELETE,
            /**
             * An enum member indicating that [ActionType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                else -> throw ModernTreasuryInvalidDataException("Unknown ActionType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ActionType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** One of payment_order, expected_payment, or ledger_transaction. */
    class ResourceType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PAYMENT_ORDER = of("payment_order")

            val LEDGER_ACCOUNT = of("ledger_account")

            val LEDGER_TRANSACTION = of("ledger_transaction")

            val EXPECTED_PAYMENT = of("expected_payment")

            val TRANSACTION = of("transaction")

            val TRANSACTION_LINE_ITEM = of("transaction_line_item")

            val ENTITY_LINK = of("entity_link")

            fun of(value: String) = ResourceType(JsonField.of(value))
        }

        /** An enum containing [ResourceType]'s known values. */
        enum class Known {
            PAYMENT_ORDER,
            LEDGER_ACCOUNT,
            LEDGER_TRANSACTION,
            EXPECTED_PAYMENT,
            TRANSACTION,
            TRANSACTION_LINE_ITEM,
            ENTITY_LINK,
        }

        /**
         * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT_ORDER,
            LEDGER_ACCOUNT,
            LEDGER_TRANSACTION,
            EXPECTED_PAYMENT,
            TRANSACTION,
            TRANSACTION_LINE_ITEM,
            ENTITY_LINK,
            /**
             * An enum member indicating that [ResourceType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                LEDGER_ACCOUNT -> Value.LEDGER_ACCOUNT
                LEDGER_TRANSACTION -> Value.LEDGER_TRANSACTION
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                TRANSACTION -> Value.TRANSACTION
                TRANSACTION_LINE_ITEM -> Value.TRANSACTION_LINE_ITEM
                ENTITY_LINK -> Value.ENTITY_LINK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                LEDGER_ACCOUNT -> Known.LEDGER_ACCOUNT
                LEDGER_TRANSACTION -> Known.LEDGER_TRANSACTION
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                TRANSACTION -> Known.TRANSACTION
                TRANSACTION_LINE_ITEM -> Known.TRANSACTION_LINE_ITEM
                ENTITY_LINK -> Known.ENTITY_LINK
                else -> throw ModernTreasuryInvalidDataException("Unknown ResourceType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ResourceType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Resource.Deserializer::class)
    @JsonSerialize(using = Resource.Serializer::class)
    class Resource
    private constructor(
        private val paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest? = null,
        private val expectedPaymentCreateRequest: ExpectedPaymentCreateRequest? = null,
        private val ledgerTransactionCreateRequest: LedgerTransactionCreateRequest? = null,
        private val ledgerAccountCreateRequest: LedgerAccountCreateRequest? = null,
        private val transactionCreateRequest: TransactionCreateRequest? = null,
        private val id: Id? = null,
        private val paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId? = null,
        private val expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId? = null,
        private val transactionUpdateRequestWithId: TransactionUpdateRequestWithId? = null,
        private val ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun paymentOrderAsyncCreateRequest(): PaymentOrderAsyncCreateRequest? =
            paymentOrderAsyncCreateRequest

        fun expectedPaymentCreateRequest(): ExpectedPaymentCreateRequest? =
            expectedPaymentCreateRequest

        fun ledgerTransactionCreateRequest(): LedgerTransactionCreateRequest? =
            ledgerTransactionCreateRequest

        fun ledgerAccountCreateRequest(): LedgerAccountCreateRequest? = ledgerAccountCreateRequest

        fun transactionCreateRequest(): TransactionCreateRequest? = transactionCreateRequest

        fun id(): Id? = id

        fun paymentOrderUpdateRequestWithId(): PaymentOrderUpdateRequestWithId? =
            paymentOrderUpdateRequestWithId

        fun expectedPaymentUpdateRequestWithId(): ExpectedPaymentUpdateRequestWithId? =
            expectedPaymentUpdateRequestWithId

        fun transactionUpdateRequestWithId(): TransactionUpdateRequestWithId? =
            transactionUpdateRequestWithId

        fun ledgerTransactionUpdateRequestWithId(): LedgerTransactionUpdateRequestWithId? =
            ledgerTransactionUpdateRequestWithId

        fun isPaymentOrderAsyncCreateRequest(): Boolean = paymentOrderAsyncCreateRequest != null

        fun isExpectedPaymentCreateRequest(): Boolean = expectedPaymentCreateRequest != null

        fun isLedgerTransactionCreateRequest(): Boolean = ledgerTransactionCreateRequest != null

        fun isLedgerAccountCreateRequest(): Boolean = ledgerAccountCreateRequest != null

        fun isTransactionCreateRequest(): Boolean = transactionCreateRequest != null

        fun isId(): Boolean = id != null

        fun isPaymentOrderUpdateRequestWithId(): Boolean = paymentOrderUpdateRequestWithId != null

        fun isExpectedPaymentUpdateRequestWithId(): Boolean =
            expectedPaymentUpdateRequestWithId != null

        fun isTransactionUpdateRequestWithId(): Boolean = transactionUpdateRequestWithId != null

        fun isLedgerTransactionUpdateRequestWithId(): Boolean =
            ledgerTransactionUpdateRequestWithId != null

        fun asPaymentOrderAsyncCreateRequest(): PaymentOrderAsyncCreateRequest =
            paymentOrderAsyncCreateRequest.getOrThrow("paymentOrderAsyncCreateRequest")

        fun asExpectedPaymentCreateRequest(): ExpectedPaymentCreateRequest =
            expectedPaymentCreateRequest.getOrThrow("expectedPaymentCreateRequest")

        fun asLedgerTransactionCreateRequest(): LedgerTransactionCreateRequest =
            ledgerTransactionCreateRequest.getOrThrow("ledgerTransactionCreateRequest")

        fun asLedgerAccountCreateRequest(): LedgerAccountCreateRequest =
            ledgerAccountCreateRequest.getOrThrow("ledgerAccountCreateRequest")

        fun asTransactionCreateRequest(): TransactionCreateRequest =
            transactionCreateRequest.getOrThrow("transactionCreateRequest")

        fun asId(): Id = id.getOrThrow("id")

        fun asPaymentOrderUpdateRequestWithId(): PaymentOrderUpdateRequestWithId =
            paymentOrderUpdateRequestWithId.getOrThrow("paymentOrderUpdateRequestWithId")

        fun asExpectedPaymentUpdateRequestWithId(): ExpectedPaymentUpdateRequestWithId =
            expectedPaymentUpdateRequestWithId.getOrThrow("expectedPaymentUpdateRequestWithId")

        fun asTransactionUpdateRequestWithId(): TransactionUpdateRequestWithId =
            transactionUpdateRequestWithId.getOrThrow("transactionUpdateRequestWithId")

        fun asLedgerTransactionUpdateRequestWithId(): LedgerTransactionUpdateRequestWithId =
            ledgerTransactionUpdateRequestWithId.getOrThrow("ledgerTransactionUpdateRequestWithId")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                paymentOrderAsyncCreateRequest != null ->
                    visitor.visitPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)
                expectedPaymentCreateRequest != null ->
                    visitor.visitExpectedPaymentCreateRequest(expectedPaymentCreateRequest)
                ledgerTransactionCreateRequest != null ->
                    visitor.visitLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                ledgerAccountCreateRequest != null ->
                    visitor.visitLedgerAccountCreateRequest(ledgerAccountCreateRequest)
                transactionCreateRequest != null ->
                    visitor.visitTransactionCreateRequest(transactionCreateRequest)
                id != null -> visitor.visitId(id)
                paymentOrderUpdateRequestWithId != null ->
                    visitor.visitPaymentOrderUpdateRequestWithId(paymentOrderUpdateRequestWithId)
                expectedPaymentUpdateRequestWithId != null ->
                    visitor.visitExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId
                    )
                transactionUpdateRequestWithId != null ->
                    visitor.visitTransactionUpdateRequestWithId(transactionUpdateRequestWithId)
                ledgerTransactionUpdateRequestWithId != null ->
                    visitor.visitLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Resource = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPaymentOrderAsyncCreateRequest(
                        paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
                    ) {
                        paymentOrderAsyncCreateRequest.validate()
                    }

                    override fun visitExpectedPaymentCreateRequest(
                        expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
                    ) {
                        expectedPaymentCreateRequest.validate()
                    }

                    override fun visitLedgerTransactionCreateRequest(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) {
                        ledgerTransactionCreateRequest.validate()
                    }

                    override fun visitLedgerAccountCreateRequest(
                        ledgerAccountCreateRequest: LedgerAccountCreateRequest
                    ) {
                        ledgerAccountCreateRequest.validate()
                    }

                    override fun visitTransactionCreateRequest(
                        transactionCreateRequest: TransactionCreateRequest
                    ) {
                        transactionCreateRequest.validate()
                    }

                    override fun visitId(id: Id) {
                        id.validate()
                    }

                    override fun visitPaymentOrderUpdateRequestWithId(
                        paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                    ) {
                        paymentOrderUpdateRequestWithId.validate()
                    }

                    override fun visitExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                    ) {
                        expectedPaymentUpdateRequestWithId.validate()
                    }

                    override fun visitTransactionUpdateRequestWithId(
                        transactionUpdateRequestWithId: TransactionUpdateRequestWithId
                    ) {
                        transactionUpdateRequestWithId.validate()
                    }

                    override fun visitLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                    ) {
                        ledgerTransactionUpdateRequestWithId.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitPaymentOrderAsyncCreateRequest(
                        paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
                    ) = paymentOrderAsyncCreateRequest.validity()

                    override fun visitExpectedPaymentCreateRequest(
                        expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
                    ) = expectedPaymentCreateRequest.validity()

                    override fun visitLedgerTransactionCreateRequest(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = ledgerTransactionCreateRequest.validity()

                    override fun visitLedgerAccountCreateRequest(
                        ledgerAccountCreateRequest: LedgerAccountCreateRequest
                    ) = ledgerAccountCreateRequest.validity()

                    override fun visitTransactionCreateRequest(
                        transactionCreateRequest: TransactionCreateRequest
                    ) = transactionCreateRequest.validity()

                    override fun visitId(id: Id) = id.validity()

                    override fun visitPaymentOrderUpdateRequestWithId(
                        paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                    ) = paymentOrderUpdateRequestWithId.validity()

                    override fun visitExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                    ) = expectedPaymentUpdateRequestWithId.validity()

                    override fun visitTransactionUpdateRequestWithId(
                        transactionUpdateRequestWithId: TransactionUpdateRequestWithId
                    ) = transactionUpdateRequestWithId.validity()

                    override fun visitLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                    ) = ledgerTransactionUpdateRequestWithId.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Resource && paymentOrderAsyncCreateRequest == other.paymentOrderAsyncCreateRequest && expectedPaymentCreateRequest == other.expectedPaymentCreateRequest && ledgerTransactionCreateRequest == other.ledgerTransactionCreateRequest && ledgerAccountCreateRequest == other.ledgerAccountCreateRequest && transactionCreateRequest == other.transactionCreateRequest && id == other.id && paymentOrderUpdateRequestWithId == other.paymentOrderUpdateRequestWithId && expectedPaymentUpdateRequestWithId == other.expectedPaymentUpdateRequestWithId && transactionUpdateRequestWithId == other.transactionUpdateRequestWithId && ledgerTransactionUpdateRequestWithId == other.ledgerTransactionUpdateRequestWithId /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrderAsyncCreateRequest, expectedPaymentCreateRequest, ledgerTransactionCreateRequest, ledgerAccountCreateRequest, transactionCreateRequest, id, paymentOrderUpdateRequestWithId, expectedPaymentUpdateRequestWithId, transactionUpdateRequestWithId, ledgerTransactionUpdateRequestWithId) /* spotless:on */

        override fun toString(): String =
            when {
                paymentOrderAsyncCreateRequest != null ->
                    "Resource{paymentOrderAsyncCreateRequest=$paymentOrderAsyncCreateRequest}"
                expectedPaymentCreateRequest != null ->
                    "Resource{expectedPaymentCreateRequest=$expectedPaymentCreateRequest}"
                ledgerTransactionCreateRequest != null ->
                    "Resource{ledgerTransactionCreateRequest=$ledgerTransactionCreateRequest}"
                ledgerAccountCreateRequest != null ->
                    "Resource{ledgerAccountCreateRequest=$ledgerAccountCreateRequest}"
                transactionCreateRequest != null ->
                    "Resource{transactionCreateRequest=$transactionCreateRequest}"
                id != null -> "Resource{id=$id}"
                paymentOrderUpdateRequestWithId != null ->
                    "Resource{paymentOrderUpdateRequestWithId=$paymentOrderUpdateRequestWithId}"
                expectedPaymentUpdateRequestWithId != null ->
                    "Resource{expectedPaymentUpdateRequestWithId=$expectedPaymentUpdateRequestWithId}"
                transactionUpdateRequestWithId != null ->
                    "Resource{transactionUpdateRequestWithId=$transactionUpdateRequestWithId}"
                ledgerTransactionUpdateRequestWithId != null ->
                    "Resource{ledgerTransactionUpdateRequestWithId=$ledgerTransactionUpdateRequestWithId}"
                _json != null -> "Resource{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Resource")
            }

        companion object {

            fun ofPaymentOrderAsyncCreateRequest(
                paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
            ) = Resource(paymentOrderAsyncCreateRequest = paymentOrderAsyncCreateRequest)

            fun ofExpectedPaymentCreateRequest(
                expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
            ) = Resource(expectedPaymentCreateRequest = expectedPaymentCreateRequest)

            fun ofLedgerTransactionCreateRequest(
                ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
            ) = Resource(ledgerTransactionCreateRequest = ledgerTransactionCreateRequest)

            fun ofLedgerAccountCreateRequest(
                ledgerAccountCreateRequest: LedgerAccountCreateRequest
            ) = Resource(ledgerAccountCreateRequest = ledgerAccountCreateRequest)

            fun ofTransactionCreateRequest(transactionCreateRequest: TransactionCreateRequest) =
                Resource(transactionCreateRequest = transactionCreateRequest)

            fun ofId(id: Id) = Resource(id = id)

            fun ofPaymentOrderUpdateRequestWithId(
                paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
            ) = Resource(paymentOrderUpdateRequestWithId = paymentOrderUpdateRequestWithId)

            fun ofExpectedPaymentUpdateRequestWithId(
                expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
            ) = Resource(expectedPaymentUpdateRequestWithId = expectedPaymentUpdateRequestWithId)

            fun ofTransactionUpdateRequestWithId(
                transactionUpdateRequestWithId: TransactionUpdateRequestWithId
            ) = Resource(transactionUpdateRequestWithId = transactionUpdateRequestWithId)

            fun ofLedgerTransactionUpdateRequestWithId(
                ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
            ) =
                Resource(
                    ledgerTransactionUpdateRequestWithId = ledgerTransactionUpdateRequestWithId
                )
        }

        /**
         * An interface that defines how to map each variant of [Resource] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPaymentOrderAsyncCreateRequest(
                paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
            ): T

            fun visitExpectedPaymentCreateRequest(
                expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
            ): T

            fun visitLedgerTransactionCreateRequest(
                ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
            ): T

            fun visitLedgerAccountCreateRequest(
                ledgerAccountCreateRequest: LedgerAccountCreateRequest
            ): T

            fun visitTransactionCreateRequest(transactionCreateRequest: TransactionCreateRequest): T

            fun visitId(id: Id): T

            fun visitPaymentOrderUpdateRequestWithId(
                paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
            ): T

            fun visitExpectedPaymentUpdateRequestWithId(
                expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
            ): T

            fun visitTransactionUpdateRequestWithId(
                transactionUpdateRequestWithId: TransactionUpdateRequestWithId
            ): T

            fun visitLedgerTransactionUpdateRequestWithId(
                ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
            ): T

            /**
             * Maps an unknown variant of [Resource] to a value of type [T].
             *
             * An instance of [Resource] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws ModernTreasuryInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ModernTreasuryInvalidDataException("Unknown Resource: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Resource>(Resource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Resource {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PaymentOrderAsyncCreateRequest>())
                                ?.let {
                                    Resource(paymentOrderAsyncCreateRequest = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<ExpectedPaymentCreateRequest>())
                                ?.let { Resource(expectedPaymentCreateRequest = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<LedgerTransactionCreateRequest>())
                                ?.let {
                                    Resource(ledgerTransactionCreateRequest = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<LedgerAccountCreateRequest>())
                                ?.let { Resource(ledgerAccountCreateRequest = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<TransactionCreateRequest>())?.let {
                                Resource(transactionCreateRequest = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Id>())?.let {
                                Resource(id = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentOrderUpdateRequestWithId>())
                                ?.let {
                                    Resource(paymentOrderUpdateRequestWithId = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ExpectedPaymentUpdateRequestWithId>(),
                                )
                                ?.let {
                                    Resource(expectedPaymentUpdateRequestWithId = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<TransactionUpdateRequestWithId>())
                                ?.let {
                                    Resource(transactionUpdateRequestWithId = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<LedgerTransactionUpdateRequestWithId>(),
                                )
                                ?.let {
                                    Resource(
                                        ledgerTransactionUpdateRequestWithId = it,
                                        _json = json,
                                    )
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Resource(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Resource>(Resource::class) {

            override fun serialize(
                value: Resource,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.paymentOrderAsyncCreateRequest != null ->
                        generator.writeObject(value.paymentOrderAsyncCreateRequest)
                    value.expectedPaymentCreateRequest != null ->
                        generator.writeObject(value.expectedPaymentCreateRequest)
                    value.ledgerTransactionCreateRequest != null ->
                        generator.writeObject(value.ledgerTransactionCreateRequest)
                    value.ledgerAccountCreateRequest != null ->
                        generator.writeObject(value.ledgerAccountCreateRequest)
                    value.transactionCreateRequest != null ->
                        generator.writeObject(value.transactionCreateRequest)
                    value.id != null -> generator.writeObject(value.id)
                    value.paymentOrderUpdateRequestWithId != null ->
                        generator.writeObject(value.paymentOrderUpdateRequestWithId)
                    value.expectedPaymentUpdateRequestWithId != null ->
                        generator.writeObject(value.expectedPaymentUpdateRequestWithId)
                    value.transactionUpdateRequestWithId != null ->
                        generator.writeObject(value.transactionUpdateRequestWithId)
                    value.ledgerTransactionUpdateRequestWithId != null ->
                        generator.writeObject(value.ledgerTransactionUpdateRequestWithId)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Resource")
                }
            }
        }

        class PaymentOrderAsyncCreateRequest
        private constructor(
            private val amount: JsonField<Long>,
            private val direction: JsonField<Direction>,
            private val originatingAccountId: JsonField<String>,
            private val type: JsonField<PaymentOrderType>,
            private val accounting: JsonField<Accounting>,
            private val accountingCategoryId: JsonField<String>,
            private val accountingLedgerClassId: JsonField<String>,
            private val chargeBearer: JsonField<ChargeBearer>,
            private val currency: JsonField<Currency>,
            private val description: JsonField<String>,
            private val effectiveDate: JsonField<LocalDate>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val fallbackType: JsonField<FallbackType>,
            private val foreignExchangeContract: JsonField<String>,
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
            private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest>,
            private val ledgerTransactionId: JsonField<String>,
            private val lineItems: JsonField<List<LineItemRequest>>,
            private val metadata: JsonField<Metadata>,
            private val nsfProtected: JsonField<Boolean>,
            private val originatingPartyName: JsonField<String>,
            private val priority: JsonField<Priority>,
            private val processAfter: JsonField<OffsetDateTime>,
            private val purpose: JsonField<String>,
            private val receivingAccount: JsonField<ReceivingAccount>,
            private val receivingAccountId: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val sendRemittanceAdvice: JsonField<Boolean>,
            private val statementDescriptor: JsonField<String>,
            private val subtype: JsonField<PaymentOrderSubtype>,
            private val transactionMonitoringEnabled: JsonField<Boolean>,
            private val ultimateOriginatingPartyIdentifier: JsonField<String>,
            private val ultimateOriginatingPartyName: JsonField<String>,
            private val ultimateReceivingPartyIdentifier: JsonField<String>,
            private val ultimateReceivingPartyName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("originating_account_id")
                @ExcludeMissing
                originatingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<PaymentOrderType> = JsonMissing.of(),
                @JsonProperty("accounting")
                @ExcludeMissing
                accounting: JsonField<Accounting> = JsonMissing.of(),
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                accountingCategoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accounting_ledger_class_id")
                @ExcludeMissing
                accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("charge_bearer")
                @ExcludeMissing
                chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fallback_type")
                @ExcludeMissing
                fallbackType: JsonField<FallbackType> = JsonMissing.of(),
                @JsonProperty("foreign_exchange_contract")
                @ExcludeMissing
                foreignExchangeContract: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
                @JsonProperty("ledger_transaction")
                @ExcludeMissing
                ledgerTransaction: JsonField<LedgerTransactionCreateRequest> = JsonMissing.of(),
                @JsonProperty("ledger_transaction_id")
                @ExcludeMissing
                ledgerTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line_items")
                @ExcludeMissing
                lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("nsf_protected")
                @ExcludeMissing
                nsfProtected: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("originating_party_name")
                @ExcludeMissing
                originatingPartyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Priority> = JsonMissing.of(),
                @JsonProperty("process_after")
                @ExcludeMissing
                processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("purpose")
                @ExcludeMissing
                purpose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receiving_account")
                @ExcludeMissing
                receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of(),
                @JsonProperty("receiving_account_id")
                @ExcludeMissing
                receivingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("remittance_information")
                @ExcludeMissing
                remittanceInformation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("send_remittance_advice")
                @ExcludeMissing
                sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                statementDescriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
                @JsonProperty("transaction_monitoring_enabled")
                @ExcludeMissing
                transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ultimate_originating_party_identifier")
                @ExcludeMissing
                ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ultimate_originating_party_name")
                @ExcludeMissing
                ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ultimate_receiving_party_identifier")
                @ExcludeMissing
                ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ultimate_receiving_party_name")
                @ExcludeMissing
                ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                direction,
                originatingAccountId,
                type,
                accounting,
                accountingCategoryId,
                accountingLedgerClassId,
                chargeBearer,
                currency,
                description,
                effectiveDate,
                expiresAt,
                fallbackType,
                foreignExchangeContract,
                foreignExchangeIndicator,
                ledgerTransaction,
                ledgerTransactionId,
                lineItems,
                metadata,
                nsfProtected,
                originatingPartyName,
                priority,
                processAfter,
                purpose,
                receivingAccount,
                receivingAccountId,
                remittanceInformation,
                sendRemittanceAdvice,
                statementDescriptor,
                subtype,
                transactionMonitoringEnabled,
                ultimateOriginatingPartyIdentifier,
                ultimateOriginatingPartyName,
                ultimateReceivingPartyIdentifier,
                ultimateReceivingPartyName,
                mutableMapOf(),
            )

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The ID of one of your organization's internal accounts.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originatingAccountId(): String =
                originatingAccountId.getRequired("originating_account_id")

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): PaymentOrderType = type.getRequired("type")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accounting(): Accounting? = accounting.getNullable("accounting")

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(): String? =
                accountingCategoryId.getNullable("accounting_category_id")

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(): String? =
                accountingLedgerClassId.getNullable("accounting_ledger_class_id")

            /**
             * The party that will pay the fees for the payment order. See
             * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
             * differences between the options.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chargeBearer(): ChargeBearer? = chargeBearer.getNullable("charge_bearer")

            /**
             * Defaults to the currency of the originating account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * An optional description for internal use.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

            /**
             * RFP payments require an expires_at. This value must be past the effective_date.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fallbackType(): FallbackType? = fallbackType.getNullable("fallback_type")

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun foreignExchangeContract(): String? =
                foreignExchangeContract.getNullable("foreign_exchange_contract")

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
                foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerTransaction(): LedgerTransactionCreateRequest? =
                ledgerTransaction.getNullable("ledger_transaction")

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerTransactionId(): String? =
                ledgerTransactionId.getNullable("ledger_transaction_id")

            /**
             * An array of line items that must sum up to the amount of the payment order.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun nsfProtected(): Boolean? = nsfProtected.getNullable("nsf_protected")

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun originatingPartyName(): String? =
                originatingPartyName.getNullable("originating_party_name")

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun priority(): Priority? = priority.getNullable("priority")

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun processAfter(): OffsetDateTime? = processAfter.getNullable("process_after")

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun purpose(): String? = purpose.getNullable("purpose")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun receivingAccount(): ReceivingAccount? =
                receivingAccount.getNullable("receiving_account")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun receivingAccountId(): String? =
                receivingAccountId.getNullable("receiving_account_id")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun sendRemittanceAdvice(): Boolean? =
                sendRemittanceAdvice.getNullable("send_remittance_advice")

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun subtype(): PaymentOrderSubtype? = subtype.getNullable("subtype")

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun transactionMonitoringEnabled(): Boolean? =
                transactionMonitoringEnabled.getNullable("transaction_monitoring_enabled")

            /**
             * Identifier of the ultimate originator of the payment order.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateOriginatingPartyIdentifier(): String? =
                ultimateOriginatingPartyIdentifier.getNullable(
                    "ultimate_originating_party_identifier"
                )

            /**
             * Name of the ultimate originator of the payment order.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateOriginatingPartyName(): String? =
                ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")

            /**
             * Identifier of the ultimate funds recipient.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateReceivingPartyIdentifier(): String? =
                ultimateReceivingPartyIdentifier.getNullable("ultimate_receiving_party_identifier")

            /**
             * Name of the ultimate funds recipient.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateReceivingPartyName(): String? =
                ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [originatingAccountId].
             *
             * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId(): JsonField<String> = originatingAccountId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentOrderType> = type

            /**
             * Returns the raw JSON value of [accounting].
             *
             * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accounting")
            @ExcludeMissing
            fun _accounting(): JsonField<Accounting> = accounting

            /**
             * Returns the raw JSON value of [accountingCategoryId].
             *
             * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

            /**
             * Returns the raw JSON value of [accountingLedgerClassId].
             *
             * Unlike [accountingLedgerClassId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            fun _accountingLedgerClassId(): JsonField<String> = accountingLedgerClassId

            /**
             * Returns the raw JSON value of [chargeBearer].
             *
             * Unlike [chargeBearer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            fun _chargeBearer(): JsonField<ChargeBearer> = chargeBearer

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [fallbackType].
             *
             * Unlike [fallbackType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fallback_type")
            @ExcludeMissing
            fun _fallbackType(): JsonField<FallbackType> = fallbackType

            /**
             * Returns the raw JSON value of [foreignExchangeContract].
             *
             * Unlike [foreignExchangeContract], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            fun _foreignExchangeContract(): JsonField<String> = foreignExchangeContract

            /**
             * Returns the raw JSON value of [foreignExchangeIndicator].
             *
             * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
                foreignExchangeIndicator

            /**
             * Returns the raw JSON value of [ledgerTransaction].
             *
             * Unlike [ledgerTransaction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = ledgerTransaction

            /**
             * Returns the raw JSON value of [ledgerTransactionId].
             *
             * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

            /**
             * Returns the raw JSON value of [lineItems].
             *
             * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [nsfProtected].
             *
             * Unlike [nsfProtected], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            fun _nsfProtected(): JsonField<Boolean> = nsfProtected

            /**
             * Returns the raw JSON value of [originatingPartyName].
             *
             * Unlike [originatingPartyName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            fun _originatingPartyName(): JsonField<String> = originatingPartyName

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority")
            @ExcludeMissing
            fun _priority(): JsonField<Priority> = priority

            /**
             * Returns the raw JSON value of [processAfter].
             *
             * Unlike [processAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("process_after")
            @ExcludeMissing
            fun _processAfter(): JsonField<OffsetDateTime> = processAfter

            /**
             * Returns the raw JSON value of [purpose].
             *
             * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

            /**
             * Returns the raw JSON value of [receivingAccount].
             *
             * Unlike [receivingAccount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiving_account")
            @ExcludeMissing
            fun _receivingAccount(): JsonField<ReceivingAccount> = receivingAccount

            /**
             * Returns the raw JSON value of [receivingAccountId].
             *
             * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId(): JsonField<String> = receivingAccountId

            /**
             * Returns the raw JSON value of [remittanceInformation].
             *
             * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Returns the raw JSON value of [sendRemittanceAdvice].
             *
             * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

            /**
             * Returns the raw JSON value of [statementDescriptor].
             *
             * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * Returns the raw JSON value of [subtype].
             *
             * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun _subtype(): JsonField<PaymentOrderSubtype> = subtype

            /**
             * Returns the raw JSON value of [transactionMonitoringEnabled].
             *
             * Unlike [transactionMonitoringEnabled], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("transaction_monitoring_enabled")
            @ExcludeMissing
            fun _transactionMonitoringEnabled(): JsonField<Boolean> = transactionMonitoringEnabled

            /**
             * Returns the raw JSON value of [ultimateOriginatingPartyIdentifier].
             *
             * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
                ultimateOriginatingPartyIdentifier

            /**
             * Returns the raw JSON value of [ultimateOriginatingPartyName].
             *
             * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            fun _ultimateOriginatingPartyName(): JsonField<String> = ultimateOriginatingPartyName

            /**
             * Returns the raw JSON value of [ultimateReceivingPartyIdentifier].
             *
             * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            fun _ultimateReceivingPartyIdentifier(): JsonField<String> =
                ultimateReceivingPartyIdentifier

            /**
             * Returns the raw JSON value of [ultimateReceivingPartyName].
             *
             * Unlike [ultimateReceivingPartyName], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            fun _ultimateReceivingPartyName(): JsonField<String> = ultimateReceivingPartyName

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
                 * [PaymentOrderAsyncCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .direction()
                 * .originatingAccountId()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentOrderAsyncCreateRequest]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var direction: JsonField<Direction>? = null
                private var originatingAccountId: JsonField<String>? = null
                private var type: JsonField<PaymentOrderType>? = null
                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                    JsonMissing.of()
                private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Priority> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest) =
                    apply {
                        amount = paymentOrderAsyncCreateRequest.amount
                        direction = paymentOrderAsyncCreateRequest.direction
                        originatingAccountId = paymentOrderAsyncCreateRequest.originatingAccountId
                        type = paymentOrderAsyncCreateRequest.type
                        accounting = paymentOrderAsyncCreateRequest.accounting
                        accountingCategoryId = paymentOrderAsyncCreateRequest.accountingCategoryId
                        accountingLedgerClassId =
                            paymentOrderAsyncCreateRequest.accountingLedgerClassId
                        chargeBearer = paymentOrderAsyncCreateRequest.chargeBearer
                        currency = paymentOrderAsyncCreateRequest.currency
                        description = paymentOrderAsyncCreateRequest.description
                        effectiveDate = paymentOrderAsyncCreateRequest.effectiveDate
                        expiresAt = paymentOrderAsyncCreateRequest.expiresAt
                        fallbackType = paymentOrderAsyncCreateRequest.fallbackType
                        foreignExchangeContract =
                            paymentOrderAsyncCreateRequest.foreignExchangeContract
                        foreignExchangeIndicator =
                            paymentOrderAsyncCreateRequest.foreignExchangeIndicator
                        ledgerTransaction = paymentOrderAsyncCreateRequest.ledgerTransaction
                        ledgerTransactionId = paymentOrderAsyncCreateRequest.ledgerTransactionId
                        lineItems =
                            paymentOrderAsyncCreateRequest.lineItems.map { it.toMutableList() }
                        metadata = paymentOrderAsyncCreateRequest.metadata
                        nsfProtected = paymentOrderAsyncCreateRequest.nsfProtected
                        originatingPartyName = paymentOrderAsyncCreateRequest.originatingPartyName
                        priority = paymentOrderAsyncCreateRequest.priority
                        processAfter = paymentOrderAsyncCreateRequest.processAfter
                        purpose = paymentOrderAsyncCreateRequest.purpose
                        receivingAccount = paymentOrderAsyncCreateRequest.receivingAccount
                        receivingAccountId = paymentOrderAsyncCreateRequest.receivingAccountId
                        remittanceInformation = paymentOrderAsyncCreateRequest.remittanceInformation
                        sendRemittanceAdvice = paymentOrderAsyncCreateRequest.sendRemittanceAdvice
                        statementDescriptor = paymentOrderAsyncCreateRequest.statementDescriptor
                        subtype = paymentOrderAsyncCreateRequest.subtype
                        transactionMonitoringEnabled =
                            paymentOrderAsyncCreateRequest.transactionMonitoringEnabled
                        ultimateOriginatingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyIdentifier
                        ultimateOriginatingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyName
                        ultimateReceivingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyIdentifier
                        ultimateReceivingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyName
                        additionalProperties =
                            paymentOrderAsyncCreateRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /**
                 * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatingAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                /**
                 * Sets [Builder.accounting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accounting] with a well-typed [Accounting] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accounting(accounting: JsonField<Accounting>) = apply {
                    this.accounting = accounting
                }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: String?) =
                    accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                /**
                 * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountingCategoryId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: String?) =
                    accountingLedgerClassId(JsonField.ofNullable(accountingLedgerClassId))

                /**
                 * Sets [Builder.accountingLedgerClassId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountingLedgerClassId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /**
                 * The party that will pay the fees for the payment order. See
                 * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
                 * differences between the options.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer?) =
                    chargeBearer(JsonField.ofNullable(chargeBearer))

                /**
                 * Sets [Builder.chargeBearer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                    this.chargeBearer = chargeBearer
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType) =
                    fallbackType(JsonField.of(fallbackType))

                /**
                 * Sets [Builder.fallbackType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fallbackType] with a well-typed [FallbackType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String?) =
                    foreignExchangeContract(JsonField.ofNullable(foreignExchangeContract))

                /**
                 * Sets [Builder.foreignExchangeContract] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignExchangeContract] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                    foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

                /**
                 * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
                 * [ForeignExchangeIndicator] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                    ledgerTransaction(JsonField.of(ledgerTransaction))

                /**
                 * Sets [Builder.ledgerTransaction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerTransaction] with a well-typed
                 * [LedgerTransactionCreateRequest] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun ledgerTransaction(
                    ledgerTransaction: JsonField<LedgerTransactionCreateRequest>
                ) = apply { this.ledgerTransaction = ledgerTransaction }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon payment order creation. Once the
                 * payment order is created, the status of the ledger transaction tracks the payment
                 * order automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: String) =
                    ledgerTransactionId(JsonField.of(ledgerTransactionId))

                /**
                 * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerTransactionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /**
                 * Sets [Builder.lineItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineItems] with a well-typed
                 * `List<LineItemRequest>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LineItemRequest] to [lineItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lineItems", it).add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

                /**
                 * Sets [Builder.nsfProtected] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                    this.nsfProtected = nsfProtected
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String?) =
                    originatingPartyName(JsonField.ofNullable(originatingPartyName))

                /**
                 * Sets [Builder.originatingPartyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatingPartyName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Priority] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime?) =
                    processAfter(JsonField.ofNullable(processAfter))

                /**
                 * Sets [Builder.processAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

                /**
                 * Sets [Builder.purpose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.purpose] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Sets [Builder.receivingAccount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingAccount] with a well-typed
                 * [ReceivingAccount] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String) =
                    receivingAccountId(JsonField.of(receivingAccountId))

                /**
                 * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remittanceInformation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
                    sendRemittanceAdvice(JsonField.ofNullable(sendRemittanceAdvice))

                /**
                 * Alias for [Builder.sendRemittanceAdvice].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

                /**
                 * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sendRemittanceAdvice] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statementDescriptor] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype?) = subtype(JsonField.ofNullable(subtype))

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply {
                    this.subtype = subtype
                }

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) =
                    transactionMonitoringEnabled(JsonField.of(transactionMonitoringEnabled))

                /**
                 * Sets [Builder.transactionMonitoringEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionMonitoringEnabled] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: JsonField<Boolean>) =
                    apply {
                        this.transactionMonitoringEnabled = transactionMonitoringEnabled
                    }

                /** Identifier of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: String?
                ) =
                    ultimateOriginatingPartyIdentifier(
                        JsonField.ofNullable(ultimateOriginatingPartyIdentifier)
                    )

                /**
                 * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /** Name of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
                    ultimateOriginatingPartyName(JsonField.ofNullable(ultimateOriginatingPartyName))

                /**
                 * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                    }

                /** Identifier of the ultimate funds recipient. */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                    ultimateReceivingPartyIdentifier(
                        JsonField.ofNullable(ultimateReceivingPartyIdentifier)
                    )

                /**
                 * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

                /** Name of the ultimate funds recipient. */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
                    ultimateReceivingPartyName(JsonField.ofNullable(ultimateReceivingPartyName))

                /**
                 * Sets [Builder.ultimateReceivingPartyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateReceivingPartyName = ultimateReceivingPartyName
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PaymentOrderAsyncCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .direction()
                 * .originatingAccountId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PaymentOrderAsyncCreateRequest =
                    PaymentOrderAsyncCreateRequest(
                        checkRequired("amount", amount),
                        checkRequired("direction", direction),
                        checkRequired("originatingAccountId", originatingAccountId),
                        checkRequired("type", type),
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        chargeBearer,
                        currency,
                        description,
                        effectiveDate,
                        expiresAt,
                        fallbackType,
                        foreignExchangeContract,
                        foreignExchangeIndicator,
                        ledgerTransaction,
                        ledgerTransactionId,
                        (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        nsfProtected,
                        originatingPartyName,
                        priority,
                        processAfter,
                        purpose,
                        receivingAccount,
                        receivingAccountId,
                        remittanceInformation,
                        sendRemittanceAdvice,
                        statementDescriptor,
                        subtype,
                        transactionMonitoringEnabled,
                        ultimateOriginatingPartyIdentifier,
                        ultimateOriginatingPartyName,
                        ultimateReceivingPartyIdentifier,
                        ultimateReceivingPartyName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentOrderAsyncCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amount()
                direction().validate()
                originatingAccountId()
                type().validate()
                accounting()?.validate()
                accountingCategoryId()
                accountingLedgerClassId()
                chargeBearer()?.validate()
                currency()?.validate()
                description()
                effectiveDate()
                expiresAt()
                fallbackType()?.validate()
                foreignExchangeContract()
                foreignExchangeIndicator()?.validate()
                ledgerTransaction()?.validate()
                ledgerTransactionId()
                lineItems()?.forEach { it.validate() }
                metadata()?.validate()
                nsfProtected()
                originatingPartyName()
                priority()?.validate()
                processAfter()
                purpose()
                receivingAccount()?.validate()
                receivingAccountId()
                remittanceInformation()
                sendRemittanceAdvice()
                statementDescriptor()
                subtype()?.validate()
                transactionMonitoringEnabled()
                ultimateOriginatingPartyIdentifier()
                ultimateOriginatingPartyName()
                ultimateReceivingPartyIdentifier()
                ultimateReceivingPartyName()
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
                    (direction.asKnown()?.validity() ?: 0) +
                    (if (originatingAccountId.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0) +
                    (accounting.asKnown()?.validity() ?: 0) +
                    (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                    (if (accountingLedgerClassId.asKnown() == null) 0 else 1) +
                    (chargeBearer.asKnown()?.validity() ?: 0) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (effectiveDate.asKnown() == null) 0 else 1) +
                    (if (expiresAt.asKnown() == null) 0 else 1) +
                    (fallbackType.asKnown()?.validity() ?: 0) +
                    (if (foreignExchangeContract.asKnown() == null) 0 else 1) +
                    (foreignExchangeIndicator.asKnown()?.validity() ?: 0) +
                    (ledgerTransaction.asKnown()?.validity() ?: 0) +
                    (if (ledgerTransactionId.asKnown() == null) 0 else 1) +
                    (lineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (nsfProtected.asKnown() == null) 0 else 1) +
                    (if (originatingPartyName.asKnown() == null) 0 else 1) +
                    (priority.asKnown()?.validity() ?: 0) +
                    (if (processAfter.asKnown() == null) 0 else 1) +
                    (if (purpose.asKnown() == null) 0 else 1) +
                    (receivingAccount.asKnown()?.validity() ?: 0) +
                    (if (receivingAccountId.asKnown() == null) 0 else 1) +
                    (if (remittanceInformation.asKnown() == null) 0 else 1) +
                    (if (sendRemittanceAdvice.asKnown() == null) 0 else 1) +
                    (if (statementDescriptor.asKnown() == null) 0 else 1) +
                    (subtype.asKnown()?.validity() ?: 0) +
                    (if (transactionMonitoringEnabled.asKnown() == null) 0 else 1) +
                    (if (ultimateOriginatingPartyIdentifier.asKnown() == null) 0 else 1) +
                    (if (ultimateOriginatingPartyName.asKnown() == null) 0 else 1) +
                    (if (ultimateReceivingPartyIdentifier.asKnown() == null) 0 else 1) +
                    (if (ultimateReceivingPartyName.asKnown() == null) 0 else 1)

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT,
                    DEBIT,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Direction = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The party that will pay the fees for the payment order. See
             * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
             * differences between the options.
             */
            class ChargeBearer
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val SHARED = of("shared")

                    val SENDER = of("sender")

                    val RECEIVER = of("receiver")

                    fun of(value: String) = ChargeBearer(JsonField.of(value))
                }

                /** An enum containing [ChargeBearer]'s known values. */
                enum class Known {
                    SHARED,
                    SENDER,
                    RECEIVER,
                }

                /**
                 * An enum containing [ChargeBearer]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ChargeBearer] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SHARED,
                    SENDER,
                    RECEIVER,
                    /**
                     * An enum member indicating that [ChargeBearer] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SHARED -> Value.SHARED
                        SENDER -> Value.SENDER
                        RECEIVER -> Value.RECEIVER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SHARED -> Known.SHARED
                        SENDER -> Known.SENDER
                        RECEIVER -> Known.RECEIVER
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ChargeBearer = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            class FallbackType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

                    fun of(value: String) = FallbackType(JsonField.of(value))
                }

                /** An enum containing [FallbackType]'s known values. */
                enum class Known {
                    ACH
                }

                /**
                 * An enum containing [FallbackType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [FallbackType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH,
                    /**
                     * An enum member indicating that [FallbackType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): FallbackType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FIXED_TO_VARIABLE = of("fixed_to_variable")

                    val VARIABLE_TO_FIXED = of("variable_to_fixed")

                    fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                /** An enum containing [ForeignExchangeIndicator]'s known values. */
                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                }

                /**
                 * An enum containing [ForeignExchangeIndicator]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ForeignExchangeIndicator] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    /**
                     * An enum member indicating that [ForeignExchangeIndicator] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ForeignExchangeIndicator = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class LineItemRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val accountingCategoryId: JsonField<String>,
                private val description: JsonField<String>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("accounting_category_id")
                    @ExcludeMissing
                    accountingCategoryId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(amount, accountingCategoryId, description, metadata, mutableMapOf())

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountingCategoryId(): String? =
                    accountingCategoryId.getNullable("accounting_category_id")

                /**
                 * A free-form description of the line item.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [accountingCategoryId].
                 *
                 * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of [LineItemRequest].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LineItemRequest]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        description = lineItemRequest.description
                        metadata = lineItemRequest.metadata
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) =
                        accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                    /**
                     * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountingCategoryId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [LineItemRequest].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkRequired("amount", amount),
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LineItemRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    accountingCategoryId()
                    description()
                    metadata()?.validate()
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
                        (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (metadata.asKnown()?.validity() ?: 0)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            class Priority @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val HIGH = of("high")

                    val NORMAL = of("normal")

                    fun of(value: String) = Priority(JsonField.of(value))
                }

                /** An enum containing [Priority]'s known values. */
                enum class Known {
                    HIGH,
                    NORMAL,
                }

                /**
                 * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Priority] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HIGH,
                    NORMAL,
                    /**
                     * An enum member indicating that [Priority] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        HIGH -> Value.HIGH
                        NORMAL -> Value.NORMAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        HIGH -> Known.HIGH
                        NORMAL -> Known.NORMAL
                        else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Priority = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            class ReceivingAccount
            private constructor(
                private val accountDetails: JsonField<List<AccountDetail>>,
                private val accountType: JsonField<ExternalAccountType>,
                private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
                private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
                private val metadata: JsonField<Metadata>,
                private val name: JsonField<String>,
                private val partyAddress: JsonField<AddressRequest>,
                private val partyIdentifier: JsonField<String>,
                private val partyName: JsonField<String>,
                private val partyType: JsonField<PartyType>,
                private val plaidProcessorToken: JsonField<String>,
                private val routingDetails: JsonField<List<RoutingDetail>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("account_details")
                    @ExcludeMissing
                    accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
                    @JsonProperty("account_type")
                    @ExcludeMissing
                    accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
                    @JsonProperty("contact_details")
                    @ExcludeMissing
                    contactDetails: JsonField<List<ContactDetailCreateRequest>> = JsonMissing.of(),
                    @JsonProperty("ledger_account")
                    @ExcludeMissing
                    ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("party_address")
                    @ExcludeMissing
                    partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
                    @JsonProperty("party_identifier")
                    @ExcludeMissing
                    partyIdentifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("party_name")
                    @ExcludeMissing
                    partyName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("party_type")
                    @ExcludeMissing
                    partyType: JsonField<PartyType> = JsonMissing.of(),
                    @JsonProperty("plaid_processor_token")
                    @ExcludeMissing
                    plaidProcessorToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("routing_details")
                    @ExcludeMissing
                    routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
                ) : this(
                    accountDetails,
                    accountType,
                    contactDetails,
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    routingDetails,
                    mutableMapOf(),
                )

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountDetails(): List<AccountDetail>? =
                    accountDetails.getNullable("account_details")

                /**
                 * Can be `checking`, `savings` or `other`.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun contactDetails(): List<ContactDetailCreateRequest>? =
                    contactDetails.getNullable("contact_details")

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun ledgerAccount(): LedgerAccountCreateRequest? =
                    ledgerAccount.getNullable("ledger_account")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

                /**
                 * Required if receiving wire payments.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyName(): String? = partyName.getNullable("party_name")

                /**
                 * Either `individual` or `business`.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyType(): PartyType? = partyType.getNullable("party_type")

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun plaidProcessorToken(): String? =
                    plaidProcessorToken.getNullable("plaid_processor_token")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun routingDetails(): List<RoutingDetail>? =
                    routingDetails.getNullable("routing_details")

                /**
                 * Returns the raw JSON value of [accountDetails].
                 *
                 * Unlike [accountDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("account_details")
                @ExcludeMissing
                fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

                /**
                 * Returns the raw JSON value of [accountType].
                 *
                 * Unlike [accountType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("account_type")
                @ExcludeMissing
                fun _accountType(): JsonField<ExternalAccountType> = accountType

                /**
                 * Returns the raw JSON value of [contactDetails].
                 *
                 * Unlike [contactDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("contact_details")
                @ExcludeMissing
                fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

                /**
                 * Returns the raw JSON value of [ledgerAccount].
                 *
                 * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ledger_account")
                @ExcludeMissing
                fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [partyAddress].
                 *
                 * Unlike [partyAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("party_address")
                @ExcludeMissing
                fun _partyAddress(): JsonField<AddressRequest> = partyAddress

                /**
                 * Returns the raw JSON value of [partyIdentifier].
                 *
                 * Unlike [partyIdentifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("party_identifier")
                @ExcludeMissing
                fun _partyIdentifier(): JsonField<String> = partyIdentifier

                /**
                 * Returns the raw JSON value of [partyName].
                 *
                 * Unlike [partyName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("party_name")
                @ExcludeMissing
                fun _partyName(): JsonField<String> = partyName

                /**
                 * Returns the raw JSON value of [partyType].
                 *
                 * Unlike [partyType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("party_type")
                @ExcludeMissing
                fun _partyType(): JsonField<PartyType> = partyType

                /**
                 * Returns the raw JSON value of [plaidProcessorToken].
                 *
                 * Unlike [plaidProcessorToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

                /**
                 * Returns the raw JSON value of [routingDetails].
                 *
                 * Unlike [routingDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("routing_details")
                @ExcludeMissing
                fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

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
                     * Returns a mutable builder for constructing an instance of [ReceivingAccount].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ReceivingAccount]. */
                class Builder internal constructor() {

                    private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
                    private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
                    private var contactDetails:
                        JsonField<MutableList<ContactDetailCreateRequest>>? =
                        null
                    private var ledgerAccount: JsonField<LedgerAccountCreateRequest> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
                    private var partyIdentifier: JsonField<String> = JsonMissing.of()
                    private var partyName: JsonField<String> = JsonMissing.of()
                    private var partyType: JsonField<PartyType> = JsonMissing.of()
                    private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
                    private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountDetails = receivingAccount.accountDetails.map { it.toMutableList() }
                        accountType = receivingAccount.accountType
                        contactDetails = receivingAccount.contactDetails.map { it.toMutableList() }
                        ledgerAccount = receivingAccount.ledgerAccount
                        metadata = receivingAccount.metadata
                        name = receivingAccount.name
                        partyAddress = receivingAccount.partyAddress
                        partyIdentifier = receivingAccount.partyIdentifier
                        partyName = receivingAccount.partyName
                        partyType = receivingAccount.partyType
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        routingDetails = receivingAccount.routingDetails.map { it.toMutableList() }
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    fun accountDetails(accountDetails: List<AccountDetail>) =
                        accountDetails(JsonField.of(accountDetails))

                    /**
                     * Sets [Builder.accountDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountDetails] with a well-typed
                     * `List<AccountDetail>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                        this.accountDetails = accountDetails.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [AccountDetail] to [accountDetails].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAccountDetail(accountDetail: AccountDetail) = apply {
                        accountDetails =
                            (accountDetails ?: JsonField.of(mutableListOf())).also {
                                checkKnown("accountDetails", it).add(accountDetail)
                            }
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType) =
                        accountType(JsonField.of(accountType))

                    /**
                     * Sets [Builder.accountType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountType] with a well-typed
                     * [ExternalAccountType] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                        this.accountType = accountType
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                        contactDetails(JsonField.of(contactDetails))

                    /**
                     * Sets [Builder.contactDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contactDetails] with a well-typed
                     * `List<ContactDetailCreateRequest>` value instead. This method is primarily
                     * for setting the field to an undocumented or not yet supported value.
                     */
                    fun contactDetails(
                        contactDetails: JsonField<List<ContactDetailCreateRequest>>
                    ) = apply { this.contactDetails = contactDetails.map { it.toMutableList() } }

                    /**
                     * Adds a single [ContactDetailCreateRequest] to [contactDetails].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                        contactDetails =
                            (contactDetails ?: JsonField.of(mutableListOf())).also {
                                checkKnown("contactDetails", it).add(contactDetail)
                            }
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                        ledgerAccount(JsonField.of(ledgerAccount))

                    /**
                     * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ledgerAccount] with a well-typed
                     * [LedgerAccountCreateRequest] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) =
                        apply {
                            this.ledgerAccount = ledgerAccount
                        }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest) =
                        partyAddress(JsonField.of(partyAddress))

                    /**
                     * Sets [Builder.partyAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyAddress] with a well-typed
                     * [AddressRequest] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                        this.partyAddress = partyAddress
                    }

                    fun partyIdentifier(partyIdentifier: String) =
                        partyIdentifier(JsonField.of(partyIdentifier))

                    /**
                     * Sets [Builder.partyIdentifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyIdentifier] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String) = partyName(JsonField.of(partyName))

                    /**
                     * Sets [Builder.partyName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun partyName(partyName: JsonField<String>) = apply {
                        this.partyName = partyName
                    }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType?) =
                        partyType(JsonField.ofNullable(partyType))

                    /**
                     * Sets [Builder.partyType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyType] with a well-typed [PartyType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun partyType(partyType: JsonField<PartyType>) = apply {
                        this.partyType = partyType
                    }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String) =
                        plaidProcessorToken(JsonField.of(plaidProcessorToken))

                    /**
                     * Sets [Builder.plaidProcessorToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.plaidProcessorToken] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>) =
                        routingDetails(JsonField.of(routingDetails))

                    /**
                     * Sets [Builder.routingDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.routingDetails] with a well-typed
                     * `List<RoutingDetail>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                        this.routingDetails = routingDetails.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [RoutingDetail] to [routingDetails].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                        routingDetails =
                            (routingDetails ?: JsonField.of(mutableListOf())).also {
                                checkKnown("routingDetails", it).add(routingDetail)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ReceivingAccount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            accountType,
                            (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            ledgerAccount,
                            metadata,
                            name,
                            partyAddress,
                            partyIdentifier,
                            partyName,
                            partyType,
                            plaidProcessorToken,
                            (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ReceivingAccount = apply {
                    if (validated) {
                        return@apply
                    }

                    accountDetails()?.forEach { it.validate() }
                    accountType()?.validate()
                    contactDetails()?.forEach { it.validate() }
                    ledgerAccount()?.validate()
                    metadata()?.validate()
                    name()
                    partyAddress()?.validate()
                    partyIdentifier()
                    partyName()
                    partyType()?.validate()
                    plaidProcessorToken()
                    routingDetails()?.forEach { it.validate() }
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
                    (accountDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (accountType.asKnown()?.validity() ?: 0) +
                        (contactDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (ledgerAccount.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (partyAddress.asKnown()?.validity() ?: 0) +
                        (if (partyIdentifier.asKnown() == null) 0 else 1) +
                        (if (partyName.asKnown() == null) 0 else 1) +
                        (partyType.asKnown()?.validity() ?: 0) +
                        (if (plaidProcessorToken.asKnown() == null) 0 else 1) +
                        (routingDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class AccountDetail
                private constructor(
                    private val accountNumber: JsonField<String>,
                    private val accountNumberType: JsonField<AccountNumberType>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        accountNumber: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("account_number_type")
                        @ExcludeMissing
                        accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
                    ) : this(accountNumber, accountNumberType, mutableMapOf())

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun accountNumber(): String = accountNumber.getRequired("account_number")

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun accountNumberType(): AccountNumberType? =
                        accountNumberType.getNullable("account_number_type")

                    /**
                     * Returns the raw JSON value of [accountNumber].
                     *
                     * Unlike [accountNumber], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber(): JsonField<String> = accountNumber

                    /**
                     * Returns the raw JSON value of [accountNumberType].
                     *
                     * Unlike [accountNumberType], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

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
                         * [AccountDetail].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .accountNumber()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [AccountDetail]. */
                    class Builder internal constructor() {

                        private var accountNumber: JsonField<String>? = null
                        private var accountNumberType: JsonField<AccountNumberType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        fun accountNumber(accountNumber: String) =
                            accountNumber(JsonField.of(accountNumber))

                        /**
                         * Sets [Builder.accountNumber] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.accountNumber] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun accountNumber(accountNumber: JsonField<String>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType) =
                            accountNumberType(JsonField.of(accountNumberType))

                        /**
                         * Sets [Builder.accountNumberType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.accountNumberType] with a well-typed
                         * [AccountNumberType] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) =
                            apply {
                                this.accountNumberType = accountNumberType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccountDetail].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .accountNumber()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccountDetail =
                            AccountDetail(
                                checkRequired("accountNumber", accountNumber),
                                accountNumberType,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): AccountDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        accountNumber()
                        accountNumberType()?.validate()
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
                        (if (accountNumber.asKnown() == null) 0 else 1) +
                            (accountNumberType.asKnown()?.validity() ?: 0)

                    class AccountNumberType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AU_NUMBER = of("au_number")

                            val BASE_ADDRESS = of("base_address")

                            val CLABE = of("clabe")

                            val ETHEREUM_ADDRESS = of("ethereum_address")

                            val HK_NUMBER = of("hk_number")

                            val IBAN = of("iban")

                            val ID_NUMBER = of("id_number")

                            val NZ_NUMBER = of("nz_number")

                            val OTHER = of("other")

                            val PAN = of("pan")

                            val POLYGON_ADDRESS = of("polygon_address")

                            val SG_NUMBER = of("sg_number")

                            val SOLANA_ADDRESS = of("solana_address")

                            val WALLET_ADDRESS = of("wallet_address")

                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        /** An enum containing [AccountNumberType]'s known values. */
                        enum class Known {
                            AU_NUMBER,
                            BASE_ADDRESS,
                            CLABE,
                            ETHEREUM_ADDRESS,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            POLYGON_ADDRESS,
                            SG_NUMBER,
                            SOLANA_ADDRESS,
                            WALLET_ADDRESS,
                        }

                        /**
                         * An enum containing [AccountNumberType]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [AccountNumberType] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            AU_NUMBER,
                            BASE_ADDRESS,
                            CLABE,
                            ETHEREUM_ADDRESS,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            POLYGON_ADDRESS,
                            SG_NUMBER,
                            SOLANA_ADDRESS,
                            WALLET_ADDRESS,
                            /**
                             * An enum member indicating that [AccountNumberType] was instantiated
                             * with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                AU_NUMBER -> Value.AU_NUMBER
                                BASE_ADDRESS -> Value.BASE_ADDRESS
                                CLABE -> Value.CLABE
                                ETHEREUM_ADDRESS -> Value.ETHEREUM_ADDRESS
                                HK_NUMBER -> Value.HK_NUMBER
                                IBAN -> Value.IBAN
                                ID_NUMBER -> Value.ID_NUMBER
                                NZ_NUMBER -> Value.NZ_NUMBER
                                OTHER -> Value.OTHER
                                PAN -> Value.PAN
                                POLYGON_ADDRESS -> Value.POLYGON_ADDRESS
                                SG_NUMBER -> Value.SG_NUMBER
                                SOLANA_ADDRESS -> Value.SOLANA_ADDRESS
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                AU_NUMBER -> Known.AU_NUMBER
                                BASE_ADDRESS -> Known.BASE_ADDRESS
                                CLABE -> Known.CLABE
                                ETHEREUM_ADDRESS -> Known.ETHEREUM_ADDRESS
                                HK_NUMBER -> Known.HK_NUMBER
                                IBAN -> Known.IBAN
                                ID_NUMBER -> Known.ID_NUMBER
                                NZ_NUMBER -> Known.NZ_NUMBER
                                OTHER -> Known.OTHER
                                PAN -> Known.PAN
                                POLYGON_ADDRESS -> Known.POLYGON_ADDRESS
                                SG_NUMBER -> Known.SG_NUMBER
                                SOLANA_ADDRESS -> Known.SOLANA_ADDRESS
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        private var validated: Boolean = false

                        fun validate(): AccountNumberType = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                /** Either `individual` or `business`. */
                class PartyType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val BUSINESS = of("business")

                        val INDIVIDUAL = of("individual")

                        fun of(value: String) = PartyType(JsonField.of(value))
                    }

                    /** An enum containing [PartyType]'s known values. */
                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    /**
                     * An enum containing [PartyType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [PartyType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        /**
                         * An enum member indicating that [PartyType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown PartyType: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): PartyType = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class RoutingDetail
                private constructor(
                    private val routingNumber: JsonField<String>,
                    private val routingNumberType: JsonField<RoutingNumberType>,
                    private val paymentType: JsonField<PaymentType>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        routingNumber: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("routing_number_type")
                        @ExcludeMissing
                        routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
                        @JsonProperty("payment_type")
                        @ExcludeMissing
                        paymentType: JsonField<PaymentType> = JsonMissing.of(),
                    ) : this(routingNumber, routingNumberType, paymentType, mutableMapOf())

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun routingNumber(): String = routingNumber.getRequired("routing_number")

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun routingNumberType(): RoutingNumberType =
                        routingNumberType.getRequired("routing_number_type")

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

                    /**
                     * Returns the raw JSON value of [routingNumber].
                     *
                     * Unlike [routingNumber], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber(): JsonField<String> = routingNumber

                    /**
                     * Returns the raw JSON value of [routingNumberType].
                     *
                     * Unlike [routingNumberType], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

                    /**
                     * Returns the raw JSON value of [paymentType].
                     *
                     * Unlike [paymentType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    fun _paymentType(): JsonField<PaymentType> = paymentType

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
                         * [RoutingDetail].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .routingNumber()
                         * .routingNumberType()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [RoutingDetail]. */
                    class Builder internal constructor() {

                        private var routingNumber: JsonField<String>? = null
                        private var routingNumberType: JsonField<RoutingNumberType>? = null
                        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        fun routingNumber(routingNumber: String) =
                            routingNumber(JsonField.of(routingNumber))

                        /**
                         * Sets [Builder.routingNumber] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.routingNumber] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun routingNumber(routingNumber: JsonField<String>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) =
                            routingNumberType(JsonField.of(routingNumberType))

                        /**
                         * Sets [Builder.routingNumberType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.routingNumberType] with a well-typed
                         * [RoutingNumberType] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) =
                            apply {
                                this.routingNumberType = routingNumberType
                            }

                        fun paymentType(paymentType: PaymentType) =
                            paymentType(JsonField.of(paymentType))

                        /**
                         * Sets [Builder.paymentType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.paymentType] with a well-typed
                         * [PaymentType] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [RoutingDetail].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .routingNumber()
                         * .routingNumberType()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): RoutingDetail =
                            RoutingDetail(
                                checkRequired("routingNumber", routingNumber),
                                checkRequired("routingNumberType", routingNumberType),
                                paymentType,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): RoutingDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        routingNumber()
                        routingNumberType().validate()
                        paymentType()?.validate()
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
                        (if (routingNumber.asKnown() == null) 0 else 1) +
                            (routingNumberType.asKnown()?.validity() ?: 0) +
                            (paymentType.asKnown()?.validity() ?: 0)

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ABA = of("aba")

                            val AU_BSB = of("au_bsb")

                            val BR_CODIGO = of("br_codigo")

                            val CA_CPA = of("ca_cpa")

                            val CHIPS = of("chips")

                            val CNAPS = of("cnaps")

                            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

                            val GB_SORT_CODE = of("gb_sort_code")

                            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

                            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

                            val ID_SKNBI_CODE = of("id_sknbi_code")

                            val IL_BANK_CODE = of("il_bank_code")

                            val IN_IFSC = of("in_ifsc")

                            val JP_ZENGIN_CODE = of("jp_zengin_code")

                            val MY_BRANCH_CODE = of("my_branch_code")

                            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                            val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

                            val SWIFT = of("swift")

                            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                            fun of(value: String) = RoutingNumberType(JsonField.of(value))
                        }

                        /** An enum containing [RoutingNumberType]'s known values. */
                        enum class Known {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IL_BANK_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SG_INTERBANK_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                        }

                        /**
                         * An enum containing [RoutingNumberType]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [RoutingNumberType] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IL_BANK_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SG_INTERBANK_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                            /**
                             * An enum member indicating that [RoutingNumberType] was instantiated
                             * with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ABA -> Value.ABA
                                AU_BSB -> Value.AU_BSB
                                BR_CODIGO -> Value.BR_CODIGO
                                CA_CPA -> Value.CA_CPA
                                CHIPS -> Value.CHIPS
                                CNAPS -> Value.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Value.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                                IL_BANK_CODE -> Value.IL_BANK_CODE
                                IN_IFSC -> Value.IN_IFSC
                                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                                SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
                                SWIFT -> Value.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ABA -> Known.ABA
                                AU_BSB -> Known.AU_BSB
                                BR_CODIGO -> Known.BR_CODIGO
                                CA_CPA -> Known.CA_CPA
                                CHIPS -> Known.CHIPS
                                CNAPS -> Known.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Known.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                                IL_BANK_CODE -> Known.IL_BANK_CODE
                                IN_IFSC -> Known.IN_IFSC
                                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                                SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                                SWIFT -> Known.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        private var validated: Boolean = false

                        fun validate(): RoutingNumberType = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class PaymentType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ACH = of("ach")

                            val AU_BECS = of("au_becs")

                            val BACS = of("bacs")

                            val BASE = of("base")

                            val BOOK = of("book")

                            val CARD = of("card")

                            val CHATS = of("chats")

                            val CHECK = of("check")

                            val CROSS_BORDER = of("cross_border")

                            val DK_NETS = of("dk_nets")

                            val EFT = of("eft")

                            val ETHEREUM = of("ethereum")

                            val HU_ICS = of("hu_ics")

                            val INTERAC = of("interac")

                            val MASAV = of("masav")

                            val MX_CCEN = of("mx_ccen")

                            val NEFT = of("neft")

                            val NICS = of("nics")

                            val NZ_BECS = of("nz_becs")

                            val PL_ELIXIR = of("pl_elixir")

                            val POLYGON = of("polygon")

                            val PROVXCHANGE = of("provxchange")

                            val RO_SENT = of("ro_sent")

                            val RTP = of("rtp")

                            val SE_BANKGIROT = of("se_bankgirot")

                            val SEN = of("sen")

                            val SEPA = of("sepa")

                            val SG_GIRO = of("sg_giro")

                            val SIC = of("sic")

                            val SIGNET = of("signet")

                            val SKNBI = of("sknbi")

                            val SOLANA = of("solana")

                            val WIRE = of("wire")

                            val ZENGIN = of("zengin")

                            fun of(value: String) = PaymentType(JsonField.of(value))
                        }

                        /** An enum containing [PaymentType]'s known values. */
                        enum class Known {
                            ACH,
                            AU_BECS,
                            BACS,
                            BASE,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            ETHEREUM,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            POLYGON,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
                            SIC,
                            SIGNET,
                            SKNBI,
                            SOLANA,
                            WIRE,
                            ZENGIN,
                        }

                        /**
                         * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [PaymentType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ACH,
                            AU_BECS,
                            BACS,
                            BASE,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            ETHEREUM,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            POLYGON,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
                            SIC,
                            SIGNET,
                            SKNBI,
                            SOLANA,
                            WIRE,
                            ZENGIN,
                            /**
                             * An enum member indicating that [PaymentType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ACH -> Value.ACH
                                AU_BECS -> Value.AU_BECS
                                BACS -> Value.BACS
                                BASE -> Value.BASE
                                BOOK -> Value.BOOK
                                CARD -> Value.CARD
                                CHATS -> Value.CHATS
                                CHECK -> Value.CHECK
                                CROSS_BORDER -> Value.CROSS_BORDER
                                DK_NETS -> Value.DK_NETS
                                EFT -> Value.EFT
                                ETHEREUM -> Value.ETHEREUM
                                HU_ICS -> Value.HU_ICS
                                INTERAC -> Value.INTERAC
                                MASAV -> Value.MASAV
                                MX_CCEN -> Value.MX_CCEN
                                NEFT -> Value.NEFT
                                NICS -> Value.NICS
                                NZ_BECS -> Value.NZ_BECS
                                PL_ELIXIR -> Value.PL_ELIXIR
                                POLYGON -> Value.POLYGON
                                PROVXCHANGE -> Value.PROVXCHANGE
                                RO_SENT -> Value.RO_SENT
                                RTP -> Value.RTP
                                SE_BANKGIROT -> Value.SE_BANKGIROT
                                SEN -> Value.SEN
                                SEPA -> Value.SEPA
                                SG_GIRO -> Value.SG_GIRO
                                SIC -> Value.SIC
                                SIGNET -> Value.SIGNET
                                SKNBI -> Value.SKNBI
                                SOLANA -> Value.SOLANA
                                WIRE -> Value.WIRE
                                ZENGIN -> Value.ZENGIN
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ACH -> Known.ACH
                                AU_BECS -> Known.AU_BECS
                                BACS -> Known.BACS
                                BASE -> Known.BASE
                                BOOK -> Known.BOOK
                                CARD -> Known.CARD
                                CHATS -> Known.CHATS
                                CHECK -> Known.CHECK
                                CROSS_BORDER -> Known.CROSS_BORDER
                                DK_NETS -> Known.DK_NETS
                                EFT -> Known.EFT
                                ETHEREUM -> Known.ETHEREUM
                                HU_ICS -> Known.HU_ICS
                                INTERAC -> Known.INTERAC
                                MASAV -> Known.MASAV
                                MX_CCEN -> Known.MX_CCEN
                                NEFT -> Known.NEFT
                                NICS -> Known.NICS
                                NZ_BECS -> Known.NZ_BECS
                                PL_ELIXIR -> Known.PL_ELIXIR
                                POLYGON -> Known.POLYGON
                                PROVXCHANGE -> Known.PROVXCHANGE
                                RO_SENT -> Known.RO_SENT
                                RTP -> Known.RTP
                                SE_BANKGIROT -> Known.SE_BANKGIROT
                                SEN -> Known.SEN
                                SEPA -> Known.SEPA
                                SG_GIRO -> Known.SG_GIRO
                                SIC -> Known.SIC
                                SIGNET -> Known.SIGNET
                                SKNBI -> Known.SKNBI
                                SOLANA -> Known.SOLANA
                                WIRE -> Known.WIRE
                                ZENGIN -> Known.ZENGIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown PaymentType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        private var validated: Boolean = false

                        fun validate(): PaymentType = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReceivingAccount && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceivingAccount{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentOrderAsyncCreateRequest && amount == other.amount && direction == other.direction && originatingAccountId == other.originatingAccountId && type == other.type && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && chargeBearer == other.chargeBearer && currency == other.currency && description == other.description && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && subtype == other.subtype && transactionMonitoringEnabled == other.transactionMonitoringEnabled && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, direction, originatingAccountId, type, accounting, accountingCategoryId, accountingLedgerClassId, chargeBearer, currency, description, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, ledgerTransaction, ledgerTransactionId, lineItems, metadata, nsfProtected, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, subtype, transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderAsyncCreateRequest{amount=$amount, direction=$direction, originatingAccountId=$originatingAccountId, type=$type, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, chargeBearer=$chargeBearer, currency=$currency, description=$description, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, subtype=$subtype, transactionMonitoringEnabled=$transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"
        }

        class ExpectedPaymentCreateRequest
        private constructor(
            private val amountLowerBound: JsonField<Long>,
            private val amountUpperBound: JsonField<Long>,
            private val counterpartyId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val dateLowerBound: JsonField<LocalDate>,
            private val dateUpperBound: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val internalAccountId: JsonField<String>,
            private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest>,
            private val ledgerTransactionId: JsonField<String>,
            private val lineItems: JsonField<List<LineItemRequest>>,
            private val metadata: JsonField<Metadata>,
            private val reconciliationFilters: JsonValue,
            private val reconciliationGroups: JsonValue,
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
            private val remittanceInformation: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val type: JsonField<ExpectedPaymentType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount_lower_bound")
                @ExcludeMissing
                amountLowerBound: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("amount_upper_bound")
                @ExcludeMissing
                amountUpperBound: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                counterpartyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("date_lower_bound")
                @ExcludeMissing
                dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("date_upper_bound")
                @ExcludeMissing
                dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                internalAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ledger_transaction")
                @ExcludeMissing
                ledgerTransaction: JsonField<LedgerTransactionCreateRequest> = JsonMissing.of(),
                @JsonProperty("ledger_transaction_id")
                @ExcludeMissing
                ledgerTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line_items")
                @ExcludeMissing
                lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("reconciliation_filters")
                @ExcludeMissing
                reconciliationFilters: JsonValue = JsonMissing.of(),
                @JsonProperty("reconciliation_groups")
                @ExcludeMissing
                reconciliationGroups: JsonValue = JsonMissing.of(),
                @JsonProperty("reconciliation_rule_variables")
                @ExcludeMissing
                reconciliationRuleVariables: JsonField<List<ReconciliationRule>> = JsonMissing.of(),
                @JsonProperty("remittance_information")
                @ExcludeMissing
                remittanceInformation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                statementDescriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
            ) : this(
                amountLowerBound,
                amountUpperBound,
                counterpartyId,
                currency,
                dateLowerBound,
                dateUpperBound,
                description,
                direction,
                internalAccountId,
                ledgerTransaction,
                ledgerTransactionId,
                lineItems,
                metadata,
                reconciliationFilters,
                reconciliationGroups,
                reconciliationRuleVariables,
                remittanceInformation,
                statementDescriptor,
                type,
                mutableMapOf(),
            )

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

            /**
             * The ID of the counterparty you expect for this payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * Must conform to ISO 4217. Defaults to the currency of the internal account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * The earliest date the payment may come in. Format: yyyy-mm-dd
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

            /**
             * The latest date the payment may come in. Format: yyyy-mm-dd
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

            /**
             * An optional description for internal use.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun direction(): Direction? = direction.getNullable("direction")

            /**
             * The ID of the Internal Account for the expected payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerTransaction(): LedgerTransactionCreateRequest? =
                ledgerTransaction.getNullable("ledger_transaction")

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerTransactionId(): String? =
                ledgerTransactionId.getNullable("ledger_transaction_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            fun _reconciliationFilters(): JsonValue = reconciliationFilters

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            fun _reconciliationGroups(): JsonValue = reconciliationGroups

            /**
             * An array of reconciliation rule variables for this payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reconciliationRuleVariables(): List<ReconciliationRule>? =
                reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): ExpectedPaymentType? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [amountLowerBound].
             *
             * Unlike [amountLowerBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            fun _amountLowerBound(): JsonField<Long> = amountLowerBound

            /**
             * Returns the raw JSON value of [amountUpperBound].
             *
             * Unlike [amountUpperBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            fun _amountUpperBound(): JsonField<Long> = amountUpperBound

            /**
             * Returns the raw JSON value of [counterpartyId].
             *
             * Unlike [counterpartyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [dateLowerBound].
             *
             * Unlike [dateLowerBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

            /**
             * Returns the raw JSON value of [dateUpperBound].
             *
             * Unlike [dateUpperBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [internalAccountId].
             *
             * Unlike [internalAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId(): JsonField<String> = internalAccountId

            /**
             * Returns the raw JSON value of [ledgerTransaction].
             *
             * Unlike [ledgerTransaction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = ledgerTransaction

            /**
             * Returns the raw JSON value of [ledgerTransactionId].
             *
             * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

            /**
             * Returns the raw JSON value of [lineItems].
             *
             * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [reconciliationRuleVariables].
             *
             * Unlike [reconciliationRuleVariables], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
                reconciliationRuleVariables

            /**
             * Returns the raw JSON value of [remittanceInformation].
             *
             * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Returns the raw JSON value of [statementDescriptor].
             *
             * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

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
                 * [ExpectedPaymentCreateRequest].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExpectedPaymentCreateRequest]. */
            class Builder internal constructor() {

                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                    JsonMissing.of()
                private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<MutableList<ReconciliationRule>>? =
                    null
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(expectedPaymentCreateRequest: ExpectedPaymentCreateRequest) =
                    apply {
                        amountLowerBound = expectedPaymentCreateRequest.amountLowerBound
                        amountUpperBound = expectedPaymentCreateRequest.amountUpperBound
                        counterpartyId = expectedPaymentCreateRequest.counterpartyId
                        currency = expectedPaymentCreateRequest.currency
                        dateLowerBound = expectedPaymentCreateRequest.dateLowerBound
                        dateUpperBound = expectedPaymentCreateRequest.dateUpperBound
                        description = expectedPaymentCreateRequest.description
                        direction = expectedPaymentCreateRequest.direction
                        internalAccountId = expectedPaymentCreateRequest.internalAccountId
                        ledgerTransaction = expectedPaymentCreateRequest.ledgerTransaction
                        ledgerTransactionId = expectedPaymentCreateRequest.ledgerTransactionId
                        lineItems =
                            expectedPaymentCreateRequest.lineItems.map { it.toMutableList() }
                        metadata = expectedPaymentCreateRequest.metadata
                        reconciliationFilters = expectedPaymentCreateRequest.reconciliationFilters
                        reconciliationGroups = expectedPaymentCreateRequest.reconciliationGroups
                        reconciliationRuleVariables =
                            expectedPaymentCreateRequest.reconciliationRuleVariables.map {
                                it.toMutableList()
                            }
                        remittanceInformation = expectedPaymentCreateRequest.remittanceInformation
                        statementDescriptor = expectedPaymentCreateRequest.statementDescriptor
                        type = expectedPaymentCreateRequest.type
                        additionalProperties =
                            expectedPaymentCreateRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long?) =
                    amountLowerBound(JsonField.ofNullable(amountLowerBound))

                /**
                 * Alias for [Builder.amountLowerBound].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(amountLowerBound as Long?)

                /**
                 * Sets [Builder.amountLowerBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountLowerBound] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long?) =
                    amountUpperBound(JsonField.ofNullable(amountUpperBound))

                /**
                 * Alias for [Builder.amountUpperBound].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(amountUpperBound as Long?)

                /**
                 * Sets [Builder.amountUpperBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountUpperBound] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /**
                 * Sets [Builder.counterpartyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.counterpartyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate?) =
                    dateLowerBound(JsonField.ofNullable(dateLowerBound))

                /**
                 * Sets [Builder.dateLowerBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateLowerBound] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate?) =
                    dateUpperBound(JsonField.ofNullable(dateUpperBound))

                /**
                 * Sets [Builder.dateUpperBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateUpperBound] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String?) =
                    internalAccountId(JsonField.ofNullable(internalAccountId))

                /**
                 * Sets [Builder.internalAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internalAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Specifies a ledger transaction object that will be created with the expected
                 * payment. If the ledger transaction cannot be created, then the expected payment
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the expected payment.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                    ledgerTransaction(JsonField.of(ledgerTransaction))

                /**
                 * Sets [Builder.ledgerTransaction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerTransaction] with a well-typed
                 * [LedgerTransactionCreateRequest] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun ledgerTransaction(
                    ledgerTransaction: JsonField<LedgerTransactionCreateRequest>
                ) = apply { this.ledgerTransaction = ledgerTransaction }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon expected payment creation. Once
                 * the expected payment is created, the status of the ledger transaction tracks the
                 * expected payment automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: String) =
                    ledgerTransactionId(JsonField.of(ledgerTransactionId))

                /**
                 * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerTransactionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /**
                 * Sets [Builder.lineItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineItems] with a well-typed
                 * `List<LineItemRequest>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LineItemRequest] to [lineItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lineItems", it).add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The reconciliation filters you have for this payment. */
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** The reconciliation groups you have for this payment. */
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>?
                ) = reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

                /**
                 * Sets [Builder.reconciliationRuleVariables] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reconciliationRuleVariables] with a well-typed
                 * `List<ReconciliationRule>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
                ) = apply {
                    this.reconciliationRuleVariables =
                        reconciliationRuleVariables.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ReconciliationRule] to [reconciliationRuleVariables].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                    apply {
                        reconciliationRuleVariables =
                            (reconciliationRuleVariables ?: JsonField.of(mutableListOf())).also {
                                checkKnown("reconciliationRuleVariables", it)
                                    .add(reconciliationRuleVariable)
                            }
                    }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remittanceInformation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statementDescriptor] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [ExpectedPaymentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ExpectedPaymentCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ExpectedPaymentCreateRequest =
                    ExpectedPaymentCreateRequest(
                        amountLowerBound,
                        amountUpperBound,
                        counterpartyId,
                        currency,
                        dateLowerBound,
                        dateUpperBound,
                        description,
                        direction,
                        internalAccountId,
                        ledgerTransaction,
                        ledgerTransactionId,
                        (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        reconciliationFilters,
                        reconciliationGroups,
                        (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                        remittanceInformation,
                        statementDescriptor,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExpectedPaymentCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amountLowerBound()
                amountUpperBound()
                counterpartyId()
                currency()?.validate()
                dateLowerBound()
                dateUpperBound()
                description()
                direction()?.validate()
                internalAccountId()
                ledgerTransaction()?.validate()
                ledgerTransactionId()
                lineItems()?.forEach { it.validate() }
                metadata()?.validate()
                reconciliationRuleVariables()?.forEach { it.validate() }
                remittanceInformation()
                statementDescriptor()
                type()?.validate()
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
                (if (amountLowerBound.asKnown() == null) 0 else 1) +
                    (if (amountUpperBound.asKnown() == null) 0 else 1) +
                    (if (counterpartyId.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (dateLowerBound.asKnown() == null) 0 else 1) +
                    (if (dateUpperBound.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (direction.asKnown()?.validity() ?: 0) +
                    (if (internalAccountId.asKnown() == null) 0 else 1) +
                    (ledgerTransaction.asKnown()?.validity() ?: 0) +
                    (if (ledgerTransactionId.asKnown() == null) 0 else 1) +
                    (lineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (reconciliationRuleVariables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (remittanceInformation.asKnown() == null) 0 else 1) +
                    (if (statementDescriptor.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT,
                    DEBIT,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Direction = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class LineItemRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val accountingCategoryId: JsonField<String>,
                private val description: JsonField<String>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("accounting_category_id")
                    @ExcludeMissing
                    accountingCategoryId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(amount, accountingCategoryId, description, metadata, mutableMapOf())

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountingCategoryId(): String? =
                    accountingCategoryId.getNullable("accounting_category_id")

                /**
                 * A free-form description of the line item.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [accountingCategoryId].
                 *
                 * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of [LineItemRequest].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LineItemRequest]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        description = lineItemRequest.description
                        metadata = lineItemRequest.metadata
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) =
                        accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                    /**
                     * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountingCategoryId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [LineItemRequest].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkRequired("amount", amount),
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LineItemRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    accountingCategoryId()
                    description()
                    metadata()?.validate()
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
                        (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (metadata.asKnown()?.validity() ?: 0)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExpectedPaymentCreateRequest && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, ledgerTransaction, ledgerTransactionId, lineItems, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentCreateRequest{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, type=$type, additionalProperties=$additionalProperties}"
        }

        class TransactionCreateRequest
        private constructor(
            private val amount: JsonField<Long>,
            private val asOfDate: JsonField<LocalDate>,
            private val direction: JsonField<String>,
            private val internalAccountId: JsonField<String>,
            private val vendorCode: JsonField<String>,
            private val vendorCodeType: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val posted: JsonField<Boolean>,
            private val type: JsonField<Type>,
            private val vendorCustomerId: JsonField<String>,
            private val vendorDescription: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("as_of_date")
                @ExcludeMissing
                asOfDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<String> = JsonMissing.of(),
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                internalAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vendor_code")
                @ExcludeMissing
                vendorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vendor_code_type")
                @ExcludeMissing
                vendorCodeType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("posted")
                @ExcludeMissing
                posted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("vendor_customer_id")
                @ExcludeMissing
                vendorCustomerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vendor_description")
                @ExcludeMissing
                vendorDescription: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                asOfDate,
                direction,
                internalAccountId,
                vendorCode,
                vendorCodeType,
                metadata,
                posted,
                type,
                vendorCustomerId,
                vendorDescription,
                mutableMapOf(),
            )

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The date on which the transaction occurred.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

            /**
             * Either `credit` or `debit`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): String = direction.getRequired("direction")

            /**
             * The ID of the relevant Internal Account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vendorCode(): String? = vendorCode.getNullable("vendor_code")

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vendorCodeType(): String? = vendorCodeType.getNullable("vendor_code_type")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * This field will be `true` if the transaction has posted to the account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun posted(): Boolean? = posted.getNullable("posted")

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * An identifier given to this transaction by the bank, often `null`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vendorCustomerId(): String? = vendorCustomerId.getNullable("vendor_customer_id")

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vendorDescription(): String? = vendorDescription.getNullable("vendor_description")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [asOfDate].
             *
             * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("as_of_date")
            @ExcludeMissing
            fun _asOfDate(): JsonField<LocalDate> = asOfDate

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<String> = direction

            /**
             * Returns the raw JSON value of [internalAccountId].
             *
             * Unlike [internalAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId(): JsonField<String> = internalAccountId

            /**
             * Returns the raw JSON value of [vendorCode].
             *
             * Unlike [vendorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("vendor_code")
            @ExcludeMissing
            fun _vendorCode(): JsonField<String> = vendorCode

            /**
             * Returns the raw JSON value of [vendorCodeType].
             *
             * Unlike [vendorCodeType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("vendor_code_type")
            @ExcludeMissing
            fun _vendorCodeType(): JsonField<String> = vendorCodeType

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [posted].
             *
             * Unlike [posted], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("posted") @ExcludeMissing fun _posted(): JsonField<Boolean> = posted

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [vendorCustomerId].
             *
             * Unlike [vendorCustomerId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("vendor_customer_id")
            @ExcludeMissing
            fun _vendorCustomerId(): JsonField<String> = vendorCustomerId

            /**
             * Returns the raw JSON value of [vendorDescription].
             *
             * Unlike [vendorDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("vendor_description")
            @ExcludeMissing
            fun _vendorDescription(): JsonField<String> = vendorDescription

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
                 * [TransactionCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .asOfDate()
                 * .direction()
                 * .internalAccountId()
                 * .vendorCode()
                 * .vendorCodeType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TransactionCreateRequest]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var asOfDate: JsonField<LocalDate>? = null
                private var direction: JsonField<String>? = null
                private var internalAccountId: JsonField<String>? = null
                private var vendorCode: JsonField<String>? = null
                private var vendorCodeType: JsonField<String>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var posted: JsonField<Boolean> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var vendorCustomerId: JsonField<String> = JsonMissing.of()
                private var vendorDescription: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transactionCreateRequest: TransactionCreateRequest) = apply {
                    amount = transactionCreateRequest.amount
                    asOfDate = transactionCreateRequest.asOfDate
                    direction = transactionCreateRequest.direction
                    internalAccountId = transactionCreateRequest.internalAccountId
                    vendorCode = transactionCreateRequest.vendorCode
                    vendorCodeType = transactionCreateRequest.vendorCodeType
                    metadata = transactionCreateRequest.metadata
                    posted = transactionCreateRequest.posted
                    type = transactionCreateRequest.type
                    vendorCustomerId = transactionCreateRequest.vendorCustomerId
                    vendorDescription = transactionCreateRequest.vendorDescription
                    additionalProperties =
                        transactionCreateRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The date on which the transaction occurred. */
                fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

                /**
                 * Sets [Builder.asOfDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

                /** Either `credit` or `debit`. */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /** The ID of the relevant Internal Account. */
                fun internalAccountId(internalAccountId: String) =
                    internalAccountId(JsonField.of(internalAccountId))

                /**
                 * Sets [Builder.internalAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internalAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                fun vendorCode(vendorCode: String?) = vendorCode(JsonField.ofNullable(vendorCode))

                /**
                 * Sets [Builder.vendorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vendorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vendorCode(vendorCode: JsonField<String>) = apply {
                    this.vendorCode = vendorCode
                }

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                fun vendorCodeType(vendorCodeType: String?) =
                    vendorCodeType(JsonField.ofNullable(vendorCodeType))

                /**
                 * Sets [Builder.vendorCodeType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vendorCodeType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                    this.vendorCodeType = vendorCodeType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** This field will be `true` if the transaction has posted to the account. */
                fun posted(posted: Boolean) = posted(JsonField.of(posted))

                /**
                 * Sets [Builder.posted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.posted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

                /**
                 * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`,
                 * `rtp`, `book`, or `sen`.
                 */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** An identifier given to this transaction by the bank, often `null`. */
                fun vendorCustomerId(vendorCustomerId: String?) =
                    vendorCustomerId(JsonField.ofNullable(vendorCustomerId))

                /**
                 * Sets [Builder.vendorCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vendorCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
                    this.vendorCustomerId = vendorCustomerId
                }

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                fun vendorDescription(vendorDescription: String?) =
                    vendorDescription(JsonField.ofNullable(vendorDescription))

                /**
                 * Sets [Builder.vendorDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vendorDescription] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun vendorDescription(vendorDescription: JsonField<String>) = apply {
                    this.vendorDescription = vendorDescription
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TransactionCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .asOfDate()
                 * .direction()
                 * .internalAccountId()
                 * .vendorCode()
                 * .vendorCodeType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TransactionCreateRequest =
                    TransactionCreateRequest(
                        checkRequired("amount", amount),
                        checkRequired("asOfDate", asOfDate),
                        checkRequired("direction", direction),
                        checkRequired("internalAccountId", internalAccountId),
                        checkRequired("vendorCode", vendorCode),
                        checkRequired("vendorCodeType", vendorCodeType),
                        metadata,
                        posted,
                        type,
                        vendorCustomerId,
                        vendorDescription,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TransactionCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amount()
                asOfDate()
                direction()
                internalAccountId()
                vendorCode()
                vendorCodeType()
                metadata()?.validate()
                posted()
                type()?.validate()
                vendorCustomerId()
                vendorDescription()
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
                    (if (asOfDate.asKnown() == null) 0 else 1) +
                    (if (direction.asKnown() == null) 0 else 1) +
                    (if (internalAccountId.asKnown() == null) 0 else 1) +
                    (if (vendorCode.asKnown() == null) 0 else 1) +
                    (if (vendorCodeType.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (posted.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (vendorCustomerId.asKnown() == null) 0 else 1) +
                    (if (vendorDescription.asKnown() == null) 0 else 1)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

                    val AU_BECS = of("au_becs")

                    val BACS = of("bacs")

                    val BASE = of("base")

                    val BOOK = of("book")

                    val CARD = of("card")

                    val CHATS = of("chats")

                    val CHECK = of("check")

                    val CROSS_BORDER = of("cross_border")

                    val DK_NETS = of("dk_nets")

                    val EFT = of("eft")

                    val ETHEREUM = of("ethereum")

                    val HU_ICS = of("hu_ics")

                    val INTERAC = of("interac")

                    val MASAV = of("masav")

                    val MX_CCEN = of("mx_ccen")

                    val NEFT = of("neft")

                    val NICS = of("nics")

                    val NZ_BECS = of("nz_becs")

                    val PL_ELIXIR = of("pl_elixir")

                    val POLYGON = of("polygon")

                    val PROVXCHANGE = of("provxchange")

                    val RO_SENT = of("ro_sent")

                    val RTP = of("rtp")

                    val SE_BANKGIROT = of("se_bankgirot")

                    val SEN = of("sen")

                    val SEPA = of("sepa")

                    val SG_GIRO = of("sg_giro")

                    val SIC = of("sic")

                    val SIGNET = of("signet")

                    val SKNBI = of("sknbi")

                    val SOLANA = of("solana")

                    val WIRE = of("wire")

                    val ZENGIN = of("zengin")

                    val OTHER = of("other")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ACH,
                    AU_BECS,
                    BACS,
                    BASE,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    ETHEREUM,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
                    POLYGON,
                    PROVXCHANGE,
                    RO_SENT,
                    RTP,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SG_GIRO,
                    SIC,
                    SIGNET,
                    SKNBI,
                    SOLANA,
                    WIRE,
                    ZENGIN,
                    OTHER,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH,
                    AU_BECS,
                    BACS,
                    BASE,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    ETHEREUM,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
                    POLYGON,
                    PROVXCHANGE,
                    RO_SENT,
                    RTP,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SG_GIRO,
                    SIC,
                    SIGNET,
                    SKNBI,
                    SOLANA,
                    WIRE,
                    ZENGIN,
                    OTHER,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        AU_BECS -> Value.AU_BECS
                        BACS -> Value.BACS
                        BASE -> Value.BASE
                        BOOK -> Value.BOOK
                        CARD -> Value.CARD
                        CHATS -> Value.CHATS
                        CHECK -> Value.CHECK
                        CROSS_BORDER -> Value.CROSS_BORDER
                        DK_NETS -> Value.DK_NETS
                        EFT -> Value.EFT
                        ETHEREUM -> Value.ETHEREUM
                        HU_ICS -> Value.HU_ICS
                        INTERAC -> Value.INTERAC
                        MASAV -> Value.MASAV
                        MX_CCEN -> Value.MX_CCEN
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PL_ELIXIR -> Value.PL_ELIXIR
                        POLYGON -> Value.POLYGON
                        PROVXCHANGE -> Value.PROVXCHANGE
                        RO_SENT -> Value.RO_SENT
                        RTP -> Value.RTP
                        SE_BANKGIROT -> Value.SE_BANKGIROT
                        SEN -> Value.SEN
                        SEPA -> Value.SEPA
                        SG_GIRO -> Value.SG_GIRO
                        SIC -> Value.SIC
                        SIGNET -> Value.SIGNET
                        SKNBI -> Value.SKNBI
                        SOLANA -> Value.SOLANA
                        WIRE -> Value.WIRE
                        ZENGIN -> Value.ZENGIN
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        AU_BECS -> Known.AU_BECS
                        BACS -> Known.BACS
                        BASE -> Known.BASE
                        BOOK -> Known.BOOK
                        CARD -> Known.CARD
                        CHATS -> Known.CHATS
                        CHECK -> Known.CHECK
                        CROSS_BORDER -> Known.CROSS_BORDER
                        DK_NETS -> Known.DK_NETS
                        EFT -> Known.EFT
                        ETHEREUM -> Known.ETHEREUM
                        HU_ICS -> Known.HU_ICS
                        INTERAC -> Known.INTERAC
                        MASAV -> Known.MASAV
                        MX_CCEN -> Known.MX_CCEN
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PL_ELIXIR -> Known.PL_ELIXIR
                        POLYGON -> Known.POLYGON
                        PROVXCHANGE -> Known.PROVXCHANGE
                        RO_SENT -> Known.RO_SENT
                        RTP -> Known.RTP
                        SE_BANKGIROT -> Known.SE_BANKGIROT
                        SEN -> Known.SEN
                        SEPA -> Known.SEPA
                        SG_GIRO -> Known.SG_GIRO
                        SIC -> Known.SIC
                        SIGNET -> Known.SIGNET
                        SKNBI -> Known.SKNBI
                        SOLANA -> Known.SOLANA
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        OTHER -> Known.OTHER
                        else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionCreateRequest && amount == other.amount && asOfDate == other.asOfDate && direction == other.direction && internalAccountId == other.internalAccountId && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && metadata == other.metadata && posted == other.posted && type == other.type && vendorCustomerId == other.vendorCustomerId && vendorDescription == other.vendorDescription && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorCustomerId, vendorDescription, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionCreateRequest{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorCustomerId=$vendorCustomerId, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
        }

        class Id
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                /** Returns a mutable builder for constructing an instance of [Id]. */
                fun builder() = Builder()
            }

            /** A builder for [Id]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(id: Id) = apply {
                    this.id = id.id
                    additionalProperties = id.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Id].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Id = Id(id, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Id = apply {
                if (validated) {
                    return@apply
                }

                id()
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
            internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Id && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Id{id=$id, additionalProperties=$additionalProperties}"
        }

        class PaymentOrderUpdateRequestWithId
        private constructor(
            private val id: JsonField<String>,
            private val accounting: JsonField<Accounting>,
            private val accountingCategoryId: JsonField<String>,
            private val accountingLedgerClassId: JsonField<String>,
            private val amount: JsonField<Long>,
            private val chargeBearer: JsonField<ChargeBearer>,
            private val counterpartyId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val description: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val effectiveDate: JsonField<LocalDate>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val fallbackType: JsonField<FallbackType>,
            private val foreignExchangeContract: JsonField<String>,
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
            private val lineItems: JsonField<List<LineItemRequest>>,
            private val metadata: JsonField<Metadata>,
            private val nsfProtected: JsonField<Boolean>,
            private val originatingAccountId: JsonField<String>,
            private val originatingPartyName: JsonField<String>,
            private val priority: JsonField<Priority>,
            private val processAfter: JsonField<OffsetDateTime>,
            private val purpose: JsonField<String>,
            private val receivingAccount: JsonField<ReceivingAccount>,
            private val receivingAccountId: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val sendRemittanceAdvice: JsonField<Boolean>,
            private val statementDescriptor: JsonField<String>,
            private val status: JsonField<Status>,
            private val subtype: JsonField<PaymentOrderSubtype>,
            private val type: JsonField<PaymentOrderType>,
            private val ultimateOriginatingPartyIdentifier: JsonField<String>,
            private val ultimateOriginatingPartyName: JsonField<String>,
            private val ultimateReceivingPartyIdentifier: JsonField<String>,
            private val ultimateReceivingPartyName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accounting")
                @ExcludeMissing
                accounting: JsonField<Accounting> = JsonMissing.of(),
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                accountingCategoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accounting_ledger_class_id")
                @ExcludeMissing
                accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("charge_bearer")
                @ExcludeMissing
                chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                counterpartyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fallback_type")
                @ExcludeMissing
                fallbackType: JsonField<FallbackType> = JsonMissing.of(),
                @JsonProperty("foreign_exchange_contract")
                @ExcludeMissing
                foreignExchangeContract: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
                @JsonProperty("line_items")
                @ExcludeMissing
                lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("nsf_protected")
                @ExcludeMissing
                nsfProtected: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("originating_account_id")
                @ExcludeMissing
                originatingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("originating_party_name")
                @ExcludeMissing
                originatingPartyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Priority> = JsonMissing.of(),
                @JsonProperty("process_after")
                @ExcludeMissing
                processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("purpose")
                @ExcludeMissing
                purpose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receiving_account")
                @ExcludeMissing
                receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of(),
                @JsonProperty("receiving_account_id")
                @ExcludeMissing
                receivingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("remittance_information")
                @ExcludeMissing
                remittanceInformation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("send_remittance_advice")
                @ExcludeMissing
                sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                statementDescriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<PaymentOrderType> = JsonMissing.of(),
                @JsonProperty("ultimate_originating_party_identifier")
                @ExcludeMissing
                ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ultimate_originating_party_name")
                @ExcludeMissing
                ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ultimate_receiving_party_identifier")
                @ExcludeMissing
                ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ultimate_receiving_party_name")
                @ExcludeMissing
                ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                accounting,
                accountingCategoryId,
                accountingLedgerClassId,
                amount,
                chargeBearer,
                counterpartyId,
                currency,
                description,
                direction,
                effectiveDate,
                expiresAt,
                fallbackType,
                foreignExchangeContract,
                foreignExchangeIndicator,
                lineItems,
                metadata,
                nsfProtected,
                originatingAccountId,
                originatingPartyName,
                priority,
                processAfter,
                purpose,
                receivingAccount,
                receivingAccountId,
                remittanceInformation,
                sendRemittanceAdvice,
                statementDescriptor,
                status,
                subtype,
                type,
                ultimateOriginatingPartyIdentifier,
                ultimateOriginatingPartyName,
                ultimateReceivingPartyIdentifier,
                ultimateReceivingPartyName,
                mutableMapOf(),
            )

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accounting(): Accounting? = accounting.getNullable("accounting")

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(): String? =
                accountingCategoryId.getNullable("accounting_category_id")

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(): String? =
                accountingLedgerClassId.getNullable("accounting_ledger_class_id")

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * The party that will pay the fees for the payment order. See
             * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
             * differences between the options.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chargeBearer(): ChargeBearer? = chargeBearer.getNullable("charge_bearer")

            /**
             * Required when receiving_account_id is passed the ID of an external account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * Defaults to the currency of the originating account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * An optional description for internal use.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun direction(): Direction? = direction.getNullable("direction")

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

            /**
             * RFP payments require an expires_at. This value must be past the effective_date.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fallbackType(): FallbackType? = fallbackType.getNullable("fallback_type")

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun foreignExchangeContract(): String? =
                foreignExchangeContract.getNullable("foreign_exchange_contract")

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
                foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

            /**
             * An array of line items that must sum up to the amount of the payment order.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun nsfProtected(): Boolean? = nsfProtected.getNullable("nsf_protected")

            /**
             * The ID of one of your organization's internal accounts.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun originatingAccountId(): String? =
                originatingAccountId.getNullable("originating_account_id")

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun originatingPartyName(): String? =
                originatingPartyName.getNullable("originating_party_name")

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun priority(): Priority? = priority.getNullable("priority")

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun processAfter(): OffsetDateTime? = processAfter.getNullable("process_after")

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun purpose(): String? = purpose.getNullable("purpose")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun receivingAccount(): ReceivingAccount? =
                receivingAccount.getNullable("receiving_account")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun receivingAccountId(): String? =
                receivingAccountId.getNullable("receiving_account_id")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun sendRemittanceAdvice(): Boolean? =
                sendRemittanceAdvice.getNullable("send_remittance_advice")

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Status? = status.getNullable("status")

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun subtype(): PaymentOrderSubtype? = subtype.getNullable("subtype")

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): PaymentOrderType? = type.getNullable("type")

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateOriginatingPartyIdentifier(): String? =
                ultimateOriginatingPartyIdentifier.getNullable(
                    "ultimate_originating_party_identifier"
                )

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateOriginatingPartyName(): String? =
                ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateReceivingPartyIdentifier(): String? =
                ultimateReceivingPartyIdentifier.getNullable("ultimate_receiving_party_identifier")

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ultimateReceivingPartyName(): String? =
                ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [accounting].
             *
             * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accounting")
            @ExcludeMissing
            fun _accounting(): JsonField<Accounting> = accounting

            /**
             * Returns the raw JSON value of [accountingCategoryId].
             *
             * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

            /**
             * Returns the raw JSON value of [accountingLedgerClassId].
             *
             * Unlike [accountingLedgerClassId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            fun _accountingLedgerClassId(): JsonField<String> = accountingLedgerClassId

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [chargeBearer].
             *
             * Unlike [chargeBearer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            fun _chargeBearer(): JsonField<ChargeBearer> = chargeBearer

            /**
             * Returns the raw JSON value of [counterpartyId].
             *
             * Unlike [counterpartyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [fallbackType].
             *
             * Unlike [fallbackType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fallback_type")
            @ExcludeMissing
            fun _fallbackType(): JsonField<FallbackType> = fallbackType

            /**
             * Returns the raw JSON value of [foreignExchangeContract].
             *
             * Unlike [foreignExchangeContract], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            fun _foreignExchangeContract(): JsonField<String> = foreignExchangeContract

            /**
             * Returns the raw JSON value of [foreignExchangeIndicator].
             *
             * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
                foreignExchangeIndicator

            /**
             * Returns the raw JSON value of [lineItems].
             *
             * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [nsfProtected].
             *
             * Unlike [nsfProtected], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            fun _nsfProtected(): JsonField<Boolean> = nsfProtected

            /**
             * Returns the raw JSON value of [originatingAccountId].
             *
             * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId(): JsonField<String> = originatingAccountId

            /**
             * Returns the raw JSON value of [originatingPartyName].
             *
             * Unlike [originatingPartyName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            fun _originatingPartyName(): JsonField<String> = originatingPartyName

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority")
            @ExcludeMissing
            fun _priority(): JsonField<Priority> = priority

            /**
             * Returns the raw JSON value of [processAfter].
             *
             * Unlike [processAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("process_after")
            @ExcludeMissing
            fun _processAfter(): JsonField<OffsetDateTime> = processAfter

            /**
             * Returns the raw JSON value of [purpose].
             *
             * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

            /**
             * Returns the raw JSON value of [receivingAccount].
             *
             * Unlike [receivingAccount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiving_account")
            @ExcludeMissing
            fun _receivingAccount(): JsonField<ReceivingAccount> = receivingAccount

            /**
             * Returns the raw JSON value of [receivingAccountId].
             *
             * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId(): JsonField<String> = receivingAccountId

            /**
             * Returns the raw JSON value of [remittanceInformation].
             *
             * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Returns the raw JSON value of [sendRemittanceAdvice].
             *
             * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

            /**
             * Returns the raw JSON value of [statementDescriptor].
             *
             * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [subtype].
             *
             * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun _subtype(): JsonField<PaymentOrderSubtype> = subtype

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentOrderType> = type

            /**
             * Returns the raw JSON value of [ultimateOriginatingPartyIdentifier].
             *
             * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
                ultimateOriginatingPartyIdentifier

            /**
             * Returns the raw JSON value of [ultimateOriginatingPartyName].
             *
             * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            fun _ultimateOriginatingPartyName(): JsonField<String> = ultimateOriginatingPartyName

            /**
             * Returns the raw JSON value of [ultimateReceivingPartyIdentifier].
             *
             * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            fun _ultimateReceivingPartyIdentifier(): JsonField<String> =
                ultimateReceivingPartyIdentifier

            /**
             * Returns the raw JSON value of [ultimateReceivingPartyName].
             *
             * Unlike [ultimateReceivingPartyName], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            fun _ultimateReceivingPartyName(): JsonField<String> = ultimateReceivingPartyName

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
                 * [PaymentOrderUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentOrderUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingAccountId: JsonField<String> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Priority> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var type: JsonField<PaymentOrderType> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                ) = apply {
                    id = paymentOrderUpdateRequestWithId.id
                    accounting = paymentOrderUpdateRequestWithId.accounting
                    accountingCategoryId = paymentOrderUpdateRequestWithId.accountingCategoryId
                    accountingLedgerClassId =
                        paymentOrderUpdateRequestWithId.accountingLedgerClassId
                    amount = paymentOrderUpdateRequestWithId.amount
                    chargeBearer = paymentOrderUpdateRequestWithId.chargeBearer
                    counterpartyId = paymentOrderUpdateRequestWithId.counterpartyId
                    currency = paymentOrderUpdateRequestWithId.currency
                    description = paymentOrderUpdateRequestWithId.description
                    direction = paymentOrderUpdateRequestWithId.direction
                    effectiveDate = paymentOrderUpdateRequestWithId.effectiveDate
                    expiresAt = paymentOrderUpdateRequestWithId.expiresAt
                    fallbackType = paymentOrderUpdateRequestWithId.fallbackType
                    foreignExchangeContract =
                        paymentOrderUpdateRequestWithId.foreignExchangeContract
                    foreignExchangeIndicator =
                        paymentOrderUpdateRequestWithId.foreignExchangeIndicator
                    lineItems = paymentOrderUpdateRequestWithId.lineItems.map { it.toMutableList() }
                    metadata = paymentOrderUpdateRequestWithId.metadata
                    nsfProtected = paymentOrderUpdateRequestWithId.nsfProtected
                    originatingAccountId = paymentOrderUpdateRequestWithId.originatingAccountId
                    originatingPartyName = paymentOrderUpdateRequestWithId.originatingPartyName
                    priority = paymentOrderUpdateRequestWithId.priority
                    processAfter = paymentOrderUpdateRequestWithId.processAfter
                    purpose = paymentOrderUpdateRequestWithId.purpose
                    receivingAccount = paymentOrderUpdateRequestWithId.receivingAccount
                    receivingAccountId = paymentOrderUpdateRequestWithId.receivingAccountId
                    remittanceInformation = paymentOrderUpdateRequestWithId.remittanceInformation
                    sendRemittanceAdvice = paymentOrderUpdateRequestWithId.sendRemittanceAdvice
                    statementDescriptor = paymentOrderUpdateRequestWithId.statementDescriptor
                    status = paymentOrderUpdateRequestWithId.status
                    subtype = paymentOrderUpdateRequestWithId.subtype
                    type = paymentOrderUpdateRequestWithId.type
                    ultimateOriginatingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyIdentifier
                    ultimateOriginatingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyName
                    ultimateReceivingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyIdentifier
                    ultimateReceivingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyName
                    additionalProperties =
                        paymentOrderUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                /**
                 * Sets [Builder.accounting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accounting] with a well-typed [Accounting] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accounting(accounting: JsonField<Accounting>) = apply {
                    this.accounting = accounting
                }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: String?) =
                    accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                /**
                 * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountingCategoryId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: String?) =
                    accountingLedgerClassId(JsonField.ofNullable(accountingLedgerClassId))

                /**
                 * Sets [Builder.accountingLedgerClassId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountingLedgerClassId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The party that will pay the fees for the payment order. See
                 * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
                 * differences between the options.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer?) =
                    chargeBearer(JsonField.ofNullable(chargeBearer))

                /**
                 * Sets [Builder.chargeBearer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                    this.chargeBearer = chargeBearer
                }

                /** Required when receiving_account_id is passed the ID of an external account. */
                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /**
                 * Sets [Builder.counterpartyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.counterpartyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType) =
                    fallbackType(JsonField.of(fallbackType))

                /**
                 * Sets [Builder.fallbackType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fallbackType] with a well-typed [FallbackType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String?) =
                    foreignExchangeContract(JsonField.ofNullable(foreignExchangeContract))

                /**
                 * Sets [Builder.foreignExchangeContract] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignExchangeContract] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                    foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

                /**
                 * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
                 * [ForeignExchangeIndicator] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /**
                 * Sets [Builder.lineItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineItems] with a well-typed
                 * `List<LineItemRequest>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LineItemRequest] to [lineItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lineItems", it).add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

                /**
                 * Sets [Builder.nsfProtected] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                    this.nsfProtected = nsfProtected
                }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /**
                 * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatingAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String?) =
                    originatingPartyName(JsonField.ofNullable(originatingPartyName))

                /**
                 * Sets [Builder.originatingPartyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatingPartyName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Priority] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime?) =
                    processAfter(JsonField.ofNullable(processAfter))

                /**
                 * Sets [Builder.processAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

                /**
                 * Sets [Builder.purpose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.purpose] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Sets [Builder.receivingAccount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingAccount] with a well-typed
                 * [ReceivingAccount] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String) =
                    receivingAccountId(JsonField.of(receivingAccountId))

                /**
                 * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remittanceInformation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
                    sendRemittanceAdvice(JsonField.ofNullable(sendRemittanceAdvice))

                /**
                 * Alias for [Builder.sendRemittanceAdvice].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

                /**
                 * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sendRemittanceAdvice] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statementDescriptor] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype?) = subtype(JsonField.ofNullable(subtype))

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply {
                    this.subtype = subtype
                }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: String?
                ) =
                    ultimateOriginatingPartyIdentifier(
                        JsonField.ofNullable(ultimateOriginatingPartyIdentifier)
                    )

                /**
                 * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
                    ultimateOriginatingPartyName(JsonField.ofNullable(ultimateOriginatingPartyName))

                /**
                 * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                    }

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                    ultimateReceivingPartyIdentifier(
                        JsonField.ofNullable(ultimateReceivingPartyIdentifier)
                    )

                /**
                 * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
                    ultimateReceivingPartyName(JsonField.ofNullable(ultimateReceivingPartyName))

                /**
                 * Sets [Builder.ultimateReceivingPartyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateReceivingPartyName = ultimateReceivingPartyName
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PaymentOrderUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PaymentOrderUpdateRequestWithId =
                    PaymentOrderUpdateRequestWithId(
                        id,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        amount,
                        chargeBearer,
                        counterpartyId,
                        currency,
                        description,
                        direction,
                        effectiveDate,
                        expiresAt,
                        fallbackType,
                        foreignExchangeContract,
                        foreignExchangeIndicator,
                        (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        nsfProtected,
                        originatingAccountId,
                        originatingPartyName,
                        priority,
                        processAfter,
                        purpose,
                        receivingAccount,
                        receivingAccountId,
                        remittanceInformation,
                        sendRemittanceAdvice,
                        statementDescriptor,
                        status,
                        subtype,
                        type,
                        ultimateOriginatingPartyIdentifier,
                        ultimateOriginatingPartyName,
                        ultimateReceivingPartyIdentifier,
                        ultimateReceivingPartyName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentOrderUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                accounting()?.validate()
                accountingCategoryId()
                accountingLedgerClassId()
                amount()
                chargeBearer()?.validate()
                counterpartyId()
                currency()?.validate()
                description()
                direction()?.validate()
                effectiveDate()
                expiresAt()
                fallbackType()?.validate()
                foreignExchangeContract()
                foreignExchangeIndicator()?.validate()
                lineItems()?.forEach { it.validate() }
                metadata()?.validate()
                nsfProtected()
                originatingAccountId()
                originatingPartyName()
                priority()?.validate()
                processAfter()
                purpose()
                receivingAccount()?.validate()
                receivingAccountId()
                remittanceInformation()
                sendRemittanceAdvice()
                statementDescriptor()
                status()?.validate()
                subtype()?.validate()
                type()?.validate()
                ultimateOriginatingPartyIdentifier()
                ultimateOriginatingPartyName()
                ultimateReceivingPartyIdentifier()
                ultimateReceivingPartyName()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (accounting.asKnown()?.validity() ?: 0) +
                    (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                    (if (accountingLedgerClassId.asKnown() == null) 0 else 1) +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (chargeBearer.asKnown()?.validity() ?: 0) +
                    (if (counterpartyId.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (direction.asKnown()?.validity() ?: 0) +
                    (if (effectiveDate.asKnown() == null) 0 else 1) +
                    (if (expiresAt.asKnown() == null) 0 else 1) +
                    (fallbackType.asKnown()?.validity() ?: 0) +
                    (if (foreignExchangeContract.asKnown() == null) 0 else 1) +
                    (foreignExchangeIndicator.asKnown()?.validity() ?: 0) +
                    (lineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (nsfProtected.asKnown() == null) 0 else 1) +
                    (if (originatingAccountId.asKnown() == null) 0 else 1) +
                    (if (originatingPartyName.asKnown() == null) 0 else 1) +
                    (priority.asKnown()?.validity() ?: 0) +
                    (if (processAfter.asKnown() == null) 0 else 1) +
                    (if (purpose.asKnown() == null) 0 else 1) +
                    (receivingAccount.asKnown()?.validity() ?: 0) +
                    (if (receivingAccountId.asKnown() == null) 0 else 1) +
                    (if (remittanceInformation.asKnown() == null) 0 else 1) +
                    (if (sendRemittanceAdvice.asKnown() == null) 0 else 1) +
                    (if (statementDescriptor.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (subtype.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (ultimateOriginatingPartyIdentifier.asKnown() == null) 0 else 1) +
                    (if (ultimateOriginatingPartyName.asKnown() == null) 0 else 1) +
                    (if (ultimateReceivingPartyIdentifier.asKnown() == null) 0 else 1) +
                    (if (ultimateReceivingPartyName.asKnown() == null) 0 else 1)

            /**
             * The party that will pay the fees for the payment order. See
             * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
             * differences between the options.
             */
            class ChargeBearer
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val SHARED = of("shared")

                    val SENDER = of("sender")

                    val RECEIVER = of("receiver")

                    fun of(value: String) = ChargeBearer(JsonField.of(value))
                }

                /** An enum containing [ChargeBearer]'s known values. */
                enum class Known {
                    SHARED,
                    SENDER,
                    RECEIVER,
                }

                /**
                 * An enum containing [ChargeBearer]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ChargeBearer] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SHARED,
                    SENDER,
                    RECEIVER,
                    /**
                     * An enum member indicating that [ChargeBearer] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SHARED -> Value.SHARED
                        SENDER -> Value.SENDER
                        RECEIVER -> Value.RECEIVER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SHARED -> Known.SHARED
                        SENDER -> Known.SENDER
                        RECEIVER -> Known.RECEIVER
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ChargeBearer = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT,
                    DEBIT,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Direction = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            class FallbackType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

                    fun of(value: String) = FallbackType(JsonField.of(value))
                }

                /** An enum containing [FallbackType]'s known values. */
                enum class Known {
                    ACH
                }

                /**
                 * An enum containing [FallbackType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [FallbackType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH,
                    /**
                     * An enum member indicating that [FallbackType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): FallbackType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FIXED_TO_VARIABLE = of("fixed_to_variable")

                    val VARIABLE_TO_FIXED = of("variable_to_fixed")

                    fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                /** An enum containing [ForeignExchangeIndicator]'s known values. */
                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                }

                /**
                 * An enum containing [ForeignExchangeIndicator]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ForeignExchangeIndicator] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    /**
                     * An enum member indicating that [ForeignExchangeIndicator] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ForeignExchangeIndicator = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class LineItemRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val accountingCategoryId: JsonField<String>,
                private val description: JsonField<String>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("accounting_category_id")
                    @ExcludeMissing
                    accountingCategoryId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(amount, accountingCategoryId, description, metadata, mutableMapOf())

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountingCategoryId(): String? =
                    accountingCategoryId.getNullable("accounting_category_id")

                /**
                 * A free-form description of the line item.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [accountingCategoryId].
                 *
                 * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of [LineItemRequest].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LineItemRequest]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        description = lineItemRequest.description
                        metadata = lineItemRequest.metadata
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) =
                        accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                    /**
                     * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountingCategoryId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [LineItemRequest].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkRequired("amount", amount),
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LineItemRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    accountingCategoryId()
                    description()
                    metadata()?.validate()
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
                        (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (metadata.asKnown()?.validity() ?: 0)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            class Priority @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val HIGH = of("high")

                    val NORMAL = of("normal")

                    fun of(value: String) = Priority(JsonField.of(value))
                }

                /** An enum containing [Priority]'s known values. */
                enum class Known {
                    HIGH,
                    NORMAL,
                }

                /**
                 * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Priority] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HIGH,
                    NORMAL,
                    /**
                     * An enum member indicating that [Priority] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        HIGH -> Value.HIGH
                        NORMAL -> Value.NORMAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        HIGH -> Known.HIGH
                        NORMAL -> Known.NORMAL
                        else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Priority = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            class ReceivingAccount
            private constructor(
                private val accountDetails: JsonField<List<AccountDetail>>,
                private val accountType: JsonField<ExternalAccountType>,
                private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
                private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
                private val metadata: JsonField<Metadata>,
                private val name: JsonField<String>,
                private val partyAddress: JsonField<AddressRequest>,
                private val partyIdentifier: JsonField<String>,
                private val partyName: JsonField<String>,
                private val partyType: JsonField<PartyType>,
                private val plaidProcessorToken: JsonField<String>,
                private val routingDetails: JsonField<List<RoutingDetail>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("account_details")
                    @ExcludeMissing
                    accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
                    @JsonProperty("account_type")
                    @ExcludeMissing
                    accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
                    @JsonProperty("contact_details")
                    @ExcludeMissing
                    contactDetails: JsonField<List<ContactDetailCreateRequest>> = JsonMissing.of(),
                    @JsonProperty("ledger_account")
                    @ExcludeMissing
                    ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("party_address")
                    @ExcludeMissing
                    partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
                    @JsonProperty("party_identifier")
                    @ExcludeMissing
                    partyIdentifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("party_name")
                    @ExcludeMissing
                    partyName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("party_type")
                    @ExcludeMissing
                    partyType: JsonField<PartyType> = JsonMissing.of(),
                    @JsonProperty("plaid_processor_token")
                    @ExcludeMissing
                    plaidProcessorToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("routing_details")
                    @ExcludeMissing
                    routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
                ) : this(
                    accountDetails,
                    accountType,
                    contactDetails,
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    routingDetails,
                    mutableMapOf(),
                )

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountDetails(): List<AccountDetail>? =
                    accountDetails.getNullable("account_details")

                /**
                 * Can be `checking`, `savings` or `other`.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun contactDetails(): List<ContactDetailCreateRequest>? =
                    contactDetails.getNullable("contact_details")

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun ledgerAccount(): LedgerAccountCreateRequest? =
                    ledgerAccount.getNullable("ledger_account")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

                /**
                 * Required if receiving wire payments.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyName(): String? = partyName.getNullable("party_name")

                /**
                 * Either `individual` or `business`.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun partyType(): PartyType? = partyType.getNullable("party_type")

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun plaidProcessorToken(): String? =
                    plaidProcessorToken.getNullable("plaid_processor_token")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun routingDetails(): List<RoutingDetail>? =
                    routingDetails.getNullable("routing_details")

                /**
                 * Returns the raw JSON value of [accountDetails].
                 *
                 * Unlike [accountDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("account_details")
                @ExcludeMissing
                fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

                /**
                 * Returns the raw JSON value of [accountType].
                 *
                 * Unlike [accountType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("account_type")
                @ExcludeMissing
                fun _accountType(): JsonField<ExternalAccountType> = accountType

                /**
                 * Returns the raw JSON value of [contactDetails].
                 *
                 * Unlike [contactDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("contact_details")
                @ExcludeMissing
                fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

                /**
                 * Returns the raw JSON value of [ledgerAccount].
                 *
                 * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ledger_account")
                @ExcludeMissing
                fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [partyAddress].
                 *
                 * Unlike [partyAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("party_address")
                @ExcludeMissing
                fun _partyAddress(): JsonField<AddressRequest> = partyAddress

                /**
                 * Returns the raw JSON value of [partyIdentifier].
                 *
                 * Unlike [partyIdentifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("party_identifier")
                @ExcludeMissing
                fun _partyIdentifier(): JsonField<String> = partyIdentifier

                /**
                 * Returns the raw JSON value of [partyName].
                 *
                 * Unlike [partyName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("party_name")
                @ExcludeMissing
                fun _partyName(): JsonField<String> = partyName

                /**
                 * Returns the raw JSON value of [partyType].
                 *
                 * Unlike [partyType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("party_type")
                @ExcludeMissing
                fun _partyType(): JsonField<PartyType> = partyType

                /**
                 * Returns the raw JSON value of [plaidProcessorToken].
                 *
                 * Unlike [plaidProcessorToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

                /**
                 * Returns the raw JSON value of [routingDetails].
                 *
                 * Unlike [routingDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("routing_details")
                @ExcludeMissing
                fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

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
                     * Returns a mutable builder for constructing an instance of [ReceivingAccount].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ReceivingAccount]. */
                class Builder internal constructor() {

                    private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
                    private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
                    private var contactDetails:
                        JsonField<MutableList<ContactDetailCreateRequest>>? =
                        null
                    private var ledgerAccount: JsonField<LedgerAccountCreateRequest> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
                    private var partyIdentifier: JsonField<String> = JsonMissing.of()
                    private var partyName: JsonField<String> = JsonMissing.of()
                    private var partyType: JsonField<PartyType> = JsonMissing.of()
                    private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
                    private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountDetails = receivingAccount.accountDetails.map { it.toMutableList() }
                        accountType = receivingAccount.accountType
                        contactDetails = receivingAccount.contactDetails.map { it.toMutableList() }
                        ledgerAccount = receivingAccount.ledgerAccount
                        metadata = receivingAccount.metadata
                        name = receivingAccount.name
                        partyAddress = receivingAccount.partyAddress
                        partyIdentifier = receivingAccount.partyIdentifier
                        partyName = receivingAccount.partyName
                        partyType = receivingAccount.partyType
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        routingDetails = receivingAccount.routingDetails.map { it.toMutableList() }
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    fun accountDetails(accountDetails: List<AccountDetail>) =
                        accountDetails(JsonField.of(accountDetails))

                    /**
                     * Sets [Builder.accountDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountDetails] with a well-typed
                     * `List<AccountDetail>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                        this.accountDetails = accountDetails.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [AccountDetail] to [accountDetails].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAccountDetail(accountDetail: AccountDetail) = apply {
                        accountDetails =
                            (accountDetails ?: JsonField.of(mutableListOf())).also {
                                checkKnown("accountDetails", it).add(accountDetail)
                            }
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType) =
                        accountType(JsonField.of(accountType))

                    /**
                     * Sets [Builder.accountType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountType] with a well-typed
                     * [ExternalAccountType] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                        this.accountType = accountType
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                        contactDetails(JsonField.of(contactDetails))

                    /**
                     * Sets [Builder.contactDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contactDetails] with a well-typed
                     * `List<ContactDetailCreateRequest>` value instead. This method is primarily
                     * for setting the field to an undocumented or not yet supported value.
                     */
                    fun contactDetails(
                        contactDetails: JsonField<List<ContactDetailCreateRequest>>
                    ) = apply { this.contactDetails = contactDetails.map { it.toMutableList() } }

                    /**
                     * Adds a single [ContactDetailCreateRequest] to [contactDetails].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                        contactDetails =
                            (contactDetails ?: JsonField.of(mutableListOf())).also {
                                checkKnown("contactDetails", it).add(contactDetail)
                            }
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                        ledgerAccount(JsonField.of(ledgerAccount))

                    /**
                     * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ledgerAccount] with a well-typed
                     * [LedgerAccountCreateRequest] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) =
                        apply {
                            this.ledgerAccount = ledgerAccount
                        }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest) =
                        partyAddress(JsonField.of(partyAddress))

                    /**
                     * Sets [Builder.partyAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyAddress] with a well-typed
                     * [AddressRequest] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                        this.partyAddress = partyAddress
                    }

                    fun partyIdentifier(partyIdentifier: String) =
                        partyIdentifier(JsonField.of(partyIdentifier))

                    /**
                     * Sets [Builder.partyIdentifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyIdentifier] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String) = partyName(JsonField.of(partyName))

                    /**
                     * Sets [Builder.partyName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun partyName(partyName: JsonField<String>) = apply {
                        this.partyName = partyName
                    }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType?) =
                        partyType(JsonField.ofNullable(partyType))

                    /**
                     * Sets [Builder.partyType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.partyType] with a well-typed [PartyType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun partyType(partyType: JsonField<PartyType>) = apply {
                        this.partyType = partyType
                    }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String) =
                        plaidProcessorToken(JsonField.of(plaidProcessorToken))

                    /**
                     * Sets [Builder.plaidProcessorToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.plaidProcessorToken] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>) =
                        routingDetails(JsonField.of(routingDetails))

                    /**
                     * Sets [Builder.routingDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.routingDetails] with a well-typed
                     * `List<RoutingDetail>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                        this.routingDetails = routingDetails.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [RoutingDetail] to [routingDetails].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                        routingDetails =
                            (routingDetails ?: JsonField.of(mutableListOf())).also {
                                checkKnown("routingDetails", it).add(routingDetail)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ReceivingAccount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            accountType,
                            (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            ledgerAccount,
                            metadata,
                            name,
                            partyAddress,
                            partyIdentifier,
                            partyName,
                            partyType,
                            plaidProcessorToken,
                            (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ReceivingAccount = apply {
                    if (validated) {
                        return@apply
                    }

                    accountDetails()?.forEach { it.validate() }
                    accountType()?.validate()
                    contactDetails()?.forEach { it.validate() }
                    ledgerAccount()?.validate()
                    metadata()?.validate()
                    name()
                    partyAddress()?.validate()
                    partyIdentifier()
                    partyName()
                    partyType()?.validate()
                    plaidProcessorToken()
                    routingDetails()?.forEach { it.validate() }
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
                    (accountDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (accountType.asKnown()?.validity() ?: 0) +
                        (contactDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (ledgerAccount.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (partyAddress.asKnown()?.validity() ?: 0) +
                        (if (partyIdentifier.asKnown() == null) 0 else 1) +
                        (if (partyName.asKnown() == null) 0 else 1) +
                        (partyType.asKnown()?.validity() ?: 0) +
                        (if (plaidProcessorToken.asKnown() == null) 0 else 1) +
                        (routingDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class AccountDetail
                private constructor(
                    private val accountNumber: JsonField<String>,
                    private val accountNumberType: JsonField<AccountNumberType>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        accountNumber: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("account_number_type")
                        @ExcludeMissing
                        accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
                    ) : this(accountNumber, accountNumberType, mutableMapOf())

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun accountNumber(): String = accountNumber.getRequired("account_number")

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun accountNumberType(): AccountNumberType? =
                        accountNumberType.getNullable("account_number_type")

                    /**
                     * Returns the raw JSON value of [accountNumber].
                     *
                     * Unlike [accountNumber], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber(): JsonField<String> = accountNumber

                    /**
                     * Returns the raw JSON value of [accountNumberType].
                     *
                     * Unlike [accountNumberType], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

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
                         * [AccountDetail].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .accountNumber()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [AccountDetail]. */
                    class Builder internal constructor() {

                        private var accountNumber: JsonField<String>? = null
                        private var accountNumberType: JsonField<AccountNumberType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        fun accountNumber(accountNumber: String) =
                            accountNumber(JsonField.of(accountNumber))

                        /**
                         * Sets [Builder.accountNumber] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.accountNumber] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun accountNumber(accountNumber: JsonField<String>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType) =
                            accountNumberType(JsonField.of(accountNumberType))

                        /**
                         * Sets [Builder.accountNumberType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.accountNumberType] with a well-typed
                         * [AccountNumberType] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) =
                            apply {
                                this.accountNumberType = accountNumberType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccountDetail].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .accountNumber()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccountDetail =
                            AccountDetail(
                                checkRequired("accountNumber", accountNumber),
                                accountNumberType,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): AccountDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        accountNumber()
                        accountNumberType()?.validate()
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
                        (if (accountNumber.asKnown() == null) 0 else 1) +
                            (accountNumberType.asKnown()?.validity() ?: 0)

                    class AccountNumberType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AU_NUMBER = of("au_number")

                            val BASE_ADDRESS = of("base_address")

                            val CLABE = of("clabe")

                            val ETHEREUM_ADDRESS = of("ethereum_address")

                            val HK_NUMBER = of("hk_number")

                            val IBAN = of("iban")

                            val ID_NUMBER = of("id_number")

                            val NZ_NUMBER = of("nz_number")

                            val OTHER = of("other")

                            val PAN = of("pan")

                            val POLYGON_ADDRESS = of("polygon_address")

                            val SG_NUMBER = of("sg_number")

                            val SOLANA_ADDRESS = of("solana_address")

                            val WALLET_ADDRESS = of("wallet_address")

                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        /** An enum containing [AccountNumberType]'s known values. */
                        enum class Known {
                            AU_NUMBER,
                            BASE_ADDRESS,
                            CLABE,
                            ETHEREUM_ADDRESS,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            POLYGON_ADDRESS,
                            SG_NUMBER,
                            SOLANA_ADDRESS,
                            WALLET_ADDRESS,
                        }

                        /**
                         * An enum containing [AccountNumberType]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [AccountNumberType] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            AU_NUMBER,
                            BASE_ADDRESS,
                            CLABE,
                            ETHEREUM_ADDRESS,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            POLYGON_ADDRESS,
                            SG_NUMBER,
                            SOLANA_ADDRESS,
                            WALLET_ADDRESS,
                            /**
                             * An enum member indicating that [AccountNumberType] was instantiated
                             * with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                AU_NUMBER -> Value.AU_NUMBER
                                BASE_ADDRESS -> Value.BASE_ADDRESS
                                CLABE -> Value.CLABE
                                ETHEREUM_ADDRESS -> Value.ETHEREUM_ADDRESS
                                HK_NUMBER -> Value.HK_NUMBER
                                IBAN -> Value.IBAN
                                ID_NUMBER -> Value.ID_NUMBER
                                NZ_NUMBER -> Value.NZ_NUMBER
                                OTHER -> Value.OTHER
                                PAN -> Value.PAN
                                POLYGON_ADDRESS -> Value.POLYGON_ADDRESS
                                SG_NUMBER -> Value.SG_NUMBER
                                SOLANA_ADDRESS -> Value.SOLANA_ADDRESS
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                AU_NUMBER -> Known.AU_NUMBER
                                BASE_ADDRESS -> Known.BASE_ADDRESS
                                CLABE -> Known.CLABE
                                ETHEREUM_ADDRESS -> Known.ETHEREUM_ADDRESS
                                HK_NUMBER -> Known.HK_NUMBER
                                IBAN -> Known.IBAN
                                ID_NUMBER -> Known.ID_NUMBER
                                NZ_NUMBER -> Known.NZ_NUMBER
                                OTHER -> Known.OTHER
                                PAN -> Known.PAN
                                POLYGON_ADDRESS -> Known.POLYGON_ADDRESS
                                SG_NUMBER -> Known.SG_NUMBER
                                SOLANA_ADDRESS -> Known.SOLANA_ADDRESS
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        private var validated: Boolean = false

                        fun validate(): AccountNumberType = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                /** Either `individual` or `business`. */
                class PartyType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val BUSINESS = of("business")

                        val INDIVIDUAL = of("individual")

                        fun of(value: String) = PartyType(JsonField.of(value))
                    }

                    /** An enum containing [PartyType]'s known values. */
                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    /**
                     * An enum containing [PartyType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [PartyType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        /**
                         * An enum member indicating that [PartyType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown PartyType: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): PartyType = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class RoutingDetail
                private constructor(
                    private val routingNumber: JsonField<String>,
                    private val routingNumberType: JsonField<RoutingNumberType>,
                    private val paymentType: JsonField<PaymentType>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        routingNumber: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("routing_number_type")
                        @ExcludeMissing
                        routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
                        @JsonProperty("payment_type")
                        @ExcludeMissing
                        paymentType: JsonField<PaymentType> = JsonMissing.of(),
                    ) : this(routingNumber, routingNumberType, paymentType, mutableMapOf())

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun routingNumber(): String = routingNumber.getRequired("routing_number")

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun routingNumberType(): RoutingNumberType =
                        routingNumberType.getRequired("routing_number_type")

                    /**
                     * @throws ModernTreasuryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

                    /**
                     * Returns the raw JSON value of [routingNumber].
                     *
                     * Unlike [routingNumber], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber(): JsonField<String> = routingNumber

                    /**
                     * Returns the raw JSON value of [routingNumberType].
                     *
                     * Unlike [routingNumberType], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

                    /**
                     * Returns the raw JSON value of [paymentType].
                     *
                     * Unlike [paymentType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    fun _paymentType(): JsonField<PaymentType> = paymentType

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
                         * [RoutingDetail].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .routingNumber()
                         * .routingNumberType()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [RoutingDetail]. */
                    class Builder internal constructor() {

                        private var routingNumber: JsonField<String>? = null
                        private var routingNumberType: JsonField<RoutingNumberType>? = null
                        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        fun routingNumber(routingNumber: String) =
                            routingNumber(JsonField.of(routingNumber))

                        /**
                         * Sets [Builder.routingNumber] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.routingNumber] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun routingNumber(routingNumber: JsonField<String>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) =
                            routingNumberType(JsonField.of(routingNumberType))

                        /**
                         * Sets [Builder.routingNumberType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.routingNumberType] with a well-typed
                         * [RoutingNumberType] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) =
                            apply {
                                this.routingNumberType = routingNumberType
                            }

                        fun paymentType(paymentType: PaymentType) =
                            paymentType(JsonField.of(paymentType))

                        /**
                         * Sets [Builder.paymentType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.paymentType] with a well-typed
                         * [PaymentType] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [RoutingDetail].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .routingNumber()
                         * .routingNumberType()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): RoutingDetail =
                            RoutingDetail(
                                checkRequired("routingNumber", routingNumber),
                                checkRequired("routingNumberType", routingNumberType),
                                paymentType,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): RoutingDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        routingNumber()
                        routingNumberType().validate()
                        paymentType()?.validate()
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
                        (if (routingNumber.asKnown() == null) 0 else 1) +
                            (routingNumberType.asKnown()?.validity() ?: 0) +
                            (paymentType.asKnown()?.validity() ?: 0)

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ABA = of("aba")

                            val AU_BSB = of("au_bsb")

                            val BR_CODIGO = of("br_codigo")

                            val CA_CPA = of("ca_cpa")

                            val CHIPS = of("chips")

                            val CNAPS = of("cnaps")

                            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

                            val GB_SORT_CODE = of("gb_sort_code")

                            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

                            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

                            val ID_SKNBI_CODE = of("id_sknbi_code")

                            val IL_BANK_CODE = of("il_bank_code")

                            val IN_IFSC = of("in_ifsc")

                            val JP_ZENGIN_CODE = of("jp_zengin_code")

                            val MY_BRANCH_CODE = of("my_branch_code")

                            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                            val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

                            val SWIFT = of("swift")

                            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                            fun of(value: String) = RoutingNumberType(JsonField.of(value))
                        }

                        /** An enum containing [RoutingNumberType]'s known values. */
                        enum class Known {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IL_BANK_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SG_INTERBANK_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                        }

                        /**
                         * An enum containing [RoutingNumberType]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [RoutingNumberType] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IL_BANK_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SG_INTERBANK_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                            /**
                             * An enum member indicating that [RoutingNumberType] was instantiated
                             * with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ABA -> Value.ABA
                                AU_BSB -> Value.AU_BSB
                                BR_CODIGO -> Value.BR_CODIGO
                                CA_CPA -> Value.CA_CPA
                                CHIPS -> Value.CHIPS
                                CNAPS -> Value.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Value.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                                IL_BANK_CODE -> Value.IL_BANK_CODE
                                IN_IFSC -> Value.IN_IFSC
                                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                                SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
                                SWIFT -> Value.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ABA -> Known.ABA
                                AU_BSB -> Known.AU_BSB
                                BR_CODIGO -> Known.BR_CODIGO
                                CA_CPA -> Known.CA_CPA
                                CHIPS -> Known.CHIPS
                                CNAPS -> Known.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Known.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                                IL_BANK_CODE -> Known.IL_BANK_CODE
                                IN_IFSC -> Known.IN_IFSC
                                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                                SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                                SWIFT -> Known.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        private var validated: Boolean = false

                        fun validate(): RoutingNumberType = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class PaymentType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ACH = of("ach")

                            val AU_BECS = of("au_becs")

                            val BACS = of("bacs")

                            val BASE = of("base")

                            val BOOK = of("book")

                            val CARD = of("card")

                            val CHATS = of("chats")

                            val CHECK = of("check")

                            val CROSS_BORDER = of("cross_border")

                            val DK_NETS = of("dk_nets")

                            val EFT = of("eft")

                            val ETHEREUM = of("ethereum")

                            val HU_ICS = of("hu_ics")

                            val INTERAC = of("interac")

                            val MASAV = of("masav")

                            val MX_CCEN = of("mx_ccen")

                            val NEFT = of("neft")

                            val NICS = of("nics")

                            val NZ_BECS = of("nz_becs")

                            val PL_ELIXIR = of("pl_elixir")

                            val POLYGON = of("polygon")

                            val PROVXCHANGE = of("provxchange")

                            val RO_SENT = of("ro_sent")

                            val RTP = of("rtp")

                            val SE_BANKGIROT = of("se_bankgirot")

                            val SEN = of("sen")

                            val SEPA = of("sepa")

                            val SG_GIRO = of("sg_giro")

                            val SIC = of("sic")

                            val SIGNET = of("signet")

                            val SKNBI = of("sknbi")

                            val SOLANA = of("solana")

                            val WIRE = of("wire")

                            val ZENGIN = of("zengin")

                            fun of(value: String) = PaymentType(JsonField.of(value))
                        }

                        /** An enum containing [PaymentType]'s known values. */
                        enum class Known {
                            ACH,
                            AU_BECS,
                            BACS,
                            BASE,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            ETHEREUM,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            POLYGON,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
                            SIC,
                            SIGNET,
                            SKNBI,
                            SOLANA,
                            WIRE,
                            ZENGIN,
                        }

                        /**
                         * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [PaymentType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ACH,
                            AU_BECS,
                            BACS,
                            BASE,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            ETHEREUM,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            POLYGON,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
                            SIC,
                            SIGNET,
                            SKNBI,
                            SOLANA,
                            WIRE,
                            ZENGIN,
                            /**
                             * An enum member indicating that [PaymentType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ACH -> Value.ACH
                                AU_BECS -> Value.AU_BECS
                                BACS -> Value.BACS
                                BASE -> Value.BASE
                                BOOK -> Value.BOOK
                                CARD -> Value.CARD
                                CHATS -> Value.CHATS
                                CHECK -> Value.CHECK
                                CROSS_BORDER -> Value.CROSS_BORDER
                                DK_NETS -> Value.DK_NETS
                                EFT -> Value.EFT
                                ETHEREUM -> Value.ETHEREUM
                                HU_ICS -> Value.HU_ICS
                                INTERAC -> Value.INTERAC
                                MASAV -> Value.MASAV
                                MX_CCEN -> Value.MX_CCEN
                                NEFT -> Value.NEFT
                                NICS -> Value.NICS
                                NZ_BECS -> Value.NZ_BECS
                                PL_ELIXIR -> Value.PL_ELIXIR
                                POLYGON -> Value.POLYGON
                                PROVXCHANGE -> Value.PROVXCHANGE
                                RO_SENT -> Value.RO_SENT
                                RTP -> Value.RTP
                                SE_BANKGIROT -> Value.SE_BANKGIROT
                                SEN -> Value.SEN
                                SEPA -> Value.SEPA
                                SG_GIRO -> Value.SG_GIRO
                                SIC -> Value.SIC
                                SIGNET -> Value.SIGNET
                                SKNBI -> Value.SKNBI
                                SOLANA -> Value.SOLANA
                                WIRE -> Value.WIRE
                                ZENGIN -> Value.ZENGIN
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ACH -> Known.ACH
                                AU_BECS -> Known.AU_BECS
                                BACS -> Known.BACS
                                BASE -> Known.BASE
                                BOOK -> Known.BOOK
                                CARD -> Known.CARD
                                CHATS -> Known.CHATS
                                CHECK -> Known.CHECK
                                CROSS_BORDER -> Known.CROSS_BORDER
                                DK_NETS -> Known.DK_NETS
                                EFT -> Known.EFT
                                ETHEREUM -> Known.ETHEREUM
                                HU_ICS -> Known.HU_ICS
                                INTERAC -> Known.INTERAC
                                MASAV -> Known.MASAV
                                MX_CCEN -> Known.MX_CCEN
                                NEFT -> Known.NEFT
                                NICS -> Known.NICS
                                NZ_BECS -> Known.NZ_BECS
                                PL_ELIXIR -> Known.PL_ELIXIR
                                POLYGON -> Known.POLYGON
                                PROVXCHANGE -> Known.PROVXCHANGE
                                RO_SENT -> Known.RO_SENT
                                RTP -> Known.RTP
                                SE_BANKGIROT -> Known.SE_BANKGIROT
                                SEN -> Known.SEN
                                SEPA -> Known.SEPA
                                SG_GIRO -> Known.SG_GIRO
                                SIC -> Known.SIC
                                SIGNET -> Known.SIGNET
                                SKNBI -> Known.SKNBI
                                SOLANA -> Known.SOLANA
                                WIRE -> Known.WIRE
                                ZENGIN -> Known.ZENGIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown PaymentType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        private var validated: Boolean = false

                        fun validate(): PaymentType = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReceivingAccount && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceivingAccount{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
            }

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val APPROVED = of("approved")

                    val CANCELLED = of("cancelled")

                    val COMPLETED = of("completed")

                    val DENIED = of("denied")

                    val FAILED = of("failed")

                    val NEEDS_APPROVAL = of("needs_approval")

                    val PENDING = of("pending")

                    val PROCESSING = of("processing")

                    val RETURNED = of("returned")

                    val REVERSED = of("reversed")

                    val SENT = of("sent")

                    val STOPPED = of("stopped")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    APPROVED,
                    CANCELLED,
                    COMPLETED,
                    DENIED,
                    FAILED,
                    NEEDS_APPROVAL,
                    PENDING,
                    PROCESSING,
                    RETURNED,
                    REVERSED,
                    SENT,
                    STOPPED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVED,
                    CANCELLED,
                    COMPLETED,
                    DENIED,
                    FAILED,
                    NEEDS_APPROVAL,
                    PENDING,
                    PROCESSING,
                    RETURNED,
                    REVERSED,
                    SENT,
                    STOPPED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        APPROVED -> Value.APPROVED
                        CANCELLED -> Value.CANCELLED
                        COMPLETED -> Value.COMPLETED
                        DENIED -> Value.DENIED
                        FAILED -> Value.FAILED
                        NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                        PENDING -> Value.PENDING
                        PROCESSING -> Value.PROCESSING
                        RETURNED -> Value.RETURNED
                        REVERSED -> Value.REVERSED
                        SENT -> Value.SENT
                        STOPPED -> Value.STOPPED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        APPROVED -> Known.APPROVED
                        CANCELLED -> Known.CANCELLED
                        COMPLETED -> Known.COMPLETED
                        DENIED -> Known.DENIED
                        FAILED -> Known.FAILED
                        NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                        PENDING -> Known.PENDING
                        PROCESSING -> Known.PROCESSING
                        RETURNED -> Known.RETURNED
                        REVERSED -> Known.REVERSED
                        SENT -> Known.SENT
                        STOPPED -> Known.STOPPED
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Status = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentOrderUpdateRequestWithId && id == other.id && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && amount == other.amount && chargeBearer == other.chargeBearer && counterpartyId == other.counterpartyId && currency == other.currency && description == other.description && direction == other.direction && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingAccountId == other.originatingAccountId && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && status == other.status && subtype == other.subtype && type == other.type && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accounting, accountingCategoryId, accountingLedgerClassId, amount, chargeBearer, counterpartyId, currency, description, direction, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, lineItems, metadata, nsfProtected, originatingAccountId, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, status, subtype, type, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderUpdateRequestWithId{id=$id, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"
        }

        class ExpectedPaymentUpdateRequestWithId
        private constructor(
            private val id: JsonField<String>,
            private val amountLowerBound: JsonField<Long>,
            private val amountUpperBound: JsonField<Long>,
            private val counterpartyId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val dateLowerBound: JsonField<LocalDate>,
            private val dateUpperBound: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val internalAccountId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val reconciliationFilters: JsonValue,
            private val reconciliationGroups: JsonValue,
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
            private val remittanceInformation: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val status: JsonField<Status>,
            private val type: JsonField<ExpectedPaymentType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount_lower_bound")
                @ExcludeMissing
                amountLowerBound: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("amount_upper_bound")
                @ExcludeMissing
                amountUpperBound: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                counterpartyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("date_lower_bound")
                @ExcludeMissing
                dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("date_upper_bound")
                @ExcludeMissing
                dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                internalAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("reconciliation_filters")
                @ExcludeMissing
                reconciliationFilters: JsonValue = JsonMissing.of(),
                @JsonProperty("reconciliation_groups")
                @ExcludeMissing
                reconciliationGroups: JsonValue = JsonMissing.of(),
                @JsonProperty("reconciliation_rule_variables")
                @ExcludeMissing
                reconciliationRuleVariables: JsonField<List<ReconciliationRule>> = JsonMissing.of(),
                @JsonProperty("remittance_information")
                @ExcludeMissing
                remittanceInformation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                statementDescriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
            ) : this(
                id,
                amountLowerBound,
                amountUpperBound,
                counterpartyId,
                currency,
                dateLowerBound,
                dateUpperBound,
                description,
                direction,
                internalAccountId,
                metadata,
                reconciliationFilters,
                reconciliationGroups,
                reconciliationRuleVariables,
                remittanceInformation,
                statementDescriptor,
                status,
                type,
                mutableMapOf(),
            )

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

            /**
             * The ID of the counterparty you expect for this payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * Must conform to ISO 4217. Defaults to the currency of the internal account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * The earliest date the payment may come in. Format: yyyy-mm-dd
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

            /**
             * The latest date the payment may come in. Format: yyyy-mm-dd
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

            /**
             * An optional description for internal use.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun direction(): Direction? = direction.getNullable("direction")

            /**
             * The ID of the Internal Account for the expected payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            fun _reconciliationFilters(): JsonValue = reconciliationFilters

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            fun _reconciliationGroups(): JsonValue = reconciliationGroups

            /**
             * An array of reconciliation rule variables for this payment.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reconciliationRuleVariables(): List<ReconciliationRule>? =
                reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Status? = status.getNullable("status")

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): ExpectedPaymentType? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amountLowerBound].
             *
             * Unlike [amountLowerBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            fun _amountLowerBound(): JsonField<Long> = amountLowerBound

            /**
             * Returns the raw JSON value of [amountUpperBound].
             *
             * Unlike [amountUpperBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            fun _amountUpperBound(): JsonField<Long> = amountUpperBound

            /**
             * Returns the raw JSON value of [counterpartyId].
             *
             * Unlike [counterpartyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [dateLowerBound].
             *
             * Unlike [dateLowerBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

            /**
             * Returns the raw JSON value of [dateUpperBound].
             *
             * Unlike [dateUpperBound], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [internalAccountId].
             *
             * Unlike [internalAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId(): JsonField<String> = internalAccountId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [reconciliationRuleVariables].
             *
             * Unlike [reconciliationRuleVariables], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
                reconciliationRuleVariables

            /**
             * Returns the raw JSON value of [remittanceInformation].
             *
             * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Returns the raw JSON value of [statementDescriptor].
             *
             * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

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
                 * [ExpectedPaymentUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExpectedPaymentUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<MutableList<ReconciliationRule>>? =
                    null
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                ) = apply {
                    id = expectedPaymentUpdateRequestWithId.id
                    amountLowerBound = expectedPaymentUpdateRequestWithId.amountLowerBound
                    amountUpperBound = expectedPaymentUpdateRequestWithId.amountUpperBound
                    counterpartyId = expectedPaymentUpdateRequestWithId.counterpartyId
                    currency = expectedPaymentUpdateRequestWithId.currency
                    dateLowerBound = expectedPaymentUpdateRequestWithId.dateLowerBound
                    dateUpperBound = expectedPaymentUpdateRequestWithId.dateUpperBound
                    description = expectedPaymentUpdateRequestWithId.description
                    direction = expectedPaymentUpdateRequestWithId.direction
                    internalAccountId = expectedPaymentUpdateRequestWithId.internalAccountId
                    metadata = expectedPaymentUpdateRequestWithId.metadata
                    reconciliationFilters = expectedPaymentUpdateRequestWithId.reconciliationFilters
                    reconciliationGroups = expectedPaymentUpdateRequestWithId.reconciliationGroups
                    reconciliationRuleVariables =
                        expectedPaymentUpdateRequestWithId.reconciliationRuleVariables.map {
                            it.toMutableList()
                        }
                    remittanceInformation = expectedPaymentUpdateRequestWithId.remittanceInformation
                    statementDescriptor = expectedPaymentUpdateRequestWithId.statementDescriptor
                    status = expectedPaymentUpdateRequestWithId.status
                    type = expectedPaymentUpdateRequestWithId.type
                    additionalProperties =
                        expectedPaymentUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long?) =
                    amountLowerBound(JsonField.ofNullable(amountLowerBound))

                /**
                 * Alias for [Builder.amountLowerBound].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(amountLowerBound as Long?)

                /**
                 * Sets [Builder.amountLowerBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountLowerBound] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long?) =
                    amountUpperBound(JsonField.ofNullable(amountUpperBound))

                /**
                 * Alias for [Builder.amountUpperBound].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(amountUpperBound as Long?)

                /**
                 * Sets [Builder.amountUpperBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountUpperBound] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /**
                 * Sets [Builder.counterpartyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.counterpartyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate?) =
                    dateLowerBound(JsonField.ofNullable(dateLowerBound))

                /**
                 * Sets [Builder.dateLowerBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateLowerBound] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate?) =
                    dateUpperBound(JsonField.ofNullable(dateUpperBound))

                /**
                 * Sets [Builder.dateUpperBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateUpperBound] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String?) =
                    internalAccountId(JsonField.ofNullable(internalAccountId))

                /**
                 * Sets [Builder.internalAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internalAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The reconciliation filters you have for this payment. */
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** The reconciliation groups you have for this payment. */
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>?
                ) = reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

                /**
                 * Sets [Builder.reconciliationRuleVariables] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reconciliationRuleVariables] with a well-typed
                 * `List<ReconciliationRule>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
                ) = apply {
                    this.reconciliationRuleVariables =
                        reconciliationRuleVariables.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ReconciliationRule] to [reconciliationRuleVariables].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                    apply {
                        reconciliationRuleVariables =
                            (reconciliationRuleVariables ?: JsonField.of(mutableListOf())).also {
                                checkKnown("reconciliationRuleVariables", it)
                                    .add(reconciliationRuleVariable)
                            }
                    }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remittanceInformation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statementDescriptor] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * The Expected Payment's status can be updated from partially_reconciled to
                 * reconciled.
                 */
                fun status(status: Status?) = status(JsonField.ofNullable(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [ExpectedPaymentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ExpectedPaymentUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ExpectedPaymentUpdateRequestWithId =
                    ExpectedPaymentUpdateRequestWithId(
                        id,
                        amountLowerBound,
                        amountUpperBound,
                        counterpartyId,
                        currency,
                        dateLowerBound,
                        dateUpperBound,
                        description,
                        direction,
                        internalAccountId,
                        metadata,
                        reconciliationFilters,
                        reconciliationGroups,
                        (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                        remittanceInformation,
                        statementDescriptor,
                        status,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExpectedPaymentUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                amountLowerBound()
                amountUpperBound()
                counterpartyId()
                currency()?.validate()
                dateLowerBound()
                dateUpperBound()
                description()
                direction()?.validate()
                internalAccountId()
                metadata()?.validate()
                reconciliationRuleVariables()?.forEach { it.validate() }
                remittanceInformation()
                statementDescriptor()
                status()?.validate()
                type()?.validate()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (amountLowerBound.asKnown() == null) 0 else 1) +
                    (if (amountUpperBound.asKnown() == null) 0 else 1) +
                    (if (counterpartyId.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (dateLowerBound.asKnown() == null) 0 else 1) +
                    (if (dateUpperBound.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (direction.asKnown()?.validity() ?: 0) +
                    (if (internalAccountId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (reconciliationRuleVariables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (remittanceInformation.asKnown() == null) 0 else 1) +
                    (if (statementDescriptor.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0)

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT,
                    DEBIT,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Direction = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val RECONCILED = of("reconciled")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    RECONCILED
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RECONCILED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RECONCILED -> Value.RECONCILED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        RECONCILED -> Known.RECONCILED
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Status = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExpectedPaymentUpdateRequestWithId && id == other.id && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentUpdateRequestWithId{id=$id, amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        class TransactionUpdateRequestWithId
        private constructor(
            private val id: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(id, metadata, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * [TransactionUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [TransactionUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transactionUpdateRequestWithId: TransactionUpdateRequestWithId) =
                    apply {
                        id = transactionUpdateRequestWithId.id
                        metadata = transactionUpdateRequestWithId.metadata
                        additionalProperties =
                            transactionUpdateRequestWithId.additionalProperties.toMutableMap()
                    }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TransactionUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TransactionUpdateRequestWithId =
                    TransactionUpdateRequestWithId(
                        id,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TransactionUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                metadata()?.validate()
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
                (if (id.asKnown() == null) 0 else 1) + (metadata.asKnown()?.validity() ?: 0)

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionUpdateRequestWithId && id == other.id && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionUpdateRequestWithId{id=$id, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class LedgerTransactionUpdateRequestWithId
        private constructor(
            private val id: JsonField<String>,
            private val description: JsonField<String>,
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>,
            private val ledgerableId: JsonField<String>,
            private val ledgerableType: JsonField<LedgerableType>,
            private val metadata: JsonField<Metadata>,
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("effective_at")
                @ExcludeMissing
                effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> = JsonMissing.of(),
                @JsonProperty("ledgerable_id")
                @ExcludeMissing
                ledgerableId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(
                id,
                description,
                effectiveAt,
                ledgerEntries,
                ledgerableId,
                ledgerableType,
                metadata,
                status,
                mutableMapOf(),
            )

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * An optional description for internal use.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

            /**
             * An array of ledger entry objects.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerEntries(): List<LedgerEntryCreateRequest>? =
                ledgerEntries.getNullable("ledger_entries")

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * To post a ledger transaction at creation, use `posted`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Status? = status.getNullable("status")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [effectiveAt].
             *
             * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

            /**
             * Returns the raw JSON value of [ledgerEntries].
             *
             * Unlike [ledgerEntries], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            fun _ledgerEntries(): JsonField<List<LedgerEntryCreateRequest>> = ledgerEntries

            /**
             * Returns the raw JSON value of [ledgerableId].
             *
             * Unlike [ledgerableId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            fun _ledgerableId(): JsonField<String> = ledgerableId

            /**
             * Returns the raw JSON value of [ledgerableType].
             *
             * Unlike [ledgerableType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
                 * [LedgerTransactionUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [LedgerTransactionUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? = null
                private var ledgerableId: JsonField<String> = JsonMissing.of()
                private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                ) = apply {
                    id = ledgerTransactionUpdateRequestWithId.id
                    description = ledgerTransactionUpdateRequestWithId.description
                    effectiveAt = ledgerTransactionUpdateRequestWithId.effectiveAt
                    ledgerEntries =
                        ledgerTransactionUpdateRequestWithId.ledgerEntries.map {
                            it.toMutableList()
                        }
                    ledgerableId = ledgerTransactionUpdateRequestWithId.ledgerableId
                    ledgerableType = ledgerTransactionUpdateRequestWithId.ledgerableType
                    metadata = ledgerTransactionUpdateRequestWithId.metadata
                    status = ledgerTransactionUpdateRequestWithId.status
                    additionalProperties =
                        ledgerTransactionUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * Sets [Builder.effectiveAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /**
                 * Sets [Builder.ledgerEntries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerEntries] with a well-typed
                 * `List<LedgerEntryCreateRequest>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                    apply {
                        this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [LedgerEntryCreateRequest] to [ledgerEntries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                    ledgerEntries =
                        (ledgerEntries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ledgerEntries", it).add(ledgerEntry)
                        }
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

                /**
                 * Sets [Builder.ledgerableId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerableId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                    this.ledgerableId = ledgerableId
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) =
                    ledgerableType(JsonField.of(ledgerableType))

                /**
                 * Sets [Builder.ledgerableType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerableType] with a well-typed
                 * [LedgerableType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LedgerTransactionUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LedgerTransactionUpdateRequestWithId =
                    LedgerTransactionUpdateRequestWithId(
                        id,
                        description,
                        effectiveAt,
                        (ledgerEntries ?: JsonMissing.of()).map { it.toImmutable() },
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        status,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LedgerTransactionUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                description()
                effectiveAt()
                ledgerEntries()?.forEach { it.validate() }
                ledgerableId()
                ledgerableType()?.validate()
                metadata()?.validate()
                status()?.validate()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (effectiveAt.asKnown() == null) 0 else 1) +
                    (ledgerEntries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (ledgerableId.asKnown() == null) 0 else 1) +
                    (ledgerableType.asKnown()?.validity() ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (status.asKnown()?.validity() ?: 0)

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            class LedgerableType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EXPECTED_PAYMENT = of("expected_payment")

                    val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

                    val PAPER_ITEM = of("paper_item")

                    val PAYMENT_ORDER = of("payment_order")

                    val RETURN = of("return")

                    val REVERSAL = of("reversal")

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                /** An enum containing [LedgerableType]'s known values. */
                enum class Known {
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    RETURN,
                    REVERSAL,
                }

                /**
                 * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [LedgerableType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    RETURN,
                    REVERSAL,
                    /**
                     * An enum member indicating that [LedgerableType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                        INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                        PAPER_ITEM -> Value.PAPER_ITEM
                        PAYMENT_ORDER -> Value.PAYMENT_ORDER
                        RETURN -> Value.RETURN
                        REVERSAL -> Value.REVERSAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                        INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                        PAPER_ITEM -> Known.PAPER_ITEM
                        PAYMENT_ORDER -> Known.PAYMENT_ORDER
                        RETURN -> Known.RETURN
                        REVERSAL -> Known.REVERSAL
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): LedgerableType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /** To post a ledger transaction at creation, use `posted`. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ARCHIVED = of("archived")

                    val PENDING = of("pending")

                    val POSTED = of("posted")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ARCHIVED,
                    PENDING,
                    POSTED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ARCHIVED,
                    PENDING,
                    POSTED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ARCHIVED -> Value.ARCHIVED
                        PENDING -> Value.PENDING
                        POSTED -> Value.POSTED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ARCHIVED -> Known.ARCHIVED
                        PENDING -> Known.PENDING
                        POSTED -> Known.POSTED
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Status = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerTransactionUpdateRequestWithId && id == other.id && description == other.description && effectiveAt == other.effectiveAt && ledgerEntries == other.ledgerEntries && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, description, effectiveAt, ledgerEntries, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionUpdateRequestWithId{id=$id, description=$description, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BulkRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
