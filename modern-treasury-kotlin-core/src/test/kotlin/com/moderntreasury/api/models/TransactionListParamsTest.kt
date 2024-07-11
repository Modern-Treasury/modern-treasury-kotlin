// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
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
            .metadata(TransactionListParams.Metadata.builder().build())
            .paymentType("payment_type")
            .perPage(123L)
            .posted(true)
            .transactableType("transactable_type")
            .vendorId("vendor_id")
            .virtualAccountId("virtual_account_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionListParams.builder()
                .afterCursor("after_cursor")
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .counterpartyId("counterparty_id")
                .description("description")
                .direction("direction")
                .internalAccountId("internal_account_id")
                .metadata(TransactionListParams.Metadata.builder().build())
                .paymentType("payment_type")
                .perPage(123L)
                .posted(true)
                .transactableType("transactable_type")
                .vendorId("vendor_id")
                .virtualAccountId("virtual_account_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("as_of_date_end", listOf("2019-12-27"))
        expected.put("as_of_date_start", listOf("2019-12-27"))
        expected.put("counterparty_id", listOf("counterparty_id"))
        expected.put("description", listOf("description"))
        expected.put("direction", listOf("direction"))
        expected.put("internal_account_id", listOf("internal_account_id"))
        TransactionListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("payment_type", listOf("payment_type"))
        expected.put("per_page", listOf("123"))
        expected.put("posted", listOf("true"))
        expected.put("transactable_type", listOf("transactable_type"))
        expected.put("vendor_id", listOf("vendor_id"))
        expected.put("virtual_account_id", listOf("virtual_account_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
