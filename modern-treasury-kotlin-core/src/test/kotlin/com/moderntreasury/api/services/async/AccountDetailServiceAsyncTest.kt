// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams
import com.moderntreasury.api.models.AccountsType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountDetailServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailServiceAsync = client.accountDetails()

        val accountDetail =
            accountDetailServiceAsync.create(
                AccountDetailCreateParams.builder()
                    .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .accountNumber("account_number")
                    .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
                    .build()
            )

        accountDetail.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailServiceAsync = client.accountDetails()

        val accountDetail =
            accountDetailServiceAsync.retrieve(
                AccountDetailRetrieveParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .id("id")
                    .build()
            )

        accountDetail.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailServiceAsync = client.accountDetails()

        val page =
            accountDetailServiceAsync.list(
                AccountDetailListParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .build()
            )

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
        val accountDetailServiceAsync = client.accountDetails()

        accountDetailServiceAsync.delete(
            AccountDetailDeleteParams.builder()
                .accountsType(AccountDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .id("id")
                .build()
        )
    }
}
