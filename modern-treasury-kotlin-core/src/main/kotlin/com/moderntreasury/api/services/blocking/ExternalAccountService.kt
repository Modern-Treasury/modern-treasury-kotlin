// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalAccountService

    /** create external account */
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** show external account */
    fun retrieve(
        id: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): ExternalAccount =
        retrieve(id, ExternalAccountRetrieveParams.none(), requestOptions)

    /** update external account */
    fun update(
        id: String,
        params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): ExternalAccount =
        update(id, ExternalAccountUpdateParams.none(), requestOptions)

    /** list external accounts */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExternalAccountListPage =
        list(ExternalAccountListParams.none(), requestOptions)

    /** delete external account */
    fun delete(
        id: String,
        params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ExternalAccountDeleteParams.none(), requestOptions)

    /** complete verification of external account */
    fun completeVerification(
        id: String,
        params: ExternalAccountCompleteVerificationParams =
            ExternalAccountCompleteVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount = completeVerification(params.toBuilder().id(id).build(), requestOptions)

    /** @see [completeVerification] */
    fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see [completeVerification] */
    fun completeVerification(id: String, requestOptions: RequestOptions): ExternalAccount =
        completeVerification(id, ExternalAccountCompleteVerificationParams.none(), requestOptions)

    /** verify external account */
    fun verify(
        id: String,
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountVerifyResponse = verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see [verify] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalAccountService.WithRawResponse

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
            id: String,
            params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<ExternalAccount> =
            retrieve(id, ExternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<ExternalAccount> =
            update(id, ExternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalAccountListPage> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/external_accounts/{id}`, but is otherwise
         * the same as [ExternalAccountService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ExternalAccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/complete_verification`,
         * but is otherwise the same as [ExternalAccountService.completeVerification].
         */
        @MustBeClosed
        fun completeVerification(
            id: String,
            params: ExternalAccountCompleteVerificationParams =
                ExternalAccountCompleteVerificationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            completeVerification(params.toBuilder().id(id).build(), requestOptions)

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            params: ExternalAccountCompleteVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> =
            completeVerification(
                id,
                ExternalAccountCompleteVerificationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/verify`, but is
         * otherwise the same as [ExternalAccountService.verify].
         */
        @MustBeClosed
        fun verify(
            id: String,
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountVerifyResponse> =
            verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see [verify] */
        @MustBeClosed
        fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountVerifyResponse>
    }
}
