// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.MultipartField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.file.Path
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Create a document. */
class DocumentCreateParams
private constructor(
    private val body: DocumentCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The unique identifier for the associated object. */
    fun documentableId(): String = body.documentableId()

    fun documentableType(): DocumentableType = body.documentableType()

    fun file(): InputStream = body.file()

    /** A category given to the document, can be `null`. */
    fun documentType(): String? = body.documentType()

    /** The unique identifier for the associated object. */
    fun _documentableId(): MultipartField<String> = body._documentableId()

    fun _documentableType(): MultipartField<DocumentableType> = body._documentableType()

    fun _file(): MultipartField<InputStream> = body._file()

    /** A category given to the document, can be `null`. */
    fun _documentType(): MultipartField<String> = body._documentType()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Map<String, MultipartField<*>> =
        mapOf(
                "documentable_id" to _documentableId(),
                "documentable_type" to _documentableType(),
                "file" to _file(),
                "document_type" to _documentType(),
            )
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class DocumentCreateRequest
    @JsonCreator
    private constructor(
        private val documentableId: MultipartField<String>,
        private val documentableType: MultipartField<DocumentableType>,
        private val file: MultipartField<InputStream>,
        private val documentType: MultipartField<String>,
    ) {

        /** The unique identifier for the associated object. */
        fun documentableId(): String = documentableId.value.getRequired("documentable_id")

        fun documentableType(): DocumentableType =
            documentableType.value.getRequired("documentable_type")

        fun file(): InputStream = file.value.getRequired("file")

        /** A category given to the document, can be `null`. */
        fun documentType(): String? = documentType.value.getNullable("document_type")

        /** The unique identifier for the associated object. */
        fun _documentableId(): MultipartField<String> = documentableId

        fun _documentableType(): MultipartField<DocumentableType> = documentableType

        fun _file(): MultipartField<InputStream> = file

        /** A category given to the document, can be `null`. */
        fun _documentType(): MultipartField<String> = documentType

        private var validated: Boolean = false

        fun validate(): DocumentCreateRequest = apply {
            if (validated) {
                return@apply
            }

            documentableId()
            documentableType()
            file()
            documentType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [DocumentCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .documentableId()
             * .documentableType()
             * .file()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DocumentCreateRequest]. */
        class Builder internal constructor() {

            private var documentableId: MultipartField<String>? = null
            private var documentableType: MultipartField<DocumentableType>? = null
            private var file: MultipartField<InputStream>? = null
            private var documentType: MultipartField<String> = MultipartField.of(null)

            internal fun from(documentCreateRequest: DocumentCreateRequest) = apply {
                documentableId = documentCreateRequest.documentableId
                documentableType = documentCreateRequest.documentableType
                file = documentCreateRequest.file
                documentType = documentCreateRequest.documentType
            }

            /** The unique identifier for the associated object. */
            fun documentableId(documentableId: String) =
                documentableId(MultipartField.of(documentableId))

            /** The unique identifier for the associated object. */
            fun documentableId(documentableId: MultipartField<String>) = apply {
                this.documentableId = documentableId
            }

            fun documentableType(documentableType: DocumentableType) =
                documentableType(MultipartField.of(documentableType))

            fun documentableType(documentableType: MultipartField<DocumentableType>) = apply {
                this.documentableType = documentableType
            }

            fun file(file: InputStream) = file(MultipartField.of(file))

            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            fun file(file: ByteArray) = file(ByteArrayInputStream(file))

            fun file(file: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(file.inputStream())
                        .filename(file.name)
                        .build()
                )

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: String) = documentType(MultipartField.of(documentType))

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: MultipartField<String>) = apply {
                this.documentType = documentType
            }

            fun build(): DocumentCreateRequest =
                DocumentCreateRequest(
                    checkRequired("documentableId", documentableId),
                    checkRequired("documentableType", documentableType),
                    checkRequired("file", file),
                    documentType,
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentCreateRequest && documentableId == other.documentableId && documentableType == other.documentableType && file == other.file && documentType == other.documentType /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(documentableId, documentableType, file, documentType) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DocumentCreateRequest{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .documentableId()
         * .documentableType()
         * .file()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: DocumentCreateRequest.Builder = DocumentCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentCreateParams: DocumentCreateParams) = apply {
            body = documentCreateParams.body.toBuilder()
            additionalHeaders = documentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentCreateParams.additionalQueryParams.toBuilder()
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = apply { body.documentableId(documentableId) }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: MultipartField<String>) = apply {
            body.documentableId(documentableId)
        }

        fun documentableType(documentableType: DocumentableType) = apply {
            body.documentableType(documentableType)
        }

        fun documentableType(documentableType: MultipartField<DocumentableType>) = apply {
            body.documentableType(documentableType)
        }

        fun file(file: InputStream) = apply { body.file(file) }

        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        fun file(file: ByteArray) = apply { body.file(file) }

        fun file(file: Path) = apply { body.file(file) }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String) = apply { body.documentType(documentType) }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: MultipartField<String>) = apply {
            body.documentType(documentType)
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

        fun build(): DocumentCreateParams =
            DocumentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class DocumentableType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CASES = of("cases")

            val COUNTERPARTIES = of("counterparties")

            val EXPECTED_PAYMENTS = of("expected_payments")

            val EXTERNAL_ACCOUNTS = of("external_accounts")

            val INCOMING_PAYMENT_DETAILS = of("incoming_payment_details")

            val INTERNAL_ACCOUNTS = of("internal_accounts")

            val ORGANIZATIONS = of("organizations")

            val PAPER_ITEMS = of("paper_items")

            val PAYMENT_ORDERS = of("payment_orders")

            val TRANSACTIONS = of("transactions")

            val DECISIONS = of("decisions")

            val CONNECTIONS = of("connections")

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        /** An enum containing [DocumentableType]'s known values. */
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

        /**
         * An enum containing [DocumentableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [DocumentableType] was instantiated with an unknown
             * value.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DocumentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
