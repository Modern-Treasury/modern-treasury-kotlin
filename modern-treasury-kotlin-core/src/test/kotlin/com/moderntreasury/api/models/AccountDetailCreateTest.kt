// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailCreateTest {

    @Test
    fun create() {
        val accountDetailCreate =
            AccountDetailCreate.builder()
                .accountNumber("account_number")
                .accountNumberType(AccountDetailCreate.AccountNumberType.AU_NUMBER)
                .build()

        assertThat(accountDetailCreate.accountNumber()).isEqualTo("account_number")
        assertThat(accountDetailCreate.accountNumberType())
            .isEqualTo(AccountDetailCreate.AccountNumberType.AU_NUMBER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountDetailCreate =
            AccountDetailCreate.builder()
                .accountNumber("account_number")
                .accountNumberType(AccountDetailCreate.AccountNumberType.AU_NUMBER)
                .build()

        val roundtrippedAccountDetailCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountDetailCreate),
                jacksonTypeRef<AccountDetailCreate>(),
            )

        assertThat(roundtrippedAccountDetailCreate).isEqualTo(accountDetailCreate)
    }
}
