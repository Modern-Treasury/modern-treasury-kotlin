package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.RoutingDetailListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutingDetailServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val routingDetailService = client.routingDetails()
        val routingDetail =
            routingDetailService.create(
                RoutingDetailCreateParams.builder()
                    .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("string")
                    .routingNumber("string")
                    .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                    .paymentType(RoutingDetailCreateParams.PaymentType.ACH)
                    .build()
            )
        println(routingDetail)
        routingDetail.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val routingDetailService = client.routingDetails()
        val routingDetail =
            routingDetailService.retrieve(
                RoutingDetailRetrieveParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("string")
                    .id("string")
                    .build()
            )
        println(routingDetail)
        routingDetail.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val routingDetailService = client.routingDetails()
        val response =
            routingDetailService.list(
                RoutingDetailListParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("string")
                    .build()
            )
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
                .webhookKey("string")
                .build()
        val routingDetailService = client.routingDetails()
        routingDetailService.delete(
            RoutingDetailDeleteParams.builder()
                .accountsType(RoutingDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .id("string")
                .build()
        )
    }
}
