// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentReferenceListParamsTest {

    @Test
    fun create() {
        PaymentReferenceListParams.builder()
            .afterCursor("after_cursor")
            .perPage(0L)
            .referenceNumber("reference_number")
            .referenceableId("referenceable_id")
            .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaymentReferenceListParams.builder()
                .afterCursor("after_cursor")
                .perPage(0L)
                .referenceNumber("reference_number")
                .referenceableId("referenceable_id")
                .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .put("reference_number", "reference_number")
                    .put("referenceable_id", "referenceable_id")
                    .put("referenceable_type", "payment_order")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentReferenceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
