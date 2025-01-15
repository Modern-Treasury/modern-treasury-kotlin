// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.internalAccounts

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams
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
                    .internalAccountId("internal_account_id")
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .asOfTime("as_of_time")
                    .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
                    .addBalance(
                        BalanceReportCreateParams.BalanceCreateRequest.builder()
                            .amount(0L)
                            .balanceType(
                                BalanceReportCreateParams.BalanceCreateRequest.BalanceType
                                    .CLOSING_AVAILABLE
                            )
                            .vendorCode("vendor_code")
                            .vendorCodeType("vendor_code_type")
                            .build()
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
                    .internalAccountId("internal_account_id")
                    .id("id")
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
                BalanceReportListParams.builder().internalAccountId("internal_account_id").build()
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
            BalanceReportDeleteParams.builder()
                .internalAccountId("internal_account_id")
                .id("id")
                .build()
        )
    }
}
