// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountUpdateParamsTest {

    @Test
    fun createInternalAccountUpdateParams() {
        InternalAccountUpdateParams.builder()
            .id("id")
            .counterpartyId("counterparty_id")
            .ledgerAccountId("ledger_account_id")
            .metadata(InternalAccountUpdateParams.Metadata.builder().build())
            .name("name")
            .parentAccountId("parent_account_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InternalAccountUpdateParams.builder()
                .id("id")
                .counterpartyId("counterparty_id")
                .ledgerAccountId("ledger_account_id")
                .metadata(InternalAccountUpdateParams.Metadata.builder().build())
                .name("name")
                .parentAccountId("parent_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("counterparty_id")
        assertThat(body.ledgerAccountId()).isEqualTo("ledger_account_id")
        assertThat(body.metadata())
            .isEqualTo(InternalAccountUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.parentAccountId()).isEqualTo("parent_account_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InternalAccountUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InternalAccountUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
