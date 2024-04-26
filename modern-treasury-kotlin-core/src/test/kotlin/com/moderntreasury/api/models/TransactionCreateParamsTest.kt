// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionCreateParamsTest {

    @Test
    fun createTransactionCreateParams() {
        TransactionCreateParams.builder()
            .amount(123L)
            .asOfDate(LocalDate.parse("2019-12-27"))
            .direction("string")
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .vendorCode("string")
            .vendorCodeType("string")
            .metadata(TransactionCreateParams.Metadata.builder().build())
            .posted(true)
            .type(TransactionCreateParams.Type.ACH)
            .vendorDescription("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionCreateParams.builder()
                .amount(123L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("string")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("string")
                .vendorCodeType("string")
                .metadata(TransactionCreateParams.Metadata.builder().build())
                .posted(true)
                .type(TransactionCreateParams.Type.ACH)
                .vendorDescription("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.direction()).isEqualTo("string")
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.vendorCode()).isEqualTo("string")
        assertThat(body.vendorCodeType()).isEqualTo("string")
        assertThat(body.metadata()).isEqualTo(TransactionCreateParams.Metadata.builder().build())
        assertThat(body.posted()).isEqualTo(true)
        assertThat(body.type()).isEqualTo(TransactionCreateParams.Type.ACH)
        assertThat(body.vendorDescription()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionCreateParams.builder()
                .amount(123L)
                .direction("string")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo("string")
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
