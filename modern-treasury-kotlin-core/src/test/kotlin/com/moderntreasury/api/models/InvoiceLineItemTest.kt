package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemTest {

    @Test
    fun createInvoiceLineItem() {
        val invoiceLineItem =
            InvoiceLineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .description("string")
                .quantity(123L)
                .unitAmount(123L)
                .direction("string")
                .amount(123L)
                .build()
        assertThat(invoiceLineItem).isNotNull
        assertThat(invoiceLineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(invoiceLineItem.object_()).isEqualTo("string")
        assertThat(invoiceLineItem.liveMode()).isEqualTo(true)
        assertThat(invoiceLineItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceLineItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceLineItem.name()).isEqualTo("string")
        assertThat(invoiceLineItem.description()).isEqualTo("string")
        assertThat(invoiceLineItem.quantity()).isEqualTo(123L)
        assertThat(invoiceLineItem.unitAmount()).isEqualTo(123L)
        assertThat(invoiceLineItem.direction()).isEqualTo("string")
        assertThat(invoiceLineItem.amount()).isEqualTo(123L)
    }
}
