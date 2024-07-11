// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReturnCreateParamsTest {

    @Test
    fun createReturnCreateParams() {
        ReturnCreateParams.builder()
            .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
            .additionalInformation("additional_information")
            .code(ReturnCreateParams.Code._901)
            .dateOfDeath(LocalDate.parse("2019-12-27"))
            .reason("reason")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ReturnCreateParams.builder()
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .additionalInformation("additional_information")
                .code(ReturnCreateParams.Code._901)
                .dateOfDeath(LocalDate.parse("2019-12-27"))
                .reason("reason")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnableType())
            .isEqualTo(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
        assertThat(body.additionalInformation()).isEqualTo("additional_information")
        assertThat(body.code()).isEqualTo(ReturnCreateParams.Code._901)
        assertThat(body.dateOfDeath()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.reason()).isEqualTo("reason")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ReturnCreateParams.builder()
                .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.returnableType())
            .isEqualTo(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
    }
}
