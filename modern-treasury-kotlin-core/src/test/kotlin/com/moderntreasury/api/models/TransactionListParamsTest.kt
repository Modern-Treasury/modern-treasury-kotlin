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
            .afterCursor("string")
            .asOfDateEnd(LocalDate.parse("2019-12-27"))
            .asOfDateStart(LocalDate.parse("2019-12-27"))
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .direction("string")
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(TransactionListParams.Metadata.builder().build())
            .paymentType("string")
            .perPage(123L)
            .posted(true)
            .transactableType("string")
            .vendorId("string")
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionListParams.builder()
                .afterCursor("string")
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .direction("string")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(TransactionListParams.Metadata.builder().build())
                .paymentType("string")
                .perPage(123L)
                .posted(true)
                .transactableType("string")
                .vendorId("string")
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("as_of_date_end", listOf("2019-12-27"))
        expected.put("as_of_date_start", listOf("2019-12-27"))
        expected.put("counterparty_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("description", listOf("string"))
        expected.put("direction", listOf("string"))
        expected.put("internal_account_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        TransactionListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("payment_type", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("posted", listOf("true"))
        expected.put("transactable_type", listOf("string"))
        expected.put("vendor_id", listOf("string"))
        expected.put("virtual_account_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
