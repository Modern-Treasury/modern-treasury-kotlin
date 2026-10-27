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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class LegalEntityRegulator
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val jurisdiction: JsonField<String>,
    private val name: JsonField<String>,
    private val registrationNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        jurisdiction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registration_number")
        @ExcludeMissing
        registrationNumber: JsonField<String> = JsonMissing.of(),
    ) : this(jurisdiction, name, registrationNumber, mutableMapOf())

    /**
     * The country code where the regulator operates in the ISO 3166-1 alpha-2 format (e.g., "US",
     * "CA", "GB").
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jurisdiction(): String = jurisdiction.getRequired("jurisdiction")

    /**
     * Full name of the regulatory body.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Registration or identification number with the regulator.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun registrationNumber(): String = registrationNumber.getRequired("registration_number")

    /**
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jurisdiction")
    @ExcludeMissing
    fun _jurisdiction(): JsonField<String> = jurisdiction

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [registrationNumber].
     *
     * Unlike [registrationNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registration_number")
    @ExcludeMissing
    fun _registrationNumber(): JsonField<String> = registrationNumber

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
         * Returns a mutable builder for constructing an instance of [LegalEntityRegulator].
         *
         * The following fields are required:
         * ```kotlin
         * .jurisdiction()
         * .name()
         * .registrationNumber()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityRegulator]. */
    class Builder internal constructor() {

        private var jurisdiction: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var registrationNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityRegulator: LegalEntityRegulator) = apply {
            jurisdiction = legalEntityRegulator.jurisdiction
            name = legalEntityRegulator.name
            registrationNumber = legalEntityRegulator.registrationNumber
            additionalProperties = legalEntityRegulator.additionalProperties.toMutableMap()
        }

        /**
         * The country code where the regulator operates in the ISO 3166-1 alpha-2 format (e.g.,
         * "US", "CA", "GB").
         */
        fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jurisdiction(jurisdiction: JsonField<String>) = apply {
            this.jurisdiction = jurisdiction
        }

        /** Full name of the regulatory body. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Registration or identification number with the regulator. */
        fun registrationNumber(registrationNumber: String) =
            registrationNumber(JsonField.of(registrationNumber))

        /**
         * Sets [Builder.registrationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationNumber(registrationNumber: JsonField<String>) = apply {
            this.registrationNumber = registrationNumber
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
         * Returns an immutable instance of [LegalEntityRegulator].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .jurisdiction()
         * .name()
         * .registrationNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityRegulator =
            LegalEntityRegulator(
                checkRequired("jurisdiction", jurisdiction),
                checkRequired("name", name),
                checkRequired("registrationNumber", registrationNumber),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): LegalEntityRegulator = apply {
        if (validated) {
            return@apply
        }

        jurisdiction()
        name()
        registrationNumber()
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
        (if (jurisdiction.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (registrationNumber.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityRegulator &&
            jurisdiction == other.jurisdiction &&
            name == other.name &&
            registrationNumber == other.registrationNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(jurisdiction, name, registrationNumber, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntityRegulator{jurisdiction=$jurisdiction, name=$name, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
}
