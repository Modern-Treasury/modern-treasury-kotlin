// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.Address
import com.moderntreasury.api.models.ContactDetail
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.ExternalAccountVerifyResponse
import com.moderntreasury.api.models.RoutingDetail
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/modern-treasury-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.connections()).isNotNull()
        assertThat(client.counterparties()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.expectedPayments()).isNotNull()
        assertThat(client.externalAccounts()).isNotNull()
        assertThat(client.incomingPaymentDetails()).isNotNull()
        assertThat(client.invoices()).isNotNull()
        assertThat(client.documents()).isNotNull()
        assertThat(client.accountCollectionFlows()).isNotNull()
        assertThat(client.accountDetails()).isNotNull()
        assertThat(client.routingDetails()).isNotNull()
        assertThat(client.internalAccounts()).isNotNull()
        assertThat(client.ledgers()).isNotNull()
        assertThat(client.ledgerAccountCategories()).isNotNull()
        assertThat(client.ledgerAccounts()).isNotNull()
        assertThat(client.ledgerAccountBalanceMonitors()).isNotNull()
        assertThat(client.ledgerAccountStatements()).isNotNull()
        assertThat(client.ledgerEntries()).isNotNull()
        assertThat(client.ledgerTransactions()).isNotNull()
        assertThat(client.lineItems()).isNotNull()
        assertThat(client.paymentFlows()).isNotNull()
        assertThat(client.paymentOrders()).isNotNull()
        assertThat(client.paymentReferences()).isNotNull()
        assertThat(client.returns()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.validations()).isNotNull()
        assertThat(client.virtualAccounts()).isNotNull()
        assertThat(client.bulkRequests()).isNotNull()
        assertThat(client.bulkResults()).isNotNull()
        assertThat(client.ledgerAccountSettlements()).isNotNull()
        assertThat(client.foreignExchangeQuotes()).isNotNull()
        assertThat(client.connectionLegalEntities()).isNotNull()
        assertThat(client.legalEntities()).isNotNull()
        assertThat(client.legalEntityAssociations()).isNotNull()
        assertThat(client.paymentActions()).isNotNull()
    }

    @Test
    fun counterpartyRoundtrip() {
        val jsonMapper = jsonMapper()
        val counterparty =
            Counterparty.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccount(
                    Counterparty.Account.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountDetail(
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
                        .accountType(ExternalAccountType.BASE_WALLET)
                        .addContactDetail(
                            ContactDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .contactIdentifier("contact_identifier")
                                .contactIdentifierType(ContactDetail.ContactIdentifierType.EMAIL)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalId("external_id")
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(
                            Counterparty.Account.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .object_("object")
                        .partyAddress(
                            Address.builder()
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
                        .partyType(Counterparty.Account.PartyType.BUSINESS)
                        .addRoutingDetail(
                            RoutingDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bankAddress(
                                    Address.builder()
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .verificationSource(Counterparty.Account.VerificationSource.ACH_PRENOTE)
                        .verificationStatus(
                            Counterparty.Account.VerificationStatus.PENDING_VERIFICATION
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainless.com")
                .externalId("external_id")
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    Counterparty.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .sendRemittanceAdvice(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationStatus("verification_status")
                .build()

        val roundtrippedCounterparty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterparty),
                jacksonTypeRef<Counterparty>(),
            )

        assertThat(roundtrippedCounterparty).isEqualTo(counterparty)
    }

    @Test
    fun externalAccountVerifyResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountVerifyResponse =
            ExternalAccountVerifyResponse.ofExternalAccount(
                ExternalAccount.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAccountDetail(
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
                    .accountType(ExternalAccountType.BASE_WALLET)
                    .addContactDetail(
                        ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(ContactDetail.ContactIdentifierType.EMAIL)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
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
                        Address.builder()
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
                    .addRoutingDetail(
                        RoutingDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .bankAddress(
                                Address.builder()
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
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .verificationSource(ExternalAccount.VerificationSource.ACH_PRENOTE)
                    .verificationStatus(ExternalAccount.VerificationStatus.PENDING_VERIFICATION)
                    .build()
            )

        val roundtrippedExternalAccountVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountVerifyResponse),
                jacksonTypeRef<ExternalAccountVerifyResponse>(),
            )

        assertThat(roundtrippedExternalAccountVerifyResponse)
            .isEqualTo(externalAccountVerifyResponse)
    }

    @Test
    fun externalAccountTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountType = ExternalAccountType.BASE_WALLET

        val roundtrippedExternalAccountType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountType),
                jacksonTypeRef<ExternalAccountType>(),
            )

        assertThat(roundtrippedExternalAccountType).isEqualTo(externalAccountType)
    }
}
