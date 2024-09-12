package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(400, headers, body, error)
