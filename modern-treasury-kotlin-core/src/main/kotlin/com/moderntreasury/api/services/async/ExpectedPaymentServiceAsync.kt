@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPageAsync
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams

interface ExpectedPaymentServiceAsync {

    /** create expected payment */
    suspend fun create(
        params: ExpectedPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExpectedPayment

    /** get expected payment */
    suspend fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExpectedPayment

    /** update expected payment */
    suspend fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExpectedPayment

    /** list expected_payments */
    suspend fun list(
        params: ExpectedPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExpectedPaymentListPageAsync

    /** delete expected payment */
    suspend fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExpectedPayment
}
