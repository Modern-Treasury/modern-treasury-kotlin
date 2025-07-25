// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPage
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams

interface VirtualAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VirtualAccountService

    /** create virtual_account */
    fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** get virtual_account */
    fun retrieve(
        id: String,
        params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VirtualAccount =
        retrieve(id, VirtualAccountRetrieveParams.none(), requestOptions)

    /** update virtual_account */
    fun update(
        id: String,
        params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): VirtualAccount =
        update(id, VirtualAccountUpdateParams.none(), requestOptions)

    /** Get a list of virtual accounts. */
    fun list(
        params: VirtualAccountListParams = VirtualAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): VirtualAccountListPage =
        list(VirtualAccountListParams.none(), requestOptions)

    /** delete virtual_account */
    fun delete(
        id: String,
        params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): VirtualAccount =
        delete(id, VirtualAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [VirtualAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VirtualAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/virtual_accounts`, but is otherwise the same
         * as [VirtualAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: VirtualAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VirtualAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<VirtualAccount> =
            retrieve(id, VirtualAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: VirtualAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<VirtualAccount> =
            update(id, VirtualAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts`, but is otherwise the same as
         * [VirtualAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VirtualAccountListPage> =
            list(VirtualAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VirtualAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<VirtualAccount> =
            delete(id, VirtualAccountDeleteParams.none(), requestOptions)
    }
}
