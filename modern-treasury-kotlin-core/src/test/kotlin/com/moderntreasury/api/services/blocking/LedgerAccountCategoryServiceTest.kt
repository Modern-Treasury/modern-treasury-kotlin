// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.create(
                LedgerAccountCategoryCreateParams.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .metadata(
                        LedgerAccountCategoryCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.retrieve(
                LedgerAccountCategoryRetrieveParams.builder()
                    .id("id")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.update(
                LedgerAccountCategoryUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountCategoryUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
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
                .apiKey("My API Key")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        val ledgerAccountCategory =
            ledgerAccountCategoryService.delete(
                LedgerAccountCategoryDeleteParams.builder().id("id").build()
            )
        println(ledgerAccountCategory)
        ledgerAccountCategory.validate()
    }

    @Test
    fun callAddLedgerAccount() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.addLedgerAccount(
            LedgerAccountCategoryAddLedgerAccountParams.builder()
                .id("id")
                .ledgerAccountId("ledger_account_id")
                .build()
        )
    }

    @Test
    fun callAddNestedCategory() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.addNestedCategory(
            LedgerAccountCategoryAddNestedCategoryParams.builder()
                .id("id")
                .subCategoryId("sub_category_id")
                .build()
        )
    }

    @Test
    fun callRemoveLedgerAccount() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.removeLedgerAccount(
            LedgerAccountCategoryRemoveLedgerAccountParams.builder()
                .id("id")
                .ledgerAccountId("ledger_account_id")
                .build()
        )
    }

    @Test
    fun callRemoveNestedCategory() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryService = client.ledgerAccountCategories()
        ledgerAccountCategoryService.removeNestedCategory(
            LedgerAccountCategoryRemoveNestedCategoryParams.builder()
                .id("id")
                .subCategoryId("sub_category_id")
                .build()
        )
    }
}
