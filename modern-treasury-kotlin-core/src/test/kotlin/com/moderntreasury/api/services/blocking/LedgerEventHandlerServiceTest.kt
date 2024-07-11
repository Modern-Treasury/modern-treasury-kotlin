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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val ledgerEventHandler =
            ledgerEventHandlerService.create(
                LedgerEventHandlerCreateParams.builder()
                    .ledgerTransactionTemplate(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                            .builder()
                            .description("My Ledger Transaction Template Description")
                            .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                            .ledgerEntries(
                                listOf(
                                    LedgerEventHandlerCreateParams
                                        .LedgerEventHandlerLedgerTransactionTemplate
                                        .LedgerEventHandlerLedgerEntries
                                        .builder()
                                        .amount("amount")
                                        .direction("direction")
                                        .ledgerAccountId("ledger_account_id")
                                        .build()
                                )
                            )
                            .status("posted")
                            .build()
                    )
                    .name("name")
                    .conditions(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                            .field("field")
                            .operator("operator")
                            .value("value")
                            .build()
                    )
                    .description("description")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(LedgerEventHandlerCreateParams.Metadata.builder().build())
                    .variables(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder().build()
                    )
                    .build()
            )
        println(ledgerEventHandler)
        ledgerEventHandler.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val ledgerEventHandler =
            ledgerEventHandlerService.retrieve(
                LedgerEventHandlerRetrieveParams.builder().id("id").build()
            )
        println(ledgerEventHandler)
        ledgerEventHandler.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()
        val ledgerEventHandler =
            ledgerEventHandlerService.delete(
                LedgerEventHandlerDeleteParams.builder().id("id").build()
            )
        println(ledgerEventHandler)
        ledgerEventHandler.validate()
    }
}
