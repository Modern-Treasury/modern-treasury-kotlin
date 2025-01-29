// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingDetailListParamsTest {

    @Test
    fun createRoutingDetailListParams() {
        RoutingDetailListParams.builder()
            .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .afterCursor("after_cursor")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoutingDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .afterCursor("after_cursor")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("per_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RoutingDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            RoutingDetailListParams.builder()
                .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0)).isEqualTo(AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
