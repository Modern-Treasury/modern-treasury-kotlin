// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountUpdateParamsTest {

    @Test
    fun createInternalAccountUpdateParams() {
        InternalAccountUpdateParams.builder()
            .id("string")
            .counterpartyId("string")
            .ledgerAccountId("string")
            .metadata(InternalAccountUpdateParams.Metadata.builder().build())
            .name("string")
            .parentAccountId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InternalAccountUpdateParams.builder()
                .id("string")
                .counterpartyId("string")
                .ledgerAccountId("string")
                .metadata(InternalAccountUpdateParams.Metadata.builder().build())
                .name("string")
                .parentAccountId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("string")
        assertThat(body.ledgerAccountId()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(InternalAccountUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.parentAccountId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InternalAccountUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InternalAccountUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
