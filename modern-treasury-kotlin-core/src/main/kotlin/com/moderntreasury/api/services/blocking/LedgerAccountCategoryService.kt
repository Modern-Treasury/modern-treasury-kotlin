// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
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

    /** Create a ledger account category. */
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountCategory

    /** Get the details on a single ledger account category. */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountCategory

    /** Update the details of a ledger account category. */
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountCategory

    /** Get a list of ledger account categories. */
    fun list(
        params: LedgerAccountCategoryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountCategoryListPage

    /** Delete a ledger account category. */
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountCategory

    /** Add a ledger account to a ledger account category. */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Add a ledger account category to a ledger account category. */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Remove a ledger account from a ledger account category. */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Delete a ledger account category from a ledger account category. */
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
