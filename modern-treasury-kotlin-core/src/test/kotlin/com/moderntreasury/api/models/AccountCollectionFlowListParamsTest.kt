// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowListParamsTest {

    @Test
    fun createAccountCollectionFlowListParams() {
        AccountCollectionFlowListParams.builder()
            .afterCursor("after_cursor")
            .clientToken("client_token")
            .counterpartyId("counterparty_id")
            .externalAccountId("external_account_id")
            .perPage(123L)
            .status("status")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountCollectionFlowListParams.builder()
                .afterCursor("after_cursor")
                .clientToken("client_token")
                .counterpartyId("counterparty_id")
                .externalAccountId("external_account_id")
                .perPage(123L)
                .status("status")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("client_token", listOf("client_token"))
        expected.put("counterparty_id", listOf("counterparty_id"))
        expected.put("external_account_id", listOf("external_account_id"))
        expected.put("per_page", listOf("123"))
        expected.put("status", listOf("status"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountCollectionFlowListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
