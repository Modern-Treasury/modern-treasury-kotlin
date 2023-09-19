package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionLineItemListParamsTest {

    @Test
    fun createTransactionLineItemListParams() {
        TransactionLineItemListParams.builder()
            .afterCursor("string")
            .id(TransactionLineItemListParams.Id.builder().build())
            .type(TransactionLineItemListParams.Type.ORIGINATING)
            .perPage(123L)
            .transactionId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionLineItemListParams.builder()
                .afterCursor("string")
                .id(TransactionLineItemListParams.Id.builder().build())
                .type(TransactionLineItemListParams.Type.ORIGINATING)
                .perPage(123L)
                .transactionId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        TransactionLineItemListParams.Id.builder().build().forEachQueryParam { key, values ->
            expected.put("id[$key]", values)
        }
        expected.put("type", listOf(TransactionLineItemListParams.Type.ORIGINATING.toString()))
        expected.put("per_page", listOf("123"))
        expected.put("transaction_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionLineItemListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
