// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("counterparty_id", "counterparty_id")
                    .put("due_date_end", "2019-12-27")
                    .put("due_date_start", "2019-12-27")
                    .put("expected_payment_id", "expected_payment_id")
                    .put("metadata[foo]", "string")
                    .put("number", "number")
                    .put("originating_account_id", "originating_account_id")
                    .put("payment_order_id", "payment_order_id")
                    .put("per_page", "0")
                    .put("status", "draft")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
