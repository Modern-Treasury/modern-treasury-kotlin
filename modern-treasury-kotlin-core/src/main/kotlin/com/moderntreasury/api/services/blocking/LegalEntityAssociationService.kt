// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams

interface LegalEntityAssociationService {

    /** create legal_entity_association */
    fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntityAssociation
}
