// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionLegalEntityUpdateParamsTest {

    @Test
    fun createConnectionLegalEntityUpdateParams() {
        ConnectionLegalEntityUpdateParams.builder()
            .id("id")
            .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ConnectionLegalEntityUpdateParams.builder()
                .id("id")
                .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ConnectionLegalEntityUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = ConnectionLegalEntityUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
