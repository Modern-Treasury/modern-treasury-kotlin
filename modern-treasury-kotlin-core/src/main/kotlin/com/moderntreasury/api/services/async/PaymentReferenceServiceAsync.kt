@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

interface PaymentReferenceServiceAsync {

    /** get payment_reference */
    suspend fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentReference

    /** list payment_references */
    suspend fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentReferenceListPageAsync

    /** get payment_reference */
    suspend fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentReference
}
