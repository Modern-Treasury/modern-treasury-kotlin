package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: ModernTreasuryError,
) : ModernTreasuryServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404
    fun error(): ModernTreasuryError = error
}
