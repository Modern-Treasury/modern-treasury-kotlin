// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPageAsync
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams

interface VirtualAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create virtual_account */
    suspend fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** get virtual_account */
    suspend fun retrieve(
        id: String,
        params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): VirtualAccount =
        retrieve(id, VirtualAccountRetrieveParams.none(), requestOptions)

    /** update virtual_account */
    suspend fun update(
        id: String,
        params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): VirtualAccount =
        update(id, VirtualAccountUpdateParams.none(), requestOptions)

    /** Get a list of virtual accounts. */
    suspend fun list(
        params: VirtualAccountListParams = VirtualAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): VirtualAccountListPageAsync =
        list(VirtualAccountListParams.none(), requestOptions)

    /** delete virtual_account */
    suspend fun delete(
        id: String,
        params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions): VirtualAccount =
        delete(id, VirtualAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [VirtualAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/virtual_accounts`, but is otherwise the same
         * as [VirtualAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: VirtualAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: VirtualAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> =
            retrieve(id, VirtualAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: VirtualAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> =
            update(id, VirtualAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts`, but is otherwise the same as
         * [VirtualAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<VirtualAccountListPageAsync> =
            list(VirtualAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: VirtualAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> =
            delete(id, VirtualAccountDeleteParams.none(), requestOptions)
    }
}
