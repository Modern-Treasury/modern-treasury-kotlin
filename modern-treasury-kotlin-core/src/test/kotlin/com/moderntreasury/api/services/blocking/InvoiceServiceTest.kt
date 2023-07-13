package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.InvoiceListParams
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
                .webhookKey("string")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.create(
                InvoiceCreateParams.builder()
                    .contactDetails(
                        listOf(
                            InvoiceCreateParams.ContactDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .object_("string")
                                .liveMode(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
                                )
                                .build()
                        )
                    )
                    .counterpartyId("string")
                    .counterpartyBillingAddress(
                        InvoiceCreateParams.CounterpartyBillingAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .counterpartyShippingAddress(
                        InvoiceCreateParams.CounterpartyShippingAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .currency(Currency.AED)
                    .description("string")
                    .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoicerAddress(
                        InvoiceCreateParams.InvoicerAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .originatingAccountId("string")
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
                .webhookKey("string")
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
                .webhookKey("string")
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
                                .object_("string")
                                .liveMode(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                                )
                                .build()
                        )
                    )
                    .counterpartyId("string")
                    .counterpartyBillingAddress(
                        InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .counterpartyShippingAddress(
                        InvoiceUpdateParams.CounterpartyShippingAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .currency(Currency.AED)
                    .description("string")
                    .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoicerAddress(
                        InvoiceUpdateParams.InvoicerAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .originatingAccountId("string")
                    .includePaymentUi(true)
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
                .webhookKey("string")
                .build()
        val invoiceService = client.invoices()
        val response = invoiceService.list(InvoiceListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
