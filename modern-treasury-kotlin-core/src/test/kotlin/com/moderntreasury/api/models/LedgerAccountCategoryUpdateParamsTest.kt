// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryUpdateParamsTest {

    @Test
    fun createLedgerAccountCategoryUpdateParams() {
        LedgerAccountCategoryUpdateParams.builder()
            .id("string")
            .description("string")
            .metadata(LedgerAccountCategoryUpdateParams.Metadata.builder().build())
            .name("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCategoryUpdateParams.builder()
                .id("string")
                .description("string")
                .metadata(LedgerAccountCategoryUpdateParams.Metadata.builder().build())
                .name("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountCategoryUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerAccountCategoryUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountCategoryUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
