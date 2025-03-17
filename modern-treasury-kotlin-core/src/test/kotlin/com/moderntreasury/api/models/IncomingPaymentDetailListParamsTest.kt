// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomingPaymentDetailListParamsTest {

    @Test
    fun create() {
        IncomingPaymentDetailListParams.builder()
            .afterCursor("after_cursor")
            .asOfDateEnd(LocalDate.parse("2019-12-27"))
            .asOfDateStart(LocalDate.parse("2019-12-27"))
            .direction(TransactionDirection.CREDIT)
            .metadata(
                IncomingPaymentDetailListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .status(IncomingPaymentDetailListParams.Status.COMPLETED)
            .type(IncomingPaymentDetailListParams.Type.ACH)
            .virtualAccountId("virtual_account_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IncomingPaymentDetailListParams.builder()
                .afterCursor("after_cursor")
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .direction(TransactionDirection.CREDIT)
                .metadata(
                    IncomingPaymentDetailListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .status(IncomingPaymentDetailListParams.Status.COMPLETED)
                .type(IncomingPaymentDetailListParams.Type.ACH)
                .virtualAccountId("virtual_account_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("as_of_date_end", "2019-12-27")
                    .put("as_of_date_start", "2019-12-27")
                    .put("direction", "credit")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("status", "completed")
                    .put("type", "ach")
                    .put("virtual_account_id", "virtual_account_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IncomingPaymentDetailListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
