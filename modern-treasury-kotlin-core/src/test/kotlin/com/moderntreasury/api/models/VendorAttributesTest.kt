// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VendorAttributesTest {

    @Test
    fun create() {
        val vendorAttributes = VendorAttributes.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vendorAttributes = VendorAttributes.builder().build()

        val roundtrippedVendorAttributes =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vendorAttributes),
                jacksonTypeRef<VendorAttributes>(),
            )

        assertThat(roundtrippedVendorAttributes).isEqualTo(vendorAttributes)
    }
}
