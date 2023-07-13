package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException
constructor(
    headers: ListMultimap<String, String>,
    private val error: ModernTreasuryError,
) : ModernTreasuryServiceException(headers, "${error}") {
    override fun statusCode(): Int = 429
    fun error(): ModernTreasuryError = error
}
