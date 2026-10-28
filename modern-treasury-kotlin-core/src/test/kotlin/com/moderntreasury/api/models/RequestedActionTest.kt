// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestedActionTest {

    @Test
    fun create() {
        val requestedAction =
            RequestedAction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(RequestedAction.Category.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .field(RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                .instructions("instructions")
                .liveMode(true)
                .object_("object")
                .addReason("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(requestedAction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(requestedAction.category())
            .isEqualTo(RequestedAction.Category.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE)
        assertThat(requestedAction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(requestedAction.field())
            .isEqualTo(RequestedAction.Field.ARTICLES_OF_INCORPORATION)
        assertThat(requestedAction.instructions()).isEqualTo("instructions")
        assertThat(requestedAction.liveMode()).isEqualTo(true)
        assertThat(requestedAction.object_()).isEqualTo("object")
        assertThat(requestedAction.reasons()).containsExactly("string")
        assertThat(requestedAction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestedAction =
            RequestedAction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(RequestedAction.Category.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .field(RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                .instructions("instructions")
                .liveMode(true)
                .object_("object")
                .addReason("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRequestedAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestedAction),
                jacksonTypeRef<RequestedAction>(),
            )

        assertThat(roundtrippedRequestedAction).isEqualTo(requestedAction)
    }
}
