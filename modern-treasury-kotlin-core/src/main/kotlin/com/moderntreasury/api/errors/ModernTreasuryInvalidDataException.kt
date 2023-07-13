package com.moderntreasury.api.errors

class ModernTreasuryInvalidDataException
constructor(message: String? = null, cause: Throwable? = null) :
    ModernTreasuryException(message, cause)
