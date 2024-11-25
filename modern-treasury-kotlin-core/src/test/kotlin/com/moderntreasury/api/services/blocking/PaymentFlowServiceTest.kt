// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.PaymentFlowListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentFlowServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val paymentFlow =
            paymentFlowService.create(
                PaymentFlowCreateParams.builder()
                    .amount(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency("currency")
                    .direction(PaymentFlowCreateParams.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(paymentFlow)
        paymentFlow.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val paymentFlow =
            paymentFlowService.retrieve(PaymentFlowRetrieveParams.builder().id("id").build())
        println(paymentFlow)
        paymentFlow.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val paymentFlow =
            paymentFlowService.update(
                PaymentFlowUpdateParams.builder()
                    .id("id")
                    .status(PaymentFlowUpdateParams.Status.CANCELLED)
                    .build()
            )
        println(paymentFlow)
        paymentFlow.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val response = paymentFlowService.list(PaymentFlowListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
