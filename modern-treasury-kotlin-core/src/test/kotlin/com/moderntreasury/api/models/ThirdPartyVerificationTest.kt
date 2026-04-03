// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThirdPartyVerificationTest {

    @Test
    fun create() {
        val thirdPartyVerification =
            ThirdPartyVerification.builder()
                .outcome(ThirdPartyVerification.Outcome.PASSED)
                .vendor(ThirdPartyVerification.Vendor.PERSONA)
                .vendorVerificationId("vendor_verification_id")
                .verificationCategory(ThirdPartyVerification.VerificationCategory.LEGAL_NAME)
                .verificationMethod("verification_method")
                .verificationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .comment("comment")
                .build()

        assertThat(thirdPartyVerification.outcome())
            .isEqualTo(ThirdPartyVerification.Outcome.PASSED)
        assertThat(thirdPartyVerification.vendor()).isEqualTo(ThirdPartyVerification.Vendor.PERSONA)
        assertThat(thirdPartyVerification.vendorVerificationId())
            .isEqualTo("vendor_verification_id")
        assertThat(thirdPartyVerification.verificationCategory())
            .isEqualTo(ThirdPartyVerification.VerificationCategory.LEGAL_NAME)
        assertThat(thirdPartyVerification.verificationMethod()).isEqualTo("verification_method")
        assertThat(thirdPartyVerification.verificationTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(thirdPartyVerification.comment()).isEqualTo("comment")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thirdPartyVerification =
            ThirdPartyVerification.builder()
                .outcome(ThirdPartyVerification.Outcome.PASSED)
                .vendor(ThirdPartyVerification.Vendor.PERSONA)
                .vendorVerificationId("vendor_verification_id")
                .verificationCategory(ThirdPartyVerification.VerificationCategory.LEGAL_NAME)
                .verificationMethod("verification_method")
                .verificationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .comment("comment")
                .build()

        val roundtrippedThirdPartyVerification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thirdPartyVerification),
                jacksonTypeRef<ThirdPartyVerification>(),
            )

        assertThat(roundtrippedThirdPartyVerification).isEqualTo(thirdPartyVerification)
    }
}
