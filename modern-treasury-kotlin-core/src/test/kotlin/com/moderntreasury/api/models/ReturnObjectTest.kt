// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReturnObjectTest {

    @Test
    fun createReturnObject() {
        val returnObject =
            ReturnObject.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .code(ReturnObject.Code._901)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .dateOfDeath(LocalDate.parse("2019-12-27"))
                .failureReason("failure_reason")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .reason("reason")
                .referenceNumbers(
                    listOf(
                        ReturnObject.PaymentReference.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .referenceNumber("reference_number")
                            .referenceNumberType(
                                ReturnObject.PaymentReference.ReferenceNumberType
                                    .ACH_ORIGINAL_TRACE_NUMBER
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .role(ReturnObject.Role.ORIGINATING)
                .status(ReturnObject.Status.COMPLETED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ReturnObject.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .additionalInformation("additional_information")
                .build()
        assertThat(returnObject).isNotNull
        assertThat(returnObject.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.amount()).isEqualTo(0L)
        assertThat(returnObject.code()).isEqualTo(ReturnObject.Code._901)
        assertThat(returnObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.currency()).isEqualTo(Currency.AED)
        assertThat(returnObject.dateOfDeath()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(returnObject.failureReason()).isEqualTo("failure_reason")
        assertThat(returnObject.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.liveMode()).isEqualTo(true)
        assertThat(returnObject.object_()).isEqualTo("object")
        assertThat(returnObject.reason()).isEqualTo("reason")
        assertThat(returnObject.referenceNumbers())
            .containsExactly(
                ReturnObject.PaymentReference.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .referenceNumber("reference_number")
                    .referenceNumberType(
                        ReturnObject.PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(returnObject.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.returnableType())
            .isEqualTo(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
        assertThat(returnObject.role()).isEqualTo(ReturnObject.Role.ORIGINATING)
        assertThat(returnObject.status()).isEqualTo(ReturnObject.Status.COMPLETED)
        assertThat(returnObject.transactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.transactionLineItemId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.type()).isEqualTo(ReturnObject.Type.ACH)
        assertThat(returnObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.additionalInformation()).isEqualTo("additional_information")
    }
}
