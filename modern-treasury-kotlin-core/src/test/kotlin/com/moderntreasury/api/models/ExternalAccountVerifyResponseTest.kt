// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExternalAccountVerifyResponseTest {

    @Test
    fun ofExternalAccount() {
        val externalAccount =
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

        val externalAccountVerifyResponse =
            ExternalAccountVerifyResponse.ofExternalAccount(externalAccount)

        assertThat(externalAccountVerifyResponse.externalAccount()).isEqualTo(externalAccount)
        assertThat(externalAccountVerifyResponse.verificationAttempt()).isNull()
    }

    @Test
    fun ofExternalAccountRoundtrip() {
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
    fun ofVerificationAttempt() {
        val verificationAttempt =
            ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(
                    ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.PaymentType.ACH
                )
                .priority(
                    ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.Priority.HIGH
                )
                .status(
                    ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.Status
                        .CANCELLED
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val externalAccountVerifyResponse =
            ExternalAccountVerifyResponse.ofVerificationAttempt(verificationAttempt)

        assertThat(externalAccountVerifyResponse.externalAccount()).isNull()
        assertThat(externalAccountVerifyResponse.verificationAttempt())
            .isEqualTo(verificationAttempt)
    }

    @Test
    fun ofVerificationAttemptRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountVerifyResponse =
            ExternalAccountVerifyResponse.ofVerificationAttempt(
                ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .object_("object")
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(
                        ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.PaymentType
                            .ACH
                    )
                    .priority(
                        ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.Priority
                            .HIGH
                    )
                    .status(
                        ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.Status
                            .CANCELLED
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val externalAccountVerifyResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<ExternalAccountVerifyResponse>())

        val e =
            assertThrows<ModernTreasuryInvalidDataException> {
                externalAccountVerifyResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
