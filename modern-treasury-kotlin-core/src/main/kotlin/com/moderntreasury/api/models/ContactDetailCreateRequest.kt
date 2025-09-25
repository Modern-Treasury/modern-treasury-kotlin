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
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class ContactDetailCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactIdentifier: JsonField<String>,
    private val contactIdentifierType: JsonField<ContactIdentifierType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contact_identifier")
        @ExcludeMissing
        contactIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
    ) : this(contactIdentifier, contactIdentifierType, mutableMapOf())

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun contactIdentifier(): String? = contactIdentifier.getNullable("contact_identifier")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun contactIdentifierType(): ContactIdentifierType? =
        contactIdentifierType.getNullable("contact_identifier_type")

    /**
     * Returns the raw JSON value of [contactIdentifier].
     *
     * Unlike [contactIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contact_identifier")
    @ExcludeMissing
    fun _contactIdentifier(): JsonField<String> = contactIdentifier

    /**
     * Returns the raw JSON value of [contactIdentifierType].
     *
     * Unlike [contactIdentifierType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contact_identifier_type")
    @ExcludeMissing
    fun _contactIdentifierType(): JsonField<ContactIdentifierType> = contactIdentifierType

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
         * Returns a mutable builder for constructing an instance of [ContactDetailCreateRequest].
         */
        fun builder() = Builder()
    }

    /** A builder for [ContactDetailCreateRequest]. */
    class Builder internal constructor() {

        private var contactIdentifier: JsonField<String> = JsonMissing.of()
        private var contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
            contactIdentifier = contactDetailCreateRequest.contactIdentifier
            contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
            additionalProperties = contactDetailCreateRequest.additionalProperties.toMutableMap()
        }

        fun contactIdentifier(contactIdentifier: String) =
            contactIdentifier(JsonField.of(contactIdentifier))

        /**
         * Sets [Builder.contactIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
            this.contactIdentifier = contactIdentifier
        }

        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
            contactIdentifierType(JsonField.of(contactIdentifierType))

        /**
         * Sets [Builder.contactIdentifierType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactIdentifierType] with a well-typed
         * [ContactIdentifierType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) = apply {
            this.contactIdentifierType = contactIdentifierType
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
         * Returns an immutable instance of [ContactDetailCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactDetailCreateRequest =
            ContactDetailCreateRequest(
                contactIdentifier,
                contactIdentifierType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactDetailCreateRequest = apply {
        if (validated) {
            return@apply
        }

        contactIdentifier()
        contactIdentifierType()?.validate()
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
        (if (contactIdentifier.asKnown() == null) 0 else 1) +
            (contactIdentifierType.asKnown()?.validity() ?: 0)

    class ContactIdentifierType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val EMAIL = of("email")

            val PHONE_NUMBER = of("phone_number")

            val WEBSITE = of("website")

            fun of(value: String) = ContactIdentifierType(JsonField.of(value))
        }

        /** An enum containing [ContactIdentifierType]'s known values. */
        enum class Known {
            EMAIL,
            PHONE_NUMBER,
            WEBSITE,
        }

        /**
         * An enum containing [ContactIdentifierType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ContactIdentifierType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL,
            PHONE_NUMBER,
            WEBSITE,
            /**
             * An enum member indicating that [ContactIdentifierType] was instantiated with an
             * unknown value.
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
                EMAIL -> Value.EMAIL
                PHONE_NUMBER -> Value.PHONE_NUMBER
                WEBSITE -> Value.WEBSITE
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
                EMAIL -> Known.EMAIL
                PHONE_NUMBER -> Known.PHONE_NUMBER
                WEBSITE -> Known.WEBSITE
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ContactIdentifierType: $value"
                    )
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

        fun validate(): ContactIdentifierType = apply {
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

            return other is ContactIdentifierType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactDetailCreateRequest &&
            contactIdentifier == other.contactIdentifier &&
            contactIdentifierType == other.contactIdentifierType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
}
