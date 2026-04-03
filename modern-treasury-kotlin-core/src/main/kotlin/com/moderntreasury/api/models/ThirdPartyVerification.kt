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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ThirdPartyVerification
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val outcome: JsonField<Outcome>,
    private val vendor: JsonField<Vendor>,
    private val vendorVerificationId: JsonField<String>,
    private val verificationCategory: JsonField<VerificationCategory>,
    private val verificationMethod: JsonField<String>,
    private val verificationTime: JsonField<OffsetDateTime>,
    private val comment: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
        @JsonProperty("vendor") @ExcludeMissing vendor: JsonField<Vendor> = JsonMissing.of(),
        @JsonProperty("vendor_verification_id")
        @ExcludeMissing
        vendorVerificationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_category")
        @ExcludeMissing
        verificationCategory: JsonField<VerificationCategory> = JsonMissing.of(),
        @JsonProperty("verification_method")
        @ExcludeMissing
        verificationMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_time")
        @ExcludeMissing
        verificationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
    ) : this(
        outcome,
        vendor,
        vendorVerificationId,
        verificationCategory,
        verificationMethod,
        verificationTime,
        comment,
        mutableMapOf(),
    )

    /**
     * The outcome of the verification. One of `passed` or `failed`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outcome(): Outcome = outcome.getRequired("outcome")

    /**
     * The vendor that performed the verification, e.g. `persona`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vendor(): Vendor = vendor.getRequired("vendor")

    /**
     * The identification of the third party verification in `vendor`'s system.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vendorVerificationId(): String = vendorVerificationId.getRequired("vendor_verification_id")

    /**
     * The category of verification performed.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationCategory(): VerificationCategory =
        verificationCategory.getRequired("verification_category")

    /**
     * The method used to perform the verification.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationMethod(): String = verificationMethod.getRequired("verification_method")

    /**
     * The timestamp when the verification was performed.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationTime(): OffsetDateTime = verificationTime.getRequired("verification_time")

    /**
     * An optional comment about the verification.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun comment(): String? = comment.getNullable("comment")

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

    /**
     * Returns the raw JSON value of [vendor].
     *
     * Unlike [vendor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor") @ExcludeMissing fun _vendor(): JsonField<Vendor> = vendor

    /**
     * Returns the raw JSON value of [vendorVerificationId].
     *
     * Unlike [vendorVerificationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vendor_verification_id")
    @ExcludeMissing
    fun _vendorVerificationId(): JsonField<String> = vendorVerificationId

    /**
     * Returns the raw JSON value of [verificationCategory].
     *
     * Unlike [verificationCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_category")
    @ExcludeMissing
    fun _verificationCategory(): JsonField<VerificationCategory> = verificationCategory

    /**
     * Returns the raw JSON value of [verificationMethod].
     *
     * Unlike [verificationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod(): JsonField<String> = verificationMethod

    /**
     * Returns the raw JSON value of [verificationTime].
     *
     * Unlike [verificationTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_time")
    @ExcludeMissing
    fun _verificationTime(): JsonField<OffsetDateTime> = verificationTime

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

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
         * Returns a mutable builder for constructing an instance of [ThirdPartyVerification].
         *
         * The following fields are required:
         * ```kotlin
         * .outcome()
         * .vendor()
         * .vendorVerificationId()
         * .verificationCategory()
         * .verificationMethod()
         * .verificationTime()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ThirdPartyVerification]. */
    class Builder internal constructor() {

        private var outcome: JsonField<Outcome>? = null
        private var vendor: JsonField<Vendor>? = null
        private var vendorVerificationId: JsonField<String>? = null
        private var verificationCategory: JsonField<VerificationCategory>? = null
        private var verificationMethod: JsonField<String>? = null
        private var verificationTime: JsonField<OffsetDateTime>? = null
        private var comment: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(thirdPartyVerification: ThirdPartyVerification) = apply {
            outcome = thirdPartyVerification.outcome
            vendor = thirdPartyVerification.vendor
            vendorVerificationId = thirdPartyVerification.vendorVerificationId
            verificationCategory = thirdPartyVerification.verificationCategory
            verificationMethod = thirdPartyVerification.verificationMethod
            verificationTime = thirdPartyVerification.verificationTime
            comment = thirdPartyVerification.comment
            additionalProperties = thirdPartyVerification.additionalProperties.toMutableMap()
        }

        /** The outcome of the verification. One of `passed` or `failed`. */
        fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

        /** The vendor that performed the verification, e.g. `persona`. */
        fun vendor(vendor: Vendor) = vendor(JsonField.of(vendor))

        /**
         * Sets [Builder.vendor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendor] with a well-typed [Vendor] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vendor(vendor: JsonField<Vendor>) = apply { this.vendor = vendor }

        /** The identification of the third party verification in `vendor`'s system. */
        fun vendorVerificationId(vendorVerificationId: String) =
            vendorVerificationId(JsonField.of(vendorVerificationId))

        /**
         * Sets [Builder.vendorVerificationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorVerificationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorVerificationId(vendorVerificationId: JsonField<String>) = apply {
            this.vendorVerificationId = vendorVerificationId
        }

        /** The category of verification performed. */
        fun verificationCategory(verificationCategory: VerificationCategory) =
            verificationCategory(JsonField.of(verificationCategory))

        /**
         * Sets [Builder.verificationCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationCategory] with a well-typed
         * [VerificationCategory] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun verificationCategory(verificationCategory: JsonField<VerificationCategory>) = apply {
            this.verificationCategory = verificationCategory
        }

        /** The method used to perform the verification. */
        fun verificationMethod(verificationMethod: String) =
            verificationMethod(JsonField.of(verificationMethod))

        /**
         * Sets [Builder.verificationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationMethod] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verificationMethod(verificationMethod: JsonField<String>) = apply {
            this.verificationMethod = verificationMethod
        }

        /** The timestamp when the verification was performed. */
        fun verificationTime(verificationTime: OffsetDateTime) =
            verificationTime(JsonField.of(verificationTime))

        /**
         * Sets [Builder.verificationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun verificationTime(verificationTime: JsonField<OffsetDateTime>) = apply {
            this.verificationTime = verificationTime
        }

        /** An optional comment about the verification. */
        fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

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
         * Returns an immutable instance of [ThirdPartyVerification].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .outcome()
         * .vendor()
         * .vendorVerificationId()
         * .verificationCategory()
         * .verificationMethod()
         * .verificationTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThirdPartyVerification =
            ThirdPartyVerification(
                checkRequired("outcome", outcome),
                checkRequired("vendor", vendor),
                checkRequired("vendorVerificationId", vendorVerificationId),
                checkRequired("verificationCategory", verificationCategory),
                checkRequired("verificationMethod", verificationMethod),
                checkRequired("verificationTime", verificationTime),
                comment,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ThirdPartyVerification = apply {
        if (validated) {
            return@apply
        }

        outcome().validate()
        vendor().validate()
        vendorVerificationId()
        verificationCategory().validate()
        verificationMethod()
        verificationTime()
        comment()
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
        (outcome.asKnown()?.validity() ?: 0) +
            (vendor.asKnown()?.validity() ?: 0) +
            (if (vendorVerificationId.asKnown() == null) 0 else 1) +
            (verificationCategory.asKnown()?.validity() ?: 0) +
            (if (verificationMethod.asKnown() == null) 0 else 1) +
            (if (verificationTime.asKnown() == null) 0 else 1) +
            (if (comment.asKnown() == null) 0 else 1)

    /** The outcome of the verification. One of `passed` or `failed`. */
    class Outcome @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PASSED = of("passed")

            val FAILED = of("failed")

            fun of(value: String) = Outcome(JsonField.of(value))
        }

        /** An enum containing [Outcome]'s known values. */
        enum class Known {
            PASSED,
            FAILED,
        }

        /**
         * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Outcome] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PASSED,
            FAILED,
            /** An enum member indicating that [Outcome] was instantiated with an unknown value. */
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
                PASSED -> Value.PASSED
                FAILED -> Value.FAILED
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
                PASSED -> Known.PASSED
                FAILED -> Known.FAILED
                else -> throw ModernTreasuryInvalidDataException("Unknown Outcome: $value")
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

        fun validate(): Outcome = apply {
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

            return other is Outcome && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The vendor that performed the verification, e.g. `persona`. */
    class Vendor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PERSONA = of("persona")

            val MIDDESK = of("middesk")

            val ALLOY = of("alloy")

            val SUMSUB = of("sumsub")

            val VERIFF = of("veriff")

            fun of(value: String) = Vendor(JsonField.of(value))
        }

        /** An enum containing [Vendor]'s known values. */
        enum class Known {
            PERSONA,
            MIDDESK,
            ALLOY,
            SUMSUB,
            VERIFF,
        }

        /**
         * An enum containing [Vendor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Vendor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERSONA,
            MIDDESK,
            ALLOY,
            SUMSUB,
            VERIFF,
            /** An enum member indicating that [Vendor] was instantiated with an unknown value. */
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
                PERSONA -> Value.PERSONA
                MIDDESK -> Value.MIDDESK
                ALLOY -> Value.ALLOY
                SUMSUB -> Value.SUMSUB
                VERIFF -> Value.VERIFF
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
                PERSONA -> Known.PERSONA
                MIDDESK -> Known.MIDDESK
                ALLOY -> Known.ALLOY
                SUMSUB -> Known.SUMSUB
                VERIFF -> Known.VERIFF
                else -> throw ModernTreasuryInvalidDataException("Unknown Vendor: $value")
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

        fun validate(): Vendor = apply {
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

            return other is Vendor && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The category of verification performed. */
    class VerificationCategory
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

            val LEGAL_NAME = of("legal_name")

            val DATE_OF_BIRTH = of("date_of_birth")

            val ADDRESS = of("address")

            val GOVERNMENT_ID_NUMBER = of("government_id_number")

            val ADVERSE_MEDIA = of("adverse_media")

            fun of(value: String) = VerificationCategory(JsonField.of(value))
        }

        /** An enum containing [VerificationCategory]'s known values. */
        enum class Known {
            LEGAL_NAME,
            DATE_OF_BIRTH,
            ADDRESS,
            GOVERNMENT_ID_NUMBER,
            ADVERSE_MEDIA,
        }

        /**
         * An enum containing [VerificationCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [VerificationCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LEGAL_NAME,
            DATE_OF_BIRTH,
            ADDRESS,
            GOVERNMENT_ID_NUMBER,
            ADVERSE_MEDIA,
            /**
             * An enum member indicating that [VerificationCategory] was instantiated with an
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
                LEGAL_NAME -> Value.LEGAL_NAME
                DATE_OF_BIRTH -> Value.DATE_OF_BIRTH
                ADDRESS -> Value.ADDRESS
                GOVERNMENT_ID_NUMBER -> Value.GOVERNMENT_ID_NUMBER
                ADVERSE_MEDIA -> Value.ADVERSE_MEDIA
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
                LEGAL_NAME -> Known.LEGAL_NAME
                DATE_OF_BIRTH -> Known.DATE_OF_BIRTH
                ADDRESS -> Known.ADDRESS
                GOVERNMENT_ID_NUMBER -> Known.GOVERNMENT_ID_NUMBER
                ADVERSE_MEDIA -> Known.ADVERSE_MEDIA
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationCategory: $value")
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

        fun validate(): VerificationCategory = apply {
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

            return other is VerificationCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThirdPartyVerification &&
            outcome == other.outcome &&
            vendor == other.vendor &&
            vendorVerificationId == other.vendorVerificationId &&
            verificationCategory == other.verificationCategory &&
            verificationMethod == other.verificationMethod &&
            verificationTime == other.verificationTime &&
            comment == other.comment &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            outcome,
            vendor,
            vendorVerificationId,
            verificationCategory,
            verificationMethod,
            verificationTime,
            comment,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThirdPartyVerification{outcome=$outcome, vendor=$vendor, vendorVerificationId=$vendorVerificationId, verificationCategory=$verificationCategory, verificationMethod=$verificationMethod, verificationTime=$verificationTime, comment=$comment, additionalProperties=$additionalProperties}"
}
