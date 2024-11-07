// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VirtualAccountListParamsTest {

    @Test
    fun createVirtualAccountListParams() {
        VirtualAccountListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .internalAccountId("internal_account_id")
            .metadata(VirtualAccountListParams.Metadata.builder().build())
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            VirtualAccountListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .internalAccountId("internal_account_id")
                .metadata(VirtualAccountListParams.Metadata.builder().build())
                .perPage(123L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("internal_account_id", "internal_account_id")
        VirtualAccountListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = VirtualAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
