// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceUpdateParamsTest {

    @Test
    fun createInvoiceUpdateParams() {
        InvoiceUpdateParams.builder()
            .id("string")
            .contactDetails(
                listOf(
                    InvoiceUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("string")
                        .contactIdentifierType(
                            InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
            .counterpartyBillingAddress(
                InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .counterpartyId("string")
            .counterpartyShippingAddress(
                InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .currency(Currency.AED)
            .description("string")
            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoicerAddress(
                InvoiceUpdateParams.InvoicerAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .notificationEmailAddresses(listOf("string"))
            .notificationsEnabled(true)
            .originatingAccountId("string")
            .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
            .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
            .paymentType(PaymentOrderType.ACH)
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .recipientEmail("string")
            .recipientName("string")
            .status("string")
            .virtualAccountId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceUpdateParams.builder()
                .id("string")
                .contactDetails(
                    listOf(
                        InvoiceUpdateParams.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("string")
                            .contactIdentifierType(
                                InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .counterpartyBillingAddress(
                    InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .counterpartyId("string")
                .counterpartyShippingAddress(
                    InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .currency(Currency.AED)
                .description("string")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoicerAddress(
                    InvoiceUpdateParams.InvoicerAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .notificationEmailAddresses(listOf("string"))
                .notificationsEnabled(true)
                .originatingAccountId("string")
                .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
                .paymentType(PaymentOrderType.ACH)
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recipientEmail("string")
                .recipientName("string")
                .status("string")
                .virtualAccountId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contactDetails())
            .isEqualTo(
                listOf(
                    InvoiceUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("string")
                        .contactIdentifierType(
                            InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.counterpartyBillingAddress())
            .isEqualTo(
                InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.counterpartyId()).isEqualTo("string")
        assertThat(body.counterpartyShippingAddress())
            .isEqualTo(
                InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.invoicerAddress())
            .isEqualTo(
                InvoiceUpdateParams.InvoicerAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.notificationEmailAddresses()).isEqualTo(listOf("string"))
        assertThat(body.notificationsEnabled()).isEqualTo(true)
        assertThat(body.originatingAccountId()).isEqualTo("string")
        assertThat(body.paymentEffectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.paymentMethod()).isEqualTo(InvoiceUpdateParams.PaymentMethod.UI)
        assertThat(body.paymentType()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.recipientEmail()).isEqualTo("string")
        assertThat(body.recipientName()).isEqualTo("string")
        assertThat(body.status()).isEqualTo("string")
        assertThat(body.virtualAccountId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InvoiceUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
