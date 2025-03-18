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
    fun pathParams() {
        val params = LedgerAccountRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("balances[as_of_date]", "2019-12-27")
                    .put("balances[as_of_lock_version]", "0")
                    .put("balances[effective_at]", "2019-12-27T18:11:19.117Z")
                    .put("balances[effective_at_lower_bound]", "2019-12-27T18:11:19.117Z")
                    .put("balances[effective_at_upper_bound]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
