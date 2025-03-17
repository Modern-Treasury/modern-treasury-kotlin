// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderListParamsTest {

    @Test
    fun create() {
        PaymentOrderListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .createdAtEnd(LocalDate.parse("2019-12-27"))
            .createdAtStart(LocalDate.parse("2019-12-27"))
            .direction(TransactionDirection.CREDIT)
            .effectiveDateEnd(LocalDate.parse("2019-12-27"))
            .effectiveDateStart(LocalDate.parse("2019-12-27"))
            .metadata(
                PaymentOrderListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .originatingAccountId("originating_account_id")
            .perPage(0L)
            .priority(PaymentOrderListParams.Priority.HIGH)
            .processAfterEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .processAfterStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .referenceNumber("reference_number")
            .status(PaymentOrderListParams.Status.APPROVED)
            .transactionId("transaction_id")
            .type(PaymentOrderListParams.Type.ACH)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaymentOrderListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .createdAtEnd(LocalDate.parse("2019-12-27"))
                .createdAtStart(LocalDate.parse("2019-12-27"))
                .direction(TransactionDirection.CREDIT)
                .effectiveDateEnd(LocalDate.parse("2019-12-27"))
                .effectiveDateStart(LocalDate.parse("2019-12-27"))
                .metadata(
                    PaymentOrderListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .originatingAccountId("originating_account_id")
                .perPage(0L)
                .priority(PaymentOrderListParams.Priority.HIGH)
                .processAfterEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .processAfterStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceNumber("reference_number")
                .status(PaymentOrderListParams.Status.APPROVED)
                .transactionId("transaction_id")
                .type(PaymentOrderListParams.Type.ACH)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("created_at_end", "2019-12-27")
        expected.put("created_at_start", "2019-12-27")
        expected.put("direction", TransactionDirection.CREDIT.toString())
        expected.put("effective_date_end", "2019-12-27")
        expected.put("effective_date_start", "2019-12-27")
        PaymentOrderListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("originating_account_id", "originating_account_id")
        expected.put("per_page", "0")
        expected.put("priority", PaymentOrderListParams.Priority.HIGH.toString())
        expected.put("process_after_end", "2019-12-27T18:11:19.117Z")
        expected.put("process_after_start", "2019-12-27T18:11:19.117Z")
        expected.put("reference_number", "reference_number")
        expected.put("status", PaymentOrderListParams.Status.APPROVED.toString())
        expected.put("transaction_id", "transaction_id")
        expected.put("type", PaymentOrderListParams.Type.ACH.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentOrderListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
