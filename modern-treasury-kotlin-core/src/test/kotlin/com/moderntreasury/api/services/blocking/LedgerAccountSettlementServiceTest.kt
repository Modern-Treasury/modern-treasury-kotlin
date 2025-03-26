// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountSettlementServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountSettlementService = client.ledgerAccountSettlements()

        val ledgerAccountSettlement =
            ledgerAccountSettlementService.create(
                LedgerAccountSettlementCreateParams.builder()
                    .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .allowEitherDirection(true)
                    .description("description")
                    .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        LedgerAccountSettlementCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .skipSettlementLedgerTransaction(true)
                    .status(LedgerAccountSettlementCreateParams.Status.PENDING)
                    .build()
            )

        ledgerAccountSettlement.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountSettlementService = client.ledgerAccountSettlements()

        val ledgerAccountSettlement =
            ledgerAccountSettlementService.retrieve(
                LedgerAccountSettlementRetrieveParams.builder().id("id").build()
            )

        ledgerAccountSettlement.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountSettlementService = client.ledgerAccountSettlements()

        val ledgerAccountSettlement =
            ledgerAccountSettlementService.update(
                LedgerAccountSettlementUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountSettlementUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .status(LedgerAccountSettlementUpdateParams.Status.POSTED)
                    .build()
            )

        ledgerAccountSettlement.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountSettlementService = client.ledgerAccountSettlements()

        val page = ledgerAccountSettlementService.list()

        page.response().validate()
    }
}
