// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerAccountCategoryServiceAsync

    /** Create a ledger account category. */
    suspend fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get the details on a single ledger account category. */
    suspend fun retrieve(
        id: String,
        params: LedgerAccountCategoryRetrieveParams = LedgerAccountCategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccountCategory =
        retrieve(id, LedgerAccountCategoryRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account category. */
    suspend fun update(
        id: String,
        params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): LedgerAccountCategory =
        update(id, LedgerAccountCategoryUpdateParams.none(), requestOptions)

    /** Get a list of ledger account categories. */
    suspend fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategoryListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountCategoryListPageAsync =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    suspend fun delete(
        id: String,
        params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions): LedgerAccountCategory =
        delete(id, LedgerAccountCategoryDeleteParams.none(), requestOptions)

    /** Add a ledger account to a ledger account category. */
    suspend fun addLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        addLedgerAccount(
            params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
            requestOptions,
        )

    /** @see addLedgerAccount */
    suspend fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Add a ledger account category to a ledger account category. */
    suspend fun addNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addNestedCategory(params.toBuilder().subCategoryId(subCategoryId).build(), requestOptions)

    /** @see addNestedCategory */
    suspend fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove a ledger account from a ledger account category. */
    suspend fun removeLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        removeLedgerAccount(
            params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
            requestOptions,
        )

    /** @see removeLedgerAccount */
    suspend fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete a ledger account category from a ledger account category. */
    suspend fun removeNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        removeNestedCategory(
            params.toBuilder().subCategoryId(subCategoryId).build(),
            requestOptions,
        )

    /** @see removeNestedCategory */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountCategoryServiceAsync.WithRawResponse

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
            id: String,
            params: LedgerAccountCategoryRetrieveParams =
                LedgerAccountCategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> =
            retrieve(id, LedgerAccountCategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> =
            update(id, LedgerAccountCategoryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategoryListPageAsync>

        /** @see list */
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
            id: String,
            params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> =
            delete(id, LedgerAccountCategoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addLedgerAccount].
         */
        @MustBeClosed
        suspend fun addLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addLedgerAccount(
                params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
                requestOptions,
            )

        /** @see addLedgerAccount */
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
            subCategoryId: String,
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addNestedCategory(
                params.toBuilder().subCategoryId(subCategoryId).build(),
                requestOptions,
            )

        /** @see addNestedCategory */
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
            ledgerAccountId: String,
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            removeLedgerAccount(
                params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
                requestOptions,
            )

        /** @see removeLedgerAccount */
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
            subCategoryId: String,
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            removeNestedCategory(
                params.toBuilder().subCategoryId(subCategoryId).build(),
                requestOptions,
            )

        /** @see removeNestedCategory */
        @MustBeClosed
        suspend fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
