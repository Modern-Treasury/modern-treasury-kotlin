// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AsyncResponseTest {

    @Test
    fun createAsyncResponse() {
        val asyncResponse =
            AsyncResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("object")
                .build()
        assertThat(asyncResponse).isNotNull
        assertThat(asyncResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(asyncResponse.object_()).isEqualTo("object")
    }
}
