// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberLookupRequestTest {

    @Test
    fun createRoutingNumberLookupRequest() {
        val routingNumberLookupRequest =
            RoutingNumberLookupRequest.builder()
                .bankAddress(
                    RoutingNumberLookupRequest.AddressRequest.builder()
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .build()
                )
                .bankName("string")
                .routingNumber("string")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .sanctions(RoutingNumberLookupRequest.Sanctions.builder().build())
                .supportedPaymentTypes(listOf(RoutingNumberLookupRequest.SupportedPaymentType.ACH))
                .build()
        assertThat(routingNumberLookupRequest).isNotNull
        assertThat(routingNumberLookupRequest.bankAddress())
            .isEqualTo(
                RoutingNumberLookupRequest.AddressRequest.builder()
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .build()
            )
        assertThat(routingNumberLookupRequest.bankName()).isEqualTo("string")
        assertThat(routingNumberLookupRequest.routingNumber()).isEqualTo("string")
        assertThat(routingNumberLookupRequest.routingNumberType())
            .isEqualTo(RoutingNumberLookupRequest.RoutingNumberType.ABA)
        assertThat(routingNumberLookupRequest.sanctions())
            .isEqualTo(RoutingNumberLookupRequest.Sanctions.builder().build())
        assertThat(routingNumberLookupRequest.supportedPaymentTypes())
            .containsExactly(RoutingNumberLookupRequest.SupportedPaymentType.ACH)
    }
}
