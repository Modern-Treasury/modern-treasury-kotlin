// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.TransactionCreateRequest
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.models.TransactionUpdateRequest
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()

        val transaction =
            transactionService.create(
                TransactionCreateRequest.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .amount(0L)
                    .amountString("amount_string")
                    .metadata(
                        TransactionCreateRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .posted(true)
                    .type(TransactionCreateRequest.Type.ACH)
                    .vendorCustomerId("vendor_customer_id")
                    .vendorDescription("vendor_description")
                    .build()
            )

        transaction.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()

        val transaction = transactionService.retrieve("id")

        transaction.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()

        val transaction =
            transactionService.update(
                TransactionUpdateParams.builder()
                    .id("id")
                    .transactionUpdateRequest(
                        TransactionUpdateRequest.builder()
                            .metadata(
                                TransactionUpdateRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        transaction.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()

        val page = transactionService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionService = client.transactions()

        transactionService.delete("id")
    }
}
