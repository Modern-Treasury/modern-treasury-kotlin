// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.ReturnCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReturnServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnServiceAsync = client.returns()

        val returnObject =
            returnServiceAsync.create(
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
                    .build()
            )

        returnObject.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnServiceAsync = client.returns()

        val returnObject = returnServiceAsync.retrieve("id")

        returnObject.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnServiceAsync = client.returns()

        val page = returnServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
