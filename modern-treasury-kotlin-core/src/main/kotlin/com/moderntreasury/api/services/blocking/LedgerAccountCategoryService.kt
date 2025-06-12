// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.models.LedgerAccountCategoryListPage
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams

interface LedgerAccountCategoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerAccountCategoryService

    /** Create a ledger account category. */
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get the details on a single ledger account category. */
    fun retrieve(
        id: String,
        params: LedgerAccountCategoryRetrieveParams = LedgerAccountCategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccountCategory =
        retrieve(id, LedgerAccountCategoryRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account category. */
    fun update(
        id: String,
        params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): LedgerAccountCategory =
        update(id, LedgerAccountCategoryUpdateParams.none(), requestOptions)

    /** Get a list of ledger account categories. */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategoryListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerAccountCategoryListPage =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    fun delete(
        id: String,
        params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): LedgerAccountCategory =
        delete(id, LedgerAccountCategoryDeleteParams.none(), requestOptions)

    /** Add a ledger account to a ledger account category. */
    fun addLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        addLedgerAccount(
            params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
            requestOptions,
        )

    /** @see [addLedgerAccount] */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Add a ledger account category to a ledger account category. */
    fun addNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addNestedCategory(params.toBuilder().subCategoryId(subCategoryId).build(), requestOptions)

    /** @see [addNestedCategory] */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove a ledger account from a ledger account category. */
    fun removeLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        removeLedgerAccount(
            params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
            requestOptions,
        )

    /** @see [removeLedgerAccount] */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete a ledger account category from a ledger account category. */
    fun removeNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        removeNestedCategory(
            params.toBuilder().subCategoryId(subCategoryId).build(),
            requestOptions,
        )

    /** @see [removeNestedCategory] */
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LedgerAccountCategoryService] that provides access to raw HTTP responses for each
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
        ): LedgerAccountCategoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerAccountCategoryRetrieveParams =
                LedgerAccountCategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> =
            retrieve(id, LedgerAccountCategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> =
            update(id, LedgerAccountCategoryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategoryListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerAccountCategoryListPage> =
            list(LedgerAccountCategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> =
            delete(id, LedgerAccountCategoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.addLedgerAccount].
         */
        @MustBeClosed
        fun addLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addLedgerAccount(
                params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
                requestOptions,
            )

        /** @see [addLedgerAccount] */
        @MustBeClosed
        fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.addNestedCategory].
         */
        @MustBeClosed
        fun addNestedCategory(
            subCategoryId: String,
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addNestedCategory(
                params.toBuilder().subCategoryId(subCategoryId).build(),
                requestOptions,
            )

        /** @see [addNestedCategory] */
        @MustBeClosed
        fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.removeLedgerAccount].
         */
        @MustBeClosed
        fun removeLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            removeLedgerAccount(
                params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
                requestOptions,
            )

        /** @see [removeLedgerAccount] */
        @MustBeClosed
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.removeNestedCategory].
         */
        @MustBeClosed
        fun removeNestedCategory(
            subCategoryId: String,
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            removeNestedCategory(
                params.toBuilder().subCategoryId(subCategoryId).build(),
                requestOptions,
            )

        /** @see [removeNestedCategory] */
        @MustBeClosed
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
