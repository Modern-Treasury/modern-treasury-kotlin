// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountDetailListParamsTest {

    @Test
    fun createAccountDetailListParams() {
        AccountDetailListParams.builder()
            .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("string")
            .afterCursor("string")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .afterCursor("string")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            AccountDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0)).isEqualTo(AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
