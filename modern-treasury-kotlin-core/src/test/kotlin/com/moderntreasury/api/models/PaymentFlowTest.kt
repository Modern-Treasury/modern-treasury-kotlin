// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentFlowTest {

    @Test
    fun create() {
        val paymentFlow =
            PaymentFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .clientToken("client_token")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .direction(PaymentFlow.Direction.CREDIT)
                .dueDate(LocalDate.parse("2019-12-27"))
                .effectiveDateSelectionEnabled(true)
                .existingExternalAccountsFilter(PaymentFlow.ExistingExternalAccountsFilter.VERIFIED)
                .externalAccountCollection(PaymentFlow.ExternalAccountCollection.DISABLED)
                .liveMode(true)
                .object_("object")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .selectedEffectiveDate(LocalDate.parse("2019-12-27"))
                .status(PaymentFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(paymentFlow.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.amount()).isEqualTo(0L)
        assertThat(paymentFlow.clientToken()).isEqualTo("client_token")
        assertThat(paymentFlow.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentFlow.currency()).isEqualTo("currency")
        assertThat(paymentFlow.direction()).isEqualTo(PaymentFlow.Direction.CREDIT)
        assertThat(paymentFlow.dueDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentFlow.effectiveDateSelectionEnabled()).isEqualTo(true)
        assertThat(paymentFlow.existingExternalAccountsFilter())
            .isEqualTo(PaymentFlow.ExistingExternalAccountsFilter.VERIFIED)
        assertThat(paymentFlow.externalAccountCollection())
            .isEqualTo(PaymentFlow.ExternalAccountCollection.DISABLED)
        assertThat(paymentFlow.liveMode()).isEqualTo(true)
        assertThat(paymentFlow.object_()).isEqualTo("object")
        assertThat(paymentFlow.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.paymentOrderId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.receivingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.selectedEffectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentFlow.status()).isEqualTo(PaymentFlow.Status.CANCELLED)
        assertThat(paymentFlow.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentFlow =
            PaymentFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .clientToken("client_token")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .direction(PaymentFlow.Direction.CREDIT)
                .dueDate(LocalDate.parse("2019-12-27"))
                .effectiveDateSelectionEnabled(true)
                .existingExternalAccountsFilter(PaymentFlow.ExistingExternalAccountsFilter.VERIFIED)
                .externalAccountCollection(PaymentFlow.ExternalAccountCollection.DISABLED)
                .liveMode(true)
                .object_("object")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .selectedEffectiveDate(LocalDate.parse("2019-12-27"))
                .status(PaymentFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPaymentFlow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentFlow),
                jacksonTypeRef<PaymentFlow>(),
            )

        assertThat(roundtrippedPaymentFlow).isEqualTo(paymentFlow)
    }
}
