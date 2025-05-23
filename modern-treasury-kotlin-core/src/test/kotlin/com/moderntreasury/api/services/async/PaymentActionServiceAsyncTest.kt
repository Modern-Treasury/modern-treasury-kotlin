// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentActionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionServiceAsync = client.paymentActions()

        val paymentAction =
            paymentActionServiceAsync.create(
                PaymentActionCreateParams.builder()
                    .type("type")
                    .actionableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actionableType("actionable_type")
                    .details(JsonValue.from(mapOf<String, Any>()))
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        paymentAction.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionServiceAsync = client.paymentActions()

        val paymentAction = paymentActionServiceAsync.retrieve("id")

        paymentAction.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionServiceAsync = client.paymentActions()

        val paymentAction =
            paymentActionServiceAsync.update(
                PaymentActionUpdateParams.builder()
                    .id("id")
                    .status(PaymentActionUpdateParams.Status.PENDING)
                    .build()
            )

        paymentAction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionServiceAsync = client.paymentActions()

        val page = paymentActionServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
