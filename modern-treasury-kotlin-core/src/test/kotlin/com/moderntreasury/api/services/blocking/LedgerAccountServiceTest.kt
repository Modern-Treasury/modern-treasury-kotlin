// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerAccountListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.create(
                LedgerAccountCreateParams.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(LedgerAccountCreateParams.LedgerableType.COUNTERPARTY)
                    .metadata(
                        LedgerAccountCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        println(ledgerAccount)
        ledgerAccount.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.retrieve(
                LedgerAccountRetrieveParams.builder()
                    .id("id")
                    .balances(
                        LedgerAccountRetrieveParams.Balances.builder()
                            .asOfDate(LocalDate.parse("2019-12-27"))
                            .asOfLockVersion(0L)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        println(ledgerAccount)
        ledgerAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.update(
                LedgerAccountUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .build()
            )
        println(ledgerAccount)
        ledgerAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val response = ledgerAccountService.list(LedgerAccountListParams.builder().build())
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
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.delete(LedgerAccountDeleteParams.builder().id("id").build())
        println(ledgerAccount)
        ledgerAccount.validate()
    }
}
