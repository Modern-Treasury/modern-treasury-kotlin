// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.invoices

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.InvoiceLineItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LineItemServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.create(
                InvoiceLineItemCreateParams.builder()
                    .invoiceId("invoice_id")
                    .name("name")
                    .unitAmount(123L)
                    .description("description")
                    .direction("direction")
                    .metadata(InvoiceLineItemCreateParams.Metadata.builder().build())
                    .quantity(123L)
                    .unitAmountDecimal("unit_amount_decimal")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.retrieve(
                InvoiceLineItemRetrieveParams.builder().invoiceId("invoice_id").id("id").build()
            )
        println(invoiceLineItem)
        invoiceLineItem.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.update(
                InvoiceLineItemUpdateParams.builder()
                    .invoiceId("invoice_id")
                    .id("id")
                    .description("description")
                    .direction("direction")
                    .metadata(InvoiceLineItemUpdateParams.Metadata.builder().build())
                    .name("name")
                    .quantity(123L)
                    .unitAmount(123L)
                    .unitAmountDecimal("unit_amount_decimal")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.invoices().lineItems()
        val response =
            lineItemService.list(
                InvoiceLineItemListParams.builder().invoiceId("invoice_id").build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.delete(
                InvoiceLineItemDeleteParams.builder().invoiceId("invoice_id").id("id").build()
            )
        println(invoiceLineItem)
        invoiceLineItem.validate()
    }
}
