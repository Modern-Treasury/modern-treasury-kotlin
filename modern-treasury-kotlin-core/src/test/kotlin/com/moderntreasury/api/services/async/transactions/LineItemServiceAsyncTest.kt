// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.transactions

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams
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
        val lineItemServiceAsync = client.transactions().lineItems()

        val transactionLineItem =
            lineItemServiceAsync.create(
                TransactionLineItemCreateParams.builder()
                    .amount(0L)
                    .expectedPaymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        transactionLineItem.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.transactions().lineItems()

        val transactionLineItem =
            lineItemServiceAsync.retrieve(
                TransactionLineItemRetrieveParams.builder().id("id").build()
            )

        transactionLineItem.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.transactions().lineItems()

        val page = lineItemServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.transactions().lineItems()

        lineItemServiceAsync.delete(TransactionLineItemDeleteParams.builder().id("id").build())
    }
}
