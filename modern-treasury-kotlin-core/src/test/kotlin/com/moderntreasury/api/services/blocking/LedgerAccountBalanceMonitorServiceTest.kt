// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountBalanceMonitorServiceTest {

    @Test
    fun callCreate() {
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
        println(ledgerAccountBalanceMonitor)
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun callRetrieve() {
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
        println(ledgerAccountBalanceMonitor)
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun callUpdate() {
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
        println(ledgerAccountBalanceMonitor)
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()
        val response =
            ledgerAccountBalanceMonitorService.list(
                LedgerAccountBalanceMonitorListParams.builder().build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
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
        println(ledgerAccountBalanceMonitor)
        ledgerAccountBalanceMonitor.validate()
    }
}
