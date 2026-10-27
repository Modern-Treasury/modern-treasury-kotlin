// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddableFlowUpdateParamsTest {

    @Test
    fun create() {
        EmbeddableFlowUpdateParams.builder()
            .id("id")
            .status(EmbeddableFlowUpdateParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EmbeddableFlowUpdateParams.builder()
                .id("id")
                .status(EmbeddableFlowUpdateParams.Status.CANCELLED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EmbeddableFlowUpdateParams.builder()
                .id("id")
                .status(EmbeddableFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(EmbeddableFlowUpdateParams.Status.CANCELLED)
    }
}
