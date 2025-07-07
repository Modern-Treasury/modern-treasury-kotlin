// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressRequestTest {

    @Test
    fun create() {
        val addressRequest =
            AddressRequest.builder()
                .country("country")
                .line1("line1")
                .line2("line2")
                .locality("locality")
                .postalCode("postal_code")
                .region("region")
                .build()

        assertThat(addressRequest.country()).isEqualTo("country")
        assertThat(addressRequest.line1()).isEqualTo("line1")
        assertThat(addressRequest.line2()).isEqualTo("line2")
        assertThat(addressRequest.locality()).isEqualTo("locality")
        assertThat(addressRequest.postalCode()).isEqualTo("postal_code")
        assertThat(addressRequest.region()).isEqualTo("region")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressRequest =
            AddressRequest.builder()
                .country("country")
                .line1("line1")
                .line2("line2")
                .locality("locality")
                .postalCode("postal_code")
                .region("region")
                .build()

        val roundtrippedAddressRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressRequest),
                jacksonTypeRef<AddressRequest>(),
            )

        assertThat(roundtrippedAddressRequest).isEqualTo(addressRequest)
    }
}
