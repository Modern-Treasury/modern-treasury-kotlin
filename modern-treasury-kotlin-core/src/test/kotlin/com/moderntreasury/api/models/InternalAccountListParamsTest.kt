package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountListParamsTest {

    @Test
    fun createInternalAccountListParams() {
        InternalAccountListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .currency(Currency.AED)
            .counterpartyId("string")
            .paymentType(InternalAccountListParams.PaymentType.ACH)
            .paymentDirection(InternalAccountListParams.PaymentDirection.CREDIT)
            .metadata(InternalAccountListParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InternalAccountListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .currency(Currency.AED)
                .counterpartyId("string")
                .paymentType(InternalAccountListParams.PaymentType.ACH)
                .paymentDirection(InternalAccountListParams.PaymentDirection.CREDIT)
                .metadata(InternalAccountListParams.Metadata.builder().build())
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("currency", listOf(Currency.AED.toString()))
        expected.put("counterparty_id", listOf("string"))
        expected.put("payment_type", listOf(InternalAccountListParams.PaymentType.ACH.toString()))
        expected.put(
            "payment_direction",
            listOf(InternalAccountListParams.PaymentDirection.CREDIT.toString())
        )
        InternalAccountListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InternalAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
