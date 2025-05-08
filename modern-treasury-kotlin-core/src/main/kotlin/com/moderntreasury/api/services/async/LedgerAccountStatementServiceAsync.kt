// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse

interface LedgerAccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account statement. */
    suspend fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementCreateResponse

    /** Get details on a single ledger account statement. */
    suspend fun retrieve(
        id: String,
        params: LedgerAccountStatementRetrieveParams = LedgerAccountStatementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): LedgerAccountStatementRetrieveResponse =
        retrieve(id, LedgerAccountStatementRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountStatementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_statements`, but is otherwise
         * the same as [LedgerAccountStatementServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatementCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_statements/{id}`, but is
         * otherwise the same as [LedgerAccountStatementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LedgerAccountStatementRetrieveParams =
                LedgerAccountStatementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatementRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatementRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountStatementRetrieveResponse> =
            retrieve(id, LedgerAccountStatementRetrieveParams.none(), requestOptions)
    }
}
