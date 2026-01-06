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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
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
         * `Resource.ofPaymentOrderAsyncCreate(paymentOrderAsyncCreate)`.
         */
        fun addResource(paymentOrderAsyncCreate: PaymentOrderAsyncCreate) = apply {
            body.addResource(paymentOrderAsyncCreate)
        }

        /**
         * Alias for calling [addResource] with
         * `Resource.ofExpectedPaymentCreate(expectedPaymentCreate)`.
         */
        fun addResource(expectedPaymentCreate: ExpectedPaymentCreate) = apply {
            body.addResource(expectedPaymentCreate)
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
         * Alias for calling [addResource] with `Resource.ofTransactionCreate(transactionCreate)`.
         */
        fun addResource(transactionCreate: TransactionCreate) = apply {
            body.addResource(transactionCreate)
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
             * `Resource.ofPaymentOrderAsyncCreate(paymentOrderAsyncCreate)`.
             */
            fun addResource(paymentOrderAsyncCreate: PaymentOrderAsyncCreate) =
                addResource(Resource.ofPaymentOrderAsyncCreate(paymentOrderAsyncCreate))

            /**
             * Alias for calling [addResource] with
             * `Resource.ofExpectedPaymentCreate(expectedPaymentCreate)`.
             */
            fun addResource(expectedPaymentCreate: ExpectedPaymentCreate) =
                addResource(Resource.ofExpectedPaymentCreate(expectedPaymentCreate))

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
             * `Resource.ofTransactionCreate(transactionCreate)`.
             */
            fun addResource(transactionCreate: TransactionCreate) =
                addResource(Resource.ofTransactionCreate(transactionCreate))

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

            return other is BulkRequestCreateRequest &&
                actionType == other.actionType &&
                resourceType == other.resourceType &&
                resources == other.resources &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(actionType, resourceType, resources, metadata, additionalProperties)
        }

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

            return other is ActionType && value == other.value
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

            return other is ResourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Resource.Deserializer::class)
    @JsonSerialize(using = Resource.Serializer::class)
    class Resource
    private constructor(
        private val paymentOrderAsyncCreate: PaymentOrderAsyncCreate? = null,
        private val expectedPaymentCreate: ExpectedPaymentCreate? = null,
        private val ledgerTransactionCreateRequest: LedgerTransactionCreateRequest? = null,
        private val ledgerAccountCreateRequest: LedgerAccountCreateRequest? = null,
        private val transactionCreate: TransactionCreate? = null,
        private val id: Id? = null,
        private val paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId? = null,
        private val expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId? = null,
        private val transactionUpdateRequestWithId: TransactionUpdateRequestWithId? = null,
        private val ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun paymentOrderAsyncCreate(): PaymentOrderAsyncCreate? = paymentOrderAsyncCreate

        fun expectedPaymentCreate(): ExpectedPaymentCreate? = expectedPaymentCreate

        fun ledgerTransactionCreateRequest(): LedgerTransactionCreateRequest? =
            ledgerTransactionCreateRequest

        fun ledgerAccountCreateRequest(): LedgerAccountCreateRequest? = ledgerAccountCreateRequest

        fun transactionCreate(): TransactionCreate? = transactionCreate

        fun id(): Id? = id

        fun paymentOrderUpdateRequestWithId(): PaymentOrderUpdateRequestWithId? =
            paymentOrderUpdateRequestWithId

        fun expectedPaymentUpdateRequestWithId(): ExpectedPaymentUpdateRequestWithId? =
            expectedPaymentUpdateRequestWithId

        fun transactionUpdateRequestWithId(): TransactionUpdateRequestWithId? =
            transactionUpdateRequestWithId

        fun ledgerTransactionUpdateRequestWithId(): LedgerTransactionUpdateRequestWithId? =
            ledgerTransactionUpdateRequestWithId

        fun isPaymentOrderAsyncCreate(): Boolean = paymentOrderAsyncCreate != null

        fun isExpectedPaymentCreate(): Boolean = expectedPaymentCreate != null

        fun isLedgerTransactionCreateRequest(): Boolean = ledgerTransactionCreateRequest != null

        fun isLedgerAccountCreateRequest(): Boolean = ledgerAccountCreateRequest != null

        fun isTransactionCreate(): Boolean = transactionCreate != null

        fun isId(): Boolean = id != null

        fun isPaymentOrderUpdateRequestWithId(): Boolean = paymentOrderUpdateRequestWithId != null

        fun isExpectedPaymentUpdateRequestWithId(): Boolean =
            expectedPaymentUpdateRequestWithId != null

        fun isTransactionUpdateRequestWithId(): Boolean = transactionUpdateRequestWithId != null

        fun isLedgerTransactionUpdateRequestWithId(): Boolean =
            ledgerTransactionUpdateRequestWithId != null

        fun asPaymentOrderAsyncCreate(): PaymentOrderAsyncCreate =
            paymentOrderAsyncCreate.getOrThrow("paymentOrderAsyncCreate")

        fun asExpectedPaymentCreate(): ExpectedPaymentCreate =
            expectedPaymentCreate.getOrThrow("expectedPaymentCreate")

        fun asLedgerTransactionCreateRequest(): LedgerTransactionCreateRequest =
            ledgerTransactionCreateRequest.getOrThrow("ledgerTransactionCreateRequest")

        fun asLedgerAccountCreateRequest(): LedgerAccountCreateRequest =
            ledgerAccountCreateRequest.getOrThrow("ledgerAccountCreateRequest")

        fun asTransactionCreate(): TransactionCreate =
            transactionCreate.getOrThrow("transactionCreate")

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
                paymentOrderAsyncCreate != null ->
                    visitor.visitPaymentOrderAsyncCreate(paymentOrderAsyncCreate)
                expectedPaymentCreate != null ->
                    visitor.visitExpectedPaymentCreate(expectedPaymentCreate)
                ledgerTransactionCreateRequest != null ->
                    visitor.visitLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                ledgerAccountCreateRequest != null ->
                    visitor.visitLedgerAccountCreateRequest(ledgerAccountCreateRequest)
                transactionCreate != null -> visitor.visitTransactionCreate(transactionCreate)
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
                    override fun visitPaymentOrderAsyncCreate(
                        paymentOrderAsyncCreate: PaymentOrderAsyncCreate
                    ) {
                        paymentOrderAsyncCreate.validate()
                    }

                    override fun visitExpectedPaymentCreate(
                        expectedPaymentCreate: ExpectedPaymentCreate
                    ) {
                        expectedPaymentCreate.validate()
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

                    override fun visitTransactionCreate(transactionCreate: TransactionCreate) {
                        transactionCreate.validate()
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
                    override fun visitPaymentOrderAsyncCreate(
                        paymentOrderAsyncCreate: PaymentOrderAsyncCreate
                    ) = paymentOrderAsyncCreate.validity()

                    override fun visitExpectedPaymentCreate(
                        expectedPaymentCreate: ExpectedPaymentCreate
                    ) = expectedPaymentCreate.validity()

                    override fun visitLedgerTransactionCreateRequest(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = ledgerTransactionCreateRequest.validity()

                    override fun visitLedgerAccountCreateRequest(
                        ledgerAccountCreateRequest: LedgerAccountCreateRequest
                    ) = ledgerAccountCreateRequest.validity()

                    override fun visitTransactionCreate(transactionCreate: TransactionCreate) =
                        transactionCreate.validity()

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

            return other is Resource &&
                paymentOrderAsyncCreate == other.paymentOrderAsyncCreate &&
                expectedPaymentCreate == other.expectedPaymentCreate &&
                ledgerTransactionCreateRequest == other.ledgerTransactionCreateRequest &&
                ledgerAccountCreateRequest == other.ledgerAccountCreateRequest &&
                transactionCreate == other.transactionCreate &&
                id == other.id &&
                paymentOrderUpdateRequestWithId == other.paymentOrderUpdateRequestWithId &&
                expectedPaymentUpdateRequestWithId == other.expectedPaymentUpdateRequestWithId &&
                transactionUpdateRequestWithId == other.transactionUpdateRequestWithId &&
                ledgerTransactionUpdateRequestWithId == other.ledgerTransactionUpdateRequestWithId
        }

        override fun hashCode(): Int =
            Objects.hash(
                paymentOrderAsyncCreate,
                expectedPaymentCreate,
                ledgerTransactionCreateRequest,
                ledgerAccountCreateRequest,
                transactionCreate,
                id,
                paymentOrderUpdateRequestWithId,
                expectedPaymentUpdateRequestWithId,
                transactionUpdateRequestWithId,
                ledgerTransactionUpdateRequestWithId,
            )

        override fun toString(): String =
            when {
                paymentOrderAsyncCreate != null ->
                    "Resource{paymentOrderAsyncCreate=$paymentOrderAsyncCreate}"
                expectedPaymentCreate != null ->
                    "Resource{expectedPaymentCreate=$expectedPaymentCreate}"
                ledgerTransactionCreateRequest != null ->
                    "Resource{ledgerTransactionCreateRequest=$ledgerTransactionCreateRequest}"
                ledgerAccountCreateRequest != null ->
                    "Resource{ledgerAccountCreateRequest=$ledgerAccountCreateRequest}"
                transactionCreate != null -> "Resource{transactionCreate=$transactionCreate}"
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

            fun ofPaymentOrderAsyncCreate(paymentOrderAsyncCreate: PaymentOrderAsyncCreate) =
                Resource(paymentOrderAsyncCreate = paymentOrderAsyncCreate)

            fun ofExpectedPaymentCreate(expectedPaymentCreate: ExpectedPaymentCreate) =
                Resource(expectedPaymentCreate = expectedPaymentCreate)

            fun ofLedgerTransactionCreateRequest(
                ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
            ) = Resource(ledgerTransactionCreateRequest = ledgerTransactionCreateRequest)

            fun ofLedgerAccountCreateRequest(
                ledgerAccountCreateRequest: LedgerAccountCreateRequest
            ) = Resource(ledgerAccountCreateRequest = ledgerAccountCreateRequest)

            fun ofTransactionCreate(transactionCreate: TransactionCreate) =
                Resource(transactionCreate = transactionCreate)

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

            fun visitPaymentOrderAsyncCreate(paymentOrderAsyncCreate: PaymentOrderAsyncCreate): T

            fun visitExpectedPaymentCreate(expectedPaymentCreate: ExpectedPaymentCreate): T

            fun visitLedgerTransactionCreateRequest(
                ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
            ): T

            fun visitLedgerAccountCreateRequest(
                ledgerAccountCreateRequest: LedgerAccountCreateRequest
            ): T

            fun visitTransactionCreate(transactionCreate: TransactionCreate): T

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
                            tryDeserialize(node, jacksonTypeRef<PaymentOrderAsyncCreate>())?.let {
                                Resource(paymentOrderAsyncCreate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ExpectedPaymentCreate>())?.let {
                                Resource(expectedPaymentCreate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LedgerTransactionCreateRequest>())
                                ?.let {
                                    Resource(ledgerTransactionCreateRequest = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<LedgerAccountCreateRequest>())
                                ?.let { Resource(ledgerAccountCreateRequest = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<TransactionCreate>())?.let {
                                Resource(transactionCreate = it, _json = json)
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
                    value.paymentOrderAsyncCreate != null ->
                        generator.writeObject(value.paymentOrderAsyncCreate)
                    value.expectedPaymentCreate != null ->
                        generator.writeObject(value.expectedPaymentCreate)
                    value.ledgerTransactionCreateRequest != null ->
                        generator.writeObject(value.ledgerTransactionCreateRequest)
                    value.ledgerAccountCreateRequest != null ->
                        generator.writeObject(value.ledgerAccountCreateRequest)
                    value.transactionCreate != null ->
                        generator.writeObject(value.transactionCreate)
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

        class Id
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

                return other is Id &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Id{id=$id, additionalProperties=$additionalProperties}"
        }

        class PaymentOrderUpdateRequestWithId
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accounting: JsonField<Accounting>,
            private val accountingCategoryId: JsonField<String>,
            private val accountingLedgerClassId: JsonField<String>,
            private val amount: JsonField<Long>,
            private val chargeBearer: JsonField<PaymentOrderUpdate.ChargeBearer>,
            private val counterpartyId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val description: JsonField<String>,
            private val direction: JsonField<PaymentOrderUpdate.Direction>,
            private val effectiveDate: JsonField<LocalDate>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val fallbackType: JsonField<PaymentOrderUpdate.FallbackType>,
            private val foreignExchangeContract: JsonField<String>,
            private val foreignExchangeIndicator:
                JsonField<PaymentOrderUpdate.ForeignExchangeIndicator>,
            private val lineItems: JsonField<List<LineItem>>,
            private val metadata: JsonField<PaymentOrderUpdate.Metadata>,
            private val nsfProtected: JsonField<Boolean>,
            private val originatingAccountId: JsonField<String>,
            private val originatingPartyName: JsonField<String>,
            private val priority: JsonField<PaymentOrderUpdate.Priority>,
            private val processAfter: JsonField<OffsetDateTime>,
            private val purpose: JsonField<String>,
            private val receivingAccount: JsonField<PaymentOrderUpdate.ReceivingAccount>,
            private val receivingAccountId: JsonField<String>,
            private val reconciliationStatus: JsonField<PaymentOrderUpdate.ReconciliationStatus>,
            private val remittanceInformation: JsonField<String>,
            private val sendRemittanceAdvice: JsonField<Boolean>,
            private val statementDescriptor: JsonField<String>,
            private val status: JsonField<PaymentOrderUpdate.Status>,
            private val subtype: JsonField<PaymentOrderSubtype>,
            private val type: JsonField<PaymentOrderType>,
            private val ultimateOriginatingPartyIdentifier: JsonField<String>,
            private val ultimateOriginatingPartyName: JsonField<String>,
            private val ultimateReceivingPartyIdentifier: JsonField<String>,
            private val ultimateReceivingPartyName: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
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
                chargeBearer: JsonField<PaymentOrderUpdate.ChargeBearer> = JsonMissing.of(),
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
                direction: JsonField<PaymentOrderUpdate.Direction> = JsonMissing.of(),
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fallback_type")
                @ExcludeMissing
                fallbackType: JsonField<PaymentOrderUpdate.FallbackType> = JsonMissing.of(),
                @JsonProperty("foreign_exchange_contract")
                @ExcludeMissing
                foreignExchangeContract: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                foreignExchangeIndicator: JsonField<PaymentOrderUpdate.ForeignExchangeIndicator> =
                    JsonMissing.of(),
                @JsonProperty("line_items")
                @ExcludeMissing
                lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<PaymentOrderUpdate.Metadata> = JsonMissing.of(),
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
                priority: JsonField<PaymentOrderUpdate.Priority> = JsonMissing.of(),
                @JsonProperty("process_after")
                @ExcludeMissing
                processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("purpose")
                @ExcludeMissing
                purpose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receiving_account")
                @ExcludeMissing
                receivingAccount: JsonField<PaymentOrderUpdate.ReceivingAccount> = JsonMissing.of(),
                @JsonProperty("receiving_account_id")
                @ExcludeMissing
                receivingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reconciliation_status")
                @ExcludeMissing
                reconciliationStatus: JsonField<PaymentOrderUpdate.ReconciliationStatus> =
                    JsonMissing.of(),
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
                status: JsonField<PaymentOrderUpdate.Status> = JsonMissing.of(),
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
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            ) : this(
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
                reconciliationStatus,
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
                id,
                mutableMapOf(),
            )

            fun toPaymentOrderUpdate(): PaymentOrderUpdate =
                PaymentOrderUpdate.builder()
                    .accounting(accounting)
                    .accountingCategoryId(accountingCategoryId)
                    .accountingLedgerClassId(accountingLedgerClassId)
                    .amount(amount)
                    .chargeBearer(chargeBearer)
                    .counterpartyId(counterpartyId)
                    .currency(currency)
                    .description(description)
                    .direction(direction)
                    .effectiveDate(effectiveDate)
                    .expiresAt(expiresAt)
                    .fallbackType(fallbackType)
                    .foreignExchangeContract(foreignExchangeContract)
                    .foreignExchangeIndicator(foreignExchangeIndicator)
                    .lineItems(lineItems)
                    .metadata(metadata)
                    .nsfProtected(nsfProtected)
                    .originatingAccountId(originatingAccountId)
                    .originatingPartyName(originatingPartyName)
                    .priority(priority)
                    .processAfter(processAfter)
                    .purpose(purpose)
                    .receivingAccount(receivingAccount)
                    .receivingAccountId(receivingAccountId)
                    .reconciliationStatus(reconciliationStatus)
                    .remittanceInformation(remittanceInformation)
                    .sendRemittanceAdvice(sendRemittanceAdvice)
                    .statementDescriptor(statementDescriptor)
                    .status(status)
                    .subtype(subtype)
                    .type(type)
                    .ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier)
                    .ultimateOriginatingPartyName(ultimateOriginatingPartyName)
                    .ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier)
                    .ultimateReceivingPartyName(ultimateReceivingPartyName)
                    .build()

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
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
            fun chargeBearer(): PaymentOrderUpdate.ChargeBearer? =
                chargeBearer.getNullable("charge_bearer")

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
            fun direction(): PaymentOrderUpdate.Direction? = direction.getNullable("direction")

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
            fun fallbackType(): PaymentOrderUpdate.FallbackType? =
                fallbackType.getNullable("fallback_type")

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
            fun foreignExchangeIndicator(): PaymentOrderUpdate.ForeignExchangeIndicator? =
                foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

            /**
             * An array of line items that must sum up to the amount of the payment order.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lineItems(): List<LineItem>? = lineItems.getNullable("line_items")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): PaymentOrderUpdate.Metadata? = metadata.getNullable("metadata")

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
            fun priority(): PaymentOrderUpdate.Priority? = priority.getNullable("priority")

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
            fun receivingAccount(): PaymentOrderUpdate.ReceivingAccount? =
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
             * One of `unreconciled`, `tentatively_reconciled` or `reconciled`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reconciliationStatus(): PaymentOrderUpdate.ReconciliationStatus? =
                reconciliationStatus.getNullable("reconciliation_status")

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
            fun status(): PaymentOrderUpdate.Status? = status.getNullable("status")

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
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * Returns the raw JSON value of [accounting].
             *
             * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @Deprecated("deprecated")
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
            fun _chargeBearer(): JsonField<PaymentOrderUpdate.ChargeBearer> = chargeBearer

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
            fun _direction(): JsonField<PaymentOrderUpdate.Direction> = direction

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
            fun _fallbackType(): JsonField<PaymentOrderUpdate.FallbackType> = fallbackType

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
            fun _foreignExchangeIndicator():
                JsonField<PaymentOrderUpdate.ForeignExchangeIndicator> = foreignExchangeIndicator

            /**
             * Returns the raw JSON value of [lineItems].
             *
             * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItem>> = lineItems

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<PaymentOrderUpdate.Metadata> = metadata

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
            fun _priority(): JsonField<PaymentOrderUpdate.Priority> = priority

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
            fun _receivingAccount(): JsonField<PaymentOrderUpdate.ReceivingAccount> =
                receivingAccount

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
             * Returns the raw JSON value of [reconciliationStatus].
             *
             * Unlike [reconciliationStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reconciliation_status")
            @ExcludeMissing
            fun _reconciliationStatus(): JsonField<PaymentOrderUpdate.ReconciliationStatus> =
                reconciliationStatus

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
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<PaymentOrderUpdate.Status> = status

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentOrderUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentOrderUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var chargeBearer: JsonField<PaymentOrderUpdate.ChargeBearer> =
                    JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<PaymentOrderUpdate.Direction> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fallbackType: JsonField<PaymentOrderUpdate.FallbackType> =
                    JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var foreignExchangeIndicator:
                    JsonField<PaymentOrderUpdate.ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItem>>? = null
                private var metadata: JsonField<PaymentOrderUpdate.Metadata> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingAccountId: JsonField<String> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<PaymentOrderUpdate.Priority> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var receivingAccount: JsonField<PaymentOrderUpdate.ReceivingAccount> =
                    JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var reconciliationStatus:
                    JsonField<PaymentOrderUpdate.ReconciliationStatus> =
                    JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var status: JsonField<PaymentOrderUpdate.Status> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var type: JsonField<PaymentOrderType> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                ) = apply {
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
                    reconciliationStatus = paymentOrderUpdateRequestWithId.reconciliationStatus
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
                    id = paymentOrderUpdateRequestWithId.id
                    additionalProperties =
                        paymentOrderUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                @Deprecated("deprecated")
                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                /**
                 * Sets [Builder.accounting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accounting] with a well-typed [Accounting] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                @Deprecated("deprecated")
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
                fun chargeBearer(chargeBearer: PaymentOrderUpdate.ChargeBearer?) =
                    chargeBearer(JsonField.ofNullable(chargeBearer))

                /**
                 * Sets [Builder.chargeBearer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chargeBearer] with a well-typed
                 * [PaymentOrderUpdate.ChargeBearer] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun chargeBearer(chargeBearer: JsonField<PaymentOrderUpdate.ChargeBearer>) = apply {
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
                fun direction(direction: PaymentOrderUpdate.Direction) =
                    direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed
                 * [PaymentOrderUpdate.Direction] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun direction(direction: JsonField<PaymentOrderUpdate.Direction>) = apply {
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
                fun fallbackType(fallbackType: PaymentOrderUpdate.FallbackType) =
                    fallbackType(JsonField.of(fallbackType))

                /**
                 * Sets [Builder.fallbackType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fallbackType] with a well-typed
                 * [PaymentOrderUpdate.FallbackType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun fallbackType(fallbackType: JsonField<PaymentOrderUpdate.FallbackType>) = apply {
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
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: PaymentOrderUpdate.ForeignExchangeIndicator?
                ) = foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

                /**
                 * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
                 * [PaymentOrderUpdate.ForeignExchangeIndicator] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<PaymentOrderUpdate.ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

                /**
                 * Sets [Builder.lineItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LineItem] to [lineItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLineItem(lineItem: LineItem) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lineItems", it).add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: PaymentOrderUpdate.Metadata) =
                    metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed
                 * [PaymentOrderUpdate.Metadata] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun metadata(metadata: JsonField<PaymentOrderUpdate.Metadata>) = apply {
                    this.metadata = metadata
                }

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
                fun priority(priority: PaymentOrderUpdate.Priority) =
                    priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed
                 * [PaymentOrderUpdate.Priority] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun priority(priority: JsonField<PaymentOrderUpdate.Priority>) = apply {
                    this.priority = priority
                }

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
                fun receivingAccount(receivingAccount: PaymentOrderUpdate.ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Sets [Builder.receivingAccount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingAccount] with a well-typed
                 * [PaymentOrderUpdate.ReceivingAccount] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun receivingAccount(
                    receivingAccount: JsonField<PaymentOrderUpdate.ReceivingAccount>
                ) = apply { this.receivingAccount = receivingAccount }

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

                /** One of `unreconciled`, `tentatively_reconciled` or `reconciled`. */
                fun reconciliationStatus(
                    reconciliationStatus: PaymentOrderUpdate.ReconciliationStatus
                ) = reconciliationStatus(JsonField.of(reconciliationStatus))

                /**
                 * Sets [Builder.reconciliationStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reconciliationStatus] with a well-typed
                 * [PaymentOrderUpdate.ReconciliationStatus] value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun reconciliationStatus(
                    reconciliationStatus: JsonField<PaymentOrderUpdate.ReconciliationStatus>
                ) = apply { this.reconciliationStatus = reconciliationStatus }

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
                fun status(status: PaymentOrderUpdate.Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed
                 * [PaymentOrderUpdate.Status] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun status(status: JsonField<PaymentOrderUpdate.Status>) = apply {
                    this.status = status
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
                 * Returns an immutable instance of [PaymentOrderUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PaymentOrderUpdateRequestWithId =
                    PaymentOrderUpdateRequestWithId(
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
                        reconciliationStatus,
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
                        id,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentOrderUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

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
                reconciliationStatus()?.validate()
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
            internal fun validity(): Int =
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
                    (reconciliationStatus.asKnown()?.validity() ?: 0) +
                    (if (remittanceInformation.asKnown() == null) 0 else 1) +
                    (if (sendRemittanceAdvice.asKnown() == null) 0 else 1) +
                    (if (statementDescriptor.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (subtype.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (ultimateOriginatingPartyIdentifier.asKnown() == null) 0 else 1) +
                    (if (ultimateOriginatingPartyName.asKnown() == null) 0 else 1) +
                    (if (ultimateReceivingPartyIdentifier.asKnown() == null) 0 else 1) +
                    (if (ultimateReceivingPartyName.asKnown() == null) 0 else 1) +
                    (if (id.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentOrderUpdateRequestWithId &&
                    accounting == other.accounting &&
                    accountingCategoryId == other.accountingCategoryId &&
                    accountingLedgerClassId == other.accountingLedgerClassId &&
                    amount == other.amount &&
                    chargeBearer == other.chargeBearer &&
                    counterpartyId == other.counterpartyId &&
                    currency == other.currency &&
                    description == other.description &&
                    direction == other.direction &&
                    effectiveDate == other.effectiveDate &&
                    expiresAt == other.expiresAt &&
                    fallbackType == other.fallbackType &&
                    foreignExchangeContract == other.foreignExchangeContract &&
                    foreignExchangeIndicator == other.foreignExchangeIndicator &&
                    lineItems == other.lineItems &&
                    metadata == other.metadata &&
                    nsfProtected == other.nsfProtected &&
                    originatingAccountId == other.originatingAccountId &&
                    originatingPartyName == other.originatingPartyName &&
                    priority == other.priority &&
                    processAfter == other.processAfter &&
                    purpose == other.purpose &&
                    receivingAccount == other.receivingAccount &&
                    receivingAccountId == other.receivingAccountId &&
                    reconciliationStatus == other.reconciliationStatus &&
                    remittanceInformation == other.remittanceInformation &&
                    sendRemittanceAdvice == other.sendRemittanceAdvice &&
                    statementDescriptor == other.statementDescriptor &&
                    status == other.status &&
                    subtype == other.subtype &&
                    type == other.type &&
                    ultimateOriginatingPartyIdentifier ==
                        other.ultimateOriginatingPartyIdentifier &&
                    ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
                    ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier &&
                    ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
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
                    reconciliationStatus,
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
                    id,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderUpdateRequestWithId{accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, reconciliationStatus=$reconciliationStatus, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, id=$id, additionalProperties=$additionalProperties}"
        }

        class ExpectedPaymentUpdateRequestWithId
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amountLowerBound: JsonField<Long>,
            private val amountReconciled: JsonField<Long>,
            private val amountReconciledDirection:
                JsonField<ExpectedPaymentUpdate.AmountReconciledDirection>,
            private val amountUnreconciled: JsonField<Long>,
            private val amountUnreconciledDirection:
                JsonField<ExpectedPaymentUpdate.AmountUnreconciledDirection>,
            private val amountUpperBound: JsonField<Long>,
            private val counterpartyId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val dateLowerBound: JsonField<LocalDate>,
            private val dateUpperBound: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val direction: JsonField<ExpectedPaymentUpdate.Direction>,
            private val externalId: JsonField<String>,
            private val internalAccountId: JsonField<String>,
            private val metadata: JsonField<ExpectedPaymentUpdate.Metadata>,
            private val reconciliationFilters: JsonValue,
            private val reconciliationGroups: JsonValue,
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
            private val remittanceInformation: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val status: JsonField<ExpectedPaymentUpdate.Status>,
            private val type: JsonField<ExpectedPaymentType>,
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount_lower_bound")
                @ExcludeMissing
                amountLowerBound: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("amount_reconciled")
                @ExcludeMissing
                amountReconciled: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("amount_reconciled_direction")
                @ExcludeMissing
                amountReconciledDirection:
                    JsonField<ExpectedPaymentUpdate.AmountReconciledDirection> =
                    JsonMissing.of(),
                @JsonProperty("amount_unreconciled")
                @ExcludeMissing
                amountUnreconciled: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("amount_unreconciled_direction")
                @ExcludeMissing
                amountUnreconciledDirection:
                    JsonField<ExpectedPaymentUpdate.AmountUnreconciledDirection> =
                    JsonMissing.of(),
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
                direction: JsonField<ExpectedPaymentUpdate.Direction> = JsonMissing.of(),
                @JsonProperty("external_id")
                @ExcludeMissing
                externalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                internalAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<ExpectedPaymentUpdate.Metadata> = JsonMissing.of(),
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
                status: JsonField<ExpectedPaymentUpdate.Status> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            ) : this(
                amountLowerBound,
                amountReconciled,
                amountReconciledDirection,
                amountUnreconciled,
                amountUnreconciledDirection,
                amountUpperBound,
                counterpartyId,
                currency,
                dateLowerBound,
                dateUpperBound,
                description,
                direction,
                externalId,
                internalAccountId,
                metadata,
                reconciliationFilters,
                reconciliationGroups,
                reconciliationRuleVariables,
                remittanceInformation,
                statementDescriptor,
                status,
                type,
                id,
                mutableMapOf(),
            )

            fun toExpectedPaymentUpdate(): ExpectedPaymentUpdate =
                ExpectedPaymentUpdate.builder()
                    .amountLowerBound(amountLowerBound)
                    .amountReconciled(amountReconciled)
                    .amountReconciledDirection(amountReconciledDirection)
                    .amountUnreconciled(amountUnreconciled)
                    .amountUnreconciledDirection(amountUnreconciledDirection)
                    .amountUpperBound(amountUpperBound)
                    .counterpartyId(counterpartyId)
                    .currency(currency)
                    .dateLowerBound(dateLowerBound)
                    .dateUpperBound(dateUpperBound)
                    .description(description)
                    .direction(direction)
                    .externalId(externalId)
                    .internalAccountId(internalAccountId)
                    .metadata(metadata)
                    .reconciliationFilters(reconciliationFilters)
                    .reconciliationGroups(reconciliationGroups)
                    .reconciliationRuleVariables(reconciliationRuleVariables)
                    .remittanceInformation(remittanceInformation)
                    .statementDescriptor(statementDescriptor)
                    .status(status)
                    .type(type)
                    .build()

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

            /**
             * The amount reconciled for this expected payment. Value in specified currency's
             * smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountReconciled(): Long? = amountReconciled.getNullable("amount_reconciled")

            /**
             * One of credit or debit. Indicates whether amount_reconciled is a credit or debit
             * amount.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountReconciledDirection(): ExpectedPaymentUpdate.AmountReconciledDirection? =
                amountReconciledDirection.getNullable("amount_reconciled_direction")

            /**
             * The amount that remains unreconciled for this expected payment. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountUnreconciled(): Long? = amountUnreconciled.getNullable("amount_unreconciled")

            /**
             * One of credit or debit. Indicates whether amount_unreconciled is a credit or debit
             * amount.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amountUnreconciledDirection(): ExpectedPaymentUpdate.AmountUnreconciledDirection? =
                amountUnreconciledDirection.getNullable("amount_unreconciled_direction")

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
            fun direction(): ExpectedPaymentUpdate.Direction? = direction.getNullable("direction")

            /**
             * An optional user-defined 180 character unique identifier.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun externalId(): String? = externalId.getNullable("external_id")

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
            fun metadata(): ExpectedPaymentUpdate.Metadata? = metadata.getNullable("metadata")

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
            fun status(): ExpectedPaymentUpdate.Status? = status.getNullable("status")

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): ExpectedPaymentType? = type.getNullable("type")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

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
             * Returns the raw JSON value of [amountReconciled].
             *
             * Unlike [amountReconciled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_reconciled")
            @ExcludeMissing
            fun _amountReconciled(): JsonField<Long> = amountReconciled

            /**
             * Returns the raw JSON value of [amountReconciledDirection].
             *
             * Unlike [amountReconciledDirection], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("amount_reconciled_direction")
            @ExcludeMissing
            fun _amountReconciledDirection():
                JsonField<ExpectedPaymentUpdate.AmountReconciledDirection> =
                amountReconciledDirection

            /**
             * Returns the raw JSON value of [amountUnreconciled].
             *
             * Unlike [amountUnreconciled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_unreconciled")
            @ExcludeMissing
            fun _amountUnreconciled(): JsonField<Long> = amountUnreconciled

            /**
             * Returns the raw JSON value of [amountUnreconciledDirection].
             *
             * Unlike [amountUnreconciledDirection], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("amount_unreconciled_direction")
            @ExcludeMissing
            fun _amountUnreconciledDirection():
                JsonField<ExpectedPaymentUpdate.AmountUnreconciledDirection> =
                amountUnreconciledDirection

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
            fun _direction(): JsonField<ExpectedPaymentUpdate.Direction> = direction

            /**
             * Returns the raw JSON value of [externalId].
             *
             * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

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
            fun _metadata(): JsonField<ExpectedPaymentUpdate.Metadata> = metadata

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
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<ExpectedPaymentUpdate.Status> = status

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ExpectedPaymentUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExpectedPaymentUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var amountReconciled: JsonField<Long> = JsonMissing.of()
                private var amountReconciledDirection:
                    JsonField<ExpectedPaymentUpdate.AmountReconciledDirection> =
                    JsonMissing.of()
                private var amountUnreconciled: JsonField<Long> = JsonMissing.of()
                private var amountUnreconciledDirection:
                    JsonField<ExpectedPaymentUpdate.AmountUnreconciledDirection> =
                    JsonMissing.of()
                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<ExpectedPaymentUpdate.Direction> = JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<ExpectedPaymentUpdate.Metadata> = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<MutableList<ReconciliationRule>>? =
                    null
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var status: JsonField<ExpectedPaymentUpdate.Status> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                ) = apply {
                    amountLowerBound = expectedPaymentUpdateRequestWithId.amountLowerBound
                    amountReconciled = expectedPaymentUpdateRequestWithId.amountReconciled
                    amountReconciledDirection =
                        expectedPaymentUpdateRequestWithId.amountReconciledDirection
                    amountUnreconciled = expectedPaymentUpdateRequestWithId.amountUnreconciled
                    amountUnreconciledDirection =
                        expectedPaymentUpdateRequestWithId.amountUnreconciledDirection
                    amountUpperBound = expectedPaymentUpdateRequestWithId.amountUpperBound
                    counterpartyId = expectedPaymentUpdateRequestWithId.counterpartyId
                    currency = expectedPaymentUpdateRequestWithId.currency
                    dateLowerBound = expectedPaymentUpdateRequestWithId.dateLowerBound
                    dateUpperBound = expectedPaymentUpdateRequestWithId.dateUpperBound
                    description = expectedPaymentUpdateRequestWithId.description
                    direction = expectedPaymentUpdateRequestWithId.direction
                    externalId = expectedPaymentUpdateRequestWithId.externalId
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
                    id = expectedPaymentUpdateRequestWithId.id
                    additionalProperties =
                        expectedPaymentUpdateRequestWithId.additionalProperties.toMutableMap()
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
                 * The amount reconciled for this expected payment. Value in specified currency's
                 * smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountReconciled(amountReconciled: Long?) =
                    amountReconciled(JsonField.ofNullable(amountReconciled))

                /**
                 * Alias for [Builder.amountReconciled].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountReconciled(amountReconciled: Long) =
                    amountReconciled(amountReconciled as Long?)

                /**
                 * Sets [Builder.amountReconciled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountReconciled] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountReconciled(amountReconciled: JsonField<Long>) = apply {
                    this.amountReconciled = amountReconciled
                }

                /**
                 * One of credit or debit. Indicates whether amount_reconciled is a credit or debit
                 * amount.
                 */
                fun amountReconciledDirection(
                    amountReconciledDirection: ExpectedPaymentUpdate.AmountReconciledDirection?
                ) = amountReconciledDirection(JsonField.ofNullable(amountReconciledDirection))

                /**
                 * Sets [Builder.amountReconciledDirection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountReconciledDirection] with a well-typed
                 * [ExpectedPaymentUpdate.AmountReconciledDirection] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun amountReconciledDirection(
                    amountReconciledDirection:
                        JsonField<ExpectedPaymentUpdate.AmountReconciledDirection>
                ) = apply { this.amountReconciledDirection = amountReconciledDirection }

                /**
                 * The amount that remains unreconciled for this expected payment. Value in
                 * specified currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUnreconciled(amountUnreconciled: Long?) =
                    amountUnreconciled(JsonField.ofNullable(amountUnreconciled))

                /**
                 * Alias for [Builder.amountUnreconciled].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amountUnreconciled(amountUnreconciled: Long) =
                    amountUnreconciled(amountUnreconciled as Long?)

                /**
                 * Sets [Builder.amountUnreconciled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountUnreconciled] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun amountUnreconciled(amountUnreconciled: JsonField<Long>) = apply {
                    this.amountUnreconciled = amountUnreconciled
                }

                /**
                 * One of credit or debit. Indicates whether amount_unreconciled is a credit or
                 * debit amount.
                 */
                fun amountUnreconciledDirection(
                    amountUnreconciledDirection: ExpectedPaymentUpdate.AmountUnreconciledDirection?
                ) = amountUnreconciledDirection(JsonField.ofNullable(amountUnreconciledDirection))

                /**
                 * Sets [Builder.amountUnreconciledDirection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountUnreconciledDirection] with a well-typed
                 * [ExpectedPaymentUpdate.AmountUnreconciledDirection] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun amountUnreconciledDirection(
                    amountUnreconciledDirection:
                        JsonField<ExpectedPaymentUpdate.AmountUnreconciledDirection>
                ) = apply { this.amountUnreconciledDirection = amountUnreconciledDirection }

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
                fun direction(direction: ExpectedPaymentUpdate.Direction?) =
                    direction(JsonField.ofNullable(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed
                 * [ExpectedPaymentUpdate.Direction] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun direction(direction: JsonField<ExpectedPaymentUpdate.Direction>) = apply {
                    this.direction = direction
                }

                /** An optional user-defined 180 character unique identifier. */
                fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

                /**
                 * Sets [Builder.externalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
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
                fun metadata(metadata: ExpectedPaymentUpdate.Metadata) =
                    metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed
                 * [ExpectedPaymentUpdate.Metadata] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun metadata(metadata: JsonField<ExpectedPaymentUpdate.Metadata>) = apply {
                    this.metadata = metadata
                }

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
                fun status(status: ExpectedPaymentUpdate.Status?) =
                    status(JsonField.ofNullable(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed
                 * [ExpectedPaymentUpdate.Status] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun status(status: JsonField<ExpectedPaymentUpdate.Status>) = apply {
                    this.status = status
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
                 * Returns an immutable instance of [ExpectedPaymentUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ExpectedPaymentUpdateRequestWithId =
                    ExpectedPaymentUpdateRequestWithId(
                        amountLowerBound,
                        amountReconciled,
                        amountReconciledDirection,
                        amountUnreconciled,
                        amountUnreconciledDirection,
                        amountUpperBound,
                        counterpartyId,
                        currency,
                        dateLowerBound,
                        dateUpperBound,
                        description,
                        direction,
                        externalId,
                        internalAccountId,
                        metadata,
                        reconciliationFilters,
                        reconciliationGroups,
                        (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                        remittanceInformation,
                        statementDescriptor,
                        status,
                        type,
                        id,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExpectedPaymentUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                amountLowerBound()
                amountReconciled()
                amountReconciledDirection()?.validate()
                amountUnreconciled()
                amountUnreconciledDirection()?.validate()
                amountUpperBound()
                counterpartyId()
                currency()?.validate()
                dateLowerBound()
                dateUpperBound()
                description()
                direction()?.validate()
                externalId()
                internalAccountId()
                metadata()?.validate()
                reconciliationRuleVariables()?.forEach { it.validate() }
                remittanceInformation()
                statementDescriptor()
                status()?.validate()
                type()?.validate()
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
            internal fun validity(): Int =
                (if (amountLowerBound.asKnown() == null) 0 else 1) +
                    (if (amountReconciled.asKnown() == null) 0 else 1) +
                    (amountReconciledDirection.asKnown()?.validity() ?: 0) +
                    (if (amountUnreconciled.asKnown() == null) 0 else 1) +
                    (amountUnreconciledDirection.asKnown()?.validity() ?: 0) +
                    (if (amountUpperBound.asKnown() == null) 0 else 1) +
                    (if (counterpartyId.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (dateLowerBound.asKnown() == null) 0 else 1) +
                    (if (dateUpperBound.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (direction.asKnown()?.validity() ?: 0) +
                    (if (externalId.asKnown() == null) 0 else 1) +
                    (if (internalAccountId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (reconciliationRuleVariables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (remittanceInformation.asKnown() == null) 0 else 1) +
                    (if (statementDescriptor.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (id.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExpectedPaymentUpdateRequestWithId &&
                    amountLowerBound == other.amountLowerBound &&
                    amountReconciled == other.amountReconciled &&
                    amountReconciledDirection == other.amountReconciledDirection &&
                    amountUnreconciled == other.amountUnreconciled &&
                    amountUnreconciledDirection == other.amountUnreconciledDirection &&
                    amountUpperBound == other.amountUpperBound &&
                    counterpartyId == other.counterpartyId &&
                    currency == other.currency &&
                    dateLowerBound == other.dateLowerBound &&
                    dateUpperBound == other.dateUpperBound &&
                    description == other.description &&
                    direction == other.direction &&
                    externalId == other.externalId &&
                    internalAccountId == other.internalAccountId &&
                    metadata == other.metadata &&
                    reconciliationFilters == other.reconciliationFilters &&
                    reconciliationGroups == other.reconciliationGroups &&
                    reconciliationRuleVariables == other.reconciliationRuleVariables &&
                    remittanceInformation == other.remittanceInformation &&
                    statementDescriptor == other.statementDescriptor &&
                    status == other.status &&
                    type == other.type &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amountLowerBound,
                    amountReconciled,
                    amountReconciledDirection,
                    amountUnreconciled,
                    amountUnreconciledDirection,
                    amountUpperBound,
                    counterpartyId,
                    currency,
                    dateLowerBound,
                    dateUpperBound,
                    description,
                    direction,
                    externalId,
                    internalAccountId,
                    metadata,
                    reconciliationFilters,
                    reconciliationGroups,
                    reconciliationRuleVariables,
                    remittanceInformation,
                    statementDescriptor,
                    status,
                    type,
                    id,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentUpdateRequestWithId{amountLowerBound=$amountLowerBound, amountReconciled=$amountReconciled, amountReconciledDirection=$amountReconciledDirection, amountUnreconciled=$amountUnreconciled, amountUnreconciledDirection=$amountUnreconciledDirection, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, externalId=$externalId, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, id=$id, additionalProperties=$additionalProperties}"
        }

        class TransactionUpdateRequestWithId
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val metadata: JsonField<TransactionUpdate.Metadata>,
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<TransactionUpdate.Metadata> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            ) : this(metadata, id, mutableMapOf())

            fun toTransactionUpdate(): TransactionUpdate =
                TransactionUpdate.builder().metadata(metadata).build()

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): TransactionUpdate.Metadata? = metadata.getNullable("metadata")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<TransactionUpdate.Metadata> = metadata

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TransactionUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [TransactionUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var metadata: JsonField<TransactionUpdate.Metadata> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transactionUpdateRequestWithId: TransactionUpdateRequestWithId) =
                    apply {
                        metadata = transactionUpdateRequestWithId.metadata
                        id = transactionUpdateRequestWithId.id
                        additionalProperties =
                            transactionUpdateRequestWithId.additionalProperties.toMutableMap()
                    }

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                fun metadata(metadata: TransactionUpdate.Metadata) =
                    metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed
                 * [TransactionUpdate.Metadata] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun metadata(metadata: JsonField<TransactionUpdate.Metadata>) = apply {
                    this.metadata = metadata
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
                 * Returns an immutable instance of [TransactionUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TransactionUpdateRequestWithId =
                    TransactionUpdateRequestWithId(
                        metadata,
                        id,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TransactionUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                metadata()?.validate()
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
            internal fun validity(): Int =
                (metadata.asKnown()?.validity() ?: 0) + (if (id.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TransactionUpdateRequestWithId &&
                    metadata == other.metadata &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(metadata, id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionUpdateRequestWithId{metadata=$metadata, id=$id, additionalProperties=$additionalProperties}"
        }

        class LedgerTransactionUpdateRequestWithId
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>,
            private val ledgerableId: JsonField<String>,
            private val ledgerableType: JsonField<LedgerTransactionUpdate.LedgerableType>,
            private val metadata: JsonField<LedgerTransactionUpdate.Metadata>,
            private val status: JsonField<LedgerTransactionUpdate.Status>,
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
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
                ledgerableType: JsonField<LedgerTransactionUpdate.LedgerableType> =
                    JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<LedgerTransactionUpdate.Metadata> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<LedgerTransactionUpdate.Status> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            ) : this(
                description,
                effectiveAt,
                ledgerEntries,
                ledgerableId,
                ledgerableType,
                metadata,
                status,
                id,
                mutableMapOf(),
            )

            fun toLedgerTransactionUpdate(): LedgerTransactionUpdate =
                LedgerTransactionUpdate.builder()
                    .description(description)
                    .effectiveAt(effectiveAt)
                    .ledgerEntries(ledgerEntries)
                    .ledgerableId(ledgerableId)
                    .ledgerableType(ledgerableType)
                    .metadata(metadata)
                    .status(status)
                    .build()

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
             * incoming_payment_detail, expected_payment, return, or reversal.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerableType(): LedgerTransactionUpdate.LedgerableType? =
                ledgerableType.getNullable("ledgerable_type")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): LedgerTransactionUpdate.Metadata? = metadata.getNullable("metadata")

            /**
             * To post a ledger transaction at creation, use `posted`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): LedgerTransactionUpdate.Status? = status.getNullable("status")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

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
            fun _ledgerableType(): JsonField<LedgerTransactionUpdate.LedgerableType> =
                ledgerableType

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<LedgerTransactionUpdate.Metadata> = metadata

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<LedgerTransactionUpdate.Status> = status

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [LedgerTransactionUpdateRequestWithId].
                 */
                fun builder() = Builder()
            }

            /** A builder for [LedgerTransactionUpdateRequestWithId]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? = null
                private var ledgerableId: JsonField<String> = JsonMissing.of()
                private var ledgerableType: JsonField<LedgerTransactionUpdate.LedgerableType> =
                    JsonMissing.of()
                private var metadata: JsonField<LedgerTransactionUpdate.Metadata> = JsonMissing.of()
                private var status: JsonField<LedgerTransactionUpdate.Status> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                ) = apply {
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
                    id = ledgerTransactionUpdateRequestWithId.id
                    additionalProperties =
                        ledgerTransactionUpdateRequestWithId.additionalProperties.toMutableMap()
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
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerTransactionUpdate.LedgerableType) =
                    ledgerableType(JsonField.of(ledgerableType))

                /**
                 * Sets [Builder.ledgerableType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerableType] with a well-typed
                 * [LedgerTransactionUpdate.LedgerableType] value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun ledgerableType(
                    ledgerableType: JsonField<LedgerTransactionUpdate.LedgerableType>
                ) = apply { this.ledgerableType = ledgerableType }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: LedgerTransactionUpdate.Metadata) =
                    metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed
                 * [LedgerTransactionUpdate.Metadata] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun metadata(metadata: JsonField<LedgerTransactionUpdate.Metadata>) = apply {
                    this.metadata = metadata
                }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: LedgerTransactionUpdate.Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed
                 * [LedgerTransactionUpdate.Status] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun status(status: JsonField<LedgerTransactionUpdate.Status>) = apply {
                    this.status = status
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
                 * Returns an immutable instance of [LedgerTransactionUpdateRequestWithId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LedgerTransactionUpdateRequestWithId =
                    LedgerTransactionUpdateRequestWithId(
                        description,
                        effectiveAt,
                        (ledgerEntries ?: JsonMissing.of()).map { it.toImmutable() },
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        status,
                        id,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LedgerTransactionUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                description()
                effectiveAt()
                ledgerEntries()?.forEach { it.validate() }
                ledgerableId()
                ledgerableType()?.validate()
                metadata()?.validate()
                status()?.validate()
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
            internal fun validity(): Int =
                (if (description.asKnown() == null) 0 else 1) +
                    (if (effectiveAt.asKnown() == null) 0 else 1) +
                    (ledgerEntries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (ledgerableId.asKnown() == null) 0 else 1) +
                    (ledgerableType.asKnown()?.validity() ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (id.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerTransactionUpdateRequestWithId &&
                    description == other.description &&
                    effectiveAt == other.effectiveAt &&
                    ledgerEntries == other.ledgerEntries &&
                    ledgerableId == other.ledgerableId &&
                    ledgerableType == other.ledgerableType &&
                    metadata == other.metadata &&
                    status == other.status &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    description,
                    effectiveAt,
                    ledgerEntries,
                    ledgerableId,
                    ledgerableType,
                    metadata,
                    status,
                    id,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionUpdateRequestWithId{description=$description, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, id=$id, additionalProperties=$additionalProperties}"
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkRequestCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BulkRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
