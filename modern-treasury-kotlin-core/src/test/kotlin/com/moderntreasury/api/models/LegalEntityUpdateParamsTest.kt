// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityUpdateParamsTest {

    @Test
    fun createLegalEntityUpdateParams() {
        LegalEntityUpdateParams.builder()
            .id("id")
            .businessName("business_name")
            .dateFormed(LocalDate.parse("2019-12-27"))
            .dateOfBirth(LocalDate.parse("2019-12-27"))
            .doingBusinessAsNames(listOf("string"))
            .email("email")
            .firstName("first_name")
            .lastName("last_name")
            .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
            .metadata(LegalEntityUpdateParams.Metadata.builder().build())
            .phoneNumbers(
                listOf(
                    LegalEntityUpdateParams.PhoneNumber.builder()
                        .phoneNumber("phone_number")
                        .build()
                )
            )
            .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
            .website("website")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LegalEntityUpdateParams.builder()
                .id("id")
                .businessName("business_name")
                .dateFormed(LocalDate.parse("2019-12-27"))
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .doingBusinessAsNames(listOf("string"))
                .email("email")
                .firstName("first_name")
                .lastName("last_name")
                .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
                .metadata(LegalEntityUpdateParams.Metadata.builder().build())
                .phoneNumbers(
                    listOf(
                        LegalEntityUpdateParams.PhoneNumber.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                )
                .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
                .website("website")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.businessName()).isEqualTo("business_name")
        assertThat(body.dateFormed()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateOfBirth()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.doingBusinessAsNames()).isEqualTo(listOf("string"))
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("first_name")
        assertThat(body.lastName()).isEqualTo("last_name")
        assertThat(body.legalStructure())
            .isEqualTo(LegalEntityUpdateParams.LegalStructure.CORPORATION)
        assertThat(body.metadata()).isEqualTo(LegalEntityUpdateParams.Metadata.builder().build())
        assertThat(body.phoneNumbers())
            .isEqualTo(
                listOf(
                    LegalEntityUpdateParams.PhoneNumber.builder()
                        .phoneNumber("phone_number")
                        .build()
                )
            )
        assertThat(body.riskRating()).isEqualTo(LegalEntityUpdateParams.RiskRating.LOW)
        assertThat(body.website()).isEqualTo("website")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LegalEntityUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LegalEntityUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
