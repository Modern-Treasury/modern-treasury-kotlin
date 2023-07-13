@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentFlow
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowListPageAsync
import com.moderntreasury.api.models.PaymentFlowListParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams

interface PaymentFlowServiceAsync {

    /** create payment_flow */
    suspend fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentFlow

    /** get payment_flow */
    suspend fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentFlow

    /** update payment_flow */
    suspend fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentFlow

    /** list payment_flows */
    suspend fun list(
        params: PaymentFlowListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentFlowListPageAsync
}
