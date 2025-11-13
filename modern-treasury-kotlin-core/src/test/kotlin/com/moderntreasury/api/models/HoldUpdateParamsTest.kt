// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldUpdateParamsTest {

    @Test
    fun create() {
        HoldUpdateParams.builder()
            .id("id")
            .status(HoldUpdateParams.Status.RESOLVED)
            .resolution("resolution")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HoldUpdateParams.builder().id("id").status(HoldUpdateParams.Status.RESOLVED).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            HoldUpdateParams.builder()
                .id("id")
                .status(HoldUpdateParams.Status.RESOLVED)
                .resolution("resolution")
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(HoldUpdateParams.Status.RESOLVED)
        assertThat(body.resolution()).isEqualTo("resolution")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HoldUpdateParams.builder().id("id").status(HoldUpdateParams.Status.RESOLVED).build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(HoldUpdateParams.Status.RESOLVED)
    }
}
