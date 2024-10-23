// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPageAsync
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

interface LegalEntityServiceAsync {

    /** create legal_entity */
    suspend fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LegalEntity

    /** Get details on a single legal entity. */
    suspend fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LegalEntity

    /** Update a legal entity. */
    suspend fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LegalEntity

    /** Get a list of all legal entities. */
    suspend fun list(
        params: LegalEntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LegalEntityListPageAsync
}
