package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReversalTest {

    @Test
    fun createReversal() {
        val reversal =
            Reversal.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(Reversal.Metadata.builder().build())
                .object_("string")
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(Reversal.Reason.DUPLICATE)
                .status(Reversal.Status.COMPLETED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(reversal).isNotNull
        assertThat(reversal.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(reversal.object_()).isEqualTo("string")
        assertThat(reversal.liveMode()).isEqualTo(true)
        assertThat(reversal.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reversal.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reversal.status()).isEqualTo(Reversal.Status.COMPLETED)
        assertThat(reversal.paymentOrderId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(reversal.metadata()).isEqualTo(Reversal.Metadata.builder().build())
        assertThat(reversal.reason()).isEqualTo(Reversal.Reason.DUPLICATE)
    }
}
