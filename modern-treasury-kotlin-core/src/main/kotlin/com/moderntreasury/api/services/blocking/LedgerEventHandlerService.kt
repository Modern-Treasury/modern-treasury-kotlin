// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerEventHandler
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerListPage
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams

interface LedgerEventHandlerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create ledger_event_handler */
    fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandler

    /** Get details on a single ledger event handler. */
    fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandler

    /** Get a list of ledger event handlers. */
    fun list(
        params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandlerListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerEventHandlerListPage =
        list(LedgerEventHandlerListParams.none(), requestOptions)

    /** Archive a ledger event handler. */
    fun delete(
        params: LedgerEventHandlerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEventHandler

    /**
     * A view of [LedgerEventHandlerService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerEventHandlerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandler>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers/{id}`, but is otherwise
         * the same as [LedgerEventHandlerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerEventHandlerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandler>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandlerListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerEventHandlerListPage> =
            list(LedgerEventHandlerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_event_handlers/{id}`, but is
         * otherwise the same as [LedgerEventHandlerService.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerEventHandlerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEventHandler>
    }
}
