@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPageAsync
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams

interface ExternalAccountServiceAsync {

    /** create external account */
    suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** show external account */
    suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** update external account */
    suspend fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** list external accounts */
    suspend fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccountListPageAsync

    /** delete external account */
    suspend fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** complete verification of external account */
    suspend fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** verify external account */
    suspend fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount
}
