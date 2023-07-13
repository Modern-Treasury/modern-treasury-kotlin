package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomingPaymentDetailListParamsTest {

    @Test
    fun createIncomingPaymentDetailListParams() {
        IncomingPaymentDetailListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .direction(IncomingPaymentDetailListParams.Direction.CREDIT)
            .status(IncomingPaymentDetailListParams.Status.COMPLETED)
            .type(IncomingPaymentDetailListParams.Type.ACH)
            .asOfDateStart(LocalDate.parse("2019-12-27"))
            .asOfDateEnd(LocalDate.parse("2019-12-27"))
            .metadata(IncomingPaymentDetailListParams.Metadata.builder().build())
            .virtualAccountId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            IncomingPaymentDetailListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .direction(IncomingPaymentDetailListParams.Direction.CREDIT)
                .status(IncomingPaymentDetailListParams.Status.COMPLETED)
                .type(IncomingPaymentDetailListParams.Type.ACH)
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .metadata(IncomingPaymentDetailListParams.Metadata.builder().build())
                .virtualAccountId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put(
            "direction",
            listOf(IncomingPaymentDetailListParams.Direction.CREDIT.toString())
        )
        expected.put("status", listOf(IncomingPaymentDetailListParams.Status.COMPLETED.toString()))
        expected.put("type", listOf(IncomingPaymentDetailListParams.Type.ACH.toString()))
        expected.put("as_of_date_start", listOf("2019-12-27"))
        expected.put("as_of_date_end", listOf("2019-12-27"))
        IncomingPaymentDetailListParams.Metadata.builder().build().forEachQueryParam { key, values
            ->
            expected.put("metadata[$key]", values)
        }
        expected.put("virtual_account_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = IncomingPaymentDetailListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
