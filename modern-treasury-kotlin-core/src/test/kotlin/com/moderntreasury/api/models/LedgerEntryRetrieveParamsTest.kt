// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEntryRetrieveParamsTest {

    @Test
    fun create() {
        LedgerEntryRetrieveParams.builder().id("id").showBalances(true).build()
    }

    @Test
    fun queryParams() {
        val params = LedgerEntryRetrieveParams.builder().id("id").showBalances(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("show_balances", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerEntryRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = LedgerEntryRetrieveParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
