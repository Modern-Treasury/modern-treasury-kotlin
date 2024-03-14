// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceListParamsTest {

    @Test
    fun createInvoiceListParams() {
        InvoiceListParams.builder()
            .afterCursor("string")
            .counterpartyId("string")
            .dueDateEnd(LocalDate.parse("2019-12-27"))
            .dueDateStart(LocalDate.parse("2019-12-27"))
            .expectedPaymentId("string")
            .metadata(InvoiceListParams.Metadata.builder().build())
            .number("string")
            .originatingAccountId("string")
            .paymentOrderId("string")
            .perPage(123L)
            .status(InvoiceListParams.Status.DRAFT)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InvoiceListParams.builder()
                .afterCursor("string")
                .counterpartyId("string")
                .dueDateEnd(LocalDate.parse("2019-12-27"))
                .dueDateStart(LocalDate.parse("2019-12-27"))
                .expectedPaymentId("string")
                .metadata(InvoiceListParams.Metadata.builder().build())
                .number("string")
                .originatingAccountId("string")
                .paymentOrderId("string")
                .perPage(123L)
                .status(InvoiceListParams.Status.DRAFT)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("due_date_end", listOf("2019-12-27"))
        expected.put("due_date_start", listOf("2019-12-27"))
        expected.put("expected_payment_id", listOf("string"))
        InvoiceListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("number", listOf("string"))
        expected.put("originating_account_id", listOf("string"))
        expected.put("payment_order_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("status", listOf(InvoiceListParams.Status.DRAFT.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
