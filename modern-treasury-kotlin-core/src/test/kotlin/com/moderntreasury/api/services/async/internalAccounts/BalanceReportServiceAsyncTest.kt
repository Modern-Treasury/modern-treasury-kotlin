// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.internalAccounts

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceReportServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val balanceReport =
            balanceReportServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val balanceReport =
            balanceReportServiceAsync.retrieve(
                BalanceReportRetrieveParams.builder()
                    .internalAccountId("internal_account_id")
                    .id("id")
                    .build()
            )

        balanceReport.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val page =
            balanceReportServiceAsync.list(
                BalanceReportListParams.builder().internalAccountId("internal_account_id").build()
            )

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
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        balanceReportServiceAsync.delete(
            BalanceReportDeleteParams.builder()
                .internalAccountId("internal_account_id")
                .id("id")
                .build()
        )
    }
}
