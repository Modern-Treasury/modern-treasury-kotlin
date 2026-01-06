// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemRetrieveResponseTest {

    @Test
    fun create() {
        val lineItemRetrieveResponse =
            LineItemRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .itemizableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemizableType(LineItemRetrieveResponse.ItemizableType.EXPECTED_PAYMENT)
                .liveMode(true)
                .metadata(
                    LineItemRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(lineItemRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemRetrieveResponse.accounting())
            .isEqualTo(
                Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(lineItemRetrieveResponse.accountingCategoryId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemRetrieveResponse.accountingLedgerClassId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemRetrieveResponse.amount()).isEqualTo(0L)
        assertThat(lineItemRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lineItemRetrieveResponse.description()).isEqualTo("description")
        assertThat(lineItemRetrieveResponse.itemizableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemRetrieveResponse.itemizableType())
            .isEqualTo(LineItemRetrieveResponse.ItemizableType.EXPECTED_PAYMENT)
        assertThat(lineItemRetrieveResponse.liveMode()).isEqualTo(true)
        assertThat(lineItemRetrieveResponse.metadata())
            .isEqualTo(
                LineItemRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(lineItemRetrieveResponse.object_()).isEqualTo("object")
        assertThat(lineItemRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lineItemRetrieveResponse =
            LineItemRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .itemizableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemizableType(LineItemRetrieveResponse.ItemizableType.EXPECTED_PAYMENT)
                .liveMode(true)
                .metadata(
                    LineItemRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLineItemRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lineItemRetrieveResponse),
                jacksonTypeRef<LineItemRetrieveResponse>(),
            )

        assertThat(roundtrippedLineItemRetrieveResponse).isEqualTo(lineItemRetrieveResponse)
    }
}
