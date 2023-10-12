// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LineItemListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LineItemServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.lineItems()
        val lineItem =
            lineItemService.retrieve(
                LineItemRetrieveParams.builder()
                    .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("string")
                    .id("string")
                    .build()
            )
        println(lineItem)
        lineItem.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.lineItems()
        val lineItem =
            lineItemService.update(
                LineItemUpdateParams.builder()
                    .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("string")
                    .id("string")
                    .metadata(LineItemUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(lineItem)
        lineItem.validate()
    }

    @Disabled("Prism is broken in this case")
    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.lineItems()
        val response =
            lineItemService.list(
                LineItemListParams.builder()
                    .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("string")
                    .build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }
}
