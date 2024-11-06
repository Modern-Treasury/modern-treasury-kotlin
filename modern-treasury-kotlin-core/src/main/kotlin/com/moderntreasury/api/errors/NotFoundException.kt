package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(404, headers, body, error)
