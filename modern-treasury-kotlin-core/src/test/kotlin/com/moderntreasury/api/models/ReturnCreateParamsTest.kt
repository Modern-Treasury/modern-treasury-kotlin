// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReturnCreateParamsTest {

    @Test
    fun create() {
        ReturnCreateParams.builder()
            .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
            .additionalInformation("additional_information")
            .code(ReturnCreateParams.Code._901)
            .corrections(
                ReturnCreateParams.Corrections.builder()
                    .accountNumber("account_number")
                    .companyId("company_id")
                    .companyName("company_name")
                    .individualIdentificationNumber("individual_identification_number")
                    .routingNumber("routing_number")
                    .transactionCode("transaction_code")
                    .build()
            )
            .data(JsonValue.from(mapOf<String, Any>()))
            .dateOfDeath(LocalDate.parse("2019-12-27"))
            .reason("reason")
            .reconciliationStatus(ReturnCreateParams.ReconciliationStatus.RECONCILED)
            .build()
    }

    @Test
    fun body() {
        val params =
            ReturnCreateParams.builder()
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .additionalInformation("additional_information")
                .code(ReturnCreateParams.Code._901)
                .corrections(
                    ReturnCreateParams.Corrections.builder()
                        .accountNumber("account_number")
                        .companyId("company_id")
                        .companyName("company_name")
                        .individualIdentificationNumber("individual_identification_number")
                        .routingNumber("routing_number")
                        .transactionCode("transaction_code")
                        .build()
                )
                .data(JsonValue.from(mapOf<String, Any>()))
                .dateOfDeath(LocalDate.parse("2019-12-27"))
                .reason("reason")
                .reconciliationStatus(ReturnCreateParams.ReconciliationStatus.RECONCILED)
                .build()

        val body = params._body()

        assertThat(body.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnableType())
            .isEqualTo(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
        assertThat(body.additionalInformation()).isEqualTo("additional_information")
        assertThat(body.code()).isEqualTo(ReturnCreateParams.Code._901)
        assertThat(body.corrections())
            .isEqualTo(
                ReturnCreateParams.Corrections.builder()
                    .accountNumber("account_number")
                    .companyId("company_id")
                    .companyName("company_name")
                    .individualIdentificationNumber("individual_identification_number")
                    .routingNumber("routing_number")
                    .transactionCode("transaction_code")
                    .build()
            )
        assertThat(body._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.dateOfDeath()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.reconciliationStatus())
            .isEqualTo(ReturnCreateParams.ReconciliationStatus.RECONCILED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReturnCreateParams.builder()
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()

        val body = params._body()

        assertThat(body.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnableType())
            .isEqualTo(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
    }
}
