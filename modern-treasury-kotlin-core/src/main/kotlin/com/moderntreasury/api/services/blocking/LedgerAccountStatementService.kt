// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse

interface LedgerAccountStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account statement. */
    fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementCreateResponse

    /** Get details on a single ledger account statement. */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementRetrieveResponse

    /**
     * A view of [LedgerAccountStatementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_statements`, but is otherwise
         * the same as [LedgerAccountStatementService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatementCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_statements/{id}`, but is
         * otherwise the same as [LedgerAccountStatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatementRetrieveResponse>
    }
}
