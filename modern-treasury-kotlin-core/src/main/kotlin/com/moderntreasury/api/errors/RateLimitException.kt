package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(429, headers, body, error)
