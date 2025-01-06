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
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class BulkRequestCreateParams
constructor(
    private val body: BulkRequestCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** One of create, or update. */
    fun actionType(): ActionType = body.actionType()

    /** One of payment_order, expected_payment, or ledger_transaction. */
    fun resourceType(): ResourceType = body.resourceType()

    /**
     * An array of objects where each object contains the input params for a single `action_type`
     * request on a `resource_type` resource
     */
    fun resources(): List<Resource> = body.resources()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): BulkRequestCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BulkRequestCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("action_type") private val actionType: ActionType,
        @JsonProperty("resource_type") private val resourceType: ResourceType,
        @JsonProperty("resources") private val resources: List<Resource>,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** One of create, or update. */
        @JsonProperty("action_type") fun actionType(): ActionType = actionType

        /** One of payment_order, expected_payment, or ledger_transaction. */
        @JsonProperty("resource_type") fun resourceType(): ResourceType = resourceType

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        @JsonProperty("resources") fun resources(): List<Resource> = resources

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var actionType: ActionType? = null
            private var resourceType: ResourceType? = null
            private var resources: MutableList<Resource>? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bulkRequestCreateBody: BulkRequestCreateBody) = apply {
                actionType = bulkRequestCreateBody.actionType
                resourceType = bulkRequestCreateBody.resourceType
                resources = bulkRequestCreateBody.resources.toMutableList()
                metadata = bulkRequestCreateBody.metadata
                additionalProperties = bulkRequestCreateBody.additionalProperties.toMutableMap()
            }

            /** One of create, or update. */
            fun actionType(actionType: ActionType) = apply { this.actionType = actionType }

            /** One of payment_order, expected_payment, or ledger_transaction. */
            fun resourceType(resourceType: ResourceType) = apply {
                this.resourceType = resourceType
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun resources(resources: List<Resource>) = apply {
                this.resources = resources.toMutableList()
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(resource: Resource) = apply {
                resources = (resources ?: mutableListOf()).apply { add(resource) }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

            fun build(): BulkRequestCreateBody =
                BulkRequestCreateBody(
                    checkNotNull(actionType) { "`actionType` is required but was not set" },
                    checkNotNull(resourceType) { "`resourceType` is required but was not set" },
                    checkNotNull(resources) { "`resources` is required but was not set" }
                        .toImmutable(),
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BulkRequestCreateBody && actionType == other.actionType && resourceType == other.resourceType && resources == other.resources && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(actionType, resourceType, resources, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BulkRequestCreateBody{actionType=$actionType, resourceType=$resourceType, resources=$resources, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: BulkRequestCreateBody.Builder = BulkRequestCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(bulkRequestCreateParams: BulkRequestCreateParams) = apply {
            body = bulkRequestCreateParams.body.toBuilder()
            additionalHeaders = bulkRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bulkRequestCreateParams.additionalQueryParams.toBuilder()
        }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = apply { body.actionType(actionType) }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = apply { body.resourceType(resourceType) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(resources: List<Resource>) = apply { body.resources(resources) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(resource: Resource) = apply { body.addResource(resource) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

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

        fun build(): BulkRequestCreateParams =
            BulkRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ActionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREATE = of("create")

            val UPDATE = of("update")

            val DELETE = of("delete")

            fun of(value: String) = ActionType(JsonField.of(value))
        }

        enum class Known {
            CREATE,
            UPDATE,
            DELETE,
        }

        enum class Value {
            CREATE,
            UPDATE,
            DELETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                else -> throw ModernTreasuryInvalidDataException("Unknown ActionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ResourceType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PAYMENT_ORDER = of("payment_order")

            val LEDGER_TRANSACTION = of("ledger_transaction")

            val TRANSACTION = of("transaction")

            val EXPECTED_PAYMENT = of("expected_payment")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Resource && paymentOrderAsyncCreateRequest == other.paymentOrderAsyncCreateRequest && expectedPaymentCreateRequest == other.expectedPaymentCreateRequest && ledgerTransactionCreateRequest == other.ledgerTransactionCreateRequest && transactionCreateRequest == other.transactionCreateRequest && id == other.id && paymentOrderUpdateRequestWithId == other.paymentOrderUpdateRequestWithId && expectedPaymentUpdateRequestWithId == other.expectedPaymentUpdateRequestWithId && transactionUpdateRequestWithId == other.transactionUpdateRequestWithId && ledgerTransactionUpdateRequestWithId == other.ledgerTransactionUpdateRequestWithId /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrderAsyncCreateRequest, expectedPaymentCreateRequest, ledgerTransactionCreateRequest, transactionCreateRequest, id, paymentOrderUpdateRequestWithId, expectedPaymentUpdateRequestWithId, transactionUpdateRequestWithId, ledgerTransactionUpdateRequestWithId) /* spotless:on */

        override fun toString(): String =
            when {
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

                tryDeserialize(node, jacksonTypeRef<PaymentOrderAsyncCreateRequest>())?.let {
                    return Resource(paymentOrderAsyncCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentCreateRequest>())?.let {
                    return Resource(expectedPaymentCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionCreateRequest>())?.let {
                    return Resource(ledgerTransactionCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<TransactionCreateRequest>())?.let {
                    return Resource(transactionCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Id>())?.let {
                    return Resource(id = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<PaymentOrderUpdateRequestWithId>())?.let {
                    return Resource(paymentOrderUpdateRequestWithId = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentUpdateRequestWithId>())?.let {
                    return Resource(expectedPaymentUpdateRequestWithId = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<TransactionUpdateRequestWithId>())?.let {
                    return Resource(transactionUpdateRequestWithId = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionUpdateRequestWithId>())?.let {
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

        @NoAutoDetect
        class PaymentOrderAsyncCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Long,
            @JsonProperty("direction") private val direction: Direction,
            @JsonProperty("originating_account_id") private val originatingAccountId: String,
            @JsonProperty("type") private val type: PaymentOrderType,
            @JsonProperty("accounting") private val accounting: Accounting?,
            @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
            @JsonProperty("accounting_ledger_class_id")
            private val accountingLedgerClassId: String?,
            @JsonProperty("charge_bearer") private val chargeBearer: ChargeBearer?,
            @JsonProperty("currency") private val currency: Currency?,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
            @JsonProperty("expires_at") private val expiresAt: OffsetDateTime?,
            @JsonProperty("fallback_type") private val fallbackType: FallbackType?,
            @JsonProperty("foreign_exchange_contract") private val foreignExchangeContract: String?,
            @JsonProperty("foreign_exchange_indicator")
            private val foreignExchangeIndicator: ForeignExchangeIndicator?,
            @JsonProperty("ledger_transaction")
            private val ledgerTransaction: LedgerTransactionCreateRequest?,
            @JsonProperty("ledger_transaction_id") private val ledgerTransactionId: String?,
            @JsonProperty("line_items") private val lineItems: List<LineItemRequest>?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("nsf_protected") private val nsfProtected: Boolean?,
            @JsonProperty("originating_party_name") private val originatingPartyName: String?,
            @JsonProperty("priority") private val priority: Priority?,
            @JsonProperty("process_after") private val processAfter: OffsetDateTime?,
            @JsonProperty("purpose") private val purpose: String?,
            @JsonProperty("receiving_account") private val receivingAccount: ReceivingAccount?,
            @JsonProperty("receiving_account_id") private val receivingAccountId: String?,
            @JsonProperty("remittance_information") private val remittanceInformation: String?,
            @JsonProperty("send_remittance_advice") private val sendRemittanceAdvice: Boolean?,
            @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
            @JsonProperty("subtype") private val subtype: PaymentOrderSubtype?,
            @JsonProperty("transaction_monitoring_enabled")
            private val transactionMonitoringEnabled: Boolean?,
            @JsonProperty("ultimate_originating_party_identifier")
            private val ultimateOriginatingPartyIdentifier: String?,
            @JsonProperty("ultimate_originating_party_name")
            private val ultimateOriginatingPartyName: String?,
            @JsonProperty("ultimate_receiving_party_identifier")
            private val ultimateReceivingPartyIdentifier: String?,
            @JsonProperty("ultimate_receiving_party_name")
            private val ultimateReceivingPartyName: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") fun amount(): Long = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") fun direction(): Direction = direction

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(): String = originatingAccountId

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") fun type(): PaymentOrderType = type

            @JsonProperty("accounting") fun accounting(): Accounting? = accounting

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(): String? = accountingCategoryId

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            fun accountingLedgerClassId(): String? = accountingLedgerClassId

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer") fun chargeBearer(): ChargeBearer? = chargeBearer

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency") fun currency(): Currency? = currency

            /** An optional description for internal use. */
            @JsonProperty("description") fun description(): String? = description

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type") fun fallbackType(): FallbackType? = fallbackType

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            fun foreignExchangeContract(): String? = foreignExchangeContract

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            fun foreignExchangeIndicator(): ForeignExchangeIndicator? = foreignExchangeIndicator

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            fun ledgerTransactionId(): String? = ledgerTransactionId

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected") fun nsfProtected(): Boolean? = nsfProtected

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            fun originatingPartyName(): String? = originatingPartyName

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority") fun priority(): Priority? = priority

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after") fun processAfter(): OffsetDateTime? = processAfter

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            @JsonProperty("purpose") fun purpose(): String? = purpose

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            fun receivingAccount(): ReceivingAccount? = receivingAccount

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(): String? = receivingAccountId

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): String? = remittanceInformation

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): String? = statementDescriptor

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype") fun subtype(): PaymentOrderSubtype? = subtype

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            @JsonProperty("transaction_monitoring_enabled")
            fun transactionMonitoringEnabled(): Boolean? = transactionMonitoringEnabled

            /** Identifier of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_identifier")
            fun ultimateOriginatingPartyIdentifier(): String? = ultimateOriginatingPartyIdentifier

            /** Name of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_name")
            fun ultimateOriginatingPartyName(): String? = ultimateOriginatingPartyName

            /** Identifier of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_identifier")
            fun ultimateReceivingPartyIdentifier(): String? = ultimateReceivingPartyIdentifier

            /** Name of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_name")
            fun ultimateReceivingPartyName(): String? = ultimateReceivingPartyName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var direction: Direction? = null
                private var originatingAccountId: String? = null
                private var type: PaymentOrderType? = null
                private var accounting: Accounting? = null
                private var accountingCategoryId: String? = null
                private var accountingLedgerClassId: String? = null
                private var chargeBearer: ChargeBearer? = null
                private var currency: Currency? = null
                private var description: String? = null
                private var effectiveDate: LocalDate? = null
                private var expiresAt: OffsetDateTime? = null
                private var fallbackType: FallbackType? = null
                private var foreignExchangeContract: String? = null
                private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
                private var ledgerTransaction: LedgerTransactionCreateRequest? = null
                private var ledgerTransactionId: String? = null
                private var lineItems: MutableList<LineItemRequest>? = null
                private var metadata: Metadata? = null
                private var nsfProtected: Boolean? = null
                private var originatingPartyName: String? = null
                private var priority: Priority? = null
                private var processAfter: OffsetDateTime? = null
                private var purpose: String? = null
                private var receivingAccount: ReceivingAccount? = null
                private var receivingAccountId: String? = null
                private var remittanceInformation: String? = null
                private var sendRemittanceAdvice: Boolean? = null
                private var statementDescriptor: String? = null
                private var subtype: PaymentOrderSubtype? = null
                private var transactionMonitoringEnabled: Boolean? = null
                private var ultimateOriginatingPartyIdentifier: String? = null
                private var ultimateOriginatingPartyName: String? = null
                private var ultimateReceivingPartyIdentifier: String? = null
                private var ultimateReceivingPartyName: String? = null
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
                        lineItems = paymentOrderAsyncCreateRequest.lineItems?.toMutableList()
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
                fun amount(amount: Long) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = apply { this.direction = direction }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = apply { this.type = type }

                fun accounting(accounting: Accounting?) = apply { this.accounting = accounting }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(accountingCategoryId: String?) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingLedgerClassId(accountingLedgerClassId: String?) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer?) = apply {
                    this.chargeBearer = chargeBearer
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency?) = apply { this.currency = currency }

                /** An optional description for internal use. */
                fun description(description: String?) = apply { this.description = description }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate?) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) = apply { this.expiresAt = expiresAt }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType?) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String?) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                    apply {
                        this.foreignExchangeIndicator = foreignExchangeIndicator
                    }

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest?) = apply {
                    this.ledgerTransaction = ledgerTransaction
                }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon payment order creation. Once the
                 * payment order is created, the status of the ledger transaction tracks the payment
                 * order automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: String?) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>?) = apply {
                    this.lineItems = lineItems?.toMutableList()
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems = (lineItems ?: mutableListOf()).apply { add(lineItem) }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean?) = apply {
                    this.nsfProtected = nsfProtected
                }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(nsfProtected as Boolean?)

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String?) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority?) = apply { this.priority = priority }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime?) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String?) = apply { this.purpose = purpose }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount?) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String?) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String?) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype?) = apply { this.subtype = subtype }

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean?) = apply {
                    this.transactionMonitoringEnabled = transactionMonitoringEnabled
                }

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) =
                    transactionMonitoringEnabled(transactionMonitoringEnabled as Boolean?)

                /** Identifier of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: String?
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /** Name of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) = apply {
                    this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                }

                /** Identifier of the ultimate funds recipient. */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                    apply {
                        this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                    }

                /** Name of the ultimate funds recipient. */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) = apply {
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

                fun build(): PaymentOrderAsyncCreateRequest =
                    PaymentOrderAsyncCreateRequest(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(originatingAccountId) {
                            "`originatingAccountId` is required but was not set"
                        },
                        checkNotNull(type) { "`type` is required but was not set" },
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
                        lineItems?.toImmutable(),
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
                        additionalProperties.toImmutable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @NoAutoDetect
            class Accounting
            @JsonCreator
            private constructor(
                @JsonProperty("account_id") private val accountId: String?,
                @JsonProperty("class_id") private val classId: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id") fun accountId(): String? = accountId

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id") fun classId(): String? = classId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountId: String? = null
                    private var classId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(accounting: Accounting) = apply {
                        accountId = accounting.accountId
                        classId = accounting.classId
                        additionalProperties = accounting.additionalProperties.toMutableMap()
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: String?) = apply { this.accountId = accountId }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: String?) = apply { this.classId = classId }

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

                    fun build(): Accounting =
                        Accounting(
                            accountId,
                            classId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Accounting && accountId == other.accountId && classId == other.classId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
            }

            class ChargeBearer
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val SHARED = of("shared")

                    val SENDER = of("sender")

                    val RECEIVER = of("receiver")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class FallbackType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FIXED_TO_VARIABLE = of("fixed_to_variable")

                    val VARIABLE_TO_FIXED = of("variable_to_fixed")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("ledger_entries")
                private val ledgerEntries: List<LedgerEntryCreateRequest>,
                @JsonProperty("description") private val description: String?,
                @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
                @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
                @JsonProperty("external_id") private val externalId: String?,
                @JsonProperty("ledgerable_id") private val ledgerableId: String?,
                @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("status") private val status: Status?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

                /** An optional description for internal use. */
                @JsonProperty("description") fun description(): String? = description

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id") fun externalId(): String? = externalId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(): LedgerableType? = ledgerableType

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") fun status(): Status? = status

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var ledgerEntries: MutableList<LedgerEntryCreateRequest>? = null
                    private var description: String? = null
                    private var effectiveAt: OffsetDateTime? = null
                    private var effectiveDate: LocalDate? = null
                    private var externalId: String? = null
                    private var ledgerableId: String? = null
                    private var ledgerableType: LedgerableType? = null
                    private var metadata: Metadata? = null
                    private var status: Status? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
                        description = ledgerTransactionCreateRequest.description
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        metadata = ledgerTransactionCreateRequest.metadata
                        status = ledgerTransactionCreateRequest.status
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                        this.ledgerEntries = ledgerEntries.toMutableList()
                    }

                    /** An array of ledger entry objects. */
                    fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                        ledgerEntries =
                            (ledgerEntries ?: mutableListOf()).apply { add(ledgerEntry) }
                    }

                    /** An optional description for internal use. */
                    fun description(description: String?) = apply { this.description = description }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime?) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: LocalDate?) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: String?) = apply { this.externalId = externalId }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: String?) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: Status?) = apply { this.status = status }

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

                    fun build(): LedgerTransactionCreateRequest =
                        LedgerTransactionCreateRequest(
                            checkNotNull(ledgerEntries) {
                                    "`ledgerEntries` is required but was not set"
                                }
                                .toImmutable(),
                            description,
                            effectiveAt,
                            effectiveDate,
                            externalId,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            status,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LedgerEntryCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("amount") private val amount: Long,
                    @JsonProperty("direction") private val direction: TransactionDirection,
                    @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
                    @JsonProperty("available_balance_amount")
                    private val availableBalanceAmount: AvailableBalanceAmount?,
                    @JsonProperty("lock_version") private val lockVersion: Long?,
                    @JsonProperty("metadata") private val metadata: Metadata?,
                    @JsonProperty("pending_balance_amount")
                    private val pendingBalanceAmount: PendingBalanceAmount?,
                    @JsonProperty("posted_balance_amount")
                    private val postedBalanceAmount: PostedBalanceAmount?,
                    @JsonProperty("show_resulting_ledger_account_balances")
                    private val showResultingLedgerAccountBalances: Boolean?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") fun amount(): Long = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction") fun direction(): TransactionDirection = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    fun ledgerAccountId(): String = ledgerAccountId

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    fun showResultingLedgerAccountBalances(): Boolean? =
                        showResultingLedgerAccountBalances

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: Long? = null
                        private var direction: TransactionDirection? = null
                        private var ledgerAccountId: String? = null
                        private var availableBalanceAmount: AvailableBalanceAmount? = null
                        private var lockVersion: Long? = null
                        private var metadata: Metadata? = null
                        private var pendingBalanceAmount: PendingBalanceAmount? = null
                        private var postedBalanceAmount: PostedBalanceAmount? = null
                        private var showResultingLedgerAccountBalances: Boolean? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                amount = ledgerEntryCreateRequest.amount
                                direction = ledgerEntryCreateRequest.direction
                                ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                lockVersion = ledgerEntryCreateRequest.lockVersion
                                metadata = ledgerEntryCreateRequest.metadata
                                pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                                postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                                showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                additionalProperties =
                                    ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: Long) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: TransactionDirection) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: String) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: AvailableBalanceAmount?
                        ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long?) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                            apply {
                                this.pendingBalanceAmount = pendingBalanceAmount
                            }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean?
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) =
                            showResultingLedgerAccountBalances(
                                showResultingLedgerAccountBalances as Boolean?
                            )

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

                        fun build(): LedgerEntryCreateRequest =
                            LedgerEntryCreateRequest(
                                checkNotNull(amount) { "`amount` is required but was not set" },
                                checkNotNull(direction) {
                                    "`direction` is required but was not set"
                                },
                                checkNotNull(ledgerAccountId) {
                                    "`ledgerAccountId` is required but was not set"
                                },
                                availableBalanceAmount,
                                lockVersion,
                                metadata,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                showResultingLedgerAccountBalances,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(availableBalanceAmount: AvailableBalanceAmount) =
                                apply {
                                    additionalProperties =
                                        availableBalanceAmount.additionalProperties.toMutableMap()
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

                            fun build(): AvailableBalanceAmount =
                                AvailableBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

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

                            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class PendingBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                                additionalProperties =
                                    pendingBalanceAmount.additionalProperties.toMutableMap()
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

                            fun build(): PendingBalanceAmount =
                                PendingBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class PostedBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                                additionalProperties =
                                    postedBalanceAmount.additionalProperties.toMutableMap()
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

                            fun build(): PostedBalanceAmount =
                                PostedBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
                }

                class LedgerableType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val EXPECTED_PAYMENT = of("expected_payment")

                        val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

                        val PAPER_ITEM = of("paper_item")

                        val PAYMENT_ORDER = of("payment_order")

                        val RETURN = of("return")

                        val REVERSAL = of("reversal")

                        fun of(value: String) = LedgerableType(JsonField.of(value))
                    }

                    enum class Known {
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        RETURN,
                        REVERSAL,
                    }

                    enum class Value {
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        RETURN,
                        REVERSAL,
                        _UNKNOWN,
                    }

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

                    fun asString(): String = _value().asStringOrThrow()

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
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                class Status
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ARCHIVED = of("archived")

                        val PENDING = of("pending")

                        val POSTED = of("posted")

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

                    return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class LineItemRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Long,
                @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
                @JsonProperty("description") private val description: String?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(): String? = accountingCategoryId

                /** A free-form description of the line item. */
                @JsonProperty("description") fun description(): String? = description

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var accountingCategoryId: String? = null
                    private var description: String? = null
                    private var metadata: Metadata? = null
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
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) = apply { this.description = description }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            class Priority
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val HIGH = of("high")

                    val NORMAL = of("normal")

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
            @NoAutoDetect
            class ReceivingAccount
            @JsonCreator
            private constructor(
                @JsonProperty("account_details") private val accountDetails: List<AccountDetail>?,
                @JsonProperty("account_type") private val accountType: ExternalAccountType?,
                @JsonProperty("contact_details")
                private val contactDetails: List<ContactDetailCreateRequest>?,
                @JsonProperty("ledger_account")
                private val ledgerAccount: LedgerAccountCreateRequest?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("name") private val name: String?,
                @JsonProperty("party_address") private val partyAddress: AddressRequest?,
                @JsonProperty("party_identifier") private val partyIdentifier: String?,
                @JsonProperty("party_name") private val partyName: String?,
                @JsonProperty("party_type") private val partyType: PartyType?,
                @JsonProperty("plaid_processor_token") private val plaidProcessorToken: String?,
                @JsonProperty("routing_details") private val routingDetails: List<RoutingDetail>?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("account_details")
                fun accountDetails(): List<AccountDetail>? = accountDetails

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

                @JsonProperty("contact_details")
                fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account")
                fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") fun name(): String? = name

                /** Required if receiving wire payments. */
                @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

                @JsonProperty("party_identifier") fun partyIdentifier(): String? = partyIdentifier

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name") fun partyName(): String? = partyName

                /** Either `individual` or `business`. */
                @JsonProperty("party_type") fun partyType(): PartyType? = partyType

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                fun plaidProcessorToken(): String? = plaidProcessorToken

                @JsonProperty("routing_details")
                fun routingDetails(): List<RoutingDetail>? = routingDetails

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountDetails: MutableList<AccountDetail>? = null
                    private var accountType: ExternalAccountType? = null
                    private var contactDetails: MutableList<ContactDetailCreateRequest>? = null
                    private var ledgerAccount: LedgerAccountCreateRequest? = null
                    private var metadata: Metadata? = null
                    private var name: String? = null
                    private var partyAddress: AddressRequest? = null
                    private var partyIdentifier: String? = null
                    private var partyName: String? = null
                    private var partyType: PartyType? = null
                    private var plaidProcessorToken: String? = null
                    private var routingDetails: MutableList<RoutingDetail>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountDetails = receivingAccount.accountDetails?.toMutableList()
                        accountType = receivingAccount.accountType
                        contactDetails = receivingAccount.contactDetails?.toMutableList()
                        ledgerAccount = receivingAccount.ledgerAccount
                        metadata = receivingAccount.metadata
                        name = receivingAccount.name
                        partyAddress = receivingAccount.partyAddress
                        partyIdentifier = receivingAccount.partyIdentifier
                        partyName = receivingAccount.partyName
                        partyType = receivingAccount.partyType
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        routingDetails = receivingAccount.routingDetails?.toMutableList()
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    fun accountDetails(accountDetails: List<AccountDetail>?) = apply {
                        this.accountDetails = accountDetails?.toMutableList()
                    }

                    fun addAccountDetail(accountDetail: AccountDetail) = apply {
                        accountDetails =
                            (accountDetails ?: mutableListOf()).apply { add(accountDetail) }
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType?) = apply {
                        this.accountType = accountType
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>?) = apply {
                        this.contactDetails = contactDetails?.toMutableList()
                    }

                    fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                        contactDetails =
                            (contactDetails ?: mutableListOf()).apply { add(contactDetail) }
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest?) = apply {
                        this.ledgerAccount = ledgerAccount
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String?) = apply { this.name = name }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest?) = apply {
                        this.partyAddress = partyAddress
                    }

                    fun partyIdentifier(partyIdentifier: String?) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String?) = apply { this.partyName = partyName }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType?) = apply { this.partyType = partyType }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String?) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>?) = apply {
                        this.routingDetails = routingDetails?.toMutableList()
                    }

                    fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                        routingDetails =
                            (routingDetails ?: mutableListOf()).apply { add(routingDetail) }
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

                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            accountDetails?.toImmutable(),
                            accountType,
                            contactDetails?.toImmutable(),
                            ledgerAccount,
                            metadata,
                            name,
                            partyAddress,
                            partyIdentifier,
                            partyName,
                            partyType,
                            plaidProcessorToken,
                            routingDetails?.toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AccountDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("account_number") private val accountNumber: String,
                    @JsonProperty("account_number_type")
                    private val accountNumberType: AccountNumberType?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("account_number") fun accountNumber(): String = accountNumber

                    @JsonProperty("account_number_type")
                    fun accountNumberType(): AccountNumberType? = accountNumberType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var accountNumber: String? = null
                        private var accountNumberType: AccountNumberType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        fun accountNumber(accountNumber: String) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType?) = apply {
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

                        fun build(): AccountDetail =
                            AccountDetail(
                                checkNotNull(accountNumber) {
                                    "`accountNumber` is required but was not set"
                                },
                                accountNumberType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AccountNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AU_NUMBER = of("au_number")

                            val CLABE = of("clabe")

                            val HK_NUMBER = of("hk_number")

                            val IBAN = of("iban")

                            val ID_NUMBER = of("id_number")

                            val NZ_NUMBER = of("nz_number")

                            val OTHER = of("other")

                            val PAN = of("pan")

                            val SG_NUMBER = of("sg_number")

                            val WALLET_ADDRESS = of("wallet_address")

                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                        }

                        enum class Value {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AU_NUMBER -> Value.AU_NUMBER
                                CLABE -> Value.CLABE
                                HK_NUMBER -> Value.HK_NUMBER
                                IBAN -> Value.IBAN
                                ID_NUMBER -> Value.ID_NUMBER
                                NZ_NUMBER -> Value.NZ_NUMBER
                                OTHER -> Value.OTHER
                                PAN -> Value.PAN
                                SG_NUMBER -> Value.SG_NUMBER
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AU_NUMBER -> Known.AU_NUMBER
                                CLABE -> Known.CLABE
                                HK_NUMBER -> Known.HK_NUMBER
                                IBAN -> Known.IBAN
                                ID_NUMBER -> Known.ID_NUMBER
                                NZ_NUMBER -> Known.NZ_NUMBER
                                OTHER -> Known.OTHER
                                PAN -> Known.PAN
                                SG_NUMBER -> Known.SG_NUMBER
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

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

                @NoAutoDetect
                class ContactDetailCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("contact_identifier") private val contactIdentifier: String?,
                    @JsonProperty("contact_identifier_type")
                    private val contactIdentifierType: ContactIdentifierType?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("contact_identifier")
                    fun contactIdentifier(): String? = contactIdentifier

                    @JsonProperty("contact_identifier_type")
                    fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var contactIdentifier: String? = null
                        private var contactIdentifierType: ContactIdentifierType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) =
                            apply {
                                contactIdentifier = contactDetailCreateRequest.contactIdentifier
                                contactIdentifierType =
                                    contactDetailCreateRequest.contactIdentifierType
                                additionalProperties =
                                    contactDetailCreateRequest.additionalProperties.toMutableMap()
                            }

                        fun contactIdentifier(contactIdentifier: String?) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType?) =
                            apply {
                                this.contactIdentifierType = contactIdentifierType
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

                        fun build(): ContactDetailCreateRequest =
                            ContactDetailCreateRequest(
                                contactIdentifier,
                                contactIdentifierType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class ContactIdentifierType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val EMAIL = of("email")

                            val PHONE_NUMBER = of("phone_number")

                            val WEBSITE = of("website")

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
                }

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @NoAutoDetect
                class LedgerAccountCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("currency") private val currency: String,
                    @JsonProperty("ledger_id") private val ledgerId: String,
                    @JsonProperty("name") private val name: String,
                    @JsonProperty("normal_balance") private val normalBalance: TransactionDirection,
                    @JsonProperty("currency_exponent") private val currencyExponent: Long?,
                    @JsonProperty("description") private val description: String?,
                    @JsonProperty("ledger_account_category_ids")
                    private val ledgerAccountCategoryIds: List<String>?,
                    @JsonProperty("ledgerable_id") private val ledgerableId: String?,
                    @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
                    @JsonProperty("metadata") private val metadata: Metadata?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The currency of the ledger account. */
                    @JsonProperty("currency") fun currency(): String = currency

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

                    /** The name of the ledger account. */
                    @JsonProperty("name") fun name(): String = name

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    fun normalBalance(): TransactionDirection = normalBalance

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    fun currencyExponent(): Long? = currencyExponent

                    /** The description of the ledger account. */
                    @JsonProperty("description") fun description(): String? = description

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    fun ledgerableType(): LedgerableType? = ledgerableType

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var currency: String? = null
                        private var ledgerId: String? = null
                        private var name: String? = null
                        private var normalBalance: TransactionDirection? = null
                        private var currencyExponent: Long? = null
                        private var description: String? = null
                        private var ledgerAccountCategoryIds: MutableList<String>? = null
                        private var ledgerableId: String? = null
                        private var ledgerableType: LedgerableType? = null
                        private var metadata: Metadata? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                currency = ledgerAccountCreateRequest.currency
                                ledgerId = ledgerAccountCreateRequest.ledgerId
                                name = ledgerAccountCreateRequest.name
                                normalBalance = ledgerAccountCreateRequest.normalBalance
                                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                description = ledgerAccountCreateRequest.description
                                ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds
                                        ?.toMutableList()
                                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties =
                                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                            }

                        /** The currency of the ledger account. */
                        fun currency(currency: String) = apply { this.currency = currency }

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                        /** The name of the ledger account. */
                        fun name(name: String) = apply { this.name = name }

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: TransactionDirection) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long?) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long) =
                            currencyExponent(currencyExponent as Long?)

                        /** The description of the ledger account. */
                        fun description(description: String?) = apply {
                            this.description = description
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>?) =
                            apply {
                                this.ledgerAccountCategoryIds =
                                    ledgerAccountCategoryIds?.toMutableList()
                            }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                            ledgerAccountCategoryIds =
                                (ledgerAccountCategoryIds ?: mutableListOf()).apply {
                                    add(ledgerAccountCategoryId)
                                }
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: String?) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

                        fun build(): LedgerAccountCreateRequest =
                            LedgerAccountCreateRequest(
                                checkNotNull(currency) { "`currency` is required but was not set" },
                                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                                checkNotNull(name) { "`name` is required but was not set" },
                                checkNotNull(normalBalance) {
                                    "`normalBalance` is required but was not set"
                                },
                                currencyExponent,
                                description,
                                ledgerAccountCategoryIds?.toImmutable(),
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class LedgerableType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val COUNTERPARTY = of("counterparty")

                            val EXTERNAL_ACCOUNT = of("external_account")

                            val INTERNAL_ACCOUNT = of("internal_account")

                            val VIRTUAL_ACCOUNT = of("virtual_account")

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
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

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

                            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                /** Required if receiving wire payments. */
                @NoAutoDetect
                class AddressRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String?,
                    @JsonProperty("line1") private val line1: String?,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonProperty("locality") private val locality: String?,
                    @JsonProperty("postal_code") private val postalCode: String?,
                    @JsonProperty("region") private val region: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country") fun country(): String? = country

                    @JsonProperty("line1") fun line1(): String? = line1

                    @JsonProperty("line2") fun line2(): String? = line2

                    /** Locality or City. */
                    @JsonProperty("locality") fun locality(): String? = locality

                    /** The postal code of the address. */
                    @JsonProperty("postal_code") fun postalCode(): String? = postalCode

                    /** Region or State. */
                    @JsonProperty("region") fun region(): String? = region

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var line1: String? = null
                        private var line2: String? = null
                        private var locality: String? = null
                        private var postalCode: String? = null
                        private var region: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(addressRequest: AddressRequest) = apply {
                            country = addressRequest.country
                            line1 = addressRequest.line1
                            line2 = addressRequest.line2
                            locality = addressRequest.locality
                            postalCode = addressRequest.postalCode
                            region = addressRequest.region
                            additionalProperties =
                                addressRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = apply { this.country = country }

                        fun line1(line1: String?) = apply { this.line1 = line1 }

                        fun line2(line2: String?) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String?) = apply { this.locality = locality }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                        /** Region or State. */
                        fun region(region: String?) = apply { this.region = region }

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

                        fun build(): AddressRequest =
                            AddressRequest(
                                country,
                                line1,
                                line2,
                                locality,
                                postalCode,
                                region,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
                }

                class PartyType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val BUSINESS = of("business")

                        val INDIVIDUAL = of("individual")

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @NoAutoDetect
                class RoutingDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("routing_number") private val routingNumber: String,
                    @JsonProperty("routing_number_type")
                    private val routingNumberType: RoutingNumberType,
                    @JsonProperty("payment_type") private val paymentType: PaymentType?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

                    @JsonProperty("routing_number_type")
                    fun routingNumberType(): RoutingNumberType = routingNumberType

                    @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: String? = null
                        private var routingNumberType: RoutingNumberType? = null
                        private var paymentType: PaymentType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        fun routingNumber(routingNumber: String) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                            this.routingNumberType = routingNumberType
                        }

                        fun paymentType(paymentType: PaymentType?) = apply {
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

                        fun build(): RoutingDetail =
                            RoutingDetail(
                                checkNotNull(routingNumber) {
                                    "`routingNumber` is required but was not set"
                                },
                                checkNotNull(routingNumberType) {
                                    "`routingNumberType` is required but was not set"
                                },
                                paymentType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

                            val IN_IFSC = of("in_ifsc")

                            val JP_ZENGIN_CODE = of("jp_zengin_code")

                            val MY_BRANCH_CODE = of("my_branch_code")

                            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                            val SWIFT = of("swift")

                            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

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
                            ZA_NATIONAL_CLEARING_CODE,
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
                            ZA_NATIONAL_CLEARING_CODE,
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
                                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

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
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ACH = of("ach")

                            val AU_BECS = of("au_becs")

                            val BACS = of("bacs")

                            val BOOK = of("book")

                            val CARD = of("card")

                            val CHATS = of("chats")

                            val CHECK = of("check")

                            val CROSS_BORDER = of("cross_border")

                            val DK_NETS = of("dk_nets")

                            val EFT = of("eft")

                            val HU_ICS = of("hu_ics")

                            val INTERAC = of("interac")

                            val MASAV = of("masav")

                            val MX_CCEN = of("mx_ccen")

                            val NEFT = of("neft")

                            val NICS = of("nics")

                            val NZ_BECS = of("nz_becs")

                            val PL_ELIXIR = of("pl_elixir")

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

                            val WIRE = of("wire")

                            val ZENGIN = of("zengin")

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
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
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
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
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
                                SE_BANKGIROT -> Value.SE_BANKGIROT
                                SEN -> Value.SEN
                                SEPA -> Value.SEPA
                                SG_GIRO -> Value.SG_GIRO
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
                                SE_BANKGIROT -> Known.SE_BANKGIROT
                                SEN -> Known.SEN
                                SEPA -> Known.SEPA
                                SG_GIRO -> Known.SG_GIRO
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

        @NoAutoDetect
        class ExpectedPaymentCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount_lower_bound") private val amountLowerBound: Long?,
            @JsonProperty("amount_upper_bound") private val amountUpperBound: Long?,
            @JsonProperty("counterparty_id") private val counterpartyId: String?,
            @JsonProperty("currency") private val currency: Currency?,
            @JsonProperty("date_lower_bound") private val dateLowerBound: LocalDate?,
            @JsonProperty("date_upper_bound") private val dateUpperBound: LocalDate?,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("direction") private val direction: Direction?,
            @JsonProperty("internal_account_id") private val internalAccountId: String?,
            @JsonProperty("ledger_transaction")
            private val ledgerTransaction: LedgerTransactionCreateRequest?,
            @JsonProperty("ledger_transaction_id") private val ledgerTransactionId: String?,
            @JsonProperty("line_items") private val lineItems: List<LineItemRequest>?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("reconciliation_filters") private val reconciliationFilters: JsonValue?,
            @JsonProperty("reconciliation_groups") private val reconciliationGroups: JsonValue?,
            @JsonProperty("reconciliation_rule_variables")
            private val reconciliationRuleVariables: List<ReconciliationRule>?,
            @JsonProperty("remittance_information") private val remittanceInformation: String?,
            @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
            @JsonProperty("type") private val type: ExpectedPaymentType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound") fun amountLowerBound(): Long? = amountLowerBound

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound") fun amountUpperBound(): Long? = amountUpperBound

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency") fun currency(): Currency? = currency

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound") fun dateLowerBound(): LocalDate? = dateLowerBound

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound") fun dateUpperBound(): LocalDate? = dateUpperBound

            /** An optional description for internal use. */
            @JsonProperty("description") fun description(): String? = description

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction") fun direction(): Direction? = direction

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(): String? = internalAccountId

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            fun ledgerTransactionId(): String? = ledgerTransactionId

            @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(): JsonValue? = reconciliationFilters

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(): JsonValue? = reconciliationGroups

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            fun reconciliationRuleVariables(): List<ReconciliationRule>? =
                reconciliationRuleVariables

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): String? = remittanceInformation

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): String? = statementDescriptor

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") fun type(): ExpectedPaymentType? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amountLowerBound: Long? = null
                private var amountUpperBound: Long? = null
                private var counterpartyId: String? = null
                private var currency: Currency? = null
                private var dateLowerBound: LocalDate? = null
                private var dateUpperBound: LocalDate? = null
                private var description: String? = null
                private var direction: Direction? = null
                private var internalAccountId: String? = null
                private var ledgerTransaction: LedgerTransactionCreateRequest? = null
                private var ledgerTransactionId: String? = null
                private var lineItems: MutableList<LineItemRequest>? = null
                private var metadata: Metadata? = null
                private var reconciliationFilters: JsonValue? = null
                private var reconciliationGroups: JsonValue? = null
                private var reconciliationRuleVariables: MutableList<ReconciliationRule>? = null
                private var remittanceInformation: String? = null
                private var statementDescriptor: String? = null
                private var type: ExpectedPaymentType? = null
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
                        lineItems = expectedPaymentCreateRequest.lineItems?.toMutableList()
                        metadata = expectedPaymentCreateRequest.metadata
                        reconciliationFilters = expectedPaymentCreateRequest.reconciliationFilters
                        reconciliationGroups = expectedPaymentCreateRequest.reconciliationGroups
                        reconciliationRuleVariables =
                            expectedPaymentCreateRequest.reconciliationRuleVariables
                                ?.toMutableList()
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
                fun amountLowerBound(amountLowerBound: Long?) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(amountLowerBound as Long?)

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long?) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(amountUpperBound as Long?)

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String?) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency?) = apply { this.currency = currency }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate?) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate?) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** An optional description for internal use. */
                fun description(description: String?) = apply { this.description = description }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Direction?) = apply { this.direction = direction }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String?) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Specifies a ledger transaction object that will be created with the expected
                 * payment. If the ledger transaction cannot be created, then the expected payment
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the expected payment.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest?) = apply {
                    this.ledgerTransaction = ledgerTransaction
                }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon expected payment creation. Once
                 * the expected payment is created, the status of the ledger transaction tracks the
                 * expected payment automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: String?) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                fun lineItems(lineItems: List<LineItemRequest>?) = apply {
                    this.lineItems = lineItems?.toMutableList()
                }

                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems = (lineItems ?: mutableListOf()).apply { add(lineItem) }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /** The reconciliation filters you have for this payment. */
                fun reconciliationFilters(reconciliationFilters: JsonValue?) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** The reconciliation groups you have for this payment. */
                fun reconciliationGroups(reconciliationGroups: JsonValue?) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>?
                ) = apply {
                    this.reconciliationRuleVariables = reconciliationRuleVariables?.toMutableList()
                }

                /** An array of reconciliation rule variables for this payment. */
                fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                    apply {
                        reconciliationRuleVariables =
                            (reconciliationRuleVariables ?: mutableListOf()).apply {
                                add(reconciliationRuleVariable)
                            }
                    }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String?) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType?) = apply { this.type = type }

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
                        lineItems?.toImmutable(),
                        metadata,
                        reconciliationFilters,
                        reconciliationGroups,
                        reconciliationRuleVariables?.toImmutable(),
                        remittanceInformation,
                        statementDescriptor,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

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
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("ledger_entries")
                private val ledgerEntries: List<LedgerEntryCreateRequest>,
                @JsonProperty("description") private val description: String?,
                @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
                @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
                @JsonProperty("external_id") private val externalId: String?,
                @JsonProperty("ledgerable_id") private val ledgerableId: String?,
                @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("status") private val status: Status?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

                /** An optional description for internal use. */
                @JsonProperty("description") fun description(): String? = description

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id") fun externalId(): String? = externalId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(): LedgerableType? = ledgerableType

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") fun status(): Status? = status

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var ledgerEntries: MutableList<LedgerEntryCreateRequest>? = null
                    private var description: String? = null
                    private var effectiveAt: OffsetDateTime? = null
                    private var effectiveDate: LocalDate? = null
                    private var externalId: String? = null
                    private var ledgerableId: String? = null
                    private var ledgerableType: LedgerableType? = null
                    private var metadata: Metadata? = null
                    private var status: Status? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
                        description = ledgerTransactionCreateRequest.description
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        metadata = ledgerTransactionCreateRequest.metadata
                        status = ledgerTransactionCreateRequest.status
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                        this.ledgerEntries = ledgerEntries.toMutableList()
                    }

                    /** An array of ledger entry objects. */
                    fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                        ledgerEntries =
                            (ledgerEntries ?: mutableListOf()).apply { add(ledgerEntry) }
                    }

                    /** An optional description for internal use. */
                    fun description(description: String?) = apply { this.description = description }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime?) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: LocalDate?) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: String?) = apply { this.externalId = externalId }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: String?) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: Status?) = apply { this.status = status }

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

                    fun build(): LedgerTransactionCreateRequest =
                        LedgerTransactionCreateRequest(
                            checkNotNull(ledgerEntries) {
                                    "`ledgerEntries` is required but was not set"
                                }
                                .toImmutable(),
                            description,
                            effectiveAt,
                            effectiveDate,
                            externalId,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            status,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LedgerEntryCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("amount") private val amount: Long,
                    @JsonProperty("direction") private val direction: TransactionDirection,
                    @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
                    @JsonProperty("available_balance_amount")
                    private val availableBalanceAmount: AvailableBalanceAmount?,
                    @JsonProperty("lock_version") private val lockVersion: Long?,
                    @JsonProperty("metadata") private val metadata: Metadata?,
                    @JsonProperty("pending_balance_amount")
                    private val pendingBalanceAmount: PendingBalanceAmount?,
                    @JsonProperty("posted_balance_amount")
                    private val postedBalanceAmount: PostedBalanceAmount?,
                    @JsonProperty("show_resulting_ledger_account_balances")
                    private val showResultingLedgerAccountBalances: Boolean?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") fun amount(): Long = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction") fun direction(): TransactionDirection = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    fun ledgerAccountId(): String = ledgerAccountId

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    fun showResultingLedgerAccountBalances(): Boolean? =
                        showResultingLedgerAccountBalances

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: Long? = null
                        private var direction: TransactionDirection? = null
                        private var ledgerAccountId: String? = null
                        private var availableBalanceAmount: AvailableBalanceAmount? = null
                        private var lockVersion: Long? = null
                        private var metadata: Metadata? = null
                        private var pendingBalanceAmount: PendingBalanceAmount? = null
                        private var postedBalanceAmount: PostedBalanceAmount? = null
                        private var showResultingLedgerAccountBalances: Boolean? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                amount = ledgerEntryCreateRequest.amount
                                direction = ledgerEntryCreateRequest.direction
                                ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                lockVersion = ledgerEntryCreateRequest.lockVersion
                                metadata = ledgerEntryCreateRequest.metadata
                                pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                                postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                                showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                additionalProperties =
                                    ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: Long) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: TransactionDirection) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: String) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: AvailableBalanceAmount?
                        ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long?) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                            apply {
                                this.pendingBalanceAmount = pendingBalanceAmount
                            }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean?
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) =
                            showResultingLedgerAccountBalances(
                                showResultingLedgerAccountBalances as Boolean?
                            )

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

                        fun build(): LedgerEntryCreateRequest =
                            LedgerEntryCreateRequest(
                                checkNotNull(amount) { "`amount` is required but was not set" },
                                checkNotNull(direction) {
                                    "`direction` is required but was not set"
                                },
                                checkNotNull(ledgerAccountId) {
                                    "`ledgerAccountId` is required but was not set"
                                },
                                availableBalanceAmount,
                                lockVersion,
                                metadata,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                showResultingLedgerAccountBalances,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(availableBalanceAmount: AvailableBalanceAmount) =
                                apply {
                                    additionalProperties =
                                        availableBalanceAmount.additionalProperties.toMutableMap()
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

                            fun build(): AvailableBalanceAmount =
                                AvailableBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

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

                            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class PendingBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                                additionalProperties =
                                    pendingBalanceAmount.additionalProperties.toMutableMap()
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

                            fun build(): PendingBalanceAmount =
                                PendingBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class PostedBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                                additionalProperties =
                                    postedBalanceAmount.additionalProperties.toMutableMap()
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

                            fun build(): PostedBalanceAmount =
                                PostedBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
                }

                class LedgerableType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val EXPECTED_PAYMENT = of("expected_payment")

                        val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

                        val PAPER_ITEM = of("paper_item")

                        val PAYMENT_ORDER = of("payment_order")

                        val RETURN = of("return")

                        val REVERSAL = of("reversal")

                        fun of(value: String) = LedgerableType(JsonField.of(value))
                    }

                    enum class Known {
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        RETURN,
                        REVERSAL,
                    }

                    enum class Value {
                        EXPECTED_PAYMENT,
                        INCOMING_PAYMENT_DETAIL,
                        PAPER_ITEM,
                        PAYMENT_ORDER,
                        RETURN,
                        REVERSAL,
                        _UNKNOWN,
                    }

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

                    fun asString(): String = _value().asStringOrThrow()

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
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                class Status
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ARCHIVED = of("archived")

                        val PENDING = of("pending")

                        val POSTED = of("posted")

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

                    return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class LineItemRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Long,
                @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
                @JsonProperty("description") private val description: String?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(): String? = accountingCategoryId

                /** A free-form description of the line item. */
                @JsonProperty("description") fun description(): String? = description

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var accountingCategoryId: String? = null
                    private var description: String? = null
                    private var metadata: Metadata? = null
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
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) = apply { this.description = description }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

        @NoAutoDetect
        class LedgerTransactionCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("ledger_entries")
            private val ledgerEntries: List<LedgerEntryCreateRequest>,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
            @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
            @JsonProperty("external_id") private val externalId: String?,
            @JsonProperty("ledgerable_id") private val ledgerableId: String?,
            @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("status") private val status: Status?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

            /** An optional description for internal use. */
            @JsonProperty("description") fun description(): String? = description

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            @JsonProperty("external_id") fun externalId(): String? = externalId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(): Status? = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var ledgerEntries: MutableList<LedgerEntryCreateRequest>? = null
                private var description: String? = null
                private var effectiveAt: OffsetDateTime? = null
                private var effectiveDate: LocalDate? = null
                private var externalId: String? = null
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var status: Status? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                    apply {
                        ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
                        description = ledgerTransactionCreateRequest.description
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        metadata = ledgerTransactionCreateRequest.metadata
                        status = ledgerTransactionCreateRequest.status
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                    this.ledgerEntries = ledgerEntries.toMutableList()
                }

                /** An array of ledger entry objects. */
                fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                    ledgerEntries = (ledgerEntries ?: mutableListOf()).apply { add(ledgerEntry) }
                }

                /** An optional description for internal use. */
                fun description(description: String?) = apply { this.description = description }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime?) = apply {
                    this.effectiveAt = effectiveAt
                }

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(effectiveDate: LocalDate?) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(externalId: String?) = apply { this.externalId = externalId }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String?) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status?) = apply { this.status = status }

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

                fun build(): LedgerTransactionCreateRequest =
                    LedgerTransactionCreateRequest(
                        checkNotNull(ledgerEntries) {
                                "`ledgerEntries` is required but was not set"
                            }
                            .toImmutable(),
                        description,
                        effectiveAt,
                        effectiveDate,
                        externalId,
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        status,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class LedgerEntryCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Long,
                @JsonProperty("direction") private val direction: TransactionDirection,
                @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
                @JsonProperty("available_balance_amount")
                private val availableBalanceAmount: AvailableBalanceAmount?,
                @JsonProperty("lock_version") private val lockVersion: Long?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("pending_balance_amount")
                private val pendingBalanceAmount: PendingBalanceAmount?,
                @JsonProperty("posted_balance_amount")
                private val postedBalanceAmount: PostedBalanceAmount?,
                @JsonProperty("show_resulting_ledger_account_balances")
                private val showResultingLedgerAccountBalances: Boolean?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction") fun direction(): TransactionDirection = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                fun showResultingLedgerAccountBalances(): Boolean? =
                    showResultingLedgerAccountBalances

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var direction: TransactionDirection? = null
                    private var ledgerAccountId: String? = null
                    private var availableBalanceAmount: AvailableBalanceAmount? = null
                    private var lockVersion: Long? = null
                    private var metadata: Metadata? = null
                    private var pendingBalanceAmount: PendingBalanceAmount? = null
                    private var postedBalanceAmount: PostedBalanceAmount? = null
                    private var showResultingLedgerAccountBalances: Boolean? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        amount = ledgerEntryCreateRequest.amount
                        direction = ledgerEntryCreateRequest.direction
                        ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                        lockVersion = ledgerEntryCreateRequest.lockVersion
                        metadata = ledgerEntryCreateRequest.metadata
                        pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        additionalProperties =
                            ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: TransactionDirection) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: String) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                        apply {
                            this.availableBalanceAmount = availableBalanceAmount
                        }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long?) = apply { this.lockVersion = lockVersion }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) = apply {
                        this.pendingBalanceAmount = pendingBalanceAmount
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
                        this.postedBalanceAmount = postedBalanceAmount
                    }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean?
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) =
                        showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances as Boolean?
                        )

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

                    fun build(): LedgerEntryCreateRequest =
                        LedgerEntryCreateRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(direction) { "`direction` is required but was not set" },
                            checkNotNull(ledgerAccountId) {
                                "`ledgerAccountId` is required but was not set"
                            },
                            availableBalanceAmount,
                            lockVersion,
                            metadata,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            showResultingLedgerAccountBalances,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class AvailableBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                            additionalProperties =
                                availableBalanceAmount.additionalProperties.toMutableMap()
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

                        fun build(): AvailableBalanceAmount =
                            AvailableBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class PendingBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                            additionalProperties =
                                pendingBalanceAmount.additionalProperties.toMutableMap()
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

                        fun build(): PendingBalanceAmount =
                            PendingBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class PostedBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                            additionalProperties =
                                postedBalanceAmount.additionalProperties.toMutableMap()
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

                        fun build(): PostedBalanceAmount =
                            PostedBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                enum class Known {
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    RETURN,
                    REVERSAL,
                }

                enum class Value {
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    RETURN,
                    REVERSAL,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()

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
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ARCHIVED = of("archived")

                    val PENDING = of("pending")

                    val POSTED = of("posted")

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

                return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TransactionCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Long,
            @JsonProperty("as_of_date") private val asOfDate: LocalDate?,
            @JsonProperty("direction") private val direction: String,
            @JsonProperty("internal_account_id") private val internalAccountId: String,
            @JsonProperty("vendor_code") private val vendorCode: String?,
            @JsonProperty("vendor_code_type") private val vendorCodeType: String?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("posted") private val posted: Boolean?,
            @JsonProperty("type") private val type: Type?,
            @JsonProperty("vendor_description") private val vendorDescription: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(): Long = amount

            /** The date on which the transaction occurred. */
            @JsonProperty("as_of_date") fun asOfDate(): LocalDate? = asOfDate

            /** Either `credit` or `debit`. */
            @JsonProperty("direction") fun direction(): String = direction

            /** The ID of the relevant Internal Account. */
            @JsonProperty("internal_account_id") fun internalAccountId(): String = internalAccountId

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            @JsonProperty("vendor_code") fun vendorCode(): String? = vendorCode

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            @JsonProperty("vendor_code_type") fun vendorCodeType(): String? = vendorCodeType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /** This field will be `true` if the transaction has posted to the account. */
            @JsonProperty("posted") fun posted(): Boolean? = posted

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            @JsonProperty("type") fun type(): Type? = type

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            @JsonProperty("vendor_description") fun vendorDescription(): String? = vendorDescription

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var asOfDate: LocalDate? = null
                private var direction: String? = null
                private var internalAccountId: String? = null
                private var vendorCode: String? = null
                private var vendorCodeType: String? = null
                private var metadata: Metadata? = null
                private var posted: Boolean? = null
                private var type: Type? = null
                private var vendorDescription: String? = null
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
                    vendorDescription = transactionCreateRequest.vendorDescription
                    additionalProperties =
                        transactionCreateRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(amount: Long) = apply { this.amount = amount }

                /** The date on which the transaction occurred. */
                fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

                /** Either `credit` or `debit`. */
                fun direction(direction: String) = apply { this.direction = direction }

                /** The ID of the relevant Internal Account. */
                fun internalAccountId(internalAccountId: String) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                fun vendorCode(vendorCode: String?) = apply { this.vendorCode = vendorCode }

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                fun vendorCodeType(vendorCodeType: String?) = apply {
                    this.vendorCodeType = vendorCodeType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /** This field will be `true` if the transaction has posted to the account. */
                fun posted(posted: Boolean?) = apply { this.posted = posted }

                /** This field will be `true` if the transaction has posted to the account. */
                fun posted(posted: Boolean) = posted(posted as Boolean?)

                /**
                 * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`,
                 * `rtp`, `book`, or `sen`.
                 */
                fun type(type: Type?) = apply { this.type = type }

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                fun vendorDescription(vendorDescription: String?) = apply {
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

                fun build(): TransactionCreateRequest =
                    TransactionCreateRequest(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        asOfDate,
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(internalAccountId) {
                            "`internalAccountId` is required but was not set"
                        },
                        vendorCode,
                        vendorCodeType,
                        metadata,
                        posted,
                        type,
                        vendorDescription,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

                    val AU_BECS = of("au_becs")

                    val BACS = of("bacs")

                    val BOOK = of("book")

                    val CARD = of("card")

                    val CHATS = of("chats")

                    val CHECK = of("check")

                    val CROSS_BORDER = of("cross_border")

                    val DK_NETS = of("dk_nets")

                    val EFT = of("eft")

                    val HU_ICS = of("hu_ics")

                    val INTERAC = of("interac")

                    val MASAV = of("masav")

                    val MX_CCEN = of("mx_ccen")

                    val NEFT = of("neft")

                    val NICS = of("nics")

                    val NZ_BECS = of("nz_becs")

                    val PL_ELIXIR = of("pl_elixir")

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

                    val WIRE = of("wire")

                    val ZENGIN = of("zengin")

                    val OTHER = of("other")

                    fun of(value: String) = Type(JsonField.of(value))
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
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SG_GIRO,
                    SIC,
                    SIGNET,
                    SKNBI,
                    WIRE,
                    ZENGIN,
                    OTHER,
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
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SG_GIRO,
                    SIC,
                    SIGNET,
                    SKNBI,
                    WIRE,
                    ZENGIN,
                    OTHER,
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
                        SE_BANKGIROT -> Value.SE_BANKGIROT
                        SEN -> Value.SEN
                        SEPA -> Value.SEPA
                        SG_GIRO -> Value.SG_GIRO
                        SIC -> Value.SIC
                        SIGNET -> Value.SIGNET
                        SKNBI -> Value.SKNBI
                        WIRE -> Value.WIRE
                        ZENGIN -> Value.ZENGIN
                        OTHER -> Value.OTHER
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
                        SE_BANKGIROT -> Known.SE_BANKGIROT
                        SEN -> Known.SEN
                        SEPA -> Known.SEPA
                        SG_GIRO -> Known.SG_GIRO
                        SIC -> Known.SIC
                        SIGNET -> Known.SIGNET
                        SKNBI -> Known.SKNBI
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        OTHER -> Known.OTHER
                        else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is TransactionCreateRequest && amount == other.amount && asOfDate == other.asOfDate && direction == other.direction && internalAccountId == other.internalAccountId && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && metadata == other.metadata && posted == other.posted && type == other.type && vendorDescription == other.vendorDescription && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorDescription, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionCreateRequest{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Id
        @JsonCreator
        private constructor(
            @JsonProperty("id") private val id: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("id") fun id(): String? = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(id: Id) = apply {
                    this.id = id.id
                    additionalProperties = id.additionalProperties.toMutableMap()
                }

                fun id(id: String?) = apply { this.id = id }

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

                fun build(): Id = Id(id, additionalProperties.toImmutable())
            }

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

        @NoAutoDetect
        class PaymentOrderUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id") private val id: String?,
            @JsonProperty("accounting") private val accounting: Accounting?,
            @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
            @JsonProperty("accounting_ledger_class_id")
            private val accountingLedgerClassId: String?,
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("charge_bearer") private val chargeBearer: ChargeBearer?,
            @JsonProperty("counterparty_id") private val counterpartyId: String?,
            @JsonProperty("currency") private val currency: Currency?,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("direction") private val direction: Direction?,
            @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
            @JsonProperty("expires_at") private val expiresAt: OffsetDateTime?,
            @JsonProperty("fallback_type") private val fallbackType: FallbackType?,
            @JsonProperty("foreign_exchange_contract") private val foreignExchangeContract: String?,
            @JsonProperty("foreign_exchange_indicator")
            private val foreignExchangeIndicator: ForeignExchangeIndicator?,
            @JsonProperty("line_items") private val lineItems: List<LineItemRequest>?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("nsf_protected") private val nsfProtected: Boolean?,
            @JsonProperty("originating_account_id") private val originatingAccountId: String?,
            @JsonProperty("originating_party_name") private val originatingPartyName: String?,
            @JsonProperty("priority") private val priority: Priority?,
            @JsonProperty("process_after") private val processAfter: OffsetDateTime?,
            @JsonProperty("purpose") private val purpose: String?,
            @JsonProperty("receiving_account") private val receivingAccount: ReceivingAccount?,
            @JsonProperty("receiving_account_id") private val receivingAccountId: String?,
            @JsonProperty("remittance_information") private val remittanceInformation: String?,
            @JsonProperty("send_remittance_advice") private val sendRemittanceAdvice: Boolean?,
            @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
            @JsonProperty("status") private val status: Status?,
            @JsonProperty("subtype") private val subtype: PaymentOrderSubtype?,
            @JsonProperty("type") private val type: PaymentOrderType?,
            @JsonProperty("ultimate_originating_party_identifier")
            private val ultimateOriginatingPartyIdentifier: String?,
            @JsonProperty("ultimate_originating_party_name")
            private val ultimateOriginatingPartyName: String?,
            @JsonProperty("ultimate_receiving_party_identifier")
            private val ultimateReceivingPartyIdentifier: String?,
            @JsonProperty("ultimate_receiving_party_name")
            private val ultimateReceivingPartyName: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("id") fun id(): String? = id

            @JsonProperty("accounting") fun accounting(): Accounting? = accounting

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(): String? = accountingCategoryId

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            fun accountingLedgerClassId(): String? = accountingLedgerClassId

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") fun amount(): Long? = amount

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer") fun chargeBearer(): ChargeBearer? = chargeBearer

            /** Required when receiving_account_id is passed the ID of an external account. */
            @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency") fun currency(): Currency? = currency

            /** An optional description for internal use. */
            @JsonProperty("description") fun description(): String? = description

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") fun direction(): Direction? = direction

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type") fun fallbackType(): FallbackType? = fallbackType

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            fun foreignExchangeContract(): String? = foreignExchangeContract

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            fun foreignExchangeIndicator(): ForeignExchangeIndicator? = foreignExchangeIndicator

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected") fun nsfProtected(): Boolean? = nsfProtected

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(): String? = originatingAccountId

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            fun originatingPartyName(): String? = originatingPartyName

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority") fun priority(): Priority? = priority

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after") fun processAfter(): OffsetDateTime? = processAfter

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            @JsonProperty("purpose") fun purpose(): String? = purpose

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            fun receivingAccount(): ReceivingAccount? = receivingAccount

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(): String? = receivingAccountId

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): String? = remittanceInformation

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): String? = statementDescriptor

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            @JsonProperty("status") fun status(): Status? = status

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype") fun subtype(): PaymentOrderSubtype? = subtype

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") fun type(): PaymentOrderType? = type

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            fun ultimateOriginatingPartyIdentifier(): String? = ultimateOriginatingPartyIdentifier

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_name")
            fun ultimateOriginatingPartyName(): String? = ultimateOriginatingPartyName

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            fun ultimateReceivingPartyIdentifier(): String? = ultimateReceivingPartyIdentifier

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_name")
            fun ultimateReceivingPartyName(): String? = ultimateReceivingPartyName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var accounting: Accounting? = null
                private var accountingCategoryId: String? = null
                private var accountingLedgerClassId: String? = null
                private var amount: Long? = null
                private var chargeBearer: ChargeBearer? = null
                private var counterpartyId: String? = null
                private var currency: Currency? = null
                private var description: String? = null
                private var direction: Direction? = null
                private var effectiveDate: LocalDate? = null
                private var expiresAt: OffsetDateTime? = null
                private var fallbackType: FallbackType? = null
                private var foreignExchangeContract: String? = null
                private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
                private var lineItems: MutableList<LineItemRequest>? = null
                private var metadata: Metadata? = null
                private var nsfProtected: Boolean? = null
                private var originatingAccountId: String? = null
                private var originatingPartyName: String? = null
                private var priority: Priority? = null
                private var processAfter: OffsetDateTime? = null
                private var purpose: String? = null
                private var receivingAccount: ReceivingAccount? = null
                private var receivingAccountId: String? = null
                private var remittanceInformation: String? = null
                private var sendRemittanceAdvice: Boolean? = null
                private var statementDescriptor: String? = null
                private var status: Status? = null
                private var subtype: PaymentOrderSubtype? = null
                private var type: PaymentOrderType? = null
                private var ultimateOriginatingPartyIdentifier: String? = null
                private var ultimateOriginatingPartyName: String? = null
                private var ultimateReceivingPartyIdentifier: String? = null
                private var ultimateReceivingPartyName: String? = null
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
                    lineItems = paymentOrderUpdateRequestWithId.lineItems?.toMutableList()
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

                fun id(id: String?) = apply { this.id = id }

                fun accounting(accounting: Accounting?) = apply { this.accounting = accounting }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(accountingCategoryId: String?) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingLedgerClassId(accountingLedgerClassId: String?) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long?) = apply { this.amount = amount }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(amount as Long?)

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer?) = apply {
                    this.chargeBearer = chargeBearer
                }

                /** Required when receiving_account_id is passed the ID of an external account. */
                fun counterpartyId(counterpartyId: String?) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency?) = apply { this.currency = currency }

                /** An optional description for internal use. */
                fun description(description: String?) = apply { this.description = description }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction?) = apply { this.direction = direction }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate?) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) = apply { this.expiresAt = expiresAt }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType?) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String?) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                    apply {
                        this.foreignExchangeIndicator = foreignExchangeIndicator
                    }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>?) = apply {
                    this.lineItems = lineItems?.toMutableList()
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems = (lineItems ?: mutableListOf()).apply { add(lineItem) }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean?) = apply {
                    this.nsfProtected = nsfProtected
                }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(nsfProtected as Boolean?)

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String?) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String?) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority?) = apply { this.priority = priority }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime?) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String?) = apply { this.purpose = purpose }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount?) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String?) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String?) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                fun status(status: Status?) = apply { this.status = status }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype?) = apply { this.subtype = subtype }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType?) = apply { this.type = type }

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: String?
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) = apply {
                    this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                }

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                    apply {
                        this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                    }

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) = apply {
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
                        lineItems?.toImmutable(),
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
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Accounting
            @JsonCreator
            private constructor(
                @JsonProperty("account_id") private val accountId: String?,
                @JsonProperty("class_id") private val classId: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id") fun accountId(): String? = accountId

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id") fun classId(): String? = classId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountId: String? = null
                    private var classId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(accounting: Accounting) = apply {
                        accountId = accounting.accountId
                        classId = accounting.classId
                        additionalProperties = accounting.additionalProperties.toMutableMap()
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: String?) = apply { this.accountId = accountId }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: String?) = apply { this.classId = classId }

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

                    fun build(): Accounting =
                        Accounting(
                            accountId,
                            classId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Accounting && accountId == other.accountId && classId == other.classId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
            }

            class ChargeBearer
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val SHARED = of("shared")

                    val SENDER = of("sender")

                    val RECEIVER = of("receiver")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class FallbackType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FIXED_TO_VARIABLE = of("fixed_to_variable")

                    val VARIABLE_TO_FIXED = of("variable_to_fixed")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @NoAutoDetect
            class LineItemRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Long,
                @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
                @JsonProperty("description") private val description: String?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(): String? = accountingCategoryId

                /** A free-form description of the line item. */
                @JsonProperty("description") fun description(): String? = description

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var accountingCategoryId: String? = null
                    private var description: String? = null
                    private var metadata: Metadata? = null
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
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) = apply { this.description = description }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            class Priority
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val HIGH = of("high")

                    val NORMAL = of("normal")

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
            @NoAutoDetect
            class ReceivingAccount
            @JsonCreator
            private constructor(
                @JsonProperty("account_details") private val accountDetails: List<AccountDetail>?,
                @JsonProperty("account_type") private val accountType: ExternalAccountType?,
                @JsonProperty("contact_details")
                private val contactDetails: List<ContactDetailCreateRequest>?,
                @JsonProperty("ledger_account")
                private val ledgerAccount: LedgerAccountCreateRequest?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("name") private val name: String?,
                @JsonProperty("party_address") private val partyAddress: AddressRequest?,
                @JsonProperty("party_identifier") private val partyIdentifier: String?,
                @JsonProperty("party_name") private val partyName: String?,
                @JsonProperty("party_type") private val partyType: PartyType?,
                @JsonProperty("plaid_processor_token") private val plaidProcessorToken: String?,
                @JsonProperty("routing_details") private val routingDetails: List<RoutingDetail>?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("account_details")
                fun accountDetails(): List<AccountDetail>? = accountDetails

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

                @JsonProperty("contact_details")
                fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account")
                fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") fun name(): String? = name

                /** Required if receiving wire payments. */
                @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

                @JsonProperty("party_identifier") fun partyIdentifier(): String? = partyIdentifier

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name") fun partyName(): String? = partyName

                /** Either `individual` or `business`. */
                @JsonProperty("party_type") fun partyType(): PartyType? = partyType

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                fun plaidProcessorToken(): String? = plaidProcessorToken

                @JsonProperty("routing_details")
                fun routingDetails(): List<RoutingDetail>? = routingDetails

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var accountDetails: MutableList<AccountDetail>? = null
                    private var accountType: ExternalAccountType? = null
                    private var contactDetails: MutableList<ContactDetailCreateRequest>? = null
                    private var ledgerAccount: LedgerAccountCreateRequest? = null
                    private var metadata: Metadata? = null
                    private var name: String? = null
                    private var partyAddress: AddressRequest? = null
                    private var partyIdentifier: String? = null
                    private var partyName: String? = null
                    private var partyType: PartyType? = null
                    private var plaidProcessorToken: String? = null
                    private var routingDetails: MutableList<RoutingDetail>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountDetails = receivingAccount.accountDetails?.toMutableList()
                        accountType = receivingAccount.accountType
                        contactDetails = receivingAccount.contactDetails?.toMutableList()
                        ledgerAccount = receivingAccount.ledgerAccount
                        metadata = receivingAccount.metadata
                        name = receivingAccount.name
                        partyAddress = receivingAccount.partyAddress
                        partyIdentifier = receivingAccount.partyIdentifier
                        partyName = receivingAccount.partyName
                        partyType = receivingAccount.partyType
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        routingDetails = receivingAccount.routingDetails?.toMutableList()
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    fun accountDetails(accountDetails: List<AccountDetail>?) = apply {
                        this.accountDetails = accountDetails?.toMutableList()
                    }

                    fun addAccountDetail(accountDetail: AccountDetail) = apply {
                        accountDetails =
                            (accountDetails ?: mutableListOf()).apply { add(accountDetail) }
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType?) = apply {
                        this.accountType = accountType
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>?) = apply {
                        this.contactDetails = contactDetails?.toMutableList()
                    }

                    fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                        contactDetails =
                            (contactDetails ?: mutableListOf()).apply { add(contactDetail) }
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest?) = apply {
                        this.ledgerAccount = ledgerAccount
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String?) = apply { this.name = name }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest?) = apply {
                        this.partyAddress = partyAddress
                    }

                    fun partyIdentifier(partyIdentifier: String?) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String?) = apply { this.partyName = partyName }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType?) = apply { this.partyType = partyType }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String?) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>?) = apply {
                        this.routingDetails = routingDetails?.toMutableList()
                    }

                    fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                        routingDetails =
                            (routingDetails ?: mutableListOf()).apply { add(routingDetail) }
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

                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            accountDetails?.toImmutable(),
                            accountType,
                            contactDetails?.toImmutable(),
                            ledgerAccount,
                            metadata,
                            name,
                            partyAddress,
                            partyIdentifier,
                            partyName,
                            partyType,
                            plaidProcessorToken,
                            routingDetails?.toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AccountDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("account_number") private val accountNumber: String,
                    @JsonProperty("account_number_type")
                    private val accountNumberType: AccountNumberType?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("account_number") fun accountNumber(): String = accountNumber

                    @JsonProperty("account_number_type")
                    fun accountNumberType(): AccountNumberType? = accountNumberType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var accountNumber: String? = null
                        private var accountNumberType: AccountNumberType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        fun accountNumber(accountNumber: String) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType?) = apply {
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

                        fun build(): AccountDetail =
                            AccountDetail(
                                checkNotNull(accountNumber) {
                                    "`accountNumber` is required but was not set"
                                },
                                accountNumberType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AccountNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AU_NUMBER = of("au_number")

                            val CLABE = of("clabe")

                            val HK_NUMBER = of("hk_number")

                            val IBAN = of("iban")

                            val ID_NUMBER = of("id_number")

                            val NZ_NUMBER = of("nz_number")

                            val OTHER = of("other")

                            val PAN = of("pan")

                            val SG_NUMBER = of("sg_number")

                            val WALLET_ADDRESS = of("wallet_address")

                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                        }

                        enum class Value {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AU_NUMBER -> Value.AU_NUMBER
                                CLABE -> Value.CLABE
                                HK_NUMBER -> Value.HK_NUMBER
                                IBAN -> Value.IBAN
                                ID_NUMBER -> Value.ID_NUMBER
                                NZ_NUMBER -> Value.NZ_NUMBER
                                OTHER -> Value.OTHER
                                PAN -> Value.PAN
                                SG_NUMBER -> Value.SG_NUMBER
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AU_NUMBER -> Known.AU_NUMBER
                                CLABE -> Known.CLABE
                                HK_NUMBER -> Known.HK_NUMBER
                                IBAN -> Known.IBAN
                                ID_NUMBER -> Known.ID_NUMBER
                                NZ_NUMBER -> Known.NZ_NUMBER
                                OTHER -> Known.OTHER
                                PAN -> Known.PAN
                                SG_NUMBER -> Known.SG_NUMBER
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

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

                @NoAutoDetect
                class ContactDetailCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("contact_identifier") private val contactIdentifier: String?,
                    @JsonProperty("contact_identifier_type")
                    private val contactIdentifierType: ContactIdentifierType?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("contact_identifier")
                    fun contactIdentifier(): String? = contactIdentifier

                    @JsonProperty("contact_identifier_type")
                    fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var contactIdentifier: String? = null
                        private var contactIdentifierType: ContactIdentifierType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) =
                            apply {
                                contactIdentifier = contactDetailCreateRequest.contactIdentifier
                                contactIdentifierType =
                                    contactDetailCreateRequest.contactIdentifierType
                                additionalProperties =
                                    contactDetailCreateRequest.additionalProperties.toMutableMap()
                            }

                        fun contactIdentifier(contactIdentifier: String?) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType?) =
                            apply {
                                this.contactIdentifierType = contactIdentifierType
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

                        fun build(): ContactDetailCreateRequest =
                            ContactDetailCreateRequest(
                                contactIdentifier,
                                contactIdentifierType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class ContactIdentifierType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val EMAIL = of("email")

                            val PHONE_NUMBER = of("phone_number")

                            val WEBSITE = of("website")

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
                }

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @NoAutoDetect
                class LedgerAccountCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("currency") private val currency: String,
                    @JsonProperty("ledger_id") private val ledgerId: String,
                    @JsonProperty("name") private val name: String,
                    @JsonProperty("normal_balance") private val normalBalance: TransactionDirection,
                    @JsonProperty("currency_exponent") private val currencyExponent: Long?,
                    @JsonProperty("description") private val description: String?,
                    @JsonProperty("ledger_account_category_ids")
                    private val ledgerAccountCategoryIds: List<String>?,
                    @JsonProperty("ledgerable_id") private val ledgerableId: String?,
                    @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
                    @JsonProperty("metadata") private val metadata: Metadata?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The currency of the ledger account. */
                    @JsonProperty("currency") fun currency(): String = currency

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

                    /** The name of the ledger account. */
                    @JsonProperty("name") fun name(): String = name

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    fun normalBalance(): TransactionDirection = normalBalance

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    fun currencyExponent(): Long? = currencyExponent

                    /** The description of the ledger account. */
                    @JsonProperty("description") fun description(): String? = description

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    fun ledgerableType(): LedgerableType? = ledgerableType

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var currency: String? = null
                        private var ledgerId: String? = null
                        private var name: String? = null
                        private var normalBalance: TransactionDirection? = null
                        private var currencyExponent: Long? = null
                        private var description: String? = null
                        private var ledgerAccountCategoryIds: MutableList<String>? = null
                        private var ledgerableId: String? = null
                        private var ledgerableType: LedgerableType? = null
                        private var metadata: Metadata? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                currency = ledgerAccountCreateRequest.currency
                                ledgerId = ledgerAccountCreateRequest.ledgerId
                                name = ledgerAccountCreateRequest.name
                                normalBalance = ledgerAccountCreateRequest.normalBalance
                                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                description = ledgerAccountCreateRequest.description
                                ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds
                                        ?.toMutableList()
                                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties =
                                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                            }

                        /** The currency of the ledger account. */
                        fun currency(currency: String) = apply { this.currency = currency }

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                        /** The name of the ledger account. */
                        fun name(name: String) = apply { this.name = name }

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: TransactionDirection) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long?) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long) =
                            currencyExponent(currencyExponent as Long?)

                        /** The description of the ledger account. */
                        fun description(description: String?) = apply {
                            this.description = description
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>?) =
                            apply {
                                this.ledgerAccountCategoryIds =
                                    ledgerAccountCategoryIds?.toMutableList()
                            }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                            ledgerAccountCategoryIds =
                                (ledgerAccountCategoryIds ?: mutableListOf()).apply {
                                    add(ledgerAccountCategoryId)
                                }
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: String?) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

                        fun build(): LedgerAccountCreateRequest =
                            LedgerAccountCreateRequest(
                                checkNotNull(currency) { "`currency` is required but was not set" },
                                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                                checkNotNull(name) { "`name` is required but was not set" },
                                checkNotNull(normalBalance) {
                                    "`normalBalance` is required but was not set"
                                },
                                currencyExponent,
                                description,
                                ledgerAccountCategoryIds?.toImmutable(),
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class LedgerableType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val COUNTERPARTY = of("counterparty")

                            val EXTERNAL_ACCOUNT = of("external_account")

                            val INTERNAL_ACCOUNT = of("internal_account")

                            val VIRTUAL_ACCOUNT = of("virtual_account")

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
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

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

                            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

                /** Required if receiving wire payments. */
                @NoAutoDetect
                class AddressRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String?,
                    @JsonProperty("line1") private val line1: String?,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonProperty("locality") private val locality: String?,
                    @JsonProperty("postal_code") private val postalCode: String?,
                    @JsonProperty("region") private val region: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country") fun country(): String? = country

                    @JsonProperty("line1") fun line1(): String? = line1

                    @JsonProperty("line2") fun line2(): String? = line2

                    /** Locality or City. */
                    @JsonProperty("locality") fun locality(): String? = locality

                    /** The postal code of the address. */
                    @JsonProperty("postal_code") fun postalCode(): String? = postalCode

                    /** Region or State. */
                    @JsonProperty("region") fun region(): String? = region

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var line1: String? = null
                        private var line2: String? = null
                        private var locality: String? = null
                        private var postalCode: String? = null
                        private var region: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(addressRequest: AddressRequest) = apply {
                            country = addressRequest.country
                            line1 = addressRequest.line1
                            line2 = addressRequest.line2
                            locality = addressRequest.locality
                            postalCode = addressRequest.postalCode
                            region = addressRequest.region
                            additionalProperties =
                                addressRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = apply { this.country = country }

                        fun line1(line1: String?) = apply { this.line1 = line1 }

                        fun line2(line2: String?) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String?) = apply { this.locality = locality }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                        /** Region or State. */
                        fun region(region: String?) = apply { this.region = region }

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

                        fun build(): AddressRequest =
                            AddressRequest(
                                country,
                                line1,
                                line2,
                                locality,
                                postalCode,
                                region,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
                }

                class PartyType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val BUSINESS = of("business")

                        val INDIVIDUAL = of("individual")

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @NoAutoDetect
                class RoutingDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("routing_number") private val routingNumber: String,
                    @JsonProperty("routing_number_type")
                    private val routingNumberType: RoutingNumberType,
                    @JsonProperty("payment_type") private val paymentType: PaymentType?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

                    @JsonProperty("routing_number_type")
                    fun routingNumberType(): RoutingNumberType = routingNumberType

                    @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: String? = null
                        private var routingNumberType: RoutingNumberType? = null
                        private var paymentType: PaymentType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        fun routingNumber(routingNumber: String) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                            this.routingNumberType = routingNumberType
                        }

                        fun paymentType(paymentType: PaymentType?) = apply {
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

                        fun build(): RoutingDetail =
                            RoutingDetail(
                                checkNotNull(routingNumber) {
                                    "`routingNumber` is required but was not set"
                                },
                                checkNotNull(routingNumberType) {
                                    "`routingNumberType` is required but was not set"
                                },
                                paymentType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

                            val IN_IFSC = of("in_ifsc")

                            val JP_ZENGIN_CODE = of("jp_zengin_code")

                            val MY_BRANCH_CODE = of("my_branch_code")

                            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                            val SWIFT = of("swift")

                            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

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
                            ZA_NATIONAL_CLEARING_CODE,
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
                            ZA_NATIONAL_CLEARING_CODE,
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
                                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

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
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ACH = of("ach")

                            val AU_BECS = of("au_becs")

                            val BACS = of("bacs")

                            val BOOK = of("book")

                            val CARD = of("card")

                            val CHATS = of("chats")

                            val CHECK = of("check")

                            val CROSS_BORDER = of("cross_border")

                            val DK_NETS = of("dk_nets")

                            val EFT = of("eft")

                            val HU_ICS = of("hu_ics")

                            val INTERAC = of("interac")

                            val MASAV = of("masav")

                            val MX_CCEN = of("mx_ccen")

                            val NEFT = of("neft")

                            val NICS = of("nics")

                            val NZ_BECS = of("nz_becs")

                            val PL_ELIXIR = of("pl_elixir")

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

                            val WIRE = of("wire")

                            val ZENGIN = of("zengin")

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
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
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
                            SE_BANKGIROT,
                            SEN,
                            SEPA,
                            SG_GIRO,
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
                                SE_BANKGIROT -> Value.SE_BANKGIROT
                                SEN -> Value.SEN
                                SEPA -> Value.SEPA
                                SG_GIRO -> Value.SG_GIRO
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
                                SE_BANKGIROT -> Known.SE_BANKGIROT
                                SEN -> Known.SEN
                                SEPA -> Known.SEPA
                                SG_GIRO -> Known.SG_GIRO
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

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

        @NoAutoDetect
        class ExpectedPaymentUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id") private val id: String?,
            @JsonProperty("amount_lower_bound") private val amountLowerBound: Long?,
            @JsonProperty("amount_upper_bound") private val amountUpperBound: Long?,
            @JsonProperty("counterparty_id") private val counterpartyId: String?,
            @JsonProperty("currency") private val currency: Currency?,
            @JsonProperty("date_lower_bound") private val dateLowerBound: LocalDate?,
            @JsonProperty("date_upper_bound") private val dateUpperBound: LocalDate?,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("direction") private val direction: Direction?,
            @JsonProperty("internal_account_id") private val internalAccountId: String?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("reconciliation_filters") private val reconciliationFilters: JsonValue?,
            @JsonProperty("reconciliation_groups") private val reconciliationGroups: JsonValue?,
            @JsonProperty("reconciliation_rule_variables")
            private val reconciliationRuleVariables: List<ReconciliationRule>?,
            @JsonProperty("remittance_information") private val remittanceInformation: String?,
            @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
            @JsonProperty("status") private val status: Status?,
            @JsonProperty("type") private val type: ExpectedPaymentType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("id") fun id(): String? = id

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound") fun amountLowerBound(): Long? = amountLowerBound

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound") fun amountUpperBound(): Long? = amountUpperBound

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency") fun currency(): Currency? = currency

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound") fun dateLowerBound(): LocalDate? = dateLowerBound

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound") fun dateUpperBound(): LocalDate? = dateUpperBound

            /** An optional description for internal use. */
            @JsonProperty("description") fun description(): String? = description

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction") fun direction(): Direction? = direction

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(): String? = internalAccountId

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(): JsonValue? = reconciliationFilters

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(): JsonValue? = reconciliationGroups

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            fun reconciliationRuleVariables(): List<ReconciliationRule>? =
                reconciliationRuleVariables

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): String? = remittanceInformation

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): String? = statementDescriptor

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            @JsonProperty("status") fun status(): Status? = status

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") fun type(): ExpectedPaymentType? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var amountLowerBound: Long? = null
                private var amountUpperBound: Long? = null
                private var counterpartyId: String? = null
                private var currency: Currency? = null
                private var dateLowerBound: LocalDate? = null
                private var dateUpperBound: LocalDate? = null
                private var description: String? = null
                private var direction: Direction? = null
                private var internalAccountId: String? = null
                private var metadata: Metadata? = null
                private var reconciliationFilters: JsonValue? = null
                private var reconciliationGroups: JsonValue? = null
                private var reconciliationRuleVariables: MutableList<ReconciliationRule>? = null
                private var remittanceInformation: String? = null
                private var statementDescriptor: String? = null
                private var status: Status? = null
                private var type: ExpectedPaymentType? = null
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
                        expectedPaymentUpdateRequestWithId.reconciliationRuleVariables
                            ?.toMutableList()
                    remittanceInformation = expectedPaymentUpdateRequestWithId.remittanceInformation
                    statementDescriptor = expectedPaymentUpdateRequestWithId.statementDescriptor
                    status = expectedPaymentUpdateRequestWithId.status
                    type = expectedPaymentUpdateRequestWithId.type
                    additionalProperties =
                        expectedPaymentUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String?) = apply { this.id = id }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long?) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(amountLowerBound as Long?)

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long?) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(amountUpperBound as Long?)

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String?) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency?) = apply { this.currency = currency }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate?) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate?) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** An optional description for internal use. */
                fun description(description: String?) = apply { this.description = description }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Direction?) = apply { this.direction = direction }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String?) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /** The reconciliation filters you have for this payment. */
                fun reconciliationFilters(reconciliationFilters: JsonValue?) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** The reconciliation groups you have for this payment. */
                fun reconciliationGroups(reconciliationGroups: JsonValue?) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>?
                ) = apply {
                    this.reconciliationRuleVariables = reconciliationRuleVariables?.toMutableList()
                }

                /** An array of reconciliation rule variables for this payment. */
                fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                    apply {
                        reconciliationRuleVariables =
                            (reconciliationRuleVariables ?: mutableListOf()).apply {
                                add(reconciliationRuleVariable)
                            }
                    }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String?) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * The Expected Payment's status can be updated from partially_reconciled to
                 * reconciled.
                 */
                fun status(status: Status?) = apply { this.status = status }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType?) = apply { this.type = type }

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
                        reconciliationRuleVariables?.toImmutable(),
                        remittanceInformation,
                        statementDescriptor,
                        status,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT = of("credit")

                    val DEBIT = of("debit")

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
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val RECONCILED = of("reconciled")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                enum class Known {
                    RECONCILED,
                }

                enum class Value {
                    RECONCILED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        RECONCILED -> Value.RECONCILED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        RECONCILED -> Known.RECONCILED
                        else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

        @NoAutoDetect
        class TransactionUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id") private val id: String?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("id") fun id(): String? = id

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transactionUpdateRequestWithId: TransactionUpdateRequestWithId) =
                    apply {
                        id = transactionUpdateRequestWithId.id
                        metadata = transactionUpdateRequestWithId.metadata
                        additionalProperties =
                            transactionUpdateRequestWithId.additionalProperties.toMutableMap()
                    }

                fun id(id: String?) = apply { this.id = id }

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

                fun build(): TransactionUpdateRequestWithId =
                    TransactionUpdateRequestWithId(
                        id,
                        metadata,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

        @NoAutoDetect
        class LedgerTransactionUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id") private val id: String?,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
            @JsonProperty("ledger_entries")
            private val ledgerEntries: List<LedgerEntryCreateRequest>?,
            @JsonProperty("ledgerable_id") private val ledgerableId: String?,
            @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("status") private val status: Status?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("id") fun id(): String? = id

            /** An optional description for internal use. */
            @JsonProperty("description") fun description(): String? = description

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(): List<LedgerEntryCreateRequest>? = ledgerEntries

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(): Status? = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var description: String? = null
                private var effectiveAt: OffsetDateTime? = null
                private var ledgerEntries: MutableList<LedgerEntryCreateRequest>? = null
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var status: Status? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                ) = apply {
                    id = ledgerTransactionUpdateRequestWithId.id
                    description = ledgerTransactionUpdateRequestWithId.description
                    effectiveAt = ledgerTransactionUpdateRequestWithId.effectiveAt
                    ledgerEntries =
                        ledgerTransactionUpdateRequestWithId.ledgerEntries?.toMutableList()
                    ledgerableId = ledgerTransactionUpdateRequestWithId.ledgerableId
                    ledgerableType = ledgerTransactionUpdateRequestWithId.ledgerableType
                    metadata = ledgerTransactionUpdateRequestWithId.metadata
                    status = ledgerTransactionUpdateRequestWithId.status
                    additionalProperties =
                        ledgerTransactionUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String?) = apply { this.id = id }

                /** An optional description for internal use. */
                fun description(description: String?) = apply { this.description = description }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime?) = apply {
                    this.effectiveAt = effectiveAt
                }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>?) = apply {
                    this.ledgerEntries = ledgerEntries?.toMutableList()
                }

                /** An array of ledger entry objects. */
                fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                    ledgerEntries = (ledgerEntries ?: mutableListOf()).apply { add(ledgerEntry) }
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String?) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status?) = apply { this.status = status }

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

                fun build(): LedgerTransactionUpdateRequestWithId =
                    LedgerTransactionUpdateRequestWithId(
                        id,
                        description,
                        effectiveAt,
                        ledgerEntries?.toImmutable(),
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        status,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class LedgerEntryCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Long,
                @JsonProperty("direction") private val direction: TransactionDirection,
                @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
                @JsonProperty("available_balance_amount")
                private val availableBalanceAmount: AvailableBalanceAmount?,
                @JsonProperty("lock_version") private val lockVersion: Long?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("pending_balance_amount")
                private val pendingBalanceAmount: PendingBalanceAmount?,
                @JsonProperty("posted_balance_amount")
                private val postedBalanceAmount: PostedBalanceAmount?,
                @JsonProperty("show_resulting_ledger_account_balances")
                private val showResultingLedgerAccountBalances: Boolean?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction") fun direction(): TransactionDirection = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                fun showResultingLedgerAccountBalances(): Boolean? =
                    showResultingLedgerAccountBalances

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var direction: TransactionDirection? = null
                    private var ledgerAccountId: String? = null
                    private var availableBalanceAmount: AvailableBalanceAmount? = null
                    private var lockVersion: Long? = null
                    private var metadata: Metadata? = null
                    private var pendingBalanceAmount: PendingBalanceAmount? = null
                    private var postedBalanceAmount: PostedBalanceAmount? = null
                    private var showResultingLedgerAccountBalances: Boolean? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        amount = ledgerEntryCreateRequest.amount
                        direction = ledgerEntryCreateRequest.direction
                        ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                        lockVersion = ledgerEntryCreateRequest.lockVersion
                        metadata = ledgerEntryCreateRequest.metadata
                        pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        additionalProperties =
                            ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: TransactionDirection) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: String) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                        apply {
                            this.availableBalanceAmount = availableBalanceAmount
                        }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long?) = apply { this.lockVersion = lockVersion }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) = apply {
                        this.pendingBalanceAmount = pendingBalanceAmount
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
                        this.postedBalanceAmount = postedBalanceAmount
                    }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean?
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) =
                        showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances as Boolean?
                        )

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

                    fun build(): LedgerEntryCreateRequest =
                        LedgerEntryCreateRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(direction) { "`direction` is required but was not set" },
                            checkNotNull(ledgerAccountId) {
                                "`ledgerAccountId` is required but was not set"
                            },
                            availableBalanceAmount,
                            lockVersion,
                            metadata,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            showResultingLedgerAccountBalances,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class AvailableBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                            additionalProperties =
                                availableBalanceAmount.additionalProperties.toMutableMap()
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

                        fun build(): AvailableBalanceAmount =
                            AvailableBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

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

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class PendingBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                            additionalProperties =
                                pendingBalanceAmount.additionalProperties.toMutableMap()
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

                        fun build(): PendingBalanceAmount =
                            PendingBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class PostedBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                            additionalProperties =
                                postedBalanceAmount.additionalProperties.toMutableMap()
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

                        fun build(): PostedBalanceAmount =
                            PostedBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                enum class Known {
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    RETURN,
                    REVERSAL,
                }

                enum class Value {
                    EXPECTED_PAYMENT,
                    INCOMING_PAYMENT_DETAIL,
                    PAPER_ITEM,
                    PAYMENT_ORDER,
                    RETURN,
                    REVERSAL,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()

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
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ARCHIVED = of("archived")

                    val PENDING = of("pending")

                    val POSTED = of("posted")

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
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

        return /* spotless:off */ other is BulkRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BulkRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
