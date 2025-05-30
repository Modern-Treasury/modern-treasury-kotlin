// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountBalanceMonitorCreateParamsTest {

    @Test
    fun create() {
        LedgerAccountBalanceMonitorCreateParams.builder()
            .alertCondition(
                LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                    .field("field")
                    .operator("operator")
                    .value(0L)
                    .build()
            )
            .ledgerAccountId("ledger_account_id")
            .description("description")
            .metadata(
                LedgerAccountBalanceMonitorCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerAccountBalanceMonitorCreateParams.builder()
                .alertCondition(
                    LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                        .field("field")
                        .operator("operator")
                        .value(0L)
                        .build()
                )
                .ledgerAccountId("ledger_account_id")
                .description("description")
                .metadata(
                    LedgerAccountBalanceMonitorCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.alertCondition())
            .isEqualTo(
                LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                    .field("field")
                    .operator("operator")
                    .value(0L)
                    .build()
            )
        assertThat(body.ledgerAccountId()).isEqualTo("ledger_account_id")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(
                LedgerAccountBalanceMonitorCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerAccountBalanceMonitorCreateParams.builder()
                .alertCondition(
                    LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                        .field("field")
                        .operator("operator")
                        .value(0L)
                        .build()
                )
                .ledgerAccountId("ledger_account_id")
                .build()

        val body = params._body()

        assertThat(body.alertCondition())
            .isEqualTo(
                LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                    .field("field")
                    .operator("operator")
                    .value(0L)
                    .build()
            )
        assertThat(body.ledgerAccountId()).isEqualTo("ledger_account_id")
    }
}
