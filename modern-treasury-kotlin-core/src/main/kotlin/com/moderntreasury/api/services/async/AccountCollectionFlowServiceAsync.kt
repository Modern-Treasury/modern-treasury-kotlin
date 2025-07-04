// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AccountCollectionFlow
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPageAsync
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams

interface AccountCollectionFlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountCollectionFlowServiceAsync

    /** create account_collection_flow */
    suspend fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** get account_collection_flow */
    suspend fun retrieve(
        id: String,
        params: AccountCollectionFlowRetrieveParams = AccountCollectionFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AccountCollectionFlow =
        retrieve(id, AccountCollectionFlowRetrieveParams.none(), requestOptions)

    /** update account_collection_flow */
    suspend fun update(
        id: String,
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** list account_collection_flows */
    suspend fun list(
        params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlowListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AccountCollectionFlowListPageAsync =
        list(AccountCollectionFlowListParams.none(), requestOptions)

    /**
     * A view of [AccountCollectionFlowServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountCollectionFlowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/account_collection_flows`, but is otherwise
         * the same as [AccountCollectionFlowServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountCollectionFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AccountCollectionFlowRetrieveParams =
                AccountCollectionFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountCollectionFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCollectionFlow> =
            retrieve(id, AccountCollectionFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows`, but is otherwise the
         * same as [AccountCollectionFlowServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlowListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountCollectionFlowListPageAsync> =
            list(AccountCollectionFlowListParams.none(), requestOptions)
    }
}
