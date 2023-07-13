package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceReportTest {

    @Test
    fun createBalanceReport() {
        val balanceReport =
            BalanceReport.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .balanceReportType(BalanceReport.BalanceReportType.INTRADAY)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("string")
                .balances(
                    listOf(
                        BalanceReport.Balance.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(123L)
                            .currency(Currency.AED)
                            .balanceType(BalanceReport.Balance.BalanceType.CLOSING_AVAILABLE)
                            .vendorCode("string")
                            .vendorCodeType(BalanceReport.Balance.VendorCodeType.BAI2)
                            .build()
                    )
                )
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(balanceReport).isNotNull
        assertThat(balanceReport.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balanceReport.object_()).isEqualTo("string")
        assertThat(balanceReport.liveMode()).isEqualTo(true)
        assertThat(balanceReport.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceReport.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceReport.balanceReportType())
            .isEqualTo(BalanceReport.BalanceReportType.INTRADAY)
        assertThat(balanceReport.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(balanceReport.asOfTime()).isEqualTo("string")
        assertThat(balanceReport.balances())
            .containsExactly(
                BalanceReport.Balance.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .object_("string")
                    .liveMode(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amount(123L)
                    .currency(Currency.AED)
                    .balanceType(BalanceReport.Balance.BalanceType.CLOSING_AVAILABLE)
                    .vendorCode("string")
                    .vendorCodeType(BalanceReport.Balance.VendorCodeType.BAI2)
                    .build()
            )
        assertThat(balanceReport.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
