// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPageAsync
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams

interface IncomingPaymentDetailServiceAsync {

    /** Get an existing Incoming Payment Detail. */
    suspend fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** Update an existing Incoming Payment Detail. */
    suspend fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** Get a list of Incoming Payment Details. */
    suspend fun list(
        params: IncomingPaymentDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetailListPageAsync

    /** Simulate Incoming Payment Detail */
    suspend fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse
}
