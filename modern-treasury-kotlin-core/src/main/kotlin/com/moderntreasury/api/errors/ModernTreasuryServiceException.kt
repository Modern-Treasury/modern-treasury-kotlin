package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

abstract class ModernTreasuryServiceException
constructor(
    private val headers: ListMultimap<String, String>,
    message: String? = null,
    cause: Throwable? = null
) : ModernTreasuryException(message, cause) {
    abstract fun statusCode(): Int
    fun headers(): ListMultimap<String, String> = headers
}
