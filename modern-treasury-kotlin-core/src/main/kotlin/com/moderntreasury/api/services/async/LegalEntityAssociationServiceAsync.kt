// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams

interface LegalEntityAssociationServiceAsync {

    /** create legal_entity_association */
    suspend fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LegalEntityAssociation
}
