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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LegalEntityIndustryClassification
private constructor(
    private val id: JsonField<String>,
    private val classificationCodes: JsonField<List<String>>,
    private val classificationType: JsonField<ClassificationType>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classification_codes")
        @ExcludeMissing
        classificationCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("classification_type")
        @ExcludeMissing
        classificationType: JsonField<ClassificationType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        classificationCodes,
        classificationType,
        createdAt,
        discardedAt,
        liveMode,
        object_,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The industry classification codes for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationCodes(): List<String> =
        classificationCodes.getRequired("classification_codes")

    /**
     * The classification system of the classification codes.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationType(): ClassificationType =
        classificationType.getRequired("classification_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [classificationCodes].
     *
     * Unlike [classificationCodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("classification_codes")
    @ExcludeMissing
    fun _classificationCodes(): JsonField<List<String>> = classificationCodes

    /**
     * Returns the raw JSON value of [classificationType].
     *
     * Unlike [classificationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("classification_type")
    @ExcludeMissing
    fun _classificationType(): JsonField<ClassificationType> = classificationType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of
         * [LegalEntityIndustryClassification].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .classificationCodes()
         * .classificationType()
         * .createdAt()
         * .discardedAt()
         * .liveMode()
         * .object_()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityIndustryClassification]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var classificationCodes: JsonField<MutableList<String>>? = null
        private var classificationType: JsonField<ClassificationType>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityIndustryClassification: LegalEntityIndustryClassification) =
            apply {
                id = legalEntityIndustryClassification.id
                classificationCodes =
                    legalEntityIndustryClassification.classificationCodes.map { it.toMutableList() }
                classificationType = legalEntityIndustryClassification.classificationType
                createdAt = legalEntityIndustryClassification.createdAt
                discardedAt = legalEntityIndustryClassification.discardedAt
                liveMode = legalEntityIndustryClassification.liveMode
                object_ = legalEntityIndustryClassification.object_
                updatedAt = legalEntityIndustryClassification.updatedAt
                additionalProperties =
                    legalEntityIndustryClassification.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The industry classification codes for the legal entity. */
        fun classificationCodes(classificationCodes: List<String>) =
            classificationCodes(JsonField.of(classificationCodes))

        /**
         * Sets [Builder.classificationCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationCodes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun classificationCodes(classificationCodes: JsonField<List<String>>) = apply {
            this.classificationCodes = classificationCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [classificationCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClassificationCode(classificationCode: String) = apply {
            classificationCodes =
                (classificationCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("classificationCodes", it).add(classificationCode)
                }
        }

        /** The classification system of the classification codes. */
        fun classificationType(classificationType: ClassificationType) =
            classificationType(JsonField.of(classificationType))

        /**
         * Sets [Builder.classificationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationType] with a well-typed
         * [ClassificationType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun classificationType(classificationType: JsonField<ClassificationType>) = apply {
            this.classificationType = classificationType
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [LegalEntityIndustryClassification].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .classificationCodes()
         * .classificationType()
         * .createdAt()
         * .discardedAt()
         * .liveMode()
         * .object_()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityIndustryClassification =
            LegalEntityIndustryClassification(
                checkRequired("id", id),
                checkRequired("classificationCodes", classificationCodes).map { it.toImmutable() },
                checkRequired("classificationType", classificationType),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalEntityIndustryClassification = apply {
        if (validated) {
            return@apply
        }

        id()
        classificationCodes()
        classificationType().validate()
        createdAt()
        discardedAt()
        liveMode()
        object_()
        updatedAt()
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
        (if (id.asKnown() == null) 0 else 1) +
            (classificationCodes.asKnown()?.size ?: 0) +
            (classificationType.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (discardedAt.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** The classification system of the classification codes. */
    class ClassificationType
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

            val ANZSIC = of("anzsic")

            val BICS = of("bics")

            val GICS = of("gics")

            val HSICS = of("hsics")

            val ICB = of("icb")

            val ISIC = of("isic")

            val MGECS = of("mgecs")

            val NACE = of("nace")

            val NAICS = of("naics")

            val RBICS = of("rbics")

            val SIC = of("sic")

            val SNI = of("sni")

            val TRBC = of("trbc")

            val UKSIC = of("uksic")

            val UNSPSC = of("unspsc")

            fun of(value: String) = ClassificationType(JsonField.of(value))
        }

        /** An enum containing [ClassificationType]'s known values. */
        enum class Known {
            ANZSIC,
            BICS,
            GICS,
            HSICS,
            ICB,
            ISIC,
            MGECS,
            NACE,
            NAICS,
            RBICS,
            SIC,
            SNI,
            TRBC,
            UKSIC,
            UNSPSC,
        }

        /**
         * An enum containing [ClassificationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ClassificationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANZSIC,
            BICS,
            GICS,
            HSICS,
            ICB,
            ISIC,
            MGECS,
            NACE,
            NAICS,
            RBICS,
            SIC,
            SNI,
            TRBC,
            UKSIC,
            UNSPSC,
            /**
             * An enum member indicating that [ClassificationType] was instantiated with an unknown
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
                ANZSIC -> Value.ANZSIC
                BICS -> Value.BICS
                GICS -> Value.GICS
                HSICS -> Value.HSICS
                ICB -> Value.ICB
                ISIC -> Value.ISIC
                MGECS -> Value.MGECS
                NACE -> Value.NACE
                NAICS -> Value.NAICS
                RBICS -> Value.RBICS
                SIC -> Value.SIC
                SNI -> Value.SNI
                TRBC -> Value.TRBC
                UKSIC -> Value.UKSIC
                UNSPSC -> Value.UNSPSC
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
                ANZSIC -> Known.ANZSIC
                BICS -> Known.BICS
                GICS -> Known.GICS
                HSICS -> Known.HSICS
                ICB -> Known.ICB
                ISIC -> Known.ISIC
                MGECS -> Known.MGECS
                NACE -> Known.NACE
                NAICS -> Known.NAICS
                RBICS -> Known.RBICS
                SIC -> Known.SIC
                SNI -> Known.SNI
                TRBC -> Known.TRBC
                UKSIC -> Known.UKSIC
                UNSPSC -> Known.UNSPSC
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ClassificationType: $value")
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

        fun validate(): ClassificationType = apply {
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

            return /* spotless:off */ other is ClassificationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LegalEntityIndustryClassification && id == other.id && classificationCodes == other.classificationCodes && classificationType == other.classificationType && createdAt == other.createdAt && discardedAt == other.discardedAt && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, classificationCodes, classificationType, createdAt, discardedAt, liveMode, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntityIndustryClassification{id=$id, classificationCodes=$classificationCodes, classificationType=$classificationType, createdAt=$createdAt, discardedAt=$discardedAt, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
