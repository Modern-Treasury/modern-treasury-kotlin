// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InternalAccountServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()

        val internalAccount =
            internalAccountService.create(
                InternalAccountCreateParams.builder()
                    .connectionId("connection_id")
                    .currency(InternalAccountCreateParams.Currency.USD)
                    .name("name")
                    .partyName("party_name")
                    .addAccountCapability(
                        InternalAccountCreateParams.AccountCapability.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .direction(TransactionDirection.CREDIT)
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .identifier("identifier")
                            .liveMode(true)
                            .object_("object")
                            .paymentType(
                                InternalAccountCreateParams.AccountCapability.PaymentType.ACH
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .accountType(InternalAccountCreateParams.AccountType.CHECKING)
                    .counterpartyId("counterparty_id")
                    .legalEntityId("legal_entity_id")
                    .parentAccountId("parent_account_id")
                    .partyAddress(
                        InternalAccountCreateParams.PartyAddress.builder()
                            .country("country")
                            .line1("line1")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .line2("line2")
                            .build()
                    )
                    .vendorAttributes(
                        InternalAccountCreateParams.VendorAttributes.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        internalAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()

        val internalAccount = internalAccountService.retrieve("id")

        internalAccount.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()

        val internalAccount =
            internalAccountService.update(
                InternalAccountUpdateParams.builder()
                    .id("id")
                    .contraLedgerAccountId("contra_ledger_account_id")
                    .counterpartyId("counterparty_id")
                    .ledgerAccountId("ledger_account_id")
                    .metadata(
                        InternalAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .parentAccountId("parent_account_id")
                    .build()
            )

        internalAccount.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()

        val page = internalAccountService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun requestClosure() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()

        val internalAccount = internalAccountService.requestClosure("id")

        internalAccount.validate()
    }

    @Test
    fun updateAccountCapability() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()

        val response =
            internalAccountService.updateAccountCapability(
                InternalAccountUpdateAccountCapabilityParams.builder()
                    .internalAccountId("internal_account_id")
                    .id("id")
                    .identifier("identifier")
                    .build()
            )

        response.validate()
    }
}
