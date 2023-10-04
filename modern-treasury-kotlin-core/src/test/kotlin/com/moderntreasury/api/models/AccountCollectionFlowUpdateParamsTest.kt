// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowUpdateParamsTest {

    @Test
    fun createAccountCollectionFlowUpdateParams() {
        AccountCollectionFlowUpdateParams.builder()
            .id("string")
            .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("string")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(AccountCollectionFlowUpdateParams.Status.CANCELLED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("string")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(AccountCollectionFlowUpdateParams.Status.CANCELLED)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("string")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
