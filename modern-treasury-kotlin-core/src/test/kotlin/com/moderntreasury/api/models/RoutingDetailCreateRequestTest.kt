// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingDetailCreateRequestTest {

    @Test
    fun create() {
        val routingDetailCreateRequest =
            RoutingDetailCreateRequest.builder()
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateRequest.RoutingNumberType.ABA)
                .paymentType(RoutingDetailCreateRequest.PaymentType.ACH)
                .build()

        assertThat(routingDetailCreateRequest.routingNumber()).isEqualTo("routing_number")
        assertThat(routingDetailCreateRequest.routingNumberType())
            .isEqualTo(RoutingDetailCreateRequest.RoutingNumberType.ABA)
        assertThat(routingDetailCreateRequest.paymentType())
            .isEqualTo(RoutingDetailCreateRequest.PaymentType.ACH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingDetailCreateRequest =
            RoutingDetailCreateRequest.builder()
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateRequest.RoutingNumberType.ABA)
                .paymentType(RoutingDetailCreateRequest.PaymentType.ACH)
                .build()

        val roundtrippedRoutingDetailCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingDetailCreateRequest),
                jacksonTypeRef<RoutingDetailCreateRequest>(),
            )

        assertThat(roundtrippedRoutingDetailCreateRequest).isEqualTo(routingDetailCreateRequest)
    }
}
