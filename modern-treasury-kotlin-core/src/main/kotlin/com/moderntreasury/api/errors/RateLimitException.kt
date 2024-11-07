package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(429, headers, body, error)
