package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerUpdateParamsTest {

    @Test
    fun createLedgerUpdateParams() {
        LedgerUpdateParams.builder()
            .id("string")
            .description("string")
            .metadata(LedgerUpdateParams.Metadata.builder().build())
            .name("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerUpdateParams.builder()
                .id("string")
                .description("string")
                .metadata(LedgerUpdateParams.Metadata.builder().build())
                .name("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata()).isEqualTo(LedgerUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
