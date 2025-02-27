// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingDetailDeleteParamsTest {

    @Test
    fun create() {
        RoutingDetailDeleteParams.builder()
            .accountsType(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .id("id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            RoutingDetailDeleteParams.builder()
                .accountsType(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .id("id")
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0))
            .isEqualTo(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("account_id")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
