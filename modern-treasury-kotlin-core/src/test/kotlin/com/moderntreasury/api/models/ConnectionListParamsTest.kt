// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListParamsTest {

    @Test
    fun create() {
        ConnectionListParams.builder()
            .afterCursor("after_cursor")
            .entity("entity")
            .perPage(0L)
            .vendorCustomerId("vendor_customer_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConnectionListParams.builder()
                .afterCursor("after_cursor")
                .entity("entity")
                .perPage(0L)
                .vendorCustomerId("vendor_customer_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("entity", "entity")
                    .put("per_page", "0")
                    .put("vendor_customer_id", "vendor_customer_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
