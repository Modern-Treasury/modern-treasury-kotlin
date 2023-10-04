// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemUpdateParamsTest {

    @Test
    fun createLineItemUpdateParams() {
        LineItemUpdateParams.builder()
            .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("string")
            .id("string")
            .metadata(LineItemUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("string")
                .id("string")
                .metadata(LineItemUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metadata()).isEqualTo(LineItemUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("string")
                .id("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("string")
                .id("string")
                .build()
        assertThat(params).isNotNull
        // path param "itemizableType"
        assertThat(params.getPathParam(0))
            .isEqualTo(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS.toString())
        // path param "itemizableId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
