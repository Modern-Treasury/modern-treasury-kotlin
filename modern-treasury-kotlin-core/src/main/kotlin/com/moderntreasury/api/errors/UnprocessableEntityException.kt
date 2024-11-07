package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(422, headers, body, error)
