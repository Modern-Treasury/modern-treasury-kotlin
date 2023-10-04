// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class AccountDetailCreateParams
constructor(
    private val accountsType: AccountsType,
    private val accountId: String,
    private val accountNumber: String,
    private val accountNumberType: AccountNumberType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountsType(): AccountsType = accountsType

    fun accountId(): String = accountId

    fun accountNumber(): String = accountNumber

    fun accountNumberType(): AccountNumberType? = accountNumberType

    internal fun getBody(): AccountDetailCreateBody {
        return AccountDetailCreateBody(
            accountNumber,
            accountNumberType,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountsType.toString()
            1 -> accountId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountDetailCreateBody.Builder::class)
    @NoAutoDetect
    class AccountDetailCreateBody
    internal constructor(
        private val accountNumber: String?,
        private val accountNumberType: AccountNumberType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The account number for the bank account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
        @JsonProperty("account_number_type")
        fun accountNumberType(): AccountNumberType? = accountNumberType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountDetailCreateBody &&
                this.accountNumber == other.accountNumber &&
                this.accountNumberType == other.accountNumberType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumber,
                        accountNumberType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountDetailCreateBody{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: String? = null
            private var accountNumberType: AccountNumberType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountDetailCreateBody: AccountDetailCreateBody) = apply {
                this.accountNumber = accountDetailCreateBody.accountNumber
                this.accountNumberType = accountDetailCreateBody.accountNumberType
                additionalProperties(accountDetailCreateBody.additionalProperties)
            }

            /** The account number for the bank account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
             * number is in a generic format.
             */
            @JsonProperty("account_number_type")
            fun accountNumberType(accountNumberType: AccountNumberType) = apply {
                this.accountNumberType = accountNumberType
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountDetailCreateBody =
                AccountDetailCreateBody(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    accountNumberType,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountDetailCreateParams &&
            this.accountsType == other.accountsType &&
            this.accountId == other.accountId &&
            this.accountNumber == other.accountNumber &&
            this.accountNumberType == other.accountNumberType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountsType,
            accountId,
            accountNumber,
            accountNumberType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountDetailCreateParams{accountsType=$accountsType, accountId=$accountId, accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountsType: AccountsType? = null
        private var accountId: String? = null
        private var accountNumber: String? = null
        private var accountNumberType: AccountNumberType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountDetailCreateParams: AccountDetailCreateParams) = apply {
            this.accountsType = accountDetailCreateParams.accountsType
            this.accountId = accountDetailCreateParams.accountId
            this.accountNumber = accountDetailCreateParams.accountNumber
            this.accountNumberType = accountDetailCreateParams.accountNumberType
            additionalQueryParams(accountDetailCreateParams.additionalQueryParams)
            additionalHeaders(accountDetailCreateParams.additionalHeaders)
            additionalBodyProperties(accountDetailCreateParams.additionalBodyProperties)
        }

        fun accountsType(accountsType: AccountsType) = apply { this.accountsType = accountsType }

        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The account number for the bank account. */
        fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
        fun accountNumberType(accountNumberType: AccountNumberType) = apply {
            this.accountNumberType = accountNumberType
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountDetailCreateParams =
            AccountDetailCreateParams(
                checkNotNull(accountsType) { "`accountsType` is required but was not set" },
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                accountNumberType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class AccountNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountNumberType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CLABE = AccountNumberType(JsonField.of("clabe"))

            val IBAN = AccountNumberType(JsonField.of("iban"))

            val OTHER = AccountNumberType(JsonField.of("other"))

            val PAN = AccountNumberType(JsonField.of("pan"))

            val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

            fun of(value: String) = AccountNumberType(JsonField.of(value))
        }

        enum class Known {
            CLABE,
            IBAN,
            OTHER,
            PAN,
            WALLET_ADDRESS,
        }

        enum class Value {
            CLABE,
            IBAN,
            OTHER,
            PAN,
            WALLET_ADDRESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CLABE -> Value.CLABE
                IBAN -> Value.IBAN
                OTHER -> Value.OTHER
                PAN -> Value.PAN
                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CLABE -> Known.CLABE
                IBAN -> Known.IBAN
                OTHER -> Known.OTHER
                PAN -> Known.PAN
                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown AccountNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class AccountsType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountsType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EXTERNAL_ACCOUNTS = AccountsType(JsonField.of("external_accounts"))

            fun of(value: String) = AccountsType(JsonField.of(value))
        }

        enum class Known {
            EXTERNAL_ACCOUNTS,
        }

        enum class Value {
            EXTERNAL_ACCOUNTS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                else -> throw ModernTreasuryInvalidDataException("Unknown AccountsType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
