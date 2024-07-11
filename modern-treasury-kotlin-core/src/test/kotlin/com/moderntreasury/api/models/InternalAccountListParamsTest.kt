// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountListParamsTest {

    @Test
    fun createInternalAccountListParams() {
        InternalAccountListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .currency(Currency.AED)
            .legalEntityId("legal_entity_id")
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
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .currency(Currency.AED)
                .legalEntityId("legal_entity_id")
                .metadata(InternalAccountListParams.Metadata.builder().build())
                .paymentDirection(TransactionDirection.CREDIT)
                .paymentType(InternalAccountListParams.PaymentType.ACH)
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("counterparty_id", listOf("counterparty_id"))
        expected.put("currency", listOf(Currency.AED.toString()))
        expected.put("legal_entity_id", listOf("legal_entity_id"))
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
