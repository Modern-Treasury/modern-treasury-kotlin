package com.moderntreasury.api.errors

import com.google.common.collect.ListMultimap

abstract class ModernTreasuryServiceException(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: ModernTreasuryError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : ModernTreasuryException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): ModernTreasuryError = error
}
