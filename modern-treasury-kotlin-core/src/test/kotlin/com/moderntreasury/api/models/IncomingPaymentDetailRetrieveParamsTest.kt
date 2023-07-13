package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomingPaymentDetailRetrieveParamsTest {

    @Test
    fun createIncomingPaymentDetailRetrieveParams() {
        IncomingPaymentDetailRetrieveParams.builder().id("string").build()
    }

    @Test
    fun getPathParam() {
        val params = IncomingPaymentDetailRetrieveParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
