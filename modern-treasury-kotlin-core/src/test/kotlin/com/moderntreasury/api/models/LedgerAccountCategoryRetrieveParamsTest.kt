// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountCategoryRetrieveParamsTest {

    @Test
    fun create() {
        LedgerAccountCategoryRetrieveParams.builder()
            .id("id")
            .balances(
                LedgerAccountCategoryRetrieveParams.Balances.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerAccountCategoryRetrieveParams.builder()
                .id("id")
                .balances(
                    LedgerAccountCategoryRetrieveParams.Balances.builder()
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("balances[as_of_date]", "2019-12-27")
                    .put("balances[effective_at]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountCategoryRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountCategoryRetrieveParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
