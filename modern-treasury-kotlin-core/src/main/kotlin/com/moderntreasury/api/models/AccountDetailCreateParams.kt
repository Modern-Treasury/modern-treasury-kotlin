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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create an account detail for an external account. */
class AccountDetailCreateParams
private constructor(
    private val accountsType: AccountsType,
    private val accountId: String,
    private val body: AccountDetailCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountsType(): AccountsType = accountsType

    fun accountId(): String = accountId

    /**
     * The account number for the bank account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = body.accountNumber()

    /**
     * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account number
     * is in a generic format.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountNumberType(): AccountNumberType? = body.accountNumberType()

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [accountNumberType].
     *
     * Unlike [accountNumberType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountNumberType(): JsonField<AccountNumberType> = body._accountNumberType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountDetailCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountsType()
         * .accountId()
         * .accountNumber()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountDetailCreateParams]. */
    class Builder internal constructor() {

        private var accountsType: AccountsType? = null
        private var accountId: String? = null
        private var body: AccountDetailCreateRequest.Builder = AccountDetailCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(accountDetailCreateParams: AccountDetailCreateParams) = apply {
            accountsType = accountDetailCreateParams.accountsType
            accountId = accountDetailCreateParams.accountId
            body = accountDetailCreateParams.body.toBuilder()
            additionalHeaders = accountDetailCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountDetailCreateParams.additionalQueryParams.toBuilder()
        }

        fun accountsType(accountsType: AccountsType) = apply { this.accountsType = accountsType }

        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The account number for the bank account. */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            body.accountNumber(accountNumber)
        }

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
        fun accountNumberType(accountNumberType: AccountNumberType) = apply {
            body.accountNumberType(accountNumberType)
        }

        /**
         * Sets [Builder.accountNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberType] with a well-typed [AccountNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) = apply {
            body.accountNumberType(accountNumberType)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AccountDetailCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountsType()
         * .accountId()
         * .accountNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountDetailCreateParams =
            AccountDetailCreateParams(
                checkRequired("accountsType", accountsType),
                checkRequired("accountId", accountId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): AccountDetailCreateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountsType.toString()
            1 -> accountId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class AccountDetailCreateRequest
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountNumberType: JsonField<AccountNumberType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number_type")
            @ExcludeMissing
            accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
        ) : this(accountNumber, accountNumberType, mutableMapOf())

        /**
         * The account number for the bank account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountNumberType(): AccountNumberType? =
            accountNumberType.getNullable("account_number_type")

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountNumberType].
         *
         * Unlike [accountNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_type")
        @ExcludeMissing
        fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

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
             * [AccountDetailCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountDetailCreateRequest]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountNumberType: JsonField<AccountNumberType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountDetailCreateRequest: AccountDetailCreateRequest) = apply {
                accountNumber = accountDetailCreateRequest.accountNumber
                accountNumberType = accountDetailCreateRequest.accountNumberType
                additionalProperties =
                    accountDetailCreateRequest.additionalProperties.toMutableMap()
            }

            /** The account number for the bank account. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.accountNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberType] with a well-typed
             * [AccountNumberType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) = apply {
                this.accountNumberType = accountNumberType
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
             * Returns an immutable instance of [AccountDetailCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountDetailCreateRequest =
                AccountDetailCreateRequest(
                    checkRequired("accountNumber", accountNumber),
                    accountNumberType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountDetailCreateRequest = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            accountNumberType()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountDetailCreateRequest && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountDetailCreateRequest{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
    }

    /**
     * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account number
     * is in a generic format.
     */
    class AccountNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        /** An enum containing [AccountNumberType]'s known values. */
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

        /**
         * An enum containing [AccountNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [AccountNumberType] was instantiated with an unknown
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AccountsType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val EXTERNAL_ACCOUNTS = of("external_accounts")

            fun of(value: String) = AccountsType(JsonField.of(value))
        }

        /** An enum containing [AccountsType]'s known values. */
        enum class Known {
            EXTERNAL_ACCOUNTS
        }

        /**
         * An enum containing [AccountsType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountsType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXTERNAL_ACCOUNTS,
            /**
             * An enum member indicating that [AccountsType] was instantiated with an unknown value.
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
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
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
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                else -> throw ModernTreasuryInvalidDataException("Unknown AccountsType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountsType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountDetailCreateParams && accountsType == other.accountsType && accountId == other.accountId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountsType, accountId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountDetailCreateParams{accountsType=$accountsType, accountId=$accountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
