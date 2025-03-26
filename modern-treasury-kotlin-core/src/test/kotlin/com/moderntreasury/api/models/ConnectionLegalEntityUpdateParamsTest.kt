// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionLegalEntityUpdateParamsTest {

    @Test
    fun create() {
        ConnectionLegalEntityUpdateParams.builder()
            .id("id")
            .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ConnectionLegalEntityUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConnectionLegalEntityUpdateParams.builder()
                .id("id")
                .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ConnectionLegalEntityUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
