// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailCreateParamsTest {

    @Test
    fun create() {
        AccountDetailCreateParams.builder()
            .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .accountNumber("account_number")
            .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountNumber("account_number")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_accounts")
        assertThat(params._pathParam(1)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountNumber("account_number")
                .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumber()).isEqualTo("account_number")
        assertThat(body.accountNumberType())
            .isEqualTo(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountNumber("account_number")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumber()).isEqualTo("account_number")
    }
}
