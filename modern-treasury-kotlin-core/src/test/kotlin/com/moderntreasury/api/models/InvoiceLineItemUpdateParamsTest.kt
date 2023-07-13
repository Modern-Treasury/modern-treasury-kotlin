package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemUpdateParamsTest {

    @Test
    fun createInvoiceLineItemUpdateParams() {
        InvoiceLineItemUpdateParams.builder()
            .invoiceId("string")
            .id("string")
            .contactDetails(
                listOf(
                    InvoiceLineItemUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .object_("string")
                        .liveMode(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contactIdentifier("string")
                        .contactIdentifierType(
                            InvoiceLineItemUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .build()
                )
            )
            .counterpartyId("string")
            .counterpartyBillingAddress(
                InvoiceLineItemUpdateParams.CounterpartyBillingAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
            .counterpartyShippingAddress(
                InvoiceLineItemUpdateParams.CounterpartyShippingAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
            .currency(Currency.AED)
            .description("string")
            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoicerAddress(
                InvoiceLineItemUpdateParams.InvoicerAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
            .originatingAccountId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceLineItemUpdateParams.builder()
                .invoiceId("string")
                .id("string")
                .contactDetails(
                    listOf(
                        InvoiceLineItemUpdateParams.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .contactIdentifier("string")
                            .contactIdentifierType(
                                InvoiceLineItemUpdateParams.ContactDetail.ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .counterpartyId("string")
                .counterpartyBillingAddress(
                    InvoiceLineItemUpdateParams.CounterpartyBillingAddress.builder()
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .counterpartyShippingAddress(
                    InvoiceLineItemUpdateParams.CounterpartyShippingAddress.builder()
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .currency(Currency.AED)
                .description("string")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoicerAddress(
                    InvoiceLineItemUpdateParams.InvoicerAddress.builder()
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .originatingAccountId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contactDetails())
            .isEqualTo(
                listOf(
                    InvoiceLineItemUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .object_("string")
                        .liveMode(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contactIdentifier("string")
                        .contactIdentifierType(
                            InvoiceLineItemUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .build()
                )
            )
        assertThat(body.counterpartyId()).isEqualTo("string")
        assertThat(body.counterpartyBillingAddress())
            .isEqualTo(
                InvoiceLineItemUpdateParams.CounterpartyBillingAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
        assertThat(body.counterpartyShippingAddress())
            .isEqualTo(
                InvoiceLineItemUpdateParams.CounterpartyShippingAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.invoicerAddress())
            .isEqualTo(
                InvoiceLineItemUpdateParams.InvoicerAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
        assertThat(body.originatingAccountId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("string").id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("string").id("string").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
