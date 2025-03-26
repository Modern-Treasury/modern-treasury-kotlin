// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReturnListParamsTest {

    @Test
    fun create() {
        ReturnListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .internalAccountId("internal_account_id")
            .perPage(0L)
            .returnableId("returnable_id")
            .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReturnListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .internalAccountId("internal_account_id")
                .perPage(0L)
                .returnableId("returnable_id")
                .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("counterparty_id", "counterparty_id")
                    .put("internal_account_id", "internal_account_id")
                    .put("per_page", "0")
                    .put("returnable_id", "returnable_id")
                    .put("returnable_type", "incoming_payment_detail")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReturnListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
