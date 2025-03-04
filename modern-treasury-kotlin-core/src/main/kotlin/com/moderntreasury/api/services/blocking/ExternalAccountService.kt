// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPage
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.ExternalAccountVerifyResponse

interface ExternalAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create external account */
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** show external account */
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** update external account */
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** list external accounts */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPage

    /** list external accounts */
    fun list(requestOptions: RequestOptions): ExternalAccountListPage =
        list(ExternalAccountListParams.none(), requestOptions)

    /** delete external account */
    fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** complete verification of external account */
    fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** verify external account */
    fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountVerifyResponse

    /**
     * A view of [ExternalAccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `patch /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountService.update].
         */
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPage>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalAccountListPage> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/external_accounts/{id}`, but is otherwise
         * the same as [ExternalAccountService.delete].
         */
        @MustBeClosed
        fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/complete_verification`,
         * but is otherwise the same as [ExternalAccountService.completeVerification].
         */
        @MustBeClosed
        fun completeVerification(
            params: ExternalAccountCompleteVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/verify`, but is
         * otherwise the same as [ExternalAccountService.verify].
         */
        @MustBeClosed
        fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountVerifyResponse>
    }
}
