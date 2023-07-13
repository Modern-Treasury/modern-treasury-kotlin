@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentListPage
import com.moderntreasury.api.models.DocumentListParams
import com.moderntreasury.api.models.DocumentRetrieveParams

interface DocumentService {

    /** Create a document. */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document

    /** Get an existing document. */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document

    /** Get a list of documents. */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DocumentListPage
}
