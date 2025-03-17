// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingNumberLookupRequestTest {

    @Test
    fun createRoutingNumberLookupRequest() {
        val routingNumberLookupRequest =
            RoutingNumberLookupRequest.builder()
                .bankAddress(
                    RoutingNumberLookupRequest.AddressRequest.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .bankName("bank_name")
                .routingNumber("routing_number")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .sanctions(
                    RoutingNumberLookupRequest.Sanctions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .supportedPaymentTypes(
                    listOf(
                        RoutingNumberLookupRequest.SupportedPaymentType.ACH,
                        RoutingNumberLookupRequest.SupportedPaymentType.AU_BECS,
                        RoutingNumberLookupRequest.SupportedPaymentType.BACS,
                        RoutingNumberLookupRequest.SupportedPaymentType.BOOK,
                        RoutingNumberLookupRequest.SupportedPaymentType.CARD,
                        RoutingNumberLookupRequest.SupportedPaymentType.CHATS,
                        RoutingNumberLookupRequest.SupportedPaymentType.CHECK,
                        RoutingNumberLookupRequest.SupportedPaymentType.CROSS_BORDER,
                        RoutingNumberLookupRequest.SupportedPaymentType.DK_NETS,
                        RoutingNumberLookupRequest.SupportedPaymentType.EFT,
                        RoutingNumberLookupRequest.SupportedPaymentType.HU_ICS,
                        RoutingNumberLookupRequest.SupportedPaymentType.INTERAC,
                        RoutingNumberLookupRequest.SupportedPaymentType.MASAV,
                        RoutingNumberLookupRequest.SupportedPaymentType.MX_CCEN,
                        RoutingNumberLookupRequest.SupportedPaymentType.NEFT,
                        RoutingNumberLookupRequest.SupportedPaymentType.NICS,
                        RoutingNumberLookupRequest.SupportedPaymentType.NZ_BECS,
                        RoutingNumberLookupRequest.SupportedPaymentType.PL_ELIXIR,
                        RoutingNumberLookupRequest.SupportedPaymentType.PROVXCHANGE,
                        RoutingNumberLookupRequest.SupportedPaymentType.RO_SENT,
                        RoutingNumberLookupRequest.SupportedPaymentType.RTP,
                        RoutingNumberLookupRequest.SupportedPaymentType.SE_BANKGIROT,
                        RoutingNumberLookupRequest.SupportedPaymentType.SEN,
                        RoutingNumberLookupRequest.SupportedPaymentType.SEPA,
                        RoutingNumberLookupRequest.SupportedPaymentType.SG_GIRO,
                        RoutingNumberLookupRequest.SupportedPaymentType.SIC,
                        RoutingNumberLookupRequest.SupportedPaymentType.SIGNET,
                        RoutingNumberLookupRequest.SupportedPaymentType.SKNBI,
                        RoutingNumberLookupRequest.SupportedPaymentType.WIRE,
                        RoutingNumberLookupRequest.SupportedPaymentType.ZENGIN,
                    )
                )
                .build()
        assertThat(routingNumberLookupRequest).isNotNull
        assertThat(routingNumberLookupRequest.bankAddress())
            .isEqualTo(
                RoutingNumberLookupRequest.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(routingNumberLookupRequest.bankName()).isEqualTo("bank_name")
        assertThat(routingNumberLookupRequest.routingNumber()).isEqualTo("routing_number")
        assertThat(routingNumberLookupRequest.routingNumberType())
            .isEqualTo(RoutingNumberLookupRequest.RoutingNumberType.ABA)
        assertThat(routingNumberLookupRequest.sanctions())
            .isEqualTo(
                RoutingNumberLookupRequest.Sanctions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(routingNumberLookupRequest.supportedPaymentTypes())
            .containsExactly(
                RoutingNumberLookupRequest.SupportedPaymentType.ACH,
                RoutingNumberLookupRequest.SupportedPaymentType.AU_BECS,
                RoutingNumberLookupRequest.SupportedPaymentType.BACS,
                RoutingNumberLookupRequest.SupportedPaymentType.BOOK,
                RoutingNumberLookupRequest.SupportedPaymentType.CARD,
                RoutingNumberLookupRequest.SupportedPaymentType.CHATS,
                RoutingNumberLookupRequest.SupportedPaymentType.CHECK,
                RoutingNumberLookupRequest.SupportedPaymentType.CROSS_BORDER,
                RoutingNumberLookupRequest.SupportedPaymentType.DK_NETS,
                RoutingNumberLookupRequest.SupportedPaymentType.EFT,
                RoutingNumberLookupRequest.SupportedPaymentType.HU_ICS,
                RoutingNumberLookupRequest.SupportedPaymentType.INTERAC,
                RoutingNumberLookupRequest.SupportedPaymentType.MASAV,
                RoutingNumberLookupRequest.SupportedPaymentType.MX_CCEN,
                RoutingNumberLookupRequest.SupportedPaymentType.NEFT,
                RoutingNumberLookupRequest.SupportedPaymentType.NICS,
                RoutingNumberLookupRequest.SupportedPaymentType.NZ_BECS,
                RoutingNumberLookupRequest.SupportedPaymentType.PL_ELIXIR,
                RoutingNumberLookupRequest.SupportedPaymentType.PROVXCHANGE,
                RoutingNumberLookupRequest.SupportedPaymentType.RO_SENT,
                RoutingNumberLookupRequest.SupportedPaymentType.RTP,
                RoutingNumberLookupRequest.SupportedPaymentType.SE_BANKGIROT,
                RoutingNumberLookupRequest.SupportedPaymentType.SEN,
                RoutingNumberLookupRequest.SupportedPaymentType.SEPA,
                RoutingNumberLookupRequest.SupportedPaymentType.SG_GIRO,
                RoutingNumberLookupRequest.SupportedPaymentType.SIC,
                RoutingNumberLookupRequest.SupportedPaymentType.SIGNET,
                RoutingNumberLookupRequest.SupportedPaymentType.SKNBI,
                RoutingNumberLookupRequest.SupportedPaymentType.WIRE,
                RoutingNumberLookupRequest.SupportedPaymentType.ZENGIN,
            )
    }
}
