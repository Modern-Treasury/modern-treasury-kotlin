// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ConnectionListPageAsync
import com.moderntreasury.api.models.ConnectionListParams

interface ConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of all connections. */
    suspend fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListPageAsync

    /** Get a list of all connections. */
    suspend fun list(requestOptions: RequestOptions): ConnectionListPageAsync =
        list(ConnectionListParams.none(), requestOptions)

    /**
     * A view of [ConnectionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/connections`, but is otherwise the same as
         * [ConnectionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ConnectionListParams = ConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/connections`, but is otherwise the same as
         * [ConnectionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionListPageAsync> =
            list(ConnectionListParams.none(), requestOptions)
    }
}
