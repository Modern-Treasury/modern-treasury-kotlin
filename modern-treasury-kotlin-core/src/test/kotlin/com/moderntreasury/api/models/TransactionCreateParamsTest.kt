// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionCreateParamsTest {

    @Test
    fun create() {
        TransactionCreateParams.builder()
            .transactionCreateRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionCreateParams.builder()
                .transactionCreateRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionCreateParams.builder()
                .transactionCreateRequest(
                    TransactionCreateRequest.builder()
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .direction("direction")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .vendorCode("vendor_code")
                        .vendorCodeType("vendor_code_type")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TransactionCreateRequest.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .build()
            )
    }
}
