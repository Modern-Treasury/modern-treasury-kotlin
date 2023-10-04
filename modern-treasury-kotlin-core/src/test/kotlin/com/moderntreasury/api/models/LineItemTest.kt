// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemTest {

    @Test
    fun createLineItem() {
        val lineItem =
            LineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    LineItem.Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .itemizableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemizableType(LineItem.ItemizableType.EXPECTED_PAYMENT)
                .liveMode(true)
                .metadata(LineItem.Metadata.builder().build())
                .object_("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(lineItem).isNotNull
        assertThat(lineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItem.accounting())
            .isEqualTo(
                LineItem.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(lineItem.accountingCategoryId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItem.accountingLedgerClassId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItem.amount()).isEqualTo(123L)
        assertThat(lineItem.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lineItem.description()).isEqualTo("string")
        assertThat(lineItem.itemizableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItem.itemizableType()).isEqualTo(LineItem.ItemizableType.EXPECTED_PAYMENT)
        assertThat(lineItem.liveMode()).isEqualTo(true)
        assertThat(lineItem.metadata()).isEqualTo(LineItem.Metadata.builder().build())
        assertThat(lineItem.object_()).isEqualTo("string")
        assertThat(lineItem.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
