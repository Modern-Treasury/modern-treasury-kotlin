// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPageAsync
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams

interface ForeignExchangeQuoteServiceAsync {

    /** create foreign_exchange_quote */
    suspend fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ForeignExchangeQuote

    /** get foreign_exchange_quote */
    suspend fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ForeignExchangeQuote

    /** list foreign_exchange_quotes */
    suspend fun list(
        params: ForeignExchangeQuoteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ForeignExchangeQuoteListPageAsync
}
