// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ValidationServiceAsyncTest {

    @Test
    suspend fun validateRoutingNumber() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val validationServiceAsync = client.validations()

        val routingNumberLookupRequest =
            validationServiceAsync.validateRoutingNumber(
                ValidationValidateRoutingNumberParams.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                    .build()
            )

        routingNumberLookupRequest.validate()
    }
}
