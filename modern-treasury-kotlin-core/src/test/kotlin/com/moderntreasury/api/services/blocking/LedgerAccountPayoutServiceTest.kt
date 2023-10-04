// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerAccountPayoutListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountPayoutServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountPayoutService = client.ledgerAccountPayouts()
        val ledgerAccountPayout =
            ledgerAccountPayoutService.create(
                LedgerAccountPayoutCreateParams.builder()
                    .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .effectiveAtUpperBound("14:15:22Z")
                    .metadata(LedgerAccountPayoutCreateParams.Metadata.builder().build())
                    .skipPayoutLedgerTransaction(true)
                    .status(LedgerAccountPayoutCreateParams.Status.PENDING)
                    .build()
            )
        println(ledgerAccountPayout)
        ledgerAccountPayout.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountPayoutService = client.ledgerAccountPayouts()
        val ledgerAccountPayout =
            ledgerAccountPayoutService.retrieve(
                LedgerAccountPayoutRetrieveParams.builder().id("string").build()
            )
        println(ledgerAccountPayout)
        ledgerAccountPayout.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountPayoutService = client.ledgerAccountPayouts()
        val ledgerAccountPayout =
            ledgerAccountPayoutService.update(
                LedgerAccountPayoutUpdateParams.builder()
                    .id("string")
                    .description("string")
                    .metadata(LedgerAccountPayoutUpdateParams.Metadata.builder().build())
                    .status(LedgerAccountPayoutUpdateParams.Status.POSTED)
                    .build()
            )
        println(ledgerAccountPayout)
        ledgerAccountPayout.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountPayoutService = client.ledgerAccountPayouts()
        val response =
            ledgerAccountPayoutService.list(LedgerAccountPayoutListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callRetireve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountPayoutService = client.ledgerAccountPayouts()
        @Suppress("DEPRECATION")
        val ledgerAccountPayout =
            ledgerAccountPayoutService.retireve(
                LedgerAccountPayoutRetireveParams.builder().id("string").build()
            )
        println(ledgerAccountPayout)
        ledgerAccountPayout.validate()
    }
}
