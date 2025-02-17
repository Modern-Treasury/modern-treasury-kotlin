package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: ModernTreasuryError) :
    ModernTreasuryServiceException(400, headers, body, error)
