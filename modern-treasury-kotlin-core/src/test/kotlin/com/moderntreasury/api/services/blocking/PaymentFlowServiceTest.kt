package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.PaymentFlowListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentFlowServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val paymentFlow =
            paymentFlowService.create(
                PaymentFlowCreateParams.builder()
                    .amount(123L)
                    .currency("string")
                    .direction(PaymentFlowCreateParams.Direction.CREDIT)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val paymentFlow =
            paymentFlowService.retrieve(PaymentFlowRetrieveParams.builder().id("string").build())
        println(paymentFlow)
        paymentFlow.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val paymentFlow =
            paymentFlowService.update(
                PaymentFlowUpdateParams.builder()
                    .id("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentFlowService = client.paymentFlows()
        val response = paymentFlowService.list(PaymentFlowListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
