package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.TransactionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val transaction =
            transactionService.retrieve(TransactionRetrieveParams.builder().id("string").build())
        println(transaction)
        transaction.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val transaction =
            transactionService.update(
                TransactionUpdateParams.builder()
                    .id("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()
        val response = transactionService.list(TransactionListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
