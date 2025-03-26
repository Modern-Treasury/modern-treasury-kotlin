// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListPage
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams

interface AccountDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an account detail for an external account. */
    fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail

    /** Get a single account detail for a single internal or external account. */
    fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail

    /** Get a list of account details for a single internal or external account. */
    fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetailListPage

    /** Delete a single account detail for an external account. */
    fun delete(
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AccountDetailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailService.create].
         */
        @MustBeClosed
        fun create(
            params: AccountDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetail>

        /**
         * Returns a raw HTTP response for `get
         * /api/{accounts_type}/{account_id}/account_details/{id}`, but is otherwise the same as
         * [AccountDetailService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AccountDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetail>

        /**
         * Returns a raw HTTP response for `get /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailService.list].
         */
        @MustBeClosed
        fun list(
            params: AccountDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetailListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /api/{accounts_type}/{account_id}/account_details/{id}`, but is otherwise the same as
         * [AccountDetailService.delete].
         */
        @MustBeClosed
        fun delete(
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
