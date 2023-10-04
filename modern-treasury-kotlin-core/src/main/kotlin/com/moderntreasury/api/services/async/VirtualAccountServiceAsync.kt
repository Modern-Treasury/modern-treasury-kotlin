// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPageAsync
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams

interface VirtualAccountServiceAsync {

    /** create virtual_account */
    suspend fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VirtualAccount

    /** get virtual_account */
    suspend fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VirtualAccount

    /** update virtual_account */
    suspend fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VirtualAccount

    /** Get a list of virtual accounts. */
    suspend fun list(
        params: VirtualAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VirtualAccountListPageAsync

    /** delete virtual_account */
    suspend fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VirtualAccount
}
