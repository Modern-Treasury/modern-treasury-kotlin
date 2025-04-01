// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityIndustryClassificationTest {

    @Test
    fun create() {
        val legalEntityIndustryClassification =
            LegalEntityIndustryClassification.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addClassificationCode("string")
                .classificationType(LegalEntityIndustryClassification.ClassificationType.ANZSIC)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(legalEntityIndustryClassification.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntityIndustryClassification.classificationCodes())
            .containsExactly("string")
        assertThat(legalEntityIndustryClassification.classificationType())
            .isEqualTo(LegalEntityIndustryClassification.ClassificationType.ANZSIC)
        assertThat(legalEntityIndustryClassification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityIndustryClassification.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityIndustryClassification.liveMode()).isEqualTo(true)
        assertThat(legalEntityIndustryClassification.object_()).isEqualTo("object")
        assertThat(legalEntityIndustryClassification.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalEntityIndustryClassification =
            LegalEntityIndustryClassification.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addClassificationCode("string")
                .classificationType(LegalEntityIndustryClassification.ClassificationType.ANZSIC)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLegalEntityIndustryClassification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalEntityIndustryClassification),
                jacksonTypeRef<LegalEntityIndustryClassification>(),
            )

        assertThat(roundtrippedLegalEntityIndustryClassification)
            .isEqualTo(legalEntityIndustryClassification)
    }
}
