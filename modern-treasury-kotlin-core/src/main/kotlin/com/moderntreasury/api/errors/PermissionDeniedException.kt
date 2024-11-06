package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(403, headers, body, error)
