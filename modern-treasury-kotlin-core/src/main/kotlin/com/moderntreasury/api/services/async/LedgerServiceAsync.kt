// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPageAsync
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams

interface LedgerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger. */
    suspend fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Get details on a single ledger. */
    suspend fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Update the details of a ledger. */
    suspend fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Get a list of ledgers. */
    suspend fun list(
        params: LedgerListParams = LedgerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LedgerListPageAsync =
        list(LedgerListParams.none(), requestOptions)

    /** Delete a ledger. */
    suspend fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /**
     * A view of [LedgerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledgers`, but is otherwise the same as
         * [LedgerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /**
         * Returns a raw HTTP response for `get /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /**
         * Returns a raw HTTP response for `patch /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LedgerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /**
         * Returns a raw HTTP response for `get /api/ledgers`, but is otherwise the same as
         * [LedgerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerListParams = LedgerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerListPageAsync> =
            list(LedgerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: LedgerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>
    }
}
