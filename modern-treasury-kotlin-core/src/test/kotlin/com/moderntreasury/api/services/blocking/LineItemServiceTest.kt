// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceTest {

    @Test
    fun retrieve() {
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
                    .itemizableId("itemizable_id")
                    .id("id")
                    .build()
            )

        lineItem.validate()
    }

    @Test
    fun update() {
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
                    .itemizableId("itemizable_id")
                    .id("id")
                    .metadata(
                        LineItemUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        lineItem.validate()
    }

    @Disabled("Prism is broken in this case")
    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemService = client.lineItems()

        val page =
            lineItemService.list(
                LineItemListParams.builder()
                    .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("itemizable_id")
                    .build()
            )

        page.response().validate()
    }
}
