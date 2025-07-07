// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPageAsync
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityResponse
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync

interface InternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InternalAccountServiceAsync

    fun balanceReports(): BalanceReportServiceAsync

    /** create internal account */
    suspend fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** get internal account */
    suspend fun retrieve(
        id: String,
        params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): InternalAccount =
        retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

    /** update internal account */
    suspend fun update(
        id: String,
        params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): InternalAccount =
        update(id, InternalAccountUpdateParams.none(), requestOptions)

    /** list internal accounts */
    suspend fun list(
        params: InternalAccountListParams = InternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): InternalAccountListPageAsync =
        list(InternalAccountListParams.none(), requestOptions)

    /** update account_capability */
    suspend fun updateAccountCapability(
        id: String,
        params: InternalAccountUpdateAccountCapabilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountUpdateAccountCapabilityResponse =
        updateAccountCapability(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateAccountCapability] */
    suspend fun updateAccountCapability(
        params: InternalAccountUpdateAccountCapabilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountUpdateAccountCapabilityResponse

    /**
     * A view of [InternalAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): InternalAccountServiceAsync.WithRawResponse

        fun balanceReports(): BalanceReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: InternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: InternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> =
            retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: InternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> =
            update(id, InternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InternalAccountListParams = InternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InternalAccountListPageAsync> =
            list(InternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /api/internal_accounts/{internal_account_id}/account_capabilities/{id}`, but is otherwise
         * the same as [InternalAccountServiceAsync.updateAccountCapability].
         */
        @MustBeClosed
        suspend fun updateAccountCapability(
            id: String,
            params: InternalAccountUpdateAccountCapabilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse> =
            updateAccountCapability(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateAccountCapability] */
        @MustBeClosed
        suspend fun updateAccountCapability(
            params: InternalAccountUpdateAccountCapabilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse>
    }
}
