// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingDetailTest {

    @Test
    fun create() {
        val routingDetail =
            RoutingDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bankAddress(
                    RoutingDetail.Address.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .country("country")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .line1("line1")
                        .line2("line2")
                        .liveMode(true)
                        .locality("locality")
                        .object_("object")
                        .postalCode("postal_code")
                        .region("region")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .bankName("bank_name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .paymentType(RoutingDetail.PaymentType.ACH)
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(routingDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(routingDetail.bankAddress())
            .isEqualTo(
                RoutingDetail.Address.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .country("country")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .line1("line1")
                    .line2("line2")
                    .liveMode(true)
                    .locality("locality")
                    .object_("object")
                    .postalCode("postal_code")
                    .region("region")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(routingDetail.bankName()).isEqualTo("bank_name")
        assertThat(routingDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(routingDetail.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(routingDetail.liveMode()).isEqualTo(true)
        assertThat(routingDetail.object_()).isEqualTo("object")
        assertThat(routingDetail.paymentType()).isEqualTo(RoutingDetail.PaymentType.ACH)
        assertThat(routingDetail.routingNumber()).isEqualTo("routing_number")
        assertThat(routingDetail.routingNumberType()).isEqualTo(RoutingDetail.RoutingNumberType.ABA)
        assertThat(routingDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
