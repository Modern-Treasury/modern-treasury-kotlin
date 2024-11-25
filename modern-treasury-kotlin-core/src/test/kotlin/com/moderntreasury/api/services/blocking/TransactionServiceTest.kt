// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.TransactionListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val transaction =
            transactionService.create(
                TransactionCreateParams.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .metadata(TransactionCreateParams.Metadata.builder().build())
                    .posted(true)
                    .type(TransactionCreateParams.Type.ACH)
                    .vendorDescription("vendor_description")
                    .build()
            )
        println(transaction)
        transaction.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val transaction =
            transactionService.retrieve(TransactionRetrieveParams.builder().id("id").build())
        println(transaction)
        transaction.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val transaction =
            transactionService.update(
                TransactionUpdateParams.builder()
                    .id("id")
                    .metadata(TransactionUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(transaction)
        transaction.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val response = transactionService.list(TransactionListParams.builder().build())
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
        val transactionService = client.transactions()
        transactionService.delete(TransactionDeleteParams.builder().id("id").build())
    }
}
