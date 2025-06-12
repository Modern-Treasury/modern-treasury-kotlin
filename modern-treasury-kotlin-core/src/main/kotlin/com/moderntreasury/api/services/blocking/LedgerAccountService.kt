// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPage
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

interface LedgerAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerAccountService

    /** Create a ledger account. */
    fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** Get details on a single ledger account. */
    fun retrieve(
        id: String,
        params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccount =
        retrieve(id, LedgerAccountRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account. */
    fun update(
        id: String,
        params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): LedgerAccount =
        update(id, LedgerAccountUpdateParams.none(), requestOptions)

    /** Get a list of ledger accounts. */
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerAccountListPage =
        list(LedgerAccountListParams.none(), requestOptions)

    /** Delete a ledger account. */
    fun delete(
        id: String,
        params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): LedgerAccount =
        delete(id, LedgerAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<LedgerAccount> =
            retrieve(id, LedgerAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<LedgerAccount> =
            update(id, LedgerAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerAccountListPage> =
            list(LedgerAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<LedgerAccount> =
            delete(id, LedgerAccountDeleteParams.none(), requestOptions)
    }
}
