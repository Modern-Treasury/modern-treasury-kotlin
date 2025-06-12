// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPage
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService

interface InternalAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InternalAccountService

    fun balanceReports(): BalanceReportService

    /** create internal account */
    fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** get internal account */
    fun retrieve(
        id: String,
        params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): InternalAccount =
        retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

    /** update internal account */
    fun update(
        id: String,
        params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): InternalAccount =
        update(id, InternalAccountUpdateParams.none(), requestOptions)

    /** list internal accounts */
    fun list(
        params: InternalAccountListParams = InternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InternalAccountListPage =
        list(InternalAccountListParams.none(), requestOptions)

    /**
     * A view of [InternalAccountService] that provides access to raw HTTP responses for each
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
        ): InternalAccountService.WithRawResponse

        fun balanceReports(): BalanceReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: InternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<InternalAccount> =
            retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<InternalAccount> =
            update(id, InternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: InternalAccountListParams = InternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InternalAccountListPage> =
            list(InternalAccountListParams.none(), requestOptions)
    }
}
