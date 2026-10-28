// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityRegulatorTest {

    @Test
    fun create() {
        val legalEntityRegulator =
            LegalEntityRegulator.builder()
                .jurisdiction("jurisdiction")
                .name("name")
                .registrationNumber("registration_number")
                .build()

        assertThat(legalEntityRegulator.jurisdiction()).isEqualTo("jurisdiction")
        assertThat(legalEntityRegulator.name()).isEqualTo("name")
        assertThat(legalEntityRegulator.registrationNumber()).isEqualTo("registration_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalEntityRegulator =
            LegalEntityRegulator.builder()
                .jurisdiction("jurisdiction")
                .name("name")
                .registrationNumber("registration_number")
                .build()

        val roundtrippedLegalEntityRegulator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalEntityRegulator),
                jacksonTypeRef<LegalEntityRegulator>(),
            )

        assertThat(roundtrippedLegalEntityRegulator).isEqualTo(legalEntityRegulator)
    }
}
