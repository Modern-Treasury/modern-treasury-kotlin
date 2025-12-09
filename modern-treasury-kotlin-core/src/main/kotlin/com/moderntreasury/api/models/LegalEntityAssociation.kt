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

class LegalEntityAssociation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val childLegalEntity: JsonValue,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val ownershipPercentage: JsonField<Long>,
    private val parentLegalEntityId: JsonField<String>,
    private val relationshipTypes: JsonField<List<RelationshipType>>,
    private val title: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("child_legal_entity")
        @ExcludeMissing
        childLegalEntity: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownership_percentage")
        @ExcludeMissing
        ownershipPercentage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parent_legal_entity_id")
        @ExcludeMissing
        parentLegalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relationship_types")
        @ExcludeMissing
        relationshipTypes: JsonField<List<RelationshipType>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        childLegalEntity,
        createdAt,
        discardedAt,
        liveMode,
        object_,
        ownershipPercentage,
        parentLegalEntityId,
        relationshipTypes,
        title,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /** The child legal entity. */
    @JsonProperty("child_legal_entity")
    @ExcludeMissing
    fun _childLegalEntity(): JsonValue = childLegalEntity

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
     * The child entity's ownership percentage iff they are a beneficial owner.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ownershipPercentage(): Long? = ownershipPercentage.getNullable("ownership_percentage")

    /**
     * The ID of the parent legal entity. This must be a business or joint legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parentLegalEntityId(): String = parentLegalEntityId.getRequired("parent_legal_entity_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun relationshipTypes(): List<RelationshipType> =
        relationshipTypes.getRequired("relationship_types")

    /**
     * The job title of the child entity at the parent entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun title(): String? = title.getNullable("title")

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
     * Returns the raw JSON value of [ownershipPercentage].
     *
     * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ownership_percentage")
    @ExcludeMissing
    fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

    /**
     * Returns the raw JSON value of [parentLegalEntityId].
     *
     * Unlike [parentLegalEntityId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parent_legal_entity_id")
    @ExcludeMissing
    fun _parentLegalEntityId(): JsonField<String> = parentLegalEntityId

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
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
         * Returns a mutable builder for constructing an instance of [LegalEntityAssociation].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .childLegalEntity()
         * .createdAt()
         * .discardedAt()
         * .liveMode()
         * .object_()
         * .ownershipPercentage()
         * .parentLegalEntityId()
         * .relationshipTypes()
         * .title()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityAssociation]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var childLegalEntity: JsonValue? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var ownershipPercentage: JsonField<Long>? = null
        private var parentLegalEntityId: JsonField<String>? = null
        private var relationshipTypes: JsonField<MutableList<RelationshipType>>? = null
        private var title: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityAssociation: LegalEntityAssociation) = apply {
            id = legalEntityAssociation.id
            childLegalEntity = legalEntityAssociation.childLegalEntity
            createdAt = legalEntityAssociation.createdAt
            discardedAt = legalEntityAssociation.discardedAt
            liveMode = legalEntityAssociation.liveMode
            object_ = legalEntityAssociation.object_
            ownershipPercentage = legalEntityAssociation.ownershipPercentage
            parentLegalEntityId = legalEntityAssociation.parentLegalEntityId
            relationshipTypes = legalEntityAssociation.relationshipTypes.map { it.toMutableList() }
            title = legalEntityAssociation.title
            updatedAt = legalEntityAssociation.updatedAt
            additionalProperties = legalEntityAssociation.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The child legal entity. */
        fun childLegalEntity(childLegalEntity: JsonValue) = apply {
            this.childLegalEntity = childLegalEntity
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

        /** The ID of the parent legal entity. This must be a business or joint legal entity. */
        fun parentLegalEntityId(parentLegalEntityId: String) =
            parentLegalEntityId(JsonField.of(parentLegalEntityId))

        /**
         * Sets [Builder.parentLegalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentLegalEntityId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentLegalEntityId(parentLegalEntityId: JsonField<String>) = apply {
            this.parentLegalEntityId = parentLegalEntityId
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

        /** The job title of the child entity at the parent entity. */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [LegalEntityAssociation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .childLegalEntity()
         * .createdAt()
         * .discardedAt()
         * .liveMode()
         * .object_()
         * .ownershipPercentage()
         * .parentLegalEntityId()
         * .relationshipTypes()
         * .title()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityAssociation =
            LegalEntityAssociation(
                checkRequired("id", id),
                checkRequired("childLegalEntity", childLegalEntity),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("ownershipPercentage", ownershipPercentage),
                checkRequired("parentLegalEntityId", parentLegalEntityId),
                checkRequired("relationshipTypes", relationshipTypes).map { it.toImmutable() },
                checkRequired("title", title),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalEntityAssociation = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        discardedAt()
        liveMode()
        object_()
        ownershipPercentage()
        parentLegalEntityId()
        relationshipTypes().forEach { it.validate() }
        title()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (discardedAt.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (ownershipPercentage.asKnown() == null) 0 else 1) +
            (if (parentLegalEntityId.asKnown() == null) 0 else 1) +
            (relationshipTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

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

        return other is LegalEntityAssociation &&
            id == other.id &&
            childLegalEntity == other.childLegalEntity &&
            createdAt == other.createdAt &&
            discardedAt == other.discardedAt &&
            liveMode == other.liveMode &&
            object_ == other.object_ &&
            ownershipPercentage == other.ownershipPercentage &&
            parentLegalEntityId == other.parentLegalEntityId &&
            relationshipTypes == other.relationshipTypes &&
            title == other.title &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            childLegalEntity,
            createdAt,
            discardedAt,
            liveMode,
            object_,
            ownershipPercentage,
            parentLegalEntityId,
            relationshipTypes,
            title,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntityAssociation{id=$id, childLegalEntity=$childLegalEntity, createdAt=$createdAt, discardedAt=$discardedAt, liveMode=$liveMode, object_=$object_, ownershipPercentage=$ownershipPercentage, parentLegalEntityId=$parentLegalEntityId, relationshipTypes=$relationshipTypes, title=$title, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
