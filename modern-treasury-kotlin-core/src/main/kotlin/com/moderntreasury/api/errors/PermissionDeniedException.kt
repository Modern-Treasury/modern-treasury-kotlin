package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: ModernTreasuryError,
) : ModernTreasuryServiceException(headers, "${error}") {
    override fun statusCode(): Int = 403
    fun error(): ModernTreasuryError = error
}
