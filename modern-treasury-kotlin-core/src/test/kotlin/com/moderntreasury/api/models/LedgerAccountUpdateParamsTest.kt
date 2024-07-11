// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountUpdateParamsTest {

    @Test
    fun createLedgerAccountUpdateParams() {
        LedgerAccountUpdateParams.builder()
            .id("id")
            .description("description")
            .metadata(LedgerAccountUpdateParams.Metadata.builder().build())
            .name("name")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountUpdateParams.builder()
                .id("id")
                .description("description")
                .metadata(LedgerAccountUpdateParams.Metadata.builder().build())
                .name("name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata()).isEqualTo(LedgerAccountUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerAccountUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
