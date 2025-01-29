// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionListParamsTest {

    @Test
    fun createTransactionListParams() {
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
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("as_of_date_end", "2019-12-27")
        expected.put("as_of_date_start", "2019-12-27")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("description", "description")
        expected.put("direction", "direction")
        expected.put("internal_account_id", "internal_account_id")
        TransactionListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("payment_type", "payment_type")
        expected.put("per_page", "0")
        expected.put("posted", "true")
        expected.put("transactable_type", "transactable_type")
        expected.put("vendor_id", "vendor_id")
        expected.put("virtual_account_id", "virtual_account_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
