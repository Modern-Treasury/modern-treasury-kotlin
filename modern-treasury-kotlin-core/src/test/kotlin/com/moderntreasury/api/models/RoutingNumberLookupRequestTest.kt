package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberLookupRequestTest {

    @Test
    fun createRoutingNumberLookupRequest() {
        val routingNumberLookupRequest =
            RoutingNumberLookupRequest.builder()
                .routingNumber("string")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .supportedPaymentTypes(listOf(RoutingNumberLookupRequest.SupportedPaymentType.ACH))
                .bankName("string")
                .bankAddress(
                    RoutingNumberLookupRequest.AddressRequest.builder()
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .sanctions(RoutingNumberLookupRequest.Sanctions.builder().build())
                .build()
        assertThat(routingNumberLookupRequest).isNotNull
        assertThat(routingNumberLookupRequest.routingNumber()).isEqualTo("string")
        assertThat(routingNumberLookupRequest.routingNumberType())
            .isEqualTo(RoutingNumberLookupRequest.RoutingNumberType.ABA)
        assertThat(routingNumberLookupRequest.supportedPaymentTypes())
            .containsExactly(RoutingNumberLookupRequest.SupportedPaymentType.ACH)
        assertThat(routingNumberLookupRequest.bankName()).isEqualTo("string")
        assertThat(routingNumberLookupRequest.bankAddress())
            .isEqualTo(
                RoutingNumberLookupRequest.AddressRequest.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
        assertThat(routingNumberLookupRequest.sanctions())
            .isEqualTo(RoutingNumberLookupRequest.Sanctions.builder().build())
    }
}
