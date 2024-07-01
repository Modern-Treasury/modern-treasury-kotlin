// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountDetailCreateParamsTest {

    @Test
    fun createAccountDetailCreateParams() {
        AccountDetailCreateParams.builder()
            .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("string")
            .accountNumber("string")
            .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .accountNumber("string")
                .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("string")
        assertThat(body.accountNumberType())
            .isEqualTo(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .accountNumber("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .accountNumber("string")
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0))
            .isEqualTo(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
