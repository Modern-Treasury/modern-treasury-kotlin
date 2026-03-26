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
import java.util.Collections
import java.util.Objects

class LegalEntityAssociationInlineCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val relationshipTypes: JsonField<List<RelationshipType>>,
    private val childLegalEntity: JsonField<ChildLegalEntityCreate>,
    private val childLegalEntityId: JsonField<String>,
    private val ownershipPercentage: JsonField<Long>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("relationship_types")
        @ExcludeMissing
        relationshipTypes: JsonField<List<RelationshipType>> = JsonMissing.of(),
        @JsonProperty("child_legal_entity")
        @ExcludeMissing
        childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of(),
        @JsonProperty("child_legal_entity_id")
        @ExcludeMissing
        childLegalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownership_percentage")
        @ExcludeMissing
        ownershipPercentage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(
        relationshipTypes,
        childLegalEntity,
        childLegalEntityId,
        ownershipPercentage,
        title,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun relationshipTypes(): List<RelationshipType> =
        relationshipTypes.getRequired("relationship_types")

    /**
     * The child legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun childLegalEntity(): ChildLegalEntityCreate? =
        childLegalEntity.getNullable("child_legal_entity")

    /**
     * The ID of the child legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun childLegalEntityId(): String? = childLegalEntityId.getNullable("child_legal_entity_id")

    /**
     * The child entity's ownership percentage iff they are a beneficial owner.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ownershipPercentage(): Long? = ownershipPercentage.getNullable("ownership_percentage")

    /**
     * The job title of the child entity at the parent entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun title(): String? = title.getNullable("title")

    /**
     * Returns the raw JSON value of [relationshipTypes].
     *
     * Unlike [relationshipTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("relationship_types")
    @ExcludeMissing
    fun _relationshipTypes(): JsonField<List<RelationshipType>> = relationshipTypes

    /**
     * Returns the raw JSON value of [childLegalEntity].
     *
     * Unlike [childLegalEntity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("child_legal_entity")
    @ExcludeMissing
    fun _childLegalEntity(): JsonField<ChildLegalEntityCreate> = childLegalEntity

    /**
     * Returns the raw JSON value of [childLegalEntityId].
     *
     * Unlike [childLegalEntityId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("child_legal_entity_id")
    @ExcludeMissing
    fun _childLegalEntityId(): JsonField<String> = childLegalEntityId

    /**
     * Returns the raw JSON value of [ownershipPercentage].
     *
     * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ownership_percentage")
    @ExcludeMissing
    fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
         * [LegalEntityAssociationInlineCreate].
         *
         * The following fields are required:
         * ```kotlin
         * .relationshipTypes()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityAssociationInlineCreate]. */
    class Builder internal constructor() {

        private var relationshipTypes: JsonField<MutableList<RelationshipType>>? = null
        private var childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of()
        private var childLegalEntityId: JsonField<String> = JsonMissing.of()
        private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityAssociationInlineCreate: LegalEntityAssociationInlineCreate) =
            apply {
                relationshipTypes =
                    legalEntityAssociationInlineCreate.relationshipTypes.map { it.toMutableList() }
                childLegalEntity = legalEntityAssociationInlineCreate.childLegalEntity
                childLegalEntityId = legalEntityAssociationInlineCreate.childLegalEntityId
                ownershipPercentage = legalEntityAssociationInlineCreate.ownershipPercentage
                title = legalEntityAssociationInlineCreate.title
                additionalProperties =
                    legalEntityAssociationInlineCreate.additionalProperties.toMutableMap()
            }

        fun relationshipTypes(relationshipTypes: List<RelationshipType>) =
            relationshipTypes(JsonField.of(relationshipTypes))

        /**
         * Sets [Builder.relationshipTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relationshipTypes] with a well-typed
         * `List<RelationshipType>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun relationshipTypes(relationshipTypes: JsonField<List<RelationshipType>>) = apply {
            this.relationshipTypes = relationshipTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [RelationshipType] to [relationshipTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRelationshipType(relationshipType: RelationshipType) = apply {
            relationshipTypes =
                (relationshipTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("relationshipTypes", it).add(relationshipType)
                }
        }

        /** The child legal entity. */
        fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) =
            childLegalEntity(JsonField.of(childLegalEntity))

        /**
         * Sets [Builder.childLegalEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childLegalEntity] with a well-typed
         * [ChildLegalEntityCreate] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun childLegalEntity(childLegalEntity: JsonField<ChildLegalEntityCreate>) = apply {
            this.childLegalEntity = childLegalEntity
        }

        /** The ID of the child legal entity. */
        fun childLegalEntityId(childLegalEntityId: String) =
            childLegalEntityId(JsonField.of(childLegalEntityId))

        /**
         * Sets [Builder.childLegalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childLegalEntityId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun childLegalEntityId(childLegalEntityId: JsonField<String>) = apply {
            this.childLegalEntityId = childLegalEntityId
        }

        /** The child entity's ownership percentage iff they are a beneficial owner. */
        fun ownershipPercentage(ownershipPercentage: Long?) =
            ownershipPercentage(JsonField.ofNullable(ownershipPercentage))

        /**
         * Alias for [Builder.ownershipPercentage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ownershipPercentage(ownershipPercentage: Long) =
            ownershipPercentage(ownershipPercentage as Long?)

        /**
         * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownershipPercentage] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
            this.ownershipPercentage = ownershipPercentage
        }

        /** The job title of the child entity at the parent entity. */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [LegalEntityAssociationInlineCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .relationshipTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityAssociationInlineCreate =
            LegalEntityAssociationInlineCreate(
                checkRequired("relationshipTypes", relationshipTypes).map { it.toImmutable() },
                childLegalEntity,
                childLegalEntityId,
                ownershipPercentage,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalEntityAssociationInlineCreate = apply {
        if (validated) {
            return@apply
        }

        relationshipTypes().forEach { it.validate() }
        childLegalEntity()?.validate()
        childLegalEntityId()
        ownershipPercentage()
        title()
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
        (relationshipTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (childLegalEntity.asKnown()?.validity() ?: 0) +
            (if (childLegalEntityId.asKnown() == null) 0 else 1) +
            (if (ownershipPercentage.asKnown() == null) 0 else 1) +
            (if (title.asKnown() == null) 0 else 1)

    /** A list of relationship types for how the child entity relates to parent entity. */
    class RelationshipType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val AUTHORIZED_SIGNER = of("authorized_signer")

            val BENEFICIAL_OWNER = of("beneficial_owner")

            val CONTROL_PERSON = of("control_person")

            fun of(value: String) = RelationshipType(JsonField.of(value))
        }

        /** An enum containing [RelationshipType]'s known values. */
        enum class Known {
            AUTHORIZED_SIGNER,
            BENEFICIAL_OWNER,
            CONTROL_PERSON,
        }

        /**
         * An enum containing [RelationshipType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RelationshipType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTHORIZED_SIGNER,
            BENEFICIAL_OWNER,
            CONTROL_PERSON,
            /**
             * An enum member indicating that [RelationshipType] was instantiated with an unknown
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
                AUTHORIZED_SIGNER -> Value.AUTHORIZED_SIGNER
                BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                CONTROL_PERSON -> Value.CONTROL_PERSON
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
                AUTHORIZED_SIGNER -> Known.AUTHORIZED_SIGNER
                BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                CONTROL_PERSON -> Known.CONTROL_PERSON
                else -> throw ModernTreasuryInvalidDataException("Unknown RelationshipType: $value")
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

        fun validate(): RelationshipType = apply {
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

            return other is RelationshipType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityAssociationInlineCreate &&
            relationshipTypes == other.relationshipTypes &&
            childLegalEntity == other.childLegalEntity &&
            childLegalEntityId == other.childLegalEntityId &&
            ownershipPercentage == other.ownershipPercentage &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            relationshipTypes,
            childLegalEntity,
            childLegalEntityId,
            ownershipPercentage,
            title,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntityAssociationInlineCreate{relationshipTypes=$relationshipTypes, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, ownershipPercentage=$ownershipPercentage, title=$title, additionalProperties=$additionalProperties}"
}
