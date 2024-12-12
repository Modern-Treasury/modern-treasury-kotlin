// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceUpdateParamsTest {

    @Test
    fun createInvoiceUpdateParams() {
        InvoiceUpdateParams.builder()
            .id("id")
            .contactDetails(
                listOf(
                    InvoiceUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
            .counterpartyBillingAddress(
                InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .counterpartyId("counterparty_id")
            .counterpartyShippingAddress(
                InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .currency(Currency.AED)
            .description("description")
            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fallbackPaymentMethod("fallback_payment_method")
            .ingestLedgerEntries(true)
            .invoiceLineItems(
                listOf(
                    InvoiceUpdateParams.InvoiceLineItemCreateRequest.builder()
                        .name("name")
                        .unitAmount(0L)
                        .description("description")
                        .direction("direction")
                        .metadata(
                            InvoiceUpdateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .quantity(0L)
                        .unitAmountDecimal("unit_amount_decimal")
                        .build()
                )
            )
            .invoicerAddress(
                InvoiceUpdateParams.InvoicerAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .ledgerAccountSettlementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .notificationEmailAddresses(listOf("string"))
            .notificationsEnabled(true)
            .originatingAccountId("originating_account_id")
            .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
            .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
            .paymentType(PaymentOrderType.ACH)
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .recipientEmail("recipient_email")
            .recipientName("recipient_name")
            .remindAfterOverdueDays(listOf(0L))
            .status("status")
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceUpdateParams.builder()
                .id("id")
                .contactDetails(
                    listOf(
                        InvoiceUpdateParams.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .counterpartyBillingAddress(
                    InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .counterpartyId("counterparty_id")
                .counterpartyShippingAddress(
                    InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .currency(Currency.AED)
                .description("description")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackPaymentMethod("fallback_payment_method")
                .ingestLedgerEntries(true)
                .invoiceLineItems(
                    listOf(
                        InvoiceUpdateParams.InvoiceLineItemCreateRequest.builder()
                            .name("name")
                            .unitAmount(0L)
                            .description("description")
                            .direction("direction")
                            .metadata(
                                InvoiceUpdateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .quantity(0L)
                            .unitAmountDecimal("unit_amount_decimal")
                            .build()
                    )
                )
                .invoicerAddress(
                    InvoiceUpdateParams.InvoicerAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .ledgerAccountSettlementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    InvoiceUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .notificationEmailAddresses(listOf("string"))
                .notificationsEnabled(true)
                .originatingAccountId("originating_account_id")
                .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
                .paymentType(PaymentOrderType.ACH)
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recipientEmail("recipient_email")
                .recipientName("recipient_name")
                .remindAfterOverdueDays(listOf(0L))
                .status("status")
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contactDetails())
            .isEqualTo(
                listOf(
                    InvoiceUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.counterpartyBillingAddress())
            .isEqualTo(
                InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.counterpartyId()).isEqualTo("counterparty_id")
        assertThat(body.counterpartyShippingAddress())
            .isEqualTo(
                InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.fallbackPaymentMethod()).isEqualTo("fallback_payment_method")
        assertThat(body.ingestLedgerEntries()).isEqualTo(true)
        assertThat(body.invoiceLineItems())
            .isEqualTo(
                listOf(
                    InvoiceUpdateParams.InvoiceLineItemCreateRequest.builder()
                        .name("name")
                        .unitAmount(0L)
                        .description("description")
                        .direction("direction")
                        .metadata(
                            InvoiceUpdateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .quantity(0L)
                        .unitAmountDecimal("unit_amount_decimal")
                        .build()
                )
            )
        assertThat(body.invoicerAddress())
            .isEqualTo(
                InvoiceUpdateParams.InvoicerAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.ledgerAccountSettlementId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.notificationEmailAddresses()).isEqualTo(listOf("string"))
        assertThat(body.notificationsEnabled()).isEqualTo(true)
        assertThat(body.originatingAccountId()).isEqualTo("originating_account_id")
        assertThat(body.paymentEffectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.paymentMethod()).isEqualTo(InvoiceUpdateParams.PaymentMethod.UI)
        assertThat(body.paymentType()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.recipientEmail()).isEqualTo("recipient_email")
        assertThat(body.recipientName()).isEqualTo("recipient_name")
        assertThat(body.remindAfterOverdueDays()).isEqualTo(listOf(0L))
        assertThat(body.status()).isEqualTo("status")
        assertThat(body.virtualAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InvoiceUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
