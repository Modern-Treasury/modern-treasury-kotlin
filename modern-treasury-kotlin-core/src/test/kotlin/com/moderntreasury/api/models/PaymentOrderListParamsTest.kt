// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderListParamsTest {

    @Test
    fun createPaymentOrderListParams() {
        PaymentOrderListParams.builder()
            .afterCursor("string")
            .counterpartyId("string")
            .createdAtEnd(LocalDate.parse("2019-12-27"))
            .createdAtStart(LocalDate.parse("2019-12-27"))
            .direction(TransactionDirection.CREDIT)
            .effectiveDateEnd(LocalDate.parse("2019-12-27"))
            .effectiveDateStart(LocalDate.parse("2019-12-27"))
            .metadata(PaymentOrderListParams.Metadata.builder().build())
            .originatingAccountId("string")
            .perPage(123L)
            .priority(PaymentOrderListParams.Priority.HIGH)
            .processAfterEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .processAfterStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .referenceNumber("string")
            .status(PaymentOrderListParams.Status.APPROVED)
            .transactionId("string")
            .type(PaymentOrderListParams.Type.ACH)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentOrderListParams.builder()
                .afterCursor("string")
                .counterpartyId("string")
                .createdAtEnd(LocalDate.parse("2019-12-27"))
                .createdAtStart(LocalDate.parse("2019-12-27"))
                .direction(TransactionDirection.CREDIT)
                .effectiveDateEnd(LocalDate.parse("2019-12-27"))
                .effectiveDateStart(LocalDate.parse("2019-12-27"))
                .metadata(PaymentOrderListParams.Metadata.builder().build())
                .originatingAccountId("string")
                .perPage(123L)
                .priority(PaymentOrderListParams.Priority.HIGH)
                .processAfterEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .processAfterStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceNumber("string")
                .status(PaymentOrderListParams.Status.APPROVED)
                .transactionId("string")
                .type(PaymentOrderListParams.Type.ACH)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("created_at_end", listOf("2019-12-27"))
        expected.put("created_at_start", listOf("2019-12-27"))
        expected.put("direction", listOf(TransactionDirection.CREDIT.toString()))
        expected.put("effective_date_end", listOf("2019-12-27"))
        expected.put("effective_date_start", listOf("2019-12-27"))
        PaymentOrderListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("originating_account_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("priority", listOf(PaymentOrderListParams.Priority.HIGH.toString()))
        expected.put("process_after_end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("process_after_start", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("reference_number", listOf("string"))
        expected.put("status", listOf(PaymentOrderListParams.Status.APPROVED.toString()))
        expected.put("transaction_id", listOf("string"))
        expected.put("type", listOf(PaymentOrderListParams.Type.ACH.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentOrderListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
