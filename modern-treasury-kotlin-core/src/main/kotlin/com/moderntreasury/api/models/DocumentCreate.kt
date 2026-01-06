// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class DocumentCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val documentableId: JsonField<String>,
    private val documentableType: JsonField<DocumentableType>,
    private val file: JsonField<String>,
    private val documentType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("documentable_id")
        @ExcludeMissing
        documentableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentable_type")
        @ExcludeMissing
        documentableType: JsonField<DocumentableType> = JsonMissing.of(),
        @JsonProperty("file") @ExcludeMissing file: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<String> = JsonMissing.of(),
    ) : this(documentableId, documentableType, file, documentType, mutableMapOf())

    /**
     * The unique identifier for the associated object.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentableId(): String = documentableId.getRequired("documentable_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentableType(): DocumentableType = documentableType.getRequired("documentable_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): String = file.getRequired("file")

    /**
     * A category given to the document, can be `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentType(): String? = documentType.getNullable("document_type")

    /**
     * Returns the raw JSON value of [documentableId].
     *
     * Unlike [documentableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentable_id")
    @ExcludeMissing
    fun _documentableId(): JsonField<String> = documentableId

    /**
     * Returns the raw JSON value of [documentableType].
     *
     * Unlike [documentableType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("documentable_type")
    @ExcludeMissing
    fun _documentableType(): JsonField<DocumentableType> = documentableType

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<String> = file

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<String> = documentType

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
         * Returns a mutable builder for constructing an instance of [DocumentCreate].
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

    /** A builder for [DocumentCreate]. */
    class Builder internal constructor() {

        private var documentableId: JsonField<String>? = null
        private var documentableType: JsonField<DocumentableType>? = null
        private var file: JsonField<String>? = null
        private var documentType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(documentCreate: DocumentCreate) = apply {
            documentableId = documentCreate.documentableId
            documentableType = documentCreate.documentableType
            file = documentCreate.file
            documentType = documentCreate.documentType
            additionalProperties = documentCreate.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = documentableId(JsonField.of(documentableId))

        /**
         * Sets [Builder.documentableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentableId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentableId(documentableId: JsonField<String>) = apply {
            this.documentableId = documentableId
        }

        fun documentableType(documentableType: DocumentableType) =
            documentableType(JsonField.of(documentableType))

        /**
         * Sets [Builder.documentableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentableType] with a well-typed [DocumentableType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentableType(documentableType: JsonField<DocumentableType>) = apply {
            this.documentableType = documentableType
        }

        fun file(file: String) = file(JsonField.of(file))

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun file(file: JsonField<String>) = apply { this.file = file }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
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
         * Returns an immutable instance of [DocumentCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .documentableId()
         * .documentableType()
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentCreate =
            DocumentCreate(
                checkRequired("documentableId", documentableId),
                checkRequired("documentableType", documentableType),
                checkRequired("file", file),
                documentType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentCreate = apply {
        if (validated) {
            return@apply
        }

        documentableId()
        documentableType().validate()
        file()
        documentType()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (documentableId.asKnown() == null) 0 else 1) +
            (documentableType.asKnown()?.validity() ?: 0) +
            (if (file.asKnown() == null) 0 else 1) +
            (if (documentType.asKnown() == null) 0 else 1)

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

            val COUNTERPARTIES = of("counterparties")

            val EXPECTED_PAYMENTS = of("expected_payments")

            val EXTERNAL_ACCOUNTS = of("external_accounts")

            val IDENTIFICATIONS = of("identifications")

            val INCOMING_PAYMENT_DETAILS = of("incoming_payment_details")

            val INTERNAL_ACCOUNTS = of("internal_accounts")

            val ORGANIZATIONS = of("organizations")

            val PAYMENT_ORDERS = of("payment_orders")

            val TRANSACTIONS = of("transactions")

            val CONNECTIONS = of("connections")

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        /** An enum containing [DocumentableType]'s known values. */
        enum class Known {
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            IDENTIFICATIONS,
            INCOMING_PAYMENT_DETAILS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
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
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            IDENTIFICATIONS,
            INCOMING_PAYMENT_DETAILS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
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
                COUNTERPARTIES -> Value.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                IDENTIFICATIONS -> Value.IDENTIFICATIONS
                INCOMING_PAYMENT_DETAILS -> Value.INCOMING_PAYMENT_DETAILS
                INTERNAL_ACCOUNTS -> Value.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Value.ORGANIZATIONS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                TRANSACTIONS -> Value.TRANSACTIONS
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
                COUNTERPARTIES -> Known.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                IDENTIFICATIONS -> Known.IDENTIFICATIONS
                INCOMING_PAYMENT_DETAILS -> Known.INCOMING_PAYMENT_DETAILS
                INTERNAL_ACCOUNTS -> Known.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Known.ORGANIZATIONS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                TRANSACTIONS -> Known.TRANSACTIONS
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

        private var validated: Boolean = false

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

        return other is DocumentCreate &&
            documentableId == other.documentableId &&
            documentableType == other.documentableType &&
            file == other.file &&
            documentType == other.documentType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(documentableId, documentableType, file, documentType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentCreate{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType, additionalProperties=$additionalProperties}"
}
