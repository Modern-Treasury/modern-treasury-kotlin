@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPage
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams

interface PaymentReferenceService {

    /** list payment_references */
    fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentReferenceListPage

    /** get payment_reference */
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentReference
}
