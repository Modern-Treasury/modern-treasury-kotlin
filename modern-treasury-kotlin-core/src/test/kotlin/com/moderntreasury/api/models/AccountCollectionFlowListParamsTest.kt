// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowListParamsTest {

    @Test
    fun create() {
        AccountCollectionFlowListParams.builder()
            .afterCursor("after_cursor")
            .clientToken("client_token")
            .counterpartyId("counterparty_id")
            .externalAccountId("external_account_id")
            .perPage(0L)
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountCollectionFlowListParams.builder()
                .afterCursor("after_cursor")
                .clientToken("client_token")
                .counterpartyId("counterparty_id")
                .externalAccountId("external_account_id")
                .perPage(0L)
                .status("status")
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("client_token", "client_token")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("external_account_id", "external_account_id")
        expected.put("per_page", "0")
        expected.put("status", "status")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountCollectionFlowListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
