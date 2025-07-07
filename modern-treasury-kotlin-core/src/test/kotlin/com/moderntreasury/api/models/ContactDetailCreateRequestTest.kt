// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactDetailCreateRequestTest {

    @Test
    fun create() {
        val contactDetailCreateRequest =
            ContactDetailCreateRequest.builder()
                .contactIdentifier("contact_identifier")
                .contactIdentifierType(ContactDetailCreateRequest.ContactIdentifierType.EMAIL)
                .build()

        assertThat(contactDetailCreateRequest.contactIdentifier()).isEqualTo("contact_identifier")
        assertThat(contactDetailCreateRequest.contactIdentifierType())
            .isEqualTo(ContactDetailCreateRequest.ContactIdentifierType.EMAIL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactDetailCreateRequest =
            ContactDetailCreateRequest.builder()
                .contactIdentifier("contact_identifier")
                .contactIdentifierType(ContactDetailCreateRequest.ContactIdentifierType.EMAIL)
                .build()

        val roundtrippedContactDetailCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactDetailCreateRequest),
                jacksonTypeRef<ContactDetailCreateRequest>(),
            )

        assertThat(roundtrippedContactDetailCreateRequest).isEqualTo(contactDetailCreateRequest)
    }
}
