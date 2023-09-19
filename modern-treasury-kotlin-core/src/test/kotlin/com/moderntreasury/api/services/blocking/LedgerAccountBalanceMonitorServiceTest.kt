package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountBalanceMonitorServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()
        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.create(
                LedgerAccountBalanceMonitorCreateParams.builder()
                    .alertCondition(
                        LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest
                            .builder()
                            .field("string")
                            .operator("string")
                            .value(123L)
                            .build()
                    )
                    .ledgerAccountId("string")
                    .description("string")
                    .metadata(LedgerAccountBalanceMonitorCreateParams.Metadata.builder().build())
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()
        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.retrieve(
                LedgerAccountBalanceMonitorRetrieveParams.builder().id("string").build()
            )
        println(ledgerAccountBalanceMonitor)
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()
        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.update(
                LedgerAccountBalanceMonitorUpdateParams.builder()
                    .id("string")
                    .description("string")
                    .metadata(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
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
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorService = client.ledgerAccountBalanceMonitors()
        val ledgerAccountBalanceMonitor =
            ledgerAccountBalanceMonitorService.delete(
                LedgerAccountBalanceMonitorDeleteParams.builder().id("string").build()
            )
        println(ledgerAccountBalanceMonitor)
        ledgerAccountBalanceMonitor.validate()
    }
}
