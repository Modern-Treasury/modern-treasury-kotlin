// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowUpdateParamsTest {

    @Test
    fun create() {
        AccountCollectionFlowUpdateParams.builder()
            .id("id")
            .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("id")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(AccountCollectionFlowUpdateParams.Status.CANCELLED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("id")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(AccountCollectionFlowUpdateParams.Status.CANCELLED)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("id")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
