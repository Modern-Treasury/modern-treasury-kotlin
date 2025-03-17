// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentReferenceServiceTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceService = client.paymentReferences()

        val paymentReference =
            paymentReferenceService.retrieve(
                PaymentReferenceRetrieveParams.builder().id("id").build()
            )

        paymentReference.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceService = client.paymentReferences()

        val page = paymentReferenceService.list()

        page.response().validate()
    }

    @Test
    fun retireve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceService = client.paymentReferences()

        val paymentReference =
            paymentReferenceService.retireve(
                PaymentReferenceRetireveParams.builder().id("id").build()
            )

        paymentReference.validate()
    }
}
