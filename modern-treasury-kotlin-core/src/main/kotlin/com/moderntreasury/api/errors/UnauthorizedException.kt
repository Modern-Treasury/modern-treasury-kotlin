package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(401, headers, body, error)
