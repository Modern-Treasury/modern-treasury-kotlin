// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountListParamsTest {

    @Test
    fun create() {
        InternalAccountListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .currency(Currency.AED)
            .externalId("external_id")
            .legalEntityId("legal_entity_id")
            .metadata(
                InternalAccountListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .paymentDirection(TransactionDirection.CREDIT)
            .paymentType(InternalAccountListParams.PaymentType.ACH)
            .perPage(0L)
            .status(InternalAccountListParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InternalAccountListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .currency(Currency.AED)
                .externalId("external_id")
                .legalEntityId("legal_entity_id")
                .metadata(
                    InternalAccountListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .paymentDirection(TransactionDirection.CREDIT)
                .paymentType(InternalAccountListParams.PaymentType.ACH)
                .perPage(0L)
                .status(InternalAccountListParams.Status.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("counterparty_id", "counterparty_id")
                    .put("currency", "AED")
                    .put("external_id", "external_id")
                    .put("legal_entity_id", "legal_entity_id")
                    .put("metadata[foo]", "string")
                    .put("payment_direction", "credit")
                    .put("payment_type", "ach")
                    .put("per_page", "0")
                    .put("status", "active")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InternalAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
