// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.MultipartField
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
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

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * A category given to the document, can be `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentType(): String? = body.documentType()

    /**
     * The unique identifier for the associated object.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentableId(): String? = body.documentableId()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentableType(): DocumentableType? = body.documentableType()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentType(): MultipartField<String> = body._documentType()

    /**
     * Returns the raw multipart value of [documentableId].
     *
     * Unlike [documentableId], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentableId(): MultipartField<String> = body._documentableId()

    /**
     * Returns the raw multipart value of [documentableType].
     *
     * Unlike [documentableType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentableType(): MultipartField<DocumentableType> = body._documentableType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentCreateParams]. */
    class Builder internal constructor() {

        private var body: DocumentCreateRequest.Builder = DocumentCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentCreateParams: DocumentCreateParams) = apply {
            body = documentCreateParams.body.toBuilder()
            additionalHeaders = documentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [documentType]
         * - [documentableId]
         * - [documentableType]
         */
        fun body(body: DocumentCreateRequest) = apply { this.body = body.toBuilder() }

        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        fun file(file: ByteArray) = apply { body.file(file) }

        fun file(path: Path) = apply { body.file(path) }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String) = apply { body.documentType(documentType) }

        /**
         * Sets [Builder.documentType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentType(documentType: MultipartField<String>) = apply {
            body.documentType(documentType)
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = apply { body.documentableId(documentableId) }

        /**
         * Sets [Builder.documentableId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentableId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentableId(documentableId: MultipartField<String>) = apply {
            body.documentableId(documentableId)
        }

        fun documentableType(documentableType: DocumentableType) = apply {
            body.documentableType(documentableType)
        }

        /**
         * Sets [Builder.documentableType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentableType] with a well-typed [DocumentableType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentableType(documentableType: MultipartField<DocumentableType>) = apply {
            body.documentableType(documentableType)
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
         * Returns an immutable instance of [DocumentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentCreateParams =
            DocumentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "document_type" to _documentType(),
                "documentable_id" to _documentableId(),
                "documentable_type" to _documentableType(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class DocumentCreateRequest
    private constructor(
        private val file: MultipartField<InputStream>,
        private val documentType: MultipartField<String>,
        private val documentableId: MultipartField<String>,
        private val documentableType: MultipartField<DocumentableType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * A category given to the document, can be `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentType(): String? = documentType.value.getNullable("document_type")

        /**
         * The unique identifier for the associated object.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentableId(): String? = documentableId.value.getNullable("documentable_id")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentableType(): DocumentableType? =
            documentableType.value.getNullable("documentable_type")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): MultipartField<String> = documentType

        /**
         * Returns the raw multipart value of [documentableId].
         *
         * Unlike [documentableId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("documentable_id")
        @ExcludeMissing
        fun _documentableId(): MultipartField<String> = documentableId

        /**
         * Returns the raw multipart value of [documentableType].
         *
         * Unlike [documentableType], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("documentable_type")
        @ExcludeMissing
        fun _documentableType(): MultipartField<DocumentableType> = documentableType

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
             * Returns a mutable builder for constructing an instance of [DocumentCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .file()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DocumentCreateRequest]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var documentType: MultipartField<String> = MultipartField.of(null)
            private var documentableId: MultipartField<String> = MultipartField.of(null)
            private var documentableType: MultipartField<DocumentableType> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(documentCreateRequest: DocumentCreateRequest) = apply {
                file = documentCreateRequest.file
                documentType = documentCreateRequest.documentType
                documentableId = documentCreateRequest.documentableId
                documentableType = documentCreateRequest.documentableType
                additionalProperties = documentCreateRequest.additionalProperties.toMutableMap()
            }

            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            fun file(file: ByteArray) = file(file.inputStream())

            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: String) = documentType(MultipartField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: MultipartField<String>) = apply {
                this.documentType = documentType
            }

            /** The unique identifier for the associated object. */
            fun documentableId(documentableId: String) =
                documentableId(MultipartField.of(documentableId))

            /**
             * Sets [Builder.documentableId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentableId(documentableId: MultipartField<String>) = apply {
                this.documentableId = documentableId
            }

            fun documentableType(documentableType: DocumentableType) =
                documentableType(MultipartField.of(documentableType))

            /**
             * Sets [Builder.documentableType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentableType] with a well-typed
             * [DocumentableType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun documentableType(documentableType: MultipartField<DocumentableType>) = apply {
                this.documentableType = documentableType
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
             * Returns an immutable instance of [DocumentCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DocumentCreateRequest =
                DocumentCreateRequest(
                    checkRequired("file", file),
                    documentType,
                    documentableId,
                    documentableType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): DocumentCreateRequest = apply {
            if (validated) {
                return@apply
            }

            file()
            documentType()
            documentableId()
            documentableType()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentCreateRequest &&
                file == other.file &&
                documentType == other.documentType &&
                documentableId == other.documentableId &&
                documentableType == other.documentableType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(file, documentType, documentableId, documentableType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DocumentCreateRequest{file=$file, documentType=$documentType, documentableId=$documentableId, documentableType=$documentableType, additionalProperties=$additionalProperties}"
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

            val CONNECTION = of("connection")

            val COUNTERPARTY = of("counterparty")

            val EXPECTED_PAYMENT = of("expected_payment")

            val EXTERNAL_ACCOUNT = of("external_account")

            val IDENTIFICATION = of("identification")

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val INTERNAL_ACCOUNT = of("internal_account")

            val LEGAL_ENTITY = of("legal_entity")

            val ORGANIZATION = of("organization")

            val PAYMENT_ORDER = of("payment_order")

            val TRANSACTION = of("transaction")

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        /** An enum containing [DocumentableType]'s known values. */
        enum class Known {
            CONNECTION,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            IDENTIFICATION,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            LEGAL_ENTITY,
            ORGANIZATION,
            PAYMENT_ORDER,
            TRANSACTION,
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
            CONNECTION,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            IDENTIFICATION,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            LEGAL_ENTITY,
            ORGANIZATION,
            PAYMENT_ORDER,
            TRANSACTION,
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
                CONNECTION -> Value.CONNECTION
                COUNTERPARTY -> Value.COUNTERPARTY
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                IDENTIFICATION -> Value.IDENTIFICATION
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                LEGAL_ENTITY -> Value.LEGAL_ENTITY
                ORGANIZATION -> Value.ORGANIZATION
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                TRANSACTION -> Value.TRANSACTION
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
                CONNECTION -> Known.CONNECTION
                COUNTERPARTY -> Known.COUNTERPARTY
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                IDENTIFICATION -> Known.IDENTIFICATION
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                LEGAL_ENTITY -> Known.LEGAL_ENTITY
                ORGANIZATION -> Known.ORGANIZATION
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                TRANSACTION -> Known.TRANSACTION
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): DocumentableType = apply {
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

            return other is DocumentableType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
