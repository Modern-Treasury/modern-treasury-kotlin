// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountStatementServiceTest {

    @Disabled("Prism is broken in this case")
    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountStatementService = client.ledgerAccountStatements()

        val ledgerAccountStatement =
            ledgerAccountStatementService.create(
                LedgerAccountStatementCreateParams.builder()
                    .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .metadata(
                        LedgerAccountStatementCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        ledgerAccountStatement.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountStatementService = client.ledgerAccountStatements()

        val ledgerAccountStatement =
            ledgerAccountStatementService.retrieve(
                LedgerAccountStatementRetrieveParams.builder().id("id").build()
            )

        ledgerAccountStatement.validate()
    }
}
