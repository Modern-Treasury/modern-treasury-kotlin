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

class Case
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val requestedActions: JsonField<List<RequestedAction>>,
    private val resolvedActions: JsonField<List<RequestedAction>>,
    private val status: JsonField<Status>,
    private val subjectId: JsonField<String>,
    private val subjectType: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requested_actions")
        @ExcludeMissing
        requestedActions: JsonField<List<RequestedAction>> = JsonMissing.of(),
        @JsonProperty("resolved_actions")
        @ExcludeMissing
        resolvedActions: JsonField<List<RequestedAction>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subject_id") @ExcludeMissing subjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subject_type")
        @ExcludeMissing
        subjectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        liveMode,
        object_,
        requestedActions,
        resolvedActions,
        status,
        subjectId,
        subjectType,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * The pending actions requested to resolve the case.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedActions(): List<RequestedAction> =
        requestedActions.getRequired("requested_actions")

    /**
     * The requested actions that have been resolved.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resolvedActions(): List<RequestedAction> = resolvedActions.getRequired("resolved_actions")

    /**
     * The status of the case.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The ID of the object the case is about.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subjectId(): String = subjectId.getRequired("subject_id")

    /**
     * The type of the object the case is about.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subjectType(): String = subjectType.getRequired("subject_type")

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
     * Returns the raw JSON value of [requestedActions].
     *
     * Unlike [requestedActions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requested_actions")
    @ExcludeMissing
    fun _requestedActions(): JsonField<List<RequestedAction>> = requestedActions

    /**
     * Returns the raw JSON value of [resolvedActions].
     *
     * Unlike [resolvedActions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolved_actions")
    @ExcludeMissing
    fun _resolvedActions(): JsonField<List<RequestedAction>> = resolvedActions

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subjectId].
     *
     * Unlike [subjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject_id") @ExcludeMissing fun _subjectId(): JsonField<String> = subjectId

    /**
     * Returns the raw JSON value of [subjectType].
     *
     * Unlike [subjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject_type")
    @ExcludeMissing
    fun _subjectType(): JsonField<String> = subjectType

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
         * Returns a mutable builder for constructing an instance of [Case].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .liveMode()
         * .object_()
         * .requestedActions()
         * .resolvedActions()
         * .status()
         * .subjectId()
         * .subjectType()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Case]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var requestedActions: JsonField<MutableList<RequestedAction>>? = null
        private var resolvedActions: JsonField<MutableList<RequestedAction>>? = null
        private var status: JsonField<Status>? = null
        private var subjectId: JsonField<String>? = null
        private var subjectType: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(case: Case) = apply {
            id = case.id
            createdAt = case.createdAt
            liveMode = case.liveMode
            object_ = case.object_
            requestedActions = case.requestedActions.map { it.toMutableList() }
            resolvedActions = case.resolvedActions.map { it.toMutableList() }
            status = case.status
            subjectId = case.subjectId
            subjectType = case.subjectType
            updatedAt = case.updatedAt
            additionalProperties = case.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /** The pending actions requested to resolve the case. */
        fun requestedActions(requestedActions: List<RequestedAction>) =
            requestedActions(JsonField.of(requestedActions))

        /**
         * Sets [Builder.requestedActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedActions] with a well-typed
         * `List<RequestedAction>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun requestedActions(requestedActions: JsonField<List<RequestedAction>>) = apply {
            this.requestedActions = requestedActions.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequestedAction] to [requestedActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequestedAction(requestedAction: RequestedAction) = apply {
            requestedActions =
                (requestedActions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requestedActions", it).add(requestedAction)
                }
        }

        /** The requested actions that have been resolved. */
        fun resolvedActions(resolvedActions: List<RequestedAction>) =
            resolvedActions(JsonField.of(resolvedActions))

        /**
         * Sets [Builder.resolvedActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolvedActions] with a well-typed
         * `List<RequestedAction>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun resolvedActions(resolvedActions: JsonField<List<RequestedAction>>) = apply {
            this.resolvedActions = resolvedActions.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequestedAction] to [resolvedActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResolvedAction(resolvedAction: RequestedAction) = apply {
            resolvedActions =
                (resolvedActions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("resolvedActions", it).add(resolvedAction)
                }
        }

        /** The status of the case. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the object the case is about. */
        fun subjectId(subjectId: String) = subjectId(JsonField.of(subjectId))

        /**
         * Sets [Builder.subjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subjectId(subjectId: JsonField<String>) = apply { this.subjectId = subjectId }

        /** The type of the object the case is about. */
        fun subjectType(subjectType: String) = subjectType(JsonField.of(subjectType))

        /**
         * Sets [Builder.subjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subjectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subjectType(subjectType: JsonField<String>) = apply { this.subjectType = subjectType }

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
         * Returns an immutable instance of [Case].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .liveMode()
         * .object_()
         * .requestedActions()
         * .resolvedActions()
         * .status()
         * .subjectId()
         * .subjectType()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Case =
            Case(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("requestedActions", requestedActions).map { it.toImmutable() },
                checkRequired("resolvedActions", resolvedActions).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("subjectId", subjectId),
                checkRequired("subjectType", subjectType),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): Case = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        liveMode()
        object_()
        requestedActions().forEach { it.validate() }
        resolvedActions().forEach { it.validate() }
        status().validate()
        subjectId()
        subjectType()
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
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (requestedActions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (resolvedActions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (subjectId.asKnown() == null) 0 else 1) +
            (if (subjectType.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    class RequestedAction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val category: JsonField<Category>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val field: JsonField<Field>,
        private val instructions: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val reasons: JsonField<List<String>>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reasons")
            @ExcludeMissing
            reasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            category,
            createdAt,
            field,
            instructions,
            liveMode,
            object_,
            reasons,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The category of the requested action.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The field that needs to be corrected or provided, if any.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun field(): Field? = field.getNullable("field")

        /**
         * Instructions on how to resolve the requested action.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun instructions(): String? = instructions.getNullable("instructions")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
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
         * The reasons the action was requested.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reasons(): List<String> = reasons.getRequired("reasons")

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
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

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
         * Returns the raw JSON value of [reasons].
         *
         * Unlike [reasons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasons") @ExcludeMissing fun _reasons(): JsonField<List<String>> = reasons

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
             * Returns a mutable builder for constructing an instance of [RequestedAction].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .category()
             * .createdAt()
             * .field()
             * .instructions()
             * .liveMode()
             * .object_()
             * .reasons()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RequestedAction]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var category: JsonField<Category>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var field: JsonField<Field>? = null
            private var instructions: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var reasons: JsonField<MutableList<String>>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(requestedAction: RequestedAction) = apply {
                id = requestedAction.id
                category = requestedAction.category
                createdAt = requestedAction.createdAt
                field = requestedAction.field
                instructions = requestedAction.instructions
                liveMode = requestedAction.liveMode
                object_ = requestedAction.object_
                reasons = requestedAction.reasons.map { it.toMutableList() }
                updatedAt = requestedAction.updatedAt
                additionalProperties = requestedAction.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The category of the requested action. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The field that needs to be corrected or provided, if any. */
            fun field(field: Field?) = field(JsonField.ofNullable(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [Field] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun field(field: JsonField<Field>) = apply { this.field = field }

            /** Instructions on how to resolve the requested action. */
            fun instructions(instructions: String?) =
                instructions(JsonField.ofNullable(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The reasons the action was requested. */
            fun reasons(reasons: List<String>) = reasons(JsonField.of(reasons))

            /**
             * Sets [Builder.reasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasons] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasons(reasons: JsonField<List<String>>) = apply {
                this.reasons = reasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [reasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReason(reason: String) = apply {
                reasons =
                    (reasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reasons", it).add(reason)
                    }
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [RequestedAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .category()
             * .createdAt()
             * .field()
             * .instructions()
             * .liveMode()
             * .object_()
             * .reasons()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RequestedAction =
                RequestedAction(
                    checkRequired("id", id),
                    checkRequired("category", category),
                    checkRequired("createdAt", createdAt),
                    checkRequired("field", field),
                    checkRequired("instructions", instructions),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("reasons", reasons).map { it.toImmutable() },
                    checkRequired("updatedAt", updatedAt),
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
        fun validate(): RequestedAction = apply {
            if (validated) {
                return@apply
            }

            id()
            category().validate()
            createdAt()
            field()?.validate()
            instructions()
            liveMode()
            object_()
            reasons()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (category.asKnown()?.validity() ?: 0) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (field.asKnown()?.validity() ?: 0) +
                (if (instructions.asKnown() == null) 0 else 1) +
                (if (liveMode.asKnown() == null) 0 else 1) +
                (if (object_.asKnown() == null) 0 else 1) +
                (reasons.asKnown()?.size ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        /** The category of the requested action. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE =
                    of("onboarding_articles_of_incorporation_failure")

                val ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE =
                    of("onboarding_business_registry_verification_failure")

                val ONBOARDING_DATABASE_FAILURE = of("onboarding_database_failure")

                val ONBOARDING_PROOF_OF_ADDRESS_FAILURE = of("onboarding_proof_of_address_failure")

                val ONBOARDING_SSN_CHECK_FAILURE = of("onboarding_ssn_check_failure")

                val ONBOARDING_TIN_CHECK_FAILURE = of("onboarding_tin_check_failure")

                fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE,
                ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE,
                ONBOARDING_DATABASE_FAILURE,
                ONBOARDING_PROOF_OF_ADDRESS_FAILURE,
                ONBOARDING_SSN_CHECK_FAILURE,
                ONBOARDING_TIN_CHECK_FAILURE,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE,
                ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE,
                ONBOARDING_DATABASE_FAILURE,
                ONBOARDING_PROOF_OF_ADDRESS_FAILURE,
                ONBOARDING_SSN_CHECK_FAILURE,
                ONBOARDING_TIN_CHECK_FAILURE,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE ->
                        Value.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                    ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE ->
                        Value.ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE
                    ONBOARDING_DATABASE_FAILURE -> Value.ONBOARDING_DATABASE_FAILURE
                    ONBOARDING_PROOF_OF_ADDRESS_FAILURE -> Value.ONBOARDING_PROOF_OF_ADDRESS_FAILURE
                    ONBOARDING_SSN_CHECK_FAILURE -> Value.ONBOARDING_SSN_CHECK_FAILURE
                    ONBOARDING_TIN_CHECK_FAILURE -> Value.ONBOARDING_TIN_CHECK_FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE ->
                        Known.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                    ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE ->
                        Known.ONBOARDING_BUSINESS_REGISTRY_VERIFICATION_FAILURE
                    ONBOARDING_DATABASE_FAILURE -> Known.ONBOARDING_DATABASE_FAILURE
                    ONBOARDING_PROOF_OF_ADDRESS_FAILURE -> Known.ONBOARDING_PROOF_OF_ADDRESS_FAILURE
                    ONBOARDING_SSN_CHECK_FAILURE -> Known.ONBOARDING_SSN_CHECK_FAILURE
                    ONBOARDING_TIN_CHECK_FAILURE -> Known.ONBOARDING_TIN_CHECK_FAILURE
                    else -> throw ModernTreasuryInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The field that needs to be corrected or provided, if any. */
        class Field @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ARTICLES_OF_INCORPORATION = of("articles_of_incorporation")

                val EIN_LETTER = of("ein_letter")

                val LEGAL_ENTITY_DETAILS = of("legal_entity_details")

                val PROOF_OF_ADDRESS = of("proof_of_address")

                fun of(value: String) = Field(JsonField.of(value))
            }

            /** An enum containing [Field]'s known values. */
            enum class Known {
                ARTICLES_OF_INCORPORATION,
                EIN_LETTER,
                LEGAL_ENTITY_DETAILS,
                PROOF_OF_ADDRESS,
            }

            /**
             * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Field] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARTICLES_OF_INCORPORATION,
                EIN_LETTER,
                LEGAL_ENTITY_DETAILS,
                PROOF_OF_ADDRESS,
                /**
                 * An enum member indicating that [Field] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                    EIN_LETTER -> Value.EIN_LETTER
                    LEGAL_ENTITY_DETAILS -> Value.LEGAL_ENTITY_DETAILS
                    PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                    EIN_LETTER -> Known.EIN_LETTER
                    LEGAL_ENTITY_DETAILS -> Known.LEGAL_ENTITY_DETAILS
                    PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                    else -> throw ModernTreasuryInvalidDataException("Unknown Field: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Field = apply {
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

                return other is Field && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequestedAction &&
                id == other.id &&
                category == other.category &&
                createdAt == other.createdAt &&
                field == other.field &&
                instructions == other.instructions &&
                liveMode == other.liveMode &&
                object_ == other.object_ &&
                reasons == other.reasons &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                category,
                createdAt,
                field,
                instructions,
                liveMode,
                object_,
                reasons,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequestedAction{id=$id, category=$category, createdAt=$createdAt, field=$field, instructions=$instructions, liveMode=$liveMode, object_=$object_, reasons=$reasons, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The status of the case. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val OPEN = of("open")

            val RESOLVED = of("resolved")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPEN,
            RESOLVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            RESOLVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                OPEN -> Value.OPEN
                RESOLVED -> Value.RESOLVED
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
                OPEN -> Known.OPEN
                RESOLVED -> Known.RESOLVED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Case &&
            id == other.id &&
            createdAt == other.createdAt &&
            liveMode == other.liveMode &&
            object_ == other.object_ &&
            requestedActions == other.requestedActions &&
            resolvedActions == other.resolvedActions &&
            status == other.status &&
            subjectId == other.subjectId &&
            subjectType == other.subjectType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            liveMode,
            object_,
            requestedActions,
            resolvedActions,
            status,
            subjectId,
            subjectType,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Case{id=$id, createdAt=$createdAt, liveMode=$liveMode, object_=$object_, requestedActions=$requestedActions, resolvedActions=$resolvedActions, status=$status, subjectId=$subjectId, subjectType=$subjectType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
