// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.ledgerAccountSettlements

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryDeleteParams
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountEntryServiceAsyncTest {

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountEntryServiceAsync = client.ledgerAccountSettlements().accountEntries()

        accountEntryServiceAsync.update(
            LedgerAccountSettlementAccountEntryUpdateParams.builder()
                .id("id")
                .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountEntryServiceAsync = client.ledgerAccountSettlements().accountEntries()

        accountEntryServiceAsync.delete(
            LedgerAccountSettlementAccountEntryDeleteParams.builder()
                .id("id")
                .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }
}
