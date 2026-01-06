// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceReportRetrieveParamsTest {

    @Test
    fun create() {
        BalanceReportRetrieveParams.builder()
            .internalAccountId("internal_account_id")
            .id(BalanceReportRetrieveParams.Id.of("string"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceReportRetrieveParams.builder()
                .internalAccountId("internal_account_id")
                .id(BalanceReportRetrieveParams.Id.of("string"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("internal_account_id")
        assertThat(params._pathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
