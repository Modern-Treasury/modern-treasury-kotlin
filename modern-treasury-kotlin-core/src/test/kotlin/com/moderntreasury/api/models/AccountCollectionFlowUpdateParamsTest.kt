// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCollectionFlowUpdateParamsTest {

    @Test
    fun create() {
        AccountCollectionFlowUpdateParams.builder()
            .id("id")
            .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("id")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountCollectionFlowUpdateParams.builder()
                .id("id")
                .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.status()).isEqualTo(AccountCollectionFlowUpdateParams.Status.CANCELLED)
    }
}
