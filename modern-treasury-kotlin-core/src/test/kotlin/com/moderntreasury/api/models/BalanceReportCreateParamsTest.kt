// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceReportCreateParamsTest {

    @Test
    fun createBalanceReportCreateParams() {
        BalanceReportCreateParams.builder()
            .internalAccountId("internal_account_id")
            .asOfDate(LocalDate.parse("2019-12-27"))
            .asOfTime("as_of_time")
            .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
            .balances(
                listOf(
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
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BalanceReportCreateParams.builder()
                .internalAccountId("internal_account_id")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
                .balances(
                    listOf(
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
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.asOfTime()).isEqualTo("as_of_time")
        assertThat(body.balanceReportType())
            .isEqualTo(BalanceReportCreateParams.BalanceReportType.INTRADAY)
        assertThat(body.balances())
            .isEqualTo(
                listOf(
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
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            BalanceReportCreateParams.builder()
                .internalAccountId("internal_account_id")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
                .balances(
                    listOf(
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
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.asOfTime()).isEqualTo("as_of_time")
        assertThat(body.balanceReportType())
            .isEqualTo(BalanceReportCreateParams.BalanceReportType.INTRADAY)
        assertThat(body.balances())
            .isEqualTo(
                listOf(
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
            )
    }

    @Test
    fun getPathParam() {
        val params =
            BalanceReportCreateParams.builder()
                .internalAccountId("internal_account_id")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
                .balances(
                    listOf(
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
                )
                .build()
        assertThat(params).isNotNull
        // path param "internalAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("internal_account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
