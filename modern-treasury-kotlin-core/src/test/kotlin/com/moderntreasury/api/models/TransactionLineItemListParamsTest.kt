// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLineItemListParamsTest {

    @Test
    fun create() {
        TransactionLineItemListParams.builder()
            .id(
                TransactionLineItemListParams.Id.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .afterCursor("after_cursor")
            .perPage(0L)
            .transactionId("transaction_id")
            .type(TransactionLineItemListParams.Type.ORIGINATING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransactionLineItemListParams.builder()
                .id(
                    TransactionLineItemListParams.Id.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .afterCursor("after_cursor")
                .perPage(0L)
                .transactionId("transaction_id")
                .type(TransactionLineItemListParams.Type.ORIGINATING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id[foo]", "string")
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .put("transaction_id", "transaction_id")
                    .put("type", "originating")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionLineItemListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
