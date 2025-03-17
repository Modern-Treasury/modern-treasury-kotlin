// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailTest {

    @Test
    fun createAccountDetail() {
        val accountDetail =
            AccountDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumberSafe("account_number_safe")
                .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("account_number")
                .build()
        assertThat(accountDetail).isNotNull
        assertThat(accountDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountDetail.accountNumberSafe()).isEqualTo("account_number_safe")
        assertThat(accountDetail.accountNumberType())
            .isEqualTo(AccountDetail.AccountNumberType.AU_NUMBER)
        assertThat(accountDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountDetail.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountDetail.liveMode()).isEqualTo(true)
        assertThat(accountDetail.object_()).isEqualTo("object")
        assertThat(accountDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountDetail.accountNumber()).isEqualTo("account_number")
    }
}
