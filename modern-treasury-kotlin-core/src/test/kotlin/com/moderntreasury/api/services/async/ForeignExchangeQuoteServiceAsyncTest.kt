// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ForeignExchangeQuoteServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val foreignExchangeQuoteServiceAsync = client.foreignExchangeQuotes()

        val foreignExchangeQuote =
            foreignExchangeQuoteServiceAsync.create(
                ForeignExchangeQuoteCreateParams.builder()
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .targetCurrency(Currency.AED)
                    .baseAmount(0L)
                    .baseCurrency(Currency.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .targetAmount(0L)
                    .build()
            )

        foreignExchangeQuote.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val foreignExchangeQuoteServiceAsync = client.foreignExchangeQuotes()

        val foreignExchangeQuote =
            foreignExchangeQuoteServiceAsync.retrieve(
                ForeignExchangeQuoteRetrieveParams.builder().id("id").build()
            )

        foreignExchangeQuote.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val foreignExchangeQuoteServiceAsync = client.foreignExchangeQuotes()

        val page = foreignExchangeQuoteServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
