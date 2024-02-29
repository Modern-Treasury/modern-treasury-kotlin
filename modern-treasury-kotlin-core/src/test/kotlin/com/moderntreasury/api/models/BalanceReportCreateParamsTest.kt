// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceReportCreateParamsTest {

    @Test
    fun createBalanceReportCreateParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.asOfTime()).isEqualTo("string")
        assertThat(body.balanceReportType())
            .isEqualTo(BalanceReportCreateParams.BalanceReportType.INTRADAY)
        assertThat(body.balances())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
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
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.asOfTime()).isEqualTo("string")
        assertThat(body.balanceReportType())
            .isEqualTo(BalanceReportCreateParams.BalanceReportType.INTRADAY)
        assertThat(body.balances())
            .isEqualTo(
                listOf(
                    BalanceReportCreateParams.BalanceCreateRequest.builder()
                        .amount(123L)
                        .balanceType(
                            BalanceReportCreateParams.BalanceCreateRequest.BalanceType
                                .CLOSING_AVAILABLE
                        )
                        .vendorCode("string")
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
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
                            .build()
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "internalAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
