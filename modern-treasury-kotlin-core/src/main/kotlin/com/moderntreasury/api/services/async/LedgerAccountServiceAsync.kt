// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPageAsync
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

interface LedgerAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerAccountServiceAsync

    /** Create a ledger account. */
    suspend fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** Get details on a single ledger account. */
    suspend fun retrieve(
        id: String,
        params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccount =
        retrieve(id, LedgerAccountRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account. */
    suspend fun update(
        id: String,
        params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): LedgerAccount =
        update(id, LedgerAccountUpdateParams.none(), requestOptions)

    /** Get a list of ledger accounts. */
    suspend fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountListPageAsync =
        list(LedgerAccountListParams.none(), requestOptions)

    /** Delete a ledger account. */
    suspend fun delete(
        id: String,
        params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions): LedgerAccount =
        delete(id, LedgerAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> =
            retrieve(id, LedgerAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> =
            update(id, LedgerAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountListPageAsync> =
            list(LedgerAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> =
            delete(id, LedgerAccountDeleteParams.none(), requestOptions)
    }
}
