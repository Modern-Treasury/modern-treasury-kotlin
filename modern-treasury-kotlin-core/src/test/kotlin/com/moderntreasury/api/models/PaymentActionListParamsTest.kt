// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionListParamsTest {

    @Test
    fun create() {
        PaymentActionListParams.builder()
            .actionableId("actionable_id")
            .actionableType("actionable_type")
            .afterCursor("after_cursor")
            .createdAt(
                PaymentActionListParams.CreatedAt.builder()
                    .eq(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .internalAccountId("internal_account_id")
            .metadata(
                PaymentActionListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .status(PaymentActionListParams.Status.PENDING)
            .type(PaymentActionListParams.Type.EVOLVE_NON_PROCESSING_TRANSACTION)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaymentActionListParams.builder()
                .actionableId("actionable_id")
                .actionableType("actionable_type")
                .afterCursor("after_cursor")
                .createdAt(
                    PaymentActionListParams.CreatedAt.builder()
                        .eq(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .internalAccountId("internal_account_id")
                .metadata(
                    PaymentActionListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .status(PaymentActionListParams.Status.PENDING)
                .type(PaymentActionListParams.Type.EVOLVE_NON_PROCESSING_TRANSACTION)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("actionable_id", "actionable_id")
                    .put("actionable_type", "actionable_type")
                    .put("after_cursor", "after_cursor")
                    .put("created_at[eq]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[gt]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[gte]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[lt]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[lte]", "2019-12-27T18:11:19.117Z")
                    .put("internal_account_id", "internal_account_id")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("status", "pending")
                    .put("type", "evolve_non_processing_transaction")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentActionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
