// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ForeignExchangeQuoteServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val foreignExchangeQuoteService = client.foreignExchangeQuotes()
        val foreignExchangeQuote =
            foreignExchangeQuoteService.create(
                ForeignExchangeQuoteCreateParams.builder()
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .targetCurrency(Currency.AED)
                    .baseAmount(123L)
                    .baseCurrency(Currency.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .targetAmount(123L)
                    .build()
            )
        println(foreignExchangeQuote)
        foreignExchangeQuote.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val foreignExchangeQuoteService = client.foreignExchangeQuotes()
        val foreignExchangeQuote =
            foreignExchangeQuoteService.retrieve(
                ForeignExchangeQuoteRetrieveParams.builder().id("string").build()
            )
        println(foreignExchangeQuote)
        foreignExchangeQuote.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val foreignExchangeQuoteService = client.foreignExchangeQuotes()
        val response =
            foreignExchangeQuoteService.list(ForeignExchangeQuoteListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
