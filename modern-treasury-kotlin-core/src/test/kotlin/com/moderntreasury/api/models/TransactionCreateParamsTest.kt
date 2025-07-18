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
            .amount(0L)
            .asOfDate(LocalDate.parse("2019-12-27"))
            .direction("direction")
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .vendorCode("vendor_code")
            .vendorCodeType("vendor_code_type")
            .metadata(
                TransactionCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .posted(true)
            .type(TransactionCreateParams.Type.ACH)
            .vendorCustomerId("vendor_customer_id")
            .vendorDescription("vendor_description")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionCreateParams.builder()
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("direction")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("vendor_code")
                .vendorCodeType("vendor_code_type")
                .metadata(
                    TransactionCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .posted(true)
                .type(TransactionCreateParams.Type.ACH)
                .vendorCustomerId("vendor_customer_id")
                .vendorDescription("vendor_description")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.direction()).isEqualTo("direction")
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.vendorCode()).isEqualTo("vendor_code")
        assertThat(body.vendorCodeType()).isEqualTo("vendor_code_type")
        assertThat(body.metadata())
            .isEqualTo(
                TransactionCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.posted()).isEqualTo(true)
        assertThat(body.type()).isEqualTo(TransactionCreateParams.Type.ACH)
        assertThat(body.vendorCustomerId()).isEqualTo("vendor_customer_id")
        assertThat(body.vendorDescription()).isEqualTo("vendor_description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionCreateParams.builder()
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("direction")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("vendor_code")
                .vendorCodeType("vendor_code_type")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.direction()).isEqualTo("direction")
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.vendorCode()).isEqualTo("vendor_code")
        assertThat(body.vendorCodeType()).isEqualTo("vendor_code_type")
    }
}
