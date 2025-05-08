// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountBalanceMonitorServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorServiceAsync.create(
                LedgerAccountBalanceMonitorCreateParams.builder()
                    .alertCondition(
                        LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest
                            .builder()
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
            )

        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor = ledgerAccountBalanceMonitorServiceAsync.retrieve("id")

        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorServiceAsync.update(
                LedgerAccountBalanceMonitorUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountBalanceMonitorUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val page = ledgerAccountBalanceMonitorServiceAsync.list()

        page.items().forEach { it.validate() }
    }

    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor = ledgerAccountBalanceMonitorServiceAsync.delete("id")

        ledgerAccountBalanceMonitor.validate()
    }
}
