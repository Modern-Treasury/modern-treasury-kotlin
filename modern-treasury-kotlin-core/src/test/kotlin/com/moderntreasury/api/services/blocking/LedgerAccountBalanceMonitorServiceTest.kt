// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountBalanceMonitorServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.create(
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
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.retrieve(
                LedgerAccountBalanceMonitorRetrieveParams.builder().id("id").build()
            )

        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.update(
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
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()

        val page = ledgerAccountBalanceMonitorService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.delete(
                LedgerAccountBalanceMonitorDeleteParams.builder().id("id").build()
            )

        ledgerAccountBalanceMonitor.validate()
    }
}
