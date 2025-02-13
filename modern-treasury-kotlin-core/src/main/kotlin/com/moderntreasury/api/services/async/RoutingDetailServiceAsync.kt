// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPageAsync
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams

interface RoutingDetailServiceAsync {

    /** Create a routing detail for a single external account. */
    suspend fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutingDetail

    /** Get a single routing detail for a single internal or external account. */
    suspend fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutingDetail

    /** Get a list of routing details for a single internal or external account. */
    suspend fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutingDetailListPageAsync

    /** Delete a routing detail for a single external account. */
    suspend fun delete(
        params: RoutingDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    class AccountsType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            EXTERNAL_ACCOUNTS,
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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountsType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }
}
