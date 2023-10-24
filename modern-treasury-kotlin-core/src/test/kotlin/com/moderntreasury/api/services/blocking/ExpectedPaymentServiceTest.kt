// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.core.JsonValue
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.create(
                ExpectedPaymentCreateParams.builder()
                    .amountLowerBound(123L)
                    .amountUpperBound(123L)
                    .direction(TransactionDirection.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .lineItems(
                        listOf(
                            ExpectedPaymentCreateParams.LineItemRequest.builder()
                                .amount(123L)
                                .accountingCategoryId("string")
                                .description("string")
                                .metadata(
                                    ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder()
                                        .build()
                                )
                                .build()
                        )
                    )
                    .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
                    .reconciliationFilters(JsonNull.of())
                    .reconciliationGroups(JsonNull.of())
                    .reconciliationRuleVariables(listOf(JsonValue.from(mapOf<String, Any>())))
                    .remittanceInformation("string")
                    .statementDescriptor("string")
                    .type(ExpectedPaymentType.ACH)
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.update(
                ExpectedPaymentUpdateParams.builder()
                    .id("string")
                    .amountLowerBound(123L)
                    .amountUpperBound(123L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .direction(TransactionDirection.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
                    .reconciliationFilters(JsonNull.of())
                    .reconciliationGroups(JsonNull.of())
                    .reconciliationRuleVariables(listOf(JsonValue.from(mapOf<String, Any>())))
                    .remittanceInformation("string")
                    .statementDescriptor("string")
                    .type(ExpectedPaymentType.ACH)
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
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
