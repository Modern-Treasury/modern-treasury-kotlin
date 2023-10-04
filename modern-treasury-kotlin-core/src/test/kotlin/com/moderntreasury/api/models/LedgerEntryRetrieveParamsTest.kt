// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryRetrieveParamsTest {

    @Test
    fun createLedgerEntryRetrieveParams() {
        LedgerEntryRetrieveParams.builder().id("string").showBalances(true).build()
    }

    @Test
    fun getQueryParams() {
        val params = LedgerEntryRetrieveParams.builder().id("string").showBalances(true).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("show_balances", listOf("true"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEntryRetrieveParams.builder().id("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = LedgerEntryRetrieveParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
