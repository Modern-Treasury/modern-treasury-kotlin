// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPageAsync
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** get event */
    suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** list events */
    suspend fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): EventListPageAsync =
        list(EventListParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/events/{id}`, but is otherwise the same as
         * [EventServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /**
         * Returns a raw HTTP response for `get /api/events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPageAsync> =
            list(EventListParams.none(), requestOptions)
    }
}
