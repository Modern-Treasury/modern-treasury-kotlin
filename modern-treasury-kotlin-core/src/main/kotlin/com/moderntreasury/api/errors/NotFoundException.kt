package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: ModernTreasuryError,
) : ModernTreasuryServiceException(404, headers, body, error)
