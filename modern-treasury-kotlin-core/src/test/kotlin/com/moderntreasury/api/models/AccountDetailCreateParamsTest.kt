// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountDetailCreateParamsTest {

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
    fun body() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountNumber("account_number")
                .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
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

        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("account_number")
    }

    @Test
    fun getPathParam() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountNumber("account_number")
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0))
            .isEqualTo(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
