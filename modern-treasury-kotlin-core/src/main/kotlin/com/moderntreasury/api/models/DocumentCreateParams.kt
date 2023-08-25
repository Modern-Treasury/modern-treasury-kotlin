package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class DocumentCreateParams
constructor(
    private val documentableId: String,
    private val documentableType: DocumentableType,
    private val file: String,
    private val documentType: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun documentableId(): String = documentableId

    fun documentableType(): DocumentableType = documentableType

    fun file(): String = file

    fun documentType(): String? = documentType

    internal fun getBody(): DocumentCreateBody {
        return DocumentCreateBody(
            documentableId,
            documentableType,
            file,
            documentType,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = DocumentCreateBody.Builder::class)
    @NoAutoDetect
    class DocumentCreateBody
    internal constructor(
        private val documentableId: String?,
        private val documentableType: DocumentableType?,
        private val file: String?,
        private val documentType: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The unique identifier for the associated object. */
        @JsonProperty("documentable_id") fun documentableId(): String? = documentableId

        @JsonProperty("documentable_type")
        fun documentableType(): DocumentableType? = documentableType

        @JsonProperty("file") fun file(): String? = file

        /** A category given to the document, can be `null`. */
        @JsonProperty("document_type") fun documentType(): String? = documentType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentCreateBody &&
                this.documentableId == other.documentableId &&
                this.documentableType == other.documentableType &&
                this.file == other.file &&
                this.documentType == other.documentType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        documentableId,
                        documentableType,
                        file,
                        documentType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DocumentCreateBody{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var documentableId: String? = null
            private var documentableType: DocumentableType? = null
            private var file: String? = null
            private var documentType: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(documentCreateBody: DocumentCreateBody) = apply {
                this.documentableId = documentCreateBody.documentableId
                this.documentableType = documentCreateBody.documentableType
                this.file = documentCreateBody.file
                this.documentType = documentCreateBody.documentType
                additionalProperties(documentCreateBody.additionalProperties)
            }

            /** The unique identifier for the associated object. */
            @JsonProperty("documentable_id")
            fun documentableId(documentableId: String) = apply {
                this.documentableId = documentableId
            }

            @JsonProperty("documentable_type")
            fun documentableType(documentableType: DocumentableType) = apply {
                this.documentableType = documentableType
            }

            @JsonProperty("file") fun file(file: String) = apply { this.file = file }

            /** A category given to the document, can be `null`. */
            @JsonProperty("document_type")
            fun documentType(documentType: String) = apply { this.documentType = documentType }

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

            fun build(): DocumentCreateBody =
                DocumentCreateBody(
                    checkNotNull(documentableId) { "`documentableId` is required but was not set" },
                    checkNotNull(documentableType) {
                        "`documentableType` is required but was not set"
                    },
                    checkNotNull(file) { "`file` is required but was not set" },
                    documentType,
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

        return other is DocumentCreateParams &&
            this.documentableId == other.documentableId &&
            this.documentableType == other.documentableType &&
            this.file == other.file &&
            this.documentType == other.documentType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            documentableId,
            documentableType,
            file,
            documentType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DocumentCreateParams{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var documentableId: String? = null
        private var documentableType: DocumentableType? = null
        private var file: String? = null
        private var documentType: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(documentCreateParams: DocumentCreateParams) = apply {
            this.documentableId = documentCreateParams.documentableId
            this.documentableType = documentCreateParams.documentableType
            this.file = documentCreateParams.file
            this.documentType = documentCreateParams.documentType
            additionalQueryParams(documentCreateParams.additionalQueryParams)
            additionalHeaders(documentCreateParams.additionalHeaders)
            additionalBodyProperties(documentCreateParams.additionalBodyProperties)
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = apply { this.documentableId = documentableId }

        fun documentableType(documentableType: DocumentableType) = apply {
            this.documentableType = documentableType
        }

        fun file(file: String) = apply { this.file = file }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String) = apply { this.documentType = documentType }

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

        fun build(): DocumentCreateParams =
            DocumentCreateParams(
                checkNotNull(documentableId) { "`documentableId` is required but was not set" },
                checkNotNull(documentableType) { "`documentableType` is required but was not set" },
                checkNotNull(file) { "`file` is required but was not set" },
                documentType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DocumentableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CASES = DocumentableType(JsonField.of("cases"))

            val COUNTERPARTIES = DocumentableType(JsonField.of("counterparties"))

            val EXPECTED_PAYMENTS = DocumentableType(JsonField.of("expected_payments"))

            val EXTERNAL_ACCOUNTS = DocumentableType(JsonField.of("external_accounts"))

            val INTERNAL_ACCOUNTS = DocumentableType(JsonField.of("internal_accounts"))

            val ORGANIZATIONS = DocumentableType(JsonField.of("organizations"))

            val PAPER_ITEMS = DocumentableType(JsonField.of("paper_items"))

            val PAYMENT_ORDERS = DocumentableType(JsonField.of("payment_orders"))

            val TRANSACTIONS = DocumentableType(JsonField.of("transactions"))

            val DECISIONS = DocumentableType(JsonField.of("decisions"))

            val CONNECTIONS = DocumentableType(JsonField.of("connections"))

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        enum class Known {
            CASES,
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAPER_ITEMS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
            DECISIONS,
            CONNECTIONS,
        }

        enum class Value {
            CASES,
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAPER_ITEMS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
            DECISIONS,
            CONNECTIONS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CASES -> Value.CASES
                COUNTERPARTIES -> Value.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                INTERNAL_ACCOUNTS -> Value.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Value.ORGANIZATIONS
                PAPER_ITEMS -> Value.PAPER_ITEMS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                TRANSACTIONS -> Value.TRANSACTIONS
                DECISIONS -> Value.DECISIONS
                CONNECTIONS -> Value.CONNECTIONS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CASES -> Known.CASES
                COUNTERPARTIES -> Known.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                INTERNAL_ACCOUNTS -> Known.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Known.ORGANIZATIONS
                PAPER_ITEMS -> Known.PAPER_ITEMS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                TRANSACTIONS -> Known.TRANSACTIONS
                DECISIONS -> Known.DECISIONS
                CONNECTIONS -> Known.CONNECTIONS
                else -> throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
