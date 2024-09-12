package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(statusCode, headers, body, error)
