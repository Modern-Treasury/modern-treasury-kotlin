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
                    .invoiceId("string")
                    .name("string")
                    .unitAmount(123L)
                    .description("string")
                    .direction("string")
                    .quantity(123L)
                    .unitAmountDecimal("string")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.invoices().lineItems()
        val invoiceLineItem =
            lineItemService.update(
                InvoiceLineItemUpdateParams.builder()
                    .invoiceId("string")
                    .id("string")
                    .description("string")
                    .direction("string")
                    .name("string")
                    .quantity(123L)
                    .unitAmount(123L)
                    .unitAmountDecimal("string")
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
            lineItemService.list(InvoiceLineItemListParams.builder().invoiceId("string").build())
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
                InvoiceLineItemDeleteParams.builder().invoiceId("string").id("string").build()
            )
        println(invoiceLineItem)
        invoiceLineItem.validate()
    }
}
