// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationUpdateParamsTest {

    @Test
    fun create() {
        IdentificationUpdateParams.builder()
            .id("id")
            .expirationDate(LocalDate.parse("2019-12-27"))
            .idNumber("id_number")
            .idType(IdentificationUpdateParams.IdType.AR_CUIL)
            .issuingCountry("issuing_country")
            .issuingRegion("issuing_region")
            .build()
    }

    @Test
    fun pathParams() {
        val params = IdentificationUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IdentificationUpdateParams.builder()
                .id("id")
                .expirationDate(LocalDate.parse("2019-12-27"))
                .idNumber("id_number")
                .idType(IdentificationUpdateParams.IdType.AR_CUIL)
                .issuingCountry("issuing_country")
                .issuingRegion("issuing_region")
                .build()

        val body = params._body()

        assertThat(body.expirationDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.idNumber()).isEqualTo("id_number")
        assertThat(body.idType()).isEqualTo(IdentificationUpdateParams.IdType.AR_CUIL)
        assertThat(body.issuingCountry()).isEqualTo("issuing_country")
        assertThat(body.issuingRegion()).isEqualTo("issuing_region")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IdentificationUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
