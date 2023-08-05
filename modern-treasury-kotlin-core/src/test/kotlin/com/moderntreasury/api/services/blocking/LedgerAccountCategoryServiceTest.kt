package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerAccountCategoryServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.create(
                LedgerAccountCategoryCreateParams.builder()
                    .name("string")
                    .description("string")
                    .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
                    .currency("string")
                    .currencyExponent(123L)
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
                    .build()
            )
        println(ledgerAccountCategory)
        ledgerAccountCategory.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.retrieve(
                LedgerAccountCategoryRetrieveParams.builder()
                    .id("string")
                    .balances(
                        LedgerAccountCategoryRetrieveParams.Balances.builder()
                            .asOfDate(LocalDate.parse("2019-12-27"))
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        println(ledgerAccountCategory)
        ledgerAccountCategory.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.update(
                LedgerAccountCategoryUpdateParams.builder()
                    .id("string")
                    .name("string")
                    .description("string")
                    .metadata(LedgerAccountCategoryUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(ledgerAccountCategory)
        ledgerAccountCategory.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val response =
            ledgerAccountCategoryService.list(LedgerAccountCategoryListParams.builder().build())
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
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.delete(
                LedgerAccountCategoryDeleteParams.builder().id("string").build()
            )
        println(ledgerAccountCategory)
        ledgerAccountCategory.validate()
    }

    @Test
    fun callAddLedgerAccount() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.addLedgerAccount(
            LedgerAccountCategoryAddLedgerAccountParams.builder()
                .id("string")
                .ledgerAccountId("string")
                .build()
        )
    }

    @Test
    fun callAddNestedCategory() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.addNestedCategory(
            LedgerAccountCategoryAddNestedCategoryParams.builder()
                .id("string")
                .subCategoryId("string")
                .build()
        )
    }

    @Test
    fun callRemoveLedgerAccount() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.removeLedgerAccount(
            LedgerAccountCategoryRemoveLedgerAccountParams.builder()
                .id("string")
                .ledgerAccountId("string")
                .build()
        )
    }

    @Test
    fun callRemoveNestedCategory() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.removeNestedCategory(
            LedgerAccountCategoryRemoveNestedCategoryParams.builder()
                .id("string")
                .subCategoryId("string")
                .build()
        )
    }
}
