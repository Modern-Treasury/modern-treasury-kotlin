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
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class BulkRequestCreateParams
constructor(
    private val actionType: ActionType,
    private val resourceType: ResourceType,
    private val resources: List<Resource>,
    private val metadata: Metadata?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun actionType(): ActionType = actionType

    fun resourceType(): ResourceType = resourceType

    fun resources(): List<Resource> = resources

    fun metadata(): Metadata? = metadata

    internal fun getBody(): BulkRequestCreateBody {
        return BulkRequestCreateBody(
            actionType,
            resourceType,
            resources,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = BulkRequestCreateBody.Builder::class)
    @NoAutoDetect
    class BulkRequestCreateBody
    internal constructor(
        private val actionType: ActionType?,
        private val resourceType: ResourceType?,
        private val resources: List<Resource>?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** One of create, or update. */
        @JsonProperty("action_type") fun actionType(): ActionType? = actionType

        /** One of payment_order, expected_payment, or ledger_transaction. */
        @JsonProperty("resource_type") fun resourceType(): ResourceType? = resourceType

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        @JsonProperty("resources") fun resources(): List<Resource>? = resources

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BulkRequestCreateBody &&
                this.actionType == other.actionType &&
                this.resourceType == other.resourceType &&
                this.resources == other.resources &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        actionType,
                        resourceType,
                        resources,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BulkRequestCreateBody{actionType=$actionType, resourceType=$resourceType, resources=$resources, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var actionType: ActionType? = null
            private var resourceType: ResourceType? = null
            private var resources: List<Resource>? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bulkRequestCreateBody: BulkRequestCreateBody) = apply {
                this.actionType = bulkRequestCreateBody.actionType
                this.resourceType = bulkRequestCreateBody.resourceType
                this.resources = bulkRequestCreateBody.resources
                this.metadata = bulkRequestCreateBody.metadata
                additionalProperties(bulkRequestCreateBody.additionalProperties)
            }

            /** One of create, or update. */
            @JsonProperty("action_type")
            fun actionType(actionType: ActionType) = apply { this.actionType = actionType }

            /** One of payment_order, expected_payment, or ledger_transaction. */
            @JsonProperty("resource_type")
            fun resourceType(resourceType: ResourceType) = apply {
                this.resourceType = resourceType
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            @JsonProperty("resources")
            fun resources(resources: List<Resource>) = apply { this.resources = resources }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): BulkRequestCreateBody =
                BulkRequestCreateBody(
                    checkNotNull(actionType) { "`actionType` is required but was not set" },
                    checkNotNull(resourceType) { "`resourceType` is required but was not set" },
                    checkNotNull(resources) { "`resources` is required but was not set" }
                        .toUnmodifiable(),
                    metadata,
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

        return other is BulkRequestCreateParams &&
            this.actionType == other.actionType &&
            this.resourceType == other.resourceType &&
            this.resources == other.resources &&
            this.metadata == other.metadata &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            actionType,
            resourceType,
            resources,
            metadata,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "BulkRequestCreateParams{actionType=$actionType, resourceType=$resourceType, resources=$resources, metadata=$metadata, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var actionType: ActionType? = null
        private var resourceType: ResourceType? = null
        private var resources: MutableList<Resource> = mutableListOf()
        private var metadata: Metadata? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkRequestCreateParams: BulkRequestCreateParams) = apply {
            this.actionType = bulkRequestCreateParams.actionType
            this.resourceType = bulkRequestCreateParams.resourceType
            this.resources(bulkRequestCreateParams.resources)
            this.metadata = bulkRequestCreateParams.metadata
            additionalQueryParams(bulkRequestCreateParams.additionalQueryParams)
            additionalHeaders(bulkRequestCreateParams.additionalHeaders)
            additionalBodyProperties(bulkRequestCreateParams.additionalBodyProperties)
        }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = apply { this.actionType = actionType }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = apply { this.resourceType = resourceType }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(resources: List<Resource>) = apply {
            this.resources.clear()
            this.resources.addAll(resources)
        }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(resource: Resource) = apply { this.resources.add(resource) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun build(): BulkRequestCreateParams =
            BulkRequestCreateParams(
                checkNotNull(actionType) { "`actionType` is required but was not set" },
                checkNotNull(resourceType) { "`resourceType` is required but was not set" },
                checkNotNull(resources) { "`resources` is required but was not set" }
                    .toUnmodifiable(),
                metadata,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ActionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActionType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREATE = ActionType(JsonField.of("create"))

            val UPDATE = ActionType(JsonField.of("update"))

            fun of(value: String) = ActionType(JsonField.of(value))
        }

        enum class Known {
            CREATE,
            UPDATE,
        }

        enum class Value {
            CREATE,
            UPDATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                else -> throw ModernTreasuryInvalidDataException("Unknown ActionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ResourceType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResourceType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PAYMENT_ORDER = ResourceType(JsonField.of("payment_order"))

            val LEDGER_TRANSACTION = ResourceType(JsonField.of("ledger_transaction"))

            val TRANSACTION = ResourceType(JsonField.of("transaction"))

            val EXPECTED_PAYMENT = ResourceType(JsonField.of("expected_payment"))

            fun of(value: String) = ResourceType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
        }

        enum class Value {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Value.LEDGER_TRANSACTION
                TRANSACTION -> Value.TRANSACTION
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Known.LEDGER_TRANSACTION
                TRANSACTION -> Known.TRANSACTION
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                else -> throw ModernTreasuryInvalidDataException("Unknown ResourceType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Resource.Deserializer::class)
    @JsonSerialize(using = Resource.Serializer::class)
    class Resource
    private constructor(
        private val paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest? = null,
        private val expectedPaymentCreateRequest: ExpectedPaymentCreateRequest? = null,
        private val ledgerTransactionCreateRequest: LedgerTransactionCreateRequest? = null,
        private val transactionCreateRequest: TransactionCreateRequest? = null,
        private val id: Id? = null,
        private val paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId? = null,
        private val expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId? = null,
        private val transactionUpdateRequestWithId: TransactionUpdateRequestWithId? = null,
        private val ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId? =
            null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun paymentOrderAsyncCreateRequest(): PaymentOrderAsyncCreateRequest? =
            paymentOrderAsyncCreateRequest

        fun expectedPaymentCreateRequest(): ExpectedPaymentCreateRequest? =
            expectedPaymentCreateRequest

        fun ledgerTransactionCreateRequest(): LedgerTransactionCreateRequest? =
            ledgerTransactionCreateRequest

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

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                paymentOrderAsyncCreateRequest != null ->
                    visitor.visitPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)
                expectedPaymentCreateRequest != null ->
                    visitor.visitExpectedPaymentCreateRequest(expectedPaymentCreateRequest)
                ledgerTransactionCreateRequest != null ->
                    visitor.visitLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)
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
        }

        fun validate(): Resource = apply {
            if (!validated) {
                if (
                    paymentOrderAsyncCreateRequest == null &&
                        expectedPaymentCreateRequest == null &&
                        ledgerTransactionCreateRequest == null &&
                        transactionCreateRequest == null &&
                        id == null &&
                        paymentOrderUpdateRequestWithId == null &&
                        expectedPaymentUpdateRequestWithId == null &&
                        transactionUpdateRequestWithId == null &&
                        ledgerTransactionUpdateRequestWithId == null
                ) {
                    throw ModernTreasuryInvalidDataException("Unknown Resource: $_json")
                }
                paymentOrderAsyncCreateRequest?.validate()
                expectedPaymentCreateRequest?.validate()
                ledgerTransactionCreateRequest?.validate()
                transactionCreateRequest?.validate()
                id?.validate()
                paymentOrderUpdateRequestWithId?.validate()
                expectedPaymentUpdateRequestWithId?.validate()
                transactionUpdateRequestWithId?.validate()
                ledgerTransactionUpdateRequestWithId?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Resource &&
                this.paymentOrderAsyncCreateRequest == other.paymentOrderAsyncCreateRequest &&
                this.expectedPaymentCreateRequest == other.expectedPaymentCreateRequest &&
                this.ledgerTransactionCreateRequest == other.ledgerTransactionCreateRequest &&
                this.transactionCreateRequest == other.transactionCreateRequest &&
                this.id == other.id &&
                this.paymentOrderUpdateRequestWithId == other.paymentOrderUpdateRequestWithId &&
                this.expectedPaymentUpdateRequestWithId ==
                    other.expectedPaymentUpdateRequestWithId &&
                this.transactionUpdateRequestWithId == other.transactionUpdateRequestWithId &&
                this.ledgerTransactionUpdateRequestWithId ==
                    other.ledgerTransactionUpdateRequestWithId
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paymentOrderAsyncCreateRequest,
                expectedPaymentCreateRequest,
                ledgerTransactionCreateRequest,
                transactionCreateRequest,
                id,
                paymentOrderUpdateRequestWithId,
                expectedPaymentUpdateRequestWithId,
                transactionUpdateRequestWithId,
                ledgerTransactionUpdateRequestWithId,
            )
        }

        override fun toString(): String {
            return when {
                paymentOrderAsyncCreateRequest != null ->
                    "Resource{paymentOrderAsyncCreateRequest=$paymentOrderAsyncCreateRequest}"
                expectedPaymentCreateRequest != null ->
                    "Resource{expectedPaymentCreateRequest=$expectedPaymentCreateRequest}"
                ledgerTransactionCreateRequest != null ->
                    "Resource{ledgerTransactionCreateRequest=$ledgerTransactionCreateRequest}"
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

            fun unknown(json: JsonValue?): T {
                throw ModernTreasuryInvalidDataException("Unknown Resource: $json")
            }
        }

        class Deserializer : BaseDeserializer<Resource>(Resource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Resource {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<PaymentOrderAsyncCreateRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(paymentOrderAsyncCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentCreateRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(expectedPaymentCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionCreateRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(ledgerTransactionCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TransactionCreateRequest>()) { it.validate() }
                    ?.let {
                        return Resource(transactionCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Id>()) { it.validate() }
                    ?.let {
                        return Resource(id = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PaymentOrderUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(paymentOrderUpdateRequestWithId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(expectedPaymentUpdateRequestWithId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TransactionUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(transactionUpdateRequestWithId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(ledgerTransactionUpdateRequestWithId = it, _json = json)
                    }

                return Resource(_json = json)
            }
        }

        class Serializer : BaseSerializer<Resource>(Resource::class) {

            override fun serialize(
                value: Resource,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.paymentOrderAsyncCreateRequest != null ->
                        generator.writeObject(value.paymentOrderAsyncCreateRequest)
                    value.expectedPaymentCreateRequest != null ->
                        generator.writeObject(value.expectedPaymentCreateRequest)
                    value.ledgerTransactionCreateRequest != null ->
                        generator.writeObject(value.ledgerTransactionCreateRequest)
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

        @JsonDeserialize(builder = PaymentOrderAsyncCreateRequest.Builder::class)
        @NoAutoDetect
        class PaymentOrderAsyncCreateRequest
        private constructor(
            private val type: JsonField<PaymentOrderType>,
            private val subtype: JsonField<PaymentOrderSubtype>,
            private val amount: JsonField<Long>,
            private val direction: JsonField<Direction>,
            private val priority: JsonField<Priority>,
            private val originatingAccountId: JsonField<String>,
            private val receivingAccountId: JsonField<String>,
            private val accounting: JsonField<Accounting>,
            private val accountingCategoryId: JsonField<String>,
            private val accountingLedgerClassId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val effectiveDate: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val processAfter: JsonField<OffsetDateTime>,
            private val purpose: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val chargeBearer: JsonField<ChargeBearer>,
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
            private val foreignExchangeContract: JsonField<String>,
            private val nsfProtected: JsonField<Boolean>,
            private val originatingPartyName: JsonField<String>,
            private val ultimateOriginatingPartyName: JsonField<String>,
            private val ultimateOriginatingPartyIdentifier: JsonField<String>,
            private val ultimateReceivingPartyName: JsonField<String>,
            private val ultimateReceivingPartyIdentifier: JsonField<String>,
            private val sendRemittanceAdvice: JsonField<Boolean>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val fallbackType: JsonField<FallbackType>,
            private val receivingAccount: JsonField<ReceivingAccount>,
            private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest>,
            private val ledgerTransactionId: JsonField<String>,
            private val lineItems: JsonField<List<LineItemRequest>>,
            private val transactionMonitoringEnabled: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(): PaymentOrderType = type.getRequired("type")

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(): PaymentOrderSubtype? = subtype.getNullable("subtype")

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(): Priority? = priority.getNullable("priority")

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(): String =
                originatingAccountId.getRequired("originating_account_id")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(): String? =
                receivingAccountId.getNullable("receiving_account_id")

            fun accounting(): Accounting? = accounting.getNullable("accounting")

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(): String? =
                accountingCategoryId.getNullable("accounting_category_id")

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            fun accountingLedgerClassId(): String? =
                accountingLedgerClassId.getNullable("accounting_ledger_class_id")

            /** Defaults to the currency of the originating account. */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

            /** An optional description for internal use. */
            fun description(): String? = description.getNullable("description")

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(): OffsetDateTime? = processAfter.getNullable("process_after")

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud, this is
             * the `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that
             * will be attached to the payment.
             */
            fun purpose(): String? = purpose.getNullable("purpose")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            fun chargeBearer(): ChargeBearer? = chargeBearer.getNullable("charge_bearer")

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
                foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(): String? =
                foreignExchangeContract.getNullable("foreign_exchange_contract")

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(): Boolean? = nsfProtected.getNullable("nsf_protected")

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(): String? =
                originatingPartyName.getNullable("originating_party_name")

            /** Name of the ultimate originator of the payment order. */
            fun ultimateOriginatingPartyName(): String? =
                ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")

            /** Identifier of the ultimate originator of the payment order. */
            fun ultimateOriginatingPartyIdentifier(): String? =
                ultimateOriginatingPartyIdentifier.getNullable(
                    "ultimate_originating_party_identifier"
                )

            /** Name of the ultimate funds recipient. */
            fun ultimateReceivingPartyName(): String? =
                ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")

            /** Identifier of the ultimate funds recipient. */
            fun ultimateReceivingPartyIdentifier(): String? =
                ultimateReceivingPartyIdentifier.getNullable("ultimate_receiving_party_identifier")

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(): Boolean? =
                sendRemittanceAdvice.getNullable("send_remittance_advice")

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(): FallbackType? = fallbackType.getNullable("fallback_type")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(): ReceivingAccount? =
                receivingAccount.getNullable("receiving_account")

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            fun ledgerTransaction(): LedgerTransactionCreateRequest? =
                ledgerTransaction.getNullable("ledger_transaction")

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            fun ledgerTransactionId(): String? =
                ledgerTransactionId.getNullable("ledger_transaction_id")

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            fun transactionMonitoringEnabled(): Boolean? =
                transactionMonitoringEnabled.getNullable("transaction_monitoring_enabled")

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId() = originatingAccountId

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId() = receivingAccountId

            @JsonProperty("accounting") @ExcludeMissing fun _accounting() = accounting

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            fun _accountingCategoryId() = accountingCategoryId

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            fun _accountingLedgerClassId() = accountingLedgerClassId

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

            /** An optional description for internal use. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor() = statementDescriptor

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after") @ExcludeMissing fun _processAfter() = processAfter

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud, this is
             * the `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that
             * will be attached to the payment.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose() = purpose

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer") @ExcludeMissing fun _chargeBearer() = chargeBearer

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator() = foreignExchangeIndicator

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            fun _foreignExchangeContract() = foreignExchangeContract

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected") @ExcludeMissing fun _nsfProtected() = nsfProtected

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            fun _originatingPartyName() = originatingPartyName

            /** Name of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            fun _ultimateOriginatingPartyName() = ultimateOriginatingPartyName

            /** Identifier of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            fun _ultimateOriginatingPartyIdentifier() = ultimateOriginatingPartyIdentifier

            /** Name of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            fun _ultimateReceivingPartyName() = ultimateReceivingPartyName

            /** Identifier of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            fun _ultimateReceivingPartyIdentifier() = ultimateReceivingPartyIdentifier

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            fun _sendRemittanceAdvice() = sendRemittanceAdvice

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type") @ExcludeMissing fun _fallbackType() = fallbackType

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            @ExcludeMissing
            fun _receivingAccount() = receivingAccount

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            fun _ledgerTransaction() = ledgerTransaction

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun _ledgerTransactionId() = ledgerTransactionId

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            @JsonProperty("transaction_monitoring_enabled")
            @ExcludeMissing
            fun _transactionMonitoringEnabled() = transactionMonitoringEnabled

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PaymentOrderAsyncCreateRequest = apply {
                if (!validated) {
                    type()
                    subtype()
                    amount()
                    direction()
                    priority()
                    originatingAccountId()
                    receivingAccountId()
                    accounting()?.validate()
                    accountingCategoryId()
                    accountingLedgerClassId()
                    currency()
                    effectiveDate()
                    description()
                    statementDescriptor()
                    remittanceInformation()
                    processAfter()
                    purpose()
                    metadata()?.validate()
                    chargeBearer()
                    foreignExchangeIndicator()
                    foreignExchangeContract()
                    nsfProtected()
                    originatingPartyName()
                    ultimateOriginatingPartyName()
                    ultimateOriginatingPartyIdentifier()
                    ultimateReceivingPartyName()
                    ultimateReceivingPartyIdentifier()
                    sendRemittanceAdvice()
                    expiresAt()
                    fallbackType()
                    receivingAccount()?.validate()
                    ledgerTransaction()?.validate()
                    ledgerTransactionId()
                    lineItems()?.forEach { it.validate() }
                    transactionMonitoringEnabled()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentOrderAsyncCreateRequest &&
                    this.type == other.type &&
                    this.subtype == other.subtype &&
                    this.amount == other.amount &&
                    this.direction == other.direction &&
                    this.priority == other.priority &&
                    this.originatingAccountId == other.originatingAccountId &&
                    this.receivingAccountId == other.receivingAccountId &&
                    this.accounting == other.accounting &&
                    this.accountingCategoryId == other.accountingCategoryId &&
                    this.accountingLedgerClassId == other.accountingLedgerClassId &&
                    this.currency == other.currency &&
                    this.effectiveDate == other.effectiveDate &&
                    this.description == other.description &&
                    this.statementDescriptor == other.statementDescriptor &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.processAfter == other.processAfter &&
                    this.purpose == other.purpose &&
                    this.metadata == other.metadata &&
                    this.chargeBearer == other.chargeBearer &&
                    this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                    this.foreignExchangeContract == other.foreignExchangeContract &&
                    this.nsfProtected == other.nsfProtected &&
                    this.originatingPartyName == other.originatingPartyName &&
                    this.ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
                    this.ultimateOriginatingPartyIdentifier ==
                        other.ultimateOriginatingPartyIdentifier &&
                    this.ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
                    this.ultimateReceivingPartyIdentifier ==
                        other.ultimateReceivingPartyIdentifier &&
                    this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
                    this.expiresAt == other.expiresAt &&
                    this.fallbackType == other.fallbackType &&
                    this.receivingAccount == other.receivingAccount &&
                    this.ledgerTransaction == other.ledgerTransaction &&
                    this.ledgerTransactionId == other.ledgerTransactionId &&
                    this.lineItems == other.lineItems &&
                    this.transactionMonitoringEnabled == other.transactionMonitoringEnabled &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            subtype,
                            amount,
                            direction,
                            priority,
                            originatingAccountId,
                            receivingAccountId,
                            accounting,
                            accountingCategoryId,
                            accountingLedgerClassId,
                            currency,
                            effectiveDate,
                            description,
                            statementDescriptor,
                            remittanceInformation,
                            processAfter,
                            purpose,
                            metadata,
                            chargeBearer,
                            foreignExchangeIndicator,
                            foreignExchangeContract,
                            nsfProtected,
                            originatingPartyName,
                            ultimateOriginatingPartyName,
                            ultimateOriginatingPartyIdentifier,
                            ultimateReceivingPartyName,
                            ultimateReceivingPartyIdentifier,
                            sendRemittanceAdvice,
                            expiresAt,
                            fallbackType,
                            receivingAccount,
                            ledgerTransaction,
                            ledgerTransactionId,
                            lineItems,
                            transactionMonitoringEnabled,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "PaymentOrderAsyncCreateRequest{type=$type, subtype=$subtype, amount=$amount, direction=$direction, priority=$priority, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, currency=$currency, effectiveDate=$effectiveDate, description=$description, statementDescriptor=$statementDescriptor, remittanceInformation=$remittanceInformation, processAfter=$processAfter, purpose=$purpose, metadata=$metadata, chargeBearer=$chargeBearer, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeContract=$foreignExchangeContract, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, sendRemittanceAdvice=$sendRemittanceAdvice, expiresAt=$expiresAt, fallbackType=$fallbackType, receivingAccount=$receivingAccount, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, transactionMonitoringEnabled=$transactionMonitoringEnabled, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<PaymentOrderType> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var priority: JsonField<Priority> = JsonMissing.of()
                private var originatingAccountId: JsonField<String> = JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
                private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
                private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                    JsonMissing.of()
                private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
                private var lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of()
                private var transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest) =
                    apply {
                        this.type = paymentOrderAsyncCreateRequest.type
                        this.subtype = paymentOrderAsyncCreateRequest.subtype
                        this.amount = paymentOrderAsyncCreateRequest.amount
                        this.direction = paymentOrderAsyncCreateRequest.direction
                        this.priority = paymentOrderAsyncCreateRequest.priority
                        this.originatingAccountId =
                            paymentOrderAsyncCreateRequest.originatingAccountId
                        this.receivingAccountId = paymentOrderAsyncCreateRequest.receivingAccountId
                        this.accounting = paymentOrderAsyncCreateRequest.accounting
                        this.accountingCategoryId =
                            paymentOrderAsyncCreateRequest.accountingCategoryId
                        this.accountingLedgerClassId =
                            paymentOrderAsyncCreateRequest.accountingLedgerClassId
                        this.currency = paymentOrderAsyncCreateRequest.currency
                        this.effectiveDate = paymentOrderAsyncCreateRequest.effectiveDate
                        this.description = paymentOrderAsyncCreateRequest.description
                        this.statementDescriptor =
                            paymentOrderAsyncCreateRequest.statementDescriptor
                        this.remittanceInformation =
                            paymentOrderAsyncCreateRequest.remittanceInformation
                        this.processAfter = paymentOrderAsyncCreateRequest.processAfter
                        this.purpose = paymentOrderAsyncCreateRequest.purpose
                        this.metadata = paymentOrderAsyncCreateRequest.metadata
                        this.chargeBearer = paymentOrderAsyncCreateRequest.chargeBearer
                        this.foreignExchangeIndicator =
                            paymentOrderAsyncCreateRequest.foreignExchangeIndicator
                        this.foreignExchangeContract =
                            paymentOrderAsyncCreateRequest.foreignExchangeContract
                        this.nsfProtected = paymentOrderAsyncCreateRequest.nsfProtected
                        this.originatingPartyName =
                            paymentOrderAsyncCreateRequest.originatingPartyName
                        this.ultimateOriginatingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyName
                        this.ultimateOriginatingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyIdentifier
                        this.ultimateReceivingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyName
                        this.ultimateReceivingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyIdentifier
                        this.sendRemittanceAdvice =
                            paymentOrderAsyncCreateRequest.sendRemittanceAdvice
                        this.expiresAt = paymentOrderAsyncCreateRequest.expiresAt
                        this.fallbackType = paymentOrderAsyncCreateRequest.fallbackType
                        this.receivingAccount = paymentOrderAsyncCreateRequest.receivingAccount
                        this.ledgerTransaction = paymentOrderAsyncCreateRequest.ledgerTransaction
                        this.ledgerTransactionId =
                            paymentOrderAsyncCreateRequest.ledgerTransactionId
                        this.lineItems = paymentOrderAsyncCreateRequest.lineItems
                        this.transactionMonitoringEnabled =
                            paymentOrderAsyncCreateRequest.transactionMonitoringEnabled
                        additionalProperties(paymentOrderAsyncCreateRequest.additionalProperties)
                    }

                /**
                 * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
                 * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
                 * `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = type(JsonField.of(type))

                /**
                 * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
                 * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
                 * `signet`, `provexchange`, `zengin`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype) = subtype(JsonField.of(subtype))

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                @JsonProperty("subtype")
                @ExcludeMissing
                fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply {
                    this.subtype = subtype
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority) = priority(JsonField.of(priority))

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /** The ID of one of your organization's internal accounts. */
                @JsonProperty("originating_account_id")
                @ExcludeMissing
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String) =
                    receivingAccountId(JsonField.of(receivingAccountId))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account_id")
                @ExcludeMissing
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                @JsonProperty("accounting")
                @ExcludeMissing
                fun accounting(accounting: JsonField<Accounting>) = apply {
                    this.accounting = accounting
                }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(accountingCategoryId: String) =
                    accountingCategoryId(JsonField.of(accountingCategoryId))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingLedgerClassId(accountingLedgerClassId: String) =
                    accountingLedgerClassId(JsonField.of(accountingLedgerClassId))

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_ledger_class_id")
                @ExcludeMissing
                fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /** Defaults to the currency of the originating account. */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                @JsonProperty("effective_date")
                @ExcludeMissing
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An optional description for internal use. */
                fun description(description: String) = description(JsonField.of(description))

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String) =
                    statementDescriptor(JsonField.of(statementDescriptor))

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime) =
                    processAfter(JsonField.of(processAfter))

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                @JsonProperty("process_after")
                @ExcludeMissing
                fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud,
                 * this is the `payment.purpose_code` field. For `eft`, this field is the 3 digit
                 * CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String) = purpose(JsonField.of(purpose))

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud,
                 * this is the `payment.purpose_code` field. For `eft`, this field is the 3 digit
                 * CPA Code that will be attached to the payment.
                 */
                @JsonProperty("purpose")
                @ExcludeMissing
                fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer) =
                    chargeBearer(JsonField.of(chargeBearer))

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                @JsonProperty("charge_bearer")
                @ExcludeMissing
                fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                    this.chargeBearer = chargeBearer
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                    foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String) =
                    foreignExchangeContract(JsonField.of(foreignExchangeContract))

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                @JsonProperty("foreign_exchange_contract")
                @ExcludeMissing
                fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                @JsonProperty("nsf_protected")
                @ExcludeMissing
                fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                    this.nsfProtected = nsfProtected
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String) =
                    originatingPartyName(JsonField.of(originatingPartyName))

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                @JsonProperty("originating_party_name")
                @ExcludeMissing
                fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /** Name of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) =
                    ultimateOriginatingPartyName(JsonField.of(ultimateOriginatingPartyName))

                /** Name of the ultimate originator of the payment order. */
                @JsonProperty("ultimate_originating_party_name")
                @ExcludeMissing
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                    }

                /** Identifier of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
                    ultimateOriginatingPartyIdentifier(
                        JsonField.of(ultimateOriginatingPartyIdentifier)
                    )

                /** Identifier of the ultimate originator of the payment order. */
                @JsonProperty("ultimate_originating_party_identifier")
                @ExcludeMissing
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /** Name of the ultimate funds recipient. */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) =
                    ultimateReceivingPartyName(JsonField.of(ultimateReceivingPartyName))

                /** Name of the ultimate funds recipient. */
                @JsonProperty("ultimate_receiving_party_name")
                @ExcludeMissing
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateReceivingPartyName = ultimateReceivingPartyName
                    }

                /** Identifier of the ultimate funds recipient. */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) =
                    ultimateReceivingPartyIdentifier(JsonField.of(ultimateReceivingPartyIdentifier))

                /** Identifier of the ultimate funds recipient. */
                @JsonProperty("ultimate_receiving_party_identifier")
                @ExcludeMissing
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                @JsonProperty("send_remittance_advice")
                @ExcludeMissing
                fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                @JsonProperty("expires_at")
                @ExcludeMissing
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
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                @JsonProperty("fallback_type")
                @ExcludeMissing
                fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account")
                @ExcludeMissing
                fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                    ledgerTransaction(JsonField.of(ledgerTransaction))

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                @JsonProperty("ledger_transaction")
                @ExcludeMissing
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
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon payment order creation. Once the
                 * payment order is created, the status of the ledger transaction tracks the payment
                 * order automatically.
                 */
                @JsonProperty("ledger_transaction_id")
                @ExcludeMissing
                fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /** An array of line items that must sum up to the amount of the payment order. */
                @JsonProperty("line_items")
                @ExcludeMissing
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems
                }

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) =
                    transactionMonitoringEnabled(JsonField.of(transactionMonitoringEnabled))

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                @JsonProperty("transaction_monitoring_enabled")
                @ExcludeMissing
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: JsonField<Boolean>) =
                    apply {
                        this.transactionMonitoringEnabled = transactionMonitoringEnabled
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PaymentOrderAsyncCreateRequest =
                    PaymentOrderAsyncCreateRequest(
                        type,
                        subtype,
                        amount,
                        direction,
                        priority,
                        originatingAccountId,
                        receivingAccountId,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        currency,
                        effectiveDate,
                        description,
                        statementDescriptor,
                        remittanceInformation,
                        processAfter,
                        purpose,
                        metadata,
                        chargeBearer,
                        foreignExchangeIndicator,
                        foreignExchangeContract,
                        nsfProtected,
                        originatingPartyName,
                        ultimateOriginatingPartyName,
                        ultimateOriginatingPartyIdentifier,
                        ultimateReceivingPartyName,
                        ultimateReceivingPartyIdentifier,
                        sendRemittanceAdvice,
                        expiresAt,
                        fallbackType,
                        receivingAccount,
                        ledgerTransaction,
                        ledgerTransactionId,
                        lineItems.map { it.toUnmodifiable() },
                        transactionMonitoringEnabled,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Direction && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CREDIT = Direction(JsonField.of("credit"))

                    val DEBIT = Direction(JsonField.of("debit"))

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                enum class Value {
                    CREDIT,
                    DEBIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = Accounting.Builder::class)
            @NoAutoDetect
            class Accounting
            private constructor(
                private val accountId: JsonField<String>,
                private val classId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountId(): String? = accountId.getNullable("account_id")

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                fun classId(): String? = classId.getNullable("class_id")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id") @ExcludeMissing fun _classId() = classId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Accounting = apply {
                    if (!validated) {
                        accountId()
                        classId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Accounting &&
                        this.accountId == other.accountId &&
                        this.classId == other.classId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                accountId,
                                classId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountId: JsonField<String> = JsonMissing.of()
                    private var classId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(accounting: Accounting) = apply {
                        this.accountId = accounting.accountId
                        this.classId = accounting.classId
                        additionalProperties(accounting.additionalProperties)
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("account_id")
                    @ExcludeMissing
                    fun accountId(accountId: JsonField<String>) = apply {
                        this.accountId = accountId
                    }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: String) = classId(JsonField.of(classId))

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    @JsonProperty("class_id")
                    @ExcludeMissing
                    fun classId(classId: JsonField<String>) = apply { this.classId = classId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Accounting =
                        Accounting(
                            accountId,
                            classId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class ChargeBearer
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChargeBearer && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val SHARED = ChargeBearer(JsonField.of("shared"))

                    val SENDER = ChargeBearer(JsonField.of("sender"))

                    val RECEIVER = ChargeBearer(JsonField.of("receiver"))

                    fun of(value: String) = ChargeBearer(JsonField.of(value))
                }

                enum class Known {
                    SHARED,
                    SENDER,
                    RECEIVER,
                }

                enum class Value {
                    SHARED,
                    SENDER,
                    RECEIVER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SHARED -> Value.SHARED
                        SENDER -> Value.SENDER
                        RECEIVER -> Value.RECEIVER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SHARED -> Known.SHARED
                        SENDER -> Known.SENDER
                        RECEIVER -> Known.RECEIVER
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class FallbackType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FallbackType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH = FallbackType(JsonField.of("ach"))

                    fun of(value: String) = FallbackType(JsonField.of(value))
                }

                enum class Known {
                    ACH,
                }

                enum class Value {
                    ACH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ForeignExchangeIndicator && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val FIXED_TO_VARIABLE =
                        ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

                    val VARIABLE_TO_FIXED =
                        ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

                    fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                }

                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            private constructor(
                private val description: JsonField<String>,
                private val status: JsonField<Status>,
                private val metadata: JsonField<Metadata>,
                private val effectiveAt: JsonField<OffsetDateTime>,
                private val effectiveDate: JsonField<LocalDate>,
                private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>,
                private val externalId: JsonField<String>,
                private val ledgerableType: JsonField<LedgerableType>,
                private val ledgerableId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An optional description for internal use. */
                fun description(): String? = description.getNullable("description")

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(): Status? = status.getNullable("status")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

                /** An array of ledger entry objects. */
                fun ledgerEntries(): List<LedgerEntryCreateRequest> =
                    ledgerEntries.getRequired("ledger_entries")

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(): String? = externalId.getNullable("external_id")

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                fun ledgerableType(): LedgerableType? =
                    ledgerableType.getNullable("ledgerable_type")

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

                /** An optional description for internal use. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                fun _ledgerableType() = ledgerableType

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id") @ExcludeMissing fun _ledgerableId() = ledgerableId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LedgerTransactionCreateRequest = apply {
                    if (!validated) {
                        description()
                        status()
                        metadata()?.validate()
                        effectiveAt()
                        effectiveDate()
                        ledgerEntries().forEach { it.validate() }
                        externalId()
                        ledgerableType()
                        ledgerableId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerTransactionCreateRequest &&
                        this.description == other.description &&
                        this.status == other.status &&
                        this.metadata == other.metadata &&
                        this.effectiveAt == other.effectiveAt &&
                        this.effectiveDate == other.effectiveDate &&
                        this.ledgerEntries == other.ledgerEntries &&
                        this.externalId == other.externalId &&
                        this.ledgerableType == other.ledgerableType &&
                        this.ledgerableId == other.ledgerableId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                description,
                                status,
                                metadata,
                                effectiveAt,
                                effectiveDate,
                                ledgerEntries,
                                externalId,
                                ledgerableType,
                                ledgerableId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var description: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                    private var ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> =
                        JsonMissing.of()
                    private var externalId: JsonField<String> = JsonMissing.of()
                    private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                    private var ledgerableId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        this.description = ledgerTransactionCreateRequest.description
                        this.status = ledgerTransactionCreateRequest.status
                        this.metadata = ledgerTransactionCreateRequest.metadata
                        this.effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        this.effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        this.ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries
                        this.externalId = ledgerTransactionCreateRequest.externalId
                        this.ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        this.ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        additionalProperties(ledgerTransactionCreateRequest.additionalProperties)
                    }

                    /** An optional description for internal use. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** An optional description for internal use. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /** To post a ledger transaction at creation, use `posted`. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    @JsonProperty("effective_at")
                    @ExcludeMissing
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: LocalDate) =
                        effectiveDate(JsonField.of(effectiveDate))

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    @JsonProperty("effective_date")
                    @ExcludeMissing
                    fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                        ledgerEntries(JsonField.of(ledgerEntries))

                    /** An array of ledger entry objects. */
                    @JsonProperty("ledger_entries")
                    @ExcludeMissing
                    fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                        apply {
                            this.ledgerEntries = ledgerEntries
                        }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    @JsonProperty("external_id")
                    @ExcludeMissing
                    fun externalId(externalId: JsonField<String>) = apply {
                        this.externalId = externalId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, or
                     * reversal.
                     */
                    fun ledgerableType(ledgerableType: LedgerableType) =
                        ledgerableType(JsonField.of(ledgerableType))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, or
                     * reversal.
                     */
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: String) =
                        ledgerableId(JsonField.of(ledgerableId))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LedgerTransactionCreateRequest =
                        LedgerTransactionCreateRequest(
                            description,
                            status,
                            metadata,
                            effectiveAt,
                            effectiveDate,
                            ledgerEntries.map { it.toUnmodifiable() },
                            externalId,
                            ledgerableType,
                            ledgerableId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerEntryCreateRequest
                private constructor(
                    private val amount: JsonField<Long>,
                    private val direction: JsonField<TransactionDirection>,
                    private val ledgerAccountId: JsonField<String>,
                    private val lockVersion: JsonField<Long>,
                    private val pendingBalanceAmount: JsonField<PendingBalanceAmount>,
                    private val postedBalanceAmount: JsonField<PostedBalanceAmount>,
                    private val availableBalanceAmount: JsonField<AvailableBalanceAmount>,
                    private val showResultingLedgerAccountBalances: JsonField<Boolean>,
                    private val metadata: JsonField<Metadata>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(): TransactionDirection = direction.getRequired("direction")

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(): Long? = lockVersion.getNullable("lock_version")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(): PendingBalanceAmount? =
                        pendingBalanceAmount.getNullable("pending_balance_amount")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(): PostedBalanceAmount? =
                        postedBalanceAmount.getNullable("posted_balance_amount")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(): AvailableBalanceAmount? =
                        availableBalanceAmount.getNullable("available_balance_amount")

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(): Boolean? =
                        showResultingLedgerAccountBalances.getNullable(
                            "show_resulting_ledger_account_balances"
                        )

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Metadata? = metadata.getNullable("metadata")

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    fun _ledgerAccountId() = ledgerAccountId

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version") @ExcludeMissing fun _lockVersion() = lockVersion

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    fun _pendingBalanceAmount() = pendingBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    fun _postedBalanceAmount() = postedBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    fun _availableBalanceAmount() = availableBalanceAmount

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    fun _showResultingLedgerAccountBalances() = showResultingLedgerAccountBalances

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): LedgerEntryCreateRequest = apply {
                        if (!validated) {
                            amount()
                            direction()
                            ledgerAccountId()
                            lockVersion()
                            pendingBalanceAmount()?.validate()
                            postedBalanceAmount()?.validate()
                            availableBalanceAmount()?.validate()
                            showResultingLedgerAccountBalances()
                            metadata()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LedgerEntryCreateRequest &&
                            this.amount == other.amount &&
                            this.direction == other.direction &&
                            this.ledgerAccountId == other.ledgerAccountId &&
                            this.lockVersion == other.lockVersion &&
                            this.pendingBalanceAmount == other.pendingBalanceAmount &&
                            this.postedBalanceAmount == other.postedBalanceAmount &&
                            this.availableBalanceAmount == other.availableBalanceAmount &&
                            this.showResultingLedgerAccountBalances ==
                                other.showResultingLedgerAccountBalances &&
                            this.metadata == other.metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    amount,
                                    direction,
                                    ledgerAccountId,
                                    lockVersion,
                                    pendingBalanceAmount,
                                    postedBalanceAmount,
                                    availableBalanceAmount,
                                    showResultingLedgerAccountBalances,
                                    metadata,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: JsonField<Long> = JsonMissing.of()
                        private var direction: JsonField<TransactionDirection> = JsonMissing.of()
                        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
                        private var lockVersion: JsonField<Long> = JsonMissing.of()
                        private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                            JsonMissing.of()
                        private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                            JsonMissing.of()
                        private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                            JsonMissing.of()
                        private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                            JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                this.amount = ledgerEntryCreateRequest.amount
                                this.direction = ledgerEntryCreateRequest.direction
                                this.ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                this.lockVersion = ledgerEntryCreateRequest.lockVersion
                                this.pendingBalanceAmount =
                                    ledgerEntryCreateRequest.pendingBalanceAmount
                                this.postedBalanceAmount =
                                    ledgerEntryCreateRequest.postedBalanceAmount
                                this.availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                this.showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                this.metadata = ledgerEntryCreateRequest.metadata
                                additionalProperties(ledgerEntryCreateRequest.additionalProperties)
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: TransactionDirection) =
                            direction(JsonField.of(direction))

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        @JsonProperty("direction")
                        @ExcludeMissing
                        fun direction(direction: JsonField<TransactionDirection>) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: String) =
                            ledgerAccountId(JsonField.of(ledgerAccountId))

                        /** The ledger account that this ledger entry is associated with. */
                        @JsonProperty("ledger_account_id")
                        @ExcludeMissing
                        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long) = lockVersion(JsonField.of(lockVersion))

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        @JsonProperty("lock_version")
                        @ExcludeMissing
                        fun lockVersion(lockVersion: JsonField<Long>) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) =
                            pendingBalanceAmount(JsonField.of(pendingBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("pending_balance_amount")
                        @ExcludeMissing
                        fun pendingBalanceAmount(
                            pendingBalanceAmount: JsonField<PendingBalanceAmount>
                        ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) =
                            postedBalanceAmount(JsonField.of(postedBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("posted_balance_amount")
                        @ExcludeMissing
                        fun postedBalanceAmount(
                            postedBalanceAmount: JsonField<PostedBalanceAmount>
                        ) = apply { this.postedBalanceAmount = postedBalanceAmount }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                            availableBalanceAmount(JsonField.of(availableBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        @JsonProperty("available_balance_amount")
                        @ExcludeMissing
                        fun availableBalanceAmount(
                            availableBalanceAmount: JsonField<AvailableBalanceAmount>
                        ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) =
                            showResultingLedgerAccountBalances(
                                JsonField.of(showResultingLedgerAccountBalances)
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        @JsonProperty("show_resulting_ledger_account_balances")
                        @ExcludeMissing
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: JsonField<Boolean>
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): LedgerEntryCreateRequest =
                            LedgerEntryCreateRequest(
                                amount,
                                direction,
                                ledgerAccountId,
                                lockVersion,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                availableBalanceAmount,
                                showResultingLedgerAccountBalances,
                                metadata,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): AvailableBalanceAmount = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is AvailableBalanceAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(availableBalanceAmount: AvailableBalanceAmount) =
                                apply {
                                    additionalProperties(
                                        availableBalanceAmount.additionalProperties
                                    )
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): AvailableBalanceAmount =
                                AvailableBalanceAmount(additionalProperties.toUnmodifiable())
                        }
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Metadata = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Metadata &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties(metadata.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                        }
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PendingBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PendingBalanceAmount = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PendingBalanceAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PendingBalanceAmount{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                                additionalProperties(pendingBalanceAmount.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PendingBalanceAmount =
                                PendingBalanceAmount(additionalProperties.toUnmodifiable())
                        }
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PostedBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PostedBalanceAmount = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PostedBalanceAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PostedBalanceAmount{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                                additionalProperties(postedBalanceAmount.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PostedBalanceAmount =
                                PostedBalanceAmount(additionalProperties.toUnmodifiable())
                        }
                    }
                }

                class LedgerableType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LedgerableType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                        val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

                        val INCOMING_PAYMENT_DETAIL =
                            LedgerableType(JsonField.of("incoming_payment_detail"))

                        val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                        val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

                        val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

                        val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

                        val PAYMENT_ORDER_ATTEMPT =
                            LedgerableType(JsonField.of("payment_order_attempt"))

                        val RETURN = LedgerableType(JsonField.of("return"))

                        val REVERSAL = LedgerableType(JsonField.of("reversal"))

                        fun of(value: String) = LedgerableType(JsonField.of(value))
                    }

                    enum class Known {
                        COUNTERPARTY,
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        INTERNAL_ACCOUNT,
                        LINE_ITEM,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        PAYMENT_ORDER_ATTEMPT,
                        RETURN,
                        REVERSAL,
                    }

                    enum class Value {
                        COUNTERPARTY,
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        INTERNAL_ACCOUNT,
                        LINE_ITEM,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        PAYMENT_ORDER_ATTEMPT,
                        RETURN,
                        REVERSAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            COUNTERPARTY -> Value.COUNTERPARTY
                            EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                            INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                            INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                            LINE_ITEM -> Value.LINE_ITEM
                            PAPER_ITEM -> Value.PAPER_ITEM
                            PAYMENT_ORDER -> Value.PAYMENT_ORDER
                            PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                            RETURN -> Value.RETURN
                            REVERSAL -> Value.REVERSAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            COUNTERPARTY -> Known.COUNTERPARTY
                            EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                            INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                            INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                            LINE_ITEM -> Known.LINE_ITEM
                            PAPER_ITEM -> Known.PAPER_ITEM
                            PAYMENT_ORDER -> Known.PAYMENT_ORDER
                            PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                            RETURN -> Known.RETURN
                            REVERSAL -> Known.REVERSAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LedgerableType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }

                class Status
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Status && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ARCHIVED = Status(JsonField.of("archived"))

                        val PENDING = Status(JsonField.of("pending"))

                        val POSTED = Status(JsonField.of("posted"))

                        fun of(value: String) = Status(JsonField.of(value))
                    }

                    enum class Known {
                        ARCHIVED,
                        PENDING,
                        POSTED,
                    }

                    enum class Value {
                        ARCHIVED,
                        PENDING,
                        POSTED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ARCHIVED -> Value.ARCHIVED
                            PENDING -> Value.PENDING
                            POSTED -> Value.POSTED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ARCHIVED -> Known.ARCHIVED
                            PENDING -> Known.PENDING
                            POSTED -> Known.POSTED
                            else ->
                                throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = LineItemRequest.Builder::class)
            @NoAutoDetect
            class LineItemRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val metadata: JsonField<Metadata>,
                private val description: JsonField<String>,
                private val accountingCategoryId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /** A free-form description of the line item. */
                fun description(): String? = description.getNullable("description")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(): String? =
                    accountingCategoryId.getNullable("accounting_category_id")

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /** A free-form description of the line item. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId() = accountingCategoryId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LineItemRequest = apply {
                    if (!validated) {
                        amount()
                        metadata()?.validate()
                        description()
                        accountingCategoryId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LineItemRequest &&
                        this.amount == other.amount &&
                        this.metadata == other.metadata &&
                        this.description == other.description &&
                        this.accountingCategoryId == other.accountingCategoryId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                metadata,
                                description,
                                accountingCategoryId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        this.amount = lineItemRequest.amount
                        this.metadata = lineItemRequest.metadata
                        this.description = lineItemRequest.description
                        this.accountingCategoryId = lineItemRequest.accountingCategoryId
                        additionalProperties(lineItemRequest.additionalProperties)
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** A free-form description of the line item. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** A free-form description of the line item. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String) =
                        accountingCategoryId(JsonField.of(accountingCategoryId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("accounting_category_id")
                    @ExcludeMissing
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            amount,
                            metadata,
                            description,
                            accountingCategoryId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            class Priority
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Priority && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val HIGH = Priority(JsonField.of("high"))

                    val NORMAL = Priority(JsonField.of("normal"))

                    fun of(value: String) = Priority(JsonField.of(value))
                }

                enum class Known {
                    HIGH,
                    NORMAL,
                }

                enum class Value {
                    HIGH,
                    NORMAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        HIGH -> Value.HIGH
                        NORMAL -> Value.NORMAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        HIGH -> Known.HIGH
                        NORMAL -> Known.NORMAL
                        else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonDeserialize(builder = ReceivingAccount.Builder::class)
            @NoAutoDetect
            class ReceivingAccount
            private constructor(
                private val accountType: JsonField<ExternalAccountType>,
                private val partyType: JsonField<PartyType>,
                private val partyAddress: JsonField<AddressRequest>,
                private val name: JsonField<String>,
                private val accountDetails: JsonField<List<AccountDetail>>,
                private val routingDetails: JsonField<List<RoutingDetail>>,
                private val metadata: JsonField<Metadata>,
                private val partyName: JsonField<String>,
                private val partyIdentifier: JsonField<String>,
                private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
                private val plaidProcessorToken: JsonField<String>,
                private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Can be `checking`, `savings` or `other`. */
                fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

                /** Either `individual` or `business`. */
                fun partyType(): PartyType? = partyType.getNullable("party_type")

                /** Required if receiving wire payments. */
                fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                fun name(): String? = name.getNullable("name")

                fun accountDetails(): List<AccountDetail>? =
                    accountDetails.getNullable("account_details")

                fun routingDetails(): List<RoutingDetail>? =
                    routingDetails.getNullable("routing_details")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                fun partyName(): String? = partyName.getNullable("party_name")

                fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                fun ledgerAccount(): LedgerAccountCreateRequest? =
                    ledgerAccount.getNullable("ledger_account")

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                fun plaidProcessorToken(): String? =
                    plaidProcessorToken.getNullable("plaid_processor_token")

                fun contactDetails(): List<ContactDetailCreateRequest>? =
                    contactDetails.getNullable("contact_details")

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

                /** Either `individual` or `business`. */
                @JsonProperty("party_type") @ExcludeMissing fun _partyType() = partyType

                /** Required if receiving wire payments. */
                @JsonProperty("party_address") @ExcludeMissing fun _partyAddress() = partyAddress

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("account_details")
                @ExcludeMissing
                fun _accountDetails() = accountDetails

                @JsonProperty("routing_details")
                @ExcludeMissing
                fun _routingDetails() = routingDetails

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name") @ExcludeMissing fun _partyName() = partyName

                @JsonProperty("party_identifier")
                @ExcludeMissing
                fun _partyIdentifier() = partyIdentifier

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account") @ExcludeMissing fun _ledgerAccount() = ledgerAccount

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                fun _plaidProcessorToken() = plaidProcessorToken

                @JsonProperty("contact_details")
                @ExcludeMissing
                fun _contactDetails() = contactDetails

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ReceivingAccount = apply {
                    if (!validated) {
                        accountType()
                        partyType()
                        partyAddress()?.validate()
                        name()
                        accountDetails()?.forEach { it.validate() }
                        routingDetails()?.forEach { it.validate() }
                        metadata()?.validate()
                        partyName()
                        partyIdentifier()
                        ledgerAccount()?.validate()
                        plaidProcessorToken()
                        contactDetails()?.forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReceivingAccount &&
                        this.accountType == other.accountType &&
                        this.partyType == other.partyType &&
                        this.partyAddress == other.partyAddress &&
                        this.name == other.name &&
                        this.accountDetails == other.accountDetails &&
                        this.routingDetails == other.routingDetails &&
                        this.metadata == other.metadata &&
                        this.partyName == other.partyName &&
                        this.partyIdentifier == other.partyIdentifier &&
                        this.ledgerAccount == other.ledgerAccount &&
                        this.plaidProcessorToken == other.plaidProcessorToken &&
                        this.contactDetails == other.contactDetails &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                accountType,
                                partyType,
                                partyAddress,
                                name,
                                accountDetails,
                                routingDetails,
                                metadata,
                                partyName,
                                partyIdentifier,
                                ledgerAccount,
                                plaidProcessorToken,
                                contactDetails,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
                    private var partyType: JsonField<PartyType> = JsonMissing.of()
                    private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of()
                    private var routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var partyName: JsonField<String> = JsonMissing.of()
                    private var partyIdentifier: JsonField<String> = JsonMissing.of()
                    private var ledgerAccount: JsonField<LedgerAccountCreateRequest> =
                        JsonMissing.of()
                    private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
                    private var contactDetails: JsonField<List<ContactDetailCreateRequest>> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        this.accountType = receivingAccount.accountType
                        this.partyType = receivingAccount.partyType
                        this.partyAddress = receivingAccount.partyAddress
                        this.name = receivingAccount.name
                        this.accountDetails = receivingAccount.accountDetails
                        this.routingDetails = receivingAccount.routingDetails
                        this.metadata = receivingAccount.metadata
                        this.partyName = receivingAccount.partyName
                        this.partyIdentifier = receivingAccount.partyIdentifier
                        this.ledgerAccount = receivingAccount.ledgerAccount
                        this.plaidProcessorToken = receivingAccount.plaidProcessorToken
                        this.contactDetails = receivingAccount.contactDetails
                        additionalProperties(receivingAccount.additionalProperties)
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType) =
                        accountType(JsonField.of(accountType))

                    /** Can be `checking`, `savings` or `other`. */
                    @JsonProperty("account_type")
                    @ExcludeMissing
                    fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                        this.accountType = accountType
                    }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType) = partyType(JsonField.of(partyType))

                    /** Either `individual` or `business`. */
                    @JsonProperty("party_type")
                    @ExcludeMissing
                    fun partyType(partyType: JsonField<PartyType>) = apply {
                        this.partyType = partyType
                    }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest) =
                        partyAddress(JsonField.of(partyAddress))

                    /** Required if receiving wire payments. */
                    @JsonProperty("party_address")
                    @ExcludeMissing
                    fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                        this.partyAddress = partyAddress
                    }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun accountDetails(accountDetails: List<AccountDetail>) =
                        accountDetails(JsonField.of(accountDetails))

                    @JsonProperty("account_details")
                    @ExcludeMissing
                    fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                        this.accountDetails = accountDetails
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>) =
                        routingDetails(JsonField.of(routingDetails))

                    @JsonProperty("routing_details")
                    @ExcludeMissing
                    fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                        this.routingDetails = routingDetails
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String) = partyName(JsonField.of(partyName))

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    @JsonProperty("party_name")
                    @ExcludeMissing
                    fun partyName(partyName: JsonField<String>) = apply {
                        this.partyName = partyName
                    }

                    fun partyIdentifier(partyIdentifier: String) =
                        partyIdentifier(JsonField.of(partyIdentifier))

                    @JsonProperty("party_identifier")
                    @ExcludeMissing
                    fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                        this.partyIdentifier = partyIdentifier
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
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    @JsonProperty("ledger_account")
                    @ExcludeMissing
                    fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) =
                        apply {
                            this.ledgerAccount = ledgerAccount
                        }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String) =
                        plaidProcessorToken(JsonField.of(plaidProcessorToken))

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    @JsonProperty("plaid_processor_token")
                    @ExcludeMissing
                    fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                        contactDetails(JsonField.of(contactDetails))

                    @JsonProperty("contact_details")
                    @ExcludeMissing
                    fun contactDetails(
                        contactDetails: JsonField<List<ContactDetailCreateRequest>>
                    ) = apply { this.contactDetails = contactDetails }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            accountType,
                            partyType,
                            partyAddress,
                            name,
                            accountDetails.map { it.toUnmodifiable() },
                            routingDetails.map { it.toUnmodifiable() },
                            metadata,
                            partyName,
                            partyIdentifier,
                            ledgerAccount,
                            plaidProcessorToken,
                            contactDetails.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = AccountDetail.Builder::class)
                @NoAutoDetect
                class AccountDetail
                private constructor(
                    private val accountNumber: JsonField<String>,
                    private val accountNumberType: JsonField<AccountNumberType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun accountNumber(): String = accountNumber.getRequired("account_number")

                    fun accountNumberType(): AccountNumberType? =
                        accountNumberType.getNullable("account_number_type")

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber() = accountNumber

                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    fun _accountNumberType() = accountNumberType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AccountDetail = apply {
                        if (!validated) {
                            accountNumber()
                            accountNumberType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccountDetail &&
                            this.accountNumber == other.accountNumber &&
                            this.accountNumberType == other.accountNumberType &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    accountNumber,
                                    accountNumberType,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var accountNumber: JsonField<String> = JsonMissing.of()
                        private var accountNumberType: JsonField<AccountNumberType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(accountDetail: AccountDetail) = apply {
                            this.accountNumber = accountDetail.accountNumber
                            this.accountNumberType = accountDetail.accountNumberType
                            additionalProperties(accountDetail.additionalProperties)
                        }

                        fun accountNumber(accountNumber: String) =
                            accountNumber(JsonField.of(accountNumber))

                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun accountNumber(accountNumber: JsonField<String>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType) =
                            accountNumberType(JsonField.of(accountNumberType))

                        @JsonProperty("account_number_type")
                        @ExcludeMissing
                        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) =
                            apply {
                                this.accountNumberType = accountNumberType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AccountDetail =
                            AccountDetail(
                                accountNumber,
                                accountNumberType,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class AccountNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is AccountNumberType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val IBAN = AccountNumberType(JsonField.of("iban"))

                            val HK_NUMBER = AccountNumberType(JsonField.of("hk_number"))

                            val CLABE = AccountNumberType(JsonField.of("clabe"))

                            val NZ_NUMBER = AccountNumberType(JsonField.of("nz_number"))

                            val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

                            val PAN = AccountNumberType(JsonField.of("pan"))

                            val OTHER = AccountNumberType(JsonField.of("other"))

                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            IBAN,
                            HK_NUMBER,
                            CLABE,
                            NZ_NUMBER,
                            WALLET_ADDRESS,
                            PAN,
                            OTHER,
                        }

                        enum class Value {
                            IBAN,
                            HK_NUMBER,
                            CLABE,
                            NZ_NUMBER,
                            WALLET_ADDRESS,
                            PAN,
                            OTHER,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                IBAN -> Value.IBAN
                                HK_NUMBER -> Value.HK_NUMBER
                                CLABE -> Value.CLABE
                                NZ_NUMBER -> Value.NZ_NUMBER
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                PAN -> Value.PAN
                                OTHER -> Value.OTHER
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                IBAN -> Known.IBAN
                                HK_NUMBER -> Known.HK_NUMBER
                                CLABE -> Known.CLABE
                                NZ_NUMBER -> Known.NZ_NUMBER
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                PAN -> Known.PAN
                                OTHER -> Known.OTHER
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
                @NoAutoDetect
                class ContactDetailCreateRequest
                private constructor(
                    private val contactIdentifier: JsonField<String>,
                    private val contactIdentifierType: JsonField<ContactIdentifierType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun contactIdentifier(): String? =
                        contactIdentifier.getNullable("contact_identifier")

                    fun contactIdentifierType(): ContactIdentifierType? =
                        contactIdentifierType.getNullable("contact_identifier_type")

                    @JsonProperty("contact_identifier")
                    @ExcludeMissing
                    fun _contactIdentifier() = contactIdentifier

                    @JsonProperty("contact_identifier_type")
                    @ExcludeMissing
                    fun _contactIdentifierType() = contactIdentifierType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ContactDetailCreateRequest = apply {
                        if (!validated) {
                            contactIdentifier()
                            contactIdentifierType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ContactDetailCreateRequest &&
                            this.contactIdentifier == other.contactIdentifier &&
                            this.contactIdentifierType == other.contactIdentifierType &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    contactIdentifier,
                                    contactIdentifierType,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var contactIdentifier: JsonField<String> = JsonMissing.of()
                        private var contactIdentifierType: JsonField<ContactIdentifierType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) =
                            apply {
                                this.contactIdentifier =
                                    contactDetailCreateRequest.contactIdentifier
                                this.contactIdentifierType =
                                    contactDetailCreateRequest.contactIdentifierType
                                additionalProperties(
                                    contactDetailCreateRequest.additionalProperties
                                )
                            }

                        fun contactIdentifier(contactIdentifier: String) =
                            contactIdentifier(JsonField.of(contactIdentifier))

                        @JsonProperty("contact_identifier")
                        @ExcludeMissing
                        fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                            contactIdentifierType(JsonField.of(contactIdentifierType))

                        @JsonProperty("contact_identifier_type")
                        @ExcludeMissing
                        fun contactIdentifierType(
                            contactIdentifierType: JsonField<ContactIdentifierType>
                        ) = apply { this.contactIdentifierType = contactIdentifierType }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ContactDetailCreateRequest =
                            ContactDetailCreateRequest(
                                contactIdentifier,
                                contactIdentifierType,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ContactIdentifierType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ContactIdentifierType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val EMAIL = ContactIdentifierType(JsonField.of("email"))

                            val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                            val WEBSITE = ContactIdentifierType(JsonField.of("website"))

                            fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                        }

                        enum class Known {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                        }

                        enum class Value {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                EMAIL -> Value.EMAIL
                                PHONE_NUMBER -> Value.PHONE_NUMBER
                                WEBSITE -> Value.WEBSITE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                EMAIL -> Known.EMAIL
                                PHONE_NUMBER -> Known.PHONE_NUMBER
                                WEBSITE -> Known.WEBSITE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown ContactIdentifierType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerAccountCreateRequest
                private constructor(
                    private val name: JsonField<String>,
                    private val description: JsonField<String>,
                    private val normalBalance: JsonField<TransactionDirection>,
                    private val ledgerId: JsonField<String>,
                    private val currency: JsonField<String>,
                    private val currencyExponent: JsonField<Long>,
                    private val ledgerAccountCategoryIds: JsonField<List<String>>,
                    private val ledgerableId: JsonField<String>,
                    private val ledgerableType: JsonField<LedgerableType>,
                    private val metadata: JsonField<Metadata>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** The name of the ledger account. */
                    fun name(): String = name.getRequired("name")

                    /** The description of the ledger account. */
                    fun description(): String? = description.getNullable("description")

                    /** The normal balance of the ledger account. */
                    fun normalBalance(): TransactionDirection =
                        normalBalance.getRequired("normal_balance")

                    /** The id of the ledger that this account belongs to. */
                    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

                    /** The currency of the ledger account. */
                    fun currency(): String = currency.getRequired("currency")

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(): Long? =
                        currencyExponent.getNullable("currency_exponent")

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    fun ledgerAccountCategoryIds(): List<String>? =
                        ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    fun ledgerableType(): LedgerableType? =
                        ledgerableType.getNullable("ledgerable_type")

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Metadata? = metadata.getNullable("metadata")

                    /** The name of the ledger account. */
                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    /** The description of the ledger account. */
                    @JsonProperty("description") @ExcludeMissing fun _description() = description

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    @ExcludeMissing
                    fun _normalBalance() = normalBalance

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

                    /** The currency of the ledger account. */
                    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    fun _currencyExponent() = currencyExponent

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    @ExcludeMissing
                    fun _ledgerAccountCategoryIds() = ledgerAccountCategoryIds

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    fun _ledgerableId() = ledgerableId

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    fun _ledgerableType() = ledgerableType

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): LedgerAccountCreateRequest = apply {
                        if (!validated) {
                            name()
                            description()
                            normalBalance()
                            ledgerId()
                            currency()
                            currencyExponent()
                            ledgerAccountCategoryIds()
                            ledgerableId()
                            ledgerableType()
                            metadata()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LedgerAccountCreateRequest &&
                            this.name == other.name &&
                            this.description == other.description &&
                            this.normalBalance == other.normalBalance &&
                            this.ledgerId == other.ledgerId &&
                            this.currency == other.currency &&
                            this.currencyExponent == other.currencyExponent &&
                            this.ledgerAccountCategoryIds == other.ledgerAccountCategoryIds &&
                            this.ledgerableId == other.ledgerableId &&
                            this.ledgerableType == other.ledgerableType &&
                            this.metadata == other.metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    name,
                                    description,
                                    normalBalance,
                                    ledgerId,
                                    currency,
                                    currencyExponent,
                                    ledgerAccountCategoryIds,
                                    ledgerableId,
                                    ledgerableType,
                                    metadata,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var description: JsonField<String> = JsonMissing.of()
                        private var normalBalance: JsonField<TransactionDirection> =
                            JsonMissing.of()
                        private var ledgerId: JsonField<String> = JsonMissing.of()
                        private var currency: JsonField<String> = JsonMissing.of()
                        private var currencyExponent: JsonField<Long> = JsonMissing.of()
                        private var ledgerAccountCategoryIds: JsonField<List<String>> =
                            JsonMissing.of()
                        private var ledgerableId: JsonField<String> = JsonMissing.of()
                        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                this.name = ledgerAccountCreateRequest.name
                                this.description = ledgerAccountCreateRequest.description
                                this.normalBalance = ledgerAccountCreateRequest.normalBalance
                                this.ledgerId = ledgerAccountCreateRequest.ledgerId
                                this.currency = ledgerAccountCreateRequest.currency
                                this.currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                this.ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds
                                this.ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                this.ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                this.metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties(
                                    ledgerAccountCreateRequest.additionalProperties
                                )
                            }

                        /** The name of the ledger account. */
                        fun name(name: String) = name(JsonField.of(name))

                        /** The name of the ledger account. */
                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** The description of the ledger account. */
                        fun description(description: String) =
                            description(JsonField.of(description))

                        /** The description of the ledger account. */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: TransactionDirection) =
                            normalBalance(JsonField.of(normalBalance))

                        /** The normal balance of the ledger account. */
                        @JsonProperty("normal_balance")
                        @ExcludeMissing
                        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

                        /** The id of the ledger that this account belongs to. */
                        @JsonProperty("ledger_id")
                        @ExcludeMissing
                        fun ledgerId(ledgerId: JsonField<String>) = apply {
                            this.ledgerId = ledgerId
                        }

                        /** The currency of the ledger account. */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /** The currency of the ledger account. */
                        @JsonProperty("currency")
                        @ExcludeMissing
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long) =
                            currencyExponent(JsonField.of(currencyExponent))

                        /** The currency exponent of the ledger account. */
                        @JsonProperty("currency_exponent")
                        @ExcludeMissing
                        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                            ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        @JsonProperty("ledger_account_category_ids")
                        @ExcludeMissing
                        fun ledgerAccountCategoryIds(
                            ledgerAccountCategoryIds: JsonField<List<String>>
                        ) = apply { this.ledgerAccountCategoryIds = ledgerAccountCategoryIds }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: String) =
                            ledgerableId(JsonField.of(ledgerableId))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        @JsonProperty("ledgerable_id")
                        @ExcludeMissing
                        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: LedgerableType) =
                            ledgerableType(JsonField.of(ledgerableType))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        @JsonProperty("ledgerable_type")
                        @ExcludeMissing
                        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): LedgerAccountCreateRequest =
                            LedgerAccountCreateRequest(
                                name,
                                description,
                                normalBalance,
                                ledgerId,
                                currency,
                                currencyExponent,
                                ledgerAccountCategoryIds.map { it.toUnmodifiable() },
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class LedgerableType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is LedgerableType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                            val EXTERNAL_ACCOUNT = LedgerableType(JsonField.of("external_account"))

                            val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                            val VIRTUAL_ACCOUNT = LedgerableType(JsonField.of("virtual_account"))

                            fun of(value: String) = LedgerableType(JsonField.of(value))
                        }

                        enum class Known {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                        }

                        enum class Value {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                COUNTERPARTY -> Value.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                COUNTERPARTY -> Known.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown LedgerableType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Metadata = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Metadata &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties(metadata.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                        }
                    }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }

                /** Required if receiving wire payments. */
                @JsonDeserialize(builder = AddressRequest.Builder::class)
                @NoAutoDetect
                class AddressRequest
                private constructor(
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val locality: JsonField<String>,
                    private val region: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val country: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun line1(): String? = line1.getNullable("line1")

                    fun line2(): String? = line2.getNullable("line2")

                    /** Locality or City. */
                    fun locality(): String? = locality.getNullable("locality")

                    /** Region or State. */
                    fun region(): String? = region.getNullable("region")

                    /** The postal code of the address. */
                    fun postalCode(): String? = postalCode.getNullable("postal_code")

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    fun country(): String? = country.getNullable("country")

                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    /** Locality or City. */
                    @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

                    /** Region or State. */
                    @JsonProperty("region") @ExcludeMissing fun _region() = region

                    /** The postal code of the address. */
                    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country") @ExcludeMissing fun _country() = country

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AddressRequest = apply {
                        if (!validated) {
                            line1()
                            line2()
                            locality()
                            region()
                            postalCode()
                            country()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AddressRequest &&
                            this.line1 == other.line1 &&
                            this.line2 == other.line2 &&
                            this.locality == other.locality &&
                            this.region == other.region &&
                            this.postalCode == other.postalCode &&
                            this.country == other.country &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    line1,
                                    line2,
                                    locality,
                                    region,
                                    postalCode,
                                    country,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var locality: JsonField<String> = JsonMissing.of()
                        private var region: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var country: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(addressRequest: AddressRequest) = apply {
                            this.line1 = addressRequest.line1
                            this.line2 = addressRequest.line2
                            this.locality = addressRequest.locality
                            this.region = addressRequest.region
                            this.postalCode = addressRequest.postalCode
                            this.country = addressRequest.country
                            additionalProperties(addressRequest.additionalProperties)
                        }

                        fun line1(line1: String) = line1(JsonField.of(line1))

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        fun line2(line2: String) = line2(JsonField.of(line2))

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String) = locality(JsonField.of(locality))

                        /** Locality or City. */
                        @JsonProperty("locality")
                        @ExcludeMissing
                        fun locality(locality: JsonField<String>) = apply {
                            this.locality = locality
                        }

                        /** Region or State. */
                        fun region(region: String) = region(JsonField.of(region))

                        /** Region or State. */
                        @JsonProperty("region")
                        @ExcludeMissing
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /** The postal code of the address. */
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String) = country(JsonField.of(country))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AddressRequest =
                            AddressRequest(
                                line1,
                                line2,
                                locality,
                                region,
                                postalCode,
                                country,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                class PartyType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PartyType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BUSINESS = PartyType(JsonField.of("business"))

                        val INDIVIDUAL = PartyType(JsonField.of("individual"))

                        fun of(value: String) = PartyType(JsonField.of(value))
                    }

                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown PartyType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = RoutingDetail.Builder::class)
                @NoAutoDetect
                class RoutingDetail
                private constructor(
                    private val routingNumber: JsonField<String>,
                    private val routingNumberType: JsonField<RoutingNumberType>,
                    private val paymentType: JsonField<PaymentType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun routingNumber(): String = routingNumber.getRequired("routing_number")

                    fun routingNumberType(): RoutingNumberType =
                        routingNumberType.getRequired("routing_number_type")

                    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber() = routingNumber

                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    fun _routingNumberType() = routingNumberType

                    @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): RoutingDetail = apply {
                        if (!validated) {
                            routingNumber()
                            routingNumberType()
                            paymentType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RoutingDetail &&
                            this.routingNumber == other.routingNumber &&
                            this.routingNumberType == other.routingNumberType &&
                            this.paymentType == other.paymentType &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    routingNumber,
                                    routingNumberType,
                                    paymentType,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: JsonField<String> = JsonMissing.of()
                        private var routingNumberType: JsonField<RoutingNumberType> =
                            JsonMissing.of()
                        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(routingDetail: RoutingDetail) = apply {
                            this.routingNumber = routingDetail.routingNumber
                            this.routingNumberType = routingDetail.routingNumberType
                            this.paymentType = routingDetail.paymentType
                            additionalProperties(routingDetail.additionalProperties)
                        }

                        fun routingNumber(routingNumber: String) =
                            routingNumber(JsonField.of(routingNumber))

                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun routingNumber(routingNumber: JsonField<String>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) =
                            routingNumberType(JsonField.of(routingNumberType))

                        @JsonProperty("routing_number_type")
                        @ExcludeMissing
                        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) =
                            apply {
                                this.routingNumberType = routingNumberType
                            }

                        fun paymentType(paymentType: PaymentType) =
                            paymentType(JsonField.of(paymentType))

                        @JsonProperty("payment_type")
                        @ExcludeMissing
                        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): RoutingDetail =
                            RoutingDetail(
                                routingNumber,
                                routingNumberType,
                                paymentType,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RoutingNumberType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val ABA = RoutingNumberType(JsonField.of("aba"))

                            val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

                            val BR_CODIGO = RoutingNumberType(JsonField.of("br_codigo"))

                            val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

                            val CHIPS = RoutingNumberType(JsonField.of("chips"))

                            val CNAPS = RoutingNumberType(JsonField.of("cnaps"))

                            val DK_INTERBANK_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("dk_interbank_clearing_code"))

                            val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

                            val HK_INTERBANK_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("hk_interbank_clearing_code"))

                            val HU_INTERBANK_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("hu_interbank_clearing_code"))

                            val ID_SKNBI_CODE = RoutingNumberType(JsonField.of("id_sknbi_code"))

                            val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                            val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

                            val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

                            val MX_BANK_IDENTIFIER =
                                RoutingNumberType(JsonField.of("mx_bank_identifier"))

                            val NZ_NATIONAL_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("nz_national_clearing_code"))

                            val PL_NATIONAL_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("pl_national_clearing_code"))

                            val SE_BANKGIRO_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

                            val SWIFT = RoutingNumberType(JsonField.of("swift"))

                            fun of(value: String) = RoutingNumberType(JsonField.of(value))
                        }

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
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                        }

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
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                            _UNKNOWN,
                        }

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
                                IN_IFSC -> Value.IN_IFSC
                                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Value.SWIFT
                                else -> Value._UNKNOWN
                            }

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
                                IN_IFSC -> Known.IN_IFSC
                                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Known.SWIFT
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class PaymentType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PaymentType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val ACH = PaymentType(JsonField.of("ach"))

                            val AU_BECS = PaymentType(JsonField.of("au_becs"))

                            val BACS = PaymentType(JsonField.of("bacs"))

                            val BOOK = PaymentType(JsonField.of("book"))

                            val CARD = PaymentType(JsonField.of("card"))

                            val CHATS = PaymentType(JsonField.of("chats"))

                            val CHECK = PaymentType(JsonField.of("check"))

                            val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                            val DK_NETS = PaymentType(JsonField.of("dk_nets"))

                            val EFT = PaymentType(JsonField.of("eft"))

                            val HU_ICS = PaymentType(JsonField.of("hu_ics"))

                            val INTERAC = PaymentType(JsonField.of("interac"))

                            val MASAV = PaymentType(JsonField.of("masav"))

                            val MX_CCEN = PaymentType(JsonField.of("mx_ccen"))

                            val NEFT = PaymentType(JsonField.of("neft"))

                            val NICS = PaymentType(JsonField.of("nics"))

                            val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                            val PL_ELIXIR = PaymentType(JsonField.of("pl_elixir"))

                            val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                            val RO_SENT = PaymentType(JsonField.of("ro_sent"))

                            val RTP = PaymentType(JsonField.of("rtp"))

                            val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

                            val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                            val SEN = PaymentType(JsonField.of("sen"))

                            val SEPA = PaymentType(JsonField.of("sepa"))

                            val SIC = PaymentType(JsonField.of("sic"))

                            val SIGNET = PaymentType(JsonField.of("signet"))

                            val SKNBI = PaymentType(JsonField.of("sknbi"))

                            val WIRE = PaymentType(JsonField.of("wire"))

                            val ZENGIN = PaymentType(JsonField.of("zengin"))

                            fun of(value: String) = PaymentType(JsonField.of(value))
                        }

                        enum class Known {
                            ACH,
                            AU_BECS,
                            BACS,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SG_GIRO,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SIC,
                            SIGNET,
                            SKNBI,
                            WIRE,
                            ZENGIN,
                        }

                        enum class Value {
                            ACH,
                            AU_BECS,
                            BACS,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SG_GIRO,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SIC,
                            SIGNET,
                            SKNBI,
                            WIRE,
                            ZENGIN,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                ACH -> Value.ACH
                                AU_BECS -> Value.AU_BECS
                                BACS -> Value.BACS
                                BOOK -> Value.BOOK
                                CARD -> Value.CARD
                                CHATS -> Value.CHATS
                                CHECK -> Value.CHECK
                                CROSS_BORDER -> Value.CROSS_BORDER
                                DK_NETS -> Value.DK_NETS
                                EFT -> Value.EFT
                                HU_ICS -> Value.HU_ICS
                                INTERAC -> Value.INTERAC
                                MASAV -> Value.MASAV
                                MX_CCEN -> Value.MX_CCEN
                                NEFT -> Value.NEFT
                                NICS -> Value.NICS
                                NZ_BECS -> Value.NZ_BECS
                                PL_ELIXIR -> Value.PL_ELIXIR
                                PROVXCHANGE -> Value.PROVXCHANGE
                                RO_SENT -> Value.RO_SENT
                                RTP -> Value.RTP
                                SG_GIRO -> Value.SG_GIRO
                                SE_BANKGIROT -> Value.SE_BANKGIROT
                                SEN -> Value.SEN
                                SEPA -> Value.SEPA
                                SIC -> Value.SIC
                                SIGNET -> Value.SIGNET
                                SKNBI -> Value.SKNBI
                                WIRE -> Value.WIRE
                                ZENGIN -> Value.ZENGIN
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                ACH -> Known.ACH
                                AU_BECS -> Known.AU_BECS
                                BACS -> Known.BACS
                                BOOK -> Known.BOOK
                                CARD -> Known.CARD
                                CHATS -> Known.CHATS
                                CHECK -> Known.CHECK
                                CROSS_BORDER -> Known.CROSS_BORDER
                                DK_NETS -> Known.DK_NETS
                                EFT -> Known.EFT
                                HU_ICS -> Known.HU_ICS
                                INTERAC -> Known.INTERAC
                                MASAV -> Known.MASAV
                                MX_CCEN -> Known.MX_CCEN
                                NEFT -> Known.NEFT
                                NICS -> Known.NICS
                                NZ_BECS -> Known.NZ_BECS
                                PL_ELIXIR -> Known.PL_ELIXIR
                                PROVXCHANGE -> Known.PROVXCHANGE
                                RO_SENT -> Known.RO_SENT
                                RTP -> Known.RTP
                                SG_GIRO -> Known.SG_GIRO
                                SE_BANKGIROT -> Known.SE_BANKGIROT
                                SEN -> Known.SEN
                                SEPA -> Known.SEPA
                                SIC -> Known.SIC
                                SIGNET -> Known.SIGNET
                                SKNBI -> Known.SKNBI
                                WIRE -> Known.WIRE
                                ZENGIN -> Known.ZENGIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown PaymentType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
            }
        }

        @JsonDeserialize(builder = ExpectedPaymentCreateRequest.Builder::class)
        @NoAutoDetect
        class ExpectedPaymentCreateRequest
        private constructor(
            private val amountUpperBound: JsonField<Long>,
            private val amountLowerBound: JsonField<Long>,
            private val direction: JsonField<TransactionDirection>,
            private val internalAccountId: JsonField<String>,
            private val type: JsonField<ExpectedPaymentType>,
            private val currency: JsonField<Currency>,
            private val dateUpperBound: JsonField<LocalDate>,
            private val dateLowerBound: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val counterpartyId: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val reconciliationGroups: JsonValue,
            private val reconciliationFilters: JsonValue,
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRuleVariable>>,
            private val lineItems: JsonField<List<LineItemRequest>>,
            private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest>,
            private val ledgerTransactionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(): Long = amountUpperBound.getRequired("amount_upper_bound")

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(): Long = amountLowerBound.getRequired("amount_lower_bound")

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            fun direction(): TransactionDirection = direction.getRequired("direction")

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(): ExpectedPaymentType? = type.getNullable("type")

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            fun currency(): Currency? = currency.getNullable("currency")

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

            /** An optional description for internal use. */
            fun description(): String? = description.getNullable("description")

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /** An array of reconciliation rule variables for this payment. */
            fun reconciliationRuleVariables(): List<ReconciliationRuleVariable>? =
                reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

            fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            fun ledgerTransaction(): LedgerTransactionCreateRequest? =
                ledgerTransaction.getNullable("ledger_transaction")

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            fun ledgerTransactionId(): String? =
                ledgerTransactionId.getNullable("ledger_transaction_id")

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            fun _amountUpperBound() = amountUpperBound

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            fun _amountLowerBound() = amountLowerBound

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId() = internalAccountId

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound") @ExcludeMissing fun _dateUpperBound() = dateUpperBound

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound") @ExcludeMissing fun _dateLowerBound() = dateLowerBound

            /** An optional description for internal use. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor() = statementDescriptor

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            fun _reconciliationGroups() = reconciliationGroups

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            fun _reconciliationFilters() = reconciliationFilters

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            fun _reconciliationRuleVariables() = reconciliationRuleVariables

            @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            fun _ledgerTransaction() = ledgerTransaction

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun _ledgerTransactionId() = ledgerTransactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ExpectedPaymentCreateRequest = apply {
                if (!validated) {
                    amountUpperBound()
                    amountLowerBound()
                    direction()
                    internalAccountId()
                    type()
                    currency()
                    dateUpperBound()
                    dateLowerBound()
                    description()
                    statementDescriptor()
                    metadata()?.validate()
                    counterpartyId()
                    remittanceInformation()
                    reconciliationRuleVariables()?.forEach { it.validate() }
                    lineItems()?.forEach { it.validate() }
                    ledgerTransaction()?.validate()
                    ledgerTransactionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExpectedPaymentCreateRequest &&
                    this.amountUpperBound == other.amountUpperBound &&
                    this.amountLowerBound == other.amountLowerBound &&
                    this.direction == other.direction &&
                    this.internalAccountId == other.internalAccountId &&
                    this.type == other.type &&
                    this.currency == other.currency &&
                    this.dateUpperBound == other.dateUpperBound &&
                    this.dateLowerBound == other.dateLowerBound &&
                    this.description == other.description &&
                    this.statementDescriptor == other.statementDescriptor &&
                    this.metadata == other.metadata &&
                    this.counterpartyId == other.counterpartyId &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.reconciliationGroups == other.reconciliationGroups &&
                    this.reconciliationFilters == other.reconciliationFilters &&
                    this.reconciliationRuleVariables == other.reconciliationRuleVariables &&
                    this.lineItems == other.lineItems &&
                    this.ledgerTransaction == other.ledgerTransaction &&
                    this.ledgerTransactionId == other.ledgerTransactionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amountUpperBound,
                            amountLowerBound,
                            direction,
                            internalAccountId,
                            type,
                            currency,
                            dateUpperBound,
                            dateLowerBound,
                            description,
                            statementDescriptor,
                            metadata,
                            counterpartyId,
                            remittanceInformation,
                            reconciliationGroups,
                            reconciliationFilters,
                            reconciliationRuleVariables,
                            lineItems,
                            ledgerTransaction,
                            ledgerTransactionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ExpectedPaymentCreateRequest{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, reconciliationRuleVariables=$reconciliationRuleVariables, lineItems=$lineItems, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var direction: JsonField<TransactionDirection> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<List<ReconciliationRuleVariable>> =
                    JsonMissing.of()
                private var lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of()
                private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                    JsonMissing.of()
                private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(expectedPaymentCreateRequest: ExpectedPaymentCreateRequest) =
                    apply {
                        this.amountUpperBound = expectedPaymentCreateRequest.amountUpperBound
                        this.amountLowerBound = expectedPaymentCreateRequest.amountLowerBound
                        this.direction = expectedPaymentCreateRequest.direction
                        this.internalAccountId = expectedPaymentCreateRequest.internalAccountId
                        this.type = expectedPaymentCreateRequest.type
                        this.currency = expectedPaymentCreateRequest.currency
                        this.dateUpperBound = expectedPaymentCreateRequest.dateUpperBound
                        this.dateLowerBound = expectedPaymentCreateRequest.dateLowerBound
                        this.description = expectedPaymentCreateRequest.description
                        this.statementDescriptor = expectedPaymentCreateRequest.statementDescriptor
                        this.metadata = expectedPaymentCreateRequest.metadata
                        this.counterpartyId = expectedPaymentCreateRequest.counterpartyId
                        this.remittanceInformation =
                            expectedPaymentCreateRequest.remittanceInformation
                        this.reconciliationGroups =
                            expectedPaymentCreateRequest.reconciliationGroups
                        this.reconciliationFilters =
                            expectedPaymentCreateRequest.reconciliationFilters
                        this.reconciliationRuleVariables =
                            expectedPaymentCreateRequest.reconciliationRuleVariables
                        this.lineItems = expectedPaymentCreateRequest.lineItems
                        this.ledgerTransaction = expectedPaymentCreateRequest.ledgerTransaction
                        this.ledgerTransactionId = expectedPaymentCreateRequest.ledgerTransactionId
                        additionalProperties(expectedPaymentCreateRequest.additionalProperties)
                    }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(JsonField.of(amountUpperBound))

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_upper_bound")
                @ExcludeMissing
                fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(JsonField.of(amountLowerBound))

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_lower_bound")
                @ExcludeMissing
                fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<TransactionDirection>) = apply {
                    this.direction = direction
                }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String) =
                    internalAccountId(JsonField.of(internalAccountId))

                /** The ID of the Internal Account for the expected payment. */
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType) = type(JsonField.of(type))

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate) =
                    dateUpperBound(JsonField.of(dateUpperBound))

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_upper_bound")
                @ExcludeMissing
                fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate) =
                    dateLowerBound(JsonField.of(dateLowerBound))

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_lower_bound")
                @ExcludeMissing
                fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** An optional description for internal use. */
                fun description(description: String) = description(JsonField.of(description))

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String) =
                    statementDescriptor(JsonField.of(statementDescriptor))

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String) =
                    counterpartyId(JsonField.of(counterpartyId))

                /** The ID of the counterparty you expect for this payment. */
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The reconciliation groups you have for this payment. */
                @JsonProperty("reconciliation_groups")
                @ExcludeMissing
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** The reconciliation filters you have for this payment. */
                @JsonProperty("reconciliation_filters")
                @ExcludeMissing
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRuleVariable>
                ) = reconciliationRuleVariables(JsonField.of(reconciliationRuleVariables))

                /** An array of reconciliation rule variables for this payment. */
                @JsonProperty("reconciliation_rule_variables")
                @ExcludeMissing
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: JsonField<List<ReconciliationRuleVariable>>
                ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                @JsonProperty("line_items")
                @ExcludeMissing
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems
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
                 * Specifies a ledger transaction object that will be created with the expected
                 * payment. If the ledger transaction cannot be created, then the expected payment
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the expected payment.
                 */
                @JsonProperty("ledger_transaction")
                @ExcludeMissing
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
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon expected payment creation. Once
                 * the expected payment is created, the status of the ledger transaction tracks the
                 * expected payment automatically.
                 */
                @JsonProperty("ledger_transaction_id")
                @ExcludeMissing
                fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ExpectedPaymentCreateRequest =
                    ExpectedPaymentCreateRequest(
                        amountUpperBound,
                        amountLowerBound,
                        direction,
                        internalAccountId,
                        type,
                        currency,
                        dateUpperBound,
                        dateLowerBound,
                        description,
                        statementDescriptor,
                        metadata,
                        counterpartyId,
                        remittanceInformation,
                        reconciliationGroups,
                        reconciliationFilters,
                        reconciliationRuleVariables.map { it.toUnmodifiable() },
                        lineItems.map { it.toUnmodifiable() },
                        ledgerTransaction,
                        ledgerTransactionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            private constructor(
                private val description: JsonField<String>,
                private val status: JsonField<Status>,
                private val metadata: JsonField<Metadata>,
                private val effectiveAt: JsonField<OffsetDateTime>,
                private val effectiveDate: JsonField<LocalDate>,
                private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>,
                private val externalId: JsonField<String>,
                private val ledgerableType: JsonField<LedgerableType>,
                private val ledgerableId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An optional description for internal use. */
                fun description(): String? = description.getNullable("description")

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(): Status? = status.getNullable("status")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

                /** An array of ledger entry objects. */
                fun ledgerEntries(): List<LedgerEntryCreateRequest> =
                    ledgerEntries.getRequired("ledger_entries")

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(): String? = externalId.getNullable("external_id")

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                fun ledgerableType(): LedgerableType? =
                    ledgerableType.getNullable("ledgerable_type")

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

                /** An optional description for internal use. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                fun _ledgerableType() = ledgerableType

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id") @ExcludeMissing fun _ledgerableId() = ledgerableId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LedgerTransactionCreateRequest = apply {
                    if (!validated) {
                        description()
                        status()
                        metadata()?.validate()
                        effectiveAt()
                        effectiveDate()
                        ledgerEntries().forEach { it.validate() }
                        externalId()
                        ledgerableType()
                        ledgerableId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerTransactionCreateRequest &&
                        this.description == other.description &&
                        this.status == other.status &&
                        this.metadata == other.metadata &&
                        this.effectiveAt == other.effectiveAt &&
                        this.effectiveDate == other.effectiveDate &&
                        this.ledgerEntries == other.ledgerEntries &&
                        this.externalId == other.externalId &&
                        this.ledgerableType == other.ledgerableType &&
                        this.ledgerableId == other.ledgerableId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                description,
                                status,
                                metadata,
                                effectiveAt,
                                effectiveDate,
                                ledgerEntries,
                                externalId,
                                ledgerableType,
                                ledgerableId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var description: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                    private var ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> =
                        JsonMissing.of()
                    private var externalId: JsonField<String> = JsonMissing.of()
                    private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                    private var ledgerableId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        this.description = ledgerTransactionCreateRequest.description
                        this.status = ledgerTransactionCreateRequest.status
                        this.metadata = ledgerTransactionCreateRequest.metadata
                        this.effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        this.effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        this.ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries
                        this.externalId = ledgerTransactionCreateRequest.externalId
                        this.ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        this.ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        additionalProperties(ledgerTransactionCreateRequest.additionalProperties)
                    }

                    /** An optional description for internal use. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** An optional description for internal use. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /** To post a ledger transaction at creation, use `posted`. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    @JsonProperty("effective_at")
                    @ExcludeMissing
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: LocalDate) =
                        effectiveDate(JsonField.of(effectiveDate))

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    @JsonProperty("effective_date")
                    @ExcludeMissing
                    fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                        ledgerEntries(JsonField.of(ledgerEntries))

                    /** An array of ledger entry objects. */
                    @JsonProperty("ledger_entries")
                    @ExcludeMissing
                    fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                        apply {
                            this.ledgerEntries = ledgerEntries
                        }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    @JsonProperty("external_id")
                    @ExcludeMissing
                    fun externalId(externalId: JsonField<String>) = apply {
                        this.externalId = externalId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, or
                     * reversal.
                     */
                    fun ledgerableType(ledgerableType: LedgerableType) =
                        ledgerableType(JsonField.of(ledgerableType))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, or
                     * reversal.
                     */
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: String) =
                        ledgerableId(JsonField.of(ledgerableId))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LedgerTransactionCreateRequest =
                        LedgerTransactionCreateRequest(
                            description,
                            status,
                            metadata,
                            effectiveAt,
                            effectiveDate,
                            ledgerEntries.map { it.toUnmodifiable() },
                            externalId,
                            ledgerableType,
                            ledgerableId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerEntryCreateRequest
                private constructor(
                    private val amount: JsonField<Long>,
                    private val direction: JsonField<TransactionDirection>,
                    private val ledgerAccountId: JsonField<String>,
                    private val lockVersion: JsonField<Long>,
                    private val pendingBalanceAmount: JsonField<PendingBalanceAmount>,
                    private val postedBalanceAmount: JsonField<PostedBalanceAmount>,
                    private val availableBalanceAmount: JsonField<AvailableBalanceAmount>,
                    private val showResultingLedgerAccountBalances: JsonField<Boolean>,
                    private val metadata: JsonField<Metadata>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(): TransactionDirection = direction.getRequired("direction")

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(): Long? = lockVersion.getNullable("lock_version")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(): PendingBalanceAmount? =
                        pendingBalanceAmount.getNullable("pending_balance_amount")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(): PostedBalanceAmount? =
                        postedBalanceAmount.getNullable("posted_balance_amount")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(): AvailableBalanceAmount? =
                        availableBalanceAmount.getNullable("available_balance_amount")

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(): Boolean? =
                        showResultingLedgerAccountBalances.getNullable(
                            "show_resulting_ledger_account_balances"
                        )

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Metadata? = metadata.getNullable("metadata")

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    fun _ledgerAccountId() = ledgerAccountId

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version") @ExcludeMissing fun _lockVersion() = lockVersion

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    fun _pendingBalanceAmount() = pendingBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    fun _postedBalanceAmount() = postedBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    fun _availableBalanceAmount() = availableBalanceAmount

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    fun _showResultingLedgerAccountBalances() = showResultingLedgerAccountBalances

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): LedgerEntryCreateRequest = apply {
                        if (!validated) {
                            amount()
                            direction()
                            ledgerAccountId()
                            lockVersion()
                            pendingBalanceAmount()?.validate()
                            postedBalanceAmount()?.validate()
                            availableBalanceAmount()?.validate()
                            showResultingLedgerAccountBalances()
                            metadata()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LedgerEntryCreateRequest &&
                            this.amount == other.amount &&
                            this.direction == other.direction &&
                            this.ledgerAccountId == other.ledgerAccountId &&
                            this.lockVersion == other.lockVersion &&
                            this.pendingBalanceAmount == other.pendingBalanceAmount &&
                            this.postedBalanceAmount == other.postedBalanceAmount &&
                            this.availableBalanceAmount == other.availableBalanceAmount &&
                            this.showResultingLedgerAccountBalances ==
                                other.showResultingLedgerAccountBalances &&
                            this.metadata == other.metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    amount,
                                    direction,
                                    ledgerAccountId,
                                    lockVersion,
                                    pendingBalanceAmount,
                                    postedBalanceAmount,
                                    availableBalanceAmount,
                                    showResultingLedgerAccountBalances,
                                    metadata,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: JsonField<Long> = JsonMissing.of()
                        private var direction: JsonField<TransactionDirection> = JsonMissing.of()
                        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
                        private var lockVersion: JsonField<Long> = JsonMissing.of()
                        private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                            JsonMissing.of()
                        private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                            JsonMissing.of()
                        private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                            JsonMissing.of()
                        private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                            JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                this.amount = ledgerEntryCreateRequest.amount
                                this.direction = ledgerEntryCreateRequest.direction
                                this.ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                this.lockVersion = ledgerEntryCreateRequest.lockVersion
                                this.pendingBalanceAmount =
                                    ledgerEntryCreateRequest.pendingBalanceAmount
                                this.postedBalanceAmount =
                                    ledgerEntryCreateRequest.postedBalanceAmount
                                this.availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                this.showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                this.metadata = ledgerEntryCreateRequest.metadata
                                additionalProperties(ledgerEntryCreateRequest.additionalProperties)
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: TransactionDirection) =
                            direction(JsonField.of(direction))

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        @JsonProperty("direction")
                        @ExcludeMissing
                        fun direction(direction: JsonField<TransactionDirection>) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: String) =
                            ledgerAccountId(JsonField.of(ledgerAccountId))

                        /** The ledger account that this ledger entry is associated with. */
                        @JsonProperty("ledger_account_id")
                        @ExcludeMissing
                        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long) = lockVersion(JsonField.of(lockVersion))

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        @JsonProperty("lock_version")
                        @ExcludeMissing
                        fun lockVersion(lockVersion: JsonField<Long>) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) =
                            pendingBalanceAmount(JsonField.of(pendingBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("pending_balance_amount")
                        @ExcludeMissing
                        fun pendingBalanceAmount(
                            pendingBalanceAmount: JsonField<PendingBalanceAmount>
                        ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) =
                            postedBalanceAmount(JsonField.of(postedBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("posted_balance_amount")
                        @ExcludeMissing
                        fun postedBalanceAmount(
                            postedBalanceAmount: JsonField<PostedBalanceAmount>
                        ) = apply { this.postedBalanceAmount = postedBalanceAmount }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                            availableBalanceAmount(JsonField.of(availableBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        @JsonProperty("available_balance_amount")
                        @ExcludeMissing
                        fun availableBalanceAmount(
                            availableBalanceAmount: JsonField<AvailableBalanceAmount>
                        ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) =
                            showResultingLedgerAccountBalances(
                                JsonField.of(showResultingLedgerAccountBalances)
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        @JsonProperty("show_resulting_ledger_account_balances")
                        @ExcludeMissing
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: JsonField<Boolean>
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): LedgerEntryCreateRequest =
                            LedgerEntryCreateRequest(
                                amount,
                                direction,
                                ledgerAccountId,
                                lockVersion,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                availableBalanceAmount,
                                showResultingLedgerAccountBalances,
                                metadata,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): AvailableBalanceAmount = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is AvailableBalanceAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(availableBalanceAmount: AvailableBalanceAmount) =
                                apply {
                                    additionalProperties(
                                        availableBalanceAmount.additionalProperties
                                    )
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): AvailableBalanceAmount =
                                AvailableBalanceAmount(additionalProperties.toUnmodifiable())
                        }
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Metadata = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Metadata &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties(metadata.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                        }
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PendingBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PendingBalanceAmount = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PendingBalanceAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PendingBalanceAmount{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                                additionalProperties(pendingBalanceAmount.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PendingBalanceAmount =
                                PendingBalanceAmount(additionalProperties.toUnmodifiable())
                        }
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PostedBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PostedBalanceAmount = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PostedBalanceAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PostedBalanceAmount{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                                additionalProperties(postedBalanceAmount.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PostedBalanceAmount =
                                PostedBalanceAmount(additionalProperties.toUnmodifiable())
                        }
                    }
                }

                class LedgerableType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LedgerableType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                        val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

                        val INCOMING_PAYMENT_DETAIL =
                            LedgerableType(JsonField.of("incoming_payment_detail"))

                        val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                        val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

                        val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

                        val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

                        val PAYMENT_ORDER_ATTEMPT =
                            LedgerableType(JsonField.of("payment_order_attempt"))

                        val RETURN = LedgerableType(JsonField.of("return"))

                        val REVERSAL = LedgerableType(JsonField.of("reversal"))

                        fun of(value: String) = LedgerableType(JsonField.of(value))
                    }

                    enum class Known {
                        COUNTERPARTY,
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        INTERNAL_ACCOUNT,
                        LINE_ITEM,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        PAYMENT_ORDER_ATTEMPT,
                        RETURN,
                        REVERSAL,
                    }

                    enum class Value {
                        COUNTERPARTY,
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        INTERNAL_ACCOUNT,
                        LINE_ITEM,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        PAYMENT_ORDER_ATTEMPT,
                        RETURN,
                        REVERSAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            COUNTERPARTY -> Value.COUNTERPARTY
                            EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                            INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                            INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                            LINE_ITEM -> Value.LINE_ITEM
                            PAPER_ITEM -> Value.PAPER_ITEM
                            PAYMENT_ORDER -> Value.PAYMENT_ORDER
                            PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                            RETURN -> Value.RETURN
                            REVERSAL -> Value.REVERSAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            COUNTERPARTY -> Known.COUNTERPARTY
                            EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                            INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                            INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                            LINE_ITEM -> Known.LINE_ITEM
                            PAPER_ITEM -> Known.PAPER_ITEM
                            PAYMENT_ORDER -> Known.PAYMENT_ORDER
                            PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                            RETURN -> Known.RETURN
                            REVERSAL -> Known.REVERSAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LedgerableType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }

                class Status
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Status && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ARCHIVED = Status(JsonField.of("archived"))

                        val PENDING = Status(JsonField.of("pending"))

                        val POSTED = Status(JsonField.of("posted"))

                        fun of(value: String) = Status(JsonField.of(value))
                    }

                    enum class Known {
                        ARCHIVED,
                        PENDING,
                        POSTED,
                    }

                    enum class Value {
                        ARCHIVED,
                        PENDING,
                        POSTED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ARCHIVED -> Value.ARCHIVED
                            PENDING -> Value.PENDING
                            POSTED -> Value.POSTED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ARCHIVED -> Known.ARCHIVED
                            PENDING -> Known.PENDING
                            POSTED -> Known.POSTED
                            else ->
                                throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = LineItemRequest.Builder::class)
            @NoAutoDetect
            class LineItemRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val metadata: JsonField<Metadata>,
                private val description: JsonField<String>,
                private val accountingCategoryId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /** A free-form description of the line item. */
                fun description(): String? = description.getNullable("description")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(): String? =
                    accountingCategoryId.getNullable("accounting_category_id")

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /** A free-form description of the line item. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId() = accountingCategoryId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LineItemRequest = apply {
                    if (!validated) {
                        amount()
                        metadata()?.validate()
                        description()
                        accountingCategoryId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LineItemRequest &&
                        this.amount == other.amount &&
                        this.metadata == other.metadata &&
                        this.description == other.description &&
                        this.accountingCategoryId == other.accountingCategoryId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                metadata,
                                description,
                                accountingCategoryId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        this.amount = lineItemRequest.amount
                        this.metadata = lineItemRequest.metadata
                        this.description = lineItemRequest.description
                        this.accountingCategoryId = lineItemRequest.accountingCategoryId
                        additionalProperties(lineItemRequest.additionalProperties)
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** A free-form description of the line item. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** A free-form description of the line item. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String) =
                        accountingCategoryId(JsonField.of(accountingCategoryId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("accounting_category_id")
                    @ExcludeMissing
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            amount,
                            metadata,
                            description,
                            accountingCategoryId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            @JsonDeserialize(builder = ReconciliationRuleVariable.Builder::class)
            @NoAutoDetect
            class ReconciliationRuleVariable
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ReconciliationRuleVariable = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReconciliationRuleVariable &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "ReconciliationRuleVariable{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(reconciliationRuleVariable: ReconciliationRuleVariable) =
                        apply {
                            additionalProperties(reconciliationRuleVariable.additionalProperties)
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ReconciliationRuleVariable =
                        ReconciliationRuleVariable(additionalProperties.toUnmodifiable())
                }
            }
        }

        @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerTransactionCreateRequest
        private constructor(
            private val description: JsonField<String>,
            private val status: JsonField<Status>,
            private val metadata: JsonField<Metadata>,
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val effectiveDate: JsonField<LocalDate>,
            private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>,
            private val externalId: JsonField<String>,
            private val ledgerableType: JsonField<LedgerableType>,
            private val ledgerableId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** An optional description for internal use. */
            fun description(): String? = description.getNullable("description")

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(): Status? = status.getNullable("status")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

            /** An array of ledger entry objects. */
            fun ledgerEntries(): List<LedgerEntryCreateRequest> =
                ledgerEntries.getRequired("ledger_entries")

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            fun externalId(): String? = externalId.getNullable("external_id")

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, or reversal.
             */
            fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

            /** An optional description for internal use. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") @ExcludeMissing fun _status() = status

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, or reversal.
             */
            @JsonProperty("ledgerable_type") @ExcludeMissing fun _ledgerableType() = ledgerableType

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id") @ExcludeMissing fun _ledgerableId() = ledgerableId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LedgerTransactionCreateRequest = apply {
                if (!validated) {
                    description()
                    status()
                    metadata()?.validate()
                    effectiveAt()
                    effectiveDate()
                    ledgerEntries().forEach { it.validate() }
                    externalId()
                    ledgerableType()
                    ledgerableId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerTransactionCreateRequest &&
                    this.description == other.description &&
                    this.status == other.status &&
                    this.metadata == other.metadata &&
                    this.effectiveAt == other.effectiveAt &&
                    this.effectiveDate == other.effectiveDate &&
                    this.ledgerEntries == other.ledgerEntries &&
                    this.externalId == other.externalId &&
                    this.ledgerableType == other.ledgerableType &&
                    this.ledgerableId == other.ledgerableId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            description,
                            status,
                            metadata,
                            effectiveAt,
                            effectiveDate,
                            ledgerEntries,
                            externalId,
                            ledgerableType,
                            ledgerableId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var description: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> =
                    JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                private var ledgerableId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                    apply {
                        this.description = ledgerTransactionCreateRequest.description
                        this.status = ledgerTransactionCreateRequest.status
                        this.metadata = ledgerTransactionCreateRequest.metadata
                        this.effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        this.effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        this.ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries
                        this.externalId = ledgerTransactionCreateRequest.externalId
                        this.ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        this.ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        additionalProperties(ledgerTransactionCreateRequest.additionalProperties)
                    }

                /** An optional description for internal use. */
                fun description(description: String) = description(JsonField.of(description))

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status) = status(JsonField.of(status))

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                @ExcludeMissing
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date")
                @ExcludeMissing
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                    apply {
                        this.ledgerEntries = ledgerEntries
                    }

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id")
                @ExcludeMissing
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) =
                    ledgerableType(JsonField.of(ledgerableType))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, or reversal.
                 */
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                @ExcludeMissing
                fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                    this.ledgerableId = ledgerableId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerTransactionCreateRequest =
                    LedgerTransactionCreateRequest(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        effectiveDate,
                        ledgerEntries.map { it.toUnmodifiable() },
                        externalId,
                        ledgerableType,
                        ledgerableId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerEntryCreateRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val direction: JsonField<TransactionDirection>,
                private val ledgerAccountId: JsonField<String>,
                private val lockVersion: JsonField<Long>,
                private val pendingBalanceAmount: JsonField<PendingBalanceAmount>,
                private val postedBalanceAmount: JsonField<PostedBalanceAmount>,
                private val availableBalanceAmount: JsonField<AvailableBalanceAmount>,
                private val showResultingLedgerAccountBalances: JsonField<Boolean>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(): TransactionDirection = direction.getRequired("direction")

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(): Long? = lockVersion.getNullable("lock_version")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(): PendingBalanceAmount? =
                    pendingBalanceAmount.getNullable("pending_balance_amount")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(): PostedBalanceAmount? =
                    postedBalanceAmount.getNullable("posted_balance_amount")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(): AvailableBalanceAmount? =
                    availableBalanceAmount.getNullable("available_balance_amount")

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(): Boolean? =
                    showResultingLedgerAccountBalances.getNullable(
                        "show_resulting_ledger_account_balances"
                    )

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                fun _ledgerAccountId() = ledgerAccountId

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version") @ExcludeMissing fun _lockVersion() = lockVersion

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                @ExcludeMissing
                fun _pendingBalanceAmount() = pendingBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                @ExcludeMissing
                fun _postedBalanceAmount() = postedBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                @ExcludeMissing
                fun _availableBalanceAmount() = availableBalanceAmount

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                @ExcludeMissing
                fun _showResultingLedgerAccountBalances() = showResultingLedgerAccountBalances

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LedgerEntryCreateRequest = apply {
                    if (!validated) {
                        amount()
                        direction()
                        ledgerAccountId()
                        lockVersion()
                        pendingBalanceAmount()?.validate()
                        postedBalanceAmount()?.validate()
                        availableBalanceAmount()?.validate()
                        showResultingLedgerAccountBalances()
                        metadata()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerEntryCreateRequest &&
                        this.amount == other.amount &&
                        this.direction == other.direction &&
                        this.ledgerAccountId == other.ledgerAccountId &&
                        this.lockVersion == other.lockVersion &&
                        this.pendingBalanceAmount == other.pendingBalanceAmount &&
                        this.postedBalanceAmount == other.postedBalanceAmount &&
                        this.availableBalanceAmount == other.availableBalanceAmount &&
                        this.showResultingLedgerAccountBalances ==
                            other.showResultingLedgerAccountBalances &&
                        this.metadata == other.metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                direction,
                                ledgerAccountId,
                                lockVersion,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                availableBalanceAmount,
                                showResultingLedgerAccountBalances,
                                metadata,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var direction: JsonField<TransactionDirection> = JsonMissing.of()
                    private var ledgerAccountId: JsonField<String> = JsonMissing.of()
                    private var lockVersion: JsonField<Long> = JsonMissing.of()
                    private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                        JsonMissing.of()
                    private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                        JsonMissing.of()
                    private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                        JsonMissing.of()
                    private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        this.amount = ledgerEntryCreateRequest.amount
                        this.direction = ledgerEntryCreateRequest.direction
                        this.ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        this.lockVersion = ledgerEntryCreateRequest.lockVersion
                        this.pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        this.postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        this.availableBalanceAmount =
                            ledgerEntryCreateRequest.availableBalanceAmount
                        this.showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        this.metadata = ledgerEntryCreateRequest.metadata
                        additionalProperties(ledgerEntryCreateRequest.additionalProperties)
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: TransactionDirection) =
                        direction(JsonField.of(direction))

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun direction(direction: JsonField<TransactionDirection>) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: String) =
                        ledgerAccountId(JsonField.of(ledgerAccountId))

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long) = lockVersion(JsonField.of(lockVersion))

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    @ExcludeMissing
                    fun lockVersion(lockVersion: JsonField<Long>) = apply {
                        this.lockVersion = lockVersion
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) =
                        pendingBalanceAmount(JsonField.of(pendingBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    fun pendingBalanceAmount(
                        pendingBalanceAmount: JsonField<PendingBalanceAmount>
                    ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) =
                        postedBalanceAmount(JsonField.of(postedBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    fun postedBalanceAmount(postedBalanceAmount: JsonField<PostedBalanceAmount>) =
                        apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                        availableBalanceAmount(JsonField.of(availableBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    fun availableBalanceAmount(
                        availableBalanceAmount: JsonField<AvailableBalanceAmount>
                    ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) =
                        showResultingLedgerAccountBalances(
                            JsonField.of(showResultingLedgerAccountBalances)
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: JsonField<Boolean>
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LedgerEntryCreateRequest =
                        LedgerEntryCreateRequest(
                            amount,
                            direction,
                            ledgerAccountId,
                            lockVersion,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            availableBalanceAmount,
                            showResultingLedgerAccountBalances,
                            metadata,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                @NoAutoDetect
                class AvailableBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AvailableBalanceAmount = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AvailableBalanceAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AvailableBalanceAmount{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                            additionalProperties(availableBalanceAmount.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AvailableBalanceAmount =
                            AvailableBalanceAmount(additionalProperties.toUnmodifiable())
                    }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                @NoAutoDetect
                class PendingBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PendingBalanceAmount = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PendingBalanceAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PendingBalanceAmount{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                            additionalProperties(pendingBalanceAmount.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PendingBalanceAmount =
                            PendingBalanceAmount(additionalProperties.toUnmodifiable())
                    }
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                @NoAutoDetect
                class PostedBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PostedBalanceAmount = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PostedBalanceAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PostedBalanceAmount{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                            additionalProperties(postedBalanceAmount.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PostedBalanceAmount =
                            PostedBalanceAmount(additionalProperties.toUnmodifiable())
                    }
                }
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerableType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                    val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

                    val INCOMING_PAYMENT_DETAIL =
                        LedgerableType(JsonField.of("incoming_payment_detail"))

                    val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                    val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

                    val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

                    val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

                    val PAYMENT_ORDER_ATTEMPT =
                        LedgerableType(JsonField.of("payment_order_attempt"))

                    val RETURN = LedgerableType(JsonField.of("return"))

                    val REVERSAL = LedgerableType(JsonField.of("reversal"))

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    COUNTERPARTY,
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    INTERNAL_ACCOUNT,
                    LINE_ITEM,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    PAYMENT_ORDER_ATTEMPT,
                    RETURN,
                    REVERSAL,
                }

                enum class Value {
                    COUNTERPARTY,
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    INTERNAL_ACCOUNT,
                    LINE_ITEM,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    PAYMENT_ORDER_ATTEMPT,
                    RETURN,
                    REVERSAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        COUNTERPARTY -> Value.COUNTERPARTY
                        EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                        INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        LINE_ITEM -> Value.LINE_ITEM
                        PAPER_ITEM -> Value.PAPER_ITEM
                        PAYMENT_ORDER -> Value.PAYMENT_ORDER
                        PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                        RETURN -> Value.RETURN
                        REVERSAL -> Value.REVERSAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        COUNTERPARTY -> Known.COUNTERPARTY
                        EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                        INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        LINE_ITEM -> Known.LINE_ITEM
                        PAPER_ITEM -> Known.PAPER_ITEM
                        PAYMENT_ORDER -> Known.PAYMENT_ORDER
                        PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                        RETURN -> Known.RETURN
                        REVERSAL -> Known.REVERSAL
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Status && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ARCHIVED = Status(JsonField.of("archived"))

                    val PENDING = Status(JsonField.of("pending"))

                    val POSTED = Status(JsonField.of("posted"))

                    fun of(value: String) = Status(JsonField.of(value))
                }

                enum class Known {
                    ARCHIVED,
                    PENDING,
                    POSTED,
                }

                enum class Value {
                    ARCHIVED,
                    PENDING,
                    POSTED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ARCHIVED -> Value.ARCHIVED
                        PENDING -> Value.PENDING
                        POSTED -> Value.POSTED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ARCHIVED -> Known.ARCHIVED
                        PENDING -> Known.PENDING
                        POSTED -> Known.POSTED
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = TransactionCreateRequest.Builder::class)
        @NoAutoDetect
        class TransactionCreateRequest
        private constructor(
            private val amount: JsonField<Long>,
            private val direction: JsonField<String>,
            private val vendorDescription: JsonField<String>,
            private val vendorCode: JsonField<String>,
            private val vendorCodeType: JsonField<String>,
            private val asOfDate: JsonField<LocalDate>,
            private val internalAccountId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val posted: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** Either `credit` or `debit`. */
            fun direction(): String = direction.getRequired("direction")

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(): String? = vendorDescription.getNullable("vendor_description")

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(): String = vendorCode.getRequired("vendor_code")

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            fun vendorCodeType(): String = vendorCodeType.getRequired("vendor_code_type")

            /** The date on which the transaction occurred. */
            fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

            /** The ID of the relevant Internal Account. */
            fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(): Boolean? = posted.getNullable("posted")

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** Either `credit` or `debit`. */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            @JsonProperty("vendor_description")
            @ExcludeMissing
            fun _vendorDescription() = vendorDescription

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            @JsonProperty("vendor_code") @ExcludeMissing fun _vendorCode() = vendorCode

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            @JsonProperty("vendor_code_type") @ExcludeMissing fun _vendorCodeType() = vendorCodeType

            /** The date on which the transaction occurred. */
            @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate() = asOfDate

            /** The ID of the relevant Internal Account. */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId() = internalAccountId

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** This field will be `true` if the transaction has posted to the account. */
            @JsonProperty("posted") @ExcludeMissing fun _posted() = posted

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TransactionCreateRequest = apply {
                if (!validated) {
                    amount()
                    direction()
                    vendorDescription()
                    vendorCode()
                    vendorCodeType()
                    asOfDate()
                    internalAccountId()
                    metadata()?.validate()
                    posted()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TransactionCreateRequest &&
                    this.amount == other.amount &&
                    this.direction == other.direction &&
                    this.vendorDescription == other.vendorDescription &&
                    this.vendorCode == other.vendorCode &&
                    this.vendorCodeType == other.vendorCodeType &&
                    this.asOfDate == other.asOfDate &&
                    this.internalAccountId == other.internalAccountId &&
                    this.metadata == other.metadata &&
                    this.posted == other.posted &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            direction,
                            vendorDescription,
                            vendorCode,
                            vendorCodeType,
                            asOfDate,
                            internalAccountId,
                            metadata,
                            posted,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "TransactionCreateRequest{amount=$amount, direction=$direction, vendorDescription=$vendorDescription, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, asOfDate=$asOfDate, internalAccountId=$internalAccountId, metadata=$metadata, posted=$posted, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var direction: JsonField<String> = JsonMissing.of()
                private var vendorDescription: JsonField<String> = JsonMissing.of()
                private var vendorCode: JsonField<String> = JsonMissing.of()
                private var vendorCodeType: JsonField<String> = JsonMissing.of()
                private var asOfDate: JsonField<LocalDate> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var posted: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transactionCreateRequest: TransactionCreateRequest) = apply {
                    this.amount = transactionCreateRequest.amount
                    this.direction = transactionCreateRequest.direction
                    this.vendorDescription = transactionCreateRequest.vendorDescription
                    this.vendorCode = transactionCreateRequest.vendorCode
                    this.vendorCodeType = transactionCreateRequest.vendorCodeType
                    this.asOfDate = transactionCreateRequest.asOfDate
                    this.internalAccountId = transactionCreateRequest.internalAccountId
                    this.metadata = transactionCreateRequest.metadata
                    this.posted = transactionCreateRequest.posted
                    additionalProperties(transactionCreateRequest.additionalProperties)
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** Either `credit` or `debit`. */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /** Either `credit` or `debit`. */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                fun vendorDescription(vendorDescription: String) =
                    vendorDescription(JsonField.of(vendorDescription))

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                @JsonProperty("vendor_description")
                @ExcludeMissing
                fun vendorDescription(vendorDescription: JsonField<String>) = apply {
                    this.vendorDescription = vendorDescription
                }

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                fun vendorCode(vendorCode: String) = vendorCode(JsonField.of(vendorCode))

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                @JsonProperty("vendor_code")
                @ExcludeMissing
                fun vendorCode(vendorCode: JsonField<String>) = apply {
                    this.vendorCode = vendorCode
                }

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                fun vendorCodeType(vendorCodeType: String) =
                    vendorCodeType(JsonField.of(vendorCodeType))

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                @JsonProperty("vendor_code_type")
                @ExcludeMissing
                fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                    this.vendorCodeType = vendorCodeType
                }

                /** The date on which the transaction occurred. */
                fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

                /** The date on which the transaction occurred. */
                @JsonProperty("as_of_date")
                @ExcludeMissing
                fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

                /** The ID of the relevant Internal Account. */
                fun internalAccountId(internalAccountId: String) =
                    internalAccountId(JsonField.of(internalAccountId))

                /** The ID of the relevant Internal Account. */
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** This field will be `true` if the transaction has posted to the account. */
                fun posted(posted: Boolean) = posted(JsonField.of(posted))

                /** This field will be `true` if the transaction has posted to the account. */
                @JsonProperty("posted")
                @ExcludeMissing
                fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TransactionCreateRequest =
                    TransactionCreateRequest(
                        amount,
                        direction,
                        vendorDescription,
                        vendorCode,
                        vendorCodeType,
                        asOfDate,
                        internalAccountId,
                        metadata,
                        posted,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }
        }

        @JsonDeserialize(builder = Id.Builder::class)
        @NoAutoDetect
        class Id
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String? = id.getNullable("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Id = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Id &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Id{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(id: Id) = apply {
                    this.id = id.id
                    additionalProperties(id.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Id = Id(id, additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = PaymentOrderUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class PaymentOrderUpdateRequestWithId
        private constructor(
            private val type: JsonField<PaymentOrderType>,
            private val subtype: JsonField<PaymentOrderSubtype>,
            private val amount: JsonField<Long>,
            private val direction: JsonField<Direction>,
            private val priority: JsonField<Priority>,
            private val originatingAccountId: JsonField<String>,
            private val receivingAccountId: JsonField<String>,
            private val accounting: JsonField<Accounting>,
            private val accountingCategoryId: JsonField<String>,
            private val accountingLedgerClassId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val effectiveDate: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val processAfter: JsonField<OffsetDateTime>,
            private val purpose: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val chargeBearer: JsonField<ChargeBearer>,
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
            private val foreignExchangeContract: JsonField<String>,
            private val nsfProtected: JsonField<Boolean>,
            private val originatingPartyName: JsonField<String>,
            private val ultimateOriginatingPartyName: JsonField<String>,
            private val ultimateOriginatingPartyIdentifier: JsonField<String>,
            private val ultimateReceivingPartyName: JsonField<String>,
            private val ultimateReceivingPartyIdentifier: JsonField<String>,
            private val sendRemittanceAdvice: JsonField<Boolean>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val counterpartyId: JsonField<String>,
            private val fallbackType: JsonField<FallbackType>,
            private val receivingAccount: JsonField<ReceivingAccount>,
            private val lineItems: JsonField<List<LineItemRequest>>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(): PaymentOrderType? = type.getNullable("type")

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(): PaymentOrderSubtype? = subtype.getNullable("subtype")

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(): Direction? = direction.getNullable("direction")

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(): Priority? = priority.getNullable("priority")

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(): String? =
                originatingAccountId.getNullable("originating_account_id")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(): String? =
                receivingAccountId.getNullable("receiving_account_id")

            fun accounting(): Accounting? = accounting.getNullable("accounting")

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(): String? =
                accountingCategoryId.getNullable("accounting_category_id")

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            fun accountingLedgerClassId(): String? =
                accountingLedgerClassId.getNullable("accounting_ledger_class_id")

            /** Defaults to the currency of the originating account. */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

            /** An optional description for internal use. */
            fun description(): String? = description.getNullable("description")

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(): OffsetDateTime? = processAfter.getNullable("process_after")

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud, this is
             * the `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that
             * will be attached to the payment.
             */
            fun purpose(): String? = purpose.getNullable("purpose")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            fun chargeBearer(): ChargeBearer? = chargeBearer.getNullable("charge_bearer")

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
                foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(): String? =
                foreignExchangeContract.getNullable("foreign_exchange_contract")

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(): Boolean? = nsfProtected.getNullable("nsf_protected")

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(): String? =
                originatingPartyName.getNullable("originating_party_name")

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyName(): String? =
                ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyIdentifier(): String? =
                ultimateOriginatingPartyIdentifier.getNullable(
                    "ultimate_originating_party_identifier"
                )

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyName(): String? =
                ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyIdentifier(): String? =
                ultimateReceivingPartyIdentifier.getNullable("ultimate_receiving_party_identifier")

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(): Boolean? =
                sendRemittanceAdvice.getNullable("send_remittance_advice")

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            fun status(): Status? = status.getNullable("status")

            /** Required when receiving_account_id is passed the ID of an external account. */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(): FallbackType? = fallbackType.getNullable("fallback_type")

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(): ReceivingAccount? =
                receivingAccount.getNullable("receiving_account")

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

            fun id(): String? = id.getNullable("id")

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId() = originatingAccountId

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId() = receivingAccountId

            @JsonProperty("accounting") @ExcludeMissing fun _accounting() = accounting

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            fun _accountingCategoryId() = accountingCategoryId

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            fun _accountingLedgerClassId() = accountingLedgerClassId

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

            /** An optional description for internal use. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor() = statementDescriptor

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after") @ExcludeMissing fun _processAfter() = processAfter

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud, this is
             * the `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that
             * will be attached to the payment.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose() = purpose

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer") @ExcludeMissing fun _chargeBearer() = chargeBearer

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator() = foreignExchangeIndicator

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            fun _foreignExchangeContract() = foreignExchangeContract

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected") @ExcludeMissing fun _nsfProtected() = nsfProtected

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            fun _originatingPartyName() = originatingPartyName

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            fun _ultimateOriginatingPartyName() = ultimateOriginatingPartyName

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            fun _ultimateOriginatingPartyIdentifier() = ultimateOriginatingPartyIdentifier

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            fun _ultimateReceivingPartyName() = ultimateReceivingPartyName

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            fun _ultimateReceivingPartyIdentifier() = ultimateReceivingPartyIdentifier

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            fun _sendRemittanceAdvice() = sendRemittanceAdvice

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            @JsonProperty("status") @ExcludeMissing fun _status() = status

            /** Required when receiving_account_id is passed the ID of an external account. */
            @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type") @ExcludeMissing fun _fallbackType() = fallbackType

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            @ExcludeMissing
            fun _receivingAccount() = receivingAccount

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PaymentOrderUpdateRequestWithId = apply {
                if (!validated) {
                    type()
                    subtype()
                    amount()
                    direction()
                    priority()
                    originatingAccountId()
                    receivingAccountId()
                    accounting()?.validate()
                    accountingCategoryId()
                    accountingLedgerClassId()
                    currency()
                    effectiveDate()
                    description()
                    statementDescriptor()
                    remittanceInformation()
                    processAfter()
                    purpose()
                    metadata()?.validate()
                    chargeBearer()
                    foreignExchangeIndicator()
                    foreignExchangeContract()
                    nsfProtected()
                    originatingPartyName()
                    ultimateOriginatingPartyName()
                    ultimateOriginatingPartyIdentifier()
                    ultimateReceivingPartyName()
                    ultimateReceivingPartyIdentifier()
                    sendRemittanceAdvice()
                    expiresAt()
                    status()
                    counterpartyId()
                    fallbackType()
                    receivingAccount()?.validate()
                    lineItems()?.forEach { it.validate() }
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentOrderUpdateRequestWithId &&
                    this.type == other.type &&
                    this.subtype == other.subtype &&
                    this.amount == other.amount &&
                    this.direction == other.direction &&
                    this.priority == other.priority &&
                    this.originatingAccountId == other.originatingAccountId &&
                    this.receivingAccountId == other.receivingAccountId &&
                    this.accounting == other.accounting &&
                    this.accountingCategoryId == other.accountingCategoryId &&
                    this.accountingLedgerClassId == other.accountingLedgerClassId &&
                    this.currency == other.currency &&
                    this.effectiveDate == other.effectiveDate &&
                    this.description == other.description &&
                    this.statementDescriptor == other.statementDescriptor &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.processAfter == other.processAfter &&
                    this.purpose == other.purpose &&
                    this.metadata == other.metadata &&
                    this.chargeBearer == other.chargeBearer &&
                    this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                    this.foreignExchangeContract == other.foreignExchangeContract &&
                    this.nsfProtected == other.nsfProtected &&
                    this.originatingPartyName == other.originatingPartyName &&
                    this.ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
                    this.ultimateOriginatingPartyIdentifier ==
                        other.ultimateOriginatingPartyIdentifier &&
                    this.ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
                    this.ultimateReceivingPartyIdentifier ==
                        other.ultimateReceivingPartyIdentifier &&
                    this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
                    this.expiresAt == other.expiresAt &&
                    this.status == other.status &&
                    this.counterpartyId == other.counterpartyId &&
                    this.fallbackType == other.fallbackType &&
                    this.receivingAccount == other.receivingAccount &&
                    this.lineItems == other.lineItems &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            subtype,
                            amount,
                            direction,
                            priority,
                            originatingAccountId,
                            receivingAccountId,
                            accounting,
                            accountingCategoryId,
                            accountingLedgerClassId,
                            currency,
                            effectiveDate,
                            description,
                            statementDescriptor,
                            remittanceInformation,
                            processAfter,
                            purpose,
                            metadata,
                            chargeBearer,
                            foreignExchangeIndicator,
                            foreignExchangeContract,
                            nsfProtected,
                            originatingPartyName,
                            ultimateOriginatingPartyName,
                            ultimateOriginatingPartyIdentifier,
                            ultimateReceivingPartyName,
                            ultimateReceivingPartyIdentifier,
                            sendRemittanceAdvice,
                            expiresAt,
                            status,
                            counterpartyId,
                            fallbackType,
                            receivingAccount,
                            lineItems,
                            id,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "PaymentOrderUpdateRequestWithId{type=$type, subtype=$subtype, amount=$amount, direction=$direction, priority=$priority, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, currency=$currency, effectiveDate=$effectiveDate, description=$description, statementDescriptor=$statementDescriptor, remittanceInformation=$remittanceInformation, processAfter=$processAfter, purpose=$purpose, metadata=$metadata, chargeBearer=$chargeBearer, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeContract=$foreignExchangeContract, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, sendRemittanceAdvice=$sendRemittanceAdvice, expiresAt=$expiresAt, status=$status, counterpartyId=$counterpartyId, fallbackType=$fallbackType, receivingAccount=$receivingAccount, lineItems=$lineItems, id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<PaymentOrderType> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var priority: JsonField<Priority> = JsonMissing.of()
                private var originatingAccountId: JsonField<String> = JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
                private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
                private var lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                ) = apply {
                    this.type = paymentOrderUpdateRequestWithId.type
                    this.subtype = paymentOrderUpdateRequestWithId.subtype
                    this.amount = paymentOrderUpdateRequestWithId.amount
                    this.direction = paymentOrderUpdateRequestWithId.direction
                    this.priority = paymentOrderUpdateRequestWithId.priority
                    this.originatingAccountId = paymentOrderUpdateRequestWithId.originatingAccountId
                    this.receivingAccountId = paymentOrderUpdateRequestWithId.receivingAccountId
                    this.accounting = paymentOrderUpdateRequestWithId.accounting
                    this.accountingCategoryId = paymentOrderUpdateRequestWithId.accountingCategoryId
                    this.accountingLedgerClassId =
                        paymentOrderUpdateRequestWithId.accountingLedgerClassId
                    this.currency = paymentOrderUpdateRequestWithId.currency
                    this.effectiveDate = paymentOrderUpdateRequestWithId.effectiveDate
                    this.description = paymentOrderUpdateRequestWithId.description
                    this.statementDescriptor = paymentOrderUpdateRequestWithId.statementDescriptor
                    this.remittanceInformation =
                        paymentOrderUpdateRequestWithId.remittanceInformation
                    this.processAfter = paymentOrderUpdateRequestWithId.processAfter
                    this.purpose = paymentOrderUpdateRequestWithId.purpose
                    this.metadata = paymentOrderUpdateRequestWithId.metadata
                    this.chargeBearer = paymentOrderUpdateRequestWithId.chargeBearer
                    this.foreignExchangeIndicator =
                        paymentOrderUpdateRequestWithId.foreignExchangeIndicator
                    this.foreignExchangeContract =
                        paymentOrderUpdateRequestWithId.foreignExchangeContract
                    this.nsfProtected = paymentOrderUpdateRequestWithId.nsfProtected
                    this.originatingPartyName = paymentOrderUpdateRequestWithId.originatingPartyName
                    this.ultimateOriginatingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyName
                    this.ultimateOriginatingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyIdentifier
                    this.ultimateReceivingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyName
                    this.ultimateReceivingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyIdentifier
                    this.sendRemittanceAdvice = paymentOrderUpdateRequestWithId.sendRemittanceAdvice
                    this.expiresAt = paymentOrderUpdateRequestWithId.expiresAt
                    this.status = paymentOrderUpdateRequestWithId.status
                    this.counterpartyId = paymentOrderUpdateRequestWithId.counterpartyId
                    this.fallbackType = paymentOrderUpdateRequestWithId.fallbackType
                    this.receivingAccount = paymentOrderUpdateRequestWithId.receivingAccount
                    this.lineItems = paymentOrderUpdateRequestWithId.lineItems
                    this.id = paymentOrderUpdateRequestWithId.id
                    additionalProperties(paymentOrderUpdateRequestWithId.additionalProperties)
                }

                /**
                 * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
                 * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
                 * `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = type(JsonField.of(type))

                /**
                 * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
                 * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
                 * `signet`, `provexchange`, `zengin`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype) = subtype(JsonField.of(subtype))

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                @JsonProperty("subtype")
                @ExcludeMissing
                fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply {
                    this.subtype = subtype
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority) = priority(JsonField.of(priority))

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /** The ID of one of your organization's internal accounts. */
                @JsonProperty("originating_account_id")
                @ExcludeMissing
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String) =
                    receivingAccountId(JsonField.of(receivingAccountId))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account_id")
                @ExcludeMissing
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                @JsonProperty("accounting")
                @ExcludeMissing
                fun accounting(accounting: JsonField<Accounting>) = apply {
                    this.accounting = accounting
                }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(accountingCategoryId: String) =
                    accountingCategoryId(JsonField.of(accountingCategoryId))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingLedgerClassId(accountingLedgerClassId: String) =
                    accountingLedgerClassId(JsonField.of(accountingLedgerClassId))

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_ledger_class_id")
                @ExcludeMissing
                fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /** Defaults to the currency of the originating account. */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                @JsonProperty("effective_date")
                @ExcludeMissing
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An optional description for internal use. */
                fun description(description: String) = description(JsonField.of(description))

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String) =
                    statementDescriptor(JsonField.of(statementDescriptor))

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime) =
                    processAfter(JsonField.of(processAfter))

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                @JsonProperty("process_after")
                @ExcludeMissing
                fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud,
                 * this is the `payment.purpose_code` field. For `eft`, this field is the 3 digit
                 * CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String) = purpose(JsonField.of(purpose))

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud,
                 * this is the `payment.purpose_code` field. For `eft`, this field is the 3 digit
                 * CPA Code that will be attached to the payment.
                 */
                @JsonProperty("purpose")
                @ExcludeMissing
                fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer) =
                    chargeBearer(JsonField.of(chargeBearer))

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                @JsonProperty("charge_bearer")
                @ExcludeMissing
                fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                    this.chargeBearer = chargeBearer
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                    foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String) =
                    foreignExchangeContract(JsonField.of(foreignExchangeContract))

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                @JsonProperty("foreign_exchange_contract")
                @ExcludeMissing
                fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                @JsonProperty("nsf_protected")
                @ExcludeMissing
                fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                    this.nsfProtected = nsfProtected
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String) =
                    originatingPartyName(JsonField.of(originatingPartyName))

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                @JsonProperty("originating_party_name")
                @ExcludeMissing
                fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) =
                    ultimateOriginatingPartyName(JsonField.of(ultimateOriginatingPartyName))

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_originating_party_name")
                @ExcludeMissing
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                    }

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
                    ultimateOriginatingPartyIdentifier(
                        JsonField.of(ultimateOriginatingPartyIdentifier)
                    )

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_originating_party_identifier")
                @ExcludeMissing
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) =
                    ultimateReceivingPartyName(JsonField.of(ultimateReceivingPartyName))

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_receiving_party_name")
                @ExcludeMissing
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateReceivingPartyName = ultimateReceivingPartyName
                    }

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) =
                    ultimateReceivingPartyIdentifier(JsonField.of(ultimateReceivingPartyIdentifier))

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_receiving_party_identifier")
                @ExcludeMissing
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                @JsonProperty("send_remittance_advice")
                @ExcludeMissing
                fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                @JsonProperty("expires_at")
                @ExcludeMissing
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Required when receiving_account_id is passed the ID of an external account. */
                fun counterpartyId(counterpartyId: String) =
                    counterpartyId(JsonField.of(counterpartyId))

                /** Required when receiving_account_id is passed the ID of an external account. */
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType) =
                    fallbackType(JsonField.of(fallbackType))

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                @JsonProperty("fallback_type")
                @ExcludeMissing
                fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account")
                @ExcludeMissing
                fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                    this.receivingAccount = receivingAccount
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /** An array of line items that must sum up to the amount of the payment order. */
                @JsonProperty("line_items")
                @ExcludeMissing
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PaymentOrderUpdateRequestWithId =
                    PaymentOrderUpdateRequestWithId(
                        type,
                        subtype,
                        amount,
                        direction,
                        priority,
                        originatingAccountId,
                        receivingAccountId,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        currency,
                        effectiveDate,
                        description,
                        statementDescriptor,
                        remittanceInformation,
                        processAfter,
                        purpose,
                        metadata,
                        chargeBearer,
                        foreignExchangeIndicator,
                        foreignExchangeContract,
                        nsfProtected,
                        originatingPartyName,
                        ultimateOriginatingPartyName,
                        ultimateOriginatingPartyIdentifier,
                        ultimateReceivingPartyName,
                        ultimateReceivingPartyIdentifier,
                        sendRemittanceAdvice,
                        expiresAt,
                        status,
                        counterpartyId,
                        fallbackType,
                        receivingAccount,
                        lineItems.map { it.toUnmodifiable() },
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Accounting.Builder::class)
            @NoAutoDetect
            class Accounting
            private constructor(
                private val accountId: JsonField<String>,
                private val classId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountId(): String? = accountId.getNullable("account_id")

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                fun classId(): String? = classId.getNullable("class_id")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id") @ExcludeMissing fun _classId() = classId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Accounting = apply {
                    if (!validated) {
                        accountId()
                        classId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Accounting &&
                        this.accountId == other.accountId &&
                        this.classId == other.classId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                accountId,
                                classId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountId: JsonField<String> = JsonMissing.of()
                    private var classId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(accounting: Accounting) = apply {
                        this.accountId = accounting.accountId
                        this.classId = accounting.classId
                        additionalProperties(accounting.additionalProperties)
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("account_id")
                    @ExcludeMissing
                    fun accountId(accountId: JsonField<String>) = apply {
                        this.accountId = accountId
                    }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: String) = classId(JsonField.of(classId))

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    @JsonProperty("class_id")
                    @ExcludeMissing
                    fun classId(classId: JsonField<String>) = apply { this.classId = classId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Accounting =
                        Accounting(
                            accountId,
                            classId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class ChargeBearer
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChargeBearer && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val SHARED = ChargeBearer(JsonField.of("shared"))

                    val SENDER = ChargeBearer(JsonField.of("sender"))

                    val RECEIVER = ChargeBearer(JsonField.of("receiver"))

                    fun of(value: String) = ChargeBearer(JsonField.of(value))
                }

                enum class Known {
                    SHARED,
                    SENDER,
                    RECEIVER,
                }

                enum class Value {
                    SHARED,
                    SENDER,
                    RECEIVER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SHARED -> Value.SHARED
                        SENDER -> Value.SENDER
                        RECEIVER -> Value.RECEIVER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SHARED -> Known.SHARED
                        SENDER -> Known.SENDER
                        RECEIVER -> Known.RECEIVER
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Direction && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CREDIT = Direction(JsonField.of("credit"))

                    val DEBIT = Direction(JsonField.of("debit"))

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                enum class Value {
                    CREDIT,
                    DEBIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class FallbackType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FallbackType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH = FallbackType(JsonField.of("ach"))

                    fun of(value: String) = FallbackType(JsonField.of(value))
                }

                enum class Known {
                    ACH,
                }

                enum class Value {
                    ACH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ForeignExchangeIndicator && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val FIXED_TO_VARIABLE =
                        ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

                    val VARIABLE_TO_FIXED =
                        ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

                    fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                }

                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = LineItemRequest.Builder::class)
            @NoAutoDetect
            class LineItemRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val metadata: JsonField<Metadata>,
                private val description: JsonField<String>,
                private val accountingCategoryId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /** A free-form description of the line item. */
                fun description(): String? = description.getNullable("description")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(): String? =
                    accountingCategoryId.getNullable("accounting_category_id")

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /** A free-form description of the line item. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId() = accountingCategoryId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LineItemRequest = apply {
                    if (!validated) {
                        amount()
                        metadata()?.validate()
                        description()
                        accountingCategoryId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LineItemRequest &&
                        this.amount == other.amount &&
                        this.metadata == other.metadata &&
                        this.description == other.description &&
                        this.accountingCategoryId == other.accountingCategoryId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                metadata,
                                description,
                                accountingCategoryId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        this.amount = lineItemRequest.amount
                        this.metadata = lineItemRequest.metadata
                        this.description = lineItemRequest.description
                        this.accountingCategoryId = lineItemRequest.accountingCategoryId
                        additionalProperties(lineItemRequest.additionalProperties)
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** A free-form description of the line item. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** A free-form description of the line item. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String) =
                        accountingCategoryId(JsonField.of(accountingCategoryId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("accounting_category_id")
                    @ExcludeMissing
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            amount,
                            metadata,
                            description,
                            accountingCategoryId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            class Priority
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Priority && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val HIGH = Priority(JsonField.of("high"))

                    val NORMAL = Priority(JsonField.of("normal"))

                    fun of(value: String) = Priority(JsonField.of(value))
                }

                enum class Known {
                    HIGH,
                    NORMAL,
                }

                enum class Value {
                    HIGH,
                    NORMAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        HIGH -> Value.HIGH
                        NORMAL -> Value.NORMAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        HIGH -> Known.HIGH
                        NORMAL -> Known.NORMAL
                        else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonDeserialize(builder = ReceivingAccount.Builder::class)
            @NoAutoDetect
            class ReceivingAccount
            private constructor(
                private val accountType: JsonField<ExternalAccountType>,
                private val partyType: JsonField<PartyType>,
                private val partyAddress: JsonField<AddressRequest>,
                private val name: JsonField<String>,
                private val accountDetails: JsonField<List<AccountDetail>>,
                private val routingDetails: JsonField<List<RoutingDetail>>,
                private val metadata: JsonField<Metadata>,
                private val partyName: JsonField<String>,
                private val partyIdentifier: JsonField<String>,
                private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
                private val plaidProcessorToken: JsonField<String>,
                private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Can be `checking`, `savings` or `other`. */
                fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

                /** Either `individual` or `business`. */
                fun partyType(): PartyType? = partyType.getNullable("party_type")

                /** Required if receiving wire payments. */
                fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                fun name(): String? = name.getNullable("name")

                fun accountDetails(): List<AccountDetail>? =
                    accountDetails.getNullable("account_details")

                fun routingDetails(): List<RoutingDetail>? =
                    routingDetails.getNullable("routing_details")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                fun partyName(): String? = partyName.getNullable("party_name")

                fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                fun ledgerAccount(): LedgerAccountCreateRequest? =
                    ledgerAccount.getNullable("ledger_account")

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                fun plaidProcessorToken(): String? =
                    plaidProcessorToken.getNullable("plaid_processor_token")

                fun contactDetails(): List<ContactDetailCreateRequest>? =
                    contactDetails.getNullable("contact_details")

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

                /** Either `individual` or `business`. */
                @JsonProperty("party_type") @ExcludeMissing fun _partyType() = partyType

                /** Required if receiving wire payments. */
                @JsonProperty("party_address") @ExcludeMissing fun _partyAddress() = partyAddress

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("account_details")
                @ExcludeMissing
                fun _accountDetails() = accountDetails

                @JsonProperty("routing_details")
                @ExcludeMissing
                fun _routingDetails() = routingDetails

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name") @ExcludeMissing fun _partyName() = partyName

                @JsonProperty("party_identifier")
                @ExcludeMissing
                fun _partyIdentifier() = partyIdentifier

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account") @ExcludeMissing fun _ledgerAccount() = ledgerAccount

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                fun _plaidProcessorToken() = plaidProcessorToken

                @JsonProperty("contact_details")
                @ExcludeMissing
                fun _contactDetails() = contactDetails

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ReceivingAccount = apply {
                    if (!validated) {
                        accountType()
                        partyType()
                        partyAddress()?.validate()
                        name()
                        accountDetails()?.forEach { it.validate() }
                        routingDetails()?.forEach { it.validate() }
                        metadata()?.validate()
                        partyName()
                        partyIdentifier()
                        ledgerAccount()?.validate()
                        plaidProcessorToken()
                        contactDetails()?.forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReceivingAccount &&
                        this.accountType == other.accountType &&
                        this.partyType == other.partyType &&
                        this.partyAddress == other.partyAddress &&
                        this.name == other.name &&
                        this.accountDetails == other.accountDetails &&
                        this.routingDetails == other.routingDetails &&
                        this.metadata == other.metadata &&
                        this.partyName == other.partyName &&
                        this.partyIdentifier == other.partyIdentifier &&
                        this.ledgerAccount == other.ledgerAccount &&
                        this.plaidProcessorToken == other.plaidProcessorToken &&
                        this.contactDetails == other.contactDetails &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                accountType,
                                partyType,
                                partyAddress,
                                name,
                                accountDetails,
                                routingDetails,
                                metadata,
                                partyName,
                                partyIdentifier,
                                ledgerAccount,
                                plaidProcessorToken,
                                contactDetails,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
                    private var partyType: JsonField<PartyType> = JsonMissing.of()
                    private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of()
                    private var routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var partyName: JsonField<String> = JsonMissing.of()
                    private var partyIdentifier: JsonField<String> = JsonMissing.of()
                    private var ledgerAccount: JsonField<LedgerAccountCreateRequest> =
                        JsonMissing.of()
                    private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
                    private var contactDetails: JsonField<List<ContactDetailCreateRequest>> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        this.accountType = receivingAccount.accountType
                        this.partyType = receivingAccount.partyType
                        this.partyAddress = receivingAccount.partyAddress
                        this.name = receivingAccount.name
                        this.accountDetails = receivingAccount.accountDetails
                        this.routingDetails = receivingAccount.routingDetails
                        this.metadata = receivingAccount.metadata
                        this.partyName = receivingAccount.partyName
                        this.partyIdentifier = receivingAccount.partyIdentifier
                        this.ledgerAccount = receivingAccount.ledgerAccount
                        this.plaidProcessorToken = receivingAccount.plaidProcessorToken
                        this.contactDetails = receivingAccount.contactDetails
                        additionalProperties(receivingAccount.additionalProperties)
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType) =
                        accountType(JsonField.of(accountType))

                    /** Can be `checking`, `savings` or `other`. */
                    @JsonProperty("account_type")
                    @ExcludeMissing
                    fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                        this.accountType = accountType
                    }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType) = partyType(JsonField.of(partyType))

                    /** Either `individual` or `business`. */
                    @JsonProperty("party_type")
                    @ExcludeMissing
                    fun partyType(partyType: JsonField<PartyType>) = apply {
                        this.partyType = partyType
                    }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest) =
                        partyAddress(JsonField.of(partyAddress))

                    /** Required if receiving wire payments. */
                    @JsonProperty("party_address")
                    @ExcludeMissing
                    fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                        this.partyAddress = partyAddress
                    }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun accountDetails(accountDetails: List<AccountDetail>) =
                        accountDetails(JsonField.of(accountDetails))

                    @JsonProperty("account_details")
                    @ExcludeMissing
                    fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                        this.accountDetails = accountDetails
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>) =
                        routingDetails(JsonField.of(routingDetails))

                    @JsonProperty("routing_details")
                    @ExcludeMissing
                    fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                        this.routingDetails = routingDetails
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String) = partyName(JsonField.of(partyName))

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    @JsonProperty("party_name")
                    @ExcludeMissing
                    fun partyName(partyName: JsonField<String>) = apply {
                        this.partyName = partyName
                    }

                    fun partyIdentifier(partyIdentifier: String) =
                        partyIdentifier(JsonField.of(partyIdentifier))

                    @JsonProperty("party_identifier")
                    @ExcludeMissing
                    fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                        this.partyIdentifier = partyIdentifier
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
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    @JsonProperty("ledger_account")
                    @ExcludeMissing
                    fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) =
                        apply {
                            this.ledgerAccount = ledgerAccount
                        }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String) =
                        plaidProcessorToken(JsonField.of(plaidProcessorToken))

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    @JsonProperty("plaid_processor_token")
                    @ExcludeMissing
                    fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                        contactDetails(JsonField.of(contactDetails))

                    @JsonProperty("contact_details")
                    @ExcludeMissing
                    fun contactDetails(
                        contactDetails: JsonField<List<ContactDetailCreateRequest>>
                    ) = apply { this.contactDetails = contactDetails }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            accountType,
                            partyType,
                            partyAddress,
                            name,
                            accountDetails.map { it.toUnmodifiable() },
                            routingDetails.map { it.toUnmodifiable() },
                            metadata,
                            partyName,
                            partyIdentifier,
                            ledgerAccount,
                            plaidProcessorToken,
                            contactDetails.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = AccountDetail.Builder::class)
                @NoAutoDetect
                class AccountDetail
                private constructor(
                    private val accountNumber: JsonField<String>,
                    private val accountNumberType: JsonField<AccountNumberType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun accountNumber(): String = accountNumber.getRequired("account_number")

                    fun accountNumberType(): AccountNumberType? =
                        accountNumberType.getNullable("account_number_type")

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber() = accountNumber

                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    fun _accountNumberType() = accountNumberType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AccountDetail = apply {
                        if (!validated) {
                            accountNumber()
                            accountNumberType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccountDetail &&
                            this.accountNumber == other.accountNumber &&
                            this.accountNumberType == other.accountNumberType &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    accountNumber,
                                    accountNumberType,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var accountNumber: JsonField<String> = JsonMissing.of()
                        private var accountNumberType: JsonField<AccountNumberType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(accountDetail: AccountDetail) = apply {
                            this.accountNumber = accountDetail.accountNumber
                            this.accountNumberType = accountDetail.accountNumberType
                            additionalProperties(accountDetail.additionalProperties)
                        }

                        fun accountNumber(accountNumber: String) =
                            accountNumber(JsonField.of(accountNumber))

                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun accountNumber(accountNumber: JsonField<String>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType) =
                            accountNumberType(JsonField.of(accountNumberType))

                        @JsonProperty("account_number_type")
                        @ExcludeMissing
                        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) =
                            apply {
                                this.accountNumberType = accountNumberType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AccountDetail =
                            AccountDetail(
                                accountNumber,
                                accountNumberType,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class AccountNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is AccountNumberType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val IBAN = AccountNumberType(JsonField.of("iban"))

                            val HK_NUMBER = AccountNumberType(JsonField.of("hk_number"))

                            val CLABE = AccountNumberType(JsonField.of("clabe"))

                            val NZ_NUMBER = AccountNumberType(JsonField.of("nz_number"))

                            val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

                            val PAN = AccountNumberType(JsonField.of("pan"))

                            val OTHER = AccountNumberType(JsonField.of("other"))

                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            IBAN,
                            HK_NUMBER,
                            CLABE,
                            NZ_NUMBER,
                            WALLET_ADDRESS,
                            PAN,
                            OTHER,
                        }

                        enum class Value {
                            IBAN,
                            HK_NUMBER,
                            CLABE,
                            NZ_NUMBER,
                            WALLET_ADDRESS,
                            PAN,
                            OTHER,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                IBAN -> Value.IBAN
                                HK_NUMBER -> Value.HK_NUMBER
                                CLABE -> Value.CLABE
                                NZ_NUMBER -> Value.NZ_NUMBER
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                PAN -> Value.PAN
                                OTHER -> Value.OTHER
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                IBAN -> Known.IBAN
                                HK_NUMBER -> Known.HK_NUMBER
                                CLABE -> Known.CLABE
                                NZ_NUMBER -> Known.NZ_NUMBER
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                PAN -> Known.PAN
                                OTHER -> Known.OTHER
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
                @NoAutoDetect
                class ContactDetailCreateRequest
                private constructor(
                    private val contactIdentifier: JsonField<String>,
                    private val contactIdentifierType: JsonField<ContactIdentifierType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun contactIdentifier(): String? =
                        contactIdentifier.getNullable("contact_identifier")

                    fun contactIdentifierType(): ContactIdentifierType? =
                        contactIdentifierType.getNullable("contact_identifier_type")

                    @JsonProperty("contact_identifier")
                    @ExcludeMissing
                    fun _contactIdentifier() = contactIdentifier

                    @JsonProperty("contact_identifier_type")
                    @ExcludeMissing
                    fun _contactIdentifierType() = contactIdentifierType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ContactDetailCreateRequest = apply {
                        if (!validated) {
                            contactIdentifier()
                            contactIdentifierType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ContactDetailCreateRequest &&
                            this.contactIdentifier == other.contactIdentifier &&
                            this.contactIdentifierType == other.contactIdentifierType &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    contactIdentifier,
                                    contactIdentifierType,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var contactIdentifier: JsonField<String> = JsonMissing.of()
                        private var contactIdentifierType: JsonField<ContactIdentifierType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) =
                            apply {
                                this.contactIdentifier =
                                    contactDetailCreateRequest.contactIdentifier
                                this.contactIdentifierType =
                                    contactDetailCreateRequest.contactIdentifierType
                                additionalProperties(
                                    contactDetailCreateRequest.additionalProperties
                                )
                            }

                        fun contactIdentifier(contactIdentifier: String) =
                            contactIdentifier(JsonField.of(contactIdentifier))

                        @JsonProperty("contact_identifier")
                        @ExcludeMissing
                        fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                            contactIdentifierType(JsonField.of(contactIdentifierType))

                        @JsonProperty("contact_identifier_type")
                        @ExcludeMissing
                        fun contactIdentifierType(
                            contactIdentifierType: JsonField<ContactIdentifierType>
                        ) = apply { this.contactIdentifierType = contactIdentifierType }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ContactDetailCreateRequest =
                            ContactDetailCreateRequest(
                                contactIdentifier,
                                contactIdentifierType,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ContactIdentifierType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ContactIdentifierType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val EMAIL = ContactIdentifierType(JsonField.of("email"))

                            val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                            val WEBSITE = ContactIdentifierType(JsonField.of("website"))

                            fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                        }

                        enum class Known {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                        }

                        enum class Value {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                EMAIL -> Value.EMAIL
                                PHONE_NUMBER -> Value.PHONE_NUMBER
                                WEBSITE -> Value.WEBSITE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                EMAIL -> Known.EMAIL
                                PHONE_NUMBER -> Known.PHONE_NUMBER
                                WEBSITE -> Known.WEBSITE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown ContactIdentifierType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerAccountCreateRequest
                private constructor(
                    private val name: JsonField<String>,
                    private val description: JsonField<String>,
                    private val normalBalance: JsonField<TransactionDirection>,
                    private val ledgerId: JsonField<String>,
                    private val currency: JsonField<String>,
                    private val currencyExponent: JsonField<Long>,
                    private val ledgerAccountCategoryIds: JsonField<List<String>>,
                    private val ledgerableId: JsonField<String>,
                    private val ledgerableType: JsonField<LedgerableType>,
                    private val metadata: JsonField<Metadata>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** The name of the ledger account. */
                    fun name(): String = name.getRequired("name")

                    /** The description of the ledger account. */
                    fun description(): String? = description.getNullable("description")

                    /** The normal balance of the ledger account. */
                    fun normalBalance(): TransactionDirection =
                        normalBalance.getRequired("normal_balance")

                    /** The id of the ledger that this account belongs to. */
                    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

                    /** The currency of the ledger account. */
                    fun currency(): String = currency.getRequired("currency")

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(): Long? =
                        currencyExponent.getNullable("currency_exponent")

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    fun ledgerAccountCategoryIds(): List<String>? =
                        ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    fun ledgerableType(): LedgerableType? =
                        ledgerableType.getNullable("ledgerable_type")

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Metadata? = metadata.getNullable("metadata")

                    /** The name of the ledger account. */
                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    /** The description of the ledger account. */
                    @JsonProperty("description") @ExcludeMissing fun _description() = description

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    @ExcludeMissing
                    fun _normalBalance() = normalBalance

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

                    /** The currency of the ledger account. */
                    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    fun _currencyExponent() = currencyExponent

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    @ExcludeMissing
                    fun _ledgerAccountCategoryIds() = ledgerAccountCategoryIds

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    fun _ledgerableId() = ledgerableId

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    fun _ledgerableType() = ledgerableType

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): LedgerAccountCreateRequest = apply {
                        if (!validated) {
                            name()
                            description()
                            normalBalance()
                            ledgerId()
                            currency()
                            currencyExponent()
                            ledgerAccountCategoryIds()
                            ledgerableId()
                            ledgerableType()
                            metadata()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LedgerAccountCreateRequest &&
                            this.name == other.name &&
                            this.description == other.description &&
                            this.normalBalance == other.normalBalance &&
                            this.ledgerId == other.ledgerId &&
                            this.currency == other.currency &&
                            this.currencyExponent == other.currencyExponent &&
                            this.ledgerAccountCategoryIds == other.ledgerAccountCategoryIds &&
                            this.ledgerableId == other.ledgerableId &&
                            this.ledgerableType == other.ledgerableType &&
                            this.metadata == other.metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    name,
                                    description,
                                    normalBalance,
                                    ledgerId,
                                    currency,
                                    currencyExponent,
                                    ledgerAccountCategoryIds,
                                    ledgerableId,
                                    ledgerableType,
                                    metadata,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var description: JsonField<String> = JsonMissing.of()
                        private var normalBalance: JsonField<TransactionDirection> =
                            JsonMissing.of()
                        private var ledgerId: JsonField<String> = JsonMissing.of()
                        private var currency: JsonField<String> = JsonMissing.of()
                        private var currencyExponent: JsonField<Long> = JsonMissing.of()
                        private var ledgerAccountCategoryIds: JsonField<List<String>> =
                            JsonMissing.of()
                        private var ledgerableId: JsonField<String> = JsonMissing.of()
                        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                this.name = ledgerAccountCreateRequest.name
                                this.description = ledgerAccountCreateRequest.description
                                this.normalBalance = ledgerAccountCreateRequest.normalBalance
                                this.ledgerId = ledgerAccountCreateRequest.ledgerId
                                this.currency = ledgerAccountCreateRequest.currency
                                this.currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                this.ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds
                                this.ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                this.ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                this.metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties(
                                    ledgerAccountCreateRequest.additionalProperties
                                )
                            }

                        /** The name of the ledger account. */
                        fun name(name: String) = name(JsonField.of(name))

                        /** The name of the ledger account. */
                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** The description of the ledger account. */
                        fun description(description: String) =
                            description(JsonField.of(description))

                        /** The description of the ledger account. */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: TransactionDirection) =
                            normalBalance(JsonField.of(normalBalance))

                        /** The normal balance of the ledger account. */
                        @JsonProperty("normal_balance")
                        @ExcludeMissing
                        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

                        /** The id of the ledger that this account belongs to. */
                        @JsonProperty("ledger_id")
                        @ExcludeMissing
                        fun ledgerId(ledgerId: JsonField<String>) = apply {
                            this.ledgerId = ledgerId
                        }

                        /** The currency of the ledger account. */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /** The currency of the ledger account. */
                        @JsonProperty("currency")
                        @ExcludeMissing
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long) =
                            currencyExponent(JsonField.of(currencyExponent))

                        /** The currency exponent of the ledger account. */
                        @JsonProperty("currency_exponent")
                        @ExcludeMissing
                        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                            ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        @JsonProperty("ledger_account_category_ids")
                        @ExcludeMissing
                        fun ledgerAccountCategoryIds(
                            ledgerAccountCategoryIds: JsonField<List<String>>
                        ) = apply { this.ledgerAccountCategoryIds = ledgerAccountCategoryIds }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: String) =
                            ledgerableId(JsonField.of(ledgerableId))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        @JsonProperty("ledgerable_id")
                        @ExcludeMissing
                        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: LedgerableType) =
                            ledgerableType(JsonField.of(ledgerableType))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        @JsonProperty("ledgerable_type")
                        @ExcludeMissing
                        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): LedgerAccountCreateRequest =
                            LedgerAccountCreateRequest(
                                name,
                                description,
                                normalBalance,
                                ledgerId,
                                currency,
                                currencyExponent,
                                ledgerAccountCategoryIds.map { it.toUnmodifiable() },
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class LedgerableType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is LedgerableType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                            val EXTERNAL_ACCOUNT = LedgerableType(JsonField.of("external_account"))

                            val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                            val VIRTUAL_ACCOUNT = LedgerableType(JsonField.of("virtual_account"))

                            fun of(value: String) = LedgerableType(JsonField.of(value))
                        }

                        enum class Known {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                        }

                        enum class Value {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                COUNTERPARTY -> Value.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                COUNTERPARTY -> Known.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown LedgerableType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Metadata = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Metadata &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties(metadata.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                        }
                    }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }

                /** Required if receiving wire payments. */
                @JsonDeserialize(builder = AddressRequest.Builder::class)
                @NoAutoDetect
                class AddressRequest
                private constructor(
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val locality: JsonField<String>,
                    private val region: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val country: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun line1(): String? = line1.getNullable("line1")

                    fun line2(): String? = line2.getNullable("line2")

                    /** Locality or City. */
                    fun locality(): String? = locality.getNullable("locality")

                    /** Region or State. */
                    fun region(): String? = region.getNullable("region")

                    /** The postal code of the address. */
                    fun postalCode(): String? = postalCode.getNullable("postal_code")

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    fun country(): String? = country.getNullable("country")

                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    /** Locality or City. */
                    @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

                    /** Region or State. */
                    @JsonProperty("region") @ExcludeMissing fun _region() = region

                    /** The postal code of the address. */
                    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country") @ExcludeMissing fun _country() = country

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AddressRequest = apply {
                        if (!validated) {
                            line1()
                            line2()
                            locality()
                            region()
                            postalCode()
                            country()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AddressRequest &&
                            this.line1 == other.line1 &&
                            this.line2 == other.line2 &&
                            this.locality == other.locality &&
                            this.region == other.region &&
                            this.postalCode == other.postalCode &&
                            this.country == other.country &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    line1,
                                    line2,
                                    locality,
                                    region,
                                    postalCode,
                                    country,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var locality: JsonField<String> = JsonMissing.of()
                        private var region: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var country: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(addressRequest: AddressRequest) = apply {
                            this.line1 = addressRequest.line1
                            this.line2 = addressRequest.line2
                            this.locality = addressRequest.locality
                            this.region = addressRequest.region
                            this.postalCode = addressRequest.postalCode
                            this.country = addressRequest.country
                            additionalProperties(addressRequest.additionalProperties)
                        }

                        fun line1(line1: String) = line1(JsonField.of(line1))

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        fun line2(line2: String) = line2(JsonField.of(line2))

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String) = locality(JsonField.of(locality))

                        /** Locality or City. */
                        @JsonProperty("locality")
                        @ExcludeMissing
                        fun locality(locality: JsonField<String>) = apply {
                            this.locality = locality
                        }

                        /** Region or State. */
                        fun region(region: String) = region(JsonField.of(region))

                        /** Region or State. */
                        @JsonProperty("region")
                        @ExcludeMissing
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /** The postal code of the address. */
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String) = country(JsonField.of(country))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AddressRequest =
                            AddressRequest(
                                line1,
                                line2,
                                locality,
                                region,
                                postalCode,
                                country,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                class PartyType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PartyType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BUSINESS = PartyType(JsonField.of("business"))

                        val INDIVIDUAL = PartyType(JsonField.of("individual"))

                        fun of(value: String) = PartyType(JsonField.of(value))
                    }

                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown PartyType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = RoutingDetail.Builder::class)
                @NoAutoDetect
                class RoutingDetail
                private constructor(
                    private val routingNumber: JsonField<String>,
                    private val routingNumberType: JsonField<RoutingNumberType>,
                    private val paymentType: JsonField<PaymentType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun routingNumber(): String = routingNumber.getRequired("routing_number")

                    fun routingNumberType(): RoutingNumberType =
                        routingNumberType.getRequired("routing_number_type")

                    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber() = routingNumber

                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    fun _routingNumberType() = routingNumberType

                    @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): RoutingDetail = apply {
                        if (!validated) {
                            routingNumber()
                            routingNumberType()
                            paymentType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RoutingDetail &&
                            this.routingNumber == other.routingNumber &&
                            this.routingNumberType == other.routingNumberType &&
                            this.paymentType == other.paymentType &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    routingNumber,
                                    routingNumberType,
                                    paymentType,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: JsonField<String> = JsonMissing.of()
                        private var routingNumberType: JsonField<RoutingNumberType> =
                            JsonMissing.of()
                        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(routingDetail: RoutingDetail) = apply {
                            this.routingNumber = routingDetail.routingNumber
                            this.routingNumberType = routingDetail.routingNumberType
                            this.paymentType = routingDetail.paymentType
                            additionalProperties(routingDetail.additionalProperties)
                        }

                        fun routingNumber(routingNumber: String) =
                            routingNumber(JsonField.of(routingNumber))

                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun routingNumber(routingNumber: JsonField<String>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) =
                            routingNumberType(JsonField.of(routingNumberType))

                        @JsonProperty("routing_number_type")
                        @ExcludeMissing
                        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) =
                            apply {
                                this.routingNumberType = routingNumberType
                            }

                        fun paymentType(paymentType: PaymentType) =
                            paymentType(JsonField.of(paymentType))

                        @JsonProperty("payment_type")
                        @ExcludeMissing
                        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): RoutingDetail =
                            RoutingDetail(
                                routingNumber,
                                routingNumberType,
                                paymentType,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RoutingNumberType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val ABA = RoutingNumberType(JsonField.of("aba"))

                            val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

                            val BR_CODIGO = RoutingNumberType(JsonField.of("br_codigo"))

                            val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

                            val CHIPS = RoutingNumberType(JsonField.of("chips"))

                            val CNAPS = RoutingNumberType(JsonField.of("cnaps"))

                            val DK_INTERBANK_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("dk_interbank_clearing_code"))

                            val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

                            val HK_INTERBANK_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("hk_interbank_clearing_code"))

                            val HU_INTERBANK_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("hu_interbank_clearing_code"))

                            val ID_SKNBI_CODE = RoutingNumberType(JsonField.of("id_sknbi_code"))

                            val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                            val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

                            val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

                            val MX_BANK_IDENTIFIER =
                                RoutingNumberType(JsonField.of("mx_bank_identifier"))

                            val NZ_NATIONAL_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("nz_national_clearing_code"))

                            val PL_NATIONAL_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("pl_national_clearing_code"))

                            val SE_BANKGIRO_CLEARING_CODE =
                                RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

                            val SWIFT = RoutingNumberType(JsonField.of("swift"))

                            fun of(value: String) = RoutingNumberType(JsonField.of(value))
                        }

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
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                        }

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
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                            _UNKNOWN,
                        }

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
                                IN_IFSC -> Value.IN_IFSC
                                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Value.SWIFT
                                else -> Value._UNKNOWN
                            }

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
                                IN_IFSC -> Known.IN_IFSC
                                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Known.SWIFT
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class PaymentType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PaymentType && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val ACH = PaymentType(JsonField.of("ach"))

                            val AU_BECS = PaymentType(JsonField.of("au_becs"))

                            val BACS = PaymentType(JsonField.of("bacs"))

                            val BOOK = PaymentType(JsonField.of("book"))

                            val CARD = PaymentType(JsonField.of("card"))

                            val CHATS = PaymentType(JsonField.of("chats"))

                            val CHECK = PaymentType(JsonField.of("check"))

                            val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                            val DK_NETS = PaymentType(JsonField.of("dk_nets"))

                            val EFT = PaymentType(JsonField.of("eft"))

                            val HU_ICS = PaymentType(JsonField.of("hu_ics"))

                            val INTERAC = PaymentType(JsonField.of("interac"))

                            val MASAV = PaymentType(JsonField.of("masav"))

                            val MX_CCEN = PaymentType(JsonField.of("mx_ccen"))

                            val NEFT = PaymentType(JsonField.of("neft"))

                            val NICS = PaymentType(JsonField.of("nics"))

                            val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                            val PL_ELIXIR = PaymentType(JsonField.of("pl_elixir"))

                            val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                            val RO_SENT = PaymentType(JsonField.of("ro_sent"))

                            val RTP = PaymentType(JsonField.of("rtp"))

                            val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

                            val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                            val SEN = PaymentType(JsonField.of("sen"))

                            val SEPA = PaymentType(JsonField.of("sepa"))

                            val SIC = PaymentType(JsonField.of("sic"))

                            val SIGNET = PaymentType(JsonField.of("signet"))

                            val SKNBI = PaymentType(JsonField.of("sknbi"))

                            val WIRE = PaymentType(JsonField.of("wire"))

                            val ZENGIN = PaymentType(JsonField.of("zengin"))

                            fun of(value: String) = PaymentType(JsonField.of(value))
                        }

                        enum class Known {
                            ACH,
                            AU_BECS,
                            BACS,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SG_GIRO,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SIC,
                            SIGNET,
                            SKNBI,
                            WIRE,
                            ZENGIN,
                        }

                        enum class Value {
                            ACH,
                            AU_BECS,
                            BACS,
                            BOOK,
                            CARD,
                            CHATS,
                            CHECK,
                            CROSS_BORDER,
                            DK_NETS,
                            EFT,
                            HU_ICS,
                            INTERAC,
                            MASAV,
                            MX_CCEN,
                            NEFT,
                            NICS,
                            NZ_BECS,
                            PL_ELIXIR,
                            PROVXCHANGE,
                            RO_SENT,
                            RTP,
                            SG_GIRO,
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SIC,
                            SIGNET,
                            SKNBI,
                            WIRE,
                            ZENGIN,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                ACH -> Value.ACH
                                AU_BECS -> Value.AU_BECS
                                BACS -> Value.BACS
                                BOOK -> Value.BOOK
                                CARD -> Value.CARD
                                CHATS -> Value.CHATS
                                CHECK -> Value.CHECK
                                CROSS_BORDER -> Value.CROSS_BORDER
                                DK_NETS -> Value.DK_NETS
                                EFT -> Value.EFT
                                HU_ICS -> Value.HU_ICS
                                INTERAC -> Value.INTERAC
                                MASAV -> Value.MASAV
                                MX_CCEN -> Value.MX_CCEN
                                NEFT -> Value.NEFT
                                NICS -> Value.NICS
                                NZ_BECS -> Value.NZ_BECS
                                PL_ELIXIR -> Value.PL_ELIXIR
                                PROVXCHANGE -> Value.PROVXCHANGE
                                RO_SENT -> Value.RO_SENT
                                RTP -> Value.RTP
                                SG_GIRO -> Value.SG_GIRO
                                SE_BANKGIROT -> Value.SE_BANKGIROT
                                SEN -> Value.SEN
                                SEPA -> Value.SEPA
                                SIC -> Value.SIC
                                SIGNET -> Value.SIGNET
                                SKNBI -> Value.SKNBI
                                WIRE -> Value.WIRE
                                ZENGIN -> Value.ZENGIN
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                ACH -> Known.ACH
                                AU_BECS -> Known.AU_BECS
                                BACS -> Known.BACS
                                BOOK -> Known.BOOK
                                CARD -> Known.CARD
                                CHATS -> Known.CHATS
                                CHECK -> Known.CHECK
                                CROSS_BORDER -> Known.CROSS_BORDER
                                DK_NETS -> Known.DK_NETS
                                EFT -> Known.EFT
                                HU_ICS -> Known.HU_ICS
                                INTERAC -> Known.INTERAC
                                MASAV -> Known.MASAV
                                MX_CCEN -> Known.MX_CCEN
                                NEFT -> Known.NEFT
                                NICS -> Known.NICS
                                NZ_BECS -> Known.NZ_BECS
                                PL_ELIXIR -> Known.PL_ELIXIR
                                PROVXCHANGE -> Known.PROVXCHANGE
                                RO_SENT -> Known.RO_SENT
                                RTP -> Known.RTP
                                SG_GIRO -> Known.SG_GIRO
                                SE_BANKGIROT -> Known.SE_BANKGIROT
                                SEN -> Known.SEN
                                SEPA -> Known.SEPA
                                SIC -> Known.SIC
                                SIGNET -> Known.SIGNET
                                SKNBI -> Known.SKNBI
                                WIRE -> Known.WIRE
                                ZENGIN -> Known.ZENGIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown PaymentType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
            }

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Status && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val APPROVED = Status(JsonField.of("approved"))

                    val CANCELLED = Status(JsonField.of("cancelled"))

                    val COMPLETED = Status(JsonField.of("completed"))

                    val DENIED = Status(JsonField.of("denied"))

                    val FAILED = Status(JsonField.of("failed"))

                    val NEEDS_APPROVAL = Status(JsonField.of("needs_approval"))

                    val PENDING = Status(JsonField.of("pending"))

                    val PROCESSING = Status(JsonField.of("processing"))

                    val RETURNED = Status(JsonField.of("returned"))

                    val REVERSED = Status(JsonField.of("reversed"))

                    val SENT = Status(JsonField.of("sent"))

                    fun of(value: String) = Status(JsonField.of(value))
                }

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
                }

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
                    _UNKNOWN,
                }

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
                        else -> Value._UNKNOWN
                    }

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
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = ExpectedPaymentUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class ExpectedPaymentUpdateRequestWithId
        private constructor(
            private val amountUpperBound: JsonField<Long>,
            private val amountLowerBound: JsonField<Long>,
            private val direction: JsonField<TransactionDirection>,
            private val internalAccountId: JsonField<String>,
            private val type: JsonField<ExpectedPaymentType>,
            private val currency: JsonField<Currency>,
            private val dateUpperBound: JsonField<LocalDate>,
            private val dateLowerBound: JsonField<LocalDate>,
            private val description: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val counterpartyId: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val reconciliationGroups: JsonValue,
            private val reconciliationFilters: JsonValue,
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRuleVariable>>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            fun direction(): TransactionDirection? = direction.getNullable("direction")

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(): ExpectedPaymentType? = type.getNullable("type")

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            fun currency(): Currency? = currency.getNullable("currency")

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

            /** An optional description for internal use. */
            fun description(): String? = description.getNullable("description")

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(): String? =
                statementDescriptor.getNullable("statement_descriptor")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /** An array of reconciliation rule variables for this payment. */
            fun reconciliationRuleVariables(): List<ReconciliationRuleVariable>? =
                reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

            fun id(): String? = id.getNullable("id")

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            fun _amountUpperBound() = amountUpperBound

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            fun _amountLowerBound() = amountLowerBound

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId() = internalAccountId

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound") @ExcludeMissing fun _dateUpperBound() = dateUpperBound

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound") @ExcludeMissing fun _dateLowerBound() = dateLowerBound

            /** An optional description for internal use. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor() = statementDescriptor

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            fun _reconciliationGroups() = reconciliationGroups

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            fun _reconciliationFilters() = reconciliationFilters

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            fun _reconciliationRuleVariables() = reconciliationRuleVariables

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ExpectedPaymentUpdateRequestWithId = apply {
                if (!validated) {
                    amountUpperBound()
                    amountLowerBound()
                    direction()
                    internalAccountId()
                    type()
                    currency()
                    dateUpperBound()
                    dateLowerBound()
                    description()
                    statementDescriptor()
                    metadata()?.validate()
                    counterpartyId()
                    remittanceInformation()
                    reconciliationRuleVariables()?.forEach { it.validate() }
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExpectedPaymentUpdateRequestWithId &&
                    this.amountUpperBound == other.amountUpperBound &&
                    this.amountLowerBound == other.amountLowerBound &&
                    this.direction == other.direction &&
                    this.internalAccountId == other.internalAccountId &&
                    this.type == other.type &&
                    this.currency == other.currency &&
                    this.dateUpperBound == other.dateUpperBound &&
                    this.dateLowerBound == other.dateLowerBound &&
                    this.description == other.description &&
                    this.statementDescriptor == other.statementDescriptor &&
                    this.metadata == other.metadata &&
                    this.counterpartyId == other.counterpartyId &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.reconciliationGroups == other.reconciliationGroups &&
                    this.reconciliationFilters == other.reconciliationFilters &&
                    this.reconciliationRuleVariables == other.reconciliationRuleVariables &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amountUpperBound,
                            amountLowerBound,
                            direction,
                            internalAccountId,
                            type,
                            currency,
                            dateUpperBound,
                            dateLowerBound,
                            description,
                            statementDescriptor,
                            metadata,
                            counterpartyId,
                            remittanceInformation,
                            reconciliationGroups,
                            reconciliationFilters,
                            reconciliationRuleVariables,
                            id,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ExpectedPaymentUpdateRequestWithId{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, reconciliationRuleVariables=$reconciliationRuleVariables, id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var direction: JsonField<TransactionDirection> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<List<ReconciliationRuleVariable>> =
                    JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                ) = apply {
                    this.amountUpperBound = expectedPaymentUpdateRequestWithId.amountUpperBound
                    this.amountLowerBound = expectedPaymentUpdateRequestWithId.amountLowerBound
                    this.direction = expectedPaymentUpdateRequestWithId.direction
                    this.internalAccountId = expectedPaymentUpdateRequestWithId.internalAccountId
                    this.type = expectedPaymentUpdateRequestWithId.type
                    this.currency = expectedPaymentUpdateRequestWithId.currency
                    this.dateUpperBound = expectedPaymentUpdateRequestWithId.dateUpperBound
                    this.dateLowerBound = expectedPaymentUpdateRequestWithId.dateLowerBound
                    this.description = expectedPaymentUpdateRequestWithId.description
                    this.statementDescriptor =
                        expectedPaymentUpdateRequestWithId.statementDescriptor
                    this.metadata = expectedPaymentUpdateRequestWithId.metadata
                    this.counterpartyId = expectedPaymentUpdateRequestWithId.counterpartyId
                    this.remittanceInformation =
                        expectedPaymentUpdateRequestWithId.remittanceInformation
                    this.reconciliationGroups =
                        expectedPaymentUpdateRequestWithId.reconciliationGroups
                    this.reconciliationFilters =
                        expectedPaymentUpdateRequestWithId.reconciliationFilters
                    this.reconciliationRuleVariables =
                        expectedPaymentUpdateRequestWithId.reconciliationRuleVariables
                    this.id = expectedPaymentUpdateRequestWithId.id
                    additionalProperties(expectedPaymentUpdateRequestWithId.additionalProperties)
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(JsonField.of(amountUpperBound))

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_upper_bound")
                @ExcludeMissing
                fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(JsonField.of(amountLowerBound))

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_lower_bound")
                @ExcludeMissing
                fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<TransactionDirection>) = apply {
                    this.direction = direction
                }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String) =
                    internalAccountId(JsonField.of(internalAccountId))

                /** The ID of the Internal Account for the expected payment. */
                @JsonProperty("internal_account_id")
                @ExcludeMissing
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType) = type(JsonField.of(type))

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate) =
                    dateUpperBound(JsonField.of(dateUpperBound))

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_upper_bound")
                @ExcludeMissing
                fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate) =
                    dateLowerBound(JsonField.of(dateLowerBound))

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_lower_bound")
                @ExcludeMissing
                fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** An optional description for internal use. */
                fun description(description: String) = description(JsonField.of(description))

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String) =
                    statementDescriptor(JsonField.of(statementDescriptor))

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String) =
                    counterpartyId(JsonField.of(counterpartyId))

                /** The ID of the counterparty you expect for this payment. */
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The reconciliation groups you have for this payment. */
                @JsonProperty("reconciliation_groups")
                @ExcludeMissing
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** The reconciliation filters you have for this payment. */
                @JsonProperty("reconciliation_filters")
                @ExcludeMissing
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRuleVariable>
                ) = reconciliationRuleVariables(JsonField.of(reconciliationRuleVariables))

                /** An array of reconciliation rule variables for this payment. */
                @JsonProperty("reconciliation_rule_variables")
                @ExcludeMissing
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: JsonField<List<ReconciliationRuleVariable>>
                ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ExpectedPaymentUpdateRequestWithId =
                    ExpectedPaymentUpdateRequestWithId(
                        amountUpperBound,
                        amountLowerBound,
                        direction,
                        internalAccountId,
                        type,
                        currency,
                        dateUpperBound,
                        dateLowerBound,
                        description,
                        statementDescriptor,
                        metadata,
                        counterpartyId,
                        remittanceInformation,
                        reconciliationGroups,
                        reconciliationFilters,
                        reconciliationRuleVariables.map { it.toUnmodifiable() },
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            @JsonDeserialize(builder = ReconciliationRuleVariable.Builder::class)
            @NoAutoDetect
            class ReconciliationRuleVariable
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ReconciliationRuleVariable = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReconciliationRuleVariable &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "ReconciliationRuleVariable{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(reconciliationRuleVariable: ReconciliationRuleVariable) =
                        apply {
                            additionalProperties(reconciliationRuleVariable.additionalProperties)
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ReconciliationRuleVariable =
                        ReconciliationRuleVariable(additionalProperties.toUnmodifiable())
                }
            }
        }

        @JsonDeserialize(builder = TransactionUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class TransactionUpdateRequestWithId
        private constructor(
            private val metadata: JsonField<Metadata>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            fun id(): String? = id.getNullable("id")

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TransactionUpdateRequestWithId = apply {
                if (!validated) {
                    metadata()?.validate()
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TransactionUpdateRequestWithId &&
                    this.metadata == other.metadata &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            metadata,
                            id,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "TransactionUpdateRequestWithId{metadata=$metadata, id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transactionUpdateRequestWithId: TransactionUpdateRequestWithId) =
                    apply {
                        this.metadata = transactionUpdateRequestWithId.metadata
                        this.id = transactionUpdateRequestWithId.id
                        additionalProperties(transactionUpdateRequestWithId.additionalProperties)
                    }

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TransactionUpdateRequestWithId =
                    TransactionUpdateRequestWithId(
                        metadata,
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }
        }

        @JsonDeserialize(builder = LedgerTransactionUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class LedgerTransactionUpdateRequestWithId
        private constructor(
            private val description: JsonField<String>,
            private val status: JsonField<Status>,
            private val metadata: JsonField<Metadata>,
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** An optional description for internal use. */
            fun description(): String? = description.getNullable("description")

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(): Status? = status.getNullable("status")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

            /** An array of ledger entry objects. */
            fun ledgerEntries(): List<LedgerEntryCreateRequest>? =
                ledgerEntries.getNullable("ledger_entries")

            fun id(): String? = id.getNullable("id")

            /** An optional description for internal use. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") @ExcludeMissing fun _status() = status

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LedgerTransactionUpdateRequestWithId = apply {
                if (!validated) {
                    description()
                    status()
                    metadata()?.validate()
                    effectiveAt()
                    ledgerEntries()?.forEach { it.validate() }
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerTransactionUpdateRequestWithId &&
                    this.description == other.description &&
                    this.status == other.status &&
                    this.metadata == other.metadata &&
                    this.effectiveAt == other.effectiveAt &&
                    this.ledgerEntries == other.ledgerEntries &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            description,
                            status,
                            metadata,
                            effectiveAt,
                            ledgerEntries,
                            id,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerTransactionUpdateRequestWithId{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var description: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> =
                    JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                ) = apply {
                    this.description = ledgerTransactionUpdateRequestWithId.description
                    this.status = ledgerTransactionUpdateRequestWithId.status
                    this.metadata = ledgerTransactionUpdateRequestWithId.metadata
                    this.effectiveAt = ledgerTransactionUpdateRequestWithId.effectiveAt
                    this.ledgerEntries = ledgerTransactionUpdateRequestWithId.ledgerEntries
                    this.id = ledgerTransactionUpdateRequestWithId.id
                    additionalProperties(ledgerTransactionUpdateRequestWithId.additionalProperties)
                }

                /** An optional description for internal use. */
                fun description(description: String) = description(JsonField.of(description))

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status) = status(JsonField.of(status))

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                @ExcludeMissing
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                    apply {
                        this.ledgerEntries = ledgerEntries
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerTransactionUpdateRequestWithId =
                    LedgerTransactionUpdateRequestWithId(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        ledgerEntries.map { it.toUnmodifiable() },
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerEntryCreateRequest
            private constructor(
                private val amount: JsonField<Long>,
                private val direction: JsonField<TransactionDirection>,
                private val ledgerAccountId: JsonField<String>,
                private val lockVersion: JsonField<Long>,
                private val pendingBalanceAmount: JsonField<PendingBalanceAmount>,
                private val postedBalanceAmount: JsonField<PostedBalanceAmount>,
                private val availableBalanceAmount: JsonField<AvailableBalanceAmount>,
                private val showResultingLedgerAccountBalances: JsonField<Boolean>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(): TransactionDirection = direction.getRequired("direction")

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(): Long? = lockVersion.getNullable("lock_version")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(): PendingBalanceAmount? =
                    pendingBalanceAmount.getNullable("pending_balance_amount")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(): PostedBalanceAmount? =
                    postedBalanceAmount.getNullable("posted_balance_amount")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(): AvailableBalanceAmount? =
                    availableBalanceAmount.getNullable("available_balance_amount")

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(): Boolean? =
                    showResultingLedgerAccountBalances.getNullable(
                        "show_resulting_ledger_account_balances"
                    )

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                fun _ledgerAccountId() = ledgerAccountId

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version") @ExcludeMissing fun _lockVersion() = lockVersion

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                @ExcludeMissing
                fun _pendingBalanceAmount() = pendingBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                @ExcludeMissing
                fun _postedBalanceAmount() = postedBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                @ExcludeMissing
                fun _availableBalanceAmount() = availableBalanceAmount

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                @ExcludeMissing
                fun _showResultingLedgerAccountBalances() = showResultingLedgerAccountBalances

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LedgerEntryCreateRequest = apply {
                    if (!validated) {
                        amount()
                        direction()
                        ledgerAccountId()
                        lockVersion()
                        pendingBalanceAmount()?.validate()
                        postedBalanceAmount()?.validate()
                        availableBalanceAmount()?.validate()
                        showResultingLedgerAccountBalances()
                        metadata()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerEntryCreateRequest &&
                        this.amount == other.amount &&
                        this.direction == other.direction &&
                        this.ledgerAccountId == other.ledgerAccountId &&
                        this.lockVersion == other.lockVersion &&
                        this.pendingBalanceAmount == other.pendingBalanceAmount &&
                        this.postedBalanceAmount == other.postedBalanceAmount &&
                        this.availableBalanceAmount == other.availableBalanceAmount &&
                        this.showResultingLedgerAccountBalances ==
                            other.showResultingLedgerAccountBalances &&
                        this.metadata == other.metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                direction,
                                ledgerAccountId,
                                lockVersion,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                availableBalanceAmount,
                                showResultingLedgerAccountBalances,
                                metadata,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var direction: JsonField<TransactionDirection> = JsonMissing.of()
                    private var ledgerAccountId: JsonField<String> = JsonMissing.of()
                    private var lockVersion: JsonField<Long> = JsonMissing.of()
                    private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                        JsonMissing.of()
                    private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                        JsonMissing.of()
                    private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                        JsonMissing.of()
                    private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        this.amount = ledgerEntryCreateRequest.amount
                        this.direction = ledgerEntryCreateRequest.direction
                        this.ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        this.lockVersion = ledgerEntryCreateRequest.lockVersion
                        this.pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        this.postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        this.availableBalanceAmount =
                            ledgerEntryCreateRequest.availableBalanceAmount
                        this.showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        this.metadata = ledgerEntryCreateRequest.metadata
                        additionalProperties(ledgerEntryCreateRequest.additionalProperties)
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: TransactionDirection) =
                        direction(JsonField.of(direction))

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun direction(direction: JsonField<TransactionDirection>) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: String) =
                        ledgerAccountId(JsonField.of(ledgerAccountId))

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long) = lockVersion(JsonField.of(lockVersion))

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    @ExcludeMissing
                    fun lockVersion(lockVersion: JsonField<Long>) = apply {
                        this.lockVersion = lockVersion
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) =
                        pendingBalanceAmount(JsonField.of(pendingBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    fun pendingBalanceAmount(
                        pendingBalanceAmount: JsonField<PendingBalanceAmount>
                    ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) =
                        postedBalanceAmount(JsonField.of(postedBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    fun postedBalanceAmount(postedBalanceAmount: JsonField<PostedBalanceAmount>) =
                        apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                        availableBalanceAmount(JsonField.of(availableBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    fun availableBalanceAmount(
                        availableBalanceAmount: JsonField<AvailableBalanceAmount>
                    ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) =
                        showResultingLedgerAccountBalances(
                            JsonField.of(showResultingLedgerAccountBalances)
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: JsonField<Boolean>
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LedgerEntryCreateRequest =
                        LedgerEntryCreateRequest(
                            amount,
                            direction,
                            ledgerAccountId,
                            lockVersion,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            availableBalanceAmount,
                            showResultingLedgerAccountBalances,
                            metadata,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                @NoAutoDetect
                class AvailableBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AvailableBalanceAmount = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AvailableBalanceAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AvailableBalanceAmount{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                            additionalProperties(availableBalanceAmount.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AvailableBalanceAmount =
                            AvailableBalanceAmount(additionalProperties.toUnmodifiable())
                    }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Metadata = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties(metadata.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                    }
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                @NoAutoDetect
                class PendingBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PendingBalanceAmount = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PendingBalanceAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PendingBalanceAmount{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                            additionalProperties(pendingBalanceAmount.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PendingBalanceAmount =
                            PendingBalanceAmount(additionalProperties.toUnmodifiable())
                    }
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                @NoAutoDetect
                class PostedBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PostedBalanceAmount = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PostedBalanceAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PostedBalanceAmount{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                            additionalProperties(postedBalanceAmount.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PostedBalanceAmount =
                            PostedBalanceAmount(additionalProperties.toUnmodifiable())
                    }
                }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Status && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ARCHIVED = Status(JsonField.of("archived"))

                    val PENDING = Status(JsonField.of("pending"))

                    val POSTED = Status(JsonField.of("posted"))

                    fun of(value: String) = Status(JsonField.of(value))
                }

                enum class Known {
                    ARCHIVED,
                    PENDING,
                    POSTED,
                }

                enum class Value {
                    ARCHIVED,
                    PENDING,
                    POSTED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ARCHIVED -> Value.ARCHIVED
                        PENDING -> Value.PENDING
                        POSTED -> Value.POSTED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ARCHIVED -> Known.ARCHIVED
                        PENDING -> Known.PENDING
                        POSTED -> Known.POSTED
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
