// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.DocumentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DocumentServiceTest {

    @Test
    fun callCreate() {
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
                    .documentableId("string")
                    .documentableType(DocumentCreateParams.DocumentableType.CASES)
                    .file("file.txt")
                    .documentType("string")
                    .build()
            )
        println(document)
        document.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentService = client.documents()
        val document =
            documentService.retrieve(DocumentRetrieveParams.builder().id("string").build())
        println(document)
        document.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentService = client.documents()
        val response = documentService.list(DocumentListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
