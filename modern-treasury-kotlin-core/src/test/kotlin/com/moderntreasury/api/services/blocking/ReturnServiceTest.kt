// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.ReturnCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReturnServiceTest {

    @Test
    fun create() {
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
                    .corrections(
                        ReturnCreateParams.Corrections.builder()
                            .accountNumber("account_number")
                            .companyId("company_id")
                            .companyName("company_name")
                            .individualIdentificationNumber("individual_identification_number")
                            .routingNumber("routing_number")
                            .transactionCode("transaction_code")
                            .build()
                    )
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .reason("reason")
                    .reconciled(true)
                    .build()
            )

        returnObject.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnService = client.returns()

        val returnObject = returnService.retrieve("id")

        returnObject.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnService = client.returns()

        val page = returnService.list()

        page.items().forEach { it.validate() }
    }
}
