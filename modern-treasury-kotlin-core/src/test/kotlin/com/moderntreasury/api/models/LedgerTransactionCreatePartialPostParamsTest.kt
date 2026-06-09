// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionCreatePartialPostParamsTest {

    @Test
    fun create() {
        LedgerTransactionCreatePartialPostParams.builder()
            .id("id")
            .addPostedLedgerEntry(
                LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                    .builder()
                    .amount(0L)
                    .direction(
                        LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                            .Direction
                            .CREDIT
                    )
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                            .Metadata
                            .builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .description("description")
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .metadata(
                LedgerTransactionCreatePartialPostParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerTransactionCreatePartialPostParams.builder()
                .id("id")
                .addPostedLedgerEntry(
                    LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                        .builder()
                        .amount(0L)
                        .direction(
                            LedgerTransactionCreatePartialPostParams
                                .LedgerEntryPartialPostCreateRequest
                                .Direction
                                .CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerTransactionCreatePartialPostParams.builder()
                .id("id")
                .addPostedLedgerEntry(
                    LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                        .builder()
                        .amount(0L)
                        .direction(
                            LedgerTransactionCreatePartialPostParams
                                .LedgerEntryPartialPostCreateRequest
                                .Direction
                                .CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(
                            LedgerTransactionCreatePartialPostParams
                                .LedgerEntryPartialPostCreateRequest
                                .Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    LedgerTransactionCreatePartialPostParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.postedLedgerEntries())
            .containsExactly(
                LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                    .builder()
                    .amount(0L)
                    .direction(
                        LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                            .Direction
                            .CREDIT
                    )
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                            .Metadata
                            .builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.metadata())
            .isEqualTo(
                LedgerTransactionCreatePartialPostParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerTransactionCreatePartialPostParams.builder()
                .id("id")
                .addPostedLedgerEntry(
                    LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                        .builder()
                        .amount(0L)
                        .direction(
                            LedgerTransactionCreatePartialPostParams
                                .LedgerEntryPartialPostCreateRequest
                                .Direction
                                .CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.postedLedgerEntries())
            .containsExactly(
                LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                    .builder()
                    .amount(0L)
                    .direction(
                        LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                            .Direction
                            .CREDIT
                    )
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
