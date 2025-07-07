// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactDetailTest {

    @Test
    fun create() {
        val contactDetail =
            ContactDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .contactIdentifier("contact_identifier")
                .contactIdentifierType(ContactDetail.ContactIdentifierType.EMAIL)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(contactDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(contactDetail.contactIdentifier()).isEqualTo("contact_identifier")
        assertThat(contactDetail.contactIdentifierType())
            .isEqualTo(ContactDetail.ContactIdentifierType.EMAIL)
        assertThat(contactDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contactDetail.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contactDetail.liveMode()).isEqualTo(true)
        assertThat(contactDetail.object_()).isEqualTo("object")
        assertThat(contactDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactDetail =
            ContactDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .contactIdentifier("contact_identifier")
                .contactIdentifierType(ContactDetail.ContactIdentifierType.EMAIL)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedContactDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactDetail),
                jacksonTypeRef<ContactDetail>(),
            )

        assertThat(roundtrippedContactDetail).isEqualTo(contactDetail)
    }
}
