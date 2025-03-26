// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemRetrieveParamsTest {

    @Test
    fun create() {
        LineItemRetrieveParams.builder()
            .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("itemizable_id")
            .id("id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LineItemRetrieveParams.builder()
                .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .id("id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("expected_payments")
        assertThat(params._pathParam(1)).isEqualTo("itemizable_id")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
