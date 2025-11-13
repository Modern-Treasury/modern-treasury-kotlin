// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.ContactDetail
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.models.PaymentOrderType
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.create(
                InvoiceCreateParams.builder()
                    .counterpartyId("counterparty_id")
                    .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .originatingAccountId("originating_account_id")
                    .autoAdvance(true)
                    .addContactDetail(
                        ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(ContactDetail.ContactIdentifierType.EMAIL)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .counterpartyBillingAddress(
                        InvoiceCreateParams.CounterpartyBillingAddress.builder()
                            .country("country")
                            .line1("line1")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .line2("line2")
                            .build()
                    )
                    .counterpartyShippingAddress(
                        InvoiceCreateParams.CounterpartyShippingAddress.builder()
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
                    .fallbackPaymentMethod("fallback_payment_method")
                    .addInvoiceLineItem(
                        InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                            .name("name")
                            .unitAmount(0L)
                            .description("description")
                            .direction("direction")
                            .metadata(
                                InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .quantity(0L)
                            .unitAmountDecimal("unit_amount_decimal")
                            .build()
                    )
                    .invoicerAddress(
                        InvoiceCreateParams.InvoicerAddress.builder()
                            .country("country")
                            .line1("line1")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .line2("line2")
                            .build()
                    )
                    .metadata(
                        InvoiceCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .addNotificationEmailAddress("string")
                    .notificationsEnabled(true)
                    .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                    .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
                    .paymentType(PaymentOrderType.ACH)
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recipientEmail("recipient_email")
                    .recipientName("recipient_name")
                    .addRemindAfterOverdueDay(0L)
                    .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()

        val invoice = invoiceService.retrieve("id")

        invoice.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.update(
                InvoiceUpdateParams.builder()
                    .id("id")
                    .addContactDetail(
                        ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(ContactDetail.ContactIdentifierType.EMAIL)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
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
                    .addInvoiceLineItem(
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
                    .metadata(
                        InvoiceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .addNotificationEmailAddress("string")
                    .notificationsEnabled(true)
                    .originatingAccountId("originating_account_id")
                    .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                    .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
                    .paymentType(PaymentOrderType.ACH)
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recipientEmail("recipient_email")
                    .recipientName("recipient_name")
                    .addRemindAfterOverdueDay(0L)
                    .status("status")
                    .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()

        val page = invoiceService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun addPaymentOrder() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()

        invoiceService.addPaymentOrder(
            InvoiceAddPaymentOrderParams.builder()
                .id("id")
                .paymentOrderId("payment_order_id")
                .build()
        )
    }
}
