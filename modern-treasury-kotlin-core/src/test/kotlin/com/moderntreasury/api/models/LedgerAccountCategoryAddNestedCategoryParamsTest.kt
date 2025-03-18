// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountCategoryAddNestedCategoryParamsTest {

    @Test
    fun create() {
        LedgerAccountCategoryAddNestedCategoryParams.builder()
            .id("id")
            .subCategoryId("sub_category_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerAccountCategoryAddNestedCategoryParams.builder()
                .id("id")
                .subCategoryId("sub_category_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("sub_category_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
