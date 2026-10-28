// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionCreateRequestTest {

    @Test
    fun create() {
        val transactionCreateRequest =
            TransactionCreateRequest.builder()
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("direction")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("vendor_code")
                .vendorCodeType("vendor_code_type")
                .amount(0L)
                .amountString("amount_string")
                .metadata(
                    TransactionCreateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .posted(true)
                .type(TransactionCreateRequest.Type.ACH)
                .vendorCustomerId("vendor_customer_id")
                .vendorDescription("vendor_description")
                .build()

        assertThat(transactionCreateRequest.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(transactionCreateRequest.direction()).isEqualTo("direction")
        assertThat(transactionCreateRequest.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionCreateRequest.vendorCode()).isEqualTo("vendor_code")
        assertThat(transactionCreateRequest.vendorCodeType()).isEqualTo("vendor_code_type")
        assertThat(transactionCreateRequest.amount()).isEqualTo(0L)
        assertThat(transactionCreateRequest.amountString()).isEqualTo("amount_string")
        assertThat(transactionCreateRequest.metadata())
            .isEqualTo(
                TransactionCreateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(transactionCreateRequest.posted()).isEqualTo(true)
        assertThat(transactionCreateRequest.type()).isEqualTo(TransactionCreateRequest.Type.ACH)
        assertThat(transactionCreateRequest.vendorCustomerId()).isEqualTo("vendor_customer_id")
        assertThat(transactionCreateRequest.vendorDescription()).isEqualTo("vendor_description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionCreateRequest =
            TransactionCreateRequest.builder()
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("direction")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("vendor_code")
                .vendorCodeType("vendor_code_type")
                .amount(0L)
                .amountString("amount_string")
                .metadata(
                    TransactionCreateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .posted(true)
                .type(TransactionCreateRequest.Type.ACH)
                .vendorCustomerId("vendor_customer_id")
                .vendorDescription("vendor_description")
                .build()

        val roundtrippedTransactionCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionCreateRequest),
                jacksonTypeRef<TransactionCreateRequest>(),
            )

        assertThat(roundtrippedTransactionCreateRequest).isEqualTo(transactionCreateRequest)
    }
}
