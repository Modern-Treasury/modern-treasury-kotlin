// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HoldServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val hold =
            holdServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val hold = holdServiceAsync.retrieve("id")

        hold.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val hold =
            holdServiceAsync.update(
                HoldUpdateParams.builder()
                    .id("id")
                    .status(HoldUpdateParams.Status.RESOLVED)
                    .resolution("resolution")
                    .build()
            )

        hold.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val page = holdServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
