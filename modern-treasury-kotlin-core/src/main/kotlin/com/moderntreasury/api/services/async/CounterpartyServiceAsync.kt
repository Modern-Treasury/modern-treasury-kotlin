// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CounterpartyServiceAsync

    /** Create a new counterparty. */
    suspend fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** Get details on a single counterparty. */
    suspend fun retrieve(
        id: String,
        params: CounterpartyRetrieveParams = CounterpartyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Counterparty =
        retrieve(id, CounterpartyRetrieveParams.none(), requestOptions)

    /** Updates a given counterparty with new information. */
    suspend fun update(
        id: String,
        params: CounterpartyUpdateParams = CounterpartyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Counterparty

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): Counterparty =
        update(id, CounterpartyUpdateParams.none(), requestOptions)

    /** Get a paginated list of all counterparties. */
    suspend fun list(
        params: CounterpartyListParams = CounterpartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CounterpartyListPageAsync =
        list(CounterpartyListParams.none(), requestOptions)

    /** Deletes a given counterparty. */
    suspend fun delete(
        id: String,
        params: CounterpartyDeleteParams = CounterpartyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, CounterpartyDeleteParams.none(), requestOptions)

    /** Send an email requesting account details. */
    suspend fun collectAccount(
        id: String,
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyCollectAccountResponse =
        collectAccount(params.toBuilder().id(id).build(), requestOptions)

    /** @see [collectAccount] */
    suspend fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterpartyCollectAccountResponse

    /**
     * A view of [CounterpartyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CounterpartyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty>

        /**
         * Returns a raw HTTP response for `get /api/counterparties/{id}`, but is otherwise the same
         * as [CounterpartyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: CounterpartyRetrieveParams = CounterpartyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> =
            retrieve(id, CounterpartyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: CounterpartyUpdateParams = CounterpartyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Counterparty>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> =
            update(id, CounterpartyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CounterpartyListParams = CounterpartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterpartyListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CounterpartyListPageAsync> =
            list(CounterpartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: CounterpartyDeleteParams = CounterpartyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, CounterpartyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/counterparties/{id}/collect_account`, but is
         * otherwise the same as [CounterpartyServiceAsync.collectAccount].
         */
        @MustBeClosed
        suspend fun collectAccount(
            id: String,
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterpartyCollectAccountResponse> =
            collectAccount(params.toBuilder().id(id).build(), requestOptions)

        /** @see [collectAccount] */
        @MustBeClosed
        suspend fun collectAccount(
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterpartyCollectAccountResponse>
    }
}
