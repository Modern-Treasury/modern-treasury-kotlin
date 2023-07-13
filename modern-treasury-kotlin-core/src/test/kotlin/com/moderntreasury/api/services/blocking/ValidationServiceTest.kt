package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ValidationServiceTest {

    @Test
    fun callValidateRoutingNumber() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val validationService = client.validations()
        val routingNumberLookupRequest =
            validationService.validateRoutingNumber(
                ValidationValidateRoutingNumberParams.builder()
                    .routingNumber("string")
                    .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                    .build()
            )
        println(routingNumberLookupRequest)
        routingNumberLookupRequest.validate()
    }
}
