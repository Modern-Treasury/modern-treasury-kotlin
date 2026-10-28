// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionUpdateRequestTest {

    @Test
    fun create() {
        val transactionUpdateRequest =
            TransactionUpdateRequest.builder()
                .metadata(
                    TransactionUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(transactionUpdateRequest.metadata())
            .isEqualTo(
                TransactionUpdateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionUpdateRequest =
            TransactionUpdateRequest.builder()
                .metadata(
                    TransactionUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedTransactionUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionUpdateRequest),
                jacksonTypeRef<TransactionUpdateRequest>(),
            )

        assertThat(roundtrippedTransactionUpdateRequest).isEqualTo(transactionUpdateRequest)
    }
}
