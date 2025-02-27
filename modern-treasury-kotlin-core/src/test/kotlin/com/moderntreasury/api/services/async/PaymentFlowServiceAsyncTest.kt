// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentFlowServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowServiceAsync = client.paymentFlows()

        val paymentFlow =
            paymentFlowServiceAsync.create(
                PaymentFlowCreateParams.builder()
                    .amount(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency("currency")
                    .direction(PaymentFlowCreateParams.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        paymentFlow.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowServiceAsync = client.paymentFlows()

        val paymentFlow =
            paymentFlowServiceAsync.retrieve(PaymentFlowRetrieveParams.builder().id("id").build())

        paymentFlow.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowServiceAsync = client.paymentFlows()

        val paymentFlow =
            paymentFlowServiceAsync.update(
                PaymentFlowUpdateParams.builder()
                    .id("id")
                    .status(PaymentFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        paymentFlow.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowServiceAsync = client.paymentFlows()

        val page = paymentFlowServiceAsync.list()

        page.response().validate()
    }
}
