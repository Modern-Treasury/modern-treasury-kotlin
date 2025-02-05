// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionLegalEntityUpdateParamsTest {

    @Test
    fun create() {
        ConnectionLegalEntityUpdateParams.builder()
            .id("id")
            .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
            .build()
    }

    @Test
    fun body() {
        val params =
            ConnectionLegalEntityUpdateParams.builder()
                .id("id")
                .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ConnectionLegalEntityUpdateParams.builder().id("id").build()
        val body = params._body()
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
