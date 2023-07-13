@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListPageAsync
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams

interface AccountDetailServiceAsync {

    /** Create an account detail for an external account. */
    suspend fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountDetail

    /** Get a single account detail for a single internal or external account. */
    suspend fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountDetail

    /** Get a list of account details for a single internal or external account. */
    suspend fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountDetailListPageAsync

    /** Delete a single account detail for an external account. */
    suspend fun delete(
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

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
