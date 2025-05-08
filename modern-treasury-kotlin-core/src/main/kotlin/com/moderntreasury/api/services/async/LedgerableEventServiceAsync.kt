// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerableEvent
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams

interface LedgerableEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledgerable event. */
    suspend fun create(
        params: LedgerableEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerableEvent

    /** Get details on a single ledgerable event. */
    suspend fun retrieve(
        id: String,
        params: LedgerableEventRetrieveParams = LedgerableEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerableEvent = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerableEvent

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LedgerableEvent =
        retrieve(id, LedgerableEventRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerableEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledgerable_events`, but is otherwise the same
         * as [LedgerableEventServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerableEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerableEvent>

        /**
         * Returns a raw HTTP response for `get /api/ledgerable_events/{id}`, but is otherwise the
         * same as [LedgerableEventServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LedgerableEventRetrieveParams = LedgerableEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerableEvent> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerableEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerableEvent>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerableEvent> =
            retrieve(id, LedgerableEventRetrieveParams.none(), requestOptions)
    }
}
