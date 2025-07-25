// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.TransactionDirection
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VirtualAccountServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccount =
            virtualAccountServiceAsync.create(
                VirtualAccountCreateParams.builder()
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .addAccountDetail(
                        VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                VirtualAccountCreateParams.AccountDetailCreateRequest
                                    .AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .ledgerAccount(
                        LedgerAccountCreateRequest.builder()
                            .currency("currency")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .normalBalance(TransactionDirection.CREDIT)
                            .currencyExponent(0L)
                            .description("description")
                            .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY)
                            .metadata(
                                LedgerAccountCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        VirtualAccountCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addRoutingDetail(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                VirtualAccountCreateParams.RoutingDetailCreateRequest
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType
                                    .ACH
                            )
                            .build()
                    )
                    .build()
            )

        virtualAccount.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccount = virtualAccountServiceAsync.retrieve("id")

        virtualAccount.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccount =
            virtualAccountServiceAsync.update(
                VirtualAccountUpdateParams.builder()
                    .id("id")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        VirtualAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        virtualAccount.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val page = virtualAccountServiceAsync.list()

        page.items().forEach { it.validate() }
    }

    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccount = virtualAccountServiceAsync.delete("id")

        virtualAccount.validate()
    }
}
