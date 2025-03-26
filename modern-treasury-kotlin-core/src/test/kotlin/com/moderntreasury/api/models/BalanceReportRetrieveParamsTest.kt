// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceReportRetrieveParamsTest {

    @Test
    fun create() {
        BalanceReportRetrieveParams.builder()
            .internalAccountId("internal_account_id")
            .id("id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceReportRetrieveParams.builder()
                .internalAccountId("internal_account_id")
                .id("id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("internal_account_id")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
