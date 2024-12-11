// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorCreateParamsTest {

    @Test
    fun createLedgerAccountBalanceMonitorCreateParams() {
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
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
    fun getBodyWithoutOptionalFields() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
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
