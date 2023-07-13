package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val error: ModernTreasuryError,
) : ModernTreasuryServiceException(headers, "${error}") {
    override fun statusCode(): Int = statusCode
    fun error(): ModernTreasuryError = error
}
