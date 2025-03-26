// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListPageAsync
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams

interface AccountDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an account detail for an external account. */
    suspend fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail

    /** Get a single account detail for a single internal or external account. */
    suspend fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail

    /** Get a list of account details for a single internal or external account. */
    suspend fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetailListPageAsync

    /** Delete a single account detail for an external account. */
    suspend fun delete(
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AccountDetailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetail>

        /**
         * Returns a raw HTTP response for `get
         * /api/{accounts_type}/{account_id}/account_details/{id}`, but is otherwise the same as
         * [AccountDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetail>

        /**
         * Returns a raw HTTP response for `get /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetailListPageAsync>

        /**
         * Returns a raw HTTP response for `delete
         * /api/{accounts_type}/{account_id}/account_details/{id}`, but is otherwise the same as
         * [AccountDetailServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
