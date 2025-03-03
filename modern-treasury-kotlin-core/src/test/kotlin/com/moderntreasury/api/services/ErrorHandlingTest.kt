// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.jsonMapper
import com.moderntreasury.api.errors.BadRequestException
import com.moderntreasury.api.errors.InternalServerException
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.errors.ModernTreasuryException
import com.moderntreasury.api.errors.NotFoundException
import com.moderntreasury.api.errors.PermissionDeniedException
import com.moderntreasury.api.errors.RateLimitException
import com.moderntreasury.api.errors.UnauthorizedException
import com.moderntreasury.api.errors.UnexpectedStatusCodeException
import com.moderntreasury.api.errors.UnprocessableEntityException
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.TransactionDirection
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
class ErrorHandlingTest {

    companion object {

        private val ERROR: ModernTreasuryError =
            ModernTreasuryError.builder()
                .putAdditionalProperty("errorProperty", JsonValue.from("42"))
                .build()

        private val ERROR_JSON: ByteArray = jsonMapper().writeValueAsBytes(ERROR)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: ModernTreasuryClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
    }

    @Test
    fun externalAccountsCreate400() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<BadRequestException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate401() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnauthorizedException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate403() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<PermissionDeniedException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate404() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<NotFoundException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate422() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate429() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<RateLimitException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate500() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<InternalServerException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreate999() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun externalAccountsCreateInvalidJsonBody() {
        val externalAccountService = client.externalAccounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<ModernTreasuryException> {
                externalAccountService.create(
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
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
