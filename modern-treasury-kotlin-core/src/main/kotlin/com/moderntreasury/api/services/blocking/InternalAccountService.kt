// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPage
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService

interface InternalAccountService {

    fun balanceReports(): BalanceReportService

    /** create internal account */
    fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InternalAccount

    /** get internal account */
    fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InternalAccount

    /** update internal account */
    fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InternalAccount

    /** list internal accounts */
    fun list(
        params: InternalAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InternalAccountListPage
}
