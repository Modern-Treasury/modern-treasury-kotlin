// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCollectionFlowListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("client_token", "client_token")
                    .put("counterparty_id", "counterparty_id")
                    .put("external_account_id", "external_account_id")
                    .put("per_page", "0")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountCollectionFlowListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
