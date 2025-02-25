// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPageAsync
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams

interface CounterpartyServiceAsync {

    /** Create a new counterparty. */
    suspend fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Get details on a single counterparty. */
    suspend fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Updates a given counterparty with new information. */
    suspend fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Get a paginated list of all counterparties. */
    suspend fun list(
        params: CounterpartyListParams = CounterpartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyListPageAsync

    /** Get a paginated list of all counterparties. */
    suspend fun list(requestOptions: RequestOptions): CounterpartyListPageAsync =
        list(CounterpartyListParams.none(), requestOptions)

    /** Deletes a given counterparty. */
    suspend fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Send an email requesting account details. */
    suspend fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyCollectAccountResponse
}
