// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.InvoiceListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceServiceTest {

    @Test
    fun callCreate() {
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
                    .counterpartyId("string")
                    .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .originatingAccountId("string")
                    .contactDetails(
                        listOf(
                            InvoiceCreateParams.ContactDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
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
                        InvoiceCreateParams.CounterpartyBillingAddress.builder()
                            .country("string")
                            .line1("string")
                            .locality("string")
                            .postalCode("string")
                            .region("string")
                            .line2("string")
                            .build()
                    )
                    .counterpartyShippingAddress(
                        InvoiceCreateParams.CounterpartyShippingAddress.builder()
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
                    .fallbackPaymentMethod("string")
                    .invoicerAddress(
                        InvoiceCreateParams.InvoicerAddress.builder()
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
                    .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                    .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
                    .paymentType(InvoiceCreateParams.PaymentType.ACH)
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recipientEmail("string")
                    .recipientName("string")
                    .virtualAccountId("string")
                    .build()
            )
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()
        val invoice = invoiceService.retrieve(InvoiceRetrieveParams.builder().id("string").build())
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callUpdate() {
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
                    .fallbackPaymentMethod("string")
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
                    .paymentType(InvoiceUpdateParams.PaymentType.ACH)
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recipientEmail("string")
                    .recipientName("string")
                    .status("string")
                    .virtualAccountId("string")
                    .build()
            )
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()
        val response = invoiceService.list(InvoiceListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callAddPaymentOrder() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()
        invoiceService.addPaymentOrder(
            InvoiceAddPaymentOrderParams.builder().id("string").paymentOrderId("string").build()
        )
    }
}
