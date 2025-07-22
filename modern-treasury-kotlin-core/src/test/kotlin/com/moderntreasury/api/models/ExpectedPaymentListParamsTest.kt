// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentListParamsTest {

    @Test
    fun create() {
        ExpectedPaymentListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .direction(TransactionDirection.CREDIT)
            .externalId("external_id")
            .internalAccountId("internal_account_id")
            .metadata(
                ExpectedPaymentListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .status(ExpectedPaymentListParams.Status.ARCHIVED)
            .type(ExpectedPaymentListParams.Type.ACH)
            .updatedAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExpectedPaymentListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .externalId("external_id")
                .internalAccountId("internal_account_id")
                .metadata(
                    ExpectedPaymentListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .status(ExpectedPaymentListParams.Status.ARCHIVED)
                .type(ExpectedPaymentListParams.Type.ACH)
                .updatedAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("counterparty_id", "counterparty_id")
                    .put("created_at_lower_bound", "2019-12-27T18:11:19.117Z")
                    .put("created_at_upper_bound", "2019-12-27T18:11:19.117Z")
                    .put("direction", "credit")
                    .put("external_id", "external_id")
                    .put("internal_account_id", "internal_account_id")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("status", "archived")
                    .put("type", "ach")
                    .put("updated_at_lower_bound", "2019-12-27T18:11:19.117Z")
                    .put("updated_at_upper_bound", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExpectedPaymentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
