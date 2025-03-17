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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class BankSettings
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("backup_withholding_percentage")
    @ExcludeMissing
    private val backupWithholdingPercentage: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("enable_backup_withholding")
    @ExcludeMissing
    private val enableBackupWithholding: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("privacy_opt_out")
    @ExcludeMissing
    private val privacyOptOut: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("regulation_o")
    @ExcludeMissing
    private val regulationO: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The percentage of backup withholding to apply to the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun backupWithholdingPercentage(): Long? =
        backupWithholdingPercentage.getNullable("backup_withholding_percentage")

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
     * Whether backup withholding is enabled. See more here -
     * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun enableBackupWithholding(): Boolean? =
        enableBackupWithholding.getNullable("enable_backup_withholding")

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
     * Cross River Bank specific setting to opt out of privacy policy.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun privacyOptOut(): Boolean? = privacyOptOut.getNullable("privacy_opt_out")

    /**
     * It covers, among other types of insider loans, extensions of credit by a member bank to an
     * executive officer, director, or principal shareholder of the member bank; a bank holding
     * company of which the member bank is a subsidiary; and any other subsidiary of that bank
     * holding company.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun regulationO(): Boolean? = regulationO.getNullable("regulation_o")

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
     * Returns the raw JSON value of [backupWithholdingPercentage].
     *
     * Unlike [backupWithholdingPercentage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("backup_withholding_percentage")
    @ExcludeMissing
    fun _backupWithholdingPercentage(): JsonField<Long> = backupWithholdingPercentage

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
     * Returns the raw JSON value of [enableBackupWithholding].
     *
     * Unlike [enableBackupWithholding], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_backup_withholding")
    @ExcludeMissing
    fun _enableBackupWithholding(): JsonField<Boolean> = enableBackupWithholding

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
     * Returns the raw JSON value of [privacyOptOut].
     *
     * Unlike [privacyOptOut], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privacy_opt_out")
    @ExcludeMissing
    fun _privacyOptOut(): JsonField<Boolean> = privacyOptOut

    /**
     * Returns the raw JSON value of [regulationO].
     *
     * Unlike [regulationO], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regulation_o")
    @ExcludeMissing
    fun _regulationO(): JsonField<Boolean> = regulationO

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BankSettings = apply {
        if (validated) {
            return@apply
        }

        id()
        backupWithholdingPercentage()
        createdAt()
        discardedAt()
        enableBackupWithholding()
        liveMode()
        object_()
        privacyOptOut()
        regulationO()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BankSettings].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .backupWithholdingPercentage()
         * .createdAt()
         * .discardedAt()
         * .enableBackupWithholding()
         * .liveMode()
         * .object_()
         * .privacyOptOut()
         * .regulationO()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BankSettings]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var backupWithholdingPercentage: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var enableBackupWithholding: JsonField<Boolean>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var privacyOptOut: JsonField<Boolean>? = null
        private var regulationO: JsonField<Boolean>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bankSettings: BankSettings) = apply {
            id = bankSettings.id
            backupWithholdingPercentage = bankSettings.backupWithholdingPercentage
            createdAt = bankSettings.createdAt
            discardedAt = bankSettings.discardedAt
            enableBackupWithholding = bankSettings.enableBackupWithholding
            liveMode = bankSettings.liveMode
            object_ = bankSettings.object_
            privacyOptOut = bankSettings.privacyOptOut
            regulationO = bankSettings.regulationO
            updatedAt = bankSettings.updatedAt
            additionalProperties = bankSettings.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The percentage of backup withholding to apply to the legal entity. */
        fun backupWithholdingPercentage(backupWithholdingPercentage: Long?) =
            backupWithholdingPercentage(JsonField.ofNullable(backupWithholdingPercentage))

        /**
         * Alias for [Builder.backupWithholdingPercentage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun backupWithholdingPercentage(backupWithholdingPercentage: Long) =
            backupWithholdingPercentage(backupWithholdingPercentage as Long?)

        /**
         * Sets [Builder.backupWithholdingPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backupWithholdingPercentage] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun backupWithholdingPercentage(backupWithholdingPercentage: JsonField<Long>) = apply {
            this.backupWithholdingPercentage = backupWithholdingPercentage
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
         * Whether backup withholding is enabled. See more here -
         * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
         */
        fun enableBackupWithholding(enableBackupWithholding: Boolean?) =
            enableBackupWithholding(JsonField.ofNullable(enableBackupWithholding))

        /**
         * Alias for [Builder.enableBackupWithholding].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enableBackupWithholding(enableBackupWithholding: Boolean) =
            enableBackupWithholding(enableBackupWithholding as Boolean?)

        /**
         * Sets [Builder.enableBackupWithholding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableBackupWithholding] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableBackupWithholding(enableBackupWithholding: JsonField<Boolean>) = apply {
            this.enableBackupWithholding = enableBackupWithholding
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

        /** Cross River Bank specific setting to opt out of privacy policy. */
        fun privacyOptOut(privacyOptOut: Boolean?) =
            privacyOptOut(JsonField.ofNullable(privacyOptOut))

        /**
         * Alias for [Builder.privacyOptOut].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun privacyOptOut(privacyOptOut: Boolean) = privacyOptOut(privacyOptOut as Boolean?)

        /**
         * Sets [Builder.privacyOptOut] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyOptOut] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privacyOptOut(privacyOptOut: JsonField<Boolean>) = apply {
            this.privacyOptOut = privacyOptOut
        }

        /**
         * It covers, among other types of insider loans, extensions of credit by a member bank to
         * an executive officer, director, or principal shareholder of the member bank; a bank
         * holding company of which the member bank is a subsidiary; and any other subsidiary of
         * that bank holding company.
         */
        fun regulationO(regulationO: Boolean?) = regulationO(JsonField.ofNullable(regulationO))

        /**
         * Alias for [Builder.regulationO].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun regulationO(regulationO: Boolean) = regulationO(regulationO as Boolean?)

        /**
         * Sets [Builder.regulationO] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulationO] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regulationO(regulationO: JsonField<Boolean>) = apply { this.regulationO = regulationO }

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
         * Returns an immutable instance of [BankSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .backupWithholdingPercentage()
         * .createdAt()
         * .discardedAt()
         * .enableBackupWithholding()
         * .liveMode()
         * .object_()
         * .privacyOptOut()
         * .regulationO()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BankSettings =
            BankSettings(
                checkRequired("id", id),
                checkRequired("backupWithholdingPercentage", backupWithholdingPercentage),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("enableBackupWithholding", enableBackupWithholding),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("privacyOptOut", privacyOptOut),
                checkRequired("regulationO", regulationO),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BankSettings && id == other.id && backupWithholdingPercentage == other.backupWithholdingPercentage && createdAt == other.createdAt && discardedAt == other.discardedAt && enableBackupWithholding == other.enableBackupWithholding && liveMode == other.liveMode && object_ == other.object_ && privacyOptOut == other.privacyOptOut && regulationO == other.regulationO && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, backupWithholdingPercentage, createdAt, discardedAt, enableBackupWithholding, liveMode, object_, privacyOptOut, regulationO, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BankSettings{id=$id, backupWithholdingPercentage=$backupWithholdingPercentage, createdAt=$createdAt, discardedAt=$discardedAt, enableBackupWithholding=$enableBackupWithholding, liveMode=$liveMode, object_=$object_, privacyOptOut=$privacyOptOut, regulationO=$regulationO, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
