// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCapabilityTest {

    @Test
    fun create() {
        val accountCapability =
            AccountCapability.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .identifier("identifier")
                .liveMode(true)
                .object_("object")
                .paymentType(AccountCapability.PaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accountCapability.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCapability.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountCapability.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(accountCapability.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountCapability.identifier()).isEqualTo("identifier")
        assertThat(accountCapability.liveMode()).isEqualTo(true)
        assertThat(accountCapability.object_()).isEqualTo("object")
        assertThat(accountCapability.paymentType()).isEqualTo(AccountCapability.PaymentType.ACH)
        assertThat(accountCapability.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountCapability =
            AccountCapability.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .identifier("identifier")
                .liveMode(true)
                .object_("object")
                .paymentType(AccountCapability.PaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAccountCapability =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountCapability),
                jacksonTypeRef<AccountCapability>(),
            )

        assertThat(roundtrippedAccountCapability).isEqualTo(accountCapability)
    }
}
