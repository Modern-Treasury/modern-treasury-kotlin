package com.moderntreasury.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonString
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.ExternalAccountListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val API_KEY: String = "apiKey"

    private lateinit var client: ModernTreasuryClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ModernTreasuryOkHttpClient.builder()
                .apiKey(API_KEY)
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
    }

    @Test
    fun externalAccountsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
            ExternalAccountCreateParams.builder()
                .accountType(ExternalAccountType.CASH)
                .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
                .partyAddress(
                    ExternalAccountCreateParams.AddressRequest.builder()
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .name("string")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("string")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType.IBAN
                            )
                            .build()
                    )
                )
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("string")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .metadata(ExternalAccountCreateParams.Metadata.builder().build())
                .partyName("string")
                .partyIdentifier("string")
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .name("string")
                        .description("string")
                        .normalBalance(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.NormalBalance
                                .CREDIT
                        )
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency("string")
                        .currencyExponent(123L)
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                                .EXTERNAL_ACCOUNT
                        )
                        .metadata(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
                .plaidProcessorToken("string")
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("string")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ExternalAccount.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountType(ExternalAccountType.CASH)
                .partyType(ExternalAccount.PartyType.BUSINESS)
                .partyAddress(
                    ExternalAccount.Address.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .object_("string")
                        .liveMode(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .name("string")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        AccountDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .accountNumber("string")
                            .accountNumberType(AccountDetail.AccountNumberType.CLABE)
                            .accountNumberSafe("string")
                            .build()
                    )
                )
                .routingDetails(
                    listOf(
                        RoutingDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .routingNumber("string")
                            .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                            .paymentType(RoutingDetail.PaymentType.ACH)
                            .bankName("string")
                            .bankAddress(
                                RoutingDetail.Address.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .object_("string")
                                    .liveMode(true)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("string")
                                    .line2("string")
                                    .locality("string")
                                    .region("string")
                                    .postalCode("string")
                                    .country("string")
                                    .build()
                            )
                            .build()
                    )
                )
                .metadata(ExternalAccount.Metadata.builder().build())
                .partyName("string")
                .contactDetails(
                    listOf(
                        ExternalAccount.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .contactIdentifier("string")
                            .contactIdentifierType(
                                ExternalAccount.ContactDetail.ContactIdentifierType.EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .verificationStatus(ExternalAccount.VerificationStatus.PENDING_VERIFICATION)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.externalAccounts().create(params)

        verify(postRequestedFor(anyUrl()))
    }

    @Test
    fun externalAccountsListWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            ExternalAccountListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .partyName("string")
                .counterpartyId("string")
                .metadata(ExternalAccountListParams.Metadata.builder().build())
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok("[]"))
        )

        client.externalAccounts().list(params)

        verify(getRequestedFor(anyUrl()))
    }
}
