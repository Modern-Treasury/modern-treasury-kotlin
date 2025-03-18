// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidationValidateRoutingNumberParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("routing_number", "routing_number")
                    .put("routing_number_type", "aba")
                    .build()
            )
    }
}
