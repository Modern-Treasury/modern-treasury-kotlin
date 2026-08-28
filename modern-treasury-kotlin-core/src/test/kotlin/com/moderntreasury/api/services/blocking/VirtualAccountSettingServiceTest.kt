// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VirtualAccountSettingServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountSettingService = client.virtualAccountSettings()

        val virtualAccountSetting =
            virtualAccountSettingService.create(
                VirtualAccountSettingCreateParams.builder()
                    .allocationType("allocation_type")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .allocationIdentifier("allocation_identifier")
                    .allocationLength(0L)
                    .allocationRangeEnd("allocation_range_end")
                    .allocationRangeStart("allocation_range_start")
                    .externalId("external_id")
                    .generatedAllocationIdentifierLength(0L)
                    .build()
            )

        virtualAccountSetting.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountSettingService = client.virtualAccountSettings()

        val page = virtualAccountSettingService.list()

        page.items().forEach { it.validate() }
    }
}
