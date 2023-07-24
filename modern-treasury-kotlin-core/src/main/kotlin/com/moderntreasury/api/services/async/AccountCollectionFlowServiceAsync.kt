@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPageAsync
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import com.moderntreasury.api.models.AccountCollectionFlow

interface AccountCollectionFlowServiceAsync {

    /** create account_collection_flow */
    suspend fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlow

    /** get account_collection_flow */
    suspend fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlow

    /** update account_collection_flow */
    suspend fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlow

    /** list account_collection_flows */
    suspend fun list(
        params: AccountCollectionFlowListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlowListPageAsync
}
