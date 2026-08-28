// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VirtualAccountSettingServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountSettingServiceAsync = client.virtualAccountSettings()

        val virtualAccountSetting =
            virtualAccountSettingServiceAsync.create(
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
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountSettingServiceAsync = client.virtualAccountSettings()

        val page = virtualAccountSettingServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
