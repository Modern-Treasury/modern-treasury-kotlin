// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountsType
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutingDetailServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val routingDetailServiceAsync = client.routingDetails()

        val routingDetail =
            routingDetailServiceAsync.create(
                RoutingDetailCreateParams.builder()
                    .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .routingNumber("routing_number")
                    .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                    .paymentType(RoutingDetailCreateParams.PaymentType.ACH)
                    .build()
            )

        routingDetail.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val routingDetailServiceAsync = client.routingDetails()

        val routingDetail =
            routingDetailServiceAsync.retrieve(
                RoutingDetailRetrieveParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .id("id")
                    .build()
            )

        routingDetail.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val routingDetailServiceAsync = client.routingDetails()

        val page =
            routingDetailServiceAsync.list(
                RoutingDetailListParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .build()
            )

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val routingDetailServiceAsync = client.routingDetails()

        routingDetailServiceAsync.delete(
            RoutingDetailDeleteParams.builder()
                .accountsType(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .id("id")
                .build()
        )
    }
}
