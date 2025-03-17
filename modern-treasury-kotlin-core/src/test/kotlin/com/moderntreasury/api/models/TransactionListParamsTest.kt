// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListParamsTest {

    @Test
    fun create() {
        TransactionListParams.builder()
            .afterCursor("after_cursor")
            .asOfDateEnd(LocalDate.parse("2019-12-27"))
            .asOfDateStart(LocalDate.parse("2019-12-27"))
            .counterpartyId("counterparty_id")
            .description("description")
            .direction("direction")
            .internalAccountId("internal_account_id")
            .metadata(
                TransactionListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .paymentType("payment_type")
            .perPage(0L)
            .posted(true)
            .transactableType("transactable_type")
            .vendorId("vendor_id")
            .virtualAccountId("virtual_account_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransactionListParams.builder()
                .afterCursor("after_cursor")
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .counterpartyId("counterparty_id")
                .description("description")
                .direction("direction")
                .internalAccountId("internal_account_id")
                .metadata(
                    TransactionListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .paymentType("payment_type")
                .perPage(0L)
                .posted(true)
                .transactableType("transactable_type")
                .vendorId("vendor_id")
                .virtualAccountId("virtual_account_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("as_of_date_end", "2019-12-27")
                    .put("as_of_date_start", "2019-12-27")
                    .put("counterparty_id", "counterparty_id")
                    .put("description", "description")
                    .put("direction", "direction")
                    .put("internal_account_id", "internal_account_id")
                    .put("metadata[foo]", "string")
                    .put("payment_type", "payment_type")
                    .put("per_page", "0")
                    .put("posted", "true")
                    .put("transactable_type", "transactable_type")
                    .put("vendor_id", "vendor_id")
                    .put("virtual_account_id", "virtual_account_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
