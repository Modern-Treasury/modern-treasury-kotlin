// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

/** Get a list of documents. */
class DocumentListParams
private constructor(
    private val afterCursor: String?,
    private val documentableId: String?,
    private val documentableType: DocumentableType?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): String? = afterCursor

    /** The unique identifier for the associated object. */
    fun documentableId(): String? = documentableId

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`, `decision`,
     * or `external_account`.
     */
    fun documentableType(): DocumentableType? = documentableType

    fun perPage(): Long? = perPage

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DocumentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DocumentListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DocumentListParams]. */
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var documentableId: String? = null
        private var documentableType: DocumentableType? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentListParams: DocumentListParams) = apply {
            afterCursor = documentListParams.afterCursor
            documentableId = documentListParams.documentableId
            documentableType = documentListParams.documentableType
            perPage = documentListParams.perPage
            additionalHeaders = documentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String?) = apply { this.documentableId = documentableId }

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: DocumentableType?) = apply {
            this.documentableType = documentableType
        }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

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
         * Returns an immutable instance of [DocumentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentListParams =
            DocumentListParams(
                afterCursor,
                documentableId,
                documentableType,
                perPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterCursor?.let { put("after_cursor", it) }
                documentableId?.let { put("documentable_id", it) }
                documentableType?.let { put("documentable_type", it.toString()) }
                perPage?.let { put("per_page", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`, `decision`,
     * or `external_account`.
     */
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

        return other is DocumentListParams &&
            afterCursor == other.afterCursor &&
            documentableId == other.documentableId &&
            documentableType == other.documentableType &&
            perPage == other.perPage &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            afterCursor,
            documentableId,
            documentableType,
            perPage,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DocumentListParams{afterCursor=$afterCursor, documentableId=$documentableId, documentableType=$documentableType, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
