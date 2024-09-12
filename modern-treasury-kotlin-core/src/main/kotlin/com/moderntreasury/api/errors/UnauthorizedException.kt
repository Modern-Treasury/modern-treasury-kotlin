package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(401, headers, body, error)
