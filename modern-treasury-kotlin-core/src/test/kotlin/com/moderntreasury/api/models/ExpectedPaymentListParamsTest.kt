package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentListParamsTest {

    @Test
    fun createExpectedPaymentListParams() {
        ExpectedPaymentListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .status(ExpectedPaymentListParams.Status.ARCHIVED)
            .internalAccountId("string")
            .direction(ExpectedPaymentListParams.Direction.CREDIT)
            .type(ExpectedPaymentListParams.Type.ACH)
            .counterpartyId("string")
            .metadata(ExpectedPaymentListParams.Metadata.builder().build())
            .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExpectedPaymentListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .status(ExpectedPaymentListParams.Status.ARCHIVED)
                .internalAccountId("string")
                .direction(ExpectedPaymentListParams.Direction.CREDIT)
                .type(ExpectedPaymentListParams.Type.ACH)
                .counterpartyId("string")
                .metadata(ExpectedPaymentListParams.Metadata.builder().build())
                .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("status", listOf(ExpectedPaymentListParams.Status.ARCHIVED.toString()))
        expected.put("internal_account_id", listOf("string"))
        expected.put("direction", listOf(ExpectedPaymentListParams.Direction.CREDIT.toString()))
        expected.put("type", listOf(ExpectedPaymentListParams.Type.ACH.toString()))
        expected.put("counterparty_id", listOf("string"))
        ExpectedPaymentListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("created_at_lower_bound", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at_upper_bound", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ExpectedPaymentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
