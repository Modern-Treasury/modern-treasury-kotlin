// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingDetailDeleteParamsTest {

    @Test
    fun create() {
        RoutingDetailDeleteParams.builder()
            .accountsType(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .id("id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoutingDetailDeleteParams.builder()
                .accountsType(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .id("id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_accounts")
        assertThat(params._pathParam(1)).isEqualTo("account_id")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
