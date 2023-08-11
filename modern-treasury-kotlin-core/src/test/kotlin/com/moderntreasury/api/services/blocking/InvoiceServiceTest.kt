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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.create(
                InvoiceCreateParams.builder()
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
                    .counterpartyId("string")
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
                    .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .originatingAccountId("string")
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                    .paymentType(InvoiceCreateParams.PaymentType.ACH)
                    .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
                    .notificationsEnabled(true)
                    .notificationEmailAddresses(listOf("string"))
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
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
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
                    .counterpartyId("string")
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
                    .originatingAccountId("string")
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                    .paymentType(InvoiceUpdateParams.PaymentType.ACH)
                    .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
                    .notificationsEnabled(true)
                    .notificationEmailAddresses(listOf("string"))
                    .status("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val invoiceService = client.invoices()
        val response = invoiceService.list(InvoiceListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
