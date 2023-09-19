package com.moderntreasury.api.services.blocking.transactions

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.TransactionLineItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LineItemServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.transactions().lineItems()
        val transactionLineItem =
            lineItemService.retrieve(
                TransactionLineItemRetrieveParams.builder().id("string").build()
            )
        println(transactionLineItem)
        transactionLineItem.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.transactions().lineItems()
        val response = lineItemService.list(TransactionLineItemListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
