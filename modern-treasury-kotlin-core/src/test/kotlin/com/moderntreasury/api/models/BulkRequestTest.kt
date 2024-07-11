// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BulkRequestTest {

    @Test
    fun createBulkRequest() {
        val bulkRequest =
            BulkRequest.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionType(BulkRequest.ActionType.CREATE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failedResultCount(123L)
                .liveMode(true)
                .metadata(BulkRequest.Metadata.builder().build())
                .object_("object")
                .resourceType(BulkRequest.ResourceType.PAYMENT_ORDER)
                .status(BulkRequest.Status.PENDING)
                .successResultCount(123L)
                .totalResourceCount(123L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(bulkRequest).isNotNull
        assertThat(bulkRequest.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bulkRequest.actionType()).isEqualTo(BulkRequest.ActionType.CREATE)
        assertThat(bulkRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bulkRequest.failedResultCount()).isEqualTo(123L)
        assertThat(bulkRequest.liveMode()).isEqualTo(true)
        assertThat(bulkRequest.metadata()).isEqualTo(BulkRequest.Metadata.builder().build())
        assertThat(bulkRequest.object_()).isEqualTo("object")
        assertThat(bulkRequest.resourceType()).isEqualTo(BulkRequest.ResourceType.PAYMENT_ORDER)
        assertThat(bulkRequest.status()).isEqualTo(BulkRequest.Status.PENDING)
        assertThat(bulkRequest.successResultCount()).isEqualTo(123L)
        assertThat(bulkRequest.totalResourceCount()).isEqualTo(123L)
        assertThat(bulkRequest.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
