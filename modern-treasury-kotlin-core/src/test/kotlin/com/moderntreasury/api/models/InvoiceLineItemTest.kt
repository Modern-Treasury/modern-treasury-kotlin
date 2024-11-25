// File generated from our OpenAPI spec by Stainless.

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
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .direction("direction")
                .liveMode(true)
                .metadata(InvoiceLineItem.Metadata.builder().build())
                .name("name")
                .object_("object")
                .quantity(0L)
                .unitAmount(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(invoiceLineItem).isNotNull
        assertThat(invoiceLineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(invoiceLineItem.amount()).isEqualTo(0L)
        assertThat(invoiceLineItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceLineItem.description()).isEqualTo("description")
        assertThat(invoiceLineItem.direction()).isEqualTo("direction")
        assertThat(invoiceLineItem.liveMode()).isEqualTo(true)
        assertThat(invoiceLineItem.metadata()).isEqualTo(InvoiceLineItem.Metadata.builder().build())
        assertThat(invoiceLineItem.name()).isEqualTo("name")
        assertThat(invoiceLineItem.object_()).isEqualTo("object")
        assertThat(invoiceLineItem.quantity()).isEqualTo(0L)
        assertThat(invoiceLineItem.unitAmount()).isEqualTo(0L)
        assertThat(invoiceLineItem.unitAmountDecimal()).isEqualTo("unit_amount_decimal")
        assertThat(invoiceLineItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
