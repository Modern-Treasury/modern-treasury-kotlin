// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemRetrieveParamsTest {

    @Test
    fun createLineItemRetrieveParams() {
        LineItemRetrieveParams.builder()
            .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("itemizable_id")
            .id("id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            LineItemRetrieveParams.builder()
                .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .id("id")
                .build()
        assertThat(params).isNotNull
        // path param "itemizableType"
        assertThat(params.getPathParam(0))
            .isEqualTo(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS.toString())
        // path param "itemizableId"
        assertThat(params.getPathParam(1)).isEqualTo("itemizable_id")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
