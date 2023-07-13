package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountUpdateParamsTest {

    @Test
    fun createInternalAccountUpdateParams() {
        InternalAccountUpdateParams.builder()
            .id("string")
            .name("string")
            .metadata(InternalAccountUpdateParams.Metadata.builder().build())
            .parentAccountId("string")
            .counterpartyId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InternalAccountUpdateParams.builder()
                .id("string")
                .name("string")
                .metadata(InternalAccountUpdateParams.Metadata.builder().build())
                .parentAccountId("string")
                .counterpartyId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(InternalAccountUpdateParams.Metadata.builder().build())
        assertThat(body.parentAccountId()).isEqualTo("string")
        assertThat(body.counterpartyId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InternalAccountUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InternalAccountUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
