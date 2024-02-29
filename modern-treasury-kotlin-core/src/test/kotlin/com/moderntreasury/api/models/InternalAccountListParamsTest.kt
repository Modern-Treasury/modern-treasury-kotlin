// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountListParamsTest {

    @Test
    fun createInternalAccountListParams() {
        InternalAccountListParams.builder()
            .afterCursor("string")
            .counterpartyId("string")
            .currency(Currency.AED)
            .legalEntityId("string")
            .metadata(InternalAccountListParams.Metadata.builder().build())
            .paymentDirection(TransactionDirection.CREDIT)
            .paymentType(InternalAccountListParams.PaymentType.ACH)
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InternalAccountListParams.builder()
                .afterCursor("string")
                .counterpartyId("string")
                .currency(Currency.AED)
                .legalEntityId("string")
                .metadata(InternalAccountListParams.Metadata.builder().build())
                .paymentDirection(TransactionDirection.CREDIT)
                .paymentType(InternalAccountListParams.PaymentType.ACH)
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("currency", listOf(Currency.AED.toString()))
        expected.put("legal_entity_id", listOf("string"))
        InternalAccountListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("payment_direction", listOf(TransactionDirection.CREDIT.toString()))
        expected.put("payment_type", listOf(InternalAccountListParams.PaymentType.ACH.toString()))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InternalAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
