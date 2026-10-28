// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailCreateParamsTest {

    @Test
    fun create() {
        AccountDetailCreateParams.builder()
            .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .accountDetailCreateRequest(
                AccountDetailCreateRequest.builder()
                    .accountNumber("account_number")
                    .accountNumberType(
                        AccountDetailCreateRequest.AccountNumberType.ARBITRUM_ADDRESS
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountDetailCreateRequest(
                    AccountDetailCreateRequest.builder().accountNumber("account_number").build()
                )
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
                .accountDetailCreateRequest(
                    AccountDetailCreateRequest.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            AccountDetailCreateRequest.AccountNumberType.ARBITRUM_ADDRESS
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountDetailCreateRequest.builder()
                    .accountNumber("account_number")
                    .accountNumberType(
                        AccountDetailCreateRequest.AccountNumberType.ARBITRUM_ADDRESS
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountDetailCreateParams.builder()
                .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .accountDetailCreateRequest(
                    AccountDetailCreateRequest.builder().accountNumber("account_number").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(AccountDetailCreateRequest.builder().accountNumber("account_number").build())
    }
}
