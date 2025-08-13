// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class Accounting
private constructor(
    private val accountId: JsonField<String>,
    private val classId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_id") @ExcludeMissing classId: JsonField<String> = JsonMissing.of(),
    ) : this(accountId, classId, mutableMapOf())

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountId(): String? = accountId.getNullable("account_id")

    /**
     * The ID of one of the class objects in your accounting system. Class objects track segments of
     * your business independent of client or project. Note that these will only be accessible if
     * your accounting system has been connected.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun classId(): String? = classId.getNullable("class_id")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [classId].
     *
     * Unlike [classId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_id") @ExcludeMissing fun _classId(): JsonField<String> = classId

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

        /** Returns a mutable builder for constructing an instance of [Accounting]. */
        fun builder() = Builder()
    }

    /** A builder for [Accounting]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var classId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accounting: Accounting) = apply {
            accountId = accounting.accountId
            classId = accounting.classId
            additionalProperties = accounting.additionalProperties.toMutableMap()
        }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        fun classId(classId: String?) = classId(JsonField.ofNullable(classId))

        /**
         * Sets [Builder.classId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun classId(classId: JsonField<String>) = apply { this.classId = classId }

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
         * Returns an immutable instance of [Accounting].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Accounting =
            Accounting(accountId, classId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Accounting = apply {
        if (validated) {
            return@apply
        }

        accountId()
        classId()
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
        (if (accountId.asKnown() == null) 0 else 1) + (if (classId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Accounting &&
            accountId == other.accountId &&
            classId == other.classId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
}
