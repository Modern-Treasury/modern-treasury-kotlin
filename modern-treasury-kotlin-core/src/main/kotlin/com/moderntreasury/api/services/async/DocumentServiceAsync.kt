// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentListPageAsync
import com.moderntreasury.api.models.DocumentListParams
import com.moderntreasury.api.models.DocumentRetrieveParams

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a document. */
    suspend fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** Get an existing document. */
    suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** Get a list of documents. */
    suspend fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DocumentListPageAsync =
        list(DocumentListParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/documents`, but is otherwise the same as
         * [DocumentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /api/documents/{id}`, but is otherwise the same as
         * [DocumentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /api/documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListPageAsync> =
            list(DocumentListParams.none(), requestOptions)
    }
}
