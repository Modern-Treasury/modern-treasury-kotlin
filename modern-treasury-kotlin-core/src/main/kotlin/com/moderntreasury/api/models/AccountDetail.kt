// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = AccountDetail.Builder::class)
@NoAutoDetect
class AccountDetail
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val accountNumber: JsonField<String>,
    private val accountNumberType: JsonField<AccountNumberType>,
    private val accountNumberSafe: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The account number for the bank account. */
    fun accountNumber(): String? = accountNumber.getNullable("account_number")

    /**
     * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account number
     * is in a generic format.
     */
    fun accountNumberType(): AccountNumberType =
        accountNumberType.getRequired("account_number_type")

    /** The last 4 digits of the account_number. */
    fun accountNumberSafe(): String = accountNumberSafe.getRequired("account_number_safe")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** The account number for the bank account. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /**
     * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account number
     * is in a generic format.
     */
    @JsonProperty("account_number_type")
    @ExcludeMissing
    fun _accountNumberType() = accountNumberType

    /** The last 4 digits of the account_number. */
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    fun _accountNumberSafe() = accountNumberSafe

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountDetail = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            accountNumber()
            accountNumberType()
            accountNumberSafe()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var accountNumberType: JsonField<AccountNumberType> = JsonMissing.of()
        private var accountNumberSafe: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountDetail: AccountDetail) = apply {
            id = accountDetail.id
            object_ = accountDetail.object_
            liveMode = accountDetail.liveMode
            createdAt = accountDetail.createdAt
            updatedAt = accountDetail.updatedAt
            discardedAt = accountDetail.discardedAt
            accountNumber = accountDetail.accountNumber
            accountNumberType = accountDetail.accountNumberType
            accountNumberSafe = accountDetail.accountNumberSafe
            additionalProperties = accountDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The account number for the bank account. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number for the bank account. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
        fun accountNumberType(accountNumberType: AccountNumberType) =
            accountNumberType(JsonField.of(accountNumberType))

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
        @JsonProperty("account_number_type")
        @ExcludeMissing
        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) = apply {
            this.accountNumberType = accountNumberType
        }

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: String) =
            accountNumberSafe(JsonField.of(accountNumberSafe))

        /** The last 4 digits of the account_number. */
        @JsonProperty("account_number_safe")
        @ExcludeMissing
        fun accountNumberSafe(accountNumberSafe: JsonField<String>) = apply {
            this.accountNumberSafe = accountNumberSafe
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): AccountDetail =
            AccountDetail(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                accountNumber,
                accountNumberType,
                accountNumberSafe,
                additionalProperties.toImmutable(),
            )
    }

    class AccountNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AU_NUMBER = of("au_number")

            val CLABE = of("clabe")

            val HK_NUMBER = of("hk_number")

            val IBAN = of("iban")

            val ID_NUMBER = of("id_number")

            val NZ_NUMBER = of("nz_number")

            val OTHER = of("other")

            val PAN = of("pan")

            val SG_NUMBER = of("sg_number")

            val WALLET_ADDRESS = of("wallet_address")

            fun of(value: String) = AccountNumberType(JsonField.of(value))
        }

        enum class Known {
            AU_NUMBER,
            CLABE,
            HK_NUMBER,
            IBAN,
            ID_NUMBER,
            NZ_NUMBER,
            OTHER,
            PAN,
            SG_NUMBER,
            WALLET_ADDRESS,
        }

        enum class Value {
            AU_NUMBER,
            CLABE,
            HK_NUMBER,
            IBAN,
            ID_NUMBER,
            NZ_NUMBER,
            OTHER,
            PAN,
            SG_NUMBER,
            WALLET_ADDRESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AU_NUMBER -> Value.AU_NUMBER
                CLABE -> Value.CLABE
                HK_NUMBER -> Value.HK_NUMBER
                IBAN -> Value.IBAN
                ID_NUMBER -> Value.ID_NUMBER
                NZ_NUMBER -> Value.NZ_NUMBER
                OTHER -> Value.OTHER
                PAN -> Value.PAN
                SG_NUMBER -> Value.SG_NUMBER
                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AU_NUMBER -> Known.AU_NUMBER
                CLABE -> Known.CLABE
                HK_NUMBER -> Known.HK_NUMBER
                IBAN -> Known.IBAN
                ID_NUMBER -> Known.ID_NUMBER
                NZ_NUMBER -> Known.NZ_NUMBER
                OTHER -> Known.OTHER
                PAN -> Known.PAN
                SG_NUMBER -> Known.SG_NUMBER
                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown AccountNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountDetail && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && accountNumberSafe == other.accountNumberSafe && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, accountNumber, accountNumberType, accountNumberSafe, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, accountNumber=$accountNumber, accountNumberType=$accountNumberType, accountNumberSafe=$accountNumberSafe, additionalProperties=$additionalProperties}"
}
