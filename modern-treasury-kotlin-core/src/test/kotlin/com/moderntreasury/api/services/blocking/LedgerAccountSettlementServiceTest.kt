// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountSettlementServiceTest {

    @Test
    fun callCreate() {
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
                    .metadata(LedgerAccountSettlementCreateParams.Metadata.builder().build())
                    .skipSettlementLedgerTransaction(true)
                    .status(LedgerAccountSettlementCreateParams.Status.PENDING)
                    .build()
            )
        println(ledgerAccountSettlement)
        ledgerAccountSettlement.validate()
    }

    @Test
    fun callRetrieve() {
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
        println(ledgerAccountSettlement)
        ledgerAccountSettlement.validate()
    }

    @Test
    fun callUpdate() {
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
                    .metadata(LedgerAccountSettlementUpdateParams.Metadata.builder().build())
                    .status(LedgerAccountSettlementUpdateParams.Status.POSTED)
                    .build()
            )
        println(ledgerAccountSettlement)
        ledgerAccountSettlement.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountSettlementService = client.ledgerAccountSettlements()
        val response =
            ledgerAccountSettlementService.list(LedgerAccountSettlementListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
