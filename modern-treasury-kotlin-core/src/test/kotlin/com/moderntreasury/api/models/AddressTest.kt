// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .line1("line1")
                .line2("line2")
                .liveMode(true)
                .locality("locality")
                .object_("object")
                .postalCode("postal_code")
                .region("region")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(address.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(address.country()).isEqualTo("country")
        assertThat(address.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(address.line1()).isEqualTo("line1")
        assertThat(address.line2()).isEqualTo("line2")
        assertThat(address.liveMode()).isEqualTo(true)
        assertThat(address.locality()).isEqualTo("locality")
        assertThat(address.object_()).isEqualTo("object")
        assertThat(address.postalCode()).isEqualTo("postal_code")
        assertThat(address.region()).isEqualTo("region")
        assertThat(address.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .line1("line1")
                .line2("line2")
                .liveMode(true)
                .locality("locality")
                .object_("object")
                .postalCode("postal_code")
                .region("region")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
