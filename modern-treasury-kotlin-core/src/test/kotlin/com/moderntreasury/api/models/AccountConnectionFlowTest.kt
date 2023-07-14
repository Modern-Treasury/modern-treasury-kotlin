package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountConnectionFlowTest {

    @Test
    fun createAccountConnectionFlow() {
        val accountConnectionFlow =
            AccountConnectionFlow.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentTypes(listOf(AccountConnectionFlow.PaymentType.ACH))
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientToken("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("string")
                .status(AccountConnectionFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(accountConnectionFlow).isNotNull
        assertThat(accountConnectionFlow.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountConnectionFlow.paymentTypes())
            .containsExactly(AccountConnectionFlow.PaymentType.ACH)
        assertThat(accountConnectionFlow.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountConnectionFlow.clientToken()).isEqualTo("string")
        assertThat(accountConnectionFlow.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountConnectionFlow.externalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountConnectionFlow.liveMode()).isEqualTo(true)
        assertThat(accountConnectionFlow.object_()).isEqualTo("string")
        assertThat(accountConnectionFlow.status()).isEqualTo(AccountConnectionFlow.Status.CANCELLED)
        assertThat(accountConnectionFlow.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
