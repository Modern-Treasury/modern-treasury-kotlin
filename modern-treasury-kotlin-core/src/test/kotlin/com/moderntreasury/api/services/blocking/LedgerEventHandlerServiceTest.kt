// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerEventHandlerServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val ledgerEventHandlerCreateResponse =
            ledgerEventHandlerService.create(
                LedgerEventHandlerCreateParams.builder()
                    .ledgerTransactionTemplate(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                            .builder()
                            .description("string")
                            .effectiveAt("string")
                            .ledgerEntries(
                                listOf(
                                    LedgerEventHandlerCreateParams
                                        .LedgerEventHandlerLedgerTransactionTemplate
                                        .LedgerEventHandlerLedgerEntries
                                        .builder()
                                        .amount("string")
                                        .direction("string")
                                        .ledgerAccountId("string")
                                        .build()
                                )
                            )
                            .metadata(
                                LedgerEventHandlerCreateParams
                                    .LedgerEventHandlerLedgerTransactionTemplate
                                    .Metadata
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .name("string")
                    .conditions(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                            .field("string")
                            .operator("string")
                            .value("string")
                            .build()
                    )
                    .description("string")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(LedgerEventHandlerCreateParams.Metadata.builder().build())
                    .build()
            )
        println(ledgerEventHandlerCreateResponse)
        ledgerEventHandlerCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val ledgerEventHandlerRetrieveResponse =
            ledgerEventHandlerService.retrieve(
                LedgerEventHandlerRetrieveParams.builder().id("string").build()
            )
        println(ledgerEventHandlerRetrieveResponse)
        ledgerEventHandlerRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val response =
            ledgerEventHandlerService.list(LedgerEventHandlerListParams.builder().build())
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
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val ledgerEventHandlerDeleteResponse =
            ledgerEventHandlerService.delete(
                LedgerEventHandlerDeleteParams.builder().id("string").build()
            )
        println(ledgerEventHandlerDeleteResponse)
        ledgerEventHandlerDeleteResponse.validate()
    }
}
