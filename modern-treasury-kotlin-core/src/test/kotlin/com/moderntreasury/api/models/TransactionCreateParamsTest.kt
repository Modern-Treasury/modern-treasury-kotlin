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
            .transactionCreate(
                TransactionCreate.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .metadata(
                        TransactionCreate.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .posted(true)
                    .type(TransactionCreate.Type.ACH)
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
                .transactionCreate(
                    TransactionCreate.builder()
                        .amount(0L)
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .direction("direction")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .vendorCode("vendor_code")
                        .vendorCodeType("vendor_code_type")
                        .metadata(
                            TransactionCreate.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .posted(true)
                        .type(TransactionCreate.Type.ACH)
                        .vendorCustomerId("vendor_customer_id")
                        .vendorDescription("vendor_description")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TransactionCreate.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .metadata(
                        TransactionCreate.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .posted(true)
                    .type(TransactionCreate.Type.ACH)
                    .vendorCustomerId("vendor_customer_id")
                    .vendorDescription("vendor_description")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionCreateParams.builder()
                .transactionCreate(
                    TransactionCreate.builder()
                        .amount(0L)
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
                TransactionCreate.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .build()
            )
    }
}
