// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPage
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams

interface CounterpartyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new counterparty. */
    fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Get details on a single counterparty. */
    fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Updates a given counterparty with new information. */
    fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Get a paginated list of all counterparties. */
    fun list(
        params: CounterpartyListParams = CounterpartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CounterpartyListPage =
        list(CounterpartyListParams.none(), requestOptions)

    /** Deletes a given counterparty. */
    fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Send an email requesting account details. */
    fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyCollectAccountResponse

    /**
     * A view of [CounterpartyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/counterparties`, but is otherwise the same as
         * [CounterpartyService.create].
         */
        @MustBeClosed
        fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty>

        /**
         * Returns a raw HTTP response for `get /api/counterparties/{id}`, but is otherwise the same
         * as [CounterpartyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty>

        /**
         * Returns a raw HTTP response for `patch /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyService.update].
         */
        @MustBeClosed
        fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty>

        /**
         * Returns a raw HTTP response for `get /api/counterparties`, but is otherwise the same as
         * [CounterpartyService.list].
         */
        @MustBeClosed
        fun list(
            params: CounterpartyListParams = CounterpartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterpartyListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CounterpartyListPage> =
            list(CounterpartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyService.delete].
         */
        @MustBeClosed
        fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /api/counterparties/{id}/collect_account`, but is
         * otherwise the same as [CounterpartyService.collectAccount].
         */
        @MustBeClosed
        fun collectAccount(
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterpartyCollectAccountResponse>
    }
}
