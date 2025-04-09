// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IncomingPaymentDetailServiceTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()

        val incomingPaymentDetail =
            incomingPaymentDetailService.retrieve(
                IncomingPaymentDetailRetrieveParams.builder().id("id").build()
            )

        incomingPaymentDetail.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()

        val incomingPaymentDetail =
            incomingPaymentDetailService.update(
                IncomingPaymentDetailUpdateParams.builder()
                    .id("id")
                    .metadata(
                        IncomingPaymentDetailUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        incomingPaymentDetail.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()

        val page = incomingPaymentDetailService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun createAsync() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()

        val asyncResponse =
            incomingPaymentDetailService.createAsync(
                IncomingPaymentDetailCreateAsyncParams.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .currency(Currency.AED)
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .description("description")
                    .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
                    .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        asyncResponse.validate()
    }
}
