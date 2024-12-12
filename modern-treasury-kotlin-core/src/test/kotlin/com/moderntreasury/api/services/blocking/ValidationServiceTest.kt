// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ValidationServiceTest {

    @Test
    fun callValidateRoutingNumber() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val validationService = client.validations()
        val routingNumberLookupRequest =
            validationService.validateRoutingNumber(
                ValidationValidateRoutingNumberParams.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                    .build()
            )
        println(routingNumberLookupRequest)
        routingNumberLookupRequest.validate()
    }
}
