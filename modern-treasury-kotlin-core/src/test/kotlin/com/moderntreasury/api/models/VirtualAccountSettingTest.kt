// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualAccountSettingTest {

    @Test
    fun create() {
        val virtualAccountSetting =
            VirtualAccountSetting.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(virtualAccountSetting.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(virtualAccountSetting.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(virtualAccountSetting.externalId()).isEqualTo("external_id")
        assertThat(virtualAccountSetting.liveMode()).isEqualTo(true)
        assertThat(virtualAccountSetting.object_()).isEqualTo("object")
        assertThat(virtualAccountSetting.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualAccountSetting =
            VirtualAccountSetting.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedVirtualAccountSetting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualAccountSetting),
                jacksonTypeRef<VirtualAccountSetting>(),
            )

        assertThat(roundtrippedVirtualAccountSetting).isEqualTo(virtualAccountSetting)
    }
}
