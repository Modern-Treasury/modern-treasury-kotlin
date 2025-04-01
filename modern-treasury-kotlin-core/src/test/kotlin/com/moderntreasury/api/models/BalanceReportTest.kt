// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceReportTest {

    @Test
    fun create() {
        val balanceReport =
            BalanceReport.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .balanceReportType(BalanceReport.BalanceReportType.INTRADAY)
                .addBalance(
                    BalanceReport.Balance.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .asOfTime("as_of_time")
                        .balanceType(BalanceReport.Balance.BalanceType.CLOSING_AVAILABLE)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .valueDate(LocalDate.parse("2019-12-27"))
                        .vendorCode("vendor_code")
                        .vendorCodeType("vendor_code_type")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(balanceReport.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceReport.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(balanceReport.asOfTime()).isEqualTo("as_of_time")
        assertThat(balanceReport.balanceReportType())
            .isEqualTo(BalanceReport.BalanceReportType.INTRADAY)
        assertThat(balanceReport.balances())
            .containsExactly(
                BalanceReport.Balance.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .asOfTime("as_of_time")
                    .balanceType(BalanceReport.Balance.BalanceType.CLOSING_AVAILABLE)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .valueDate(LocalDate.parse("2019-12-27"))
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .build()
            )
        assertThat(balanceReport.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceReport.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceReport.liveMode()).isEqualTo(true)
        assertThat(balanceReport.object_()).isEqualTo("object")
        assertThat(balanceReport.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceReport =
            BalanceReport.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .balanceReportType(BalanceReport.BalanceReportType.INTRADAY)
                .addBalance(
                    BalanceReport.Balance.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .asOfTime("as_of_time")
                        .balanceType(BalanceReport.Balance.BalanceType.CLOSING_AVAILABLE)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .valueDate(LocalDate.parse("2019-12-27"))
                        .vendorCode("vendor_code")
                        .vendorCodeType("vendor_code_type")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBalanceReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceReport),
                jacksonTypeRef<BalanceReport>(),
            )

        assertThat(roundtrippedBalanceReport).isEqualTo(balanceReport)
    }
}
