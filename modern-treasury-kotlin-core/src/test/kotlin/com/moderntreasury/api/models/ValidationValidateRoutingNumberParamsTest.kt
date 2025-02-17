// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValidationValidateRoutingNumberParamsTest {

    @Test
    fun create() {
        ValidationValidateRoutingNumberParams.builder()
            .routingNumber("routing_number")
            .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ValidationValidateRoutingNumberParams.builder()
                .routingNumber("routing_number")
                .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                .build()
        val expected = QueryParams.builder()
        expected.put("routing_number", "routing_number")
        expected.put(
            "routing_number_type",
            ValidationValidateRoutingNumberParams.RoutingNumberType.ABA.toString(),
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ValidationValidateRoutingNumberParams.builder()
                .routingNumber("routing_number")
                .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                .build()
        val expected = QueryParams.builder()
        expected.put("routing_number", "routing_number")
        expected.put(
            "routing_number_type",
            ValidationValidateRoutingNumberParams.RoutingNumberType.ABA.toString(),
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
