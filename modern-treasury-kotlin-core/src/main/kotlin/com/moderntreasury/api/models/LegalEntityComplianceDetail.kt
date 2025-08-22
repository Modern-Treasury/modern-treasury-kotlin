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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LegalEntityComplianceDetail
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val issuer: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val tokenExpiresAt: JsonField<OffsetDateTime>,
    private val tokenIssuedAt: JsonField<OffsetDateTime>,
    private val tokenUrl: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val entityValidated: JsonField<Boolean>,
    private val validatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issuer") @ExcludeMissing issuer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_expires_at")
        @ExcludeMissing
        tokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("token_issued_at")
        @ExcludeMissing
        tokenIssuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("token_url") @ExcludeMissing tokenUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("validated")
        @ExcludeMissing
        entityValidated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validated_at")
        @ExcludeMissing
        validatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        discardedAt,
        issuer,
        liveMode,
        object_,
        tokenExpiresAt,
        tokenIssuedAt,
        tokenUrl,
        updatedAt,
        entityValidated,
        validatedAt,
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
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * The issuer of the compliance token.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun issuer(): String = issuer.getRequired("issuer")

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
     * The timestamp when the compliance token expires.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tokenExpiresAt(): OffsetDateTime? = tokenExpiresAt.getNullable("token_expires_at")

    /**
     * The timestamp when the compliance token was issued.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tokenIssuedAt(): OffsetDateTime? = tokenIssuedAt.getNullable("token_issued_at")

    /**
     * The URL to the compliance token. (ex. provider portal URL)
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tokenUrl(): String? = tokenUrl.getNullable("token_url")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Whether entity corresponding to the compliance token has been validated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityValidated(): Boolean = entityValidated.getRequired("validated")

    /**
     * The timestamp when the entity was validated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun validatedAt(): OffsetDateTime? = validatedAt.getNullable("validated_at")

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
     * Returns the raw JSON value of [issuer].
     *
     * Unlike [issuer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issuer") @ExcludeMissing fun _issuer(): JsonField<String> = issuer

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
     * Returns the raw JSON value of [tokenExpiresAt].
     *
     * Unlike [tokenExpiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_expires_at")
    @ExcludeMissing
    fun _tokenExpiresAt(): JsonField<OffsetDateTime> = tokenExpiresAt

    /**
     * Returns the raw JSON value of [tokenIssuedAt].
     *
     * Unlike [tokenIssuedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_issued_at")
    @ExcludeMissing
    fun _tokenIssuedAt(): JsonField<OffsetDateTime> = tokenIssuedAt

    /**
     * Returns the raw JSON value of [tokenUrl].
     *
     * Unlike [tokenUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_url") @ExcludeMissing fun _tokenUrl(): JsonField<String> = tokenUrl

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [entityValidated].
     *
     * Unlike [entityValidated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("validated")
    @ExcludeMissing
    fun _entityValidated(): JsonField<Boolean> = entityValidated

    /**
     * Returns the raw JSON value of [validatedAt].
     *
     * Unlike [validatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("validated_at")
    @ExcludeMissing
    fun _validatedAt(): JsonField<OffsetDateTime> = validatedAt

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
         * Returns a mutable builder for constructing an instance of [LegalEntityComplianceDetail].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .discardedAt()
         * .issuer()
         * .liveMode()
         * .object_()
         * .tokenExpiresAt()
         * .tokenIssuedAt()
         * .tokenUrl()
         * .updatedAt()
         * .entityValidated()
         * .validatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityComplianceDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var issuer: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var tokenExpiresAt: JsonField<OffsetDateTime>? = null
        private var tokenIssuedAt: JsonField<OffsetDateTime>? = null
        private var tokenUrl: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var entityValidated: JsonField<Boolean>? = null
        private var validatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(legalEntityComplianceDetail: LegalEntityComplianceDetail) = apply {
            id = legalEntityComplianceDetail.id
            createdAt = legalEntityComplianceDetail.createdAt
            discardedAt = legalEntityComplianceDetail.discardedAt
            issuer = legalEntityComplianceDetail.issuer
            liveMode = legalEntityComplianceDetail.liveMode
            object_ = legalEntityComplianceDetail.object_
            tokenExpiresAt = legalEntityComplianceDetail.tokenExpiresAt
            tokenIssuedAt = legalEntityComplianceDetail.tokenIssuedAt
            tokenUrl = legalEntityComplianceDetail.tokenUrl
            updatedAt = legalEntityComplianceDetail.updatedAt
            entityValidated = legalEntityComplianceDetail.entityValidated
            validatedAt = legalEntityComplianceDetail.validatedAt
            additionalProperties = legalEntityComplianceDetail.additionalProperties.toMutableMap()
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

        /** The issuer of the compliance token. */
        fun issuer(issuer: String) = issuer(JsonField.of(issuer))

        /**
         * Sets [Builder.issuer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun issuer(issuer: JsonField<String>) = apply { this.issuer = issuer }

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

        /** The timestamp when the compliance token expires. */
        fun tokenExpiresAt(tokenExpiresAt: OffsetDateTime?) =
            tokenExpiresAt(JsonField.ofNullable(tokenExpiresAt))

        /**
         * Sets [Builder.tokenExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenExpiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenExpiresAt(tokenExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.tokenExpiresAt = tokenExpiresAt
        }

        /** The timestamp when the compliance token was issued. */
        fun tokenIssuedAt(tokenIssuedAt: OffsetDateTime?) =
            tokenIssuedAt(JsonField.ofNullable(tokenIssuedAt))

        /**
         * Sets [Builder.tokenIssuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenIssuedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenIssuedAt(tokenIssuedAt: JsonField<OffsetDateTime>) = apply {
            this.tokenIssuedAt = tokenIssuedAt
        }

        /** The URL to the compliance token. (ex. provider portal URL) */
        fun tokenUrl(tokenUrl: String?) = tokenUrl(JsonField.ofNullable(tokenUrl))

        /**
         * Sets [Builder.tokenUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokenUrl(tokenUrl: JsonField<String>) = apply { this.tokenUrl = tokenUrl }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Whether entity corresponding to the compliance token has been validated. */
        fun entityValidated(entityValidated: Boolean) =
            entityValidated(JsonField.of(entityValidated))

        /**
         * Sets [Builder.entityValidated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityValidated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityValidated(entityValidated: JsonField<Boolean>) = apply {
            this.entityValidated = entityValidated
        }

        /** The timestamp when the entity was validated. */
        fun validatedAt(validatedAt: OffsetDateTime?) =
            validatedAt(JsonField.ofNullable(validatedAt))

        /**
         * Sets [Builder.validatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validatedAt(validatedAt: JsonField<OffsetDateTime>) = apply {
            this.validatedAt = validatedAt
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [LegalEntityComplianceDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .discardedAt()
         * .issuer()
         * .liveMode()
         * .object_()
         * .tokenExpiresAt()
         * .tokenIssuedAt()
         * .tokenUrl()
         * .updatedAt()
         * .entityValidated()
         * .validatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityComplianceDetail =
            LegalEntityComplianceDetail(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("issuer", issuer),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("tokenExpiresAt", tokenExpiresAt),
                checkRequired("tokenIssuedAt", tokenIssuedAt),
                checkRequired("tokenUrl", tokenUrl),
                checkRequired("updatedAt", updatedAt),
                checkRequired("entityValidated", entityValidated),
                checkRequired("validatedAt", validatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalEntityComplianceDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        discardedAt()
        issuer()
        liveMode()
        object_()
        tokenExpiresAt()
        tokenIssuedAt()
        tokenUrl()
        updatedAt()
        entityValidated()
        validatedAt()
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
            (if (issuer.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (tokenExpiresAt.asKnown() == null) 0 else 1) +
            (if (tokenIssuedAt.asKnown() == null) 0 else 1) +
            (if (tokenUrl.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (entityValidated.asKnown() == null) 0 else 1) +
            (if (validatedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityComplianceDetail &&
            id == other.id &&
            createdAt == other.createdAt &&
            discardedAt == other.discardedAt &&
            issuer == other.issuer &&
            liveMode == other.liveMode &&
            object_ == other.object_ &&
            tokenExpiresAt == other.tokenExpiresAt &&
            tokenIssuedAt == other.tokenIssuedAt &&
            tokenUrl == other.tokenUrl &&
            updatedAt == other.updatedAt &&
            entityValidated == other.entityValidated &&
            validatedAt == other.validatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            discardedAt,
            issuer,
            liveMode,
            object_,
            tokenExpiresAt,
            tokenIssuedAt,
            tokenUrl,
            updatedAt,
            entityValidated,
            validatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalEntityComplianceDetail{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, issuer=$issuer, liveMode=$liveMode, object_=$object_, tokenExpiresAt=$tokenExpiresAt, tokenIssuedAt=$tokenIssuedAt, tokenUrl=$tokenUrl, updatedAt=$updatedAt, entityValidated=$entityValidated, validatedAt=$validatedAt, additionalProperties=$additionalProperties}"
}
