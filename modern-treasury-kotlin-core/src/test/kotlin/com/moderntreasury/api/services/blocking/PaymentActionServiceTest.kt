// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentActionServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionService = client.paymentActions()

        val paymentAction =
            paymentActionService.create(
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
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionService = client.paymentActions()

        val paymentAction = paymentActionService.retrieve("id")

        paymentAction.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionService = client.paymentActions()

        val paymentAction =
            paymentActionService.update(
                PaymentActionUpdateParams.builder()
                    .id("id")
                    .status(PaymentActionUpdateParams.Status.PENDING)
                    .build()
            )

        paymentAction.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentActionService = client.paymentActions()

        val page = paymentActionService.list()

        page.items().forEach { it.validate() }
    }
}
