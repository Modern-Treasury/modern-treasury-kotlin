package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(statusCode, headers, body, error)
