// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountRetrieveParamsTest {

    @Test
    fun create() {
        LedgerAccountRetrieveParams.builder()
            .id("id")
            .balances(
                LedgerAccountRetrieveParams.Balances.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .asOfLockVersion(0L)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerAccountRetrieveParams.builder()
                .id("id")
                .balances(
                    LedgerAccountRetrieveParams.Balances.builder()
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .asOfLockVersion(0L)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        LedgerAccountRetrieveParams.Balances.builder()
            .asOfDate(LocalDate.parse("2019-12-27"))
            .asOfLockVersion(0L)
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("balances[$key]", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountRetrieveParams.builder().id("id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountRetrieveParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
