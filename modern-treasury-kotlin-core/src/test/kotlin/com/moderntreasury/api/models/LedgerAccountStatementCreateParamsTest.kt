// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountStatementCreateParamsTest {

    @Test
    fun create() {
        LedgerAccountStatementCreateParams.builder()
            .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .metadata(
                LedgerAccountStatementCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerAccountStatementCreateParams.builder()
                .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .metadata(
                    LedgerAccountStatementCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.effectiveAtLowerBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.effectiveAtUpperBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.ledgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(
                LedgerAccountStatementCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerAccountStatementCreateParams.builder()
                .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.effectiveAtLowerBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.effectiveAtUpperBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.ledgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
