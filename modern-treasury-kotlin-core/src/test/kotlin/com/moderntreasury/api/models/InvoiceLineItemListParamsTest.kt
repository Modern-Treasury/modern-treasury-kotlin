// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemListParamsTest {

    @Test
    fun create() {
        InvoiceLineItemListParams.builder()
            .invoiceId("invoice_id")
            .afterCursor("after_cursor")
            .perPage(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceLineItemListParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceLineItemListParams.builder()
                .invoiceId("invoice_id")
                .afterCursor("after_cursor")
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceLineItemListParams.builder().invoiceId("invoice_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
