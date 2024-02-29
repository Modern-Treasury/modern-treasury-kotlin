// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.internalAccounts

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.BalanceReportListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BalanceReportServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportService = client.internalAccounts().balanceReports()
        val balanceReport =
            balanceReportService.create(
                BalanceReportCreateParams.builder()
                    .internalAccountId("string")
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .asOfTime("string")
                    .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
                    .balances(
                        listOf(
                            BalanceReportCreateParams.BalanceCreateRequest.builder()
                                .amount(123L)
                                .balanceType(
                                    BalanceReportCreateParams.BalanceCreateRequest.BalanceType
                                        .CLOSING_AVAILABLE
                                )
                                .vendorCode("string")
                                .vendorCodeType("string")
                                .build()
                        )
                    )
                    .build()
            )
        println(balanceReport)
        balanceReport.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportService = client.internalAccounts().balanceReports()
        val response =
            balanceReportService.list(
                BalanceReportListParams.builder().internalAccountId("string").build()
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
        val balanceReportService = client.internalAccounts().balanceReports()
        balanceReportService.delete(
            BalanceReportDeleteParams.builder().internalAccountId("string").id("string").build()
        )
    }
}
