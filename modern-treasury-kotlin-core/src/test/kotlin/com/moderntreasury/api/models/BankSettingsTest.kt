// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BankSettingsTest {

    @Test
    fun create() {
        val bankSettings =
            BankSettings.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .backupWithholdingPercentage(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enableBackupWithholding(true)
                .liveMode(true)
                .object_("object")
                .privacyOptOut(true)
                .regulationO(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(bankSettings.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bankSettings.backupWithholdingPercentage()).isEqualTo(0L)
        assertThat(bankSettings.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bankSettings.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bankSettings.enableBackupWithholding()).isEqualTo(true)
        assertThat(bankSettings.liveMode()).isEqualTo(true)
        assertThat(bankSettings.object_()).isEqualTo("object")
        assertThat(bankSettings.privacyOptOut()).isEqualTo(true)
        assertThat(bankSettings.regulationO()).isEqualTo(true)
        assertThat(bankSettings.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
