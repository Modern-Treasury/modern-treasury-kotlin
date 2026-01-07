// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.invoices

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.invoices().lineItems()

        val invoiceLineItem =
            lineItemServiceAsync.create(
                InvoiceLineItemCreateParams.builder()
                    .invoiceId("invoice_id")
                    .name("name")
                    .unitAmount(0L)
                    .description("description")
                    .direction("direction")
                    .metadata(
                        InvoiceLineItemCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .quantity(0L)
                    .unitAmountDecimal("unit_amount_decimal")
                    .build()
            )

        invoiceLineItem.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.invoices().lineItems()

        val invoiceLineItem =
            lineItemServiceAsync.retrieve(
                InvoiceLineItemRetrieveParams.builder().invoiceId("invoice_id").id("id").build()
            )

        invoiceLineItem.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.invoices().lineItems()

        val invoiceLineItem =
            lineItemServiceAsync.update(
                InvoiceLineItemUpdateParams.builder()
                    .invoiceId("invoice_id")
                    .id("id")
                    .description("description")
                    .direction("direction")
                    .metadata(
                        InvoiceLineItemUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .quantity(0L)
                    .unitAmount(0L)
                    .unitAmountDecimal("unit_amount_decimal")
                    .build()
            )

        invoiceLineItem.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.invoices().lineItems()

        val page = lineItemServiceAsync.list("invoice_id")

        page.items().forEach { it.validate() }
    }

    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.invoices().lineItems()

        val invoiceLineItem =
            lineItemServiceAsync.delete(
                InvoiceLineItemDeleteParams.builder().invoiceId("invoice_id").id("id").build()
            )

        invoiceLineItem.validate()
    }
}
