// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Disabled("multipart/form-data not yet supported")
    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentServiceAsync = client.documents()

        val document =
            documentServiceAsync.create(
                DocumentCreateParams.builder()
                    .documentableId("documentable_id")
                    .documentableType(DocumentCreateParams.DocumentableType.CASES)
                    .file("some content".byteInputStream())
                    .documentType("document_type")
                    .build()
            )

        document.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentServiceAsync = client.documents()

        val document =
            documentServiceAsync.retrieve(DocumentRetrieveParams.builder().id("id").build())

        document.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentServiceAsync = client.documents()

        val page = documentServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
