// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.put
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
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: ModernTreasuryClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ModernTreasuryOkHttpClient.builder()
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .webhookKey("My Webhook Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun counterpartiesCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
            CounterpartyCreateParams.builder()
                .name("string")
                .accounting(
                    CounterpartyCreateParams.Accounting.builder()
                        .type(CounterpartyCreateParams.Accounting.Type.CUSTOMER)
                        .build()
                )
                .accounts(
                    listOf(
                        CounterpartyCreateParams.Account.builder()
                            .accountDetails(
                                listOf(
                                    CounterpartyCreateParams.Account.AccountDetail.builder()
                                        .accountNumber("string")
                                        .accountNumberType(
                                            CounterpartyCreateParams.Account.AccountDetail
                                                .AccountNumberType
                                                .AU_NUMBER
                                        )
                                        .build()
                                )
                            )
                            .accountType(ExternalAccountType.CASH)
                            .contactDetails(
                                listOf(
                                    CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                        .builder()
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            CounterpartyCreateParams.Account
                                                .ContactDetailCreateRequest
                                                .ContactIdentifierType
                                                .EMAIL
                                        )
                                        .build()
                                )
                            )
                            .ledgerAccount(
                                CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                    .builder()
                                    .currency("string")
                                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("string")
                                    .normalBalance(TransactionDirection.CREDIT)
                                    .currencyExponent(123L)
                                    .description("string")
                                    .ledgerAccountCategoryIds(
                                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .LedgerableType
                                            .COUNTERPARTY
                                    )
                                    .metadata(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .build()
                            )
                            .metadata(CounterpartyCreateParams.Account.Metadata.builder().build())
                            .name("string")
                            .partyAddress(
                                CounterpartyCreateParams.Account.AddressRequest.builder()
                                    .country("string")
                                    .line1("string")
                                    .line2("string")
                                    .locality("string")
                                    .postalCode("string")
                                    .region("string")
                                    .build()
                            )
                            .partyIdentifier("string")
                            .partyName("string")
                            .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                            .plaidProcessorToken("string")
                            .routingDetails(
                                listOf(
                                    CounterpartyCreateParams.Account.RoutingDetail.builder()
                                        .routingNumber("string")
                                        .routingNumberType(
                                            CounterpartyCreateParams.Account.RoutingDetail
                                                .RoutingNumberType
                                                .ABA
                                        )
                                        .paymentType(
                                            CounterpartyCreateParams.Account.RoutingDetail
                                                .PaymentType
                                                .ACH
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .email("dev@stainlessapi.com")
                .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
                .legalEntity(
                    CounterpartyCreateParams.LegalEntityCreateRequest.builder()
                        .legalEntityType(
                            CounterpartyCreateParams.LegalEntityCreateRequest.LegalEntityType
                                .BUSINESS
                        )
                        .addresses(
                            listOf(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .LegalEntityAddressCreateRequest
                                    .builder()
                                    .country("string")
                                    .line1("string")
                                    .locality("string")
                                    .postalCode("string")
                                    .region("string")
                                    .addressTypes(
                                        listOf(
                                            CounterpartyCreateParams.LegalEntityCreateRequest
                                                .LegalEntityAddressCreateRequest
                                                .AddressType
                                                .BUSINESS
                                        )
                                    )
                                    .line2("string")
                                    .build()
                            )
                        )
                        .businessName("string")
                        .dateFormed(LocalDate.parse("2019-12-27"))
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .doingBusinessAsNames(listOf("string"))
                        .email("string")
                        .firstName("string")
                        .identifications(
                            listOf(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .IdentificationCreateRequest
                                    .builder()
                                    .idNumber("string")
                                    .idType(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
                                            .IdentificationCreateRequest
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("string")
                                    .build()
                            )
                        )
                        .lastName("string")
                        .legalEntityAssociations(
                            listOf(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .LegalEntityAssociationInlineCreateRequest
                                    .builder()
                                    .relationshipTypes(
                                        listOf(
                                            CounterpartyCreateParams.LegalEntityCreateRequest
                                                .LegalEntityAssociationInlineCreateRequest
                                                .RelationshipType
                                                .BENEFICIAL_OWNER
                                        )
                                    )
                                    .childLegalEntity(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
                                            .LegalEntityAssociationInlineCreateRequest
                                            .ChildLegalEntityCreate
                                            .builder()
                                            .addresses(
                                                listOf(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .LegalEntityAddressCreateRequest
                                                        .builder()
                                                        .country("string")
                                                        .line1("string")
                                                        .locality("string")
                                                        .postalCode("string")
                                                        .region("string")
                                                        .addressTypes(
                                                            listOf(
                                                                CounterpartyCreateParams
                                                                    .LegalEntityCreateRequest
                                                                    .LegalEntityAssociationInlineCreateRequest
                                                                    .ChildLegalEntityCreate
                                                                    .LegalEntityAddressCreateRequest
                                                                    .AddressType
                                                                    .BUSINESS
                                                            )
                                                        )
                                                        .line2("string")
                                                        .build()
                                                )
                                            )
                                            .businessName("string")
                                            .dateFormed(LocalDate.parse("2019-12-27"))
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .doingBusinessAsNames(listOf("string"))
                                            .email("string")
                                            .firstName("string")
                                            .identifications(
                                                listOf(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .IdentificationCreateRequest
                                                        .builder()
                                                        .idNumber("string")
                                                        .idType(
                                                            CounterpartyCreateParams
                                                                .LegalEntityCreateRequest
                                                                .LegalEntityAssociationInlineCreateRequest
                                                                .ChildLegalEntityCreate
                                                                .IdentificationCreateRequest
                                                                .IdType
                                                                .AR_CUIL
                                                        )
                                                        .issuingCountry("string")
                                                        .build()
                                                )
                                            )
                                            .lastName("string")
                                            .legalEntityType(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .LegalEntityType
                                                    .BUSINESS
                                            )
                                            .legalStructure(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .LegalStructure
                                                    .CORPORATION
                                            )
                                            .metadata(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .Metadata
                                                    .builder()
                                                    .build()
                                            )
                                            .phoneNumbers(
                                                listOf(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .PhoneNumber
                                                        .builder()
                                                        .phoneNumber("string")
                                                        .build()
                                                )
                                            )
                                            .riskRating(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .RiskRating
                                                    .LOW
                                            )
                                            .website("string")
                                            .build()
                                    )
                                    .childLegalEntityId("string")
                                    .ownershipPercentage(123L)
                                    .title("string")
                                    .build()
                            )
                        )
                        .legalStructure(
                            CounterpartyCreateParams.LegalEntityCreateRequest.LegalStructure
                                .CORPORATION
                        )
                        .metadata(
                            CounterpartyCreateParams.LegalEntityCreateRequest.Metadata.builder()
                                .build()
                        )
                        .phoneNumbers(
                            listOf(
                                CounterpartyCreateParams.LegalEntityCreateRequest.PhoneNumber
                                    .builder()
                                    .phoneNumber("string")
                                    .build()
                            )
                        )
                        .riskRating(
                            CounterpartyCreateParams.LegalEntityCreateRequest.RiskRating.LOW
                        )
                        .website("string")
                        .build()
                )
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(CounterpartyCreateParams.Metadata.builder().build())
                .sendRemittanceAdvice(true)
                .taxpayerIdentifier("string")
                .verificationStatus(CounterpartyCreateParams.VerificationStatus.DENIED)
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Counterparty.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounts(
                    listOf(
                        Counterparty.Account.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountDetails(
                                listOf(
                                    AccountDetail.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .accountNumberSafe("string")
                                        .accountNumberType(
                                            AccountDetail.AccountNumberType.AU_NUMBER
                                        )
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .liveMode(true)
                                        .object_("string")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .accountNumber("string")
                                        .build()
                                )
                            )
                            .accountType(ExternalAccountType.CASH)
                            .contactDetails(
                                listOf(
                                    Counterparty.Account.ContactDetail.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            Counterparty.Account.ContactDetail.ContactIdentifierType
                                                .EMAIL
                                        )
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .liveMode(true)
                                        .object_("string")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .liveMode(true)
                            .metadata(Counterparty.Account.Metadata.builder().build())
                            .name("string")
                            .object_("string")
                            .partyAddress(
                                Counterparty.Account.Address.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .country("string")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("string")
                                    .line2("string")
                                    .liveMode(true)
                                    .locality("string")
                                    .object_("string")
                                    .postalCode("string")
                                    .region("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .partyName("string")
                            .partyType(Counterparty.Account.PartyType.BUSINESS)
                            .routingDetails(
                                listOf(
                                    RoutingDetail.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .bankAddress(
                                            RoutingDetail.Address.builder()
                                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .country("string")
                                                .createdAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .line1("string")
                                                .line2("string")
                                                .liveMode(true)
                                                .locality("string")
                                                .object_("string")
                                                .postalCode("string")
                                                .region("string")
                                                .updatedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                        .bankName("string")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .liveMode(true)
                                        .object_("string")
                                        .paymentType(RoutingDetail.PaymentType.ACH)
                                        .routingNumber("string")
                                        .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .verificationSource(Counterparty.Account.VerificationSource.ACH_PRENOTE)
                            .verificationStatus(
                                Counterparty.Account.VerificationStatus.PENDING_VERIFICATION
                            )
                            .build()
                    )
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainlessapi.com")
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(Counterparty.Metadata.builder().build())
                .name("string")
                .object_("string")
                .sendRemittanceAdvice(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationStatus(Counterparty.VerificationStatus.DENIED)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.counterparties().create(params)

        verify(postRequestedFor(anyUrl()))
    }
}
