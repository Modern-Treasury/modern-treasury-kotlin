// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkRequestTest {

    @Test
    fun create() {
        val bulkRequest =
            BulkRequest.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionType(BulkRequest.ActionType.CREATE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failedResultCount(0L)
                .liveMode(true)
                .metadata(
                    BulkRequest.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .resourceType(BulkRequest.ResourceType.PAYMENT_ORDER)
                .status(BulkRequest.Status.PENDING)
                .successResultCount(0L)
                .totalResourceCount(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(bulkRequest.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkRequest.actionType()).isEqualTo(BulkRequest.ActionType.CREATE)
        assertThat(bulkRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkRequest.failedResultCount()).isEqualTo(0L)
        assertThat(bulkRequest.liveMode()).isEqualTo(true)
        assertThat(bulkRequest.metadata())
            .isEqualTo(
                BulkRequest.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(bulkRequest.object_()).isEqualTo("object")
        assertThat(bulkRequest.resourceType()).isEqualTo(BulkRequest.ResourceType.PAYMENT_ORDER)
        assertThat(bulkRequest.status()).isEqualTo(BulkRequest.Status.PENDING)
        assertThat(bulkRequest.successResultCount()).isEqualTo(0L)
        assertThat(bulkRequest.totalResourceCount()).isEqualTo(0L)
        assertThat(bulkRequest.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkRequest =
            BulkRequest.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionType(BulkRequest.ActionType.CREATE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failedResultCount(0L)
                .liveMode(true)
                .metadata(
                    BulkRequest.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .resourceType(BulkRequest.ResourceType.PAYMENT_ORDER)
                .status(BulkRequest.Status.PENDING)
                .successResultCount(0L)
                .totalResourceCount(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBulkRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkRequest),
                jacksonTypeRef<BulkRequest>(),
            )

        assertThat(roundtrippedBulkRequest).isEqualTo(bulkRequest)
    }
}
