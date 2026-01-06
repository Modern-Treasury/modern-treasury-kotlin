// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingDetailCreateTest {

    @Test
    fun create() {
        val routingDetailCreate =
            RoutingDetailCreate.builder()
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                .paymentType(RoutingDetailCreate.PaymentType.ACH)
                .build()

        assertThat(routingDetailCreate.routingNumber()).isEqualTo("routing_number")
        assertThat(routingDetailCreate.routingNumberType())
            .isEqualTo(RoutingDetailCreate.RoutingNumberType.ABA)
        assertThat(routingDetailCreate.paymentType()).isEqualTo(RoutingDetailCreate.PaymentType.ACH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingDetailCreate =
            RoutingDetailCreate.builder()
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                .paymentType(RoutingDetailCreate.PaymentType.ACH)
                .build()

        val roundtrippedRoutingDetailCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingDetailCreate),
                jacksonTypeRef<RoutingDetailCreate>(),
            )

        assertThat(roundtrippedRoutingDetailCreate).isEqualTo(routingDetailCreate)
    }
}
