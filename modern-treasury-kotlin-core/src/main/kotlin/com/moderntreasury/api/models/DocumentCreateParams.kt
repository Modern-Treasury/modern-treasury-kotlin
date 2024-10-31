// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ContentTypes
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.MultipartFormValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects
import org.apache.hc.core5.http.ContentType

class DocumentCreateParams
constructor(
    private val documentableId: MultipartFormValue<String>,
    private val documentableType: MultipartFormValue<DocumentableType>,
    private val file: MultipartFormValue<ByteArray>,
    private val documentType: MultipartFormValue<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun documentableId(): MultipartFormValue<String> = documentableId

    fun documentableType(): MultipartFormValue<DocumentableType> = documentableType

    fun file(): MultipartFormValue<ByteArray> = file

    fun documentType(): MultipartFormValue<String>? = documentType

    internal fun getBody(): Array<MultipartFormValue<*>?> {
        return arrayOf(
            documentableId,
            documentableType,
            file,
            documentType,
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
        private val file: ByteArray?,
        private val documentType: String?,
    ) {

        /** The unique identifier for the associated object. */
        fun documentableId(): String? = documentableId

        fun documentableType(): DocumentableType? = documentableType

        fun file(): ByteArray? = file

        /** A category given to the document, can be `null`. */
        fun documentType(): String? = documentType

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var documentableId: String? = null
            private var documentableType: DocumentableType? = null
            private var file: ByteArray? = null
            private var documentType: String? = null

            internal fun from(documentCreateBody: DocumentCreateBody) = apply {
                this.documentableId = documentCreateBody.documentableId
                this.documentableType = documentCreateBody.documentableType
                this.file = documentCreateBody.file
                this.documentType = documentCreateBody.documentType
            }

            /** The unique identifier for the associated object. */
            fun documentableId(documentableId: String) = apply {
                this.documentableId = documentableId
            }

            fun documentableType(documentableType: DocumentableType) = apply {
                this.documentableType = documentableType
            }

            fun file(file: ByteArray) = apply { this.file = file }

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: String) = apply { this.documentType = documentType }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentCreateBody && this.documentableId == other.documentableId && this.documentableType == other.documentableType && this.file == other.file && this.documentType == other.documentType /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(documentableId, documentableType, file, documentType) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DocumentCreateBody{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentCreateParams && this.documentableId == other.documentableId && this.documentableType == other.documentableType && this.file == other.file && this.documentType == other.documentType && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(documentableId, documentableType, file, documentType, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "DocumentCreateParams{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var documentableId: MultipartFormValue<String>? = null
        private var documentableType: MultipartFormValue<DocumentableType>? = null
        private var file: MultipartFormValue<ByteArray>? = null
        private var documentType: MultipartFormValue<String>? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(documentCreateParams: DocumentCreateParams) = apply {
            this.documentableId = documentCreateParams.documentableId
            this.documentableType = documentCreateParams.documentableType
            this.file = documentCreateParams.file
            this.documentType = documentCreateParams.documentType
            additionalQueryParams(documentCreateParams.additionalQueryParams)
            additionalHeaders(documentCreateParams.additionalHeaders)
        }

        /** The unique identifier for the associated object. */
        fun documentableId(
            documentableId: String,
            contentType: ContentType = ContentTypes.DefaultText
        ) = apply {
            this.documentableId =
                MultipartFormValue.fromString("documentableId", documentableId, contentType)
        }

        fun documentableType(
            documentableType: DocumentableType,
            contentType: ContentType = ContentTypes.DefaultText
        ) = apply {
            this.documentableType =
                MultipartFormValue.fromEnum("documentableType", documentableType, contentType)
        }

        fun file(
            content: ByteArray,
            filename: String? = null,
            contentType: ContentType = ContentTypes.DefaultBinary
        ) = apply {
            this.file = MultipartFormValue.fromByteArray("file", content, contentType, filename)
        }

        /** A category given to the document, can be `null`. */
        fun documentType(
            documentType: String,
            contentType: ContentType = ContentTypes.DefaultText
        ) = apply {
            this.documentType =
                MultipartFormValue.fromString("documentType", documentType, contentType)
        }

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

        fun build(): DocumentCreateParams =
            DocumentCreateParams(
                checkNotNull(documentableId) { "`documentableId` is required but was not set" },
                checkNotNull(documentableType) { "`documentableType` is required but was not set" },
                checkNotNull(file) { "`file` is required but was not set" },
                documentType,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }

    class DocumentableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentableType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CASES = DocumentableType(JsonField.of("cases"))

            val COUNTERPARTIES = DocumentableType(JsonField.of("counterparties"))

            val EXPECTED_PAYMENTS = DocumentableType(JsonField.of("expected_payments"))

            val EXTERNAL_ACCOUNTS = DocumentableType(JsonField.of("external_accounts"))

            val INCOMING_PAYMENT_DETAILS =
                DocumentableType(JsonField.of("incoming_payment_details"))

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
            INCOMING_PAYMENT_DETAILS,
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
            INCOMING_PAYMENT_DETAILS,
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
                INCOMING_PAYMENT_DETAILS -> Value.INCOMING_PAYMENT_DETAILS
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
                INCOMING_PAYMENT_DETAILS -> Known.INCOMING_PAYMENT_DETAILS
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
