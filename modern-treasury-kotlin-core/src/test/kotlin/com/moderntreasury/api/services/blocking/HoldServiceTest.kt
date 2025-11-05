// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HoldServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdService = client.holds()

        val hold =
            holdService.create(
                HoldCreateParams.builder()
                    .status(HoldCreateParams.Status.ACTIVE)
                    .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .targetType(HoldCreateParams.TargetType.PAYMENT_ORDER)
                    .metadata(
                        HoldCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        hold.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdService = client.holds()

        val hold = holdService.retrieve("id")

        hold.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdService = client.holds()

        val hold =
            holdService.update(
                HoldUpdateParams.builder()
                    .id("id")
                    .status(HoldUpdateParams.Status.RESOLVED)
                    .resolution("resolution")
                    .build()
            )

        hold.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdService = client.holds()

        val page = holdService.list()

        page.items().forEach { it.validate() }
    }
}
