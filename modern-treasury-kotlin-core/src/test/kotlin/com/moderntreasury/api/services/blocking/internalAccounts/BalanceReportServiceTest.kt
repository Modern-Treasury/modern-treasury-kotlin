package com.moderntreasury.api.services.blocking.internalAccounts

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.BalanceReportListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BalanceReportServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val balanceReportService = client.internalAccounts().balanceReports()
        val balanceReport =
            balanceReportService.retrieve(
                BalanceReportRetrieveParams.builder()
                    .internalAccountId("string")
                    .id("string")
                    .build()
            )
        println(balanceReport)
        balanceReport.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val balanceReportService = client.internalAccounts().balanceReports()
        val response =
            balanceReportService.list(
                BalanceReportListParams.builder().internalAccountId("string").build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }
}
