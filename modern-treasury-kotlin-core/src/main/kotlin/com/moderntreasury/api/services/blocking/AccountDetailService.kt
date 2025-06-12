// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountDetailService

    /** Create an account detail for an external account. */
    fun create(
        accountId: String,
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail = create(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail

    /** Get a single account detail for a single internal or external account. */
    fun retrieve(
        id: String,
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetail

    /** Get a list of account details for a single internal or external account. */
    fun list(
        accountId: String,
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetailListPage = list(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [list] */
    fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDetailListPage

    /** Delete a single account detail for an external account. */
    fun delete(
        id: String,
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AccountDetailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountDetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailService.create].
         */
        @MustBeClosed
        fun create(
            accountId: String,
            params: AccountDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetail> =
            create(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [create] */
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
            id: String,
            params: AccountDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetail> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
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
            accountId: String,
            params: AccountDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDetailListPage> =
            list(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [list] */
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
            id: String,
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
