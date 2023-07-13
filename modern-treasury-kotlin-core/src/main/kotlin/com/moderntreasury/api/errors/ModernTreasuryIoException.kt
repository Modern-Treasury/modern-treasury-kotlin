package com.moderntreasury.api.errors

class ModernTreasuryIoException constructor(message: String? = null, cause: Throwable? = null) :
    ModernTreasuryException(message, cause)
