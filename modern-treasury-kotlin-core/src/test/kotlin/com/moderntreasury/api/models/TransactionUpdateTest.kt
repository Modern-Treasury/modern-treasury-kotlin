// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionUpdateTest {

    @Test
    fun create() {
        val transactionUpdate =
            TransactionUpdate.builder()
                .metadata(
                    TransactionUpdate.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(transactionUpdate.metadata())
            .isEqualTo(
                TransactionUpdate.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionUpdate =
            TransactionUpdate.builder()
                .metadata(
                    TransactionUpdate.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedTransactionUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionUpdate),
                jacksonTypeRef<TransactionUpdate>(),
            )

        assertThat(roundtrippedTransactionUpdate).isEqualTo(transactionUpdate)
    }
}
