package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderListParamsTest {

    @Test
    fun createPaymentOrderListParams() {
        PaymentOrderListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .type(PaymentOrderListParams.Type.ACH)
            .priority(PaymentOrderListParams.Priority.HIGH)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(PaymentOrderListParams.Status.APPROVED)
            .direction(PaymentOrderListParams.Direction.CREDIT)
            .referenceNumber("string")
            .effectiveDateStart(LocalDate.parse("2019-12-27"))
            .effectiveDateEnd(LocalDate.parse("2019-12-27"))
            .metadata(PaymentOrderListParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentOrderListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .type(PaymentOrderListParams.Type.ACH)
                .priority(PaymentOrderListParams.Priority.HIGH)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(PaymentOrderListParams.Status.APPROVED)
                .direction(PaymentOrderListParams.Direction.CREDIT)
                .referenceNumber("string")
                .effectiveDateStart(LocalDate.parse("2019-12-27"))
                .effectiveDateEnd(LocalDate.parse("2019-12-27"))
                .metadata(PaymentOrderListParams.Metadata.builder().build())
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("type", listOf(PaymentOrderListParams.Type.ACH.toString()))
        expected.put("priority", listOf(PaymentOrderListParams.Priority.HIGH.toString()))
        expected.put("counterparty_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("originating_account_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("transaction_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("status", listOf(PaymentOrderListParams.Status.APPROVED.toString()))
        expected.put("direction", listOf(PaymentOrderListParams.Direction.CREDIT.toString()))
        expected.put("reference_number", listOf("string"))
        expected.put("effective_date_start", listOf("2019-12-27"))
        expected.put("effective_date_end", listOf("2019-12-27"))
        PaymentOrderListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentOrderListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
