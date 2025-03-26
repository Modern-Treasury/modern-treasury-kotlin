// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerEventHandlerServiceTest {

    @Test
    fun create() {
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
                            .addLedgerEntry(
                                LedgerEventHandlerCreateParams
                                    .LedgerEventHandlerLedgerTransactionTemplate
                                    .LedgerEventHandlerLedgerEntries
                                    .builder()
                                    .amount("amount")
                                    .direction("direction")
                                    .ledgerAccountId("ledger_account_id")
                                    .build()
                            )
                            .status("posted")
                            .build()
                    )
                    .name("name")
                    .conditions(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                            .field("ledgerable_event.name")
                            .operator("equals")
                            .value("credit_card_swipe")
                            .build()
                    )
                    .description("description")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        LedgerEventHandlerCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .variables(
                        LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder()
                            .putAdditionalProperty(
                                "credit_account",
                                JsonValue.from(
                                    mapOf(
                                        "query" to
                                            mapOf(
                                                "field" to "name",
                                                "operator" to "equals",
                                                "value" to "my_credit_account",
                                            ),
                                        "type" to "ledger_account",
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )

        ledgerEventHandler.validate()
    }

    @Test
    fun retrieve() {
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

        ledgerEventHandler.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEventHandlerService = client.ledgerEventHandlers()

        val page = ledgerEventHandlerService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
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

        ledgerEventHandler.validate()
    }
}
