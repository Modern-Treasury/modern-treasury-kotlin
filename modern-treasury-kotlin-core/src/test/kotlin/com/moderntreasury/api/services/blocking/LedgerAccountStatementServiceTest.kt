// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountStatementServiceTest {

    @Disabled("Prism is broken in this case")
    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountStatementService = client.ledgerAccountStatements()
        val ledgerAccountStatementCreateResponse =
            ledgerAccountStatementService.create(
                LedgerAccountStatementCreateParams.builder()
                    .effectiveAtLowerBound("string")
                    .effectiveAtUpperBound("string")
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .metadata(LedgerAccountStatementCreateParams.Metadata.builder().build())
                    .build()
            )
        println(ledgerAccountStatementCreateResponse)
        ledgerAccountStatementCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountStatementService = client.ledgerAccountStatements()
        val ledgerAccountStatementRetrieveResponse =
            ledgerAccountStatementService.retrieve(
                LedgerAccountStatementRetrieveParams.builder().id("string").build()
            )
        println(ledgerAccountStatementRetrieveResponse)
        ledgerAccountStatementRetrieveResponse.validate()
    }
}
