package com.moderntreasury.api.errors

open class ModernTreasuryException constructor(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
