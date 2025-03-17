// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceReportDeleteParamsTest {

    @Test
    fun create() {
        BalanceReportDeleteParams.builder()
            .internalAccountId("internal_account_id")
            .id("id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            BalanceReportDeleteParams.builder()
                .internalAccountId("internal_account_id")
                .id("id")
                .build()
        assertThat(params).isNotNull
        // path param "internalAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("internal_account_id")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
