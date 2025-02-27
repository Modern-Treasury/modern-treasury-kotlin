// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceListParamsTest {

    @Test
    fun create() {
        InvoiceListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .dueDateEnd(LocalDate.parse("2019-12-27"))
            .dueDateStart(LocalDate.parse("2019-12-27"))
            .expectedPaymentId("expected_payment_id")
            .metadata(
                InvoiceListParams.Metadata.builder().putAdditionalProperty("foo", "string").build()
            )
            .number("number")
            .originatingAccountId("originating_account_id")
            .paymentOrderId("payment_order_id")
            .perPage(0L)
            .status(InvoiceListParams.Status.DRAFT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .dueDateEnd(LocalDate.parse("2019-12-27"))
                .dueDateStart(LocalDate.parse("2019-12-27"))
                .expectedPaymentId("expected_payment_id")
                .metadata(
                    InvoiceListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .number("number")
                .originatingAccountId("originating_account_id")
                .paymentOrderId("payment_order_id")
                .perPage(0L)
                .status(InvoiceListParams.Status.DRAFT)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("due_date_end", "2019-12-27")
        expected.put("due_date_start", "2019-12-27")
        expected.put("expected_payment_id", "expected_payment_id")
        InvoiceListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("number", "number")
        expected.put("originating_account_id", "originating_account_id")
        expected.put("payment_order_id", "payment_order_id")
        expected.put("per_page", "0")
        expected.put("status", InvoiceListParams.Status.DRAFT.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
