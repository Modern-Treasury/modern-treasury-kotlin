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
            .externalId("external_id")
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
                .externalId("external_id")
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("counterparty_id", "counterparty_id")
                    .put("created_at_end", "2019-12-27")
                    .put("created_at_start", "2019-12-27")
                    .put("direction", "credit")
                    .put("effective_date_end", "2019-12-27")
                    .put("effective_date_start", "2019-12-27")
                    .put("external_id", "external_id")
                    .put("metadata[foo]", "string")
                    .put("originating_account_id", "originating_account_id")
                    .put("per_page", "0")
                    .put("priority", "high")
                    .put("process_after_end", "2019-12-27T18:11:19.117Z")
                    .put("process_after_start", "2019-12-27T18:11:19.117Z")
                    .put("reference_number", "reference_number")
                    .put("status", "approved")
                    .put("transaction_id", "transaction_id")
                    .put("type", "ach")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentOrderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
