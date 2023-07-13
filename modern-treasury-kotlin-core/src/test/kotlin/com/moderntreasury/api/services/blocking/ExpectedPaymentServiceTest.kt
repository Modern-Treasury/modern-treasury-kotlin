package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.ExpectedPaymentListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExpectedPaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.create(
                ExpectedPaymentCreateParams.builder()
                    .amountUpperBound(123L)
                    .amountLowerBound(123L)
                    .direction(ExpectedPaymentCreateParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ExpectedPaymentType.ACH)
                    .currency(Currency.AED)
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .statementDescriptor("string")
                    .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .remittanceInformation("string")
                    .reconciliationGroups(JsonNull.of())
                    .reconciliationFilters(JsonNull.of())
                    .lineItems(
                        listOf(
                            ExpectedPaymentCreateParams.LineItemRequest.builder()
                                .amount(123L)
                                .metadata(
                                    ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder()
                                        .build()
                                )
                                .description("string")
                                .accountingCategoryId("string")
                                .build()
                        )
                    )
                    .build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.retrieve(
                ExpectedPaymentRetrieveParams.builder().id("string").build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.update(
                ExpectedPaymentUpdateParams.builder()
                    .id("string")
                    .amountUpperBound(123L)
                    .amountLowerBound(123L)
                    .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ExpectedPaymentType.ACH)
                    .currency(Currency.AED)
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .statementDescriptor("string")
                    .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .remittanceInformation("string")
                    .reconciliationGroups(JsonNull.of())
                    .reconciliationFilters(JsonNull.of())
                    .build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val response = expectedPaymentService.list(ExpectedPaymentListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.delete(
                ExpectedPaymentDeleteParams.builder().id("string").build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }
}
