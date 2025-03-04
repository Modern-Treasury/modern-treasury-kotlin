// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerEventHandler
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerListPageAsync
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams

interface LedgerEventHandlerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create ledger_event_handler */
    suspend fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandler

    /** Get details on a single ledger event handler. */
    suspend fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandler

    /** Get a list of ledger event handlers. */
    suspend fun list(
        params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandlerListPageAsync

    /** Get a list of ledger event handlers. */
    suspend fun list(requestOptions: RequestOptions): LedgerEventHandlerListPageAsync =
        list(LedgerEventHandlerListParams.none(), requestOptions)

    /** Archive a ledger event handler. */
    suspend fun delete(
        params: LedgerEventHandlerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandler

    /**
     * A view of [LedgerEventHandlerServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerEventHandlerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandler>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers/{id}`, but is otherwise
         * the same as [LedgerEventHandlerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerEventHandlerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandler>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandlerListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerEventHandlerListPageAsync> =
            list(LedgerEventHandlerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_event_handlers/{id}`, but is
         * otherwise the same as [LedgerEventHandlerServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: LedgerEventHandlerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandler>
    }
}
