package com.moderntreasury.api.services.blocking.invoices

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.InvoiceLineItemListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LineItemServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.create(
                InvoiceLineItemCreateParams.builder()
                    .invoiceId("string")
                    .name("string")
                    .description("string")
                    .quantity(123L)
                    .unitAmount(123L)
                    .direction("string")
                    .build()
            )
        println(invoiceLineItem)
        invoiceLineItem.validate()
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
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.retrieve(
                InvoiceLineItemRetrieveParams.builder().invoiceId("string").id("string").build()
            )
        println(invoiceLineItem)
        invoiceLineItem.validate()
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
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.update(
                InvoiceLineItemUpdateParams.builder()
                    .invoiceId("string")
                    .id("string")
                    .contactDetails(
                        listOf(
                            InvoiceLineItemUpdateParams.ContactDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .object_("string")
                                .liveMode(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    InvoiceLineItemUpdateParams.ContactDetail.ContactIdentifierType
                                        .EMAIL
                                )
                                .build()
                        )
                    )
                    .counterpartyId("string")
                    .counterpartyBillingAddress(
                        InvoiceLineItemUpdateParams.CounterpartyBillingAddress.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .counterpartyShippingAddress(
                        InvoiceLineItemUpdateParams.CounterpartyShippingAddress.builder()
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
                        InvoiceLineItemUpdateParams.InvoicerAddress.builder()
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
        println(invoiceLineItem)
        invoiceLineItem.validate()
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
        val lineItemService = client.invoices().lineItems()
        val response =
            lineItemService.list(InvoiceLineItemListParams.builder().invoiceId("string").build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.delete(
                InvoiceLineItemDeleteParams.builder().invoiceId("string").id("string").build()
            )
        println(invoiceLineItem)
        invoiceLineItem.validate()
    }
}
