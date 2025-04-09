// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.TransactionDirection
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalAccountServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
                ExternalAccountCreateParams.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAccountDetail(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                    .accountType(ExternalAccountType.CASH)
                    .addContactDetail(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                    .ledgerAccount(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                            .currency("currency")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .normalBalance(TransactionDirection.CREDIT)
                            .currencyExponent(0L)
                            .description("description")
                            .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
                            )
                            .metadata(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        ExternalAccountCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .partyAddress(
                        ExternalAccountCreateParams.AddressRequest.builder()
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .build()
                    )
                    .partyIdentifier("party_identifier")
                    .partyName("party_name")
                    .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .addRoutingDetail(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.retrieve(
                ExternalAccountRetrieveParams.builder().id("id").build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.update(
                ExternalAccountUpdateParams.builder()
                    .id("id")
                    .accountType(ExternalAccountType.CASH)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        ExternalAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .partyAddress(
                        ExternalAccountUpdateParams.AddressRequest.builder()
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .build()
                    )
                    .partyName("party_name")
                    .partyType(ExternalAccountUpdateParams.PartyType.BUSINESS)
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val page = externalAccountServiceAsync.list()

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
        val externalAccountServiceAsync = client.externalAccounts()

        externalAccountServiceAsync.delete(ExternalAccountDeleteParams.builder().id("id").build())
    }

    @Test
    suspend fun completeVerification() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.completeVerification(
                ExternalAccountCompleteVerificationParams.builder()
                    .id("id")
                    .addAmount(2L)
                    .addAmount(4L)
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    suspend fun verify() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val response =
            externalAccountServiceAsync.verify(
                ExternalAccountVerifyParams.builder()
                    .id("id")
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                    .currency(Currency.AED)
                    .fallbackType(ExternalAccountVerifyParams.FallbackType.ACH)
                    .priority(ExternalAccountVerifyParams.Priority.HIGH)
                    .build()
            )

        response.validate()
    }
}
