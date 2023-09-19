package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.PaymentReferenceListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentReferenceServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceService = client.paymentReferences()
        val paymentReference =
            paymentReferenceService.retrieve(
                PaymentReferenceRetrieveParams.builder().id("string").build()
            )
        println(paymentReference)
        paymentReference.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceService = client.paymentReferences()
        val response = paymentReferenceService.list(PaymentReferenceListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callRetireve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceService = client.paymentReferences()
        @Suppress("DEPRECATION")
        val paymentReference =
            paymentReferenceService.retireve(
                PaymentReferenceRetireveParams.builder().id("string").build()
            )
        println(paymentReference)
        paymentReference.validate()
    }
}
