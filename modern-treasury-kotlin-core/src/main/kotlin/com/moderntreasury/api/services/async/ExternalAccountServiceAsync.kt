// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPageAsync
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.ExternalAccountVerifyResponse

interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create external account */
    suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** show external account */
    suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** update external account */
    suspend fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** list external accounts */
    suspend fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPageAsync

    /** list external accounts */
    suspend fun list(requestOptions: RequestOptions): ExternalAccountListPageAsync =
        list(ExternalAccountListParams.none(), requestOptions)

    /** delete external account */
    suspend fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** complete verification of external account */
    suspend fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** verify external account */
    suspend fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountVerifyResponse

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `patch /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalAccountListPageAsync> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/external_accounts/{id}`, but is otherwise
         * the same as [ExternalAccountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/complete_verification`,
         * but is otherwise the same as [ExternalAccountServiceAsync.completeVerification].
         */
        @MustBeClosed
        suspend fun completeVerification(
            params: ExternalAccountCompleteVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/verify`, but is
         * otherwise the same as [ExternalAccountServiceAsync.verify].
         */
        @MustBeClosed
        suspend fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountVerifyResponse>
    }
}
