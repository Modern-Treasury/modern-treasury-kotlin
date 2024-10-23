// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentListPageAsync
import com.moderntreasury.api.models.DocumentListParams
import com.moderntreasury.api.models.DocumentRetrieveParams

interface DocumentServiceAsync {

    /** Create a document. */
    suspend fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document

    /** Get an existing document. */
    suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document

    /** Get a list of documents. */
    suspend fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DocumentListPageAsync
}
