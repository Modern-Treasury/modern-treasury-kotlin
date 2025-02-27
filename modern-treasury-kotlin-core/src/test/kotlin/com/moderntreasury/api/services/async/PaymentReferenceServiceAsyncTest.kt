// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentReferenceServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceServiceAsync = client.paymentReferences()

        val paymentReference =
            paymentReferenceServiceAsync.retrieve(
                PaymentReferenceRetrieveParams.builder().id("id").build()
            )

        paymentReference.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceServiceAsync = client.paymentReferences()

        val page = paymentReferenceServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun retireve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceServiceAsync = client.paymentReferences()

        val paymentReference =
            paymentReferenceServiceAsync.retireve(
                PaymentReferenceRetireveParams.builder().id("id").build()
            )

        paymentReference.validate()
    }
}
