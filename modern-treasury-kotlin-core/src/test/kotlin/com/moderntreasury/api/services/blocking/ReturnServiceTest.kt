// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ReturnServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnService = client.returns()
        val returnObject =
            returnService.create(
                ReturnCreateParams.builder()
                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                    .additionalInformation("additional_information")
                    .code(ReturnCreateParams.Code._901)
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .reason("reason")
                    .build()
            )
        println(returnObject)
        returnObject.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnService = client.returns()
        val returnObject = returnService.retrieve(ReturnRetrieveParams.builder().id("id").build())
        println(returnObject)
        returnObject.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnService = client.returns()
        val response = returnService.list(ReturnListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
