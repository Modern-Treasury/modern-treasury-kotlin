// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPage
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams

interface LedgerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerService

    /** Create a ledger. */
    fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Get details on a single ledger. */
    fun retrieve(
        id: String,
        params: LedgerRetrieveParams = LedgerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Ledger =
        retrieve(id, LedgerRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger. */
    fun update(
        id: String,
        params: LedgerUpdateParams = LedgerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Ledger =
        update(id, LedgerUpdateParams.none(), requestOptions)

    /** Get a list of ledgers. */
    fun list(
        params: LedgerListParams = LedgerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): LedgerListPage =
        list(LedgerListParams.none(), requestOptions)

    /** Delete a ledger. */
    fun delete(
        id: String,
        params: LedgerDeleteParams = LedgerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): Ledger =
        delete(id, LedgerDeleteParams.none(), requestOptions)

    /** A view of [LedgerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledgers`, but is otherwise the same as
         * [LedgerService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /**
         * Returns a raw HTTP response for `get /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerRetrieveParams = LedgerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LedgerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Ledger> =
            retrieve(id, LedgerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerUpdateParams = LedgerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LedgerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Ledger> =
            update(id, LedgerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledgers`, but is otherwise the same as
         * [LedgerService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerListParams = LedgerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerListPage> =
            list(LedgerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: LedgerDeleteParams = LedgerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LedgerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Ledger>

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<Ledger> =
            delete(id, LedgerDeleteParams.none(), requestOptions)
    }
}
