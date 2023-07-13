package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryAddNestedCategoryParamsTest {

    @Test
    fun createLedgerAccountCategoryAddNestedCategoryParams() {
        LedgerAccountCategoryAddNestedCategoryParams.builder()
            .id("string")
            .subCategoryId("string")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            LedgerAccountCategoryAddNestedCategoryParams.builder()
                .id("string")
                .subCategoryId("string")
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // path param "subCategoryId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
