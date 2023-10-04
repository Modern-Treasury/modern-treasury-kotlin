// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowListParamsTest {

    @Test
    fun createAccountCollectionFlowListParams() {
        AccountCollectionFlowListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .clientToken("string")
            .status("string")
            .counterpartyId("string")
            .externalAccountId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountCollectionFlowListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .clientToken("string")
                .status("string")
                .counterpartyId("string")
                .externalAccountId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("client_token", listOf("string"))
        expected.put("status", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("external_account_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountCollectionFlowListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
