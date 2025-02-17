// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.paymentOrders

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPage
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal

interface ReversalService {

    /** Create a reversal for a payment order. */
    fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal

    /** Get details on a single reversal of a payment order. */
    fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal

    /** Get a list of all reversals of a payment order. */
    fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderReversalListPage
}
