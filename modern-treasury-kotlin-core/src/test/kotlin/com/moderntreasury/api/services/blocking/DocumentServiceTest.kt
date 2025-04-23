// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceTest {

    @Disabled("multipart/form-data not yet supported")
    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentService = client.documents()

        val document =
            documentService.create(
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
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentService = client.documents()

        val document = documentService.retrieve(DocumentRetrieveParams.builder().id("id").build())

        document.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentService = client.documents()

        val page = documentService.list()

        page.items().forEach { it.validate() }
    }
}
