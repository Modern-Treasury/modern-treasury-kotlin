// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityCreateParamsTest {

    @Test
    fun createLegalEntityCreateParams() {
        LegalEntityCreateParams.builder()
            .legalEntityType(LegalEntityCreateParams.LegalEntityType.BUSINESS)
            .addresses(
                listOf(
                    LegalEntityCreateParams.LegalEntityAddressCreateRequest.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .addressTypes(
                            listOf(
                                LegalEntityCreateParams.LegalEntityAddressCreateRequest.AddressType
                                    .BUSINESS
                            )
                        )
                        .line2("string")
                        .build()
                )
            )
            .businessName("string")
            .dateFormed(LocalDate.parse("2019-12-27"))
            .dateOfBirth(LocalDate.parse("2019-12-27"))
            .doingBusinessAsNames(listOf("string"))
            .email("string")
            .firstName("string")
            .identifications(
                listOf(
                    LegalEntityCreateParams.IdentificationCreateRequest.builder()
                        .idNumber("string")
                        .idType(LegalEntityCreateParams.IdentificationCreateRequest.IdType.AR_CUIL)
                        .issuingCountry("string")
                        .build()
                )
            )
            .lastName("string")
            .legalStructure(LegalEntityCreateParams.LegalStructure.CORPORATION)
            .metadata(LegalEntityCreateParams.Metadata.builder().build())
            .phoneNumbers(
                listOf(LegalEntityCreateParams.PhoneNumber.builder().phoneNumber("string").build())
            )
            .website("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LegalEntityCreateParams.builder()
                .legalEntityType(LegalEntityCreateParams.LegalEntityType.BUSINESS)
                .addresses(
                    listOf(
                        LegalEntityCreateParams.LegalEntityAddressCreateRequest.builder()
                            .country("string")
                            .line1("string")
                            .locality("string")
                            .postalCode("string")
                            .region("string")
                            .addressTypes(
                                listOf(
                                    LegalEntityCreateParams.LegalEntityAddressCreateRequest
                                        .AddressType
                                        .BUSINESS
                                )
                            )
                            .line2("string")
                            .build()
                    )
                )
                .businessName("string")
                .dateFormed(LocalDate.parse("2019-12-27"))
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .doingBusinessAsNames(listOf("string"))
                .email("string")
                .firstName("string")
                .identifications(
                    listOf(
                        LegalEntityCreateParams.IdentificationCreateRequest.builder()
                            .idNumber("string")
                            .idType(
                                LegalEntityCreateParams.IdentificationCreateRequest.IdType.AR_CUIL
                            )
                            .issuingCountry("string")
                            .build()
                    )
                )
                .lastName("string")
                .legalStructure(LegalEntityCreateParams.LegalStructure.CORPORATION)
                .metadata(LegalEntityCreateParams.Metadata.builder().build())
                .phoneNumbers(
                    listOf(
                        LegalEntityCreateParams.PhoneNumber.builder().phoneNumber("string").build()
                    )
                )
                .website("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.legalEntityType())
            .isEqualTo(LegalEntityCreateParams.LegalEntityType.BUSINESS)
        assertThat(body.addresses())
            .isEqualTo(
                listOf(
                    LegalEntityCreateParams.LegalEntityAddressCreateRequest.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .addressTypes(
                            listOf(
                                LegalEntityCreateParams.LegalEntityAddressCreateRequest.AddressType
                                    .BUSINESS
                            )
                        )
                        .line2("string")
                        .build()
                )
            )
        assertThat(body.businessName()).isEqualTo("string")
        assertThat(body.dateFormed()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateOfBirth()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.doingBusinessAsNames()).isEqualTo(listOf("string"))
        assertThat(body.email()).isEqualTo("string")
        assertThat(body.firstName()).isEqualTo("string")
        assertThat(body.identifications())
            .isEqualTo(
                listOf(
                    LegalEntityCreateParams.IdentificationCreateRequest.builder()
                        .idNumber("string")
                        .idType(LegalEntityCreateParams.IdentificationCreateRequest.IdType.AR_CUIL)
                        .issuingCountry("string")
                        .build()
                )
            )
        assertThat(body.lastName()).isEqualTo("string")
        assertThat(body.legalStructure())
            .isEqualTo(LegalEntityCreateParams.LegalStructure.CORPORATION)
        assertThat(body.metadata()).isEqualTo(LegalEntityCreateParams.Metadata.builder().build())
        assertThat(body.phoneNumbers())
            .isEqualTo(
                listOf(LegalEntityCreateParams.PhoneNumber.builder().phoneNumber("string").build())
            )
        assertThat(body.website()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LegalEntityCreateParams.builder()
                .legalEntityType(LegalEntityCreateParams.LegalEntityType.BUSINESS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.legalEntityType())
            .isEqualTo(LegalEntityCreateParams.LegalEntityType.BUSINESS)
    }
}
