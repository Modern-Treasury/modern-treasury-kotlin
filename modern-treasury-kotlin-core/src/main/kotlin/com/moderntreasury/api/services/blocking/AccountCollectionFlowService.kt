@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPage
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import com.moderntreasury.api.models.AccountCollectionFlow

interface AccountCollectionFlowService {

    /** create account_collection_flow */
    fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlow

    /** get account_collection_flow */
    fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlow

    /** update account_collection_flow */
    fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlow

    /** list account_collection_flows */
    fun list(
        params: AccountCollectionFlowListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCollectionFlowListPage
}
