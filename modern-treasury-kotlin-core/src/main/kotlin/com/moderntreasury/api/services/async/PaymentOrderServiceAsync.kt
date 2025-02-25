// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.PaymentOrder
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListPageAsync
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync

interface PaymentOrderServiceAsync {

    fun reversals(): ReversalServiceAsync

    /** Create a new Payment Order */
    suspend fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get details on a single payment order */
    suspend fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Update a payment order */
    suspend fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get a list of all payment orders */
    suspend fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderListPageAsync

    /** Get a list of all payment orders */
    suspend fun list(requestOptions: RequestOptions): PaymentOrderListPageAsync =
        list(PaymentOrderListParams.none(), requestOptions)

    /** Create a new payment order asynchronously */
    suspend fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse
}
