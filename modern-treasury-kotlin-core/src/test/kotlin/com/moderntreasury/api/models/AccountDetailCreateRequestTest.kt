// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailCreateRequestTest {

    @Test
    fun create() {
        val accountDetailCreateRequest =
            AccountDetailCreateRequest.builder()
                .accountNumber("account_number")
                .accountNumberType(AccountDetailCreateRequest.AccountNumberType.ARBITRUM_ADDRESS)
                .build()

        assertThat(accountDetailCreateRequest.accountNumber()).isEqualTo("account_number")
        assertThat(accountDetailCreateRequest.accountNumberType())
            .isEqualTo(AccountDetailCreateRequest.AccountNumberType.ARBITRUM_ADDRESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountDetailCreateRequest =
            AccountDetailCreateRequest.builder()
                .accountNumber("account_number")
                .accountNumberType(AccountDetailCreateRequest.AccountNumberType.ARBITRUM_ADDRESS)
                .build()

        val roundtrippedAccountDetailCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountDetailCreateRequest),
                jacksonTypeRef<AccountDetailCreateRequest>(),
            )

        assertThat(roundtrippedAccountDetailCreateRequest).isEqualTo(accountDetailCreateRequest)
    }
}
