// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryRetrieveParamsTest {

    @Test
    fun createLedgerEntryRetrieveParams() {
        LedgerEntryRetrieveParams.builder().id("id").showBalances(true).build()
    }

    @Test
    fun getQueryParams() {
        val params = LedgerEntryRetrieveParams.builder().id("id").showBalances(true).build()
        val expected = QueryParams.builder()
        expected.put("show_balances", "true")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEntryRetrieveParams.builder().id("id").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
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
