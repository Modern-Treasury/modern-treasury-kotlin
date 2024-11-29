// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionLineItemListParamsTest {

    @Test
    fun createTransactionLineItemListParams() {
        TransactionLineItemListParams.builder()
            .id(TransactionLineItemListParams.Id.builder().build())
            .afterCursor("after_cursor")
            .perPage(0L)
            .transactionId("transaction_id")
            .type(TransactionLineItemListParams.Type.ORIGINATING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionLineItemListParams.builder()
                .id(TransactionLineItemListParams.Id.builder().build())
                .afterCursor("after_cursor")
                .perPage(0L)
                .transactionId("transaction_id")
                .type(TransactionLineItemListParams.Type.ORIGINATING)
                .build()
        val expected = QueryParams.builder()
        TransactionLineItemListParams.Id.builder().build().forEachQueryParam { key, values ->
            expected.put("id[$key]", values)
        }
        expected.put("after_cursor", "after_cursor")
        expected.put("per_page", "0")
        expected.put("transaction_id", "transaction_id")
        expected.put("type", TransactionLineItemListParams.Type.ORIGINATING.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionLineItemListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
