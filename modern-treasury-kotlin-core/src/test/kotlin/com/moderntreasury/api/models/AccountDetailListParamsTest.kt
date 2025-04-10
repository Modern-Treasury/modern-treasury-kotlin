// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailListParamsTest {

    @Test
    fun create() {
        AccountDetailListParams.builder()
            .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .afterCursor("after_cursor")
            .perPage(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_accounts")
        assertThat(params._pathParam(1)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AccountDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .afterCursor("after_cursor")
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AccountDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
