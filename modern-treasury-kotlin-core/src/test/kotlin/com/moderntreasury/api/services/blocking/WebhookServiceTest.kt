// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookServiceTest {

    @Test
    fun getSignature() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()

        assertThat(client.webhooks().getSignature("foo", "foo"))
            .isEqualTo("08ba357e274f528065766c770a639abf6809b39ccfd37c2a3157c7f51954da0a")

        assertThat(client.webhooks().getSignature("{\"foo\":\"bar\"}", "foo"))
            .isEqualTo("57e14f6f354543f0101fb06ea24df7731d90087b76651e3497345e22a3622940")

        assertThat(
                client
                    .webhooks()
                    .getSignature("{\"foo\":\"bar\",\"bar\":\"baz\",\"a\": true}", "foo")
            )
            .isEqualTo("ec1c86d16075e6937fc26d55b7dc60bac9b1178a2f714312f7c5cb13a319b0ac")

        assertThat(
                client
                    .webhooks()
                    .getSignature(
                        "{\"a\":{\"b\":{\"c\":{\"d\":[null,1,true,false,[\"foo\",{\"bar\":[true, false]}]]}}}}",
                        "foo"
                    )
            )
            .isEqualTo("39b6fc0f5b02a5aefbdd7fb337245b4209036334e837d8c5b6a4092965ebc0a5")
    }

    @Test
    fun validateSignature() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()

        assertThat(
                client
                    .webhooks()
                    .validateSignature(
                        "{\"foo\":\"bar\"}",
                        Headers.builder()
                            .put(
                                "X-Signature",
                                "57e14f6f354543f0101fb06ea24df7731d90087b76651e3497345e22a3622940"
                            )
                            .build(),
                        "foo"
                    )
            )
            .isTrue()

        assertThat(
                client
                    .webhooks()
                    .validateSignature(
                        "other",
                        Headers.builder()
                            .put(
                                "X-Signature",
                                "57e14f6f354543f0101fb06ea24df7731d90087b76651e3497345e22a3622940"
                            )
                            .build(),
                        "foo"
                    )
            )
            .isFalse()

        assertThat(
                client
                    .webhooks()
                    .validateSignature(
                        "{\"foo\":\"bar\"}",
                        Headers.builder().put("X-Signature", "other").build(),
                        "foo"
                    )
            )
            .isFalse()

        assertThat(
                client
                    .webhooks()
                    .validateSignature(
                        "{\"foo\":\"bar\"}",
                        Headers.builder()
                            .put(
                                "X-Signature",
                                "57e14f6f354543f0101fb06ea24df7731d90087b76651e3497345e22a3622940"
                            )
                            .build(),
                        "other"
                    )
            )
            .isFalse()
    }
}
