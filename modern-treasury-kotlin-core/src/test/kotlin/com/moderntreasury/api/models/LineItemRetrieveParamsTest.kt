package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemRetrieveParamsTest {

    @Test
    fun createLineItemRetrieveParams() {
        LineItemRetrieveParams.builder()
            .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("string")
            .id("string")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            LineItemRetrieveParams.builder()
                .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("string")
                .id("string")
                .build()
        assertThat(params).isNotNull
        // path param "itemizableType"
        assertThat(params.getPathParam(0))
            .isEqualTo(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS.toString())
        // path param "itemizableId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
