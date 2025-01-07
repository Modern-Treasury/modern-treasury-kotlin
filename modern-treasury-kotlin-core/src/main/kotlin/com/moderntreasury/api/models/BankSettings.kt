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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
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

    fun id(): String = id.getRequired("id")

    /** The percentage of backup withholding to apply to the legal entity. */
    fun backupWithholdingPercentage(): Long? =
        backupWithholdingPercentage.getNullable("backup_withholding_percentage")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * Whether backup withholding is enabled. See more here -
     * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
     */
    fun enableBackupWithholding(): Boolean? =
        enableBackupWithholding.getNullable("enable_backup_withholding")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /** Cross River Bank specific setting to opt out of privacy policy. */
    fun privacyOptOut(): Boolean? = privacyOptOut.getNullable("privacy_opt_out")

    /**
     * It covers, among other types of insider loans, extensions of credit by a member bank to an
     * executive officer, director, or principal shareholder of the member bank; a bank holding
     * company of which the member bank is a subsidiary; and any other subsidiary of that bank
     * holding company.
     */
    fun regulationO(): Boolean? = regulationO.getNullable("regulation_o")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The percentage of backup withholding to apply to the legal entity. */
    @JsonProperty("backup_withholding_percentage")
    @ExcludeMissing
    fun _backupWithholdingPercentage(): JsonField<Long> = backupWithholdingPercentage

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Whether backup withholding is enabled. See more here -
     * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
     */
    @JsonProperty("enable_backup_withholding")
    @ExcludeMissing
    fun _enableBackupWithholding(): JsonField<Boolean> = enableBackupWithholding

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** Cross River Bank specific setting to opt out of privacy policy. */
    @JsonProperty("privacy_opt_out")
    @ExcludeMissing
    fun _privacyOptOut(): JsonField<Boolean> = privacyOptOut

    /**
     * It covers, among other types of insider loans, extensions of credit by a member bank to an
     * executive officer, director, or principal shareholder of the member bank; a bank holding
     * company of which the member bank is a subsidiary; and any other subsidiary of that bank
     * holding company.
     */
    @JsonProperty("regulation_o")
    @ExcludeMissing
    fun _regulationO(): JsonField<Boolean> = regulationO

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BankSettings = apply {
        if (!validated) {
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
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

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

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The percentage of backup withholding to apply to the legal entity. */
        fun backupWithholdingPercentage(backupWithholdingPercentage: Long?) =
            backupWithholdingPercentage(JsonField.ofNullable(backupWithholdingPercentage))

        /** The percentage of backup withholding to apply to the legal entity. */
        fun backupWithholdingPercentage(backupWithholdingPercentage: Long) =
            backupWithholdingPercentage(backupWithholdingPercentage as Long?)

        /** The percentage of backup withholding to apply to the legal entity. */
        fun backupWithholdingPercentage(backupWithholdingPercentage: JsonField<Long>) = apply {
            this.backupWithholdingPercentage = backupWithholdingPercentage
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

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
         * Whether backup withholding is enabled. See more here -
         * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
         */
        fun enableBackupWithholding(enableBackupWithholding: Boolean) =
            enableBackupWithholding(enableBackupWithholding as Boolean?)

        /**
         * Whether backup withholding is enabled. See more here -
         * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
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
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** Cross River Bank specific setting to opt out of privacy policy. */
        fun privacyOptOut(privacyOptOut: Boolean?) =
            privacyOptOut(JsonField.ofNullable(privacyOptOut))

        /** Cross River Bank specific setting to opt out of privacy policy. */
        fun privacyOptOut(privacyOptOut: Boolean) = privacyOptOut(privacyOptOut as Boolean?)

        /** Cross River Bank specific setting to opt out of privacy policy. */
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
         * It covers, among other types of insider loans, extensions of credit by a member bank to
         * an executive officer, director, or principal shareholder of the member bank; a bank
         * holding company of which the member bank is a subsidiary; and any other subsidiary of
         * that bank holding company.
         */
        fun regulationO(regulationO: Boolean) = regulationO(regulationO as Boolean?)

        /**
         * It covers, among other types of insider loans, extensions of credit by a member bank to
         * an executive officer, director, or principal shareholder of the member bank; a bank
         * holding company of which the member bank is a subsidiary; and any other subsidiary of
         * that bank holding company.
         */
        fun regulationO(regulationO: JsonField<Boolean>) = apply { this.regulationO = regulationO }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

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

        fun build(): BankSettings =
            BankSettings(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(backupWithholdingPercentage) {
                    "`backupWithholdingPercentage` is required but was not set"
                },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                checkNotNull(enableBackupWithholding) {
                    "`enableBackupWithholding` is required but was not set"
                },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(privacyOptOut) { "`privacyOptOut` is required but was not set" },
                checkNotNull(regulationO) { "`regulationO` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
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
