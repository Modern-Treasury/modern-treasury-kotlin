// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonString
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
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val MODERN_TREASURY_ERROR: ModernTreasuryError =
        ModernTreasuryError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: ModernTreasuryClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .webhookKey("My Webhook Key")
                .build()
    }

    @Test
    fun externalAccountsCreate200() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        val expected =
            ExternalAccount.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        AccountDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountNumberSafe("account_number_safe")
                            .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .accountNumber("account_number")
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccount.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccount.ContactDetail.ContactIdentifierType.EMAIL
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    ExternalAccount.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .partyAddress(
                    ExternalAccount.Address.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .country("country")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .line1("line1")
                        .line2("line2")
                        .liveMode(true)
                        .locality("locality")
                        .object_("object")
                        .postalCode("postal_code")
                        .region("region")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .partyName("party_name")
                .partyType(ExternalAccount.PartyType.BUSINESS)
                .routingDetails(
                    listOf(
                        RoutingDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .bankAddress(
                                RoutingDetail.Address.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .country("country")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("line1")
                                    .line2("line2")
                                    .liveMode(true)
                                    .locality("locality")
                                    .object_("object")
                                    .postalCode("postal_code")
                                    .region("region")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .bankName("bank_name")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .paymentType(RoutingDetail.PaymentType.ACH)
                            .routingNumber("routing_number")
                            .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationSource(ExternalAccount.VerificationSource.ACH_PRENOTE)
                .verificationStatus(ExternalAccount.VerificationStatus.PENDING_VERIFICATION)
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.externalAccounts().create(params)).isEqualTo(expected)
    }

    @Test
    fun externalAccountsCreate400() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun externalAccountsCreate401() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertUnauthorized(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun externalAccountsCreate403() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun externalAccountsCreate404() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertNotFound(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun externalAccountsCreate422() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun externalAccountsCreate429() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertRateLimit(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun externalAccountsCreate500() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    MODERN_TREASURY_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader("Foo", "Bar").withBody(toJson(MODERN_TREASURY_ERROR))
                )
        )

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(MODERN_TREASURY_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(ModernTreasuryException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
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
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.externalAccounts().create(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    Headers.builder().build(),
                    ModernTreasuryError.builder().build()
                )
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: Headers,
        error: ModernTreasuryError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: Headers,
        error: ModernTreasuryError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: ModernTreasuryError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: ModernTreasuryError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: ModernTreasuryError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: Headers,
        error: ModernTreasuryError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: Headers,
        error: ModernTreasuryError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
