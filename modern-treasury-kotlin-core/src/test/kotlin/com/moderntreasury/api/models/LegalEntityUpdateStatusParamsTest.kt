// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityUpdateStatusParamsTest {

    @Test
    fun create() {
        LegalEntityUpdateStatusParams.builder()
            .id("id")
            .status(LegalEntityUpdateStatusParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LegalEntityUpdateStatusParams.builder()
                .id("id")
                .status(LegalEntityUpdateStatusParams.Status.ACTIVE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LegalEntityUpdateStatusParams.builder()
                .id("id")
                .status(LegalEntityUpdateStatusParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(LegalEntityUpdateStatusParams.Status.ACTIVE)
    }
}
