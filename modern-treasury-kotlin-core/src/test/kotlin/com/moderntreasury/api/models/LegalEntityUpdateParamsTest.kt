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
            .id("string")
            .businessName("string")
            .dateOfBirth(LocalDate.parse("2019-12-27"))
            .doingBusinessAsNames(listOf("string"))
            .email("string")
            .firstName("string")
            .lastName("string")
            .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
            .metadata(LegalEntityUpdateParams.Metadata.builder().build())
            .phoneNumbers(
                listOf(LegalEntityUpdateParams.PhoneNumber.builder().phoneNumber("string").build())
            )
            .website("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LegalEntityUpdateParams.builder()
                .id("string")
                .businessName("string")
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .doingBusinessAsNames(listOf("string"))
                .email("string")
                .firstName("string")
                .lastName("string")
                .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
                .metadata(LegalEntityUpdateParams.Metadata.builder().build())
                .phoneNumbers(
                    listOf(
                        LegalEntityUpdateParams.PhoneNumber.builder().phoneNumber("string").build()
                    )
                )
                .website("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.businessName()).isEqualTo("string")
        assertThat(body.dateOfBirth()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.doingBusinessAsNames()).isEqualTo(listOf("string"))
        assertThat(body.email()).isEqualTo("string")
        assertThat(body.firstName()).isEqualTo("string")
        assertThat(body.lastName()).isEqualTo("string")
        assertThat(body.legalStructure())
            .isEqualTo(LegalEntityUpdateParams.LegalStructure.CORPORATION)
        assertThat(body.metadata()).isEqualTo(LegalEntityUpdateParams.Metadata.builder().build())
        assertThat(body.phoneNumbers())
            .isEqualTo(
                listOf(LegalEntityUpdateParams.PhoneNumber.builder().phoneNumber("string").build())
            )
        assertThat(body.website()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LegalEntityUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LegalEntityUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
