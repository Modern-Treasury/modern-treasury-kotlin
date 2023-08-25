package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.create(
                LedgerAccountCreateParams.builder()
                    .currency("string")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
                    .currencyExponent(123L)
                    .description("string")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
                    .metadata(LedgerAccountCreateParams.Metadata.builder().build())
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.retrieve(
                LedgerAccountRetrieveParams.builder()
                    .id("string")
                    .balances(
                        LedgerAccountRetrieveParams.Balances.builder()
                            .asOfDate(LocalDate.parse("2019-12-27"))
                            .asOfLockVersion(123L)
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.update(
                LedgerAccountUpdateParams.builder()
                    .id("string")
                    .description("string")
                    .metadata(LedgerAccountUpdateParams.Metadata.builder().build())
                    .name("string")
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
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountService = client.ledgerAccounts()
        val ledgerAccount =
            ledgerAccountService.delete(LedgerAccountDeleteParams.builder().id("string").build())
        println(ledgerAccount)
        ledgerAccount.validate()
    }
}
