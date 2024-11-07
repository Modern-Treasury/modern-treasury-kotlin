// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValidationValidateRoutingNumberParamsTest {

    @Test
    fun createValidationValidateRoutingNumberParams() {
        ValidationValidateRoutingNumberParams.builder()
            .routingNumber("routing_number")
            .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ValidationValidateRoutingNumberParams.builder()
                .routingNumber("routing_number")
                .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                .build()
        val expected = QueryParams.builder()
        expected.put("routing_number", "routing_number")
        expected.put(
            "routing_number_type",
            ValidationValidateRoutingNumberParams.RoutingNumberType.ABA.toString()
        )
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ValidationValidateRoutingNumberParams.builder()
                .routingNumber("routing_number")
                .routingNumberType(ValidationValidateRoutingNumberParams.RoutingNumberType.ABA)
                .build()
        val expected = QueryParams.builder()
        expected.put("routing_number", "routing_number")
        expected.put(
            "routing_number_type",
            ValidationValidateRoutingNumberParams.RoutingNumberType.ABA.toString()
        )
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
