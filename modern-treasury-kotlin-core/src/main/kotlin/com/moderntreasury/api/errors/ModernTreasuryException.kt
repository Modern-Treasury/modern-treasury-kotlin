package com.moderntreasury.api.errors

open class ModernTreasuryException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
