// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionCreateReversalParamsTest {

    @Test
    fun create() {
        LedgerTransactionCreateReversalParams.builder()
            .id("id")
            .description("description")
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .externalId("external_id")
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerTransactionCreateReversalParams.LedgerableType.EXPECTED_PAYMENT)
            .metadata(
                LedgerTransactionCreateReversalParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LedgerTransactionCreateReversalParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerTransactionCreateReversalParams.builder()
                .id("id")
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(
                    LedgerTransactionCreateReversalParams.LedgerableType.EXPECTED_PAYMENT
                )
                .metadata(
                    LedgerTransactionCreateReversalParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.externalId()).isEqualTo("external_id")
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerTransactionCreateReversalParams.LedgerableType.EXPECTED_PAYMENT)
        assertThat(body.metadata())
            .isEqualTo(
                LedgerTransactionCreateReversalParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.status()).isEqualTo(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerTransactionCreateReversalParams.builder().id("id").build()

        val body = params._body()
    }
}
