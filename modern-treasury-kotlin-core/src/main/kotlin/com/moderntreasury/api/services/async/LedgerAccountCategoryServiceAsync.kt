// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPageAsync
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams

interface LedgerAccountCategoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account category. */
    suspend fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get the details on a single ledger account category. */
    suspend fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Update the details of a ledger account category. */
    suspend fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get a list of ledger account categories. */
    suspend fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategoryListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountCategoryListPageAsync =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    suspend fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Add a ledger account to a ledger account category. */
    suspend fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Add a ledger account category to a ledger account category. */
    suspend fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove a ledger account from a ledger account category. */
    suspend fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete a ledger account category from a ledger account category. */
    suspend fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LedgerAccountCategoryServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategoryListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountCategoryListPageAsync> =
            list(LedgerAccountCategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addLedgerAccount].
         */
        @MustBeClosed
        suspend fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addNestedCategory].
         */
        @MustBeClosed
        suspend fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.removeLedgerAccount].
         */
        @MustBeClosed
        suspend fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.removeNestedCategory].
         */
        @MustBeClosed
        suspend fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
