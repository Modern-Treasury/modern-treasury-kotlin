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
internal class BalanceReportServiceTest {

    @Test
    fun create() {
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

        balanceReport.validate()
    }

    @Test
    fun retrieve() {
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

        balanceReport.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportService = client.internalAccounts().balanceReports()

        val page =
            balanceReportService.list(
                BalanceReportListParams.builder().internalAccountId("internal_account_id").build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
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
